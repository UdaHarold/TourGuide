package com.example.zhangfan.tourguide.data;

import com.example.zhangfan.tourguide.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harold on 2017/8/22.
 */

public class CityUtility {

    private static final List<City> wuhan = new ArrayList<City>() {{
        add(new City("黄鹤楼",
                "黄鹤楼位于湖北省武汉市长江南岸的武昌蛇山之巅，为国家5A级旅游景区，享有“天下江山第一楼“、”天下绝景“之称",
                R.drawable.huanghelou));
        add(new City("楚河汉街",
                "主体采用民国建筑风格，汉街因楚河而生，沿南岸而建，拥有中国最丰富的商业内容",
                R.drawable.chuhehanjie));
        add(new City("光谷",
                "武汉光谷步行街是一条全长1390米的步行街，位于武汉市洪山区鲁巷广场",
                R.drawable.guanggu));
        add(new City("东湖",
                "武汉东湖是以大型自然湖泊为核心，湖光山色为特色，集旅游观光、休闲度假、科普教育为主要功能的旅游景区",
                R.drawable.donghu));
        add(new City("海洋世界",
                "极地动物展示区中憨态可掬的企鹅、毛绒绒的北极熊、北极狼、海豹、海象、海狮、海狗等极地动物",
                R.drawable.haiyangshijie));
        add(new City("汉口租界",
                "这一带至今还矗立着各国风格的旧式楼房，是西方列强于19世纪至20世纪初遗留的历史建筑",
                R.drawable.hankouzujie));
        add(new City("汉正街",
                "它的存在为武汉的历史添上了浓墨重彩的一笔，过去的汉正街则把握着武汉早期商业的命脉",
                R.drawable.hanzhengjie));
        add(new City("户部巷",
                "被誉为“汉味小吃第一巷”，其繁华的早点摊群数十年经久不衰",
                R.drawable.hubuxiang));
        add(new City("园博园",
                "武汉园博园建筑设计拟采用“4+2”方案，即由四大主体建筑和东西部两大服务区组成",
                R.drawable.yuanboyuan));

    }};

    private static final List<City> yichang = new ArrayList<City>() {{
        add(new City("车溪",
                "车溪民俗游览区是三峡黄牛岩生态旅游风景区的南大门，以“梦里老家”为主题",
                R.drawable.chexi));
        add(new City("朝天吼",
                "宜昌高岚朝天吼漂流景区全长6.5公里，落差148米,漂流途经卧佛山、八缎锦、将军柱、朝天吼等壮丽的自然景观",
                R.drawable.chaotianhou));
        add(new City("清江画廊",
                "清江画廊风景区涵盖隔河岩大坝以上至水布垭盐池温泉，沿清江一线的所有旅游景观及景区景点",
                R.drawable.qingjianghualang));
        add(new City("三峡大坝",
                "是当今世界最大的水利发电工程，大坝高185米，正常蓄水位175米，水库长2335米",
                R.drawable.sanxiadaba));
        add(new City("三峡人家",
                "三峡人家，依山傍水，风情如画：传统的三峡吊脚楼点缀于山水之间，久违的古帆船、乌篷船安静地泊在三峡人家门前",
                R.drawable.sanxiarenjia));
        add(new City("西陵峡",
                "北岸有“兵书宝剑峡”、“牛肝马肺峡”，南岸有“灯影峡”等",
                R.drawable.xilingxia));
    }};

    private static final List<City> enshi = new ArrayList<City>() {{
        add(new City("恩施大峡谷",
                "恩施大峡谷已开放七星寨和云龙地缝两大核心景区，总面积35.2平方公里，天坑、地缝、绝壁、峰丛、岩柱群、溶洞、暗河等地质景观一应俱全",
                R.drawable.enshidaxiagu));
        add(new City("腾龙洞",
                "腾龙洞属中国目前最大的溶洞，世界特级洞穴之一,洞中有山，山中有洞，水洞旱洞相连",
                R.drawable.tenglongdong));
        add(new City("龙船水乡",
                "龙船水乡风景区是一处中国最理想的避暑度假胜地，是理想休闲娱乐的良好场所",
                R.drawable.longchuanshuixiang));

    }};

    private static final List<City> shanghai = new ArrayList<City>() {{
        add(new City("豫园",
                "江南古典园林，始建于明代嘉靖、万历年间",
                R.drawable.yuyuan));
        add(new City("外滩",
                "上海辟为商埠以后，外国的银行、商行、总会、报社开始在此云集",
                R.drawable.waitan));
        add(new City("上海老街",
                "上海老街所在的小东门地区，原是上海对外贸易、小商品交易的重要场地",
                R.drawable.shanghailaojie));

    }};

    public static List<City> getWuhan() {
        return wuhan;
    }

    public static List<City> getYichang() {
        return yichang;
    }

    public static List<City> getEnshi() {
        return enshi;
    }

    public static List<City> getShanghai() {
        return shanghai;
    }
}
