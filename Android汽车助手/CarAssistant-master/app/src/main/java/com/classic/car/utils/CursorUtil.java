package com.classic.car.utils;

import android.database.Cursor;

/**
 * 应用名称: CruiseRobot_Robot
 * 包 名 称: com.woosiyuan.cruiserobot.robot.utils
 *
 * 文件描述: TODO
 * 创 建 人: 续写经典
 * 创建时间: 2016/6/17 11:11
 */
public final class CursorUtil {
    private CursorUtil(){ }

    public static final String getString(Cursor cursor, String columnName){
        return cursor.getString(cursor.getColumnIndexOrThrow(columnName));
    }

    public static final long getLong(Cursor cursor, String columnName){
        return cursor.getLong(cursor.getColumnIndexOrThrow(columnName));
    }

    public static final double getDouble(Cursor cursor, String columnName){
        return cursor.getDouble(cursor.getColumnIndexOrThrow(columnName));
    }

    public static final float getFloat(Cursor cursor, String columnName){
        return cursor.getFloat(cursor.getColumnIndexOrThrow(columnName));
    }

    public static final short getShort(Cursor cursor, String columnName){
        return cursor.getShort(cursor.getColumnIndexOrThrow(columnName));
    }

    public static final int getInt(Cursor cursor, String columnName){
        return cursor.getInt(cursor.getColumnIndexOrThrow(columnName));
    }

    public static final byte[] getBlob(Cursor cursor, String columnName){
        return cursor.getBlob(cursor.getColumnIndexOrThrow(columnName));
    }

}
