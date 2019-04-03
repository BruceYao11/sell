package com.example.sell.dao;

import com.example.sell.bean.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {

    @Autowired
    private ProductInfoDao dao;

    @Test
    public void saveTest(){
        /*ProductInfo info = new ProductInfo("123","皮蛋粥",new BigDecimal(3.2),100,"好喝的粥","http://xxxx.jpg",0,3);
        ProductInfo result = dao.save(info);
        Assert.assertNotNull(result);*/
    }

    @Test
    public void findByProductStatus() throws Exception{
        List<ProductInfo> infos = dao.findByProductStatus(0);
        Assert.assertNotEquals(0,infos.size());
    }

}