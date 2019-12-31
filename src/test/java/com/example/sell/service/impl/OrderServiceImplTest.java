package com.example.sell.service.impl;

import com.example.sell.bean.OrderDetail;
import com.example.sell.dto.OrderDTO;
import com.example.sell.enums.OrderStatusEnum;
import com.example.sell.enums.PayStatusEnum;
import com.example.sell.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    private String OPENID = "1101101";
    private String ORDERID = "1552012887210218905";

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {
        OrderDTO dto = new OrderDTO();
        dto.setBuyerOpenid(OPENID);
        //购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductQuantity(1);
        orderDetail.setProductId("001");
        OrderDetail orderDetail2 = new OrderDetail();
        orderDetail2.setProductQuantity(1);
        orderDetail2.setProductId("123");
        orderDetailList.add(orderDetail);
        orderDetailList.add(orderDetail2);
        dto.setOrderDetailList(orderDetailList);
        dto = orderService.create(dto);
        log.info("[创建订单] result={}",dto);
        Assert.assertNotNull(dto);
    }

    @Test
    public void findOne() {
        OrderDTO orderDTO = orderService.findOne("1552202549158980903");
        log.info("[创建订单] result={}",orderDTO);
        Assert.assertEquals("1552202549158980903",orderDTO.getOrderId());
    }

    @Test
    public void findList() {
        PageRequest request = PageRequest.of(0,2);
        Page<OrderDTO>  orderDTOPage = orderService.findList(OPENID,request);
        Assert.assertNotEquals(0,orderDTOPage.getTotalElements());
    }

    @Test
    public void cancel() {
        OrderDTO dto = orderService.findOne(ORDERID);
        OrderDTO result = orderService.cancel(dto);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(),result.getOrderStatus());
    }

    @Test
    public void finish() {
        OrderDTO dto = orderService.findOne(ORDERID);
        OrderDTO result = orderService.finish(dto);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(),result.getOrderStatus());
    }

    @Test
    public void paid() {
        OrderDTO orderDTO = orderService.findOne(ORDERID);
        OrderDTO result = orderService.paid(orderDTO);
        Assert.assertEquals(PayStatusEnum.SUCCESS.getCode(),result.getPayStatus());
    }

    @Test
    public void list() {
        PageRequest request = PageRequest.of(0,2);
        Page<OrderDTO>  orderDTOPage = orderService.findList(request);
        Assert.assertNotEquals(0,orderDTOPage.getTotalElements());
    }
}