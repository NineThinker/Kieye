package com.atguigu.kieye.pagers.oversea_pagers;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.widget.TextView;

import com.atguigu.kieye.base.BasePager;

/**
 * 作者：张爽 on 2016/6/27 20:02
 * 邮箱：18330118276@163.com
 */
public class KROverseaPager extends BasePager {

    public KROverseaPager(Context context) {
        super(context);
    }
    @Override
    public void initData() {
        Log.e("TAG", "KROverseaPager页面被初始化了.....");
        TextView textView = new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setText(" KROverseaPager页面的内容");
        textView.setTextSize(25);
        textView.setTextColor(Color.RED);
        //向帧布局中添加视图

////        fl_oversea_base.removeAllViews();
        fl_base_content.addView(textView);
    }
}
