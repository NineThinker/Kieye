package com.atguigu.kieye.bean.waitbean;

import com.google.gson.Gson;

import java.util.List;

/**
 * 作者：张爽 on 2016/7/1 22:19
 * 邮箱：18330118276@163.com
 */
public class CinnmaBeanT {


    /**
     * expires : 43200
     */

    private ControlBean control;
    /**
     * control : {"expires":43200}
     * status : 0
     * data : {"朝阳区":[{"addr":"朝阳区京顺路111号比如世界购物中心1层（近太阳宫北街）","lat":39.9684,"lng":116.46204,"deal":0,"distance":0,"area":"朝阳区","sellPrice":28,"poiId":75603,"imax":0,"nm":"17.5影城(比如世界店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"17.5影城","dis":"望京","brdId":23854,"dealPrice":0,"referencePrice":70,"showCount":0,"id":48},{"addr":"朝阳区朝阳路京通苑30号楼L307PLus365购物中心三层","lat":39.912422,"lng":116.596085,"deal":0,"distance":0,"area":"朝阳区","sellPrice":34,"poiId":1677952,"imax":0,"nm":"17.5影城(管庄店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"17.5影城","dis":"管庄","brdId":23854,"dealPrice":0,"referencePrice":60,"showCount":0,"id":2243},{"addr":"朝阳区湖景东路11号新奥购物中心B1-B2楼","lat":39.999462,"lng":116.39392,"deal":0,"distance":0,"area":"朝阳区","sellPrice":57,"poiId":360511,"imax":0,"nm":"CGV星聚汇星星影城(奥体店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"CGV星聚汇影城","dis":"亚运村","brdId":2020418,"dealPrice":0,"referencePrice":40,"showCount":0,"id":65},{"addr":"朝阳区酒仙桥路18号颐堤港4层","lat":39.96964,"lng":116.4909,"deal":0,"distance":0,"area":"朝阳区","sellPrice":57,"poiId":1466992,"imax":0,"nm":"CGV星聚汇星星影城(颐堤港店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"CGV星聚汇影城","dis":"酒仙桥","brdId":2020418,"dealPrice":0,"referencePrice":40,"showCount":0,"id":8},{"addr":"朝阳区北苑路42号卜峰莲花超市4楼（K酷时尚广场）","lat":40.033382,"lng":116.41916,"deal":1,"distance":0,"area":"朝阳区","sellPrice":38,"poiId":796845,"imax":0,"nm":"K酷国际影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"K酷国际影城","dis":"亚运村","brdId":24003,"dealPrice":35.5,"referencePrice":80,"showCount":0,"id":21},{"addr":"朝阳区东三环中路65号富力广场6楼（双井桥北）","lat":39.89768,"lng":116.45983,"deal":0,"distance":0,"area":"朝阳区","sellPrice":39.5,"poiId":291070,"imax":0,"nm":"UME国际影城(双井店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"UME国际影城","dis":"双井","brdId":24071,"dealPrice":0,"referencePrice":70,"showCount":0,"id":135},{"addr":"朝阳区工体北路13号世茂工三3楼，艾米·1895电影街（三里屯商圈）","lat":39.93605,"lng":116.44939,"deal":1,"distance":0,"area":"朝阳区","sellPrice":53,"poiId":42853106,"imax":0,"nm":"艾米·1895电影街","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":100,"referencePrice":0,"showCount":0,"id":13640},{"addr":"朝阳区安慧里三区10号","lat":39.990856,"lng":116.40813,"deal":0,"distance":0,"area":"朝阳区","sellPrice":38,"poiId":82597,"imax":0,"nm":"北京剧院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"北京剧院","dis":"亚运村","brdId":254168,"dealPrice":0,"referencePrice":80,"showCount":0,"id":248},{"addr":"朝阳区清河营南街7号院华贸天地B1楼","lat":40.047962,"lng":116.43101,"deal":0,"distance":0,"area":"朝阳区","sellPrice":39,"poiId":361205,"imax":0,"nm":"保利国际影城(北苑华贸店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"保利国际影城","dis":"北苑","brdId":24472,"dealPrice":0,"referencePrice":25,"showCount":0,"id":2603},{"addr":"朝阳区东坝中路38号金隅嘉品MALL5层","lat":39.951107,"lng":116.54848,"deal":0,"distance":0,"area":"朝阳区","sellPrice":29,"poiId":73452594,"imax":0,"nm":"保利国际影城(东坝店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"保利国际影城","dis":"","brdId":24472,"dealPrice":0,"referencePrice":0,"showCount":0,"id":14430},{"addr":"朝阳区望京阜通西大街新荟城购物中心五层","lat":39.998497,"lng":116.481926,"deal":0,"distance":0,"area":"朝阳区","sellPrice":39,"poiId":1107541,"imax":0,"nm":"保利国际影城(望京店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"保利国际影城","dis":"望京","brdId":24472,"dealPrice":0,"referencePrice":70,"showCount":0,"id":39},{"addr":"朝阳区北辰东路5号（鸟巢正北一公里）","lat":40.005745,"lng":116.39992,"deal":0,"distance":0,"area":"朝阳区","sellPrice":29,"poiId":61574,"imax":0,"nm":"保利国际影城(中国科技馆店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"保利国际影城","dis":"亚运村","brdId":24472,"dealPrice":0,"referencePrice":80,"showCount":0,"id":40},{"addr":"朝阳区建国门外大街1号国贸商城区域三地下一层3B120","lat":39.91279,"lng":116.45982,"deal":0,"distance":0,"area":"朝阳区","sellPrice":43,"poiId":3281398,"imax":0,"nm":"百丽宫影城(国贸店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"百老汇影城","dis":"国贸","brdId":24377,"dealPrice":0,"referencePrice":90,"showCount":0,"id":23},{"addr":"朝阳区三丰北里2号楼悠唐生活广场B1楼（近钱柜）","lat":39.921932,"lng":116.4385,"deal":0,"distance":0,"area":"朝阳区","sellPrice":44,"poiId":63,"imax":1,"nm":"博纳国际影城(悠唐店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"博纳国际影城","dis":"朝外大街","brdId":24595,"dealPrice":0,"referencePrice":35,"showCount":0,"id":116},{"addr":"朝阳区朝阳公园路6号蓝色港湾国际商区SA-42（朝阳公园西北角）","lat":39.949085,"lng":116.47616,"deal":0,"distance":0,"area":"朝阳区","sellPrice":39.5,"poiId":297916,"imax":0,"nm":"传奇时代影城(蓝色港湾店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"传奇时代影城","dis":"亮马桥","brdId":24804,"dealPrice":0,"referencePrice":40,"showCount":0,"id":132},{"addr":"朝阳区曙光西里甲5号院24号楼凤凰汇三层","lat":39.962627,"lng":116.45721,"deal":0,"distance":0,"area":"朝阳区","sellPrice":34.5,"poiId":1465641,"imax":0,"nm":"橙天嘉禾影城(凤凰城店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"橙天嘉禾影城","dis":"三元桥","brdId":24745,"dealPrice":0,"referencePrice":80,"showCount":0,"id":2081},{"addr":"朝阳区东三环北路36号呼家楼北（近朝阳北路）","lat":39.922314,"lng":116.462105,"deal":1,"distance":0,"area":"朝阳区","sellPrice":38,"poiId":82595,"imax":0,"nm":"朝阳剧场","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"朝阳剧场","dis":"亮马桥","brdId":635050,"dealPrice":36,"referencePrice":60,"showCount":0,"id":249},{"addr":"朝阳区望京阜安西街11号楼合生麒麟新天地2层","lat":39.99817,"lng":116.47787,"deal":0,"distance":0,"area":"朝阳区","sellPrice":38,"poiId":4036242,"imax":0,"nm":"大地数字影院(望京新天地店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"大地影院","dis":"","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":7881},{"addr":"朝阳区东四环中路195号华腾新天地五层","lat":39.885048,"lng":116.48847,"deal":0,"distance":0,"area":"朝阳区","sellPrice":43,"poiId":30903,"imax":0,"nm":"东都影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"东都影城","dis":"大望路","brdId":133085,"dealPrice":0,"referencePrice":43,"showCount":0,"id":262},{"addr":"朝阳区南杨庄路与武基街交叉口西南方向50米路南（垡头永辉超市，翠城馨园401号楼地下一层）","lat":39.856857,"lng":116.50524,"deal":0,"distance":0,"area":"朝阳区","sellPrice":33,"poiId":41877507,"imax":0,"nm":"大地影院(垡头永辉店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"大地影院","dis":"","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10954},{"addr":"朝阳区西大望南路与弘燕南一路交叉口铭泽生活广场5层","lat":39.864407,"lng":116.47688,"deal":0,"distance":0,"area":"朝阳区","sellPrice":33,"poiId":40086376,"imax":0,"nm":"大地影院(十里河铭泽影院 )","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"大地影院","dis":"","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10951},{"addr":"朝阳区祁家豁子8号健翔大厦家乐福超市B1层","lat":39.98034,"lng":116.38147,"deal":1,"distance":0,"area":"朝阳区","sellPrice":33,"poiId":1098864,"imax":0,"nm":"海航文化天宝国际影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"亚运村","brdId":0,"dealPrice":39.6,"referencePrice":80,"showCount":0,"id":31},{"addr":"朝阳区七圣中街12号院爱琴海购物中心6层","lat":39.97224,"lng":116.436386,"deal":0,"distance":0,"area":"朝阳区","sellPrice":53,"poiId":5948789,"imax":0,"nm":"红星太平洋电影城(爱琴海购物中心店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"太平洋电影城","dis":"","brdId":28975,"dealPrice":0,"referencePrice":0,"showCount":0,"id":7619},{"addr":"朝阳区姚家园路甲1号活力东方奥特莱斯购物中心4楼","lat":39.940395,"lng":116.52246,"deal":1,"distance":0,"area":"朝阳区","sellPrice":24,"poiId":2578227,"imax":0,"nm":"嘉华国际影城(活力东方店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"嘉华国际影城","dis":"","brdId":26413,"dealPrice":30,"referencePrice":70,"showCount":0,"id":5987},{"addr":"朝阳区北三环东路22号","lat":39.96894,"lng":116.42397,"deal":0,"distance":0,"area":"朝阳区","sellPrice":38,"poiId":89000,"imax":0,"nm":"金鸡百花影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"金鸡百花影城","dis":"左家庄","brdId":1082447,"dealPrice":0,"referencePrice":30,"showCount":0,"id":256},{"addr":"朝阳区劲松中街404号","lat":39.88321,"lng":116.45597,"deal":0,"distance":0,"area":"朝阳区","sellPrice":33,"poiId":82588,"imax":0,"nm":"劲松电影院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"劲松电影院","dis":"劲松","brdId":252281,"dealPrice":0,"referencePrice":30,"showCount":0,"id":236},{"addr":"朝阳区朝阳北路101号朝阳大悦城商场8层","lat":39.924355,"lng":116.51871,"deal":0,"distance":0,"area":"朝阳区","sellPrice":39,"poiId":1548100,"imax":1,"nm":"金逸影城(朝阳大悦城IMAX店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"金逸影城","dis":"十里堡","brdId":1079568,"dealPrice":0,"referencePrice":80,"showCount":0,"id":88},{"addr":"朝阳区双桥路3号东星时尚广场5层","lat":39.90879,"lng":116.57644,"deal":0,"distance":0,"area":"朝阳区","sellPrice":29,"poiId":1439570,"imax":0,"nm":"金逸影城(双桥店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"金逸影城","dis":"管庄","brdId":1079568,"dealPrice":0,"referencePrice":0,"showCount":0,"id":1692},{"addr":"朝阳区东大桥路9号侨福芳草地购物中心LG2-26（尚都SOHO对面）","lat":39.91955,"lng":116.44965,"deal":0,"distance":0,"area":"朝阳区","sellPrice":58,"poiId":332108,"imax":0,"nm":"卢米埃影城(芳草地店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"卢米埃影城","dis":"","brdId":292030,"dealPrice":0,"referencePrice":50,"showCount":0,"id":5736},{"addr":"朝阳区朝阳北路长楹天街购物中心东区5F-09","lat":39.92509,"lng":116.60262,"deal":0,"distance":0,"area":"朝阳区","sellPrice":43,"poiId":52539636,"imax":1,"nm":"卢米埃影城(长楹天街IMAX店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"卢米埃影城","dis":"","brdId":292030,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13204},{"addr":"朝阳区立清路明天第一城7号院，蓝黛时空汇内","lat":40.04711,"lng":116.4083,"deal":1,"distance":0,"area":"朝阳区","sellPrice":28,"poiId":1541423,"imax":0,"nm":"鲁信影城(立水桥店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"鲁信影城","dis":"北苑家园","brdId":27424,"dealPrice":25,"referencePrice":70,"showCount":0,"id":1732},{"addr":"朝阳区三里屯太古里地下一层（三里屯酒吧街南口西侧）","lat":39.934406,"lng":116.45507,"deal":0,"distance":0,"area":"朝阳区","sellPrice":49,"poiId":30915,"imax":0,"nm":"美嘉欢乐影城(三里屯店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"美嘉欢乐影城","dis":"三里屯","brdId":27617,"dealPrice":0,"referencePrice":80,"showCount":0,"id":136},{"addr":"朝阳区建国路93号万达广场B座3层","lat":39.909027,"lng":116.4709,"deal":0,"distance":0,"area":"朝阳区","sellPrice":43,"poiId":30863,"imax":1,"nm":"万达国际影城(CBD店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"万达影城","dis":"大望路","brdId":102642,"dealPrice":0,"referencePrice":80,"showCount":0,"id":264},{"addr":"朝阳区朝阳北路17号（地铁6号线常营站B出口）北京华联购物中心四层","lat":39.926247,"lng":116.59568,"deal":0,"distance":0,"area":"朝阳区","sellPrice":38,"poiId":5529977,"imax":0,"nm":"沃美影城(常营店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"沃美影城","dis":"","brdId":29462,"dealPrice":0,"referencePrice":0,"showCount":0,"id":8065},{"addr":"朝阳区立汤路201号东亚奥北南区北门一楼（华泰汽车斜对面，立水桥地铁A口北行150米）","lat":40.05452,"lng":116.41205,"deal":1,"distance":0,"area":"朝阳区","sellPrice":28,"poiId":3260787,"imax":0,"nm":"星环影城(立水桥店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":25,"referencePrice":60,"showCount":0,"id":9914},{"addr":"朝阳区金汇路8号世界城E座B1楼（世贸天阶商业街北侧）","lat":39.917755,"lng":116.45232,"deal":0,"distance":0,"area":"朝阳区","sellPrice":9,"poiId":316112,"imax":0,"nm":"星美国际影城(世界城店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"星美国际影城","dis":"朝外大街","brdId":30032,"dealPrice":0,"referencePrice":35,"showCount":0,"id":98},{"addr":"朝阳区望京街9号望京国际商业中心A座4楼","lat":39.990322,"lng":116.48359,"deal":0,"distance":0,"area":"朝阳区","sellPrice":44,"poiId":1558123,"imax":0,"nm":"星美国际影城(望京店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"星美国际影城","dis":"望京","brdId":30032,"dealPrice":0,"referencePrice":40,"showCount":0,"id":175},{"addr":"朝阳区广顺北大街16号望京华彩商业中心B1a","lat":40.01051,"lng":116.46821,"deal":1,"distance":0,"area":"朝阳区","sellPrice":44,"poiId":82583,"imax":0,"nm":"新影联·华谊兄弟影院(望京店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"华谊兄弟影院","dis":"望京","brdId":275830,"dealPrice":35,"referencePrice":80,"showCount":0,"id":72},{"addr":"朝阳区安立路68号飘亮广场B1层","lat":39.997986,"lng":116.409164,"deal":1,"distance":0,"area":"朝阳区","sellPrice":38,"poiId":90846,"imax":0,"nm":"阳光影城(安立路店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"阳光影城","dis":"亚运村","brdId":30206,"dealPrice":28,"referencePrice":70,"showCount":0,"id":174},{"addr":"朝阳区慈云寺北里209号未来汇二层（未来汇广场）","lat":39.916008,"lng":116.49176,"deal":1,"distance":0,"area":"朝阳区","sellPrice":38,"poiId":4230363,"imax":0,"nm":"耀莱成龙国际影城(慈云寺店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"","brdId":30227,"dealPrice":35,"referencePrice":0,"showCount":0,"id":9730},{"addr":"朝阳区安华西里甲1号","lat":39.96802,"lng":116.40147,"deal":1,"distance":0,"area":"朝阳区","sellPrice":28,"poiId":82596,"imax":0,"nm":"中国木偶艺术剧院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"安贞","brdId":0,"dealPrice":31,"referencePrice":0,"showCount":0,"id":252},{"addr":"朝阳区朝外大街8号（蓝岛大厦西区5-6层）","lat":39.922623,"lng":116.44817,"deal":1,"distance":0,"area":"朝阳区","sellPrice":33,"poiId":3274641,"imax":0,"nm":"紫光影城(蓝岛店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"紫光影城","dis":"朝外大街","brdId":31014,"dealPrice":21,"referencePrice":35,"showCount":0,"id":259},{"addr":"朝阳区西直河商业广场华联购物广场1楼","lat":39.844444,"lng":116.52732,"deal":0,"distance":0,"area":"朝阳区","sellPrice":0,"poiId":91811925,"imax":0,"nm":"北京东融国际影城","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15415},{"addr":"朝阳区亮马桥路21号（朝阳公园北门对面）","lat":39.958447,"lng":116.48107,"deal":0,"distance":0,"area":"朝阳区","sellPrice":0,"poiId":271415,"imax":0,"nm":"枫花园汽车影院","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"枫花园汽车影院","dis":"亮马桥","brdId":651783,"dealPrice":0,"referencePrice":100,"showCount":0,"id":254},{"addr":"朝阳区垡头西里44号垡头文化中心B1","lat":39.861492,"lng":116.51347,"deal":1,"distance":0,"area":"朝阳区","sellPrice":0,"poiId":3305306,"imax":0,"nm":"曙光影院","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"垡头西里","brdId":0,"dealPrice":31,"referencePrice":0,"showCount":0,"id":4548},{"addr":"朝阳区南影路9号","lat":39.9962,"lng":116.521,"deal":0,"distance":0,"area":"朝阳区","sellPrice":0,"poiId":1436410,"imax":1,"nm":"中国电影博物馆","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"草场地","brdId":0,"dealPrice":0,"referencePrice":40,"showCount":0,"id":181}],"海淀区":[{"addr":"海淀区文慧园路9号今典花园9号楼空间蒙太奇大厦1层","lat":39.95334,"lng":116.36104,"deal":1,"distance":0,"area":"海淀区","sellPrice":44,"poiId":273950,"imax":0,"nm":"17.5影城(今典花园店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"17.5影城","dis":"北太平庄","brdId":23854,"dealPrice":30,"referencePrice":60,"showCount":0,"id":154},{"addr":"海淀区西翠路5号今日家园8号楼苏宁电器地下一层（太平路沃尔玛超市旁）","lat":39.900616,"lng":116.28245,"deal":0,"distance":0,"area":"海淀区","sellPrice":27,"poiId":3260713,"imax":0,"nm":"17.5影城(今日家园店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"17.5影城","dis":"五棵松","brdId":23854,"dealPrice":0,"referencePrice":70,"showCount":0,"id":102},{"addr":"海淀区大钟寺四道口2号京果商厦B座三层北侧","lat":39.959427,"lng":116.34575,"deal":0,"distance":0,"area":"海淀区","sellPrice":22,"poiId":48958,"imax":0,"nm":"17.5影城(四道口店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"17.5影城","dis":"北下关","brdId":23854,"dealPrice":0,"referencePrice":45,"showCount":0,"id":25},{"addr":"海淀区清河中街68号华润五彩城购物中心东区7层","lat":40.030476,"lng":116.334724,"deal":0,"distance":0,"area":"海淀区","sellPrice":57,"poiId":2374984,"imax":0,"nm":"CGV星聚汇影城(清河店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"CGV星聚汇影城","dis":"","brdId":2020418,"dealPrice":0,"referencePrice":40,"showCount":0,"id":5111},{"addr":"海淀区双榆树科学院南路44号（双安商场对面）","lat":39.967793,"lng":116.326096,"deal":0,"distance":0,"area":"海淀区","sellPrice":39.5,"poiId":1436373,"imax":1,"nm":"UME国际影城(华星店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"UME国际影城","dis":"中关村","brdId":24071,"dealPrice":0,"referencePrice":70,"showCount":0,"id":155},{"addr":"海淀区复兴路51号凯德晶品购物中心4层","lat":39.908405,"lng":116.29659,"deal":0,"distance":0,"area":"海淀区","sellPrice":34,"poiId":1460949,"imax":0,"nm":"博纳国际影城(万寿路店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"博纳国际影城","dis":"万寿路","brdId":24595,"dealPrice":0,"referencePrice":80,"showCount":0,"id":1624},{"addr":"海淀区玉海园五里22号配套商业楼（原吉彩体育馆）","lat":39.922768,"lng":116.25956,"deal":0,"distance":0,"area":"海淀区","sellPrice":34.5,"poiId":2393106,"imax":0,"nm":"橙天嘉禾影城(吉彩店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"橙天嘉禾影城","dis":"","brdId":24745,"dealPrice":0,"referencePrice":80,"showCount":0,"id":5313},{"addr":"海淀区上地南口华联商厦4F","lat":40.02865,"lng":116.31154,"deal":0,"distance":0,"area":"海淀区","sellPrice":34.5,"poiId":14447,"imax":0,"nm":"橙天嘉禾影城(上地店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"橙天嘉禾影城","dis":"上地","brdId":24745,"dealPrice":0,"referencePrice":80,"showCount":0,"id":130},{"addr":"海淀区巴沟路2号华联万柳购物中心5层","lat":39.97296,"lng":116.29486,"deal":0,"distance":0,"area":"海淀区","sellPrice":34.5,"poiId":3303603,"imax":0,"nm":"橙天嘉禾影城(万柳店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"橙天嘉禾影城","dis":"苏州桥","brdId":24745,"dealPrice":0,"referencePrice":80,"showCount":0,"id":86},{"addr":"海淀区悦秀路99号二层","lat":40.04733,"lng":116.33703,"deal":0,"distance":0,"area":"海淀区","sellPrice":33,"poiId":4845675,"imax":0,"nm":"大地影院(西三旗物美店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"大地影院","dis":"","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":7433},{"addr":"海淀区花园东路甲16号","lat":39.981472,"lng":116.37021,"deal":0,"distance":0,"area":"海淀区","sellPrice":43,"poiId":294883,"imax":0,"nm":"国安剧院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"北太平庄","brdId":0,"dealPrice":0,"referencePrice":80,"showCount":0,"id":251},{"addr":"海淀区中关村南大街33号国家图书馆内","lat":39.94304,"lng":116.32312,"deal":0,"distance":0,"area":"海淀区","sellPrice":28,"poiId":271442,"imax":0,"nm":"国图影院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"魏公村","brdId":0,"dealPrice":0,"referencePrice":60,"showCount":0,"id":238},{"addr":"海淀区万柳华府北街2号（万柳华联商城南门对面）","lat":39.971443,"lng":116.295105,"deal":1,"distance":0,"area":"海淀区","sellPrice":38,"poiId":38025,"imax":0,"nm":"海淀工人文化宫","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"苏州桥","brdId":0,"dealPrice":28,"referencePrice":30,"showCount":0,"id":141},{"addr":"海淀区中关村大街28号","lat":39.97669,"lng":116.31822,"deal":1,"distance":0,"area":"海淀区","sellPrice":38,"poiId":17899,"imax":0,"nm":"海淀剧院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"中关村","brdId":0,"dealPrice":31,"referencePrice":80,"showCount":0,"id":257},{"addr":"海淀区学清路甲8号圣熙8号购物中心5层西侧","lat":40.008587,"lng":116.35387,"deal":1,"distance":0,"area":"海淀区","sellPrice":29,"poiId":84440,"imax":0,"nm":"嘉华国际影城(学清路店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"嘉华国际影城","dis":"五道口","brdId":26413,"dealPrice":35,"referencePrice":70,"showCount":0,"id":70},{"addr":"海淀区西三旗建材城中路6号新都购物广场1层","lat":40.060005,"lng":116.36541,"deal":0,"distance":0,"area":"海淀区","sellPrice":29,"poiId":1549060,"imax":0,"nm":"金逸影城(新都店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"金逸影城","dis":"清河","brdId":1079568,"dealPrice":0,"referencePrice":60,"showCount":0,"id":58},{"addr":"海淀区中关村大街19号新中关购物中心B1层","lat":39.978382,"lng":116.31445,"deal":0,"distance":0,"area":"海淀区","sellPrice":59,"poiId":276722,"imax":0,"nm":"金逸影城(中关村店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"金逸影城","dis":"中关村","brdId":1079568,"dealPrice":0,"referencePrice":80,"showCount":0,"id":152},{"addr":"海淀区中关村大街15号中关村广场购物中心津乐汇3楼（地铁中关村站D口出西侧）","lat":39.983105,"lng":116.31355,"deal":1,"distance":0,"area":"海淀区","sellPrice":49,"poiId":279439,"imax":0,"nm":"美嘉欢乐影城(中关村店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"美嘉欢乐影城","dis":"中关村","brdId":27617,"dealPrice":43.9,"referencePrice":24,"showCount":0,"id":197},{"addr":"海淀区羊坊店路18号光耀东方4层","lat":39.899376,"lng":116.32227,"deal":0,"distance":0,"area":"海淀区","sellPrice":23,"poiId":3251410,"imax":0,"nm":"世茂国际影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"世茂国际影城","dis":"","brdId":28741,"dealPrice":0,"referencePrice":0,"showCount":0,"id":6483},{"addr":"海淀区北三环中路中视云投大厦","lat":39.969345,"lng":116.3678,"deal":0,"distance":0,"area":"海淀区","sellPrice":33,"poiId":4480546,"imax":0,"nm":"天幕新彩云国际影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13003},{"addr":"海淀区成府路23号（近五道口城铁站）","lat":39.99351,"lng":116.33939,"deal":1,"distance":0,"area":"海淀区","sellPrice":33,"poiId":82591,"imax":0,"nm":"五道口工人俱乐部电影院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"五道口","brdId":0,"dealPrice":31,"referencePrice":35,"showCount":0,"id":258},{"addr":"海淀区西四环北路金四季购物中心中段三层B003","lat":39.94469,"lng":116.27137,"deal":0,"distance":0,"area":"海淀区","sellPrice":23,"poiId":41066531,"imax":0,"nm":"万画影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13054},{"addr":"海淀区宝盛北里西区28号兴美生活广场5层","lat":40.037056,"lng":116.370605,"deal":1,"distance":0,"area":"海淀区","sellPrice":31,"poiId":2408760,"imax":0,"nm":"新华国际影城(宝盛店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"新华国际影城","dis":"","brdId":29894,"dealPrice":26,"referencePrice":70,"showCount":0,"id":5359},{"addr":"海淀区北三环18号院大钟寺中坤广场C座3层（地铁13号线大钟寺站出站即到）","lat":39.96573,"lng":116.34114,"deal":0,"distance":0,"area":"海淀区","sellPrice":43,"poiId":1524564,"imax":0,"nm":"新华国际影城(大钟寺店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"新华国际影城","dis":"大钟寺","brdId":29894,"dealPrice":0,"referencePrice":80,"showCount":0,"id":1589},{"addr":"海淀区远大路1号金源时代购物中心5楼东首（近蓝靛厂北路）","lat":39.95867,"lng":116.2889,"deal":0,"distance":0,"area":"海淀区","sellPrice":52,"poiId":271447,"imax":0,"nm":"星美国际影城(金源店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"星美国际影城","dis":"远大路","brdId":30032,"dealPrice":0,"referencePrice":35,"showCount":0,"id":271},{"addr":"海淀区复兴路69号卓展购物中心5层","lat":39.913418,"lng":116.2794,"deal":1,"distance":0,"area":"海淀区","sellPrice":38,"poiId":335220,"imax":0,"nm":"耀莱成龙国际影城(五棵松店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"五棵松","brdId":30227,"dealPrice":35,"referencePrice":70,"showCount":0,"id":87},{"addr":"海淀区杏石口路中间艺术园区内","lat":39.95388,"lng":116.23189,"deal":0,"distance":0,"area":"海淀区","sellPrice":45,"poiId":4572438,"imax":0,"nm":"中间影院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":9459},{"addr":"海淀区新街口外大街25号（小西天牌楼北侧）","lat":39.95296,"lng":116.37117,"deal":0,"distance":0,"area":"海淀区","sellPrice":39,"poiId":82594,"imax":0,"nm":"中影电影院(新街口店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"中影国际影城","dis":"","brdId":23745,"dealPrice":0,"referencePrice":0,"showCount":0,"id":9916},{"addr":"海淀区花园路甲13号庚坊国际发展中心B1层","lat":39.972046,"lng":116.36422,"deal":0,"distance":0,"area":"海淀区","sellPrice":0,"poiId":4744457,"imax":0,"nm":"华影国际影城(花园路店)","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"华影国际影城","dis":"","brdId":271399,"dealPrice":0,"referencePrice":0,"showCount":0,"id":7985},{"addr":"海淀区文慧园路3号","lat":39.953133,"lng":116.36986,"deal":0,"distance":0,"area":"海淀区","sellPrice":33,"poiId":1541424,"imax":0,"nm":"中国电影资料馆","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"新街口","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":2010}],"东城区":[{"addr":"东城区北三环安贞桥环球贸易中心E座","lat":39.966072,"lng":116.41096,"deal":0,"distance":0,"area":"东城区","sellPrice":39.5,"poiId":94496,"imax":0,"nm":"UME国际影城(安贞店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"UME国际影城","dis":"安贞","brdId":24071,"dealPrice":0,"referencePrice":70,"showCount":0,"id":99},{"addr":"东城区金宝街88号金宝汇7层","lat":39.9152,"lng":116.42129,"deal":0,"distance":0,"area":"东城区","sellPrice":38,"poiId":1076058,"imax":0,"nm":"百丽宫影城(金宝汇店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"百老汇影城","dis":"王府井","brdId":24377,"dealPrice":0,"referencePrice":80,"showCount":0,"id":122},{"addr":"东城区香河园路1号当代MOMA北区T4座","lat":39.950455,"lng":116.43878,"deal":0,"distance":0,"area":"东城区","sellPrice":43,"poiId":1076062,"imax":0,"nm":"百老汇电影中心","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"百老汇影城","dis":"东直门","brdId":24377,"dealPrice":0,"referencePrice":80,"showCount":0,"id":94},{"addr":"东城区王府井大街138号北京apm6层","lat":39.914005,"lng":116.41193,"deal":0,"distance":0,"area":"东城区","sellPrice":38,"poiId":271444,"imax":0,"nm":"百老汇影城(apm购物中心店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"百老汇影城","dis":"王府井","brdId":24377,"dealPrice":0,"referencePrice":70,"showCount":0,"id":267},{"addr":"东城区东长安街1号东方广场地下1层","lat":39.909454,"lng":116.411934,"deal":0,"distance":0,"area":"东城区","sellPrice":38,"poiId":271409,"imax":0,"nm":"百老汇影城(东方广场店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"百老汇影城","dis":"王府井","brdId":24377,"dealPrice":0,"referencePrice":40,"showCount":0,"id":269},{"addr":"东城区崇文门外大街18号国瑞城购物中心首层/-2层","lat":39.897575,"lng":116.420135,"deal":0,"distance":0,"area":"东城区","sellPrice":43,"poiId":1048975,"imax":0,"nm":"百老汇影城(国瑞购物中心店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"百老汇影城","dis":"崇文门","brdId":24377,"dealPrice":0,"referencePrice":80,"showCount":0,"id":119},{"addr":"东城区隆福寺街47号东四工人文化宫","lat":39.9253,"lng":116.41552,"deal":0,"distance":0,"area":"东城区","sellPrice":31,"poiId":60166,"imax":0,"nm":"东宫影剧院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"东宫影剧院","dis":"东四","brdId":125212,"dealPrice":0,"referencePrice":30,"showCount":0,"id":242},{"addr":"东城区东中街9号东环广场B座B1楼","lat":39.936527,"lng":116.43607,"deal":1,"distance":0,"area":"东城区","sellPrice":43,"poiId":43786,"imax":0,"nm":"东环影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"东环影城","dis":"东直门","brdId":25181,"dealPrice":29,"referencePrice":80,"showCount":0,"id":265},{"addr":"东城区王府井大街251-253号8层","lat":39.913864,"lng":116.41057,"deal":1,"distance":0,"area":"东城区","sellPrice":24,"poiId":1549949,"imax":0,"nm":"横店电影城(王府井店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"横店电影城","dis":"王府井","brdId":26045,"dealPrice":31,"referencePrice":70,"showCount":0,"id":79},{"addr":"东城区东滨河路乙一号雍和航星园内","lat":39.95059,"lng":116.42174,"deal":0,"distance":0,"area":"东城区","sellPrice":38,"poiId":99389254,"imax":0,"nm":"青春光线电影院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15280},{"addr":"东城区崇外大街40号搜秀城9层","lat":39.896397,"lng":116.419266,"deal":0,"distance":0,"area":"东城区","sellPrice":43,"poiId":82579,"imax":0,"nm":"搜秀影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"搜秀影城","dis":"崇文门","brdId":28916,"dealPrice":0,"referencePrice":80,"showCount":0,"id":270},{"addr":"东城区王府井大街301号新燕莎购物中心地下一层西侧（地铁一号线王府井站出C2口向北步行200米路西）","lat":39.90959,"lng":116.41121,"deal":1,"distance":0,"area":"东城区","sellPrice":38,"poiId":6074394,"imax":0,"nm":"耀莱成龙国际影城(王府井店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"","brdId":30227,"dealPrice":30,"referencePrice":0,"showCount":0,"id":10781},{"addr":"东城区毛家湾胡同甲13号站西侧3层","lat":39.903954,"lng":116.4272,"deal":0,"distance":0,"area":"东城区","sellPrice":0,"poiId":52795616,"imax":0,"nm":"北京站电影院","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":14472},{"addr":"东城区交道口东大街85号区图书馆1楼","lat":39.941,"lng":116.413,"deal":0,"distance":0,"area":"东城区","sellPrice":0,"poiId":271413,"imax":0,"nm":"东城图书馆影剧院","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"东四","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":4541}],"大兴区":[{"addr":"大兴区永兴路7号院1号楼3F-Z2","lat":39.687492,"lng":116.3205,"deal":0,"distance":0,"area":"大兴区","sellPrice":14,"poiId":96251713,"imax":0,"nm":"SFC上影(大兴龙湖店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15915},{"addr":"大兴区金星西路3号绿地缤纷城购物中心4层","lat":39.764683,"lng":116.33354,"deal":0,"distance":0,"area":"大兴区","sellPrice":44,"poiId":1481117,"imax":0,"nm":"保利国际影城(绿地缤纷城店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"保利国际影城","dis":"绿地缤纷城","brdId":24472,"dealPrice":0,"referencePrice":70,"showCount":0,"id":2392},{"addr":"大兴区亦庄经济开发区文化园东路6号创意生活广场三层","lat":39.810535,"lng":116.50513,"deal":0,"distance":0,"area":"大兴区","sellPrice":28,"poiId":82601,"imax":0,"nm":"大料国际影城(创意生活广场店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"大料国际影城","dis":"亦庄","brdId":24930,"dealPrice":0,"referencePrice":80,"showCount":0,"id":34},{"addr":"大兴区黄村西大街15号","lat":39.7323,"lng":116.338005,"deal":0,"distance":0,"area":"大兴区","sellPrice":33,"poiId":324698,"imax":0,"nm":"大兴影剧院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"大兴剧院","dis":"黄村","brdId":381835,"dealPrice":0,"referencePrice":21,"showCount":0,"id":179},{"addr":"大兴区旧宫小红门路39号","lat":39.814774,"lng":116.454636,"deal":0,"distance":0,"area":"大兴区","sellPrice":23,"poiId":6685358,"imax":0,"nm":"嘉美国际影城(旧宫店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"嘉美国际影城","dis":"","brdId":352923,"dealPrice":0,"referencePrice":70,"showCount":0,"id":2598},{"addr":"大兴区欣宁街荟聚购物中心3层（地铁4号线西红门站A西出口站）","lat":39.78632,"lng":116.32738,"deal":0,"distance":0,"area":"大兴区","sellPrice":39,"poiId":40697227,"imax":1,"nm":"金逸影城(荟聚IMAX店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"金逸影城","dis":"","brdId":1079568,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10987},{"addr":"大兴区忠凉路万科广场5层","lat":39.80576,"lng":116.460175,"deal":0,"distance":0,"area":"大兴区","sellPrice":28,"poiId":93511270,"imax":0,"nm":"卢米埃影城(万科店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15773},{"addr":"大兴区经济技术开发区荣华中路8号院华联力宝购物中心四层","lat":39.806152,"lng":116.50166,"deal":0,"distance":0,"area":"大兴区","sellPrice":39,"poiId":5165994,"imax":0,"nm":"唐阁影城(亦庄店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":11132},{"addr":"大兴区黄村东大街火神庙国际商业中心E座5层","lat":39.72971,"lng":116.34167,"deal":1,"distance":0,"area":"大兴区","sellPrice":28,"poiId":86394,"imax":0,"nm":"新华国际影城(大兴店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"新华国际影城","dis":"黄村","brdId":29894,"dealPrice":36,"referencePrice":40,"showCount":0,"id":11},{"addr":"大兴区西红门镇京良路10号乐家购物中心B区3层","lat":39.799633,"lng":116.33217,"deal":0,"distance":0,"area":"大兴区","sellPrice":4.01,"poiId":2490890,"imax":0,"nm":"星美国际影城(西红门店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"星美国际影城","dis":"","brdId":30032,"dealPrice":0,"referencePrice":70,"showCount":0,"id":6057},{"addr":"大兴区欣旺北大街8号鸿坤广场6层（地铁4号线西红门站Ｂ口向东４００米路北）","lat":39.791393,"lng":116.340256,"deal":1,"distance":0,"area":"大兴区","sellPrice":38,"poiId":41278576,"imax":0,"nm":"耀莱成龙国际影城(西红门店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"","brdId":30227,"dealPrice":25,"referencePrice":0,"showCount":0,"id":11082},{"addr":"大兴区经济技术开发区科创五街38号C座3层F3-C3006","lat":39.803543,"lng":116.53282,"deal":0,"distance":0,"area":"大兴区","sellPrice":33,"poiId":93839693,"imax":0,"nm":"中传国际影城(亦庄店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15294},{"addr":"大兴区兴华大街百联清城购物中心3层北侧","lat":39.73894,"lng":116.33174,"deal":1,"distance":0,"area":"大兴区","sellPrice":28,"poiId":95968537,"imax":0,"nm":"最影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":29.6,"referencePrice":0,"showCount":0,"id":15018},{"addr":"大兴区东大路多维创新园内","lat":39.629345,"lng":116.38453,"deal":0,"distance":0,"area":"大兴区","sellPrice":0,"poiId":51400779,"imax":0,"nm":"玫瑰之约汽车影院(半壁店)","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":14054}],"丰台区":[{"addr":"丰台区南三环西路16号凯德大峡谷购物中心5楼","lat":39.854645,"lng":116.36706,"deal":0,"distance":0,"area":"丰台区","sellPrice":39,"poiId":339944,"imax":0,"nm":"保利国际影城(凯德MALL·大峡谷店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"保利国际影城","dis":"草桥","brdId":24472,"dealPrice":0,"referencePrice":40,"showCount":0,"id":42},{"addr":"丰台区东高地万源西里航天万源广场5层","lat":39.80296,"lng":116.423454,"deal":1,"distance":0,"area":"丰台区","sellPrice":39,"poiId":299479,"imax":0,"nm":"保利国际影城(万源店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"保利国际影城","dis":"东高地","brdId":24472,"dealPrice":27,"referencePrice":70,"showCount":0,"id":129},{"addr":"丰台区蒲黄榆路28号","lat":39.863983,"lng":116.42227,"deal":0,"distance":0,"area":"丰台区","sellPrice":49,"poiId":82556,"imax":0,"nm":"博纳国际影城(方庄店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"博纳国际影城","dis":"方庄","brdId":24595,"dealPrice":0,"referencePrice":80,"showCount":0,"id":43},{"addr":"丰台区果园8号楼临三环（木樨园桥-西南角欣雅汇生活广场6层）","lat":39.855907,"lng":116.397896,"deal":0,"distance":0,"area":"丰台区","sellPrice":38,"poiId":78978010,"imax":0,"nm":"大地影院(欣雅汇店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"大地影院","dis":"","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15070},{"addr":"丰台区马家堡东路101号院10号银泰百货6层","lat":39.84446,"lng":116.38594,"deal":0,"distance":0,"area":"丰台区","sellPrice":29,"poiId":1547150,"imax":1,"nm":"华谊兄弟影院(洋桥店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"华谊兄弟影院","dis":"","brdId":275830,"dealPrice":0,"referencePrice":80,"showCount":0,"id":2548},{"addr":"丰台区西四环南路86号","lat":39.851784,"lng":116.28421,"deal":0,"distance":0,"area":"丰台区","sellPrice":33,"poiId":271414,"imax":0,"nm":"青少年剧场","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":4542},{"addr":"丰台区角门路19号院2号楼华冠天地4层（原大万广场）","lat":39.836674,"lng":116.37848,"deal":0,"distance":0,"area":"丰台区","sellPrice":24,"poiId":5161700,"imax":0,"nm":"幸福蓝海国际影城(北京公益桥店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"幸福蓝海国际影城","dis":"","brdId":30053,"dealPrice":0,"referencePrice":0,"showCount":0,"id":8578},{"addr":"丰台区南三环东路成寿寺路2号新业广场2楼","lat":39.857136,"lng":116.44611,"deal":0,"distance":0,"area":"丰台区","sellPrice":14,"poiId":1436294,"imax":0,"nm":"星美国际影城(分钟寺店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"星美国际影城","dis":"方庄","brdId":30032,"dealPrice":0,"referencePrice":35,"showCount":0,"id":9},{"addr":"丰台区宋家庄顺八条4号政馨园三区5号楼底商正华商城地下一层","lat":39.845528,"lng":116.43179,"deal":0,"distance":0,"area":"丰台区","sellPrice":33,"poiId":82600,"imax":0,"nm":"正华影院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"正华影城","dis":"方庄","brdId":677942,"dealPrice":0,"referencePrice":60,"showCount":0,"id":63},{"addr":"丰台区靛场路千禧商业街4号楼","lat":39.889786,"lng":116.287766,"deal":0,"distance":0,"area":"丰台区","sellPrice":31.9,"poiId":6458108,"imax":0,"nm":"中影国际影城(丰台千禧街店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"中影国际影城","dis":"","brdId":23745,"dealPrice":0,"referencePrice":30,"showCount":0,"id":7634},{"addr":"丰台区丰葆路永旺梦乐城4层","lat":39.817265,"lng":116.292496,"deal":0,"distance":0,"area":"丰台区","sellPrice":31.9,"poiId":77423086,"imax":0,"nm":"中影国际影城(丰台永旺店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":14384},{"addr":"丰台区开阳路8号悦秀城6层","lat":39.86373,"lng":116.36722,"deal":0,"distance":0,"area":"丰台区","sellPrice":0,"poiId":94444126,"imax":0,"nm":"DMG国际影城(悦秀店)","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15859},{"addr":"丰台区市辖区丰台区西四环南路38号-1","lat":39.856148,"lng":116.28398,"deal":0,"distance":0,"area":"丰台区","sellPrice":0,"poiId":95577364,"imax":0,"nm":"北京中鼎兆通信息科技电影放映中心影院","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15271}],"西城区":[{"addr":"西城区西直门南小街68号","lat":39.93531,"lng":116.35955,"deal":0,"distance":0,"area":"西城区","sellPrice":38,"poiId":271434,"imax":0,"nm":"北京青年宫","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"西直门","brdId":0,"dealPrice":0,"referencePrice":50,"showCount":0,"id":260},{"addr":"西城区前门大街大栅栏街36号","lat":39.895596,"lng":116.39515,"deal":0,"distance":0,"area":"西城区","sellPrice":34,"poiId":89010,"imax":0,"nm":"大观楼电影院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"大观楼影城","dis":"大栅栏","brdId":392770,"dealPrice":0,"referencePrice":60,"showCount":0,"id":263},{"addr":"西城区西四羊肉胡同30号（中国地质博物馆南侧）","lat":39.922535,"lng":116.371346,"deal":0,"distance":0,"area":"西城区","sellPrice":38,"poiId":89006,"imax":0,"nm":"地质礼堂","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"地质礼堂","dis":"西四","brdId":368740,"dealPrice":0,"referencePrice":50,"showCount":0,"id":261},{"addr":"西城区白广路8号","lat":39.88407,"lng":116.35917,"deal":0,"distance":0,"area":"西城区","sellPrice":39,"poiId":82592,"imax":0,"nm":"广安门电影院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"广内大街","brdId":0,"dealPrice":0,"referencePrice":40,"showCount":0,"id":247},{"addr":"西城区月坛南街24号（近万方商场）","lat":39.913624,"lng":116.34325,"deal":0,"distance":0,"area":"西城区","sellPrice":43,"poiId":274294,"imax":0,"nm":"国宾菁英电影院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"月坛","brdId":0,"dealPrice":0,"referencePrice":40,"showCount":0,"id":255},{"addr":"西城区虎坊路口南7号","lat":39.888065,"lng":116.38378,"deal":0,"distance":0,"area":"西城区","sellPrice":33,"poiId":1436438,"imax":0,"nm":"工人俱乐部电影院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"虎坊桥","brdId":0,"dealPrice":0,"referencePrice":60,"showCount":0,"id":237},{"addr":"西城区金融大街18号地下一层","lat":39.9151,"lng":116.36,"deal":0,"distance":0,"area":"西城区","sellPrice":46,"poiId":1541415,"imax":0,"nm":"首都电影院(金融街店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"首都电影院","dis":"复兴门","brdId":1162239,"dealPrice":0,"referencePrice":80,"showCount":0,"id":1625},{"addr":"西城区西单北大街131号大悦城10楼","lat":39.91066,"lng":116.373665,"deal":0,"distance":0,"area":"西城区","sellPrice":44,"poiId":283722,"imax":0,"nm":"首都电影院(西单店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"首都电影院","dis":"西单","brdId":1162239,"dealPrice":0,"referencePrice":60,"showCount":0,"id":149},{"addr":"西城区天桥南大街3号楼一层、二层","lat":39.884457,"lng":116.39819,"deal":0,"distance":0,"area":"西城区","sellPrice":39,"poiId":93439511,"imax":0,"nm":"首都电影院(中华店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15270},{"addr":"西城区马连道路25号新年华生活购物广场5层","lat":39.877544,"lng":116.32643,"deal":1,"distance":0,"area":"西城区","sellPrice":38,"poiId":2393654,"imax":0,"nm":"耀莱成龙国际影城(马连道店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"","brdId":30227,"dealPrice":30,"referencePrice":70,"showCount":0,"id":5278},{"addr":"西城区新街口北大街74号（近北京科学教育电影制片厂院内）","lat":39.94392,"lng":116.37328,"deal":0,"distance":0,"area":"西城区","sellPrice":0,"poiId":73944402,"imax":0,"nm":"剧空间剧场","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":14387},{"addr":"西城区西单北大街180号西单文化广场","lat":39.90875,"lng":116.37512,"deal":0,"distance":0,"area":"西城区","sellPrice":0,"poiId":271397,"imax":0,"nm":"西单4D数字影院","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"西单4d数字影院","dis":"西单","brdId":2876716,"dealPrice":0,"referencePrice":70,"showCount":0,"id":137},{"addr":"西城区西直门内大街69号","lat":39.94168,"lng":116.37024,"deal":0,"distance":0,"area":"西城区","sellPrice":0,"poiId":82590,"imax":0,"nm":"新街口电影院","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"新街口电影院","dis":"西直门","brdId":593182,"dealPrice":0,"referencePrice":50,"showCount":0,"id":243}],"通州区":[{"addr":"通州区杨庄北里52号华联天时名苑购物中心4楼（近通州北苑地铁站）","lat":39.903496,"lng":116.6367,"deal":0,"distance":0,"area":"通州区","sellPrice":39,"poiId":363447,"imax":0,"nm":"博纳国际影城(通州北苑店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"博纳国际影城","dis":"新华联","brdId":24595,"dealPrice":0,"referencePrice":80,"showCount":0,"id":2},{"addr":"通州区八通线土桥地铁站向东900米华远好天地购物中心3层","lat":39.86987,"lng":116.697586,"deal":1,"distance":0,"area":"通州区","sellPrice":34,"poiId":51455681,"imax":0,"nm":"博纳国际影城(通州土桥店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":29,"referencePrice":0,"showCount":0,"id":14381},{"addr":"通州区马驹桥镇百尚生活广场3楼","lat":39.752598,"lng":116.54536,"deal":1,"distance":0,"area":"通州区","sellPrice":28,"poiId":2371476,"imax":0,"nm":"百尚影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"百尚影城","dis":"","brdId":825664,"dealPrice":25,"referencePrice":0,"showCount":0,"id":6227},{"addr":"通州区马驹桥新海东路1号（豪润生活广场7层）","lat":39.760098,"lng":116.545555,"deal":0,"distance":0,"area":"通州区","sellPrice":33,"poiId":6151046,"imax":0,"nm":"大地影城(米拉店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"大地影院","dis":"","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":8301},{"addr":"通州区运河西大街乔庄卜蜂莲花超市一层","lat":39.891575,"lng":116.68774,"deal":1,"distance":0,"area":"通州区","sellPrice":33,"poiId":4800806,"imax":0,"nm":"佳合时光影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":30,"referencePrice":0,"showCount":0,"id":8654},{"addr":"通州区西海子西塔胡同1号","lat":39.912743,"lng":116.66441,"deal":0,"distance":0,"area":"通州区","sellPrice":23,"poiId":82560,"imax":0,"nm":"通州区电影院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"通州区电影院","dis":"德外大街","brdId":1041607,"dealPrice":0,"referencePrice":60,"showCount":0,"id":178},{"addr":"通州区新华西街58号万达广场1号楼5层（厨艺宾馆对面）","lat":39.905937,"lng":116.64272,"deal":0,"distance":0,"area":"通州区","sellPrice":43,"poiId":41521114,"imax":1,"nm":"万达国际影城(通州万达店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"万达影城","dis":"","brdId":102642,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10837},{"addr":"通州区临河里33号楼华业玫瑰商业中心D2号楼三层","lat":39.88119,"lng":116.68255,"deal":1,"distance":0,"area":"通州区","sellPrice":23,"poiId":92950934,"imax":0,"nm":"耀莱成龙国际影城(临河里店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"","brdId":30227,"dealPrice":25,"referencePrice":0,"showCount":0,"id":14634},{"addr":"通州区翠景北里21号京通罗斯福广场5F","lat":39.88967,"lng":116.659225,"deal":0,"distance":0,"area":"通州区","sellPrice":38,"poiId":6139543,"imax":0,"nm":"银兴乐天影城(通州店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"乐天影城","dis":"","brdId":157630,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10964},{"addr":"通州区永顺镇芙蓉园513号楼","lat":39.919525,"lng":116.677376,"deal":0,"distance":0,"area":"通州区","sellPrice":0,"poiId":99968119,"imax":0,"nm":"北京东融国际影城(月亮河店)","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15421},{"addr":"通州区台湖镇创业园路8号（近京沈高速台湖入口）","lat":39.84602,"lng":116.62319,"deal":0,"distance":0,"area":"通州区","sellPrice":0,"poiId":358821,"imax":0,"nm":"牛仔汽车电影院","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"梨园","brdId":0,"dealPrice":0,"referencePrice":10,"showCount":0,"id":36}],"昌平区":[{"addr":"昌平区黄平路19号院3号楼龙旗广场购物中心3层（地铁8号线育新站路北600米，近永辉超市）","lat":40.066605,"lng":116.34672,"deal":1,"distance":0,"area":"昌平区","sellPrice":39,"poiId":3320660,"imax":0,"nm":"保利国际影城(龙旗广场店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"保利国际影城","dis":"回龙观","brdId":24472,"dealPrice":40,"referencePrice":100,"showCount":0,"id":5502},{"addr":"昌平区鼓楼南大街6号佳莲时代广场4楼（近鼓楼西街）","lat":40.223534,"lng":116.23402,"deal":0,"distance":0,"area":"昌平区","sellPrice":33,"poiId":361208,"imax":0,"nm":"昌平保利影剧院(佳莲时代广场店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"昌平镇","brdId":0,"dealPrice":0,"referencePrice":80,"showCount":0,"id":50},{"addr":"昌平区昌崔路203号果岭假日广场四楼","lat":40.222176,"lng":116.264755,"deal":0,"distance":0,"area":"昌平区","sellPrice":28,"poiId":1432377,"imax":0,"nm":"大地影院(昌平菓岭店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"大地影院","dis":"昌平镇","brdId":384262,"dealPrice":0,"referencePrice":40,"showCount":0,"id":66},{"addr":"昌平区南环路10号院1号楼悦荟万科广场8层","lat":40.2124,"lng":116.24026,"deal":0,"distance":0,"area":"昌平区","sellPrice":38,"poiId":373237,"imax":0,"nm":"首都电影院(悦荟万科广场店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"首都电影院","dis":"","brdId":1162239,"dealPrice":0,"referencePrice":0,"showCount":0,"id":8186},{"addr":"昌平区立汤路186号龙德广场5层","lat":40.060596,"lng":116.41618,"deal":0,"distance":0,"area":"昌平区","sellPrice":43,"poiId":30864,"imax":1,"nm":"万达国际影城(龙德广场店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"万达影城","dis":"天通苑","brdId":102642,"dealPrice":0,"referencePrice":80,"showCount":0,"id":151},{"addr":"昌平区回龙观同成街华联购物中心四楼（城铁回龙观站出口对面）","lat":40.071976,"lng":116.33717,"deal":1,"distance":0,"area":"昌平区","sellPrice":38,"poiId":4058821,"imax":0,"nm":"沃美影城(回龙观店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"沃美影城","dis":"","brdId":29462,"dealPrice":40,"referencePrice":0,"showCount":0,"id":9647},{"addr":"昌平区回龙观西大街111号华联商场3楼","lat":40.07596,"lng":116.31944,"deal":0,"distance":0,"area":"昌平区","sellPrice":14,"poiId":286187,"imax":0,"nm":"星美国际影城(回龙观店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"星美国际影城","dis":"回龙观","brdId":30032,"dealPrice":0,"referencePrice":40,"showCount":0,"id":140},{"addr":"昌平区北清路1号永旺国际商城3楼","lat":40.09749,"lng":116.28857,"deal":0,"distance":0,"area":"昌平区","sellPrice":36.9,"poiId":82598,"imax":0,"nm":"中影国际影城(昌平永旺店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"中影国际影城","dis":"回龙观","brdId":23745,"dealPrice":0,"referencePrice":23,"showCount":0,"id":107}],"房山区":[{"addr":"房山区黄辛庄路口绿地缤纷城3层","lat":39.756683,"lng":116.160515,"deal":0,"distance":0,"area":"房山区","sellPrice":39,"poiId":52294367,"imax":0,"nm":"SFC上影(房山店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13618},{"addr":"房山区广阳新路9号院1号楼中粮万科半岛购物广场3层","lat":39.753548,"lng":116.21099,"deal":1,"distance":0,"area":"房山区","sellPrice":39,"poiId":40470614,"imax":0,"nm":"幸福蓝海国际影城(北京房山店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"幸福蓝海国际影城","dis":"","brdId":30053,"dealPrice":33,"referencePrice":0,"showCount":0,"id":13028},{"addr":"房山区良乡北关西路14号华冠购物中心五层","lat":39.73469,"lng":116.13953,"deal":0,"distance":0,"area":"房山区","sellPrice":38,"poiId":299222,"imax":0,"nm":"新华国际影城(房山店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"新华国际影城","dis":"房山","brdId":29894,"dealPrice":0,"referencePrice":60,"showCount":0,"id":131},{"addr":"房山区燕山岗南路3号","lat":39.72787,"lng":115.96215,"deal":1,"distance":0,"area":"房山区","sellPrice":33,"poiId":271449,"imax":0,"nm":"燕山影剧院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"燕山影剧院","dis":"房山","brdId":777439,"dealPrice":35,"referencePrice":35,"showCount":0,"id":60},{"addr":"房山区迎风街道岗南路9号","lat":39.72558,"lng":115.96181,"deal":0,"distance":0,"area":"房山区","sellPrice":0,"poiId":99082156,"imax":0,"nm":"北京燕山文化活动中心影院","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15272},{"addr":"房山区兴房大街38号华冠欢乐城四楼","lat":39.69285,"lng":115.98708,"deal":1,"distance":0,"area":"房山区","sellPrice":38,"poiId":5252975,"imax":0,"nm":"环球国际影城","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":26,"referencePrice":0,"showCount":0,"id":9370},{"addr":"房山区良乡拱辰大街31号","lat":39.73799,"lng":116.141685,"deal":0,"distance":0,"area":"房山区","sellPrice":0,"poiId":1436368,"imax":0,"nm":"良乡影剧院","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"良乡影剧院","dis":"房山","brdId":949172,"dealPrice":0,"referencePrice":30,"showCount":0,"id":145}],"顺义区":[{"addr":"顺义区新顺南大街8号华联购物中心4层CGV星聚汇国际影城","lat":40.12897,"lng":116.65173,"deal":0,"distance":0,"area":"顺义区","sellPrice":33,"poiId":6448554,"imax":0,"nm":"CGV星聚汇影城(顺义店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"CGV星聚汇影城","dis":"","brdId":2020418,"dealPrice":0,"referencePrice":0,"showCount":0,"id":8111},{"addr":"顺义区新顺南大街18号新世界百货七层","lat":40.126575,"lng":116.65212,"deal":0,"distance":0,"area":"顺义区","sellPrice":44,"poiId":1437402,"imax":0,"nm":"博纳国际影城(顺义店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"博纳国际影城","dis":"顺义","brdId":24595,"dealPrice":0,"referencePrice":70,"showCount":0,"id":69},{"addr":"顺义区安泰大街9号院7号楼二层（祥云小镇内）","lat":40.09027,"lng":116.53684,"deal":0,"distance":0,"area":"顺义区","sellPrice":34.5,"poiId":40420215,"imax":0,"nm":"橙天嘉禾影城(祥云小镇店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"橙天嘉禾影城","dis":"","brdId":24745,"dealPrice":0,"referencePrice":0,"showCount":0,"id":11102},{"addr":"顺义区新顺南大街11号隆华购物中心6F","lat":40.125973,"lng":116.650536,"deal":0,"distance":0,"area":"顺义区","sellPrice":33,"poiId":41599879,"imax":0,"nm":"大地影院(顺义隆华店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"大地影院","dis":"","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":12394},{"addr":"顺义区新顺北大街3号","lat":40.1338,"lng":116.650375,"deal":1,"distance":0,"area":"顺义区","sellPrice":33,"poiId":89018,"imax":0,"nm":"顺义影剧院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"顺义影剧院","dis":"顺义","brdId":1148935,"dealPrice":25,"referencePrice":30,"showCount":0,"id":180}],"门头沟区":[{"addr":"门头沟区新桥大街12号","lat":39.9425,"lng":116.10049,"deal":0,"distance":0,"area":"门头沟区","sellPrice":33,"poiId":3260641,"imax":0,"nm":"门头沟影剧院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"门头沟","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":182},{"addr":"门头沟区永定镇冯村华润购物中心2层","lat":39.91212,"lng":116.11124,"deal":1,"distance":0,"area":"门头沟区","sellPrice":48,"poiId":42297501,"imax":0,"nm":"幸福蓝海影城(门头沟店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"幸福蓝海国际影城","dis":"","brdId":30053,"dealPrice":35.9,"referencePrice":0,"showCount":0,"id":10570},{"addr":"门头沟区双峪路35号熙旺生活广场B座6层","lat":39.93551,"lng":116.11315,"deal":0,"distance":0,"area":"门头沟区","sellPrice":50,"poiId":40550440,"imax":0,"nm":"熙旺国际影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10979}],"石景山区":[{"addr":"石景山区阜石路300号喜隆多三层","lat":39.92295,"lng":116.17175,"deal":0,"distance":0,"area":"石景山区","sellPrice":38,"poiId":6596632,"imax":0,"nm":"保利国际影城(苹果园店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"保利国际影城","dis":"","brdId":24472,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10294},{"addr":"石景山区古城南路15号","lat":39.9112,"lng":116.19126,"deal":1,"distance":0,"area":"石景山区","sellPrice":33,"poiId":82589,"imax":0,"nm":"古城电影院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"古城电影院","dis":"古城","brdId":302869,"dealPrice":30,"referencePrice":0,"showCount":0,"id":246},{"addr":"石景山区石景山路乙18号万达广场娱乐楼4楼","lat":39.905945,"lng":116.22568,"deal":0,"distance":0,"area":"石景山区","sellPrice":43,"poiId":298683,"imax":1,"nm":"万达国际影城(石景山店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"万达影城","dis":"鲁谷","brdId":102642,"dealPrice":0,"referencePrice":80,"showCount":0,"id":133}],"怀柔区":[{"addr":"怀柔区青春路15号四层","lat":40.317955,"lng":116.62985,"deal":0,"distance":0,"area":"怀柔区","sellPrice":43,"poiId":3260663,"imax":0,"nm":"传奇瑞丽影城","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"怀柔","brdId":0,"dealPrice":0,"referencePrice":35,"showCount":0,"id":55},{"addr":"怀柔区富乐大街8号","lat":40.34083,"lng":116.64014,"deal":0,"distance":0,"area":"怀柔区","sellPrice":0,"poiId":1541434,"imax":0,"nm":"怀柔区电影院","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"怀柔","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":2378},{"addr":"怀柔区雁栖湖路1号","lat":40.392265,"lng":116.67963,"deal":0,"distance":0,"area":"怀柔区","sellPrice":0,"poiId":94728699,"imax":0,"nm":"米珈尼汽车影院","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"其它","dis":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15748}],"平谷区":[{"addr":"平谷区迎宾路1号院22号楼五层F5-13","lat":40.14356,"lng":117.093155,"deal":0,"distance":0,"area":"平谷区","sellPrice":43,"poiId":97314976,"imax":0,"nm":"华联国际影城(平谷店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"耀莱成龙国际影城","dis":"","brdId":30227,"dealPrice":0,"referencePrice":0,"showCount":0,"id":15082},{"addr":"平谷区府前街3号","lat":40.14054,"lng":117.1224,"deal":0,"distance":0,"area":"平谷区","sellPrice":0,"poiId":1156598,"imax":0,"nm":"平谷区影剧院","ct":"","sellmin":0,"sell":false,"preferential":0,"follow":0,"brd":"平谷区影剧院","dis":"平谷","brdId":505125,"dealPrice":0,"referencePrice":0,"showCount":0,"id":2379}],"密云县":[{"addr":"密云县鼓楼西大街1号","lat":40.377117,"lng":116.84507,"deal":0,"distance":0,"area":"密云县","sellPrice":33,"poiId":1436412,"imax":0,"nm":"密云大剧院","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"其它","dis":"密云县","brdId":0,"dealPrice":0,"referencePrice":60,"showCount":0,"id":183}],"延庆县":[{"addr":"延庆县妫水北街39号1幢H座首楼金锣湾商业中心沃尔玛旁","lat":40.461918,"lng":115.97629,"deal":0,"distance":0,"area":"延庆县","sellPrice":38,"poiId":1366944,"imax":0,"nm":"大地影院(延庆金锣湾店)","ct":"","sellmin":0,"sell":true,"preferential":0,"follow":0,"brd":"大地影院","dis":"延庆","brdId":384262,"dealPrice":0,"referencePrice":40,"showCount":0,"id":13}]}
     */

