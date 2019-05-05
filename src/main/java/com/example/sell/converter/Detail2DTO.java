package com.example.sell.converter;

import com.example.sell.bean.OrderDetail;
import com.example.sell.dto.DetailDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: sell
 * @description:
 * @author: Bruce
 * @create: 2019-04-28 23:24
 **/
public class Detail2DTO {
    public static DetailDTO convert(OrderDetail orderDetail){

        DetailDTO detailDTO = new DetailDTO();
        BeanUtils.copyProperties(orderDetail,detailDTO);
        return detailDTO;
    }

    public static List<DetailDTO> convert(List<OrderDetail> orderDetailList){
        return orderDetailList.stream().map(e ->
                convert(e)
        ).collect(Collectors.toList());
    }
}