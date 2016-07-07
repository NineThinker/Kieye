package com.atguigu.kieye.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 作者：张爽 on 2016/6/23 22:23
 * 邮箱：18330118276@163.com
 * 作用：缓存联网得到的数据到本地
 */
public class CacheUtils {


    //从网络端获取的图片保存到本地(poster)

    public static void putBitmap(Context context, Bitmap bitmap, String picName) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream(context.getFilesDir().toString() + "/" + picName);
        bitmap.compress(Bitmap.CompressFormat.PNG, 50, fos);
    }

   //获取本地保存的图片
    public static Bitmap getBitmap(Context context, String picName) {
        Bitmap bitmap = BitmapFactory.decodeFile(context.getFilesDir().toString() + "/" + picName);
        return bitmap;
    }


    /**
     * 保持String类型的数据
     * @param context
     * @param key
     * @param values
     */
    public static void putString(Context context, String key, String values) {
        SharedPreferences sp = context.getSharedPreferences("kieye",Context.MODE_PRIVATE);
        sp.edit().putString(key,values).commit();
    }

    /**
     * 得到缓存的数据
     * @param context
     * @param key
     * @return
     */
    public static String getString(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences("kieye",Context.MODE_PRIVATE);
        return sp.getString(key,"");
    }
}
