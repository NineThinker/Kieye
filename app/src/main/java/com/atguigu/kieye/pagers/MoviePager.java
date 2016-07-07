package com.atguigu.kieye.pagers;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.atguigu.kieye.activity.CitySelecterActivity;
import com.atguigu.kieye.base.BasePager;
import com.atguigu.kieye.base.MovieBasePager;
import com.atguigu.kieye.interfaces.DandyPagerChangeListener;
import com.atguigu.kieye.pagers.movie_pagers.HotPager;
import com.atguigu.kieye.pagers.movie_pagers.OverseaPager;
import com.atguigu.kieye.pagers.movie_pagers.WaitPager;
import com.atguigu.kieye.utils.CacheUtils;
import com.atguigu.kieye.view.TitleTabBar;
import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.BDNotifyListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.location.Poi;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：张爽 on 2016/6/24 23:52
 * 邮箱：18330118276@163.com
 * BasePager上面自带的titleBar
 * + FrameLayout(动态向其中添加三个ViewPager：hot/wait/oversea)
 */
public class MoviePager extends BasePager implements TitleTabBar.TitleTabClickListener {

    public LocationClient mLocationClient = null;

    public BDLocationListener myListener = new MyLocationListener();
    private android.os.Vibrator mVibrator01;
    private NotifyLister mNotifyer;


    public ViewPager vp_movie;
    private ArrayList<MovieBasePager> movieBasePagers;
    private String city;


    public MoviePager(Context context) {
        super(context);

    }

    @Override
    public void initData() {
        super.initData();

        titleTabBar.setVisibility(View.VISIBLE);
        vp_movie = new ViewPager(context);
        //向viewpager中动态添加三个子页面
        //把子视图添加到FrameLayout中

        nav.setVisibility(View.VISIBLE);
//        //向fragment中添加数据
        movieBasePagers = new ArrayList();
        movieBasePagers.add(new HotPager(context));
        movieBasePagers.add(new WaitPager(context));
        movieBasePagers.add(new OverseaPager(context));
//        //把viewPager加进去
        vp_movie.setAdapter(new ContentFragmentAdapter());

        titleTabBar.setTitleTabClickListener(this);


        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG", "nav--------");
                Intent intent = new Intent(context, CitySelecterActivity.class);


                context.startActivity(intent);
//                Toast.makeText(context, "nav.....", Toast.LENGTH_SHORT).show();

                mLocationClient = new LocationClient(context.getApplicationContext());     //声明LocationClient类
                mLocationClient.registerLocationListener(myListener);    //注册监听函数
                initLocation();

                mLocationClient.start();
                //位置提醒相关代码
                mNotifyer = new NotifyLister();
                mNotifyer.SetNotifyLocation(42.03249652949337,113.3129895882556,3000,"gps");//4个参数代表要位置提醒的点的坐标，具体含义依次为：纬度，经度，距离范围，坐标系类型(gcj02,gps,bd09,bd09ll)
                mLocationClient.registerNotify(mNotifyer);
//注册位置提醒监听事件后，可以通过SetNotifyLocation 来修改位置提醒设置，修改后立刻生效。
//BDNotifyListner实现

//取消位置提醒
                Log.e("TAG", "citycity=====" + city);

                mLocationClient.removeNotifyEvent(mNotifyer);

            }
        });

        //

        //监听页面的改变
