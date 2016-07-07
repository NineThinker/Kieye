package com.atguigu.kieye.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.kieye.R;
import com.atguigu.kieye.bean.HotPagerBeam;
import com.atguigu.kieye.utils.Url;
import com.atguigu.kieye.utils.widget.BaseRecyclerAdapter;
import com.bumptech.glide.Glide;

import java.util.LinkedList;

/**
 * 作者：张爽 on 2016/7/2 18:17
 * 邮箱：18330118276@163.com
 */
// recycleView(cinema)的adapter
public class RvHotAdapter extends BaseRecyclerAdapter {


    private HotPagerBeam.DataBean list;
    private Context context;


    public RvHotAdapter(Context context,HotPagerBeam.DataBean list){
        super(context);
        this.context=context;
        this.list = list;

    }


    //设置点击某个item的监听
    public interface OnItemClickListener{

        void onItemClick(View view,int position,HotPagerBeam.DataBean.MoviesBean content);
    }

    private OnItemClickListener onItemClickListener;
    /**
     * 设置某条的监听
     * @param onItemClickListener
     */
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    //设置点击图片

    //设置点击某个item的监听
    public interface OnImageViewClickListener{

        void onImageViewClick(View view,int position);
    }

    private OnImageViewClickListener onImageViewClickListener;
    /**
     * 设置监听图片
     * @param onImageViewClickListener
     */
    public void setOnImageViewClickListener(OnImageViewClickListener onImageViewClickListener) {
        this.onImageViewClickListener = onImageViewClickListener;
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
        View view = LayoutInflater.from(context).inflate(R.layout.item_hot, parent, false);
//            View view = View.inflate(context, R.layout.item_cinema, null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(final   RecyclerView.ViewHolder holder, int position) {



        ((MyHolder)holder).tv_item_title.setText(list.getMovies().get(position).getNm());
        ((MyHolder)holder).tv_content_three.setText(list.getMovies().get(position).getScm());
        ((MyHolder)holder).tv_cinema_content.setText(list.getMovies().get(position).getShowInfo());
        ((MyHolder)holder).tv_bigscore.setText(list.getMovies().get(position).getSc()+"");

        Glide.with(context).load(list.getMovies().get(position).getImg()).into(((MyHolder) holder).iv_item_pic);

        //给图片设置监听
        ((MyHolder) holder).iv_item_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "点击了", Toast.LENGTH_SHORT).show();
                //跳转到播放视频的界面
                //跳转到新闻浏览页面
                Intent intent1 = new Intent(context,HotImageActivity.class);
                //待修改=======
                intent1.putExtra("url", Url.topicUrl);
                context.startActivity(intent1);


            }
        });



    }

    @Override
    public int getItemCount() {
        return list.getMovies().size();
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



    class MyHolder extends RecyclerView.ViewHolder {

        public ImageView iv_item_pic;
        public TextView tv_item_title;
        public TextView tv_item_two;
        private TextView tv_content_three;
        public TextView tv_cinema_content;
        public TextView tv_bigscore;

        public MyHolder(View itemView) {
            super(itemView);
            iv_item_pic = (ImageView) itemView.findViewById(R.id.iv_item_pic);
            tv_item_title = (TextView) itemView.findViewById(R.id.tv_item_title);
            tv_item_two = (TextView) itemView.findViewById(R.id.tv_item_two);
            tv_content_three = (TextView) itemView.findViewById(R.id.tv_content_three);
            tv_cinema_content = (TextView) itemView.findViewById(R.id.tv_cinema_content);
            tv_bigscore = (TextView) itemView.findViewById(R.id.tv_bigscore);
            //设置点击事件
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(onItemClickListener != null){
                        onItemClickListener.onItemClick(v,getLayoutPosition(),list.getMovies().get(getLayoutPosition()));
                    }
                }
            });

            //设置监听
            iv_item_pic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(onImageViewClickListener != null){
                        onImageViewClickListener.onImageViewClick(v,getLayoutPosition());
                    }
                }
            });

        }


    }


}
