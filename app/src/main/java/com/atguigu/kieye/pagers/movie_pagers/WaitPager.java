package com.atguigu.kieye.pagers.movie_pagers;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.atguigu.kieye.R;
import com.atguigu.kieye.base.MovieBasePager;
import com.atguigu.kieye.bean.waitbean.WaitBottomBean;
import com.atguigu.kieye.utils.CacheUtils;
import com.atguigu.kieye.utils.DividerListItemDecoration;
import com.atguigu.kieye.utils.Url;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

/**
 * 作者：张爽 on 2016/6/25 14:53
 * 邮箱：18330118276@163.com
 */
public class WaitPager extends MovieBasePager {

    //向recycleView中加载数据，分三种类型 （上/中/下）
    private RecyclerView rv_wait;

    private String bottomUrl= Url.wait_bottom_url;
    private String middleUrl= Url.hotUrl;
    private String topUrl = Url.hotAdUrl;
    private MyAdapter adapter = new MyAdapter();
    private List<WaitBottomBean.DataBean.ComingBean> list;
    private GridView gridviewTop;
    private GridView gridviewMiddle;
    private List<WaitBottomBean.DataBean.ComingBean> listMiddle;
    private List<WaitBottomBean.DataBean.ComingBean> listTop;
    private float density;
    private ListView lv_top;
    private ListView lv_middle;
    private ListView lv_bottom;



//    recyclerView的数据集合（联网获取）

    //构造器
    public WaitPager(Context context) {
        super(context);

    }

    @Override
    public void initData() {
        super.initData();

        red_white_sousuokuang.setVisibility(View.VISIBLE);
        System.out.println("wait页的数据被初始化了....");


        View view = View.inflate(context, R.layout.wait_pager, null);
        rv_wait = (RecyclerView) view.findViewById(R.id.rv_wait);

        Log.e("TAG", "rv_wait====="+rv_wait);

        //向recycleview中添加数据
        setData();
        fl_movie_base_content.removeAllViews();
        fl_movie_base_content.addView(view);

    }

    //向recycleview中添加数据
    private void setData() {
//        String saveJsonTop = CacheUtils.getString(context, topUrl);
//        if (!TextUtils.isEmpty(saveJsonTop)) {
//            processTopData(saveJsonTop);
//
//            Log.e("TAG", "1");
//
//        }
//        String saveJsonMiddle = CacheUtils.getString(context, middleUrl);
//        if (!TextUtils.isEmpty(saveJsonMiddle)) {
//            processMiddleData(saveJsonMiddle);
//            Log.e("TAG", "2");
//        }


        String saveJsonBottom = CacheUtils.getString(context, bottomUrl);
        if (!TextUtils.isEmpty(saveJsonBottom)) {
            processBottomData(saveJsonBottom);
            Log.e("TAG", "3");
        }

        getDataFromNet(topUrl);
        //联网获取集合数据
        getDataFromNet(middleUrl);
        getDataFromNet(bottomUrl);


    }

    //类型1
//    private void processTopData(String saveJsonTop) {
//        WaitBottomBean waitBottomBean = new Gson().fromJson(saveJsonTop, WaitBottomBean.class);
//        listTop = waitBottomBean.getData().getComing();
//        Log.e("TAG", "listTop ===="+listTop.toString());
//
//    }
//
//    //类型2
//    private void processMiddleData(String saveJsonMiddle) {
//        WaitBottomBean waitBottomBean = new Gson().fromJson(saveJsonMiddle, WaitBottomBean.class);
//        listMiddle = waitBottomBean.getData().getComing();
//        Log.e("TAG", "listMiddle ===="+listMiddle.toString());
//    //给listView设置adapter(horizantal)etAdapter(adapter);
//
//    }

    //类型3
    private void processBottomData(String saveJsonBottom) {

        WaitBottomBean waitBottomBean = new Gson().fromJson(saveJsonBottom, WaitBottomBean.class);
        list=listMiddle=listTop = waitBottomBean.getData().getComing();
        Log.e("TAG", "list ===="+list.toString());
        //用来呈现数据(放在progressData中)
        //向recycleView中添加数据（还要分类型，添加item）
        //设置布局管理器
        LinearLayoutManager layout = new LinearLayoutManager(context);

        rv_wait.setLayoutManager(layout);
        //recycleView设置adapter
        rv_wait.setAdapter(adapter);
        //recycleView设置分割线
        //没有提供默认的分割线
        rv_wait.addItemDecoration(new DividerListItemDecoration(context, DividerListItemDecoration.VERTICAL_LIST));

    }

    //联网请求数据

