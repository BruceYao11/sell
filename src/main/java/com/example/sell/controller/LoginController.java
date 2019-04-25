package com.example.sell.controller;

import com.example.sell.bean.SellerInfo;
import com.example.sell.config.ProjectUrlConfig;
import com.example.sell.constant.CookieConstant;
import com.example.sell.constant.RedisConstant;
import com.example.sell.enums.ResultEnum;
import com.example.sell.service.SellerService;
import com.example.sell.utils.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @program: sell
 * @description: 普通登录
 * @author: Bruce
 * @create: 2019-04-07 12:32
 **/
@Controller
@RequestMapping("/seller/common")
public class LoginController {

    @Autowired
    private SellerService sellerService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("common/login");
    }


    @PostMapping("/check")
    public ModelAndView check(@RequestParam("sellerId") String sellerId,
                              @RequestParam("password") String password,
                              HttpServletResponse response,
                              Map<String, Object> map) {
        SellerInfo sellerInfo = sellerService.findSellerInfoBySellerId(sellerId);
        if ((sellerInfo == null) || (!password.equals(sellerInfo.getPassword()))) {
            map.put("msg", ResultEnum.LOGIN_FAIL.getMsg());
            map.put("url", "/sell/seller/order/list");
            return new ModelAndView("common/error");
        }
        //2. 设置token至redis
        String token = UUID.randomUUID().toString();
        Integer expire = RedisConstant.EXPIRE;

        redisTemplate.opsForValue().set(String.format(RedisConstant.TOKEN_PREFIX, token), sellerId, expire, TimeUnit.SECONDS);

        //3. 设置token至cookie
        CookieUtil.set(response, CookieConstant.TOKEN, token, expire);
        return new ModelAndView("redirect:" + projectUrlConfig.getSell() + "/sell/seller/order/list");
    }
}