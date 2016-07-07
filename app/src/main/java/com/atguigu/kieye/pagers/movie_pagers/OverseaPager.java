package com.atguigu.kieye.pagers.movie_pagers;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.kieye.R;
import com.atguigu.kieye.base.BasePager;
import com.atguigu.kieye.base.MovieBasePager;
import com.atguigu.kieye.bean.FindPagerBean;
import com.atguigu.kieye.utils.CacheUtils;
import com.atguigu.kieye.utils.DividerListItemDecoration;
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
 * 作者：张爽 on 2016/6/25 14:54
 * 邮箱：18330118276@163.com
 */
public class OverseaPager extends MovieBasePager{

//    private ArrayList  list;
    private BasePager pager;
    private FrameLayout fl;
    private RecyclerView rv_oversea;
//    private RecyclerView.Adapter adapter;
    private Button btn_caton;
    private Button btn_santic;
    private Button btn_comedy;
    private Button btn_us;
    private Button btn_blabla;




    //adapter
    private RvCinemaAdapter adapter;
    private WrapAdapter<RvCinemaAdapter> mWrapAdapter;

    private String rv_url;
    //recyclerView的数据集合（联网获取）
    private List<FindPagerBean.DataBean.FeedsBean> list;

    public OverseaPager(Context context) {
        super(context);
    }

    @Override
    public void initData() {
        super.initData();

        //带红色背景的搜索框消失
        toolbar_movie_base.setVisibility(View.VISIBLE);
        Log.e("TAG", "OverseaPager页面被初始化了.....");
        //此举应该有用！
       // fl_base_content.removeAllViews();
        //填加tablayout的item
        final View view = View.inflate(context,R.layout.oversea,null);
         rv_oversea = (RecyclerView) view.findViewById(R.id.rv_oversea);

        btn_caton = (Button) view.findViewById(R.id.btn_caton);
        btn_santic = (Button) view.findViewById(R.id.btn_santic);
        btn_comedy = (Button) view.findViewById(R.id.btn_comedy);
        btn_us = (Button) view.findViewById(R.id.btn_us);
        btn_blabla = (Button) view.findViewById(R.id.btn_blabla);


        //此处联网请求数据可否？
//        urlTop = Url.cinemaAdUrl;
//        String saveJson = CacheUtils.getString(context, urlTop);
//        if (!TextUtils.isEmpty(saveJson)) {
//            processData(saveJson);
//        }
//        getDataFromNet(urlTop);

        rv_url = Url.find_rv_url;
        String saveJson_rv = CacheUtils.getString(context, rv_url);
        if (!TextUtils.isEmpty(saveJson_rv)) {
            processRvData(saveJson_rv);
        }
        getDataFromNet(rv_url);



        fl_movie_base_content.addView(view);


    }


    private class MyOnCheckedChangeListener implements RadioGroup.OnCheckedChangeListener {



        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.btn_caton :
                    Toast.makeText(context, "点击了R.id.btn_caton", Toast.LENGTH_SHORT).show();
                    //改变url的地址
                    break;
                case R.id.btn_santic:
                    Toast.makeText(context, "点击了R.id.btn_santic", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_comedy:
                    Toast.makeText(context, "点击了R.id.btn_comedy", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_us:
                    Toast.makeText(context, "点击了R.id.btn_us", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_blabla:
                    Toast.makeText(context, "点击了R.id.btn_blabla", Toast.LENGTH_SHORT).show();
                    break;
            }




        }
    }



    private void processRvData(String saveJson_rv) {
        FindPagerBean findPagerBean  = new Gson().fromJson(saveJson_rv, FindPagerBean.class);
        Log.e("TAG", "解析成功---" + findPagerBean.getData().getFeeds().toString());
        list = findPagerBean.getData().getFeeds();
        //向recycleView中添加数据（还要分类型，添加item）
        //设置布局管理器
        LinearLayoutManager layout = new LinearLayoutManager(context);
        rv_oversea.setLayoutManager(layout);

        //recycleView设置adapter
        adapter = new RvCinemaAdapter(context);
//        recycleView_cinema.setAdapter(adapter);
        mWrapAdapter = new WrapAdapter<>(adapter);
        // 设置头部占据一行
//        mWrapAdapter.adjustSpanSize(recycleView_find);
        // 设置RecyclerView的数据适配器(适配器包装)
        rv_oversea.setAdapter(mWrapAdapter);
        //recycleView设置分割线
        //没有提供默认的分割线
        rv_oversea.addItemDecoration(new DividerListItemDecoration(context, DividerListItemDecoration.VERTICAL_LIST));


    }





