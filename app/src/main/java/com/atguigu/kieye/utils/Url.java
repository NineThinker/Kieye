package com.atguigu.kieye.utils;

/**
 * 作者：张爽 on 2016/6/23 22:13
 * 邮箱：18330118276@163.com
 * 作用：用来存储解析到的网址数据
 */
public class Url {
       /*
        欢迎界面的Url地址
         */
    public static String SplashUrl = "http://api.meituan.com/dianying/posters.json?city_id=1&poster_type=1&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=860311023305964&ci=1&net=255&dModel=MI%203&uuid=F096369352E4004DD3758BF83FE24AC312445F9B51AD3D8FCE2A0CD57754F6E4&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463656383990&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=09cbe8d3-3cb0-4e54-bc41-8f0b3387cdf2&__skcy=RbOZVh%2BK%2Bf86K3WlGJYg4ls7DIU%3D";

    /*
        (其实是电影hot页面顶部录播)影院主页广告轮播图地址
         */
    public static String cinemaAdUrl = "http://advert.mobile.meituan.com/api/v3/adverts?cityid=1&category=11&version=6.8.0&new=0&app=movie&clienttp=android&uuid=FCFAB9D8DD339645D629C8372A29A2C6AD16F9C9E87AF9AC0D656B29DD5AC6DE&devid=866641027400542&uid=&movieid=&partner=1&apptype=1&smId=&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=qq&utm_medium=android&utm_term=6.8.0&utm_content=866641027400542&ci=1&net=255&dModel=HM%20NOTE%201LTETD&lat=40.100855&lng=116.378273&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463730432992&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=01f9c5c0-eb56-4e19-92fb-b86b16ad79da&__skcy=5K8wRR%2FKYAZDTgmAzbhrXi%2FomzU%3D";
    /*
        (其实是电影hot页面顶部录播)影院主页广告轮播图地址
         */
    public static String hotAdUrl = "http://advert.mobile.meituan.com/api/v3/adverts?cityid=1&category=11&version=6.8.0&new=0&app=movie&clienttp=android&uuid=FCFAB9D8DD339645D629C8372A29A2C6AD16F9C9E87AF9AC0D656B29DD5AC6DE&devid=866641027400542&uid=&movieid=&partner=1&apptype=1&smId=&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=qq&utm_medium=android&utm_term=6.8.0&utm_content=866641027400542&ci=1&net=255&dModel=HM%20NOTE%201LTETD&lat=40.100855&lng=116.378273&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463730432992&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=01f9c5c0-eb56-4e19-92fb-b86b16ad79da&__skcy=5K8wRR%2FKYAZDTgmAzbhrXi%2FomzU%3D";

    public static String hotUrl="http://m.maoyan.com/movie/list.json?type=hot&offset=0&limit=1000";


    public static String hotitemurl="http://m.maoyan.com/movie/00000?_v_=yes";
    /**
     * 待映页面（RecycleView中第三种类型的url）
     */
    public static String wait_bottom_url="http://api.meituan.com/mmdb/movie/v2/list/rt/order/coming.json?ci=1&limit=12&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=xiaomi&utm_medium=android&utm_term=6.8.0&utm_content=868030022327462&net=255&dModel=MI%205&uuid=0894DE03C76F6045D55977B6D4E32B7F3C6AAB02F9CEA042987B380EC5687C43&lat=40.100673&lng=116.378619&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463704714271&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=1a0b4a9b-44ec-42fc-b110-ead68bcc2824&__skcy=sXcDKbGi20CGXQPPZvhCU3%2FkzdE%3D";

    public static String wait_middle_url="";
    public static String wait_top_url="";

    /**
     * 发现页面（RecycleView中第三种类型的url）
     */
    public static String find_rv_url="http://api.meituan.com/sns/v2/feed.json?offset=0&limit=10&timestamp=0&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=baidumobile1&utm_medium=android&utm_term=6.8.0&utm_content=863777020121611&ci=1&net=255";

    public static String topicUrl="http://m.maoyan.com/groups/?_v_=yes&f=android&userid=-1&pushToken=0759b53f6e5c5bd02c0dcae2fe28808757903f5108c78ad44a9144a67326390c103b4d6d4a8cb7a6cd70f822f26ffff9&cityId=1";
    public static String messUrl="http://m.maoyan.com/information?_v_=yes&f=android&userid=-1&pushToken=0759b53f6e5c5bd02c0dcae2fe28808757903f5108c78ad44a9144a67326390c103b4d6d4a8cb7a6cd70f822f26ffff9&cityId=1";
    public static String boxUrl="http://piaofang.maoyan.com/";
    public static String CinemaUrl="http://m.maoyan.com/cinemas.json";
    public static String mall_rv_url="http://api.meituan.com/mallpro/recommended.json?offset=10&limit=10&token=pkzzH8KafscTlqOCYqkpRlYXs1AAAAAAcwIAANOMUOdF6Ms_YXawcgX60ZxuqWK1v1p1H6MS9W-gUS_9H5KsQAgTOMpU7hTr7BzREQ&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D100&movieBundleVersion=7001&utm_source=huawei&utm_medium=android&utm_term=7.0.0&utm_content=865648021184700&ci=1&net=255&dModel=Che2-TL00&uuid=A8F430327D278B066878EE6B611E281A1C8D1F1525DB43B0601C28F9F9CABB92&lat=40.100922&lng=116.378872&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1467517061249&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=5a24a0df-48d4-4305-83a4-75994b8188fd&__skcy=PYrqhG67a14FsreRLNT5V7Kz6Ts%3D";




