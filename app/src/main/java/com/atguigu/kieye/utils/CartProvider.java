package com.atguigu.kieye.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;

import com.atguigu.kieye.activity.mall.MallRecycleViewBean;
import com.atguigu.kieye.bean.ShoppingCart;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：张爽 on 2016/6/15 22:05
 * 邮箱：18330118276@163.com
 * 作用：用于存储所有的数据，对数据的曾删改查
 */
public class CartProvider {
    public static final String JSON_CART = "json_cart";
    private final Context context;
    /**
     * 性能比HashMap好，Android引入
     */
    private SparseArray<ShoppingCart> datas;//当前内存

    public CartProvider(Context context) {
        this.context = context;
        datas = new SparseArray<>(10);

        listToSparse();

    }

    /**
     * 把 List<ShoppingCart>的数据赋值到SparseArray<ShoppingCart>
     */
    private void listToSparse() {

        List<ShoppingCart> carts = getAllData();
        if (carts != null && carts.size() > 0) {
            for (int i = 0; i < carts.size(); i++) {
                ShoppingCart cart = carts.get(i);
                datas.put(cart.getId(), cart);
            }

        }
    }

    /**
     * 得到所有数据
     *
     * @return
     */
    public List<ShoppingCart> getAllData() {
        return getDataFromLocal();
    }

    /**
     * 从本地获取数据，并且解析，返回列表数据
     *
     * @return
     */
    private List<ShoppingCart> getDataFromLocal() {
        List<ShoppingCart> carts = new ArrayList<>();
        String json = CacheUtils.getString(context, JSON_CART);
        if (!TextUtils.isEmpty(json)) {
            //把json数据解析成列表List
            carts = new Gson().fromJson(json, new TypeToken<List<ShoppingCart>>() {
            }.getType());
        }
        return carts;
    }


    /**
     * 添加数据
     *
     * @param cart
     */
    public void addData(ShoppingCart cart) {
        //1.添加到当前内存中datas
        datas.put(cart.getId(), cart);

        //2.保持到本地中
        commit();
    }

    /**
     * 把内存的数据保存到本地
     * 把Spares转List
     * 把list 转string
     * 直接保存
     */
    private void commit() {
        List<ShoppingCart> carts = sparseToList();
        String json = new Gson().toJson(carts);//把List<ShoppingCart>-->String
        CacheUtils.putString(context, JSON_CART, json);
    }

    private List<ShoppingCart> sparseToList() {
        List<ShoppingCart> carts = new ArrayList<>();
        if (datas != null && datas.size() > 0) {
            for (int i = 0; i < datas.size(); i++) {
                //使用的方法是valueAt
                carts.add(datas.valueAt(i));
            }
        }
        return carts;
    }


    /**
     * 删除数据
     *
     * @param cart
     */
    public void delete(ShoppingCart cart) {
        //1.从当前内存中datas删除数据
        datas.delete(cart.getId());
        //2.保持到本地中
        commit();
    }

    /**
     * 修改数据
     *
     * @param cart
     */
    public void update(ShoppingCart cart) {
        //1.从当前内存中datas修改
        ShoppingCart temp = datas.get(cart.getId());
        if (temp != null) {
            temp.setCount(temp.getCount() + 1);
        } else {
            temp = cart;
            temp.setCount(1);
        }
        datas.put(temp.getId(), temp);


        //2.保持到本地中
        commit();
    }

    public ShoppingCart conversion(MallRecycleViewBean.DataBean.ListBean wares) {
        ShoppingCart cart = new ShoppingCart();
        cart.setId(wares.getId());
        cart.setTitle(wares.getTitle());
        cart.setPic(wares.getPic());
//        cart.setDescription(wares.setShortTitle());
        cart.setPrice(wares.getPrice());
        cart.setValue(wares.getValue());
//        cart.setCount(1);
        return cart;
    }

}
