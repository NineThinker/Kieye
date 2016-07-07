package com.atguigu.kieye.bean;

import com.atguigu.kieye.activity.mall.MallRecycleViewBean;

/**
 * 作者：张爽 on 2016/6/15 21:57
 * 邮箱：18330118276@163.com
 * 作用：购物车类
 * 某条数据在购物车中的状态，用于要买多少个，是否选中状态等等?
 */


    //继承从网络端获取并解析到的类
public class ShoppingCart extends MallRecycleViewBean.DataBean.ListBean {

    private int count = 1;
    private boolean isCheck = true;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setIsCheck(boolean isCheck) {
        this.isCheck = isCheck;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "count=" + count +
                ", isCheck=" + isCheck +
                '}';
    }

}
