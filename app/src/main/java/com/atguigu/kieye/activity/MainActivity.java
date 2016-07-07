package com.atguigu.kieye.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.WindowManager;

import com.atguigu.kieye.R;
import com.atguigu.kieye.fragment.ContentFragment;

/**
 * 作者：张爽 on 2016/6/23 22:29
 * 邮箱：18330118276@163.com
 * 1布局：FrameLayout+RadioGroup
 * 《1》向FrameLayout中动态添加Fragment
 * 《2》给下面的RadioGroup添加监听，点击RadioButtion切换页面
 */
public class MainActivity extends FragmentActivity{
    private FragmentManager fragmentManager;
    public WindowManager windowManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          windowManager = getWindowManager();


        //把fragment添加到FrameLayout中（getSupportManager?）
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.fl_content, new ContentFragment());
        ft.commit();
    }


}
