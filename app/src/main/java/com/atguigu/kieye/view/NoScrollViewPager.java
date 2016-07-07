package com.atguigu.kieye.view;

/**
 * 作者：张爽 on 2016/6/25 10:06
 * 邮箱：18330118276@163.com
 * 定义不可以滑动的页面
 */

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;


public class NoScrollViewPager extends ViewPager {

    public NoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return true;
    }


    //
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }
}
