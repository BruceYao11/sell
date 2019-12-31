package com.example.sell.utils;

import com.example.sell.enums.CodeEnum;

/**
 * @program: sell
 * @description: 枚举状态转换
 * @author: Bruce
 * @create: 2019-04-02 13:28
 **/
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code,Class<T> enumClass) {
        for (T each:enumClass.getEnumConstants()) {
            if(code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}