    //联网获取数据
    public void getDataFromNet(String url) {

        if(url.equals(topUrl)){
            Log.e("TAG", "topUrl===" + topUrl);
            RequestParams params= new RequestParams(topUrl);
            x.http().get(params, new Callback.CommonCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    Log.e("TAG", "-----topUrl-----联网请求成功！-------");
                    CacheUtils.putString(context, topUrl, result);//缓存数据
//                    processTopData(result);

                }

                @Override
                public void onError(Throwable ex, boolean isOnCallback) {

                    Log.e("TAG", "-----topUrl-----联网请求失败！-------");
                }

                @Override
                public void onCancelled(CancelledException cex) {
                    Log.e("TAG", "-----topUrl----------"+cex.getMessage());

                }

                @Override
                public void onFinished() {

                }
            });
        }


        if(url.equals(middleUrl)){
            Log.e("TAG", "middleUrl==="+middleUrl);
            RequestParams params= new RequestParams(middleUrl);
            x.http().get(params, new Callback.CommonCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    Log.e("TAG", "-----middleUrl-----联网请求成功！-------");
                    CacheUtils.putString(context, middleUrl, result);//缓存数据
//                    processMiddleData(result);

                }

                @Override
                public void onError(Throwable ex, boolean isOnCallback) {

                    Log.e("TAG", "-----middleUrl-----联网请求失败！-------");
                }

                @Override
                public void onCancelled(CancelledException cex) {
                    Log.e("TAG", "-----middleUrl--------"+cex.getMessage());

                }

                @Override
                public void onFinished() {

                }
            });

        }

        if(url.equals(bottomUrl)){
            Log.e("TAG", "bottomUrl==="+bottomUrl);
            RequestParams params= new RequestParams(bottomUrl);
            x.http().get(params, new Callback.CommonCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    Log.e("TAG", "-----bottomUrl-----联网请求成功！-------");
                    CacheUtils.putString(context, bottomUrl, result);//缓存数据
                    processBottomData(result);

                }

                @Override
                public void onError(Throwable ex, boolean isOnCallback) {

                    Log.e("TAG", "-----bottomUrl-----联网请求失败！-------");
                }

                @Override
                public void onCancelled(CancelledException cex) {
                    Log.e("TAG", "-----bottomUrl--------"+cex.getMessage());

                }

                @Override
                public void onFinished() {

                }
            });

        }

    }



    //设备适配器
    private class MyAdapter extends RecyclerView.Adapter {


        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            viewtype分类型的值 （getItemViewType返回的类型值）
            if (viewType==0){
                View view = LayoutInflater.from(context).inflate(R.layout.item_wait_top,parent,false);
                return new MyTopHolder(view);
            }
            if(viewType==1){
                View view = LayoutInflater.from(context).inflate(R.layout.item_wait_middle,parent,false);
                return new MyMiddleHolder(view);
            }

                View view = LayoutInflater.from(context).inflate(R.layout.item_wait_boottom, parent, false);
                return new MyBottomHolder(view);

        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if (position==0){

                Log.e("TAG", "position==0");
                //绑定数据
                ((MyTopHolder)holder).gridviewTop.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return list.size();
                    }
                    @Override
                    public Object getItem(int position) {
                        return list.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View convertView, ViewGroup parent) {
                        convertView = View.inflate(context, R.layout.gridview_top_item, null);
                        Log.e("TAG", "top===="+list.get(position).getImg().toString());
                       ImageView iv_icon = (ImageView) convertView.findViewById(R.id.iv_icon);
                        Glide.with(context).load(list.get(position).getImg().replaceAll("w.h/", "")).into(iv_icon);

                        return convertView;
                    }
                });
                ViewGroup.LayoutParams params =((MyTopHolder)holder).gridviewTop.getLayoutParams();
                int itemWidth = (int) (240);
                int spacingWidth = (int) (14);

                params.width = itemWidth*list.size()+(list.size()-1)*spacingWidth;
                ((MyTopHolder)holder).gridviewTop.setStretchMode(GridView.NO_STRETCH); // 设置为禁止拉伸模式
                ((MyTopHolder)holder).gridviewTop.setNumColumns(list.size());
                ((MyTopHolder)holder).gridviewTop.setHorizontalSpacing(spacingWidth);
                ((MyTopHolder)holder).gridviewTop.setColumnWidth(itemWidth);
                ((MyTopHolder)holder).gridviewTop.setLayoutParams(params);

                //每个图片的点击事件
