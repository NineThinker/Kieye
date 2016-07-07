package com.atguigu.kieye.pagers.movie_pagers;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.atguigu.kieye.activity.HotItemActivity;
import com.atguigu.kieye.R;
import com.atguigu.kieye.activity.MainActivity;
import com.atguigu.kieye.adapter.RvHotAdapter;
import com.atguigu.kieye.base.MovieBasePager;
import com.atguigu.kieye.bean.HotHeaderBean;
import com.atguigu.kieye.bean.HotPagerBeam;
import com.atguigu.kieye.utils.CacheUtils;
import com.atguigu.kieye.utils.DividerListItemDecoration;
import com.atguigu.kieye.utils.Url;
import com.atguigu.kieye.utils.widget.WrapAdapter;
import com.atguigu.kieye.view.HorizontalScrollViewPager;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

/**
 * 作者：张爽 on 2016/6/25 14:53
 * 邮箱：18330118276@163.com
 * 头部有一个滚动的viewPager
 */
public class HotPager extends MovieBasePager {

    public ProgressBar pb_hot;//然后：联网请求道数据后消失
    public RecyclerView recycleView_hot;
    //手指一按下(down--move)，就消失，up再次出现
    public RelativeLayout rl_locationInfo;

    //recyclerView的数据集合（联网获取）
    private HotPagerBeam.DataBean list;
    //adapter
    private RvHotAdapter adapter;
    private WrapAdapter<RvHotAdapter> mWrapAdapter;

    //头部是viewpager还要设置是配，向里面动态添加数据
    private HorizontalScrollViewPager vp_head;
    public HotHeaderBean topnews;
    private MyHotHeadPagerAdapter headAdapter;
    private String urlTop;
    private String urlitem;
    private View headView;


    public HotPager(Context context) {
        super(context);

    }

    @Override
    public void initData() {
        super.initData();

        red_white_sousuokuang.setVisibility(View.VISIBLE);
//        red_white_sousuokuang



        System.out.println("hot页的数据被初始化了....");


        View view = View.inflate(context, R.layout.hotpager, null);

        pb_hot = (ProgressBar) view.findViewById(R.id.pb_hot);
        recycleView_hot = (RecyclerView) view.findViewById(R.id.recycleView_hot);

        //给recycleView_cinema添加头部？
        // 添加头布局
        headView = View.inflate(context, R.layout.headview, null);
        x.view().inject(this, headView);
        vp_head = (HorizontalScrollViewPager) headView.findViewById(R.id.vp_head);



        urlitem = Url.hotUrl;
        //取出缓存的数据
        String saveJsonItem = CacheUtils.getString(context, urlitem);
        if (!TextUtils.isEmpty(saveJsonItem)) {
            processItemData(saveJsonItem);
        }
        getDataFromNet(urlitem);
//        getDataByVolley(urlitem);

        Log.e("TAG", "urlitem======"+urlitem);

        urlTop = Url.hotAdUrl;
        //取出缓存的数据
        String saveJson = CacheUtils.getString(context, urlTop);
        if (!TextUtils.isEmpty(saveJson)) {
            processData(saveJson);
        }

        getDataFromNet(urlTop);
//        getDataByVolley(urlTop);
        Log.e("TAG", "urlTop=======" + urlTop);


        //把子视图添加到FrameLayout中
        //之前要移除视图
        fl_movie_base_content.removeAllViews();
        fl_movie_base_content.addView(view);

    }





    class MyHotHeadPagerAdapter extends PagerAdapter {




        @Override
        public Object instantiateItem(ViewGroup container, int position) {


            ImageView imageView = new ImageView(context);
//        imageView.setImageResource(R.drawable.home_scroll_default);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            container.addView(imageView);

            List<HotHeaderBean.DataEntity> topnewsEntity = topnews.getData();
            //联网请求数据

            x.image().bind(imageView, (topnewsEntity.get(position).getBigImgTypeUrl()));


//        Log.e("TAG", "topnewsEntity.getTopimage())=======" + (topnewsEntity.getImgUrl()));

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


//        RequestParams params= new RequestParams(url);
//        RequestParams params2 = new RequestParams(urlitem);

         if(url.equals(urlTop)){
             Log.e("TAG", "urltop==="+urlTop);
             RequestParams params= new RequestParams(urlTop);
             x.http().get(params, new Callback.CommonCallback<String>() {
                 @Override
                 public void onSuccess(String result) {
                     Log.e("TAG", "-----MyCinemaHeadPagerAdapter-----联网请求成功！-------");
                     CacheUtils.putString(context, Url.hotAdUrl, result);//缓存数据
                     processData(result);

                     ( (MainActivity)(context)).runOnUiThread(new Runnable() {

                         @Override

                         public void run() {
                             pb_movie_base.setVisibility(View.GONE);
                         }

                     });



                 }

                 @Override
                 public void onError(Throwable ex, boolean isOnCallback) {

                     Log.e("TAG", "-----MyCinemaHeadPagerAdapter-----联网请求失败！-------");
                 }

                 @Override
                 public void onCancelled(CancelledException cex) {
                     Log.e("TAG", "-----MyCinemaHeadPagerAdapter----------"+cex.getMessage());

                 }

                 @Override
                 public void onFinished() {

                 }
             });
         }


if(url.equals(urlitem)){
    Log.e("TAG", "urltop==="+urlitem);
    RequestParams params= new RequestParams(urlitem);
    x.http().get(params, new Callback.CommonCallback<String>() {
        @Override
        public void onSuccess(String result) {
            Log.e("TAG", "-----params2-----联网请求成功！-------");
            CacheUtils.putString(context, Url.hotUrl, result);//缓存数据
            processItemData(result);

        }

        @Override
        public void onError(Throwable ex, boolean isOnCallback) {

            Log.e("TAG", "-----params2-----联网请求失败！-------");
        }

        @Override
        public void onCancelled(CancelledException cex) {
            Log.e("TAG", "-----MyCinemaHeadPagerAdapter--------"+cex.getMessage());

        }

        @Override
        public void onFinished() {

        }
    });

}

    }

