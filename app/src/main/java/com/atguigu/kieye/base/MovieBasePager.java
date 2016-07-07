package com.atguigu.kieye.base;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.atguigu.kieye.R;
import com.atguigu.kieye.activity.SearchActivity;

/**
 * 作者：张爽 on 2016/6/25 15:36
 * 邮箱：18330118276@163.com
 */
public class MovieBasePager    {
    public android.support.v4.app.FragmentManager manager;
    public View rootView;//代表各个子页面
    public Context context;
    //这个是什么？
    public FrameLayout fl_movie_base_content;

    public AppBarLayout red_white_sousuokuang;
    public Toolbar toolbar_movie_base;
    public ProgressBar pb_movie_base;

    public RelativeLayout rl_movie_base_sosuokuang;
    public TextView tv_search_movie_base;
    //构造器
    public MovieBasePager(Context context){
        this.context = context;
        rootView =  initView();

    }
    private View initView(){

        View view = View.inflate(context, R.layout.movie_base_pager,null);
        fl_movie_base_content = (FrameLayout) view.findViewById(R.id.fl_movie_base_content);
        red_white_sousuokuang = (AppBarLayout) view.findViewById(R.id.red_white_sousuokuang);
        toolbar_movie_base = (Toolbar) view.findViewById(R.id.toolbar_movie_base);
        rl_movie_base_sosuokuang = (RelativeLayout) view.findViewById(R.id.rl_movie_base_sosuokuang);
        fl_movie_base_content.setVisibility(View.VISIBLE);
        tv_search_movie_base = (TextView) view.findViewById(R.id.tv_search_movie_base);
        pb_movie_base = (ProgressBar) view.findViewById(R.id.pb_movie_base);
        tv_search_movie_base.setOnClickListener(new MyOnclickListener());



//
        return view;

    }

    //当孩子需要填充数据的时候调用
    public void initData(){


    }
    public class MyOnclickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            //在Activity之间传递数据
            context.startActivity(new Intent(context,SearchActivity.class));
            Log.e("TAG", "StartSearchActivity........");
//            Toast.makeText(context, "StartSearchActivity........", Toast.LENGTH_SHORT).show();
        }
    }

}
