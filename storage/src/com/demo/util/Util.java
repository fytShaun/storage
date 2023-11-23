package com.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;

/**
 * 该方法为通用的工具类，放置一些共用的方法
 */
public class Util {
    /**
     * 获取系统当前时间并格式化为字符串
     *
     * @return
     */
    public static String getTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis());
    }

}
