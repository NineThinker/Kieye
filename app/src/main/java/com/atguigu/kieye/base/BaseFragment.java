package com.atguigu.kieye.base;

/**
 * 作者：张爽 on 2016/6/24 16:03
 * 邮箱：18330118276@163.com
 */

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作者：张爽 on 2016/6/21 22:37
 * 邮箱：18330118276@163.com
 * 要添加到FrameLayout中，实际上是与Activity相关联上？
 */
public abstract class BaseFragment extends Fragment {

    public Context context;
    //构造器需要传入什么东西吗？
//    public BaseFragment(Context context){this.context = context}
    //重写Fragment的方法
//    public BaseFragment(Context context, int position) {
//
//    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //为什么要进行下一句，不懂
        this.context = getActivity();//因为子类生成视图（View.inflate(context,R.layout.xx)）
        //getActivity()得到的是MainActiivity,soga......
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //创建显示视图view时回调此方法
        //子类实现此方法，初始化的视图在fragment上显示
        return initView();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //在Activity(前台显示控件)创建时，view中的数据也需要被显示出来
        //initData()的方法其实就是为控件对象赋值，然后才能显示
        initData();
    }

    //强制子类实现
    public abstract View initView();
    //子类初始化数据的时候调用
    public  void initData(){

    }


}
