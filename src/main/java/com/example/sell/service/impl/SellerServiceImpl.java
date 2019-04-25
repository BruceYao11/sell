package com.example.sell.service.impl;

import com.example.sell.bean.SellerInfo;
import com.example.sell.dao.SellerInfoDao;
import com.example.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: sell
 * @description: 卖家端service
 * @author: Bruce
 * @create: 2019-04-03 15:04
 **/
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoDao sellerInfoDao;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return sellerInfoDao.findByOpenid(openid);
    }

    @Override
    public SellerInfo findSellerInfoBySellerId(String sellerId) {
        return sellerInfoDao.findBySellerId(sellerId);
    }
}