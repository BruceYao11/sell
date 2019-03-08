package com.example.sell.service;

import com.example.sell.bean.ProductCategory;

import java.util.List;

public interface CategoryService {

    ProductCategory findOne(Integer id);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    //新增修改都是用的save方法
    ProductCategory save(ProductCategory productCategory);
}
