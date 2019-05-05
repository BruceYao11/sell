package com.example.sell.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: sell
 * @description:
 * @author: Bruce
 * @create: 2019-04-28 22:36
 **/
@Data
public class DetailDTO {

    private String detailId;

    /*订单id*/
    private String orderId;

    /*商品id*/
    private String productId;

    /*商品名称*/
    private String productName;

    /*商品单价*/
    private BigDecimal productPrice;

    /*商品数量*/
    private Integer productQuantity;

    /*商品小图*/
    private String productIcon;

    private Integer quantity;
}