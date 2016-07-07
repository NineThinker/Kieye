package com.atguigu.kieye.base;

import android.content.Context;
import android.view.View;

/**
 * 作者：张爽 on 2016/6/24 18:49
 * 邮箱：18330118276@163.com
 */
public abstract class TestBasePager {
    public View rootView;//代表各个子页面
    public Context context;
    //这个是什么？


    //构造器
    public TestBasePager(Context context){
        this.context = context;
        rootView =  initView();

    }
    public abstract View initView();

    //当孩子需要填充数据的时候调用
    public void initData(){

    }


}