    private void processItemData(String result) {
        //
        HotPagerBeam hotPagerBeam =  parseJsonItem(result);
        list = hotPagerBeam.getData();
        //向recycleView中添加数据（还要分类型，添加item）
        //设置布局管理器
        LinearLayoutManager layout = new LinearLayoutManager(context);

        recycleView_hot.setLayoutManager(layout);
        //recycleView设置adapter
        adapter = new RvHotAdapter(context,list);
        mWrapAdapter = new WrapAdapter<>(adapter);
        // 设置头部占据一行
        mWrapAdapter.adjustSpanSize(recycleView_hot);
        // 设置RecyclerView的数据适配器(适配器包装)
        recycleView_hot.setAdapter(mWrapAdapter);

       //此处联网请求数据可否？
        mWrapAdapter.addHeaderView(headView);
        //recycleView设置分割线
        //没有提供默认的分割线
        recycleView_hot.addItemDecoration(new DividerListItemDecoration(context, DividerListItemDecoration.VERTICAL_LIST));
        //设置点击item的点击事件

//设置点击item的点击事件
        adapter.setOnItemClickListener(new RvHotAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, HotPagerBeam.DataBean.MoviesBean content) {
//                Toast.makeText(context, "你点击了item----", Toast.LENGTH_SHORT).show();

                //跳转到新闻浏览页面
                Intent intent1 = new Intent(context,HotItemActivity.class);
                int id = list.getMovies().get(position).getId();
                intent1.putExtra("url",Url.hotitemurl.replace("00000",id+""));
                context.startActivity(intent1);


            }

        });

        //设置点击某张图片的点击事件
        adapter.setOnImageViewClickListener(new RvHotAdapter.OnImageViewClickListener() {
            @Override
            public void onImageViewClick(View view, int position) {
                Toast.makeText(context, "position=="+position+",view=="+view.toString(), Toast.LENGTH_SHORT).show();
            }
        });





    }

   private HotPagerBeam parseJsonItem(String json){
        HotPagerBeam hotPagerBeam = new Gson().fromJson(json, HotPagerBeam.class);

        return hotPagerBeam;
//       return null;
    }

    //解析数据
    private HotHeaderBean parseJson(String json) {
       HotHeaderBean hotHeaderBean = new Gson().fromJson(json, HotHeaderBean.class);
        return hotHeaderBean;
    }


    //显示数据
    private void processData(String json) {
        //
        HotHeaderBean tabDetailPagerBean =  parseJson(json);
        Log.e("TAG", "解析成功---" + tabDetailPagerBean.getData().get(0).getImgUrl());
        topnews = tabDetailPagerBean;

        headAdapter = new MyHotHeadPagerAdapter();
        vp_head.setAdapter(headAdapter);

        //监听viewpager,根据页面改变点的高亮
        vp_head.addOnPageChangeListener(new MyOnPagerChangeListener());

        //设置请求到的图片的轮播显示
        if(internalHandler == null){
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
            int item = (vp_head.getCurrentItem()+1)%topnews.getData().size();
            vp_head.setCurrentItem(item);
            //重新做任务
            internalHandler.postDelayed(new MyRunnable(),3000);

        }
    }


    private class MyRunnable implements Runnable {
        @Override
        public void run() {
            internalHandler.sendEmptyMessage(0);

        }
    }


    private Boolean isDragging = false;//
    private class MyOnPagerChangeListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {
            if(state == ViewPager.SCROLL_STATE_DRAGGING){//如果处于拖拽的状态
                Log.e("TAG", " SCROLL_STATE_DRAGGING--------->移除消息");
                isDragging = true;

                internalHandler.removeCallbacksAndMessages(null);

            }else if(state == ViewPager.SCROLL_STATE_IDLE && isDragging){//如果处于空闲状态
                Log.e("TAG", " SCROLL_STATE_IDLE--------->发消息");
                isDragging = false;
                internalHandler.removeCallbacksAndMessages(null);
                internalHandler.postDelayed(new MyRunnable(),3000);
            }else if(state == ViewPager.SCROLL_STATE_SETTLING && isDragging ){//处于按下状态？
                Log.e("TAG", " SCROLL_STATE_SETTLING--------->发消息");
                isDragging = false;
                internalHandler.removeCallbacksAndMessages(null);
                internalHandler.postDelayed(new MyRunnable(),3000);

            }



        }
    }





//
}
