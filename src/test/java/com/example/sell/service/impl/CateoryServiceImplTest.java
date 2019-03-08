package com.example.sell.service.impl;

import com.example.sell.bean.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CateoryServiceImplTest {

    @Autowired
    private CateoryServiceImpl cateoryService;

    @Test
    public void findOne() {
        ProductCategory p = cateoryService.findOne(1);
        Assert.assertEquals(new Integer(1),p.getCategoryId());
    }

    @Test
    public void findAll() throws Exception{
        List<ProductCategory> productCategories = cateoryService.findAll();
        Assert.assertNotEquals(0,productCategories.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception{
        List<Integer> list = new ArrayList<>();
        list.add(3);
        List<ProductCategory> productCategories = cateoryService.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,productCategories.size());
    }

    @Test
    public void save() throws Exception{
        ProductCategory p = new ProductCategory("盖浇饭",9);
        ProductCategory result = cateoryService.save(p);
        Assert.assertNotNull(result);
    }
}