    private double status;
    private DataBean data;

    public static CinnmaBeanT objectFromData(String str) {

        return new Gson().fromJson(str, CinnmaBeanT.class);
    }

    public ControlBean getControl() {
        return control;
    }

    public void setControl(ControlBean control) {
        this.control = control;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ControlBean {
        private double expires;

        public static ControlBean objectFromData(String str) {

            return new Gson().fromJson(str, ControlBean.class);
        }

        public double getExpires() {
            return expires;
        }

        public void setExpires(double expires) {
            this.expires = expires;
        }
    }

    public static class DataBean {
        /**
         * addr : 朝阳区京顺路111号比如世界购物中心1层（近太阳宫北街）
         * lat : 39.9684
         * lng : 116.46204
         * deal : 0
         * distance : 0
         * area : 朝阳区
         * sellPrice : 28
         * poiId : 75603
         * imax : 0
         * nm : 17.5影城(比如世界店)
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 17.5影城
         * dis : 望京
         * brdId : 23854
         * dealPrice : 0
         * referencePrice : 70
         * showCount : 0
         * id : 48
         */

        private List<朝阳区Bean> 朝阳区;
        /**
         * addr : 海淀区文慧园路9号今典花园9号楼空间蒙太奇大厦1层
         * lat : 39.95334
         * lng : 116.36104
         * deal : 1
         * distance : 0
         * area : 海淀区
         * sellPrice : 44
         * poiId : 273950
         * imax : 0
         * nm : 17.5影城(今典花园店)
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 17.5影城
         * dis : 北太平庄
         * brdId : 23854
         * dealPrice : 30
         * referencePrice : 60
         * showCount : 0
         * id : 154
         */

        private List<海淀区Bean> 海淀区;
        /**
         * addr : 东城区北三环安贞桥环球贸易中心E座
         * lat : 39.966072
         * lng : 116.41096
         * deal : 0
         * distance : 0
         * area : 东城区
         * sellPrice : 39.5
         * poiId : 94496
         * imax : 0
         * nm : UME国际影城(安贞店)
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : UME国际影城
         * dis : 安贞
         * brdId : 24071
         * dealPrice : 0
         * referencePrice : 70
         * showCount : 0
         * id : 99
         */

        private List<东城区Bean> 东城区;
        /**
         * addr : 大兴区永兴路7号院1号楼3F-Z2
         * lat : 39.687492
         * lng : 116.3205
         * deal : 0
         * distance : 0
         * area : 大兴区
         * sellPrice : 14
         * poiId : 96251713
         * imax : 0
         * nm : SFC上影(大兴龙湖店)
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 其它
         * dis : 
         * brdId : 0
         * dealPrice : 0
         * referencePrice : 0
         * showCount : 0
         * id : 15915
         */

        private List<大兴区Bean> 大兴区;
        /**
         * addr : 丰台区南三环西路16号凯德大峡谷购物中心5楼
         * lat : 39.854645
         * lng : 116.36706
         * deal : 0
         * distance : 0
         * area : 丰台区
         * sellPrice : 39
         * poiId : 339944
         * imax : 0
         * nm : 保利国际影城(凯德MALL·大峡谷店)
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 保利国际影城
         * dis : 草桥
         * brdId : 24472
         * dealPrice : 0
         * referencePrice : 40
         * showCount : 0
         * id : 42
         */

        private List<丰台区Bean> 丰台区;
        /**
         * addr : 西城区西直门南小街68号
         * lat : 39.93531
         * lng : 116.35955
         * deal : 0
         * distance : 0
         * area : 西城区
         * sellPrice : 38
         * poiId : 271434
         * imax : 0
         * nm : 北京青年宫
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 其它
         * dis : 西直门
         * brdId : 0
         * dealPrice : 0
         * referencePrice : 50
         * showCount : 0
         * id : 260
         */

        private List<西城区Bean> 西城区;
        /**
         * addr : 通州区杨庄北里52号华联天时名苑购物中心4楼（近通州北苑地铁站）
         * lat : 39.903496
         * lng : 116.6367
         * deal : 0
         * distance : 0
         * area : 通州区
         * sellPrice : 39
         * poiId : 363447
         * imax : 0
         * nm : 博纳国际影城(通州北苑店)
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 博纳国际影城
         * dis : 新华联
         * brdId : 24595
         * dealPrice : 0
         * referencePrice : 80
         * showCount : 0
         * id : 2
         */

        private List<通州区Bean> 通州区;
        /**
         * addr : 昌平区黄平路19号院3号楼龙旗广场购物中心3层（地铁8号线育新站路北600米，近永辉超市）
         * lat : 40.066605
         * lng : 116.34672
         * deal : 1
         * distance : 0
         * area : 昌平区
         * sellPrice : 39
         * poiId : 3320660
         * imax : 0
         * nm : 保利国际影城(龙旗广场店)
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 保利国际影城
         * dis : 回龙观
         * brdId : 24472
         * dealPrice : 40
         * referencePrice : 100
         * showCount : 0
         * id : 5502
         */

        private List<昌平区Bean> 昌平区;
        /**
         * addr : 房山区黄辛庄路口绿地缤纷城3层
         * lat : 39.756683
         * lng : 116.160515
         * deal : 0
         * distance : 0
         * area : 房山区
         * sellPrice : 39
         * poiId : 52294367
         * imax : 0
         * nm : SFC上影(房山店)
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 其它
         * dis : 
         * brdId : 0
         * dealPrice : 0
         * referencePrice : 0
         * showCount : 0
         * id : 13618
         */

        private List<房山区Bean> 房山区;
        /**
         * addr : 顺义区新顺南大街8号华联购物中心4层CGV星聚汇国际影城
         * lat : 40.12897
         * lng : 116.65173
         * deal : 0
         * distance : 0
         * area : 顺义区
         * sellPrice : 33
         * poiId : 6448554
         * imax : 0
         * nm : CGV星聚汇影城(顺义店)
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : CGV星聚汇影城
         * dis : 
         * brdId : 2020418
         * dealPrice : 0
         * referencePrice : 0
         * showCount : 0
         * id : 8111
         */

        private List<顺义区Bean> 顺义区;
        /**
         * addr : 门头沟区新桥大街12号
         * lat : 39.9425
         * lng : 116.10049
         * deal : 0
         * distance : 0
         * area : 门头沟区
         * sellPrice : 33
         * poiId : 3260641
         * imax : 0
         * nm : 门头沟影剧院
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 其它
         * dis : 门头沟
         * brdId : 0
         * dealPrice : 0
         * referencePrice : 0
         * showCount : 0
         * id : 182
         */

        private List<门头沟区Bean> 门头沟区;
        /**
         * addr : 石景山区阜石路300号喜隆多三层
         * lat : 39.92295
         * lng : 116.17175
         * deal : 0
         * distance : 0
         * area : 石景山区
         * sellPrice : 38
         * poiId : 6596632
         * imax : 0
         * nm : 保利国际影城(苹果园店)
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 保利国际影城
         * dis : 
         * brdId : 24472
         * dealPrice : 0
         * referencePrice : 0
         * showCount : 0
         * id : 10294
         */

        private List<石景山区Bean> 石景山区;
        /**
         * addr : 怀柔区青春路15号四层
         * lat : 40.317955
         * lng : 116.62985
         * deal : 0
         * distance : 0
         * area : 怀柔区
         * sellPrice : 43
         * poiId : 3260663
         * imax : 0
         * nm : 传奇瑞丽影城
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 其它
         * dis : 怀柔
         * brdId : 0
         * dealPrice : 0
         * referencePrice : 35
         * showCount : 0
         * id : 55
         */

        private List<怀柔区Bean> 怀柔区;
        /**
         * addr : 平谷区迎宾路1号院22号楼五层F5-13
         * lat : 40.14356
         * lng : 117.093155
         * deal : 0
         * distance : 0
         * area : 平谷区
         * sellPrice : 43
         * poiId : 97314976
         * imax : 0
         * nm : 华联国际影城(平谷店)
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 耀莱成龙国际影城
         * dis : 
         * brdId : 30227
         * dealPrice : 0
         * referencePrice : 0
         * showCount : 0
         * id : 15082
         */

        private List<平谷区Bean> 平谷区;
        /**
         * addr : 密云县鼓楼西大街1号
         * lat : 40.377117
         * lng : 116.84507
         * deal : 0
         * distance : 0
         * area : 密云县
         * sellPrice : 33
         * poiId : 1436412
         * imax : 0
         * nm : 密云大剧院
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 其它
         * dis : 密云县
         * brdId : 0
         * dealPrice : 0
         * referencePrice : 60
         * showCount : 0
         * id : 183
         */

        private List<密云县Bean> 密云县;
        /**
         * addr : 延庆县妫水北街39号1幢H座首楼金锣湾商业中心沃尔玛旁
         * lat : 40.461918
         * lng : 115.97629
         * deal : 0
         * distance : 0
         * area : 延庆县
         * sellPrice : 38
         * poiId : 1366944
         * imax : 0
         * nm : 大地影院(延庆金锣湾店)
         * ct : 
         * sellmin : 0
         * sell : true
         * preferential : 0
         * follow : 0
         * brd : 大地影院
         * dis : 延庆
         * brdId : 384262
         * dealPrice : 0
         * referencePrice : 40
         * showCount : 0
         * id : 13
         */

        private List<延庆县Bean> 延庆县;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public List<朝阳区Bean> get朝阳区() {
            return 朝阳区;
        }

        public void set朝阳区(List<朝阳区Bean> 朝阳区) {
            this.朝阳区 = 朝阳区;
        }

        public List<海淀区Bean> get海淀区() {
            return 海淀区;
        }

        public void set海淀区(List<海淀区Bean> 海淀区) {
            this.海淀区 = 海淀区;
        }

        public List<东城区Bean> get东城区() {
            return 东城区;
        }

        public void set东城区(List<东城区Bean> 东城区) {
            this.东城区 = 东城区;
        }

        public List<大兴区Bean> get大兴区() {
            return 大兴区;
        }

        public void set大兴区(List<大兴区Bean> 大兴区) {
            this.大兴区 = 大兴区;
        }

        public List<丰台区Bean> get丰台区() {
            return 丰台区;
        }

        public void set丰台区(List<丰台区Bean> 丰台区) {
            this.丰台区 = 丰台区;
        }

        public List<西城区Bean> get西城区() {
            return 西城区;
        }

        public void set西城区(List<西城区Bean> 西城区) {
            this.西城区 = 西城区;
        }

        public List<通州区Bean> get通州区() {
            return 通州区;
        }

        public void set通州区(List<通州区Bean> 通州区) {
            this.通州区 = 通州区;
        }

        public List<昌平区Bean> get昌平区() {
            return 昌平区;
        }

        public void set昌平区(List<昌平区Bean> 昌平区) {
            this.昌平区 = 昌平区;
        }

        public List<房山区Bean> get房山区() {
            return 房山区;
        }

        public void set房山区(List<房山区Bean> 房山区) {
            this.房山区 = 房山区;
        }

        public List<顺义区Bean> get顺义区() {
            return 顺义区;
        }

        public void set顺义区(List<顺义区Bean> 顺义区) {
            this.顺义区 = 顺义区;
        }

        public List<门头沟区Bean> get门头沟区() {
            return 门头沟区;
        }

        public void set门头沟区(List<门头沟区Bean> 门头沟区) {
            this.门头沟区 = 门头沟区;
        }

        public List<石景山区Bean> get石景山区() {
            return 石景山区;
        }

        public void set石景山区(List<石景山区Bean> 石景山区) {
            this.石景山区 = 石景山区;
        }

        public List<怀柔区Bean> get怀柔区() {
            return 怀柔区;
        }

        public void set怀柔区(List<怀柔区Bean> 怀柔区) {
            this.怀柔区 = 怀柔区;
        }

        public List<平谷区Bean> get平谷区() {
            return 平谷区;
        }

        public void set平谷区(List<平谷区Bean> 平谷区) {
            this.平谷区 = 平谷区;
        }

        public List<密云县Bean> get密云县() {
            return 密云县;
        }

        public void set密云县(List<密云县Bean> 密云县) {
            this.密云县 = 密云县;
        }

        public List<延庆县Bean> get延庆县() {
            return 延庆县;
        }

        public void set延庆县(List<延庆县Bean> 延庆县) {
            this.延庆县 = 延庆县;
        }

        public static class 朝阳区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private float sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private float dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 朝阳区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 朝阳区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public float getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(float sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public float getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(float dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 海淀区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 海淀区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 海淀区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 东城区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 东城区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 东城区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 大兴区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 大兴区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 大兴区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 丰台区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 丰台区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 丰台区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 西城区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 西城区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 西城区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 通州区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 通州区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 通州区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 昌平区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 昌平区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 昌平区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 房山区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 房山区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 房山区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 顺义区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 顺义区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 顺义区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 门头沟区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 门头沟区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 门头沟区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 石景山区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 石景山区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 石景山区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 怀柔区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 怀柔区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 怀柔区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 平谷区Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 平谷区Bean objectFromData(String str) {

                return new Gson().fromJson(str, 平谷区Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 密云县Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 密云县Bean objectFromData(String str) {

                return new Gson().fromJson(str, 密云县Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }

        public static class 延庆县Bean {
            private String addr;
            private double lat;
            private double lng;
            private double deal;
            private double distance;
            private String area;
            private double sellPrice;
            private double poiId;
            private double imax;
            private String nm;
            private String ct;
            private double sellmin;
            private boolean sell;
            private double preferential;
            private double follow;
            private String brd;
            private String dis;
            private double brdId;
            private double dealPrice;
            private double referencePrice;
            private double showCount;
            private double id;

            public static 延庆县Bean objectFromData(String str) {

                return new Gson().fromJson(str, 延庆县Bean.class);
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getDeal() {
                return deal;
            }

            public void setDeal(double deal) {
                this.deal = deal;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public double getPoiId() {
                return poiId;
            }

            public void setPoiId(double poiId) {
                this.poiId = poiId;
            }

            public double getImax() {
                return imax;
            }

            public void setImax(double imax) {
                this.imax = imax;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellmin() {
                return sellmin;
            }

            public void setSellmin(double sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public double getPreferential() {
                return preferential;
            }

            public void setPreferential(double preferential) {
                this.preferential = preferential;
            }

            public double getFollow() {
                return follow;
            }

            public void setFollow(double follow) {
                this.follow = follow;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public double getBrdId() {
                return brdId;
            }

            public void setBrdId(double brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public double getShowCount() {
                return showCount;
            }

            public void setShowCount(double showCount) {
                this.showCount = showCount;
            }

            public double getId() {
                return id;
            }

            public void setId(double id) {
                this.id = id;
            }
        }
    }
}
