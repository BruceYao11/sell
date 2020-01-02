package com.example.sell.handler;

import com.example.sell.VO.ResultVO;
import com.example.sell.config.ProjectUrlConfig;
import com.example.sell.exception.SellException;
import com.example.sell.exception.SellerAuthorizeException;
import com.example.sell.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by brcue
 * 2019-04-09 17:44
 */
@ControllerAdvice
public class SellExceptionHandler {

    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    // 拦截登录异常,适用于微信扫码登录
    // http://semall.natapp1.cc/sell/wechat/qrAuthorize?returnUrl=http://semall.natapp1.cc/sell/seller/login
    // @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException() {
        return new ModelAndView("redirect:"
        .concat(projectUrlConfig.getWechatOpenAuthorize())
        .concat("/sell/wechat/qrAuthorize")
        .concat("?returnUrl=")
        .concat(projectUrlConfig.getSell())
        .concat("/sell/seller/login"));
    }

    // 普通登录http://semall.natapp1.cc/sell/seller/common/login
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerLoginException() {
        return new ModelAndView("redirect:"+ projectUrlConfig.getSell()+"/sell/seller/common/login");
    }

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerServletException(SellException e){
        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }
}
