package com.atguigu.kieye.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：张爽 on 2016/6/28 20:11
 * 邮箱：18330118276@163.com
 */
public class HotPagerBeam {


    /**
     * expires : 1800
     */

    private ControlBean control;
    /**
     * control : {"expires":1800}
     * status : 0
     * data : {"hasNext":false,"movies":[{"showInfo":"今天153家影院放映1915场","cnms":0,"sn":0,"late":false,"vd":"","dir":"朱浩伟","star":"杰西·艾森伯格,马克·鲁法洛,伍迪·哈里森","cat":"动作,喜剧,惊悚","wish":513937,"3d":true,"pn":248,"preSale":0,"imax":false,"snum":122055,"nm":"惊天魔盗团2","dur":126,"img":"http://p1.meituan.net/165.220/movie/2e0b5b5c6c086cc93068fbc212f9f6b0142193.jpg","showDate":"","src":"","scm":"周董变魔术，敌人挡不住","sc":8.5,"ver":"2D/3D/中国巨幕","rt":"2016-06-24上映","time":"","id":246333},{"showInfo":"今天150家影院放映1716场","cnms":0,"sn":0,"late":false,"vd":"","dir":"罗兰·艾默里奇","star":"利亚姆·海姆斯沃斯,杰夫·高布伦,杰西·厄舍","cat":"动作,冒险,科幻","wish":164747,"3d":true,"pn":226,"preSale":0,"imax":true,"snum":93186,"nm":"独立日：卷土重来","dur":120,"img":"http://p1.meituan.net/165.220/movie/b408a9322cd0da51d4bdd3261ba3d1c0278866.jpg","showDate":"","src":"","scm":"外星再入侵，地核将燃尽","sc":8.5,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-24上映","time":"","id":246375},{"showInfo":"今天148家影院放映743场","cnms":0,"sn":0,"late":false,"vd":"","dir":"杜琪峰","star":"赵薇,古天乐,钟汉良","cat":"动作,犯罪,悬疑","wish":72910,"3d":false,"pn":190,"preSale":0,"imax":false,"snum":45947,"nm":"三人行","dur":88,"img":"http://p1.meituan.net/165.220/movie/1c82df174422d9374f821482f445171b129671.jpg","showDate":"","src":"","scm":"悍匪有手段，中枪再作案","sc":6.9,"ver":"2D","rt":"2016-06-24上映","time":"","id":246972},{"showInfo":"2016-07-02 本周六上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"戴夫·格林","star":"梅根·福克斯,皮特·普劳泽克,阿伦·瑞奇森","cat":"动作,冒险,喜剧","wish":270488,"3d":true,"pn":294,"preSale":1,"imax":true,"snum":1898,"nm":"忍者神龟2：破影而出","dur":113,"img":"http://p1.meituan.net/165.220/movie/a375ebfcdc2a396423c368b943813b01179997.jpg","showDate":"","src":"","scm":"儿时忍者龟，犀牛也回归","sc":0,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"本周六上映","time":"","id":13511},{"showInfo":"今天136家影院放映489场","cnms":0,"sn":0,"late":false,"vd":"","dir":"安德鲁·斯坦顿,安格斯·麦克莱恩","star":"艾伦·德詹尼丝,徐帆,艾伯特·布鲁克斯","cat":"动画,喜剧,冒险","wish":144949,"3d":true,"pn":123,"preSale":0,"imax":true,"snum":77780,"nm":"海底总动员2：多莉去哪儿","dur":97,"img":"http://p0.meituan.net/165.220/movie/4c20a91505854dcd0f9617069c5fec21843230.jpg","showDate":"","src":"","scm":"唠叨鱼多莉，上路找父母","sc":8.8,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"2016-06-17上映","time":"","id":246366},{"showInfo":"2016-07-08 下周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"周拓如","star":"吴亦凡,刘亦菲,金世佳","cat":"剧情,爱情","wish":216119,"3d":false,"pn":351,"preSale":1,"imax":false,"snum":5375,"nm":"致青春·原来你还在这里","dur":98,"img":"http://p0.meituan.net/165.220/movie/37e7ed909843270f0880c325b6be7b60436509.jpg","showDate":"","src":"","scm":"霸道男学霸，爱上女学渣","sc":0,"ver":"2D","rt":"下周五上映","time":"","id":246575},{"showInfo":"今天122家影院放映386场","cnms":0,"sn":0,"late":false,"vd":"","dir":"邓肯·琼斯","star":"崔维斯·费米尔,宝拉·巴顿,本·福斯特","cat":"动作,冒险,奇幻","wish":479894,"3d":true,"pn":347,"preSale":0,"imax":true,"snum":769704,"nm":"魔兽","dur":124,"img":"http://p0.meituan.net/165.220/movie/f94e67dcd5b48f034bd7adc892f1b20695854.jpeg","showDate":"","src":"","scm":"怒拳为谁握，联盟斗部落","sc":9.2,"ver":"2D/3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-08上映","time":"","id":78421},{"showInfo":"2016-06-30 本周四上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"金帝荣","star":"朴灿烈,袁姗姗,姜潮","cat":"爱情,喜剧","wish":97345,"3d":false,"pn":144,"preSale":1,"imax":false,"snum":8406,"nm":"所以\u2026\u2026和黑粉结婚了","dur":99,"img":"http://p1.meituan.net/165.220/movie/79311d41bea3be8f1677c0b69a5868fa289298.jpg","showDate":"","src":"","scm":"黑粉变新娘，这是闹哪样","sc":0,"ver":"2D","rt":"本周四上映","time":"","id":343379},{"showInfo":"2016-07-01 本周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"申太罗","star":"李敏镐,钟汉良,唐嫣","cat":"动作,喜剧,剧情,悬疑","wish":133156,"3d":true,"pn":207,"preSale":1,"imax":false,"snum":4867,"nm":"赏金猎人","dur":105,"img":"http://p1.meituan.net/165.220/movie/45f8587cb425a01c9a279082772a8bd0379497.jpg","showDate":"","src":"","scm":"编外铁饭碗，收钱抓逃犯","sc":0,"ver":"2D/3D","rt":"本周五上映","time":"","id":338506},{"showInfo":"2016-07-08 下周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"梁旋,张春","star":"","cat":"动画,奇幻","wish":142031,"3d":true,"pn":116,"preSale":1,"imax":false,"snum":3449,"nm":"大鱼海棠","dur":105,"img":"http://p1.meituan.net/165.220/movie/a607ab45bcc9e8486328b39bff0132a4420994.jpg","showDate":"","src":"","scm":"北冥有鱼鲲，海棠掌乾坤","sc":0,"ver":"3D","rt":"下周五上映","time":"","id":246591},{"showInfo":"2016-07-08 下周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"梁乐民,陆剑青","star":"郭富城,梁家辉,杨采妮","cat":"动作,犯罪,悬疑","wish":142786,"3d":true,"pn":345,"preSale":1,"imax":true,"snum":876,"nm":"寒战2","dur":110,"img":"http://p0.meituan.net/165.220/movie/d196d1391e1dc1eff190275a57a60d6c261789.jpg","showDate":"","src":"","scm":"男神齐加盟，比比谁更猛","sc":0,"ver":"2D/IMAX 3D","rt":"下周五上映","time":"","id":341289},{"showInfo":"今天66家影院放映132场","cnms":0,"sn":0,"late":false,"vd":"","dir":"布莱恩·辛格","star":"詹姆斯·麦卡沃伊,迈克尔·法斯宾德,詹妮弗·劳伦斯","cat":"动作,科幻,奇幻","wish":559919,"3d":true,"pn":692,"preSale":0,"imax":true,"snum":469650,"nm":"X战警：天启","dur":144,"img":"http://p1.meituan.net/165.220/movie/ba2386a26648c1875e3fc780950f0ae0144875.jpg","showDate":"","src":"","scm":"天启当炮灰，千年洗剪吹","sc":9.1,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-03上映","time":"","id":246177},{"showInfo":"2016-07-01 本周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"王早","star":"林心如,何润东,金世佳","cat":"悬疑,惊悚","wish":9901,"3d":true,"pn":55,"preSale":1,"imax":false,"snum":562,"nm":"魔轮","dur":92,"img":"http://p0.meituan.net/165.220/movie/e5ff984a4bec976fb1ed429e7fe4f61c605233.jpg","showDate":"","src":"","scm":"天涯号起航，失控大逃亡","sc":0,"ver":"2D/3D","rt":"本周五上映","time":"","id":342741},{"showInfo":"今天33家影院放映53场","cnms":0,"sn":0,"late":false,"vd":"","dir":"程孝泽","star":"彭于晏,郭采洁,杨子姗","cat":"爱情,运动,剧情","wish":12564,"3d":false,"pn":49,"preSale":0,"imax":false,"snum":955,"nm":"近在咫尺的爱恋","dur":103,"img":"http://p1.meituan.net/165.220/movie/a70da0aefb82886efbae696181e966ff620085.jpg","showDate":"","src":"","scm":"真爱在身旁，挥拳为理想","sc":7.3,"ver":"2D","rt":"2016-06-24上映","time":"","id":57217},{"showInfo":"2016-07-02 本周六上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"郑义","star":"朱可可,阿飞,夏倚轩","cat":"动画,科幻,冒险","wish":3750,"3d":false,"pn":76,"preSale":1,"imax":false,"snum":119,"nm":"丑小鸭历险记","dur":81,"img":"http://p0.meituan.net/165.220/movie/329d84307bf99e980c7cb5969dcade4f856773.png","showDate":"","src":"","scm":"月球机器鸭，化身小飞鸭","sc":0,"ver":"2D","rt":"本周六上映","time":"","id":368271},{"showInfo":"今天16家影院放映25场","cnms":0,"sn":0,"late":false,"vd":"","dir":"苗月","star":"白威,陈瑾,王柠","cat":"剧情,历史,战争","wish":458,"3d":false,"pn":4,"preSale":0,"imax":false,"snum":114,"nm":"大火种","dur":114,"img":"http://p1.meituan.net/165.220/movie/c8545c7bd1f6070f0d52a77bd0ddd8738720802.jpg","showDate":"","src":"","scm":"誓死护宣言，智斗救火种","sc":0,"ver":"2D","rt":"本周一上映","time":"","id":337438},{"showInfo":"今天19家影院放映22场","cnms":0,"sn":0,"late":false,"vd":"","dir":"姬雨","star":"胡影怡,朱璇,周骏","cat":"恐怖,惊悚","wish":20373,"3d":false,"pn":32,"preSale":0,"imax":false,"snum":13594,"nm":"筷仙","dur":87,"img":"http://p1.meituan.net/165.220/movie/31a325f0796cfebbab24776024eeec91100800.jpeg","showDate":"","src":"","scm":"笔仙已玩坏，筷仙来作怪","sc":4.2,"ver":"2D","rt":"2016-06-17上映","time":"","id":343597},{"showInfo":"今天15家影院放映22场","cnms":0,"sn":0,"late":false,"vd":"","dir":"朱丹","star":"孙看,孙洪涛,刘忠元","cat":"剧情,历史,战争","wish":2034,"3d":false,"pn":26,"preSale":0,"imax":false,"snum":122,"nm":"南口1937","dur":98,"img":"http://p1.meituan.net/165.220/movie/f4b5d903571ec3c3fc952f86261b04fd227842.jpg","showDate":"","src":"","scm":"南口抗日战，疆场洒血汗","sc":0,"ver":"2D","rt":"2016-06-23上映","time":"","id":368071},{"showInfo":"今天11家影院放映12场","cnms":0,"sn":0,"late":false,"vd":"","dir":"吴天明","star":"陶泽如,郑伟,李岷城","cat":"历史,音乐,剧情","wish":3981,"3d":false,"pn":105,"preSale":0,"imax":false,"snum":110403,"nm":"百鸟朝凤","dur":108,"img":"http://p1.meituan.net/165.220/movie/ef968fd382173c45b0c2d10572ca10b8354896.jpg","showDate":"","src":"","scm":"两代手艺人，唢呐感情深","sc":9.2,"ver":"2D","rt":"2016-05-06上映","time":"","id":248260},{"showInfo":"2016-07-08 下周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"艾什·布兰农","star":"冯小刚,郭德纲,郭麒麟","cat":"动画,音乐,家庭","wish":14241,"3d":true,"pn":134,"preSale":1,"imax":false,"snum":162,"nm":"摇滚藏獒","dur":93,"img":"http://p1.meituan.net/165.220/movie/9d32c2703351b3e1cb456a05b207550e210596.jpg","showDate":"","src":"","scm":"郑钧写剧本，混搭玩摇滚","sc":0,"ver":"2D/3D/中国巨幕","rt":"下周五上映","time":"","id":247244},{"showInfo":"今天8家影院放映9场","cnms":0,"sn":0,"late":false,"vd":"","dir":"薛晓路","star":"汤唯,吴秀波,惠英红","cat":"爱情,剧情","wish":307383,"3d":false,"pn":547,"preSale":0,"imax":false,"snum":451716,"nm":"北京遇上西雅图之不二情书","dur":132,"img":"http://p1.meituan.net/165.220/movie/fe80bc40822d0a5f3168b73089c47d71101133.jpg","showDate":"","src":"","scm":"异国心未远，书信寄情缘","sc":8.5,"ver":"2D/中国巨幕","rt":"2016-04-29上映","time":"","id":247575},{"showInfo":"今天6家影院放映8场","cnms":0,"sn":0,"late":false,"vd":"","dir":"核桃","star":"奶茶,YOYO,CBI","cat":"动画,喜剧,冒险","wish":43480,"3d":true,"pn":40,"preSale":0,"imax":false,"snum":20910,"nm":"我叫MT之山口山战记","dur":86,"img":"http://p0.meituan.net/165.220/movie/73f6abbb90259d1fa8a88fa907ca3062587352.jpg","showDate":"","src":"","scm":"贱萌牛头人，爆笑刷副本","sc":8.3,"ver":"3D/中国巨幕","rt":"2016-06-17上映","time":"","id":246045},{"showInfo":"今天5家影院放映7场","cnms":0,"sn":0,"late":false,"vd":"","dir":"费格尔·雷利,克莱·凯蒂","star":"杰森·苏戴奇斯,乔什·盖德,丹尼·麦克布耐德","cat":"动画,奇幻,冒险","wish":123045,"3d":true,"pn":132,"preSale":0,"imax":false,"snum":328052,"nm":"愤怒的小鸟","dur":97,"img":"http://p0.meituan.net/165.220/movie/b721e73740601799c065affb619d837e151622.jpg","showDate":"","src":"","scm":"绿猪来偷蛋，鸟儿群奋战","sc":8.9,"ver":"3D/中国巨幕","rt":"2016-05-20上映","time":"","id":246188},{"showInfo":"2016-07-01 本周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"卫晓茼","star":"郜耀平,张志宏,姚安濂","cat":"剧情,历史,战争","wish":758,"3d":false,"pn":18,"preSale":1,"imax":false,"snum":179,"nm":"党的女儿尹灵芝","dur":107,"img":"http://p0.meituan.net/165.220/movie/1dffa0a076e3514234f2029d6b29b3da157605.jpg","showDate":"","src":"","scm":"心中有信仰，少年变战士","sc":0,"ver":"2D","rt":"本周五上映","time":"","id":672123},{"showInfo":"今天2家影院放映6场","cnms":0,"sn":0,"late":false,"vd":"","dir":"侯克明","star":"雷佳,张英席,高鹏","cat":"剧情","wish":1038,"3d":true,"pn":80,"preSale":0,"imax":false,"snum":1201,"nm":"白毛女","dur":122,"img":"http://p1.meituan.net/165.220/movie/a8dc71209614a071cbc56cfc193b9d9785810.jpg","showDate":"","src":"","scm":"欠了高利贷，卖女来抵债","sc":8.9,"ver":"3D/中国巨幕","rt":"2016-03-25上映","time":"","id":345102},{"showInfo":"今天3家影院放映3场","cnms":0,"sn":0,"late":false,"vd":"","dir":"管虎","star":"黄渤,刘烨,张涵予","cat":"剧情,喜剧,动作","wish":10110,"3d":false,"pn":281,"preSale":0,"imax":false,"snum":5768,"nm":"厨子戏子痞子","dur":108,"img":"http://p0.meituan.net/165.220/movie/__7277442__6071578.jpg","showDate":"","src":"","scm":"三男一台戏，客栈解僵局","sc":8.1,"ver":"2D","rt":"2013-03-29上映","time":"","id":969},{"showInfo":"2016-07-01 本周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"冼杞然","star":"窦骁,约瑟夫·费因斯,娄宇健","cat":"剧情,战争,历史","wish":4968,"3d":false,"pn":122,"preSale":1,"imax":false,"snum":70,"nm":"终极胜利","dur":108,"img":"http://p1.meituan.net/165.220/movie/0c93b5987ae440497dd985982aad1c4b233221.jpg","showDate":"","src":"","scm":"辛德勒名单，推出中国版","sc":0,"ver":"2D","rt":"本周五上映","time":"","id":341123},{"showInfo":"今天1家影院放映2场","cnms":0,"sn":0,"late":false,"vd":"","dir":"霍建起","star":"黄晓明,蒲巴甲,徐峥","cat":"剧情,历史","wish":23799,"3d":false,"pn":232,"preSale":0,"imax":false,"snum":28697,"nm":"大唐玄奘","dur":120,"img":"http://p0.meituan.net/165.220/movie/c1cbba6359ef62bbb5bdd5311708c828413080.jpg","showDate":"","src":"","scm":"了却世间恨，尽是取经人","sc":7.3,"ver":"2D/中国巨幕","rt":"2016-04-29上映","time":"","id":338357},{"showInfo":"2016-07-08 下周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"江涛","star":"王宁,修睿,王自健","cat":"喜剧,冒险,犯罪","wish":5670,"3d":false,"pn":92,"preSale":1,"imax":false,"snum":419,"nm":"发条城市","dur":113,"img":"http://p1.meituan.net/165.220/movie/95863673f6fcf0722df9a1ca4db1452d399359.jpg","showDate":"","src":"","scm":"无厘头谋杀，真相太复杂","sc":0,"ver":"2D","rt":"下周五上映","time":"","id":345076},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"宁海强","star":"王斑,杨潇,张页川","cat":"剧情,动作","wish":0,"3d":false,"pn":108,"preSale":0,"imax":false,"snum":19,"nm":"歼十出击","dur":95,"img":"http://p0.meituan.net/165.220/movie/25/9538941.jpg","showDate":"","src":"","scm":"记录中国空军","sc":4.2,"ver":"2D","rt":"2011-03-10上映","time":"","id":52305},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"梁德森","star":"钟丽缇,柳岩,李灿森","cat":"悬疑,惊悚","wish":771,"3d":false,"pn":22,"preSale":0,"imax":false,"snum":182,"nm":"人间蒸发","dur":90,"img":"http://p0.meituan.net/165.220/movie/__6680785__5992311.jpg","showDate":"","src":"","scm":"惊心动魄的寻亲之旅","sc":7,"ver":"2D","rt":"2013-04-28上映","time":"","id":78094},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"潘安子","star":"周冬雨,陈晓,赵丽颖","cat":"剧情,爱情,古装","wish":3080,"3d":false,"pn":36,"preSale":0,"imax":false,"snum":2513,"nm":"宫锁沉香","dur":115,"img":"http://p0.meituan.net/165.220/movie/__18327195__7709930.jpg","showDate":"","src":"","scm":"唯美清宫戏，阴谋不见底","sc":6.3,"ver":"2D","rt":"2013-08-13上映","time":"","id":78176},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"陈嘉上,秦小珍","star":"邓超,刘亦菲,邹兆龙","cat":"动作,科幻,武侠,古装","wish":6328,"3d":true,"pn":98,"preSale":0,"imax":false,"snum":7596,"nm":"四大名捕2","dur":118,"img":"http://p1.meituan.net/165.220/movie/3c49afde82a16b2ea90f2de724d859c3165053.jpg","showDate":"","src":"","scm":"听风又辨雨，料谁作玄虚","sc":6.6,"ver":"2D/3D","rt":"2013-12-06上映","time":"","id":74993},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"丁晟","star":"刘烨,成龙,景甜","cat":"剧情,动作,犯罪","wish":14520,"3d":true,"pn":44,"preSale":0,"imax":true,"snum":19145,"nm":"警察故事2013","dur":108,"img":"http://p0.meituan.net/165.220/movie/__29561506__7176229.jpg","showDate":"","src":"","scm":"女儿乱交友，老爹来出头","sc":7.7,"ver":"2D/IMAX 3D","rt":"2013-12-24上映","time":"","id":77192},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"陈思诚","star":"梁家辉,刘嘉玲,王学兵","cat":"爱情","wish":12286,"3d":false,"pn":145,"preSale":0,"imax":false,"snum":28703,"nm":"北京爱情故事","dur":121,"img":"http://p0.meituan.net/165.220/movie/__33456063__6265360.jpg","showDate":"","src":"","scm":"恋爱分五段，激情不会散","sc":7.7,"ver":"2D","rt":"2014-02-14上映","time":"","id":78324},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"郭帆","star":"周冬雨,林更新,隋凯","cat":"剧情,爱情","wish":24267,"3d":false,"pn":88,"preSale":0,"imax":false,"snum":73087,"nm":"同桌的你","dur":98,"img":"http://p0.meituan.net/165.220/movie/__40811615__5745234.jpg","showDate":"","src":"","scm":"初恋要结婚，回国忆青春","sc":8.5,"ver":"2D","rt":"2014-04-25上映","time":"","id":78653},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"行定勋","star":"三浦春马,刘诗诗,张孝全","cat":"爱情,悬疑","wish":9688,"3d":false,"pn":39,"preSale":0,"imax":false,"snum":7630,"nm":"深夜前的五分钟","dur":127,"img":"http://p0.meituan.net/165.220/movie/e399a912c8754e5dbab74191e39574b7112324.jpg","showDate":"","src":"","scm":"双生花疑案，旅行遇船难","sc":6.3,"ver":"2D","rt":"2014-10-23上映","time":"","id":246004},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"张一白","star":"彭于晏,倪妮,郑恺","cat":"剧情,爱情","wish":74203,"3d":false,"pn":378,"preSale":0,"imax":false,"snum":371187,"nm":"匆匆那年","dur":119,"img":"http://p0.meituan.net/165.220/movie/153d2a327b80b0e57ff6feb3e6aecebf585878.jpg","showDate":"","src":"","scm":"纯情已不再，青春忙堕胎","sc":7.6,"ver":"2D","rt":"2014-12-05上映","time":"","id":245980},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"胡笳,岑俊义","star":"杨颖,王宝强,李晨","cat":"喜剧,冒险,动作","wish":49025,"3d":false,"pn":118,"preSale":0,"imax":false,"snum":361228,"nm":"奔跑吧！兄弟","dur":88,"img":"http://p0.meituan.net/165.220/movie/85f0d9a604e26be5523a848269346697296774.jpg","showDate":"","src":"","scm":"跑男再出发，集体游三亚","sc":6.4,"ver":"2D","rt":"2015-01-30上映","time":"","id":246316},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"让·雅克·阿诺","star":"草原狼,冯绍峰,窦骁","cat":"剧情,冒险","wish":47458,"3d":true,"pn":219,"preSale":0,"imax":true,"snum":465235,"nm":"狼图腾","dur":121,"img":"http://p1.meituan.net/165.220/movie/6bc8b987bf621990ed4df4d7923bdbe9775157.jpg","showDate":"","src":"","scm":"离离原上草，见狼赶紧跑","sc":8.2,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"2015-02-19上映","time":"","id":78403},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"苏有朋","star":"陈都灵,欧豪,杨洋","cat":"爱情","wish":82116,"3d":false,"pn":315,"preSale":0,"imax":false,"snum":538489,"nm":"左耳","dur":117,"img":"http://p0.meituan.net/165.220/movie/da55f29972ec0b9692ba7055905892c8123092.jpg","showDate":"","src":"","scm":"青春要恋爱，别忘堕堕胎","sc":8,"ver":"2D","rt":"2015-04-24上映","time":"","id":246210},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"邱浩强","star":"李思娴,郭亚维,宋磊","cat":"动画,喜剧,冒险","wish":27716,"3d":false,"pn":38,"preSale":0,"imax":false,"snum":21989,"nm":"美人鱼之海盗来袭","dur":85,"img":"http://p0.meituan.net/165.220/movie/7e15953aa8bc5be4e7bff00913426a06920765.jpg","showDate":"","src":"","scm":"国产美人鱼，俩海盗来袭","sc":7,"ver":"2D","rt":"2015-07-31上映","time":"","id":248550},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"秦小珍","star":"刘畅,白百何,唐艺昕","cat":"剧情,爱情","wish":120703,"3d":false,"pn":564,"preSale":0,"imax":false,"snum":78494,"nm":"陪安东尼度过漫长岁月","dur":121,"img":"http://p1.meituan.net/165.220/movie/9f0d994eafbf52e7b0145b7746d1d881246635.jpg","showDate":"","src":"","scm":"文艺大暖男，不二常相伴","sc":8.8,"ver":"2D","rt":"2015-11-13上映","time":"","id":246583},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"朴裕焕","star":"雷佳音,夏梓桐,李菁","cat":"悬疑,喜剧,犯罪","wish":4154,"3d":false,"pn":47,"preSale":0,"imax":false,"snum":3035,"nm":"记忆碎片","dur":94,"img":"http://p1.meituan.net/165.220/movie/ea15948d63d527d092a70e39cbb74636357253.jpg","showDate":"","src":"","scm":"宿醉陷疑案，奋力查嫌犯","sc":5.6,"ver":"2D","rt":"2016-06-03上映","time":"","id":345923},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"胡韵","star":"邓小婷,赵奔,白文显","cat":"动画,冒险,喜剧","wish":7076,"3d":false,"pn":8,"preSale":0,"imax":false,"snum":6604,"nm":"泰迪熊之玩具大战","dur":78,"img":"http://p1.meituan.net/165.220/movie/495971f9751f07a720373ad6008146e8575458.jpg","showDate":"","src":"","scm":"恶势力进攻，泰迪救萌宠","sc":7.3,"ver":"2D","rt":"2016-06-09上映","time":"","id":346658},{"showInfo":"2016-07-01 本周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"谭晓明","star":"许铂岑,王韦智,释小龙","cat":"剧情","wish":149,"3d":false,"pn":1,"preSale":1,"imax":false,"snum":14,"nm":"古田会议","dur":92,"img":"http://p1.meituan.net/165.220/movie/09f8c875a24c9916e7150ff7d7068b15622397.jpg","showDate":"","src":"","scm":"古田开大会，确立新指挥","sc":0,"ver":"2D","rt":"本周五上映","time":"","id":367990},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"许江华,林小鑫","star":"何育骏,王岚,高明升","cat":"动作,战争,剧情","wish":608,"3d":false,"pn":18,"preSale":1,"imax":false,"snum":111,"nm":"绝战","dur":95,"img":"http://p0.meituan.net/165.220/movie/3be7ae83cc4070808c1041bfcb0c4690119016.jpg","showDate":"","src":"","scm":"浴血突围战，凤凰重涅槃","sc":0,"ver":"2D","rt":"本周五上映","time":"","id":361172},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"战越","star":"卢杉,傅亨,吴谨西","cat":"惊悚,悬疑,爱情","wish":4518,"3d":false,"pn":21,"preSale":1,"imax":false,"snum":67,"nm":"张震讲故事之合租屋","dur":87,"img":"http://p1.meituan.net/165.220/movie/d7cfe72fdd511e549c5f827e8646b945730590.jpg","showDate":"","src":"","scm":"惊悚合租屋，噩梦一幕幕","sc":0,"ver":"2D","rt":"下周五上映","time":"","id":368116},{"showInfo":"2016-07-15上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"毕赣","star":"陈永忠,郭月,谢理循","cat":"剧情,悬疑","wish":2421,"3d":false,"pn":44,"preSale":1,"imax":false,"snum":42,"nm":"路边野餐","dur":113,"img":"http://p0.meituan.net/165.220/movie/5657fd4203e62118deb28f16eac81271542768.jpg","showDate":"","src":"","scm":"离家把子寻，帮人带书信","sc":0,"ver":"2D","rt":"2016-07-15上映","time":"","id":342073},{"showInfo":"今天暂无场次","cnms":0,"sn":0,"late":false,"vd":"","dir":"李仁港","star":"甄子丹,赵薇,吴尊","cat":"动作,惊悚,武侠","wish":238,"3d":false,"pn":61,"preSale":0,"imax":false,"snum":841,"nm":"锦衣卫","dur":112,"img":"http://p0.meituan.net/165.220/movie/__15389104__8042906.jpg","showDate":"","src":"","scm":"忠贞护玉玺，奸佞动杀机","sc":7.6,"ver":"2D","rt":"2010-02-03上映","time":"","id":324},{"showInfo":"今天暂无场次","cnms":0,"sn":0,"late":false,"vd":"","dir":"陈可辛","star":"甄子丹,金城武,汤唯","cat":"武侠,动作,悬疑","wish":97,"3d":false,"pn":77,"preSale":0,"imax":false,"snum":458,"nm":"武侠","dur":115,"img":"http://p0.meituan.net/165.220/movie/48/750398.jpg","showDate":"","src":"","scm":"武侠版柯南，小村查命案","sc":7.2,"ver":"2D","rt":"2011-07-04上映","time":"","id":48},{"showInfo":"今天暂无场次","cnms":0,"sn":0,"late":false,"vd":"","dir":"陈正道","star":"徐峥,莫文蔚,吕中","cat":"剧情,悬疑,惊悚","wish":11396,"3d":false,"pn":78,"preSale":0,"imax":false,"snum":46580,"nm":"催眠大师","dur":102,"img":"http://p1.meituan.net/165.220/movie/__39582689__9041214.jpg","showDate":"","src":"","scm":"催眠治心伤，侧击猜真相","sc":8.5,"ver":"2D","rt":"2014-04-29上映","time":"","id":78672},{"showInfo":"今天暂无场次","cnms":0,"sn":0,"late":false,"vd":"","dir":"乔纳森·理贝斯曼","star":"梅根·福克斯,威尔·阿奈特,威廉·菲德内尔","cat":"动作,喜剧","wish":58789,"3d":true,"pn":67,"preSale":0,"imax":true,"snum":176726,"nm":"忍者神龟：变种时代","dur":102,"img":"http://p0.meituan.net/165.220/movie/4eb7ac666b9479e55a88e7aea0e7bf86134307.jpg","showDate":"","src":"","scm":"文艺复兴四杰又出洞了","sc":8.7,"ver":"2D/3D/IMAX 3D","rt":"2014-10-31上映","time":"","id":245931},{"showInfo":"今天暂无场次","cnms":0,"sn":0,"late":false,"vd":"","dir":"安尚勋","star":"杨幂,鹿晗,王景春","cat":"悬疑,犯罪,惊悚","wish":139189,"3d":false,"pn":499,"preSale":0,"imax":false,"snum":237036,"nm":"我是证人","dur":112,"img":"http://p1.meituan.net/165.220/movie/d75604e123f8cdd8b52c069936f84f5b49504.jpg","showDate":"","src":"","scm":"证词相矛盾，姐弟被围困","sc":8.5,"ver":"2D","rt":"2015-10-30上映","time":"","id":247711},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"郑淑兰","star":"韩在石,句号,王奎荣","cat":"科幻,爱情,奇幻","wish":2600,"3d":false,"pn":26,"preSale":0,"imax":false,"snum":987,"nm":"海洋之恋","dur":96,"img":"http://p0.meituan.net/165.220/movie/0e3af6f723d8b7d4a3ea62efba49f535814826.jpg","showDate":"","src":"","scm":"凄美人鱼恋，海洋是家园","sc":0,"ver":"2D","rt":"2016-06-17上映","time":"","id":341109}]}
     */

