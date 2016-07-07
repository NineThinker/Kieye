package com.atguigu.kieye.pagers;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.atguigu.kieye.R;
import com.atguigu.kieye.activity.MainActivity;
import com.atguigu.kieye.base.BasePager;
import com.atguigu.kieye.bean.CinemaHeaderBean;
import com.atguigu.kieye.bean.LocateBean;
import com.atguigu.kieye.bean.waitbean.CinnmaBeanT;
import com.atguigu.kieye.utils.CacheUtils;
import com.atguigu.kieye.utils.Distance;
import com.atguigu.kieye.utils.DividerListItemDecoration;
import com.atguigu.kieye.utils.Url;
import com.atguigu.kieye.utils.widget.BaseRecyclerAdapter;
import com.atguigu.kieye.utils.widget.WrapAdapter;
import com.atguigu.kieye.view.HorizontalScrollViewPager;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 作者：张爽 on 2016/6/24 23:52
 * 邮箱：18330118276@163.com
 */
public class CinemaPager extends BasePager {

    private   String locationinfor;
    //还有一个自定义的PrograssBar
    public ProgressBar pb_cinema;//然后：联网请求道数据后消失
    public RecyclerView recycleView_cinema;
    //手指一按下(down--move)，就消失，up再次出现
    public TextView tv_locationInfor;

    //recyclerView的数据集合（联网获取）
    private ArrayList list;
    //adapter
    private RvCinemaAdapter adapter;
    private WrapAdapter<RvCinemaAdapter> mWrapAdapter;

    //头部是viewpager还要设置是配，向里面动态添加数据
    private HorizontalScrollViewPager vp_head;
    public CinemaHeaderBean topnews;
    private MyCinemaHeadPagerAdapter headAdapter;
    private RelativeLayout rl_locationInfo;
    private String locateUrl;
    private String cinemaUrl;
    private String district;
    private List<CinnmaBeanT.DataBean.朝阳区Bean> data;
    private View headView;
    private LocateBean locateBean;


    public CinemaPager(Context context) {
        super(context);

    }

    @Override
    public void initData() {
        super.initData();


        //什么时候把prograssbar消除，联网请求成功后，在主线程消失  runOnUIThread()
        nav.setVisibility(View.GONE);
        titleTabBar.setVisibility(View.GONE);
        ib_title_filter.setVisibility(View.VISIBLE);
        ib_title_search.setVisibility(View.VISIBLE);
        tv_title.setVisibility(View.VISIBLE);
        tv_title.setText("影院");

        System.out.println("影院页的数据被初始化了....");

        View view = View.inflate(context, R.layout.cinemapager, null);

        pb_cinema = (ProgressBar) view.findViewById(R.id.pb_cinema);
        recycleView_cinema = (RecyclerView) view.findViewById(R.id.recycleView_cinema);
        rl_locationInfo = (RelativeLayout) view.findViewById(R.id.rl_locationInfo);

        tv_locationInfor = (TextView) view.findViewById(R.id.tv_locationInfor);
         headView = View.inflate(context, R.layout.headview, null);
        x.view().inject(this, headView);

        vp_head = (HorizontalScrollViewPager) headView.findViewById(R.id.vp_head);
        //此处联网请求数据可否？
        String urlTop = Url.cinemaAdUrl;

        getDataFromNet(urlTop);
        locateUrl="http://api.meituan.com/group/v1/city/latlng/40.100168,116.379677?tag=0&__vhost=api.mobile.meituan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6901&utm_source=xiaomi&utm_medium=android&utm_term=6.9.0&utm_content=867515025248252&ci=1&net=255&dModel=Redmi%20Note%202&uuid=6EB9FAAFA10A6C010EBB1A7B00F74A501A378CDE3EBF6261A49B9727ECF79B4D&lat=40.100168&lng=116.379677&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1466660891503&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=62d6ceed-3363-4657-b44c-360020ba3fa6&__skcy=hdKur%2FrsWbF0B085kZFa%2FLMiSrU%3D";
        getDataFromNet(locateUrl);

        cinemaUrl=Url.CinemaUrl;
        getDataFromNet(cinemaUrl);

        fl_base_content.removeAllViews();
        fl_base_content.addView(view);


    }


    class MyCinemaHeadPagerAdapter extends PagerAdapter {

