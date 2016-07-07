package com.atguigu.kieye.pagers;

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
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.kieye.activity.BoxActivity;
import com.atguigu.kieye.activity.MainActivity;
import com.atguigu.kieye.activity.MessActivity;
import com.atguigu.kieye.R;
import com.atguigu.kieye.activity.TopicActivity;
import com.atguigu.kieye.base.BasePager;
import com.atguigu.kieye.bean.CinemaHeaderBean;
import com.atguigu.kieye.bean.FindPagerBean;
import com.atguigu.kieye.utils.CacheUtils;
import com.atguigu.kieye.utils.DividerListItemDecoration;
import com.atguigu.kieye.utils.Url;
import com.atguigu.kieye.utils.widget.BaseRecyclerAdapter;
import com.atguigu.kieye.utils.widget.WrapAdapter;
import com.atguigu.kieye.view.HorizontalScrollViewPager;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

/**
 * 作者：张爽 on 2016/6/24 23:52
 * 邮箱：18330118276@163.com
 * 发现页：头部（headView）：viewpager(轮播)+radioGroup(线性布局)
 *       下面（recycleView）分类型
 */
public class FindPager extends BasePager {

    //还有一个自定义的PrograssBar(自定义啊自定义)
    public ProgressBar pb_cinema;//然后：联网请求道数据后消失
    public RecyclerView recycleView_find;
    public RadioGroup rg_find;

    //adapter
    private RvCinemaAdapter adapter;
    private WrapAdapter<RvCinemaAdapter> mWrapAdapter;

    //头部是viewpager还要设置是配，向里面动态添加数据
    private HorizontalScrollViewPager vp_head;
    public CinemaHeaderBean topnews;
    private MyCinemaHeadPagerAdapter headAdapter;
    private View headView;
    private String urlTop;
    private String rv_url;

    private ProgressBar pb_find;
    //recyclerView的数据集合（联网获取）
    private List<FindPagerBean.DataBean.FeedsBean> list;


    public FindPager(Context context) {
        super(context);

    }

