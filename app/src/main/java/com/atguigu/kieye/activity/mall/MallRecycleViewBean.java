package com.atguigu.kieye.activity.mall;

import com.google.gson.Gson;

import java.util.List;

/**
 * 作者：张爽 on 2016/7/3 11:50
 * 邮箱：18330118276@163.com
 */
public class MallRecycleViewBean {


    /**
     * list : [{"dealid":38864588,"pic":"http://p1.meituan.net/348.348/movie/2e0e1666abb5e8f7e60d49c55f850768134851.jpg@60q","price":39.9,"shortTitle":"随行杯","title":"独立日电影纪念水壶 随行杯","value":79},{"dealid":38718782,"pic":"http://p1.meituan.net/348.348/movie/57e3a959183cc0250a00f0314ead8d6365916.jpg@60q","price":19.9,"shortTitle":" 钥匙扣","title":"海底总动员2 钥匙扣","value":29.9},{"dealid":38330819,"pic":"http://p0.meituan.net/348.348/movie/5355b30ef4c6c00bb7b52257c76d344494759.jpg@60q","price":39,"shortTitle":"","title":"魔兽 联盟3D眼镜","value":69},{"dealid":38839678,"pic":"http://p0.meituan.net/348.348/movie/2b8281bb4c928fb3fb692f4e6baebe4494007.jpg@60q","price":68,"shortTitle":"雨伞","title":"《我叫MT》正版限量 梦想守护者晴雨伞","value":138},{"dealid":38541178,"pic":"http://p1.meituan.net/348.348/movie/c7935c72cec2352dbefcafb42b3e402b155534.jpg@60q","price":27.9,"shortTitle":"","title":"魔兽 电影小说","value":32},{"dealid":38330818,"pic":"http://p0.meituan.net/348.348/movie/ec71dc9533a98f9a1045eeb252f517af23998.jpg@60q","price":39,"shortTitle":"","title":"魔兽 部落3D眼镜","value":69},{"dealid":38330814,"pic":"http://p1.meituan.net/348.348/movie/8df3fc916b3e3f9e78227291e8f8689f180730.jpg@60q","price":24.9,"shortTitle":"","title":"魔兽 徽章冰箱贴","value":49},{"dealid":38210633,"pic":"http://p0.meituan.net/348.348/movie/88bff909e0e492e207cc9cc8a6e99f7f202518.jpg@60q","price":199,"shortTitle":"","title":"魔兽 联盟T恤短袖","value":299},{"dealid":38925956,"pic":"http://p0.meituan.net/348.348/movie/b1494811d9a328916e18b07bc900b2de120474.jpg@60q","price":59,"shortTitle":"尼莫公仔 12寸","title":"海底总动员2》尼莫 毛绒玩具 12寸","value":70.8},{"dealid":39181163,"pic":"http://p1.meituan.net/348.348/movie/4000cc509a0f5439bca7245ee51e018d154563.jpg@60q","price":29,"shortTitle":"6/6p手机壳","title":"《摇滚藏獒》大电影系列正版手机壳","value":59}]
     * total : 891
     */

    private DataBean data;

    public static MallRecycleViewBean objectFromData(String str) {

        return new Gson().fromJson(str, MallRecycleViewBean.class);
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private float total;
        /**
         * dealid : 38864588
         * pic : http://p1.meituan.net/348.348/movie/2e0e1666abb5e8f7e60d49c55f850768134851.jpg@60q
         * price : 39.9
         * shortTitle : 随行杯
         * title : 独立日电影纪念水壶 随行杯
         * value : 79
         */

        private List<ListBean> list;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public float getTotal() {
            return total;
        }

        public void setTotal(float total) {
            this.total = total;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {

            private int id;
            private String pic;
            private double price;
            private String shortTitle;
            private String title;
            private float value;

            public static ListBean objectFromData(String str) {

                return new Gson().fromJson(str, ListBean.class);
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public String getShortTitle() {
                return shortTitle;
            }

            public void setShortTitle(String shortTitle) {
                this.shortTitle = shortTitle;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public float getValue() {
                return value;
            }

            public void setValue(float value) {
                this.value = value;
            }
        }
    }
}
