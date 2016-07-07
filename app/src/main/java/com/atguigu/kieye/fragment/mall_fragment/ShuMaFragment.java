package com.atguigu.kieye.fragment.mall_fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.atguigu.kieye.R;

/**
 * 作者：张爽 on 2016/7/3 21:33
 * 邮箱：18330118276@163.com
 */
public   class ShuMaFragment extends Fragment {

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

        View view = inflater.inflate(R.layout.shuma_fragment, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //在Activity(前台显示控件)创建时，view中的数据也需要被显示出来
        //initData()的方法其实就是为控件对象赋值，然后才能显示




    }




}
