package com.example.sell.constant;

/**
 * redis常量
 * Created by bruce
 * 2019-04-10 16:22
 */
public interface RedisConstant {

    String TOKEN_PREFIX = "token_%s";

    Integer EXPIRE = 7200; //过期时间，2小时
}