    private int status;
    /**
     * hasNext : false
     * movies : [{"showInfo":"今天153家影院放映1915场","cnms":0,"sn":0,"late":false,"vd":"","dir":"朱浩伟","star":"杰西·艾森伯格,马克·鲁法洛,伍迪·哈里森","cat":"动作,喜剧,惊悚","wish":513937,"3d":true,"pn":248,"preSale":0,"imax":false,"snum":122055,"nm":"惊天魔盗团2","dur":126,"img":"http://p1.meituan.net/165.220/movie/2e0b5b5c6c086cc93068fbc212f9f6b0142193.jpg","showDate":"","src":"","scm":"周董变魔术，敌人挡不住","sc":8.5,"ver":"2D/3D/中国巨幕","rt":"2016-06-24上映","time":"","id":246333},{"showInfo":"今天150家影院放映1716场","cnms":0,"sn":0,"late":false,"vd":"","dir":"罗兰·艾默里奇","star":"利亚姆·海姆斯沃斯,杰夫·高布伦,杰西·厄舍","cat":"动作,冒险,科幻","wish":164747,"3d":true,"pn":226,"preSale":0,"imax":true,"snum":93186,"nm":"独立日：卷土重来","dur":120,"img":"http://p1.meituan.net/165.220/movie/b408a9322cd0da51d4bdd3261ba3d1c0278866.jpg","showDate":"","src":"","scm":"外星再入侵，地核将燃尽","sc":8.5,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-24上映","time":"","id":246375},{"showInfo":"今天148家影院放映743场","cnms":0,"sn":0,"late":false,"vd":"","dir":"杜琪峰","star":"赵薇,古天乐,钟汉良","cat":"动作,犯罪,悬疑","wish":72910,"3d":false,"pn":190,"preSale":0,"imax":false,"snum":45947,"nm":"三人行","dur":88,"img":"http://p1.meituan.net/165.220/movie/1c82df174422d9374f821482f445171b129671.jpg","showDate":"","src":"","scm":"悍匪有手段，中枪再作案","sc":6.9,"ver":"2D","rt":"2016-06-24上映","time":"","id":246972},{"showInfo":"2016-07-02 本周六上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"戴夫·格林","star":"梅根·福克斯,皮特·普劳泽克,阿伦·瑞奇森","cat":"动作,冒险,喜剧","wish":270488,"3d":true,"pn":294,"preSale":1,"imax":true,"snum":1898,"nm":"忍者神龟2：破影而出","dur":113,"img":"http://p1.meituan.net/165.220/movie/a375ebfcdc2a396423c368b943813b01179997.jpg","showDate":"","src":"","scm":"儿时忍者龟，犀牛也回归","sc":0,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"本周六上映","time":"","id":13511},{"showInfo":"今天136家影院放映489场","cnms":0,"sn":0,"late":false,"vd":"","dir":"安德鲁·斯坦顿,安格斯·麦克莱恩","star":"艾伦·德詹尼丝,徐帆,艾伯特·布鲁克斯","cat":"动画,喜剧,冒险","wish":144949,"3d":true,"pn":123,"preSale":0,"imax":true,"snum":77780,"nm":"海底总动员2：多莉去哪儿","dur":97,"img":"http://p0.meituan.net/165.220/movie/4c20a91505854dcd0f9617069c5fec21843230.jpg","showDate":"","src":"","scm":"唠叨鱼多莉，上路找父母","sc":8.8,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"2016-06-17上映","time":"","id":246366},{"showInfo":"2016-07-08 下周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"周拓如","star":"吴亦凡,刘亦菲,金世佳","cat":"剧情,爱情","wish":216119,"3d":false,"pn":351,"preSale":1,"imax":false,"snum":5375,"nm":"致青春·原来你还在这里","dur":98,"img":"http://p0.meituan.net/165.220/movie/37e7ed909843270f0880c325b6be7b60436509.jpg","showDate":"","src":"","scm":"霸道男学霸，爱上女学渣","sc":0,"ver":"2D","rt":"下周五上映","time":"","id":246575},{"showInfo":"今天122家影院放映386场","cnms":0,"sn":0,"late":false,"vd":"","dir":"邓肯·琼斯","star":"崔维斯·费米尔,宝拉·巴顿,本·福斯特","cat":"动作,冒险,奇幻","wish":479894,"3d":true,"pn":347,"preSale":0,"imax":true,"snum":769704,"nm":"魔兽","dur":124,"img":"http://p0.meituan.net/165.220/movie/f94e67dcd5b48f034bd7adc892f1b20695854.jpeg","showDate":"","src":"","scm":"怒拳为谁握，联盟斗部落","sc":9.2,"ver":"2D/3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-08上映","time":"","id":78421},{"showInfo":"2016-06-30 本周四上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"金帝荣","star":"朴灿烈,袁姗姗,姜潮","cat":"爱情,喜剧","wish":97345,"3d":false,"pn":144,"preSale":1,"imax":false,"snum":8406,"nm":"所以\u2026\u2026和黑粉结婚了","dur":99,"img":"http://p1.meituan.net/165.220/movie/79311d41bea3be8f1677c0b69a5868fa289298.jpg","showDate":"","src":"","scm":"黑粉变新娘，这是闹哪样","sc":0,"ver":"2D","rt":"本周四上映","time":"","id":343379},{"showInfo":"2016-07-01 本周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"申太罗","star":"李敏镐,钟汉良,唐嫣","cat":"动作,喜剧,剧情,悬疑","wish":133156,"3d":true,"pn":207,"preSale":1,"imax":false,"snum":4867,"nm":"赏金猎人","dur":105,"img":"http://p1.meituan.net/165.220/movie/45f8587cb425a01c9a279082772a8bd0379497.jpg","showDate":"","src":"","scm":"编外铁饭碗，收钱抓逃犯","sc":0,"ver":"2D/3D","rt":"本周五上映","time":"","id":338506},{"showInfo":"2016-07-08 下周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"梁旋,张春","star":"","cat":"动画,奇幻","wish":142031,"3d":true,"pn":116,"preSale":1,"imax":false,"snum":3449,"nm":"大鱼海棠","dur":105,"img":"http://p1.meituan.net/165.220/movie/a607ab45bcc9e8486328b39bff0132a4420994.jpg","showDate":"","src":"","scm":"北冥有鱼鲲，海棠掌乾坤","sc":0,"ver":"3D","rt":"下周五上映","time":"","id":246591},{"showInfo":"2016-07-08 下周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"梁乐民,陆剑青","star":"郭富城,梁家辉,杨采妮","cat":"动作,犯罪,悬疑","wish":142786,"3d":true,"pn":345,"preSale":1,"imax":true,"snum":876,"nm":"寒战2","dur":110,"img":"http://p0.meituan.net/165.220/movie/d196d1391e1dc1eff190275a57a60d6c261789.jpg","showDate":"","src":"","scm":"男神齐加盟，比比谁更猛","sc":0,"ver":"2D/IMAX 3D","rt":"下周五上映","time":"","id":341289},{"showInfo":"今天66家影院放映132场","cnms":0,"sn":0,"late":false,"vd":"","dir":"布莱恩·辛格","star":"詹姆斯·麦卡沃伊,迈克尔·法斯宾德,詹妮弗·劳伦斯","cat":"动作,科幻,奇幻","wish":559919,"3d":true,"pn":692,"preSale":0,"imax":true,"snum":469650,"nm":"X战警：天启","dur":144,"img":"http://p1.meituan.net/165.220/movie/ba2386a26648c1875e3fc780950f0ae0144875.jpg","showDate":"","src":"","scm":"天启当炮灰，千年洗剪吹","sc":9.1,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-06-03上映","time":"","id":246177},{"showInfo":"2016-07-01 本周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"王早","star":"林心如,何润东,金世佳","cat":"悬疑,惊悚","wish":9901,"3d":true,"pn":55,"preSale":1,"imax":false,"snum":562,"nm":"魔轮","dur":92,"img":"http://p0.meituan.net/165.220/movie/e5ff984a4bec976fb1ed429e7fe4f61c605233.jpg","showDate":"","src":"","scm":"天涯号起航，失控大逃亡","sc":0,"ver":"2D/3D","rt":"本周五上映","time":"","id":342741},{"showInfo":"今天33家影院放映53场","cnms":0,"sn":0,"late":false,"vd":"","dir":"程孝泽","star":"彭于晏,郭采洁,杨子姗","cat":"爱情,运动,剧情","wish":12564,"3d":false,"pn":49,"preSale":0,"imax":false,"snum":955,"nm":"近在咫尺的爱恋","dur":103,"img":"http://p1.meituan.net/165.220/movie/a70da0aefb82886efbae696181e966ff620085.jpg","showDate":"","src":"","scm":"真爱在身旁，挥拳为理想","sc":7.3,"ver":"2D","rt":"2016-06-24上映","time":"","id":57217},{"showInfo":"2016-07-02 本周六上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"郑义","star":"朱可可,阿飞,夏倚轩","cat":"动画,科幻,冒险","wish":3750,"3d":false,"pn":76,"preSale":1,"imax":false,"snum":119,"nm":"丑小鸭历险记","dur":81,"img":"http://p0.meituan.net/165.220/movie/329d84307bf99e980c7cb5969dcade4f856773.png","showDate":"","src":"","scm":"月球机器鸭，化身小飞鸭","sc":0,"ver":"2D","rt":"本周六上映","time":"","id":368271},{"showInfo":"今天16家影院放映25场","cnms":0,"sn":0,"late":false,"vd":"","dir":"苗月","star":"白威,陈瑾,王柠","cat":"剧情,历史,战争","wish":458,"3d":false,"pn":4,"preSale":0,"imax":false,"snum":114,"nm":"大火种","dur":114,"img":"http://p1.meituan.net/165.220/movie/c8545c7bd1f6070f0d52a77bd0ddd8738720802.jpg","showDate":"","src":"","scm":"誓死护宣言，智斗救火种","sc":0,"ver":"2D","rt":"本周一上映","time":"","id":337438},{"showInfo":"今天19家影院放映22场","cnms":0,"sn":0,"late":false,"vd":"","dir":"姬雨","star":"胡影怡,朱璇,周骏","cat":"恐怖,惊悚","wish":20373,"3d":false,"pn":32,"preSale":0,"imax":false,"snum":13594,"nm":"筷仙","dur":87,"img":"http://p1.meituan.net/165.220/movie/31a325f0796cfebbab24776024eeec91100800.jpeg","showDate":"","src":"","scm":"笔仙已玩坏，筷仙来作怪","sc":4.2,"ver":"2D","rt":"2016-06-17上映","time":"","id":343597},{"showInfo":"今天15家影院放映22场","cnms":0,"sn":0,"late":false,"vd":"","dir":"朱丹","star":"孙看,孙洪涛,刘忠元","cat":"剧情,历史,战争","wish":2034,"3d":false,"pn":26,"preSale":0,"imax":false,"snum":122,"nm":"南口1937","dur":98,"img":"http://p1.meituan.net/165.220/movie/f4b5d903571ec3c3fc952f86261b04fd227842.jpg","showDate":"","src":"","scm":"南口抗日战，疆场洒血汗","sc":0,"ver":"2D","rt":"2016-06-23上映","time":"","id":368071},{"showInfo":"今天11家影院放映12场","cnms":0,"sn":0,"late":false,"vd":"","dir":"吴天明","star":"陶泽如,郑伟,李岷城","cat":"历史,音乐,剧情","wish":3981,"3d":false,"pn":105,"preSale":0,"imax":false,"snum":110403,"nm":"百鸟朝凤","dur":108,"img":"http://p1.meituan.net/165.220/movie/ef968fd382173c45b0c2d10572ca10b8354896.jpg","showDate":"","src":"","scm":"两代手艺人，唢呐感情深","sc":9.2,"ver":"2D","rt":"2016-05-06上映","time":"","id":248260},{"showInfo":"2016-07-08 下周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"艾什·布兰农","star":"冯小刚,郭德纲,郭麒麟","cat":"动画,音乐,家庭","wish":14241,"3d":true,"pn":134,"preSale":1,"imax":false,"snum":162,"nm":"摇滚藏獒","dur":93,"img":"http://p1.meituan.net/165.220/movie/9d32c2703351b3e1cb456a05b207550e210596.jpg","showDate":"","src":"","scm":"郑钧写剧本，混搭玩摇滚","sc":0,"ver":"2D/3D/中国巨幕","rt":"下周五上映","time":"","id":247244},{"showInfo":"今天8家影院放映9场","cnms":0,"sn":0,"late":false,"vd":"","dir":"薛晓路","star":"汤唯,吴秀波,惠英红","cat":"爱情,剧情","wish":307383,"3d":false,"pn":547,"preSale":0,"imax":false,"snum":451716,"nm":"北京遇上西雅图之不二情书","dur":132,"img":"http://p1.meituan.net/165.220/movie/fe80bc40822d0a5f3168b73089c47d71101133.jpg","showDate":"","src":"","scm":"异国心未远，书信寄情缘","sc":8.5,"ver":"2D/中国巨幕","rt":"2016-04-29上映","time":"","id":247575},{"showInfo":"今天6家影院放映8场","cnms":0,"sn":0,"late":false,"vd":"","dir":"核桃","star":"奶茶,YOYO,CBI","cat":"动画,喜剧,冒险","wish":43480,"3d":true,"pn":40,"preSale":0,"imax":false,"snum":20910,"nm":"我叫MT之山口山战记","dur":86,"img":"http://p0.meituan.net/165.220/movie/73f6abbb90259d1fa8a88fa907ca3062587352.jpg","showDate":"","src":"","scm":"贱萌牛头人，爆笑刷副本","sc":8.3,"ver":"3D/中国巨幕","rt":"2016-06-17上映","time":"","id":246045},{"showInfo":"今天5家影院放映7场","cnms":0,"sn":0,"late":false,"vd":"","dir":"费格尔·雷利,克莱·凯蒂","star":"杰森·苏戴奇斯,乔什·盖德,丹尼·麦克布耐德","cat":"动画,奇幻,冒险","wish":123045,"3d":true,"pn":132,"preSale":0,"imax":false,"snum":328052,"nm":"愤怒的小鸟","dur":97,"img":"http://p0.meituan.net/165.220/movie/b721e73740601799c065affb619d837e151622.jpg","showDate":"","src":"","scm":"绿猪来偷蛋，鸟儿群奋战","sc":8.9,"ver":"3D/中国巨幕","rt":"2016-05-20上映","time":"","id":246188},{"showInfo":"2016-07-01 本周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"卫晓茼","star":"郜耀平,张志宏,姚安濂","cat":"剧情,历史,战争","wish":758,"3d":false,"pn":18,"preSale":1,"imax":false,"snum":179,"nm":"党的女儿尹灵芝","dur":107,"img":"http://p0.meituan.net/165.220/movie/1dffa0a076e3514234f2029d6b29b3da157605.jpg","showDate":"","src":"","scm":"心中有信仰，少年变战士","sc":0,"ver":"2D","rt":"本周五上映","time":"","id":672123},{"showInfo":"今天2家影院放映6场","cnms":0,"sn":0,"late":false,"vd":"","dir":"侯克明","star":"雷佳,张英席,高鹏","cat":"剧情","wish":1038,"3d":true,"pn":80,"preSale":0,"imax":false,"snum":1201,"nm":"白毛女","dur":122,"img":"http://p1.meituan.net/165.220/movie/a8dc71209614a071cbc56cfc193b9d9785810.jpg","showDate":"","src":"","scm":"欠了高利贷，卖女来抵债","sc":8.9,"ver":"3D/中国巨幕","rt":"2016-03-25上映","time":"","id":345102},{"showInfo":"今天3家影院放映3场","cnms":0,"sn":0,"late":false,"vd":"","dir":"管虎","star":"黄渤,刘烨,张涵予","cat":"剧情,喜剧,动作","wish":10110,"3d":false,"pn":281,"preSale":0,"imax":false,"snum":5768,"nm":"厨子戏子痞子","dur":108,"img":"http://p0.meituan.net/165.220/movie/__7277442__6071578.jpg","showDate":"","src":"","scm":"三男一台戏，客栈解僵局","sc":8.1,"ver":"2D","rt":"2013-03-29上映","time":"","id":969},{"showInfo":"2016-07-01 本周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"冼杞然","star":"窦骁,约瑟夫·费因斯,娄宇健","cat":"剧情,战争,历史","wish":4968,"3d":false,"pn":122,"preSale":1,"imax":false,"snum":70,"nm":"终极胜利","dur":108,"img":"http://p1.meituan.net/165.220/movie/0c93b5987ae440497dd985982aad1c4b233221.jpg","showDate":"","src":"","scm":"辛德勒名单，推出中国版","sc":0,"ver":"2D","rt":"本周五上映","time":"","id":341123},{"showInfo":"今天1家影院放映2场","cnms":0,"sn":0,"late":false,"vd":"","dir":"霍建起","star":"黄晓明,蒲巴甲,徐峥","cat":"剧情,历史","wish":23799,"3d":false,"pn":232,"preSale":0,"imax":false,"snum":28697,"nm":"大唐玄奘","dur":120,"img":"http://p0.meituan.net/165.220/movie/c1cbba6359ef62bbb5bdd5311708c828413080.jpg","showDate":"","src":"","scm":"了却世间恨，尽是取经人","sc":7.3,"ver":"2D/中国巨幕","rt":"2016-04-29上映","time":"","id":338357},{"showInfo":"2016-07-08 下周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"江涛","star":"王宁,修睿,王自健","cat":"喜剧,冒险,犯罪","wish":5670,"3d":false,"pn":92,"preSale":1,"imax":false,"snum":419,"nm":"发条城市","dur":113,"img":"http://p1.meituan.net/165.220/movie/95863673f6fcf0722df9a1ca4db1452d399359.jpg","showDate":"","src":"","scm":"无厘头谋杀，真相太复杂","sc":0,"ver":"2D","rt":"下周五上映","time":"","id":345076},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"宁海强","star":"王斑,杨潇,张页川","cat":"剧情,动作","wish":0,"3d":false,"pn":108,"preSale":0,"imax":false,"snum":19,"nm":"歼十出击","dur":95,"img":"http://p0.meituan.net/165.220/movie/25/9538941.jpg","showDate":"","src":"","scm":"记录中国空军","sc":4.2,"ver":"2D","rt":"2011-03-10上映","time":"","id":52305},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"梁德森","star":"钟丽缇,柳岩,李灿森","cat":"悬疑,惊悚","wish":771,"3d":false,"pn":22,"preSale":0,"imax":false,"snum":182,"nm":"人间蒸发","dur":90,"img":"http://p0.meituan.net/165.220/movie/__6680785__5992311.jpg","showDate":"","src":"","scm":"惊心动魄的寻亲之旅","sc":7,"ver":"2D","rt":"2013-04-28上映","time":"","id":78094},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"潘安子","star":"周冬雨,陈晓,赵丽颖","cat":"剧情,爱情,古装","wish":3080,"3d":false,"pn":36,"preSale":0,"imax":false,"snum":2513,"nm":"宫锁沉香","dur":115,"img":"http://p0.meituan.net/165.220/movie/__18327195__7709930.jpg","showDate":"","src":"","scm":"唯美清宫戏，阴谋不见底","sc":6.3,"ver":"2D","rt":"2013-08-13上映","time":"","id":78176},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"陈嘉上,秦小珍","star":"邓超,刘亦菲,邹兆龙","cat":"动作,科幻,武侠,古装","wish":6328,"3d":true,"pn":98,"preSale":0,"imax":false,"snum":7596,"nm":"四大名捕2","dur":118,"img":"http://p1.meituan.net/165.220/movie/3c49afde82a16b2ea90f2de724d859c3165053.jpg","showDate":"","src":"","scm":"听风又辨雨，料谁作玄虚","sc":6.6,"ver":"2D/3D","rt":"2013-12-06上映","time":"","id":74993},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"丁晟","star":"刘烨,成龙,景甜","cat":"剧情,动作,犯罪","wish":14520,"3d":true,"pn":44,"preSale":0,"imax":true,"snum":19145,"nm":"警察故事2013","dur":108,"img":"http://p0.meituan.net/165.220/movie/__29561506__7176229.jpg","showDate":"","src":"","scm":"女儿乱交友，老爹来出头","sc":7.7,"ver":"2D/IMAX 3D","rt":"2013-12-24上映","time":"","id":77192},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"陈思诚","star":"梁家辉,刘嘉玲,王学兵","cat":"爱情","wish":12286,"3d":false,"pn":145,"preSale":0,"imax":false,"snum":28703,"nm":"北京爱情故事","dur":121,"img":"http://p0.meituan.net/165.220/movie/__33456063__6265360.jpg","showDate":"","src":"","scm":"恋爱分五段，激情不会散","sc":7.7,"ver":"2D","rt":"2014-02-14上映","time":"","id":78324},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"郭帆","star":"周冬雨,林更新,隋凯","cat":"剧情,爱情","wish":24267,"3d":false,"pn":88,"preSale":0,"imax":false,"snum":73087,"nm":"同桌的你","dur":98,"img":"http://p0.meituan.net/165.220/movie/__40811615__5745234.jpg","showDate":"","src":"","scm":"初恋要结婚，回国忆青春","sc":8.5,"ver":"2D","rt":"2014-04-25上映","time":"","id":78653},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"行定勋","star":"三浦春马,刘诗诗,张孝全","cat":"爱情,悬疑","wish":9688,"3d":false,"pn":39,"preSale":0,"imax":false,"snum":7630,"nm":"深夜前的五分钟","dur":127,"img":"http://p0.meituan.net/165.220/movie/e399a912c8754e5dbab74191e39574b7112324.jpg","showDate":"","src":"","scm":"双生花疑案，旅行遇船难","sc":6.3,"ver":"2D","rt":"2014-10-23上映","time":"","id":246004},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"张一白","star":"彭于晏,倪妮,郑恺","cat":"剧情,爱情","wish":74203,"3d":false,"pn":378,"preSale":0,"imax":false,"snum":371187,"nm":"匆匆那年","dur":119,"img":"http://p0.meituan.net/165.220/movie/153d2a327b80b0e57ff6feb3e6aecebf585878.jpg","showDate":"","src":"","scm":"纯情已不再，青春忙堕胎","sc":7.6,"ver":"2D","rt":"2014-12-05上映","time":"","id":245980},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"胡笳,岑俊义","star":"杨颖,王宝强,李晨","cat":"喜剧,冒险,动作","wish":49025,"3d":false,"pn":118,"preSale":0,"imax":false,"snum":361228,"nm":"奔跑吧！兄弟","dur":88,"img":"http://p0.meituan.net/165.220/movie/85f0d9a604e26be5523a848269346697296774.jpg","showDate":"","src":"","scm":"跑男再出发，集体游三亚","sc":6.4,"ver":"2D","rt":"2015-01-30上映","time":"","id":246316},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"让·雅克·阿诺","star":"草原狼,冯绍峰,窦骁","cat":"剧情,冒险","wish":47458,"3d":true,"pn":219,"preSale":0,"imax":true,"snum":465235,"nm":"狼图腾","dur":121,"img":"http://p1.meituan.net/165.220/movie/6bc8b987bf621990ed4df4d7923bdbe9775157.jpg","showDate":"","src":"","scm":"离离原上草，见狼赶紧跑","sc":8.2,"ver":"2D/3D/IMAX 3D/中国巨幕","rt":"2015-02-19上映","time":"","id":78403},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"苏有朋","star":"陈都灵,欧豪,杨洋","cat":"爱情","wish":82116,"3d":false,"pn":315,"preSale":0,"imax":false,"snum":538489,"nm":"左耳","dur":117,"img":"http://p0.meituan.net/165.220/movie/da55f29972ec0b9692ba7055905892c8123092.jpg","showDate":"","src":"","scm":"青春要恋爱，别忘堕堕胎","sc":8,"ver":"2D","rt":"2015-04-24上映","time":"","id":246210},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"邱浩强","star":"李思娴,郭亚维,宋磊","cat":"动画,喜剧,冒险","wish":27716,"3d":false,"pn":38,"preSale":0,"imax":false,"snum":21989,"nm":"美人鱼之海盗来袭","dur":85,"img":"http://p0.meituan.net/165.220/movie/7e15953aa8bc5be4e7bff00913426a06920765.jpg","showDate":"","src":"","scm":"国产美人鱼，俩海盗来袭","sc":7,"ver":"2D","rt":"2015-07-31上映","time":"","id":248550},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"秦小珍","star":"刘畅,白百何,唐艺昕","cat":"剧情,爱情","wish":120703,"3d":false,"pn":564,"preSale":0,"imax":false,"snum":78494,"nm":"陪安东尼度过漫长岁月","dur":121,"img":"http://p1.meituan.net/165.220/movie/9f0d994eafbf52e7b0145b7746d1d881246635.jpg","showDate":"","src":"","scm":"文艺大暖男，不二常相伴","sc":8.8,"ver":"2D","rt":"2015-11-13上映","time":"","id":246583},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"朴裕焕","star":"雷佳音,夏梓桐,李菁","cat":"悬疑,喜剧,犯罪","wish":4154,"3d":false,"pn":47,"preSale":0,"imax":false,"snum":3035,"nm":"记忆碎片","dur":94,"img":"http://p1.meituan.net/165.220/movie/ea15948d63d527d092a70e39cbb74636357253.jpg","showDate":"","src":"","scm":"宿醉陷疑案，奋力查嫌犯","sc":5.6,"ver":"2D","rt":"2016-06-03上映","time":"","id":345923},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"胡韵","star":"邓小婷,赵奔,白文显","cat":"动画,冒险,喜剧","wish":7076,"3d":false,"pn":8,"preSale":0,"imax":false,"snum":6604,"nm":"泰迪熊之玩具大战","dur":78,"img":"http://p1.meituan.net/165.220/movie/495971f9751f07a720373ad6008146e8575458.jpg","showDate":"","src":"","scm":"恶势力进攻，泰迪救萌宠","sc":7.3,"ver":"2D","rt":"2016-06-09上映","time":"","id":346658},{"showInfo":"2016-07-01 本周五上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"谭晓明","star":"许铂岑,王韦智,释小龙","cat":"剧情","wish":149,"3d":false,"pn":1,"preSale":1,"imax":false,"snum":14,"nm":"古田会议","dur":92,"img":"http://p1.meituan.net/165.220/movie/09f8c875a24c9916e7150ff7d7068b15622397.jpg","showDate":"","src":"","scm":"古田开大会，确立新指挥","sc":0,"ver":"2D","rt":"本周五上映","time":"","id":367990},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"许江华,林小鑫","star":"何育骏,王岚,高明升","cat":"动作,战争,剧情","wish":608,"3d":false,"pn":18,"preSale":1,"imax":false,"snum":111,"nm":"绝战","dur":95,"img":"http://p0.meituan.net/165.220/movie/3be7ae83cc4070808c1041bfcb0c4690119016.jpg","showDate":"","src":"","scm":"浴血突围战，凤凰重涅槃","sc":0,"ver":"2D","rt":"本周五上映","time":"","id":361172},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"战越","star":"卢杉,傅亨,吴谨西","cat":"惊悚,悬疑,爱情","wish":4518,"3d":false,"pn":21,"preSale":1,"imax":false,"snum":67,"nm":"张震讲故事之合租屋","dur":87,"img":"http://p1.meituan.net/165.220/movie/d7cfe72fdd511e549c5f827e8646b945730590.jpg","showDate":"","src":"","scm":"惊悚合租屋，噩梦一幕幕","sc":0,"ver":"2D","rt":"下周五上映","time":"","id":368116},{"showInfo":"2016-07-15上映","cnms":0,"sn":0,"late":false,"vd":"","dir":"毕赣","star":"陈永忠,郭月,谢理循","cat":"剧情,悬疑","wish":2421,"3d":false,"pn":44,"preSale":1,"imax":false,"snum":42,"nm":"路边野餐","dur":113,"img":"http://p0.meituan.net/165.220/movie/5657fd4203e62118deb28f16eac81271542768.jpg","showDate":"","src":"","scm":"离家把子寻，帮人带书信","sc":0,"ver":"2D","rt":"2016-07-15上映","time":"","id":342073},{"showInfo":"今天暂无场次","cnms":0,"sn":0,"late":false,"vd":"","dir":"李仁港","star":"甄子丹,赵薇,吴尊","cat":"动作,惊悚,武侠","wish":238,"3d":false,"pn":61,"preSale":0,"imax":false,"snum":841,"nm":"锦衣卫","dur":112,"img":"http://p0.meituan.net/165.220/movie/__15389104__8042906.jpg","showDate":"","src":"","scm":"忠贞护玉玺，奸佞动杀机","sc":7.6,"ver":"2D","rt":"2010-02-03上映","time":"","id":324},{"showInfo":"今天暂无场次","cnms":0,"sn":0,"late":false,"vd":"","dir":"陈可辛","star":"甄子丹,金城武,汤唯","cat":"武侠,动作,悬疑","wish":97,"3d":false,"pn":77,"preSale":0,"imax":false,"snum":458,"nm":"武侠","dur":115,"img":"http://p0.meituan.net/165.220/movie/48/750398.jpg","showDate":"","src":"","scm":"武侠版柯南，小村查命案","sc":7.2,"ver":"2D","rt":"2011-07-04上映","time":"","id":48},{"showInfo":"今天暂无场次","cnms":0,"sn":0,"late":false,"vd":"","dir":"陈正道","star":"徐峥,莫文蔚,吕中","cat":"剧情,悬疑,惊悚","wish":11396,"3d":false,"pn":78,"preSale":0,"imax":false,"snum":46580,"nm":"催眠大师","dur":102,"img":"http://p1.meituan.net/165.220/movie/__39582689__9041214.jpg","showDate":"","src":"","scm":"催眠治心伤，侧击猜真相","sc":8.5,"ver":"2D","rt":"2014-04-29上映","time":"","id":78672},{"showInfo":"今天暂无场次","cnms":0,"sn":0,"late":false,"vd":"","dir":"乔纳森·理贝斯曼","star":"梅根·福克斯,威尔·阿奈特,威廉·菲德内尔","cat":"动作,喜剧","wish":58789,"3d":true,"pn":67,"preSale":0,"imax":true,"snum":176726,"nm":"忍者神龟：变种时代","dur":102,"img":"http://p0.meituan.net/165.220/movie/4eb7ac666b9479e55a88e7aea0e7bf86134307.jpg","showDate":"","src":"","scm":"文艺复兴四杰又出洞了","sc":8.7,"ver":"2D/3D/IMAX 3D","rt":"2014-10-31上映","time":"","id":245931},{"showInfo":"今天暂无场次","cnms":0,"sn":0,"late":false,"vd":"","dir":"安尚勋","star":"杨幂,鹿晗,王景春","cat":"悬疑,犯罪,惊悚","wish":139189,"3d":false,"pn":499,"preSale":0,"imax":false,"snum":237036,"nm":"我是证人","dur":112,"img":"http://p1.meituan.net/165.220/movie/d75604e123f8cdd8b52c069936f84f5b49504.jpg","showDate":"","src":"","scm":"证词相矛盾，姐弟被围困","sc":8.5,"ver":"2D","rt":"2015-10-30上映","time":"","id":247711},{"showInfo":"今天1家影院放映1场","cnms":0,"sn":0,"late":false,"vd":"","dir":"郑淑兰","star":"韩在石,句号,王奎荣","cat":"科幻,爱情,奇幻","wish":2600,"3d":false,"pn":26,"preSale":0,"imax":false,"snum":987,"nm":"海洋之恋","dur":96,"img":"http://p0.meituan.net/165.220/movie/0e3af6f723d8b7d4a3ea62efba49f535814826.jpg","showDate":"","src":"","scm":"凄美人鱼恋，海洋是家园","sc":0,"ver":"2D","rt":"2016-06-17上映","time":"","id":341109}]
     */

