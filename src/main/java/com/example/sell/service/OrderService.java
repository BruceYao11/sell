package com.example.sell.service;

import com.example.sell.bean.OrderDetail;
import com.example.sell.dto.DetailDTO;
import com.example.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface OrderService {

    /*创建订单*/
    OrderDTO create(OrderDTO orderDTO);

    /*查询单个订单*/
    OrderDTO findOne(String orderId);

    /*查询订单列表*/
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /*取消订单*/
    OrderDTO cancel(OrderDTO orderDTO);

    /*完结订单*/
    OrderDTO finish(OrderDTO orderDTO);

    /*支付订单*/
    OrderDTO paid(OrderDTO orderDTO);

    /*查询订单列表*/
    Page<OrderDTO> findList(Pageable pageable);

    List<OrderDTO> findAll();

    List<DetailDTO> findAllDetails();
}
