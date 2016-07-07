package com.atguigu.kieye.base;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.kieye.CaptureActivity;
import com.atguigu.kieye.R;
import com.atguigu.kieye.activity.SearchCinemaActivity;
import com.atguigu.kieye.view.TitleTabBar;

/**
 * 作者：张爽 on 2016/6/24 18:49
 * 邮箱：18330118276@163.com
 */
public abstract class BasePager {
    public View rootView;//代表各个子页面
    public Context context;
    //这个是什么？
    public FrameLayout fl_base_content;


    public View basepager_titlebar;
    public TextView nav;
    public TextView tv_title;
    public ImageButton ib_title_filter;
    public ImageButton ib_title_search;

////    public RadioGroup toggleBotton;//换成TitletabBar
//    public RadioButton rb_hot;
//    public RadioButton rb_wait;
//    public RadioButton rb_oversea;

    public TitleTabBar titleTabBar;
    private View contentView1;
    private PopupWindow popupWindow;

    //

    //构造器
    public BasePager(Context context){
        this.context = context;
        rootView =  initView();

    }
    private View initView(){
        View view = View.inflate(context, R.layout.base_pager,null);
        basepager_titlebar = view.findViewById(R.id.basepager_titlebar);
//        basepager_titlebar.setVisibility(View.GONE);
        fl_base_content = (FrameLayout) view.findViewById(R.id.fl_base_content);

        //用来电影页面 顶部的RadioGroup
        //一个问题，设置监听时，在哪设置？
        nav = (TextView) view.findViewById(R.id.nav);
        tv_title = (TextView) view.findViewById(R.id.tv_title);
        ib_title_search = (ImageButton) view.findViewById(R.id.ib_title_search);
        ib_title_filter = (ImageButton) view.findViewById(R.id.ib_title_filter);

        ib_title_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //带你级开启
                Toast.makeText(context, "开启一个Acti.......", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, CaptureActivity.class);
                context.startActivity(intent);

//
//                contentView1 = LayoutInflater.from(context).inflate(
//                        R.layout.pop_window, null);
//                popupWindow = new PopupWindow(contentView1
//                        , ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
//
//                popupWindow.setTouchable(true);
////
//                popupWindow.setTouchInterceptor(new View.OnTouchListener() {
//
//                    @Override
//                    public boolean onTouch(View v, MotionEvent event) {
//
//                        Log.i("mengdd", "onTouch : ");
//
//                        return false;
//                        // 这里如果返回true的话，touch事件将被拦截
//                        // 拦截后 PopupWindow的onTouchEvent不被调用，这样点击外部区域无法dismiss
//                    }
//                });
//
//
//
//                popupWindow.setBackgroundDrawable(context.getResources().getDrawable(
//                        R.drawable.fake));
//
//
//
//                popupWindow.showAsDropDown(ib_title_filter);
//
//


            }
        });

        ib_title_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,SearchCinemaActivity.class);
                context.startActivity(intent);
            }
        });




        titleTabBar = (TitleTabBar)view.findViewById(R.id.movie_topBar);
        return view;

    }

    //当孩子需要填充数据的时候调用
    public void initData(){


    }


}
