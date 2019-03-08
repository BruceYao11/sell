package com.example.sell.dao;

import com.example.sell.bean.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoDao extends JpaRepository<ProductInfo,String> {

    ProductInfo findByProductId(String id);

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