    private DataBean data;

    public ControlBean getControl() {
        return control;
    }

    public void setControl(ControlBean control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ControlBean {
        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public static class DataBean {
        private boolean hasNext;
        /**
         * showInfo : 今天153家影院放映1915场
         * cnms : 0
         * sn : 0
         * late : false
         * vd :
         * dir : 朱浩伟
         * star : 杰西·艾森伯格,马克·鲁法洛,伍迪·哈里森
         * cat : 动作,喜剧,惊悚
         * wish : 513937
         * 3d : true
         * pn : 248
         * preSale : 0
         * imax : false
         * snum : 122055
         * nm : 惊天魔盗团2
         * dur : 126
         * img : http://p1.meituan.net/165.220/movie/2e0b5b5c6c086cc93068fbc212f9f6b0142193.jpg
         * showDate :
         * src :
         * scm : 周董变魔术，敌人挡不住
         * sc : 8.5
         * ver : 2D/3D/中国巨幕
         * rt : 2016-06-24上映
         * time :
         * id : 246333
         */

        private List<MoviesBean> movies;

        public boolean isHasNext() {
            return hasNext;
        }

        public void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

        public List<MoviesBean> getMovies() {
            return movies;
        }

        public void setMovies(List<MoviesBean> movies) {
            this.movies = movies;
        }

        public static class MoviesBean {
            private String showInfo;
            private int cnms;
            private int sn;
            private boolean late;
            private String vd;
            private String dir;
            private String star;
            private String cat;
            private int wish;
            @SerializedName("3d")
            private boolean value3d;
            private int pn;
            private int preSale;
            private boolean imax;
            private int snum;
            private String nm;
            private int dur;
            private String img;
            private String showDate;
            private String src;
            private String scm;
            private double sc;
            private String ver;
            private String rt;
            private String time;
            private int id;

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
            }

            public int getCnms() {
                return cnms;
            }

            public void setCnms(int cnms) {
                this.cnms = cnms;
            }

            public int getSn() {
                return sn;
            }

            public void setSn(int sn) {
                this.sn = sn;
            }

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public String getVd() {
                return vd;
            }

            public void setVd(String vd) {
                this.vd = vd;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public boolean isValue3d() {
                return value3d;
            }

            public void setValue3d(boolean value3d) {
                this.value3d = value3d;
            }

            public int getPn() {
                return pn;
            }

            public void setPn(int pn) {
                this.pn = pn;
            }

            public int getPreSale() {
                return preSale;
            }

            public void setPreSale(int preSale) {
                this.preSale = preSale;
            }

            public boolean isImax() {
                return imax;
            }

            public void setImax(boolean imax) {
                this.imax = imax;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getShowDate() {
                return showDate;
            }

            public void setShowDate(String showDate) {
                this.showDate = showDate;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}
