package com.atguigu.kieye.pagers.oversea_pagers;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.widget.TextView;

import com.atguigu.kieye.base.BasePager;

/**
 * 作者：张爽 on 2016/6/27 20:03
 * 邮箱：18330118276@163.com
 */
public class JPOverseaPager extends BasePager {

    public JPOverseaPager(Context context) {
        super(context);
    }

    @Override
    public void initData() {
        Log.e("TAG", "JPOverseaPager页面被初始化了.....");
        TextView textView = new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setText(" JPOverseaPagerr页面的内容");
        textView.setTextSize(25);
        textView.setTextColor(Color.RED);
        //向帧布局中添加视图

////        fl_oversea_base.removeAllViews();
//        fl_oversea_base.addView(textView);
        fl_base_content.addView(textView);
    }
}
