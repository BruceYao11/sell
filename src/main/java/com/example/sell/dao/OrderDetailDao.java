package com.example.sell.dao;

import com.example.sell.bean.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderDetailDao extends JpaRepository<OrderDetail,String> {

    List<OrderDetail> findByOrderId(String orderId);

    @Query(value = "select * from order_detail group by product_name", nativeQuery = true)
    List<OrderDetail> findAll();

    @Query(value = "select sum(product_quantity) from order_detail where product_name= :name",nativeQuery = true)
    Integer findQuantityByName(@Param("name") String name);
}
