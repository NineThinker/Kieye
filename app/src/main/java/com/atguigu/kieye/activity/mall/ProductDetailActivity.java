package com.atguigu.kieye.activity.mall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.atguigu.kieye.R;
import com.atguigu.kieye.view.snapscrollview.McoyProductContentPage;
import com.atguigu.kieye.view.snapscrollview.McoyProductDetailInfoPage;
import com.atguigu.kieye.view.snapscrollview.McoySnapPageLayout;
import com.atguigu.kieye.utils.CartProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：张爽 on 2016/7/4 11:45
 * 邮箱：18330118276@163.com
 */
public class ProductDetailActivity extends  Activity {

    private McoySnapPageLayout mcoySnapPageLayout = null;

    private McoyProductContentPage bottomPage = null;
    private McoyProductDetailInfoPage topPage = null;
    private Button btn_purchse;
    private Button btn_addcart;

    private ViewPager vp_shangpin;
    private CartProvider cartProvider;
    private List<MallRecycleViewBean.DataBean.ListBean> datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        cartProvider = new CartProvider(this);
        datas = new ArrayList<>();


        btn_purchse = (Button)findViewById(R.id.btn_purchse);
        btn_addcart = (Button)findViewById(R.id.btn_addcart);

        btn_purchse.setOnClickListener(new MyButtonPurchseOnclickListener());
        btn_addcart.setOnClickListener(new MyButtonPurchseOnclickListener());

        mcoySnapPageLayout = (McoySnapPageLayout) findViewById(R.id.flipLayout);

        topPage = new McoyProductDetailInfoPage(ProductDetailActivity.this,
                getLayoutInflater().inflate(
                        R.layout.mcoy_produt_detail_layout, null),btn_addcart);

        //顶部轮播图

        bottomPage = new McoyProductContentPage(ProductDetailActivity.this,
                getLayoutInflater().inflate(
                        R.layout.mcoy_product_content_page, null));

        mcoySnapPageLayout.setSnapPages(topPage, bottomPage);

    }


    private class MyButtonPurchseOnclickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

           //把tv_price的价格添加到cartProvider中（即保存到本地）

            switch (v.getId()){

                case R.id.btn_purchse:
//                    Toast.makeText(ProductDetailActivity.this, "开启购物车Activity", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(ProductDetailActivity.this,ShopCartActivity.class));
                    break;

            }
        }
    }
}
