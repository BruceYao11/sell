package com.example.sell.service;


import com.example.sell.dto.OrderDTO;

/**
 * 推送消息
 * Created by brcue
 * 2019-04-09 22:08
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
