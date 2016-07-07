package com.atguigu.kieye.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.atguigu.kieye.R;

/**
 * 作者：张爽 on 2016/6/27 19:57
 * 邮箱：18330118276@163.com
 *
 *上面是第三方框架：浅灰色条
 *
 * 下面是recyclerView(分类型)
 */
public class OverseaBasePager {
    public View rootView;//代表各个子页面
    public Context context;
    public LinearLayout ll_oversea_base;
    public RecyclerView rv_oversea_base;

    public OverseaBasePager(Context context){
        this.context = context;
        rootView =  initView();

    }

   private View initView() {
        View view =   View.inflate(context, R.layout.overseabase, null);
//        fl_oversea_base = (FrameLayout) view.findViewById(R.id.fl_oversea_base);
//       x.view().inject(this,fl_oversea_base);
       rv_oversea_base = (RecyclerView) view.findViewById(R.id.rv_oversea_base);
        return view;
    }
    //当孩子需要填充数据的时候调用
    public void initData(){

    }

}