//                ((MyMiddleHolder)holder).gridviewMiddle.setOnItemClickListener(new OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> parent, View view,
//                                            int position, long id) {
//                        System.out.println(position);
//                    }
//                });
                return;
            }
            if (position==1){
                Log.e("TAG", "position==1");
                //绑定数据
                ((MyMiddleHolder)holder).gridviewMiddle.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return list.size();
                    }
                    @Override
                    public Object getItem(int position) {
                        return list.get(position);
                    }

                    @Override
                    public long getItemId(int position) {
                        return 0;
                    }

                    @Override
                    public View getView(int position, View convertView, ViewGroup parent) {
                        convertView = View.inflate(context, R.layout.gridview_middle_item, null);
                        Log.e("TAG", "middle===="+list.get(position).getImg().toString());
                        ImageView iv_icon = (ImageView) convertView.findViewById(R.id.iv_icon);
                        Glide.with(context).load(list.get(position).getImg().replaceAll("w.h/", "")).into(iv_icon);

                        return convertView;
                    }
                });

                // 得到像素密度
//                DisplayMetrics outMetrics = new DisplayMetrics();
//                ((MainActivity)context).windowManager.getDefaultDisplay().getMetrics(outMetrics);
//                density = outMetrics.density; // 像素密度

                // 根据item的数目，动态设定gridview的宽度,现假定每个item的宽度和高度均为100dp，列间距为5dp
                ViewGroup.LayoutParams params =((MyMiddleHolder)holder).gridviewMiddle.getLayoutParams();
                int itemWidth = (int) (180);
                int spacingWidth = (int) (14);

                params.width = itemWidth*list.size()+(list.size()-1)*spacingWidth;
                ((MyMiddleHolder)holder).gridviewMiddle.setStretchMode(GridView.NO_STRETCH); // 设置为禁止拉伸模式
                ((MyMiddleHolder)holder).gridviewMiddle.setNumColumns(list.size());
                ((MyMiddleHolder)holder).gridviewMiddle.setHorizontalSpacing(spacingWidth);
                ((MyMiddleHolder)holder).gridviewMiddle.setColumnWidth(itemWidth);
                ((MyMiddleHolder)holder).gridviewMiddle.setLayoutParams(params);

                //每个图片的点击事件
//                ((MyMiddleHolder)holder).gridviewMiddle.setOnItemClickListener(new OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> parent, View view,
//                                            int position, long id) {
//                        System.out.println(position);
//                    }
//                });
                return;
            }


            ((MyBottomHolder) holder).tv_item_title.setText(list.get(position-2).getNm());
                ((MyBottomHolder) holder).tv_cinema_content.setText(list.get(position-2).getDesc());
                ((MyBottomHolder) holder).tv_content_three.setText(list.get(position-2).getScm()+"");
                Log.e("TAG", "11====" + list.get(position-2).getImg());
                //http://p1.meituan.net/w.h/movie/79311d41bea3be8f1677c0b69a5868fa289298.jpg
                //http://p1.meituan.net/movie/79311d41bea3be8f1677c0b69a5868fa289298.jpg
                Log.e("TAG", "12====" + (list.get(position-2).getImg().replaceAll("w.h/","")));
                Glide.with(context)
                        .load(list.get(position-2).getImg().replaceAll("w.h/", ""))
                        .into(((MyBottomHolder) holder).iv_item_pic);
                ((MyBottomHolder) holder).tv_renshu.setText(list.get(position-2).getWish()+"");


        }

        @Override
        public int getItemCount() {
            return list.size()+2;
        }

        //用来实现分类型
        @Override
        public int getItemViewType(int position) {

            if (position==0){
                return 0;
            }if(position==1) {
                return 1;
            }

            return 2;
        }



//        类型0
        class MyTopHolder extends RecyclerView.ViewHolder {


            public GridView gridviewTop;
            public MyTopHolder(View itemView) {
                super(itemView);

                gridviewTop = (GridView)itemView.findViewById(R.id.gridviewTop);
            }
        }

//        类型1
        class MyMiddleHolder extends RecyclerView.ViewHolder {
            public GridView gridviewMiddle;
            public MyMiddleHolder(View itemView) {
                super(itemView);
                gridviewMiddle = (GridView)itemView.findViewById(R.id.gridviewMiddle);
            }
        }

        //类型2
        class MyBottomHolder extends RecyclerView.ViewHolder {

            public ImageView iv_item_pic;
            public TextView tv_item_title;
//            public TextView tv_item_two;
            public TextView tv_content_three;
            public TextView tv_cinema_content;
            public TextView tv_renshu;
            public MyBottomHolder(View itemView) {
                super(itemView);
                iv_item_pic = (ImageView) itemView.findViewById(R.id.iv_item_pic);
                tv_item_title = (TextView) itemView.findViewById(R.id.tv_item_title);
//                tv_item_two = (TextView) itemView.findViewById(R.id.tv_item_two);
                tv_content_three = (TextView) itemView.findViewById(R.id.tv_content_three);
                tv_cinema_content = (TextView) itemView.findViewById(R.id.tv_cinema_content);
                tv_renshu = (TextView) itemView.findViewById(R.id.tv_renshu);


            }
        }


    }


    }

