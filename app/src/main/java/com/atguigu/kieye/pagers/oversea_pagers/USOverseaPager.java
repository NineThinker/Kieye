package com.atguigu.kieye.pagers.oversea_pagers;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.atguigu.kieye.R;
import com.atguigu.kieye.base.BasePager;
import com.atguigu.kieye.utils.widget.BaseRecyclerAdapter;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 作者：张爽 on 2016/6/27 20:01
 * 邮箱：18330118276@163.com
 */
public class USOverseaPager extends BasePager {
    private ArrayList list;
    //adapter
    private RvHotAdapter adapter;

    private TextView view;

    public USOverseaPager(Context context) {
        super(context);
    }





    @Override
    public void initData() {
        Log.e("TAG", "USOverseaPager页面被初始化了.....");

        //向帧布局中添加视图


        LinearLayoutManager layout = new LinearLayoutManager(context);
//        rv_oversea_base.setLayoutManager(layout);
        fl_base_content.removeAllViews();
        list = new ArrayList();
        for (int i = 0; i < 200; i++) {
            list.add("冰淇淋的夏天" + i);
        }

        TextView textView = new TextView(context);
        textView.setText("测试美国");
        fl_base_content.addView(textView);

        //recycleView设置adapter
//        adapter = new RvHotAdapter(context);
//        rv_oversea_base.setAdapter(adapter);



    }




    // recycleView(cinema)的adapter
    class RvHotAdapter extends BaseRecyclerAdapter {


        public RvHotAdapter(Context context) {
            super(context);
        }

        public RvHotAdapter(Context mContext, LinkedList mItemLists) {
            super(mContext, mItemLists);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            //viewtype分类型的值 （getItemViewType返回的类型值）
//            if (viewType==0){
//
//                View view = LayoutInflater.from(context).inflate(R.layout.item_cinema_login_cho,parent,false);
//
//                return new HeadHolder(view);
//            }
            View view = LayoutInflater.from(context).inflate(R.layout.item_cinema, parent, false);
//            View view = View.inflate(context, R.layout.item_cinema, null);
            return new MyHolder(view);
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {

//            if (position==0){
//                return;
//            }
//            ((MyHolder)holder).setData(list.get(position));

//            ((MyHolder) holder).tv_cinema.setText(list.get(position).toString());
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        //用来实现分类型
        @Override
        public int getItemViewType(int position) {
            //如果加了header，position的是否+1？
//
//            if (position==0){
//                return 0;
//            }
//            return 1;

            return super.getItemViewType(position);
        }

//
//        class MyHolder extends RecyclerView.ViewHolder{
//
//            private TextView tv;
//
//            public MyHolder(View itemView) {
//                super(itemView);
//                tv = (TextView) itemView.findViewById(R.id.tv);
//            }
//
//            public void setData(String data) {
//                tv.setText(data);
//            }
//        }
//        class HeadHolder extends RecyclerView.ViewHolder{
//
//            private TextView tv;
//
//            public HeadHolder(View itemView) {
//                super(itemView);
//
//            }
//
//        }


        class MyHolder extends RecyclerView.ViewHolder {


            public MyHolder(View itemView) {
                super(itemView);

            }
        }


    }



}