        @Override
        public Object instantiateItem(ViewGroup container, int position) {

            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            container.addView(imageView);

            List<CinemaHeaderBean.DataEntity> topnewsEntity = topnews.getData();
            x.image().bind(imageView, (topnewsEntity.get(position).getBigImgTypeUrl()));


            //给ImageView视图设置触摸事件的监听？
            imageView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {

                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            internalHandler.removeCallbacksAndMessages(null);
                            break;
                        case MotionEvent.ACTION_UP:
                            internalHandler.postDelayed(new MyRunnable(), 3000);
                    }
                    return true;
                }
            });

            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public int getCount() {

//            Log.e("TAG", "topnews.getData().size()===="+topnews.getData().size());
            return topnews.getData().size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();

        }

    }

    //联网获取数据
    public void getDataFromNet(String url) {

        if(url==cinemaUrl){
            RequestParams params = new RequestParams(url);
            x.http().get(params, new Callback.CommonCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    Log.e("TAG", "-----cinemaUrl-----联网请求成功！-------");
                    CacheUtils.putString(context, cinemaUrl, result);//缓存数据
                    Log.e("TAG", "result===="+result.toString());
                    processCinemaData(result);

                }


                @Override
                public void onError(Throwable ex, boolean isOnCallback) {

                    Log.e("TAG", "-----cinemaUrl-----联网请求失败！-------"+ex.getMessage());
                }

                @Override
                public void onCancelled(CancelledException cex) {

                }

                @Override
                public void onFinished() {

                }
            });
        }

        if(url == locateUrl){
            RequestParams params = new RequestParams(url);
            x.http().get(params, new Callback.CommonCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    Log.e("TAG", "-----locateUrl-----联网请求成功！-------");
                    CacheUtils.putString(context, locateUrl, result);//缓存数据
                    processLocateData(result);
                    ( (MainActivity)(context)).runOnUiThread(new Runnable() {

                        @Override

                        public void run() {


                            pb_cinema.setVisibility(View.GONE);
                        }

                    });




                }


                @Override
                public void onError(Throwable ex, boolean isOnCallback) {

                    Log.e("TAG", "-----locateUrl-----联网请求失败！-------");
                }

                @Override
                public void onCancelled(CancelledException cex) {

                }

                @Override
                public void onFinished() {

                }
            });
        }
        if(url == Url.cinemaAdUrl){

            RequestParams params = new RequestParams(url);
            x.http().get(params, new Callback.CommonCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    Log.e("TAG", "-----MyCinemaHeadPagerAdapter-----联网请求成功！-------");
                    CacheUtils.putString(context, Url.cinemaAdUrl, result);//缓存数据
                    processData(result);
                }

                @Override
                public void onError(Throwable ex, boolean isOnCallback) {

                    Log.e("TAG", "-----MyCinemaHeadPagerAdapter-----联网请求失败！-------");
                }

                @Override
                public void onCancelled(CancelledException cex) {

                }

                @Override
                public void onFinished() {

                }
            });
        }
    }

    private void processCinemaData(String result) {
        Log.e("TAG", "processCinemaData=====");
        CinnmaBeanT cinemaBean = new Gson().fromJson(result,CinnmaBeanT.class);
        //district == "昌平区"
//        tv_locationInfor.setText(district);
        data =cinemaBean.getData().get朝阳区() ;
        Log.e("TAG", "data====="+data.toString());
        Log.e("TAG", "data.get(0).getAddr()========="+data.get(0).getAddr());
        LinearLayoutManager layout = new LinearLayoutManager(context);
        recycleView_cinema.setLayoutManager(layout);

        //recycleView设置adapter
        adapter = new RvCinemaAdapter(context);
//        recycleView_cinema.setAdapter(adapter);
        mWrapAdapter = new WrapAdapter<>(adapter);
        // 设置头部占据一行
        mWrapAdapter.adjustSpanSize(recycleView_cinema);
        // 设置RecyclerView的数据适配器(适配器包装)
        recycleView_cinema.setAdapter(mWrapAdapter);

        mWrapAdapter.addHeaderView(headView);

        //recycleView设置分割线
        //没有提供默认的分割线
        recycleView_cinema.addItemDecoration(new DividerListItemDecoration(context, DividerListItemDecoration.VERTICAL_LIST));


    }

    private void processLocateData(String result) {
         locateBean = new Gson().fromJson(result, LocateBean.class);
        //得到哪个区
        district = locateBean.getData().getDistrict();
        Log.e("TAG", "district========"+district);
        locationinfor = locateBean.getData().getDetail();
        Log.e("TAG", "locationinfor======="+locationinfor);
        tv_locationInfor.setText(locationinfor);

    }


    //显示数据
    private void processData(String json) {
        Log.e("TAG", "json===="+json.toString());
        //
        CinemaHeaderBean tabDetailPagerBean = new Gson().fromJson(json, CinemaHeaderBean.class);
        Log.e("TAG", "解析成功---" + tabDetailPagerBean.getData().get(0).getImgUrl());
        topnews = tabDetailPagerBean;

        headAdapter = new MyCinemaHeadPagerAdapter();
        vp_head.setAdapter(headAdapter);

        //监听viewpager,根据页面改变点的高亮
        vp_head.addOnPageChangeListener(new MyOnPagerChangeListener());

        //设置请求到的图片的轮播显示
        if (internalHandler == null) {
            internalHandler = new InternalHandler();
        }
        internalHandler.removeCallbacksAndMessages(null);

        internalHandler.postDelayed(new MyRunnable(), 3000);


    }


    private InternalHandler internalHandler;

    class InternalHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            //防止下拉刷新，数据更改后，程序会死的问题