    public static String Json="{\n" +
            "    \"data\": {\n" +
            "        \"list\": [\n" +
            "            {\n" +
            "                \"dealid\": 38961845,\n" +
            "                \"pic\": \"http://p1.meituan.net/348.348/movie/48494907d2a47f466fe4b3f93840fe4a100174.jpg@60q\",\n" +
            "                \"price\": 65,\n" +
            "                \"shortTitle\": \" 50粒积木玩具\",\n" +
            "                \"title\": \"愤怒的小鸟正版 50粒积木玩具\",\n" +
            "                \"value\": 128\n" +
            "            },\n" +
            "            {\n" +
            "                \"dealid\": 38541178,\n" +
            "                \"pic\": \"http://p1.meituan.net/348.348/movie/c7935c72cec2352dbefcafb42b3e402b155534.jpg@60q\",\n" +
            "                \"price\": 27.9,\n" +
            "                \"shortTitle\": \"\",\n" +
            "                \"title\": \"魔兽 电影小说\",\n" +
            "                \"value\": 32\n" +
            "            },\n" +
            "            {\n" +
            "                \"dealid\": 38330819,\n" +
            "                \"pic\": \"http://p0.meituan.net/348.348/movie/5355b30ef4c6c00bb7b52257c76d344494759.jpg@60q\",\n" +
            "                \"price\": 39,\n" +
            "                \"shortTitle\": \"\",\n" +
            "                \"title\": \"魔兽 联盟3D眼镜\",\n" +
            "                \"value\": 69\n" +
            "            },\n" +
            "            {\n" +
            "                \"dealid\": 38925956,\n" +
            "                \"pic\": \"http://p0.meituan.net/348.348/movie/b1494811d9a328916e18b07bc900b2de120474.jpg@60q\",\n" +
            "                \"price\": 59,\n" +
            "                \"shortTitle\": \"尼莫公仔 12寸\",\n" +
            "                \"title\": \"海底总动员2》尼莫 毛绒玩具 12寸\",\n" +
            "                \"value\": 70.8\n" +
            "            },\n" +
            "            {\n" +
            "                \"dealid\": 38091274,\n" +
            "                \"pic\": \"http://p1.meituan.net/348.348/movie/1e906dcd65dfa0e4d7b6179f387e0488188216.jpg@60q\",\n" +
            "                \"price\": 99,\n" +
            "                \"shortTitle\": \"部落T恤\",\n" +
            "                \"title\": \"魔兽 部落T恤基本款\",\n" +
            "                \"value\": 199\n" +
            "            },\n" +
            "            {\n" +
            "                \"dealid\": 38961839,\n" +
            "                \"pic\": \"http://p1.meituan.net/348.348/movie/439e9fb9da6c996f8ff8291ff110df1f113427.jpg@60q\",\n" +
            "                \"price\": 99,\n" +
            "                \"shortTitle\": \"100粒积木玩具\",\n" +
            "                \"title\": \"愤怒的小鸟电影版100粒积木\",\n" +
            "                \"value\": 148\n" +
            "            },\n" +
            "            {\n" +
            "                \"dealid\": 38597301,\n" +
            "                \"pic\": \"http://p1.meituan.net/348.348/movie/9bab7a8c52802e21a11c913fdd6b34e4189748.jpg@60q\",\n" +
            "                \"price\": 29,\n" +
            "                \"shortTitle\": \"\",\n" +
            "                \"title\": \"绿猪 9寸 毛绒玩具\",\n" +
            "                \"value\": 48\n" +
            "            },\n" +
            "            {\n" +
            "                \"dealid\": 38512960,\n" +
            "                \"pic\": \"http://p1.meituan.net/348.348/movie/c84cc54bb027fc02374a8ce0fd503cd9197121.jpg@60q\",\n" +
            "                \"price\": 19.9,\n" +
            "                \"shortTitle\": \"\",\n" +
            "                \"title\": \"钥匙扣套装\",\n" +
            "                \"value\": 29.9\n" +
            "            },\n" +
            "            {\n" +
            "                \"dealid\": 38319221,\n" +
            "                \"pic\": \"http://p0.meituan.net/348.348/movie/e09ae917fa6e238237cab5e7570c933f410487.jpg@60q\",\n" +
            "                \"price\": 68,\n" +
            "                \"shortTitle\": \"\",\n" +
            "                \"title\": \"毛绒公仔30cm\",\n" +
            "                \"value\": 78\n" +
            "            },\n" +
            "            {\n" +
            "                \"dealid\": 39205177,\n" +
            "                \"pic\": \"http://p1.meituan.net/348.348/movie/995728e5e0a8d6a5f95b813c548cce6c188126.jpg@60q\",\n" +
            "                \"price\": 99,\n" +
            "                \"shortTitle\": \"单肩帆布包\",\n" +
            "                \"title\": \"摇滚藏獒周边Rock Dog单肩帆布包\",\n" +
            "                \"value\": 129\n" +
            "            }\n" +
            "        ],\n" +
            "        \"total\": 891\n" +
            "    }\n" +
            "}";
}
