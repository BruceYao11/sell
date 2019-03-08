package com.example.sell.dto;

import lombok.Data;

/**
 * @program: sell
 * @description:购物车
 * @author: Bruce
 * @create: 2019-03-07 21:53
 **/
@Data
public class CartDTO {

    /*商品id*/
    private String productId;

    /*商品数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}