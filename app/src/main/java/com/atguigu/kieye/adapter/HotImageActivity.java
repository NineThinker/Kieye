package com.atguigu.kieye.adapter;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.atguigu.kieye.R;

/**
 * 作者：张爽 on 2016/7/2 19:58
 * 邮箱：18330118276@163.com
 */
public class HotImageActivity extends Activity {
    private WebView webview;
    private String url;
    private WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);
        webview = (WebView) findViewById(R.id.webview);
        url = getIntent().getStringExtra("url");
//        url = "http://atguigu.com/teacher.shtml";
        webview.loadUrl(url);
        webSettings = webview.getSettings();
        //设置WebView支持javaScript
        webSettings.setJavaScriptEnabled(true);
    }
}
