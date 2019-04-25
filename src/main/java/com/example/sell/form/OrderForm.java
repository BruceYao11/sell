package com.example.sell.form;

import lombok.Data;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.validation.constraints.NotEmpty;

/**
 * @program: sell
 * @description:订单表单提交
 * @author: Bruce
 * @create: 2019-03-09 20:39
 **/
@Data
public class OrderForm {

    @NotEmpty(message = "openid必填")
    private String openid;

    @NotEmpty(message = "联系人不能为空")
    private String name;

    @NotEmpty(message = "联系电话不能为空")
    private String phone;

    @NotEmpty(message = "送餐地址不能为空")
    private String address;

    /*购物车*/
    @NotEmpty(message = "购物车不能为空")
    private String items;
}