package com.example.sell.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @program: sell
 * @description:
 * @author: Bruce
 * @create: 2019-03-09 20:39
 **/
@Data
public class OrderForm {

    @NotEmpty(message = "openid必填")
    private String openid;

    /*购物车*/
    @NotEmpty(message = "购物车不能为空")
    private String items;
}