package com.example.sell.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PARAM_ERROR(1,"参数不正确"),

    PRODUCT_NOT_EXIST(10,"商品不存在"),

    PRODUCT_STOCK_ERROR(11,"库存不正确"),

    ORDER_NOT_EXIST(12,"订单不存在"),

    ORDER_DETAIL_NOT_EXIST(13,"订单不存在"),

    ORDER_STATUS_ERROR(14,"订单状态不正确"),

    ORDER_PAY_STATUS_ERROR(15,"订单支付状态不正确"),

    ORDER_UPDATE_FAIL(16,"订单更新失败"),

    ORDER_DETAIL_EMPTY(17,"订单详情为空"),

    CART_EMPTY(18,"购物车为空"),

    ORDER_OWNER_ERROR(19,"该订单不属于当前用户"),

    ORDER_CANCEL_SUCCESS(20,"订单取消成功"),

    ORDER_FINISH_SUCCESS(21,"订单完结成功"),

    PRODUCT_STATUS_ERROR(22,"商品状态不正确"),

    WECHAT_MP_ERROR(23,"微信MP错误"),

    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(24,"微信支付异步通知金额校验不通过"),

    LOGIN_FAIL(25,"登录失败"),

    LOGOUT_SUCCESS(26,"登出成功")
    ;


    private Integer code;

    private  String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
