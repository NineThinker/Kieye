package com.atguigu.kieye.interfaces;

import android.support.v4.view.ViewPager;

import com.atguigu.kieye.view.TitleTabBar;



public class DandyPagerChangeListener extends BaseOnPageChangeListener{
	
	public DandyPagerChangeListener(ViewPager pager,TitleTabBar tabBar) {
		super(pager, tabBar);
	}

	@Override
	public void moveNextFalse() {
		titleTabBar.scrollBar(beginPosition, endPosition, 100);
	}

	@Override
	public void moveing() {
		titleTabBar.scrollBar(beginPosition, endPosition, 0);
	}

	@Override
	public void moveNextTrue() {
		focusedFragment(currentFragmentIndex,lastFragmentIndex);
		titleTabBar.scrollBar(beginPosition, endPosition, 200);
	}
	
	public void focusedFragment(int selectPosition,int lastPosition){};
	
}
