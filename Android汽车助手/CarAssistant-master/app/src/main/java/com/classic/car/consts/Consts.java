package com.classic.car.consts;

/**
 * 应用名称: CarAssistant
 * 包 名 称: com.classic.car.consts
 *
 * 文件描述：常量
 * 创 建 人：续写经典
 * 创建时间：16/5/29 上午10:58
 */
public final class Consts {

    public static final String DB_NAME = "CarAssistant.db";

    public static final String[] TYPE_MENUS =
            { "其它", "加油费", "停车费", "维修费", "过路费", "保险费", "汽车保养费", "汽车年审费", "交通违章罚款" };

    public static final int TYPE_OTHER             = 0; //其它
    public static final int TYPE_FUEL              = 1; //加油费
    public static final int TYPE_PARKING           = 2; //停车费
    public static final int TYPE_REPAIR            = 3; //维修费
    public static final int TYPE_ROAD_TOLL         = 4; //过路费
    public static final int TYPE_PREMIUM           = 5; //保险费
    public static final int TYPE_MAINTENANCE       = 6; //汽车保养费
    public static final int TYPE_EXAMINATION       = 7; //汽车年审费
    public static final int TYPE_TRAFFIC_VIOLATION = 8; //交通违章罚款

    public static final String[] FUEL_MENUS = { "汽油 89/90", "汽油 92/93", "汽油 95/97", "柴油 0#" };
    //原90号汽油,新标准改为89号汽油
    public static final int FUEL_GASOLINE_89 = 0;
    //原93号汽油,新标准改为92号汽油
    public static final int FUEL_GASOLINE_92 = 1;
    //原97号汽油,新标准改为95号汽油
    public static final int FUEL_GASOLINE_95 = 2;
    public static final int FUEL_DIESEL      = 3; //柴油0#

    public static final String FORMAT_MONEY    = "￥%s";
    public static final String FORMAT_RMB      = "%s元";
    public static final String FORMAT_OIL_MESS = "%s升";
}
