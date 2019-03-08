package com.example.sell.exception;

import com.example.sell.enums.ResultEnum;

/**
 * @program: sell
 * @description:
 * @author: Bruce
 * @create: 2019-03-07 20:00
 **/
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());

        this.code = resultEnum.getCode();
    }
}