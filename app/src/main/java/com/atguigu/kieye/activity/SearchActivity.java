package com.atguigu.kieye.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.atguigu.kieye.R;

/**
 * 作者：张爽 on 2016/6/30 22:02
 * 邮箱：18330118276@163.com
 */
public class SearchActivity extends Activity {

    //一个取消的button,点击后finish();
    public TextView tv_cancel;

    //一个editText设置监听，搜索

    //给rv_type填充数据
    public RecyclerView rv_type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        rv_type = (RecyclerView)findViewById(R.id.rv_type);

        tv_cancel = (TextView)findViewById(R.id.tv_cancel);
        tv_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击取消，销毁此页面
                finish();
            }
        });

        //联网动态获取数据？
        GridLayoutManager manager = new GridLayoutManager(this,3);
        rv_type.setLayoutManager(manager);

    }
}
