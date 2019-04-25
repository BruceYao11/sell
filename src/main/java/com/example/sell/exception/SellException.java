package com.example.sell.exception;

import com.example.sell.enums.ResultEnum;
import lombok.Getter;

/**
 * @program: sell
 * @description:
 * @author: Bruce
 * @create: 2019-03-07 20:00
 **/

@Getter
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message) {
        super(message);
        this.code = code;
    }
}