    //联网获取数据
    public void getDataFromNet(String url) {



        if(url == rv_url){
            RequestParams params = new RequestParams(url);
            x.http().get(params, new Callback.CommonCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    Log.e("TAG", "-----rv_url-----联网请求成功！-------");
                    CacheUtils.putString(context, rv_url, result);//缓存数据
                    processRvData(result);
                }

                @Override
                public void onError(Throwable ex, boolean isOnCallback) {

                    Log.e("TAG", "-----rv_url-----联网请求失败！-------");
                }

                @Override
                public void onCancelled(CancelledException cex) {

                }

                @Override
                public void onFinished() {

                }
            });


        }
    }



    // recycleView(find)的adapter
    class RvCinemaAdapter extends BaseRecyclerAdapter {

        public RvCinemaAdapter(Context context) {
            super(context);
        }


        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //viewtype分类型的值 （getItemViewType返回的类型值）
            if (viewType==4){

                View view = LayoutInflater.from(context).inflate(R.layout.find_four_item,parent,false);

                return new MyFourHolder(view);
            }
            if (viewType==7){

                View view = LayoutInflater.from(context).inflate(R.layout.find_seven_item,parent,false);

                return new MysevenHolder(view);
            }
            if (viewType==2){

                View view = LayoutInflater.from(context).inflate(R.layout.find_two_item,parent,false);

                return new MyTwoHolder(view);
            }


            View view = LayoutInflater.from(context).inflate(R.layout.find_eight_item,parent,false);

            return new MyEightHolder(view);

        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {

            if(list.get(position).getFeedType()==4){

                //绑定数据
                ((MyFourHolder)holder).tv_commentcount.setText(""+list.get(position).getCommentCount());
                ((MyFourHolder)holder).tv_title.setText(list.get(position).getTitle());
                ((MyFourHolder)holder).tv_viewcount.setText(""+list.get(position).getViewCount());
                ((MyFourHolder)holder).tv_nickname.setText(list.get(position).getUser().getNickName());
                Glide.with(context).load(list.get(position).getImages().get(0).getUrl()).into(((MyFourHolder) holder).iv_icon);

                return;
            }
            if(list.get(position).getFeedType()==7){
                //绑定数据
                ((MysevenHolder)holder).tv_commentcount.setText(""+list.get(position).getCommentCount());
                ((MysevenHolder)holder).tv_title.setText(list.get(position).getTitle());
                ((MysevenHolder)holder).tv_viewcount.setText(""+list.get(position).getViewCount());
                ((MysevenHolder)holder).tv_nickname.setText(list.get(position).getUser().getNickName());
                Glide.with(context).load(list.get(position).getImages().get(0).getUrl()).into(((MysevenHolder) holder).iv_icon);

                return;
            }
            if(list.get(position).getFeedType()==2){

                ((MyTwoHolder)holder).tv_commentcount.setText(""+list.get(position).getCommentCount());
                ((MyTwoHolder)holder).tv_title.setText(list.get(position).getTitle());
                ((MyTwoHolder)holder).tv_viewcount.setText(""+list.get(position).getViewCount());
                ((MyTwoHolder)holder).tv_nickname.setText(list.get(position).getUser().getNickName());
                Glide.with(context).load(list.get(position).getImages().get(0).getUrl()).into(((MyTwoHolder) holder).iv_left);
                Glide.with(context).load(list.get(position).getImages().get(1).getUrl()).into(((MyTwoHolder) holder).iv_middle);
                Glide.with(context).load(list.get(position).getImages().get(2).getUrl()).into(((MyTwoHolder) holder).iv_right);

                return;
            }

//            ((MyEightHolder)(holder)).
            ((MyEightHolder)holder).tv_commentcount.setText(""+list.get(position).getCommentCount());
            ((MyEightHolder)holder).tv_title.setText(list.get(position).getTitle());
            ((MyEightHolder)holder).tv_viewcount.setText(""+list.get(position).getViewCount());
            ((MyEightHolder)holder).tv_nickname.setText(list.get(position).getUser().getNickName());
            Glide.with(context).load(list.get(position).getImages().get(0).getUrl()).into(((MyEightHolder) holder).iv_left);
            Glide.with(context).load(list.get(position).getImages().get(1).getUrl()).into(((MyEightHolder) holder).iv_middle);
            Glide.with(context).load(list.get(position).getImages().get(2).getUrl()).into(((MyEightHolder) holder).iv_right);

        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        //用来实现分类型
        @Override
        public int getItemViewType(int position) {
            //如果加了header，position的是否+1?(答案是：NO!!!!)
            if (list.get(position).getFeedType()==4){
                return 4;
            }
            if (list.get(position).getFeedType()==7){
                return 7;
            }
            if (list.get(position).getFeedType()==2){
                return 2;
            }
            return 8;
        }


        class MyFourHolder extends RecyclerView.ViewHolder {

            private ImageView iv_icon;
            private TextView tv_title ;
            private TextView tv_nickname;
            private TextView tv_commentcount;
            private TextView tv_viewcount;
            public MyFourHolder(View itemView) {
                super(itemView);
                iv_icon = (ImageView) itemView.findViewById(R.id.iv_icon);
                tv_title = (TextView) itemView.findViewById(R.id.tv_title);
                tv_nickname = (TextView) itemView.findViewById(R.id.tv_nickname);
                tv_commentcount = (TextView) itemView.findViewById(R.id.tv_commentcount);
                tv_viewcount = (TextView) itemView.findViewById(R.id.tv_viewcount);
            }
        }


        class MysevenHolder extends RecyclerView.ViewHolder {
            private ImageView iv_icon;
            private TextView tv_title ;
            private TextView tv_nickname;
            private TextView tv_commentcount;
            private TextView tv_viewcount;
            public MysevenHolder(View itemView) {
                super(itemView);
                iv_icon = (ImageView) itemView.findViewById(R.id.iv_icon);
                tv_title = (TextView) itemView.findViewById(R.id.tv_title);
                tv_nickname = (TextView) itemView.findViewById(R.id.tv_nickname);
                tv_commentcount = (TextView) itemView.findViewById(R.id.tv_commentcount);
                tv_viewcount = (TextView) itemView.findViewById(R.id.tv_viewcount);
            }
        }


        class MyTwoHolder extends RecyclerView.ViewHolder {


            private ImageView iv_left;
            private ImageView iv_middle;
            private ImageView iv_right;
            private ImageView iv_icon;
            private TextView tv_title ;
            private TextView tv_nickname;
            private TextView tv_commentcount;
            private TextView tv_viewcount;
            public MyTwoHolder(View itemView) {
                super(itemView);
                iv_icon = (ImageView) itemView.findViewById(R.id.iv_icon);
                iv_left = (ImageView) itemView.findViewById(R.id.iv_left);
                iv_middle = (ImageView) itemView.findViewById(R.id.iv_middle);
                iv_right = (ImageView) itemView.findViewById(R.id.iv_right);
                tv_title = (TextView) itemView.findViewById(R.id.tv_title);
                tv_nickname = (TextView) itemView.findViewById(R.id.tv_nickname);
                tv_commentcount = (TextView) itemView.findViewById(R.id.tv_commentcount);
                tv_viewcount = (TextView) itemView.findViewById(R.id.tv_viewcount);


            }
        }


        class MyEightHolder extends RecyclerView.ViewHolder {

            private ImageView iv_left;
            private ImageView iv_middle;
            private ImageView iv_right;
            private ImageView iv_icon;
            private TextView tv_title ;
            private TextView tv_nickname;
            private TextView tv_commentcount;
            private TextView tv_viewcount;
            public MyEightHolder(View itemView) {
                super(itemView);
                iv_icon = (ImageView) itemView.findViewById(R.id.iv_icon);
                iv_left = (ImageView) itemView.findViewById(R.id.iv_left);
                iv_middle = (ImageView) itemView.findViewById(R.id.iv_middle);
                iv_right = (ImageView) itemView.findViewById(R.id.iv_right);
                tv_title = (TextView) itemView.findViewById(R.id.tv_title);
                tv_nickname = (TextView) itemView.findViewById(R.id.tv_nickname);
                tv_commentcount = (TextView) itemView.findViewById(R.id.tv_commentcount);
                tv_viewcount = (TextView) itemView.findViewById(R.id.tv_viewcount);
            }
        }




    }

}
