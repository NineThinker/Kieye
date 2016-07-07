package com.atguigu.kieye.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.atguigu.kieye.R;
import com.atguigu.kieye.bean.PosterBean;
import com.atguigu.kieye.utils.BitmapUtils;
import com.atguigu.kieye.utils.CacheUtils;
import com.atguigu.kieye.utils.Url;
import com.atguigu.kieye.volley.VolleyManager;
import com.google.gson.Gson;

import java.io.FileNotFoundException;

public class SplashActivity extends Activity {
    private ImageView splash_bg;
    //联网获取的海报图片
    private ImageView poster;
    private Handler handler = new Handler();
    //没有网的情况下时间变长？
    private long delayTime = 2*10;
    private String picUrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //显示2s然后获取网络图片
        splash_bg = (ImageView)findViewById(R.id.splash_bg);
        poster = (ImageView)findViewById(R.id.poster);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //首先欢迎图片消失
                splash_bg.setVisibility(View.GONE);
                //查看本地是否已经保存了poster
                Bitmap poster = CacheUtils.getBitmap(SplashActivity.this, picUrl);
                if(poster != null){
                    showPoster(poster);
                }
                //联网获取欢迎界面的图片(or没网直接进入MainActivity)
                getDataFromNet();//Volley联网请求获取数据
                //CacheUtils把联网获取的图片保存到本地

            }
        }, delayTime);

    }

    //从网络动态获取欢迎界面的显示图片
    private void getDataFromNet() {
        StringRequest request = new StringRequest(Request.Method.GET, Url.SplashUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {

                Log.e("TAG", "联网请求成功！");
                //使用gson解析数据得到海报的连接地址
                PosterBean posterBean = new Gson().fromJson(s, PosterBean.class);
                Log.e("TAG", "posterBean======"+posterBean.toString());
                Log.e("TAG", "getPosters======"+posterBean.getPosters());//[]
                if(!posterBean.getPosters().toString().equals("[]")) {

                    picUrl = posterBean.getPosters().get(0).getPic();

                    Log.e("TAG", "pic======" + picUrl);
                    //获取到网络图片
                    new Thread() {
                        public void run() {
                            final Bitmap bitmap = BitmapUtils.getHttpBitmap(picUrl);
                            //从网络端获取的图片保存到本地
                            try {
                                CacheUtils.putBitmap(SplashActivity.this,bitmap,"picUrl");
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    //显示网络海报
                                    showPoster(bitmap);
                                }
                            });
                        }
                    }.start();
                }else {
                    Log.e("TAG", "联网成功，但poster唔知...");
                    startMainActivity();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("TAG", "请求数据失败-onErrorResponse=="+volleyError.getMessage());
                startMainActivity();
            }
        });
        VolleyManager.getRequestQueue().add(request);
    }

    //开启MainActivity,关闭此页面
    private void startMainActivity() {
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }


    private void showPoster(Bitmap bitmap) {

        poster.setImageBitmap(bitmap);
        poster.setVisibility(View.VISIBLE);
        startAnimation();//启动动画
    }

    private void startAnimation() {

        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.1f, 0.5f, 1.1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(10);
        //保持最后的状态
        scaleAnimation.setFillAfter(true);
        poster.startAnimation(scaleAnimation);
        //监听动画完成
        scaleAnimation.setAnimationListener(new MyAnimationListener());
    }

    class MyAnimationListener implements Animation.AnimationListener {

        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            //动画结束后开启MainActivity
            startMainActivity();
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    }
}




















