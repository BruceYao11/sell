package com.example.sell.bean;

import com.example.sell.enums.OrderStatusEnum;
import com.example.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @program: sell
 * @description: 订单主表
 * @author: Bruce
 * @create: 2019-03-07 16:06
 **/
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /*订单id*/
    @Id
    private String orderId;

    /*买家微信openid*/
    private String buyerOpenid;

    /*订单总金额*/
    private BigDecimal orderAmount;

    /*订单状态,默认新下单*/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /*支付状态*/
    private  Integer payStatus = PayStatusEnum.WAIT.getCode();

    /*创建时间*/
    private Date createTime;

    /*更新时间*/
    private Date updateTime;

}