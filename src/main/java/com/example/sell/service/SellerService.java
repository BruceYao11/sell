package com.example.sell.service;

import com.example.sell.bean.SellerInfo;

public interface SellerService {

    public SellerInfo findSellerInfoByOpenid(String openid);

    public SellerInfo findSellerInfoBySellerId(String sellerId);
}
