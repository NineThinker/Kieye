package com.atguigu.kieye.activity.mall;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.kieye.R;
import com.atguigu.kieye.utils.CacheUtils;
import com.atguigu.kieye.utils.Url;
import com.atguigu.kieye.utils.widget.BaseRecyclerAdapter;
import com.atguigu.kieye.utils.widget.WrapAdapter;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;
/**
 * 作者：张爽 on 2016/7/4 08:23
 * 邮箱：18330118276@163.com
 */
public class ShuMaActivity extends Activity      {
    private RecyclerView rv_shuma;
    private GridLayoutManager layout;
    private ImageButton ib_back;
    private String rv_url;
    private RvCinemaAdapter adapter;
    private WrapAdapter<RvCinemaAdapter> mWrapAdapter;
    private List<MallRecycleViewBean.DataBean.ListBean> list;
    private RadioGroup rg_shuma;
    private Button btn_left;
    private Button btn_middle;
    private Button btn_right;
    private PopupWindow popupWindow;
    private ListView lv_pop;
    private ArrayList list_fake;
    private BaseAdapter adapter_pop;
    private ArrayList list_fake_two;
    private boolean flag;
    private View contentView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shuma_activity);

        initView();

    }


    private void initView() {

        ib_back = (ImageButton)findViewById(R.id.ib_back);
        ib_back.setOnClickListener(new MyBackOnclickListener());
        rv_shuma = (RecyclerView)findViewById(R.id.rv_shuma);
        rg_shuma = (RadioGroup)findViewById(R.id.rg_shuma);
        btn_left = (Button)findViewById(R.id.btn_left);
        btn_middle = (Button)findViewById(R.id.btn_middle);
        btn_right = (Button)findViewById(R.id.btn_right);
        list_fake=new ArrayList();
        list_fake.add("全部/未分类");
        list_fake.add("超编");list_fake.add("机器猫");list_fake.add("魔兽");list_fake.add("美队");list_fake.add("星球大战");
        list_fake.add("功夫凶吗");list_fake.add("壁形金冠");list_fake.add("其它主题");list_fake.add("超人");list_fake.add("迪士尼");
        list_fake.add("数码");list_fake.add("机器猫");list_fake.add("魔兽");list_fake.add("美队");list_fake.add("星球大战");
        list_fake.add("功夫凶吗");list_fake.add("壁形金冠");list_fake.add("其它主题");list_fake.add("超人");list_fake.add("迪士尼");

        list_fake_two= new ArrayList();
        list_fake_two.add("默认排序");
        list_fake_two.add("价格从低到高");list_fake_two.add("价格从高到低");list_fake_two.add("销售最多");list_fake_two.add("销售最少");list_fake_two.add("最近更新");
        list_fake_two.add("最远更新");

        rg_shuma.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                contentView1 = LayoutInflater.from(ShuMaActivity.this).inflate(
                        R.layout.pop_window, null);
                lv_pop = (ListView) contentView1.findViewById(R.id.lv_pop);


                //默认选中第一条

                switch (checkedId) {
                    case R.id.btn_left :

                        if(popupWindow!=null){
                            popupWindow.dismiss();
                        }

                        flag=false;
                        adapter_pop =new BaseAdapter() {
                            @Override
                            public int getCount() {
                                return list_fake.size();
                            }

                            @Override
                            public Object getItem(int position) {
                                return list_fake.get(position);
                            }

                            @Override
                            public long getItemId(int position) {
                                return 0;
                            }

                            @Override
                            public View getView(int position, View convertView, ViewGroup parent) {
                                convertView = View.inflate(ShuMaActivity.this, R.layout.item_pop, null);

                                TextView tv_item = (TextView) convertView.findViewById(R.id.tv_item);
                                tv_item.setText(list_fake.get(position).toString());
                                if(position==0){
                                    tv_item.setBackgroundColor(Color.LTGRAY);
                                }
                                return convertView;
                            }
                        };
                        lv_pop.setAdapter(adapter_pop);
                        popupWindow = new PopupWindow(contentView1
                                , ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);

                        popupWindow.setTouchable(true);
//
                        popupWindow.setTouchInterceptor(new View.OnTouchListener() {

                            @Override
                            public boolean onTouch(View v, MotionEvent event) {

                                Log.i("mengdd", "onTouch : ");

                                return false;
                                // 这里如果返回true的话，touch事件将被拦截
                                // 拦截后 PopupWindow的onTouchEvent不被调用，这样点击外部区域无法dismiss
                            }
                        });



                        popupWindow.setBackgroundDrawable(getResources().getDrawable(
                                R.drawable.fake));
                        popupWindow.showAsDropDown(btn_left);
                        break;
                    case R.id.btn_middle :
                        if(popupWindow!=null){

                            popupWindow.dismiss();
                        }
                        flag=false;
                        adapter_pop =new BaseAdapter() {
                            @Override
                            public int getCount() {
                                return list_fake.size();
                            }

                            @Override
                            public Object getItem(int position) {
                                return list_fake.get(position);
                            }

                            @Override
                            public long getItemId(int position) {
                                return 0;
                            }

                            @Override
                            public View getView(int position, View convertView, ViewGroup parent) {
                                convertView = View.inflate(ShuMaActivity.this, R.layout.item_pop, null);

                                TextView tv_item = (TextView) convertView.findViewById(R.id.tv_item);
                                tv_item.setText(list_fake.get(position).toString());
                                if(tv_item.toString().equals(btn_middle.getText().toString())){
                                    tv_item.setBackgroundColor(Color.LTGRAY);
                                }
                                return convertView;
                            }
                        };
                        lv_pop.setAdapter(adapter_pop);
                        popupWindow = new PopupWindow(contentView1
                                , ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);

                        popupWindow.setTouchable(true);
//
                        popupWindow.setTouchInterceptor(new View.OnTouchListener() {

                            @Override
                            public boolean onTouch(View v, MotionEvent event) {

                                Log.i("mengdd", "onTouch : ");

                                return false;
                                // 这里如果返回true的话，touch事件将被拦截
                                // 拦截后 PopupWindow的onTouchEvent不被调用，这样点击外部区域无法dismiss
                            }
                        });


                        popupWindow.setBackgroundDrawable(getResources().getDrawable(
                                R.drawable.fake));

                        popupWindow.showAsDropDown(btn_middle);
                        break;
                    case R.id.btn_right :

                        if(popupWindow!=null){

                            popupWindow.dismiss();
                        }
                        flag=false;
                        Toast.makeText(ShuMaActivity.this, "dainjile=== right", Toast.LENGTH_SHORT).show();
                        adapter_pop =new BaseAdapter() {
                            @Override
                            public int getCount() {
                                return list_fake_two.size();
                            }

                            @Override
                            public Object getItem(int position) {
                                return list_fake_two.get(position);
                            }

                            @Override
                            public long getItemId(int position) {
                                return 0;
                            }

                            @Override
                            public View getView(int position, View convertView, ViewGroup parent) {
                                convertView = View.inflate(ShuMaActivity.this, R.layout.item_pop, null);

                                TextView tv_item = (TextView) convertView.findViewById(R.id.tv_item);
                                tv_item.setText(list_fake_two.get(position).toString());
                                if(position==0){
                                    tv_item.setBackgroundColor(Color.LTGRAY);
                                }
                                return convertView;
                            }
                        };
                        lv_pop.setAdapter(adapter_pop);
                        popupWindow = new PopupWindow(contentView1
                                , ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);

                        popupWindow.setTouchable(true);
//
                        popupWindow.setTouchInterceptor(new View.OnTouchListener() {

                            @Override
                            public boolean onTouch(View v, MotionEvent event) {

                                Log.i("mengdd", "onTouch : ");
                                switch (event.getAction()){
                                    case MotionEvent.ACTION_DOWN:
                                        Log.e("TAG", "ACTION_DOWN ");
                                        break;
                                    case MotionEvent.ACTION_MOVE:
                                        Log.e("TAG", "ACTION_MOVE ");
                                        break;
                                    case MotionEvent.ACTION_UP:
                                        Log.e("TAG", "ACTION_UP ");
                                        break;

                                }

                                return false;
                                // 这里如果返回true的话，touch事件将被拦截
                                // 拦截后 PopupWindow的onTouchEvent不被调用，这样点击外部区域无法dismiss
                            }
                        });


                        popupWindow.setBackgroundDrawable(getResources().getDrawable(
                                R.drawable.fake));
                        popupWindow.showAsDropDown(btn_right);


                        break;


                }



            }
        });

