package com.example.sell.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: sell
 * @description: 商品表单提交
 * @author: Bruce
 * @create: 2019-04-03 09:46
 **/
@Data
public class ProductForm {

    private String productId;

    /*名字*/
    private String productName;

    /*单价*/
    private BigDecimal productPrice;

    /*库存*/
    private Integer productStock;

    /*描述*/
    private String productDescription;

    /*小图，链接地址*/
    private String productIcon;

    /*类目编号*/
    private Integer categoryType;

}