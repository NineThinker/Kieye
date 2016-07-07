package com.atguigu.kieye.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.atguigu.kieye.R;
import com.atguigu.kieye.bean.waitbean.CinnmaBeanT;
import com.atguigu.kieye.utils.DividerListItemDecoration;
import com.atguigu.kieye.utils.Url;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

/**
 * 作者：张爽 on 2016/7/2 09:33
 * 邮箱：18330118276@163.com
 */
public class SearchCinemaActivity extends Activity {

    //一个取消的button,点击后finish();
    public TextView tv_cancel;

    //一个editText设置监听，搜索
    private EditText et_serach_cinema;
    //rv_search_content
    public RecyclerView rv_search_content;
    private ListView lv_search_history;
    private String keyWords;
    private String cinemaUrl;
    private List<CinnmaBeanT.DataBean.朝阳区Bean> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_cinema);
        et_serach_cinema = (EditText)findViewById(R.id.et_serach_cinema);
        rv_search_content = (RecyclerView)findViewById(R.id.rv_type);
        lv_search_history = (ListView)findViewById(R.id.lv_search_history);
        tv_cancel = (TextView)findViewById(R.id.tv_cancel);
        tv_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击取消，销毁此页面
                finish();
            }
        });


        cinemaUrl = Url.CinemaUrl;
//        String saveJson2 = CacheUtils.getString(this, cinemaUrl);
//        if (!TextUtils.isEmpty(saveJson2)) {
//            processCinemaData(saveJson2, keyWords);
//        }




        //一个editText设置监听，搜索影院
        et_serach_cinema = (EditText)findViewById(R.id.et_serach_cinema);

        getDataFromNet(cinemaUrl);

    }

    private void getDataFromNet(String url) {
        RequestParams params = new RequestParams(url);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.e("TAG", "-----sssscinemaUrl-----联网请求成功！-------");
                Log.e("TAG", "ssssssresult====" + result.toString());
                processCinemaData(result);
            }


            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

                Log.e("TAG", "-----sssssscinemaUrl-----联网请求失败！-------"+ex.getMessage());
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

    }


        private void processCinemaData(String result) {
            Log.e("TAG", "sssssprocessCinemaData=====");
            CinnmaBeanT cinemaBean = new Gson().fromJson(result,CinnmaBeanT.class);
            //district == "昌平区"
//        tv_locationInfor.setText(district);
            data =cinemaBean.getData().get朝阳区() ;

            Log.e("TAG", "sssssssdata=====" + data.toString());
            Log.e("TAG", "sssssssdata.get(0).getAddr()=========" + data.get(0).getAddr());
            LinearLayoutManager layout = new LinearLayoutManager(SearchCinemaActivity.this);
            rv_search_content.setLayoutManager(layout);
            //给recycleView填充数据
            rv_search_content.setAdapter(new Myadapter());
            //recycleView设置分割线
            //没有提供默认的分割线
            rv_search_content.addItemDecoration(new DividerListItemDecoration(SearchCinemaActivity.this, DividerListItemDecoration.VERTICAL_LIST));





        }


      class Myadapter extends RecyclerView.Adapter<MyHolder> {


          @Override
          public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
              View view = LayoutInflater.from(SearchCinemaActivity.this).inflate(R.layout.item_cinema, parent, false);
              Log.e("TAG", "view====="+view);
              return new MyHolder(view);
          }

          @Override
          public int getItemCount() {
              return data.size();
          }

          @Override
          public void onBindViewHolder(MyHolder holder, int position) {
              (  holder).textView.setText(data.get(position).getAddr());
              (   holder).textView2.setText(data.get(position).getSellPrice()+"");
              (  holder).textView3.setText(data.get(position).getNm());
//              double s= Distance.getDistance(locateBean.getData().getLng(), locateBean.getData().getLat(), data.get(position).getLng(), data.get(position).getLat());
//              Log.e("TAG", "s====="+s);
              (  holder).length.setText("4.7km");

          }


    }

    class MyHolder extends RecyclerView.ViewHolder  {

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
