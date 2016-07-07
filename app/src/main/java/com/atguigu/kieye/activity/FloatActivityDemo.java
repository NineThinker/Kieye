package com.atguigu.kieye.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;

import com.atguigu.kieye.R;
import com.mob.tools.utils.UIHandler;

import java.text.SimpleDateFormat;
import java.util.HashMap;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.tencent.qzone.QZone;
import cn.sharesdk.wechat.friends.Wechat;

/**
 * 作者：张爽 on 2016/7/3 22:23
 * 邮箱：18330118276@163.com
 */
public class FloatActivityDemo extends Activity implements View.OnClickListener, PlatformActionListener, Handler.Callback {

    private AlertDialog dlg;
    private ImageView qq;
    private ImageView qqzone;
    private ImageView weibo;
    private ImageView wechat;
    private static final int MSG_LOGIN = 2;
    private static final int MSG_USERID_FOUND = 1;
    private static final int MSG_AUTH_CANCEL = 3;
    private static final int MSG_AUTH_ERROR = 4;
    private static final int MSG_AUTH_COMPLETE = 5;
    private TelephonyManager tm;
    private String imi;
    private Platform platform11;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_float);

        qq = (ImageView)findViewById(R.id.qq);
        qqzone = (ImageView)findViewById(R.id.qzone);
        weibo = (ImageView)findViewById(R.id.weibo);
        wechat = (ImageView)findViewById(R.id.wechat);

        qq.setOnClickListener(this);
        qqzone.setOnClickListener(this);
        weibo.setOnClickListener(this);
        wechat.setOnClickListener(this);

// 若是第三方登陆的就取消授权
        Platform qq1 = ShareSDK.getPlatform(this, QQ.NAME);//此处可以设置对应的第三方平台名称来清理对应的信息
        if (qq1.isValid()) {
            qq1.removeAccount();
        }
        Platform weibo1 = ShareSDK.getPlatform(this, SinaWeibo.NAME);//此处可以设置对应的第三方平台名称来清理对应的信息
        if (weibo1.isValid()) {
            weibo1.removeAccount();
        }
        Platform weichat1 = ShareSDK.getPlatform(this, Wechat.NAME);//此处可以设置对应的第三方平台名称来清理对应的信息
        if (weichat1.isValid()) {
            weichat1.removeAccount();
        }

        Platform qzone1 = ShareSDK.getPlatform(this, QZone.NAME);//此处可以设置对应的第三方平台名称来清理对应的信息
        if (qzone1.isValid()) {
            qzone1.removeAccount();
        }




    }



    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.qq:

                Toast.makeText(FloatActivityDemo.this, "使用QQ进行第三方登录", Toast.LENGTH_SHORT).show();

                QLogin(qq);

                break;
            case R.id.qzone:
                QLogin(qqzone);
                break;
            case R.id.weibo:
                QLogin(weibo);
                break;
            case R.id.wechat:
                QLogin(wechat);

                Toast.makeText(FloatActivityDemo.this, "使用微信进行第三方登录", Toast.LENGTH_SHORT).show();

                break;
        }
    }


    private void authorize(Platform plat) {
        if (plat.isValid()) {
            String userId = plat.getDb().getUserId();
            if (!TextUtils.isEmpty(userId)) {
                UIHandler.sendEmptyMessage(MSG_USERID_FOUND, this);
                login(plat.getName(), userId, null);
                return;
            }
        }

        //若本地没有授权过就请求用户数据
        plat.setPlatformActionListener(this);//
        plat.SSOSetting(false);//此处设置为false，则在优先采用客户端授权的方法，设置true会采用网页方式
        plat.showUser(null);//获得用户数据

    }



    private void login(String plat, String userId, HashMap<String, Object> userInfo) {

        Message msg = new Message();
        msg.what = MSG_LOGIN;
        msg.obj = plat;
        UIHandler.sendMessage(msg, this);
    }


    @Override
    public void finish() {
        // TODO Auto-generated method stub
        super.finish();

        this.overridePendingTransition(R.anim.activity_close, 0);
    }


    @Override
    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {

    }

    @Override
    public void onError(Platform platform, int i, Throwable throwable) {

    }

    @Override
    public void onCancel(Platform platform, int i) {

    }

    @Override
    public boolean handleMessage(Message msg) {
        switch (msg.what) {
            case MSG_USERID_FOUND: {
//          Toast.makeText(getActivity(), R.string.userid_found, Toast.LENGTH_SHORT).show();
            }
            break;
            case MSG_LOGIN: {

//                String text = getString(R.string.logining, msg.obj);
//                Toast.makeText(FloatActivityDemo.this, text, Toast.LENGTH_SHORT).show();
//          System.out.println("---------------");

//                ProgressDialog loadDialog = DialogUtils.loginDialog(FloatActivityDemo.this, true, false);
//
//                loadDialog.show();

            }
            break;
            case MSG_AUTH_CANCEL: {
//                Toast.makeText(getActivity(), R.string.auth_cancel, Toast.LENGTH_SHORT).show();
//          System.out.println("-------MSG_AUTH_CANCEL--------");
            }
            break;
            case MSG_AUTH_ERROR: {
//                Toast.makeText(getActivity(), R.string.auth_error, Toast.LENGTH_SHORT).show();
//          System.out.println("-------MSG_AUTH_ERROR--------");
            }
            break;
            case MSG_AUTH_COMPLETE: {
//                Toast.makeText(getActivity(), R.string.auth_complete, Toast.LENGTH_SHORT).show();
//          System.out.println("--------MSG_AUTH_COMPLETE-------");
            }
            break;

        }
        return false;
    }







    public void QLogin(View v){
//添加授权

        String name;
        if(v==qq){

            name = QQ.NAME;
            platform11 = ShareSDK.getPlatform(name);

        }if(v==weibo){
            name = SinaWeibo.NAME;
            platform11 = ShareSDK.getPlatform(name);

        }if(v==qqzone){
            name = QZone.NAME;
            platform11 = ShareSDK.getPlatform(name);

        }if(v==wechat){
            name = Wechat.NAME;
            platform11 = ShareSDK.getPlatform(name);

        }
        //platform11.SSOSetting(true);
        platform11.authorize();
        platform11.showUser(null);//必须要加的要不然不行！这个才是授权的！
        tm = (TelephonyManager)  this.getSystemService(TELEPHONY_SERVICE);
        imi = tm.getDeviceId();
        platform11.setPlatformActionListener(new PlatformActionListener() {
            @Override
            public void onError(Platform platform11, int arg1, Throwable arg2) {
            //弹出失败窗口
            }
            @SuppressLint("SimpleDateFormat") @Override
            public void onComplete(Platform platform11, int arg1, HashMap<String, Object> arg2) {
                System.out.println("登录成功。。。。");
            //成功得到用户信息
                String userId = platform11.getDb().getUserId();
                String userName = platform11.getDb().getUserName();
                String token = platform11.getDb().getToken();
                String userIcon = platform11.getDb().getUserIcon();
            //有效时期
                long expiresTime = platform11.getDb().getExpiresTime();
                SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                System.out.println("用户ID为："+userId);
                System.out.println("用户名称为："+userName);
                System.out.println("token     "+token);
                System.out.println("expiresTime  "+sdf3.format(expiresTime));
            //HttpUties ht=new HttpUties();
            //ht.UplodePhotos(1+"", userId+"", userName+"", token+"", expiresTime+"", imi+"");
            }
            @Override
            public void onCancel(Platform arg0, int arg1) {

            }
        });
    }





}
