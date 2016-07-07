package com.atguigu.kieye;

import android.app.Application;
import android.content.Context;

import com.atguigu.kieye.db.DBManager;
import com.atguigu.kieye.volley.VolleyManager;

import org.xutils.x;

import cn.sharesdk.framework.ShareSDK;

/**
 * 作者：张爽 on 2016/6/23 23:40
 * 邮箱：18330118276@163.com
 */
public class MyApplication extends Application {

    private DBManager dbHelper;


    private Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
        VolleyManager.init(this);


        //导入数据库
        dbHelper = new DBManager(this);
        dbHelper.openDatabase();
//        dbHelper.closeDatabase();
        ShareSDK.initSDK(this);

    }



    //what?
    @Override
    public void onTerminate() {
        super.onTerminate();
            ShareSDK.stopSDK(this);
        }
    }
