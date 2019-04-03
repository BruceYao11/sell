package com.example.sell.service.impl;

import com.example.sell.bean.ProductInfo;
import com.example.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl service;

    @Test
    public void findOne() throws Exception{
        ProductInfo info = service.findOne("123");
        Assert.assertEquals("123",info.getProductId());
    }

    @Test
        public void findUpAll() throws Exception{
        List<ProductInfo> infos = service.findUpAll();
        Assert.assertNotEquals(0,infos.size());
    }

    @Test
    public void findAll() throws Exception{
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfoPage = service.findAll(request);
 //       System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());
    }

    @Test
    @Transactional
    public void save() throws Exception{
        /*ProductInfo info = service.save(new ProductInfo("001","小米粥",new BigDecimal(2.2),100,"营养的粥","http://xxxyyx.jpg", ProductStatusEnum.UP.getCode(),3));
        Assert.assertNotNull(info);*/
    }
}