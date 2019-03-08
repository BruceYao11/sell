package com.example.sell.dto;

import com.example.sell.bean.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @program: sell
 * @description:
 * @author: Bruce
 * @create: 2019-03-07 19:47
 **/
@Data
public class OrderDTO {

    /*订单id*/
    private String orderId;

    /*买家微信openid*/
    private String buyerOpenid;

    /*订单总金额*/
    private BigDecimal orderAmount;

    /*订单状态,默认新下单*/
    private Integer orderStatus;

    /*支付状态*/
    private  Integer payStatus;

    /*创建时间*/
    private Date createTime;

    /*更新时间*/
    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}