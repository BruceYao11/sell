package com.example.sell.service.impl;

import com.example.sell.dto.OrderDTO;
import com.example.sell.service.OrderService;
import com.example.sell.service.PushMessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PushMessageServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PushMessageService pushMessageService;

    @Test
    public void orderStatus() {
        OrderDTO orderDTO = orderService.findOne("1552202439583973367");
        pushMessageService.orderStatus(orderDTO);
    }

}