//        vp_movie.addOnPageChangeListener(new MyOnPageChangeListener());
        vp_movie.setOnPageChangeListener(new DandyPagerChangeListener(vp_movie,titleTabBar){
            @Override
            public void focusedFragment(int selectPosition, int lastPosition) {
                super.focusedFragment(selectPosition, lastPosition);

                titleTabBar.setTitleState(selectPosition);

                //初始化子viewpager要放在这里
                movieBasePagers.get(selectPosition).initData();
            }
        });
        movieBasePagers.get(0).initData();//默认加载首页

        Log.e("TAG", "fl_base_content.addView(vp_movie)......");
        fl_base_content.removeAllViews();
        fl_base_content.addView(vp_movie);
    }


    public class NotifyLister extends BDNotifyListener {
        public void onNotify(BDLocation mlocation, float distance){
            mVibrator01.vibrate(1000);//振动提醒已到设定位置附近
        }
    }

    private void initLocation(){
        LocationClientOption option = new LocationClientOption();
        option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy
        );//可选，默认高精度，设置定位模式，高精度，低功耗，仅设备
        option.setCoorType("bd09ll");//可选，默认gcj02，设置返回的定位结果坐标系
        int span=1000;
        option.setScanSpan(span);//可选，默认0，即仅定位一次，设置发起定位请求的间隔需要大于等于1000ms才是有效的
        option.setIsNeedAddress(true);//可选，设置是否需要地址信息，默认不需要
        option.setOpenGps(true);//可选，默认false,设置是否使用gps
        option.setLocationNotify(true);//可选，默认false，设置是否当gps有效时按照1S1次频率输出GPS结果
        option.setIsNeedLocationDescribe(true);//可选，默认false，设置是否需要位置语义化结果，可以在BDLocation.getLocationDescribe里得到，结果类似于“在北京天安门附近”
        option.setIsNeedLocationPoiList(true);//可选，默认false，设置是否需要POI结果，可以在BDLocation.getPoiList里得到
        option.setIgnoreKillProcess(false);//可选，默认true，定位SDK内部是一个SERVICE，并放到了独立进程，设置是否在stop的时候杀死这个进程，默认不杀死
        option.SetIgnoreCacheException(true);//可选，默认false，设置是否收集CRASH信息，默认收集
        option.setEnableSimulateGps(false);//可选，默认false，设置是否需要过滤gps仿真结果，默认需要
        mLocationClient.setLocOption(option);
    }



    public   class MyLocationListener implements BDLocationListener {

        @Override
        public void onReceiveLocation(BDLocation location) {



            //Receive Location
            StringBuffer sb = new StringBuffer(256);
            sb.append("time : ");
            sb.append(location.getTime());
            sb.append("\nerror code : ");
            sb.append(location.getLocType());
            sb.append("\nlatitude : ");
            sb.append(location.getLatitude());
            sb.append("\nlontitude : ");
            sb.append(location.getLongitude());
            sb.append("\nradius : ");
            sb.append(location.getRadius());
            if (location.getLocType() == BDLocation.TypeGpsLocation){// GPS定位结果
                sb.append("\nspeed : ");
                sb.append(location.getSpeed());// 单位：公里每小时
                sb.append("\nsatellite : ");
                sb.append(location.getSatelliteNumber());
                sb.append("\nheight : ");
                sb.append(location.getAltitude());// 单位：米
                sb.append("\ndirection : ");
                sb.append(location.getDirection());// 单位度
                sb.append("\naddr : ");
                sb.append(location.getAddrStr());
                sb.append("\ndescribe : ");
                sb.append("gps定位成功");
                sb.append(location.getLocationDescribe());

            } else if (location.getLocType() == BDLocation.TypeNetWorkLocation){// 网络定位结果
                sb.append("\naddr : ");
                sb.append(location.getAddrStr());
                //运营商信息
                sb.append("\noperationers : ");
                sb.append(location.getOperators());
                sb.append("\ndescribe : ");
                sb.append("网络定位成功");
            } else if (location.getLocType() == BDLocation.TypeOffLineLocation) {// 离线定位结果
                sb.append("\ndescribe : ");
                sb.append("离线定位成功，离线定位结果也是有效的");
            } else if (location.getLocType() == BDLocation.TypeServerError) {
                sb.append("\ndescribe : ");
                sb.append("服务端网络定位失败，可以反馈IMEI号和大体定位时间到loc-bugs@baidu.com，会有人追查原因");
            } else if (location.getLocType() == BDLocation.TypeNetWorkException) {
                sb.append("\ndescribe : ");
                sb.append("网络不同导致定位失败，请检查网络是否通畅");
            } else if (location.getLocType() == BDLocation.TypeCriteriaException) {
                sb.append("\ndescribe : ");
                sb.append("无法获取有效定位依据导致定位失败，一般是由于手机的原因，处于飞行模式下一般会造成这种结果，可以试着重启手机");
            }
            sb.append("\nlocationdescribe : ");
            sb.append(location.getLocationDescribe());// 位置语义化信息
            List<Poi> list = location.getPoiList();// POI数据
            if (list != null) {
                sb.append("\npoilist size = : ");
                sb.append(list.size());
                for (Poi p : list) {
                    sb.append("\npoi= : ");
                    sb.append(p.getId() + " " + p.getName() + " " + p.getRank());
                }
            }
            Log.i("BaiduLocationApiDem", sb.toString());

            String ss = location.getLocationDescribe();

          city = location.getCity();

            Log.e("TAG", "city======"+city);
            Log.e("TAG", "ss======"+ss);
            nav.setText(city);
            CacheUtils.putString(context, "city", city);

        }
    }






























    @Override
    public void callback(int index) {
        vp_movie.setCurrentItem(index);

    }


    class ContentFragmentAdapter extends PagerAdapter {
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            MovieBasePager movieBasePager = movieBasePagers.get(position);
            View view = movieBasePager.rootView;
            container.addView(view);
            //我的妈呀，这块写错了什么都显示不出来
            return view;

        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public int getCount() {
            return movieBasePagers.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }
    }


}