//        btn_left = (Button)findViewById(R.id.btn_left);
//        btn_middle = (Button)findViewById(R.id.btn_middle);
//        btn_right = (Button)findViewById(R.id.btn_right);
//        btn_left.setOnClickListener(this);
//        btn_middle.setOnClickListener(this);
//        btn_right.setOnClickListener(this);

//        rg_shuma = (RadioGroup)findViewById(R.id.rg_shuma);
//        rg_shuma.setOnCheckedChangeListener(new MyListener());
        layout = new GridLayoutManager(this,2);
        layout.setOrientation(GridLayoutManager.VERTICAL);





        //下面的recycleView好像不用联网获取数据？？
        rv_url = Url.mall_rv_url;
        String saveJson_rv = CacheUtils.getString(this, rv_url);
        if (!TextUtils.isEmpty(saveJson_rv)) {
            processRvData(saveJson_rv);
        }
        getDataFromNet(rv_url);



    }




    private void processRvData(String saveJson_rv) {
        MallRecycleViewBean  mallRecycleViewBean  = new Gson().fromJson(saveJson_rv, MallRecycleViewBean.class);
        Log.e("TAG", "1=====---" + mallRecycleViewBean.getData());
        list = mallRecycleViewBean.getData().getList();

        Log.e("TAG", "2====list====" + list.toString());
        rv_shuma.setLayoutManager(layout);
        //recycleView设置adapter
        adapter = new RvCinemaAdapter(this);
//        recycleView_cinema.setAdapter(adapter);
        mWrapAdapter = new WrapAdapter<>(adapter);
        // 设置头部占据一行
        mWrapAdapter.adjustSpanSize(rv_shuma);
        // 设置RecyclerView的数据适配器(适配器包装)
        rv_shuma.setAdapter(mWrapAdapter);



    }



    public void getDataFromNet(String url) {

        RequestParams params = new RequestParams(url);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.e("TAG", "-----2-----联网请求成功！-------");
                CacheUtils.putString(ShuMaActivity.this, rv_url, result);//缓存数据
                processRvData(result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

                Log.e("TAG", "-----3-----联网请求失败！-------");
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });


    }




