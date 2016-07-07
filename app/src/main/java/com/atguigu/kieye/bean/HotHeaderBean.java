package com.atguigu.kieye.bean;

import java.util.List;

/**
 *
 * 影院主页广告轮播图的bean
 */
public class HotHeaderBean {

    /**
     * data : [{"businessName":"","app":"movie","channelType":0,"bigImgUrlSize":"(640, 150)","movieIdList":[],"typeDesc":"链接到应用内部页面","standIdList":[11],"endTime":1469980740000,"type":3,"url":"meituanmovie://www.meituan.com/web?url=http://m.maoyan.com/newGuide/MYPD0325","id":13409,"imgUrl":"http://p1.meituan.net/mmc/43857602f01751cfcf656e1738ddd5f661533.jpg","startTime":1464105600000,"level":3,"closable":2,"commonTitle":"","imgUrlSize":"(640, 150)","name":"打包5.18-6.7","bigImgTypeUrl":"http://p1.meituan.net/mmc/43857602f01751cfcf656e1738ddd5f661533.jpg","businessIds":"","channelListMap":{},"newUser":-1},{"businessName":"","app":"movie","channelType":0,"bigImgUrlSize":"(640, 150)","movieIdList":[],"typeDesc":"链接到应用内部页面","standIdList":[11],"endTime":1467302340000,"type":3,"url":"meituanmovie://www.meituan.com/web?url=http://m.maoyan.com/newGuide/ZBZB_HD","id":13392,"imgUrl":"http://p0.meituan.net/mmc/bd47dceba0b45da77ce8e849c0073d8573262.jpg","startTime":1466611200000,"level":10,"closable":2,"commonTitle":"猫眼电影正版周边","imgUrlSize":"(640, 150)","name":"海底2-6.4（含）以上版本","bigImgTypeUrl":"http://p0.meituan.net/mmc/bd47dceba0b45da77ce8e849c0073d8573262.jpg","businessIds":"","channelListMap":{},"newUser":-1}]
     */
    private List<DataEntity> data;

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public static class DataEntity {
        /**
         * businessName :
         * app : movie
         * channelType : 0
         * bigImgUrlSize : (640, 150)
         * movieIdList : []
         * typeDesc : 链接到应用内部页面
         * standIdList : [11]
         * endTime : 1469980740000
         * type : 3
         * url : meituanmovie://www.meituan.com/web?url=http://m.maoyan.com/newGuide/MYPD0325
         * id : 13409
         * imgUrl : http://p1.meituan.net/mmc/43857602f01751cfcf656e1738ddd5f661533.jpg
         * startTime : 1464105600000
         * level : 3
         * closable : 2
         * commonTitle :
         * imgUrlSize : (640, 150)
         * name : 打包5.18-6.7
         * bigImgTypeUrl : http://p1.meituan.net/mmc/43857602f01751cfcf656e1738ddd5f661533.jpg
         * businessIds :
         * channelListMap : {}
         * newUser : -1
         */
        private String businessName;
        private String app;
        private int channelType;
        private String bigImgUrlSize;
        private List<?> movieIdList;
        private String typeDesc;
        private List<Integer> standIdList;
        private long endTime;
        private int type;
        private String url;
        private int id;
        private String imgUrl;
        private long startTime;
        private int level;
        private int closable;
        private String commonTitle;
        private String imgUrlSize;
        private String name;
        private String bigImgTypeUrl;
        private String businessIds;
        private ChannelListMapEntity channelListMap;
        private int newUser;

        public void setBusinessName(String businessName) {
            this.businessName = businessName;
        }

        public void setApp(String app) {
            this.app = app;
        }

        public void setChannelType(int channelType) {
            this.channelType = channelType;
        }

        public void setBigImgUrlSize(String bigImgUrlSize) {
            this.bigImgUrlSize = bigImgUrlSize;
        }

        public void setMovieIdList(List<?> movieIdList) {
            this.movieIdList = movieIdList;
        }

        public void setTypeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
        }

        public void setStandIdList(List<Integer> standIdList) {
            this.standIdList = standIdList;
        }

        public void setEndTime(long endTime) {
            this.endTime = endTime;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public void setClosable(int closable) {
            this.closable = closable;
        }

        public void setCommonTitle(String commonTitle) {
            this.commonTitle = commonTitle;
        }

        public void setImgUrlSize(String imgUrlSize) {
            this.imgUrlSize = imgUrlSize;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBigImgTypeUrl(String bigImgTypeUrl) {
            this.bigImgTypeUrl = bigImgTypeUrl;
        }

        public void setBusinessIds(String businessIds) {
            this.businessIds = businessIds;
        }

        public void setChannelListMap(ChannelListMapEntity channelListMap) {
            this.channelListMap = channelListMap;
        }

        public void setNewUser(int newUser) {
            this.newUser = newUser;
        }

        public String getBusinessName() {
            return businessName;
        }

        public String getApp() {
            return app;
        }

        public int getChannelType() {
            return channelType;
        }

        public String getBigImgUrlSize() {
            return bigImgUrlSize;
        }

        public List<?> getMovieIdList() {
            return movieIdList;
        }

        public String getTypeDesc() {
            return typeDesc;
        }

        public List<Integer> getStandIdList() {
            return standIdList;
        }

        public long getEndTime() {
            return endTime;
        }

        public int getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public int getId() {
            return id;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public long getStartTime() {
            return startTime;
        }

        public int getLevel() {
            return level;
        }

        public int getClosable() {
            return closable;
        }

        public String getCommonTitle() {
            return commonTitle;
        }

        public String getImgUrlSize() {
            return imgUrlSize;
        }

        public String getName() {
            return name;
        }

        public String getBigImgTypeUrl() {
            return bigImgTypeUrl;
        }

        public String getBusinessIds() {
            return businessIds;
        }

        public ChannelListMapEntity getChannelListMap() {
            return channelListMap;
        }

        public int getNewUser() {
            return newUser;
        }

        public static class ChannelListMapEntity {
        }
    }
}
