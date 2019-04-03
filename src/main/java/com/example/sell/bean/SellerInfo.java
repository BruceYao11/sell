package com.example.sell.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @program: sell
 * @description: 卖家信息
 * @author: Bruce
 * @create: 2019-04-03 13:40
 **/
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String sellerName;

    private String password;

    private String openid;

}