//    private void showPopupWindow(View view) {
//
//        // 一个自定义的布局，作为显示的内容
//        View contentView = LayoutInflater.from(this).inflate(
//                R.layout.pop_window, null);
//
//
//        final PopupWindow popupWindow = new PopupWindow(contentView,
//                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, true);

//        popupWindow.setTouchable(true);
//
//        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
//
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//
//                Log.i("mengdd", "onTouch : ");
//
//                return false;
//                // 这里如果返回true的话，touch事件将被拦截
//                // 拦截后 PopupWindow的onTouchEvent不被调用，这样点击外部区域无法dismiss
//            }
//        });
//
//        // 如果不设置PopupWindow的背景，无论是点击外部区域还是Back键都无法dismiss弹框
//        // 我觉得这里是API的一个bug
//
////        popupWindow.setBackgroundDrawable(getResources().getDrawable(
////                R.drawable.selectmenu_bg_downward))
////        popupWindow.setBackgroundDrawable(R.drawable.);
////        popupWindow.setBackgroundDrawable(Color.TRANSPARENT);
//
//        // 设置好参数之后再show
//        popupWindow.showAsDropDown(view);
//
//    }







    // recycleView(find)的adapter
    class RvCinemaAdapter extends BaseRecyclerAdapter {

        public RvCinemaAdapter(Context context) {
            super(context);
        }


        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(ShuMaActivity.this).inflate(R.layout.mall_rv_item, parent, false);

            Log.e("TAG", "view======"+view.toString());
            return new MyEightHolder(view);

        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {


////            ((MyEightHolder)(holder)).
//            ((MyEightHolder)holder).tv_title.setText(list.get(position).getTitle());
//            Glide.with(context).load(list.get(position).getImages().get(0).getUrl()).into(((MyEightHolder) holder).iv_left);
//            Glide.with(context).load(list.get(position).getImages().get(1).getUrl()).into(((MyEightHolder) holder).iv_middle);
//            Glide.with(context).load(list.get(position).getImages().get(2).getUrl()).into(((MyEightHolder) holder).iv_right);

            ((MyEightHolder)holder).tv_nickname.setText(list.get(position).getTitle());
            Log.e("TAG", "4========list.get(position).getTitle()======" + list.get(position).getTitle());
            ((MyEightHolder)holder).textView6.setText(list.get(position).getValue() + "");
            Glide.with(ShuMaActivity.this).load(list.get(position).getPic()).into(((MyEightHolder) holder).iv_left);


        }

        @Override
        public int getItemCount() {
            return list.size();
        }


        class MyEightHolder extends RecyclerView.ViewHolder {

            private ImageView iv_left;

            private TextView tv_nickname;

            private TextView textView6;
            public MyEightHolder(View itemView) {
                super(itemView);
                iv_left = (ImageView) itemView.findViewById(R.id.iv_left);
                tv_nickname = (TextView) itemView.findViewById(R.id.tv_nickname);
                textView6 = (TextView) itemView.findViewById(R.id.textView6);

            }
        }




    }

    private class MyBackOnclickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            //关闭页面
            finish();
        }
    }



}
