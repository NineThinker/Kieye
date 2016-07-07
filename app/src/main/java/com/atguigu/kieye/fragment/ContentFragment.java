package com.atguigu.kieye.fragment;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.atguigu.kieye.R;
import com.atguigu.kieye.base.BaseFragment;
import com.atguigu.kieye.base.BasePager;
import com.atguigu.kieye.pagers.CinemaPager;
import com.atguigu.kieye.pagers.FindPager;
import com.atguigu.kieye.pagers.MinePager;
import com.atguigu.kieye.pagers.MoviePager;
import com.atguigu.kieye.view.NoScrollViewPager;

import org.xutils.x;

import java.util.ArrayList;


public class ContentFragment extends BaseFragment {

    private ArrayList<BasePager> basePagers;

    private RadioGroup rg_main;
    private NoScrollViewPager vp_content;
    private View devider_line;


    @Override
    public View initView() {
        View view = View.inflate(context, R.layout.content_fragment,null);
        x.view().inject(this,view);//把当前的视图通过xUtils3注入到ContentFragment
        rg_main = (RadioGroup) view.findViewById(R.id.rg_main);
        vp_content = (NoScrollViewPager) view.findViewById(R.id.vp_content);
        devider_line = view.findViewById(R.id.devider_line);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        Log.e("TAG", "content数据被初始化了...");

        rg_main.check(R.id.rb_movie);

        //向fragment中添加数据
        basePagers = new ArrayList();
        basePagers.add(new MoviePager(context));
        basePagers.add(new CinemaPager(context));
        basePagers.add(new FindPager(context));
        basePagers.add(new MinePager(context));

        //把viewPager加进去
        vp_content.setAdapter(new ContentFragmentAdapter());
        //RadioGroup状态的监听
        rg_main.setOnCheckedChangeListener(new MyOnCheckedChangeListener());
        //监听页面的改变
        vp_content.addOnPageChangeListener(new MyOnPageChangeListener());
        basePagers.get(0).initData();//默认加载首页

    }


     //得到电影页面
    public MoviePager getMoviePager() {
        return (MoviePager) basePagers.get(0);
    }
    //得到影院页面
    public CinemaPager getCinemaPager() {
        return (CinemaPager) basePagers.get(1);
    }
    //得到发现页面
    public FindPager getFindPager() {
        return (FindPager) basePagers.get(2);
    }
    //得到我的页面
    public MinePager getMinePager() {
        return (MinePager) basePagers.get(3);
    }





    //根据
    class MyOnPageChangeListener implements ViewPager.OnPageChangeListener{

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            basePagers.get(position).initData();
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }

    class MyOnCheckedChangeListener implements RadioGroup.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId){
                case R.id.rb_movie:

                    vp_content.setCurrentItem(0, false);
                    break;
                case R.id.rb_cinema:

                    vp_content.setCurrentItem(1, false);
                    break;
                case R.id.rb_find:
                    vp_content.setCurrentItem(2, false);
                    break;
                case R.id.rb_mine:
                    vp_content.setCurrentItem(3, false);
                    break;

            }
        }
    }



    class ContentFragmentAdapter extends PagerAdapter {
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            BasePager basePager = basePagers.get(position);
            View view = basePager.rootView;
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
            return basePagers.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }
    }
}
