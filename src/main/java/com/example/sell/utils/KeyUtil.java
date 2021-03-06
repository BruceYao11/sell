package com.example.sell.utils;

import java.util.Random;

/**
 * @program: sell
 * @description:生成唯一主键
 * @author: Bruce
 * @create: 2019-03-07 21:34
 **/
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     */
    public static synchronized String getUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;

        return System.currentTimeMillis()+String.valueOf(number);
    }
}