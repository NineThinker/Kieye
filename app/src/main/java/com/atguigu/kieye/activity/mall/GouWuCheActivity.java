package com.atguigu.kieye.activity.mall;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.kieye.R;
import com.atguigu.kieye.utils.widget.BaseRecyclerAdapter;
import com.atguigu.kieye.utils.widget.WrapAdapter;
import com.atguigu.kieye.view.NumberAddSubView;

import org.xutils.x;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 作者：张爽 on 2016/7/4 12:04
 * 邮箱：18330118276@163.com
 *
 * listview中填充数即
 */
public class GouWuCheActivity extends Activity{


    private RecyclerView rv_gouwu;
    private View headView;
    private RvCinemaAdapter adapter;
    private WrapAdapter<RvCinemaAdapter> mWrapAdapter;
    private ArrayList data;
    private android.view.View foodView;
    private int zongjia;
    private int jianshu;
    private View btn_purchse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tijiaodingdan);


        //还有一个button
        btn_purchse = findViewById(R.id.btn_purchse);
        //设置button背景
        if(jianshu!=0){
            btn_purchse.setBackgroundColor(Color.RED);
        }else {
            btn_purchse.setBackgroundColor(Color.LTGRAY);

            //geibutton设置点击事件的监听（跳转到支付界面）
            btn_purchse.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(GouWuCheActivity.this, "跳转到支付页面", Toast.LENGTH_SHORT).show();
                }
            });
        }




        rv_gouwu = (RecyclerView)findViewById(R.id.rv_shangpin);

        //给头部添加数据
        processCinemaData();
        //给recycleView加头加尾
        headView = View.inflate(this, R.layout.gouwu_head, null);
        x.view().inject(this, headView);

        LinearLayoutManager layout = new LinearLayoutManager(this);
        rv_gouwu.setLayoutManager(layout);

        //recycleView设置adapter
        adapter = new RvCinemaAdapter(this);
//        recycleView_cinema.setAdapter(adapter);
        mWrapAdapter = new WrapAdapter<>(adapter);
        // 设置头部占据一行
//        mWrapAdapter.adjustSpanSize(rv_gouwu);

        // 设置RecyclerView的数据适配器(适配器包装)
        rv_gouwu.setAdapter(mWrapAdapter);

        mWrapAdapter.addHeaderView(headView);
    }



    private void processCinemaData() {
        Log.e("TAG", "processCinemaData=====");
        data = new ArrayList();
        data.add("1002联盟蓝S");

//        //recycleView设置分割线
//        //没有提供默认的分割线
//        rv_gouwu.addItemDecoration(new DividerListItemDecoration(context, DividerListItemDecoration.VERTICAL_LIST));

    }

    class RvCinemaAdapter extends BaseRecyclerAdapter {
        public boolean tag;


        public RvCinemaAdapter(Context context) {
            super(context);
        }

        public RvCinemaAdapter(Context mContext, LinkedList mItemLists) {
            super(mContext, mItemLists);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            if(viewType == 0)
            {
                View view = LayoutInflater.from(GouWuCheActivity.this).inflate(R.layout.gouwu_foot, parent, false);
                return new MyFootHolder(view);
            }


            View view = LayoutInflater.from(GouWuCheActivity.this).inflate(R.layout.item_gouwu, parent, false);

            return new MyHolder(view);
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {



            ((MyHolder)holder).tv_shangpin.setText("1002联盟蓝S");


            ((MyHolder)holder).number_add_sub_view.setOnButtonClickListener(new NumberAddSubView.OnButtonClickListener() {
                @Override
                public void onSubButton(View view, int value) {
//                    cartProvider.update(cart);//把数据缓存到本地
                    jianshu = value;
                    Log.e("TAG", "sub-----value====="+value);
                    zongjia = value*99;
                    Log.e("TAG", "sub-----jianshu====="+jianshu);
                    Log.e("TAG", "sub-----zongjia====="+zongjia);
                }

                @Override
                public void onAddButton(View view, int value) {
//                    cartProvider.update(cart);//把数据缓存到本地
//                    showTotalPrice();
                    jianshu = value;
                    Log.e("TAG", "Add-----value====="+value);
                    zongjia = value*99;
                    Log.e("TAG", "Add-----jianshu====="+jianshu);
                    Log.e("TAG", "Add-----zongjia====="+zongjia);

                }
            });



            if(position==1){

                ((MyFootHolder)holder).tv_zongjia.setText(zongjia+"");

                Log.e("TAG", "((MyFootHolder)holder)=====zongjia===" + zongjia);
                ((MyFootHolder)holder).tv_jianshu.setText(jianshu + "");
                Log.e("TAG", "((MyFootHolder)holder)=====jianshu===" + jianshu);
                return;
            }

        }

        @Override
        public int getItemCount() {
            //tmd  tmd  tmd  !!!!!!!
            return data.size();
        }

        //用来实现分类型
        @Override
        public int getItemViewType(int position) {
//            如果加了header，position的是否+1？

            if (position==data.size()-1){
                return 0;
            }
            return 1;

//            return super.getItemViewType(position);
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

            private TextView tv_shangpin;
            private com.atguigu.kieye.view.NumberAddSubView number_add_sub_view;
            public MyHolder(View itemView) {
                super(itemView);
                tv_shangpin = (TextView)itemView.findViewById(R.id.tv_shangpin);
                number_add_sub_view = (NumberAddSubView)itemView.findViewById(R.id.number_add_sub_view);

            }
        }

         class MyFootHolder extends RecyclerView.ViewHolder {

            private TextView tv_zongjia;
            private TextView tv_jianshu;

            public MyFootHolder(View view) {
                super(view);

                tv_zongjia = (TextView)view.findViewById(R.id.tv_zongjia);
                tv_jianshu = (TextView)view.findViewById(R.id.tv_jianshu);

            }
        }
    }
}
