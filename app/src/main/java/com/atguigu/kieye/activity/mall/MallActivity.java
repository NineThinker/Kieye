package com.atguigu.kieye.activity.mall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

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

import java.util.List;

/**
 * 作者：张爽 on 2016/7/2 20:23
 * 邮箱：18330118276@163.com
 */
public class MallActivity extends FragmentActivity{
    private RadioGroup rg_above;
    private RadioButton rb_shuma;
    private ImageButton ib_back;
    private ImageButton ib_title_search;
    private TextView tv_title;
    private RecyclerView rv_mall;
    private View headView;
    private ListView lv_mall_head;
   
    private String rv_url;
    private RvCinemaAdapter adapter;
    private WrapAdapter<RvCinemaAdapter> mWrapAdapter;
    private List<MallRecycleViewBean.DataBean.ListBean> list;
    private GridLayoutManager layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall);
        initView();
        initData();
    }


    private void initView() {

        ib_back = (ImageButton)findViewById(R.id.ib_back);
        ib_back.setOnClickListener(new MyBackOnclickListener());
        rv_mall = (RecyclerView)findViewById(R.id.rv_mall);
        layout = new GridLayoutManager(this,2);
        layout.setOrientation(GridLayoutManager.VERTICAL);
        headView = View.inflate(this, R.layout.mall_head_view, null);
        x.view().inject(this, headView);
        //RadioGroup,listview
        //这两句请注意！！
        rg_above = (RadioGroup)headView.findViewById(R.id.rg_above);
        rg_above.setOnCheckedChangeListener(new MyRGcheckListener());


        lv_mall_head = (ListView) headView.findViewById(R.id.lv_mall_head);

        lv_mall_head.setAdapter(new MyListAdapter());


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
        Log.e("TAG", "1=====---" + mallRecycleViewBean.getData() );
        list = mallRecycleViewBean.getData().getList();

        Log.e("TAG", "2====list===="+list.toString());
        rv_mall.setLayoutManager(layout);
        //recycleView设置adapter
        adapter = new RvCinemaAdapter(this);
//        recycleView_cinema.setAdapter(adapter);
        mWrapAdapter = new WrapAdapter<>(adapter);
        // 设置头部占据一行
        mWrapAdapter.adjustSpanSize(rv_mall);
        // 设置RecyclerView的数据适配器(适配器包装)
        rv_mall.setAdapter(mWrapAdapter);
        mWrapAdapter.addHeaderView(headView);


    }



    public void getDataFromNet(String url) {

            RequestParams params = new RequestParams(url);
            x.http().get(params, new Callback.CommonCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    Log.e("TAG", "-----2-----联网请求成功！-------");
                    CacheUtils.putString(MallActivity.this, rv_url, result);//缓存数据
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

    // recycleView(find)的adapter
    class RvCinemaAdapter extends BaseRecyclerAdapter {

        public RvCinemaAdapter(Context context) {
            super(context);
        }


        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(MallActivity.this).inflate(R.layout.mall_rv_item,parent,false);

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
            Glide.with(MallActivity.this).load(list.get(position).getPic()).into(((MyEightHolder) holder).iv_left);

            //给图片设置点击事件
            ((MyEightHolder) holder).iv_left.setOnClickListener(new MyImageOnlicklistener());


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

    private void initData() {

    }


    private class MyRGcheckListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {


            switch (checkedId){
                case R.id.rb_shuma:
//                Toast.makeText(MallActivity.this, "点击了rb_shuma=====", Toast.LENGTH_SHORT).show();

                    //

//                    //1.得到Fragemnt管理者
//                    FragmentManager fm =  getSupportFragmentManager();
//                    //2.开启事情
//                    FragmentTransaction transaction = fm.beginTransaction();
//                    //3.替换LeftFragment和ContentFragment
//                    transaction.replace(R.id.ll_mall, new ContentFragment());
//                    //4.提交
//                    transaction.commit();


                    startActivity(new Intent(MallActivity.this,ShuMaActivity.class));

                    break;
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

    //listview的适配器
    private class MyListAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = View.inflate(MallActivity.this,R.layout.lv_item,null);
            return convertView;
        }
    }

    private class MyImageOnlicklistener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            startActivity(new Intent(MallActivity.this,ProductDetailActivity.class));

        }
    }
}
