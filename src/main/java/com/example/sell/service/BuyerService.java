package com.example.sell.service;

import com.example.sell.dto.OrderDTO;

public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String orderId,String openid);

    //取消订单
    OrderDTO cancelOrder(String orderId,String openid);
}