    @Override
    public void initData() {
        super.initData();
        titleTabBar.setVisibility(View.GONE);
        ib_title_filter.setVisibility(View.GONE);
        ib_title_search.setVisibility(View.GONE);
        tv_title.setVisibility(View.VISIBLE);
        tv_title.setText("发现");

        System.out.println("发现页的数据被初始化了....");

        View view = View.inflate(context, R.layout.find_pager, null);

        pb_cinema = (ProgressBar) view.findViewById(R.id.pb_cinema);
        recycleView_find = (RecyclerView) view.findViewById(R.id.recycleView_find);
        pb_find = (ProgressBar) view.findViewById(R.id.pb_find);

        //给recycleView_cinema添加头部？
        // 添加头布局
        headView = View.inflate(context, R.layout.radio_head_view, null);
        x.view().inject(this, headView);
        vp_head = (HorizontalScrollViewPager) headView.findViewById(R.id.vp_head);
        rg_find = (RadioGroup) headView.findViewById(R.id.rg_find);

        rg_find.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.topic :

                        //跳转到新闻浏览页面
                        Intent intent1 = new Intent(context,TopicActivity.class);
                        intent1.putExtra("url",Url.topicUrl);
                        context.startActivity(intent1);
                        break;
                    case R.id.mess:
                        Intent intent2 = new Intent(context,MessActivity.class);
                        intent2.putExtra("url",Url.messUrl);
                        context.startActivity(intent2);
                        break;
                    case R.id.movielib:
//                        Intent intent3 = new Intent(context,MovielibActivity.class);
//                        intent3.putExtra("url",Url.movielibUrl);
//                        context.startActivity(intent3);

                        Toast.makeText(context, "点击了预告片.......", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.box:
                        Intent intent = new Intent(context,BoxActivity.class);
                        intent.putExtra("url",Url.boxUrl);
                        context.startActivity(intent);
                        break;
                }
            }
        });







        //此处联网请求数据可否？
          urlTop = Url.cinemaAdUrl;
        String saveJson = CacheUtils.getString(context, urlTop);
        if (!TextUtils.isEmpty(saveJson)) {
            processData(saveJson);
        }
        getDataFromNet(urlTop);

          rv_url = Url.find_rv_url;
        String saveJson_rv = CacheUtils.getString(context, rv_url);
        if (!TextUtils.isEmpty(saveJson_rv)) {
            processRvData(saveJson_rv);
        }
        getDataFromNet(rv_url);




        //把子视图添加到FrameLayout中
        //之前要移除视图
        fl_base_content.removeAllViews();
        fl_base_content.addView(view);


    }

    private void processRvData(String saveJson_rv) {
      FindPagerBean findPagerBean  = new Gson().fromJson(saveJson_rv, FindPagerBean.class);
        Log.e("TAG", "解析成功---" + findPagerBean.getData().getFeeds().toString());
        list = findPagerBean.getData().getFeeds();
        //向recycleView中添加数据（还要分类型，添加item）
        //设置布局管理器
        LinearLayoutManager layout = new LinearLayoutManager(context);
        recycleView_find.setLayoutManager(layout);

        //recycleView设置adapter
        adapter = new RvCinemaAdapter(context);
//        recycleView_cinema.setAdapter(adapter);
        mWrapAdapter = new WrapAdapter<>(adapter);
        // 设置头部占据一行
        mWrapAdapter.adjustSpanSize(recycleView_find);
        // 设置RecyclerView的数据适配器(适配器包装)
        recycleView_find.setAdapter(mWrapAdapter);
        mWrapAdapter.addHeaderView(headView);
        //recycleView设置分割线
        //没有提供默认的分割线
        recycleView_find.addItemDecoration(new DividerListItemDecoration(context, DividerListItemDecoration.VERTICAL_LIST));


    }


    class MyCinemaHeadPagerAdapter extends PagerAdapter {


        @Override
        public Object instantiateItem(ViewGroup container, int position) {


            ImageView imageView = new ImageView(context);
//        imageView.setImageResource(R.drawable.home_scroll_default);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            container.addView(imageView);

            List<CinemaHeaderBean.DataEntity> topnewsEntity = topnews.getData();
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


        if(url==urlTop){
        RequestParams params = new RequestParams(url);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.e("TAG", "-----MyCinemaHeadPagerAdapter-----联网请求成功！-------");
                CacheUtils.putString(context, urlTop, result);//缓存数据
                processData(result);

                ( (MainActivity)(context)).runOnUiThread(new Runnable() {

                    @Override

                    public void run() {
                        pb_find.setVisibility(View.GONE);
                    }

                });




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
        if(url == rv_url){
            RequestParams params = new RequestParams(url);
            x.http().get(params, new Callback.CommonCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    Log.e("TAG", "-----rv_url-----联网请求成功！-------");
                    CacheUtils.putString(context, rv_url, result);//缓存数据
                    processRvData(result);
                }

                @Override
                public void onError(Throwable ex, boolean isOnCallback) {

                    Log.e("TAG", "-----rv_url-----联网请求失败！-------");
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

    //解析数据
    private CinemaHeaderBean parseJson(String json) {
        CinemaHeaderBean cinemaHeaderBean = new Gson().fromJson(json, CinemaHeaderBean.class);
        return cinemaHeaderBean;
    }

    //显示数据
    private void processData(String json) {
        //
        CinemaHeaderBean tabDetailPagerBean = parseJson(json);
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


    // recycleView(find)的adapter
    class RvCinemaAdapter extends BaseRecyclerAdapter {

        public RvCinemaAdapter(Context context) {
            super(context);
        }


        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //viewtype分类型的值 （getItemViewType返回的类型值）
            if (viewType==4){

                View view = LayoutInflater.from(context).inflate(R.layout.find_four_item,parent,false);

                return new MyFourHolder(view);
            }
            if (viewType==7){

                View view = LayoutInflater.from(context).inflate(R.layout.find_seven_item,parent,false);

                return new MysevenHolder(view);
            }
            if (viewType==2){

                View view = LayoutInflater.from(context).inflate(R.layout.find_two_item,parent,false);

                return new MyTwoHolder(view);
            }


                View view = LayoutInflater.from(context).inflate(R.layout.find_eight_item,parent,false);

                return new MyEightHolder(view);

        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {

            if(list.get(position).getFeedType()==4){

                //绑定数据
                ((MyFourHolder)holder).tv_commentcount.setText(""+list.get(position).getCommentCount());
                ((MyFourHolder)holder).tv_title.setText(list.get(position).getTitle());
                ((MyFourHolder)holder).tv_viewcount.setText(""+list.get(position).getViewCount());
                ((MyFourHolder)holder).tv_nickname.setText(list.get(position).getUser().getNickName());
                Glide.with(context).load(list.get(position).getImages().get(0).getUrl()).into(((MyFourHolder) holder).iv_icon);

                return;
            }
            if(list.get(position).getFeedType()==7){
                //绑定数据
                ((MysevenHolder)holder).tv_commentcount.setText(""+list.get(position).getCommentCount());
                ((MysevenHolder)holder).tv_title.setText(list.get(position).getTitle());
                ((MysevenHolder)holder).tv_viewcount.setText(""+list.get(position).getViewCount());
                ((MysevenHolder)holder).tv_nickname.setText(list.get(position).getUser().getNickName());
                Glide.with(context).load(list.get(position).getImages().get(0).getUrl()).into(((MysevenHolder) holder).iv_icon);

                return;
            }
            if(list.get(position).getFeedType()==2){

                ((MyTwoHolder)holder).tv_commentcount.setText(""+list.get(position).getCommentCount());
                ((MyTwoHolder)holder).tv_title.setText(list.get(position).getTitle());
                ((MyTwoHolder)holder).tv_viewcount.setText(""+list.get(position).getViewCount());
                ((MyTwoHolder)holder).tv_nickname.setText(list.get(position).getUser().getNickName());
                Glide.with(context).load(list.get(position).getImages().get(0).getUrl()).into(((MyTwoHolder) holder).iv_left);
                Glide.with(context).load(list.get(position).getImages().get(1).getUrl()).into(((MyTwoHolder) holder).iv_middle);
                Glide.with(context).load(list.get(position).getImages().get(2).getUrl()).into(((MyTwoHolder) holder).iv_right);

                return;
            }

//            ((MyEightHolder)(holder)).
            ((MyEightHolder)holder).tv_commentcount.setText(""+list.get(position).getCommentCount());
            ((MyEightHolder)holder).tv_title.setText(list.get(position).getTitle());
            ((MyEightHolder)holder).tv_viewcount.setText(""+list.get(position).getViewCount());
            ((MyEightHolder)holder).tv_nickname.setText(list.get(position).getUser().getNickName());
            Glide.with(context).load(list.get(position).getImages().get(0).getUrl()).into(((MyEightHolder) holder).iv_left);
            Glide.with(context).load(list.get(position).getImages().get(1).getUrl()).into(((MyEightHolder) holder).iv_middle);
            Glide.with(context).load(list.get(position).getImages().get(2).getUrl()).into(((MyEightHolder) holder).iv_right);

        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        //用来实现分类型
        @Override
        public int getItemViewType(int position) {
            //如果加了header，position的是否+1?(答案是：NO!!!!)
            if (list.get(position).getFeedType()==4){
                return 4;
            }
            if (list.get(position).getFeedType()==7){
                return 7;
            }
            if (list.get(position).getFeedType()==2){
                return 2;
            }
            return 8;
        }


        class MyFourHolder extends RecyclerView.ViewHolder {

            private ImageView iv_icon;
            private TextView tv_title ;
            private TextView tv_nickname;
            private TextView tv_commentcount;
            private TextView tv_viewcount;
            public MyFourHolder(View itemView) {
                super(itemView);
                iv_icon = (ImageView) itemView.findViewById(R.id.iv_icon);
                tv_title = (TextView) itemView.findViewById(R.id.tv_title);
                tv_nickname = (TextView) itemView.findViewById(R.id.tv_nickname);
                tv_commentcount = (TextView) itemView.findViewById(R.id.tv_commentcount);
                tv_viewcount = (TextView) itemView.findViewById(R.id.tv_viewcount);
            }
        }


        class MysevenHolder extends RecyclerView.ViewHolder {
            private ImageView iv_icon;
            private TextView tv_title ;
            private TextView tv_nickname;
            private TextView tv_commentcount;
            private TextView tv_viewcount;
            public MysevenHolder(View itemView) {
                super(itemView);
                iv_icon = (ImageView) itemView.findViewById(R.id.iv_icon);
                tv_title = (TextView) itemView.findViewById(R.id.tv_title);
                tv_nickname = (TextView) itemView.findViewById(R.id.tv_nickname);
                tv_commentcount = (TextView) itemView.findViewById(R.id.tv_commentcount);
                tv_viewcount = (TextView) itemView.findViewById(R.id.tv_viewcount);
            }
        }


        class MyTwoHolder extends RecyclerView.ViewHolder {


            private ImageView iv_left;
            private ImageView iv_middle;
            private ImageView iv_right;
            private ImageView iv_icon;
            private TextView tv_title ;
            private TextView tv_nickname;
            private TextView tv_commentcount;
            private TextView tv_viewcount;
            public MyTwoHolder(View itemView) {
                super(itemView);
                iv_icon = (ImageView) itemView.findViewById(R.id.iv_icon);
                iv_left = (ImageView) itemView.findViewById(R.id.iv_left);
                iv_middle = (ImageView) itemView.findViewById(R.id.iv_middle);
                iv_right = (ImageView) itemView.findViewById(R.id.iv_right);
                tv_title = (TextView) itemView.findViewById(R.id.tv_title);
                tv_nickname = (TextView) itemView.findViewById(R.id.tv_nickname);
                tv_commentcount = (TextView) itemView.findViewById(R.id.tv_commentcount);
                tv_viewcount = (TextView) itemView.findViewById(R.id.tv_viewcount);


            }
        }


        class MyEightHolder extends RecyclerView.ViewHolder {

            private ImageView iv_left;
            private ImageView iv_middle;
            private ImageView iv_right;
            private ImageView iv_icon;
            private TextView tv_title ;
            private TextView tv_nickname;
            private TextView tv_commentcount;
            private TextView tv_viewcount;
            public MyEightHolder(View itemView) {
                super(itemView);
                iv_icon = (ImageView) itemView.findViewById(R.id.iv_icon);
                iv_left = (ImageView) itemView.findViewById(R.id.iv_left);
                iv_middle = (ImageView) itemView.findViewById(R.id.iv_middle);
                iv_right = (ImageView) itemView.findViewById(R.id.iv_right);
                tv_title = (TextView) itemView.findViewById(R.id.tv_title);
                tv_nickname = (TextView) itemView.findViewById(R.id.tv_nickname);
                tv_commentcount = (TextView) itemView.findViewById(R.id.tv_commentcount);
                tv_viewcount = (TextView) itemView.findViewById(R.id.tv_viewcount);
            }
        }




    }


}
