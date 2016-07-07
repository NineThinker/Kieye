package com.atguigu.kieye.pagers;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;

import com.atguigu.kieye.R;
import com.atguigu.kieye.activity.FloatActivityDemo;
import com.atguigu.kieye.activity.mall.MallActivity;
import com.atguigu.kieye.base.BasePager;
import com.atguigu.kieye.view.MenuItemView;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

/**
 * 作者：张爽 on 2016/6/24 23:52
 * 邮箱：18330118276@163.com
 */
public class MinePager extends BasePager {

    private com.atguigu.kieye.view.MenuItemView minePost;
    private RelativeLayout rl_login;
    private View login;
    private MenuItemView mineCollection;

    public MinePager(Context context) {
        super(context);

    }

    @Override
    public void initData() {
        super.initData();
        basepager_titlebar.setVisibility(View.GONE);
//        toggleBotton.setVisibility(View.VISIBLE);
        System.out.println("我的页面的数据被初始化了....");

//        //设置标题
//        tv_title.setText("电影页");
//        //设置内容
//        TextView textView = new TextView(context);
//        textView.setGravity(Gravity.CENTER);
//        textView.setText(" 我的页面的内容");
//        textView.setTextSize(25);
//        textView.setTextColor(Color.RED);

        View view = View.inflate(context, R.layout.fragment_mine_layout,null);
        rl_login = (RelativeLayout)view.findViewById(R.id.rl_login);
        login = view.findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {

////                带你级开启
            @Override
                    public void onClick(View v) {
//                    Toast.makeText(context,"开启一个Fragment.......",Toast.LENGTH_SHORT).
//
//            show();

            Intent intent = new Intent(context, FloatActivityDemo.class);
            context.startActivity(intent);



        }

//             }       private AlertDialog dlg = null;
//
//                    Button mCancelBtn = null;
//                    Button mClearAllBtn = null;
//
//                    @Override
//                    public void onClick(View v) {
//                        this.dlg = new AlertDialog.Builder(context)
//                                .create();
//                        View localView =  View.inflate(context, R.layout.clearpan, null);
//                        localView.setAnimation(AnimationUtils.loadAnimation(
//                                context, R.anim.slide_bottom_to_top));
//                        Window localWindow = this.dlg.getWindow();
//                        localWindow.getAttributes();
//                        this.dlg.show();
//                        localWindow.setContentView(localView);
//                        localWindow.setGravity(Gravity.BOTTOM);
//                        localWindow.setLayout(-1, 280);
//                        this.mClearAllBtn = ((Button) this.dlg
//                                .findViewById(R.id.clearall));
//                        this.mCancelBtn = ((Button) this.dlg
//                                .findViewById(R.id.cancel));
//                        this.mClearAllBtn.setOnClickListener(new View.OnClickListener() {
//                            public void onClick(View paramView) {
////                                finish();
//                                Toast.makeText(context, "vmClearAllBtn", Toast.LENGTH_SHORT).show();
//                            }
//                        });
//
//                        this.mCancelBtn.setOnClickListener(new View.OnClickListener() {
//                            public void onClick(View paramView) {
//                                dlg.cancel();
//                            }
//                        });
//                    }

                });




        minePost = (MenuItemView)view.findViewById(R.id.minePost);

        //给minepost设置点击，跳转到商城页面
        minePost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MallActivity.class);
                context.startActivity(intent);
            }
        });


        mineCollection=(MenuItemView)view.findViewById(R.id.mineCollection);

        mineCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showShare();
            }
        });




        //把子视图添加到FrameLayout中
        fl_base_content.addView(view);
    }


    private void showShare() {
        ShareSDK.initSDK(context);
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();

// 分享时Notification的图标和文字  2.5.9以后的版本不调用此方法
        //oks.setNotification(R.drawable.ic_launcher, getString(R.string.app_name));
        // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间使用
        oks.setTitle("kieye");
        // titleUrl是标题的网络链接，仅在人人网和QQ空间使用
        oks.setTitleUrl("http://sharesdk.cn");
        // text是分享文本，所有平台都需要这个字段
        oks.setText("hello----nine");
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
        //oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
        // url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl("http://sharesdk.cn");
        // comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("hello----nice");
        // site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite("kieye---nine");
        // siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl("http://weibo.com/u/5336336722/home?wvr=5");

// 启动分享GUI
        oks.show(context);
    }


}
