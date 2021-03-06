package com.example.sell.controller;

import com.example.sell.dto.DetailDTO;
import com.example.sell.dto.OrderDTO;
import com.example.sell.service.OrderService;
import com.example.sell.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: sell
 * @description: 销量统计
 * @author: Bruce
 * @create: 2019-04-24 12:16
 **/
@Controller
@RequestMapping("/seller/common")
public class TotalController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/total")
    public ModelAndView list(Map<String,Object> map) {
        List<OrderDTO> orderDTOList = orderService.findAll();
        BigDecimal amount = orderDTOList
                .stream()
                .map(OrderDTO::getOrderAmount)
                .reduce(BigDecimal::add)
                .get();
        map.put("amount",amount);

        List<DetailDTO> detailDTOList = orderService.findAllDetails();
        List<String> name = detailDTOList.stream().map(dto -> dto.getProductName()).collect(Collectors.toList());
        List<Integer> quantity = detailDTOList.stream().map(dto -> dto.getQuantity()).collect(Collectors.toList());
        map.put("name", JsonUtil.toJson(name));
        map.put("quantity",JsonUtil.toJson(quantity));

        return new ModelAndView("common/total",map);
    }

}