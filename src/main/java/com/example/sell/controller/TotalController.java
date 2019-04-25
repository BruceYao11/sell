package com.example.sell.controller;

import com.example.sell.dto.OrderDTO;
import com.example.sell.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

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
    public ModelAndView list(@RequestParam(value = "page",defaultValue = "1") Integer page,
                             @RequestParam(value = "size",defaultValue = "5") Integer size,
                             Map<String,Object> map){
        Sort sort = new Sort(Sort.Direction.DESC,"createTime");
        PageRequest request = new PageRequest(page-1,size,sort);
        Page<OrderDTO> orderDTOPage = orderService.findList(request);
        map.put("orderDTOPage",orderDTOPage);
        map.put("currentPage",page);
        map.put("size",size);
        return new ModelAndView("common/total",map);
    }
}