//            pageAdapter.notifyDataSetChanged();
            int item = (vp_head.getCurrentItem() + 1) % topnews.getData().size();
            vp_head.setCurrentItem(item);
            //重新做任务
            internalHandler.postDelayed(new MyRunnable(), 3000);

        }
    }


    private class MyRunnable implements Runnable {
        @Override
        public void run() {
            internalHandler.sendEmptyMessage(0);

        }
    }


    private Boolean isDragging = false;//

    //页面改变，红点的状态以及tv_title的内容要做相应的变化
    private class MyOnPagerChangeListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


//            prePosition = position;

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {
            if (state == ViewPager.SCROLL_STATE_DRAGGING) {//如果处于拖拽的状态
                Log.e("TAG", " SCROLL_STATE_DRAGGING--------->移除消息");
                isDragging = true;

                internalHandler.removeCallbacksAndMessages(null);

            } else if (state == ViewPager.SCROLL_STATE_IDLE && isDragging) {//如果处于空闲状态
                Log.e("TAG", " SCROLL_STATE_IDLE--------->发消息");
                isDragging = false;
                internalHandler.removeCallbacksAndMessages(null);
                internalHandler.postDelayed(new MyRunnable(), 3000);
            } else if (state == ViewPager.SCROLL_STATE_SETTLING && isDragging) {//处于按下状态？
                Log.e("TAG", " SCROLL_STATE_SETTLING--------->发消息");
                isDragging = false;
                internalHandler.removeCallbacksAndMessages(null);
                internalHandler.postDelayed(new MyRunnable(), 3000);

            }


        }
    }

    // recycleView(cinema)的adapter
    class RvCinemaAdapter extends BaseRecyclerAdapter {


        public RvCinemaAdapter(Context context) {
            super(context);
        }

        public RvCinemaAdapter(Context mContext, LinkedList mItemLists) {
            super(mContext, mItemLists);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_cinema, parent, false);
            return new MyHolder(view);
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {


            ((MyHolder) holder).textView.setText(data.get(position).getAddr());
            ((MyHolder) holder).textView2.setText(data.get(position).getSellPrice()+"");
            ((MyHolder) holder).textView3.setText(data.get(position).getNm());
             double s= Distance.getDistance(locateBean.getData().getLng(), locateBean.getData().getLat(), data.get(position).getLng(), data.get(position).getLat());
            Log.e("TAG", "s====="+s);
            ((MyHolder) holder).length.setText(""+(int)s/1000+"km");



        }

        @Override
        public int getItemCount() {


            //tmd  tmd  tmd  !!!!!!!
            return data.size();
        }

        //用来实现分类型
        @Override
        public int getItemViewType(int position) {
            //如果加了header，position的是否+1？
//
//            if (position==0){
//                return 0;
//            }
//            return 1;

            return super.getItemViewType(position);
        }

//
//        class MyHolder extends RecyclerView.ViewHolder{
//
//            private TextView tv;
//
//            public MyHolder(View itemView) {
//                super(itemView);
//                tv = (TextView) itemView.findViewById(R.id.tv);
//            }
//
//            public void setData(String data) {
//                tv.setText(data);
//            }
//        }
//        class HeadHolder extends RecyclerView.ViewHolder{
//
//            private TextView tv;
//
//            public HeadHolder(View itemView) {
//                super(itemView);
//
//            }
//
//        }


        class MyHolder extends RecyclerView.ViewHolder {


            private TextView textView3;
            private TextView textView;
            private TextView textView2;
            private TextView length;



            public MyHolder(View itemView) {
                super(itemView);

                textView3 = (TextView) itemView.findViewById(R.id.textView3);
                textView = (TextView) itemView.findViewById(R.id.textView);
                textView2 = (TextView) itemView.findViewById(R.id.textView2);
                length = (TextView) itemView.findViewById(R.id.length);

            }
        }


    }


}
