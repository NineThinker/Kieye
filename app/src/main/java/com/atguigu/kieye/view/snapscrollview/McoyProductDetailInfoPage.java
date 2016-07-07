package com.atguigu.kieye.view.snapscrollview;


import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.atguigu.kieye.R;
import com.atguigu.kieye.activity.mall.MallRecycleViewBean;
import com.atguigu.kieye.bean.ShoppingCart;
import com.atguigu.kieye.utils.CartProvider;
import com.atguigu.kieye.utils.Url;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class McoyProductDetailInfoPage implements McoySnapPageLayout.McoySnapPage{

	private final ViewPager vp_shangpin;
	private final Button btn_addcart;
	private final CartProvider cartProvider;
	private Context context;
	private List<MallRecycleViewBean.DataBean.ListBean> datas ;
	
	private View rootView = null;
	private McoyScrollView mcoyScrollView = null;

	
	public McoyProductDetailInfoPage(final Context context, View rootView, Button btn_addcart) {
		this.context = context;
		this.rootView = rootView;
		this.btn_addcart = btn_addcart;
		cartProvider = new CartProvider(context);


		datas = new ArrayList<>();
		MallRecycleViewBean mallRecycleViewBean = new Gson().fromJson(Url.Json, MallRecycleViewBean.class);
		datas = mallRecycleViewBean.getData().getList();
		mcoyScrollView = (McoyScrollView) this.rootView
				.findViewById(R.id.product_scrollview);


		btn_addcart.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(context, "点击了加入购物车！！！", Toast.LENGTH_SHORT).show();

                            MallRecycleViewBean.DataBean.ListBean wares =  datas.get(9);
                            ShoppingCart cart = cartProvider.conversion(wares);
                            cartProvider.update(cart);

			}
		});

		vp_shangpin = (ViewPager)mcoyScrollView.findViewById(R.id.vp_shangpin);

	     vp_shangpin.setAdapter(new MyShanpinPagerAdapter());

		//监听viewpager,根据页面改变点的高亮
		vp_shangpin.addOnPageChangeListener(new MyOnPagerChangeListener());

		//设置请求到的图片的轮播显示
		if (internalHandler == null) {
			internalHandler = new InternalHandler();
		}
		internalHandler.removeCallbacksAndMessages(null);

		internalHandler.postDelayed(new MyRunnable(), 3000);

	}



	//显示数据
	class MyShanpinPagerAdapter extends PagerAdapter {


		@Override
		public Object instantiateItem(ViewGroup container, int position) {


			ImageView imageView = new ImageView(context);
//        imageView.setImageResource(R.drawable.home_scroll_default);
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			int[] ids=new int[]{R.drawable.fake,R.drawable.fake1,R.drawable.fake2,R.drawable.fake3};
			int num = (int)(Math.random()*4);
			imageView.setImageResource(ids[num]);
			container.addView(imageView);


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
			return 3;
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
	private InternalHandler internalHandler;

	class InternalHandler extends Handler {
		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);

			//防止下拉刷新，数据更改后，程序会死的问题
//            pageAdapter.notifyDataSetChanged();
			int item = (vp_shangpin.getCurrentItem() + 1) %3;
			vp_shangpin.setCurrentItem(item);
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
        int scrollY = mcoyScrollView.getScrollY();
        int height = mcoyScrollView.getHeight();
        int scrollViewMeasuredHeight = mcoyScrollView.getChildAt(0).getMeasuredHeight();

        if ((scrollY + height) >= scrollViewMeasuredHeight) {
            return true;
        }
        return false;
	}




}
