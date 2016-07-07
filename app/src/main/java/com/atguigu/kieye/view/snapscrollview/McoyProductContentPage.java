package com.atguigu.kieye.view.snapscrollview;

import android.content.Context;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.atguigu.kieye.R;

public class McoyProductContentPage implements McoySnapPageLayout.McoySnapPage {

	private final WebView webview;
	private final WebSettings webSettings;
	private Context context;

	private View rootView = null;

	public McoyProductContentPage(Context context,View rootView) {
		this.context = context;
		this.rootView = rootView;

		webview = (WebView)rootView.findViewById(R.id.webview);
//		url = getIntent().getStringExtra("url");
//        url = "http://atguigu.com/teacher.shtml";
		webview.loadUrl("http://m.maoyan.com/store/topicDetail/300000056?_v_=yes&f=android&userid=-1&pushToken=8568be797789152f60d193cec511b9d2c01ebd1e6da38efbd62611e87b213090103b4d6d4a8cb7a6cd70f822f26ffff9&cityId=1");
		webSettings = webview.getSettings();
		//设置WebView支持javaScript
		webSettings.setJavaScriptEnabled(true);


	}

	@Override
	public View getRootView() {




		return rootView;
	}

	@Override
	public boolean isAtTop() {
		return true;
	}

	@Override
	public boolean isAtBottom() {
		return false;
	}

}
