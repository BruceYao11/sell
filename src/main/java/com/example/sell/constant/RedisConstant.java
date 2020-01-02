package com.example.sell.constant;

/**
 * redis常量
 * Created by bruce
 * 2019-04-10 16:22
 */
public interface RedisConstant {

    String TOKEN_PREFIX = "token_%s";

    // 过期时间，2小时
    Integer EXPIRE = 7200;
}
