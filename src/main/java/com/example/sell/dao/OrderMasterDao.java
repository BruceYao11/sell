package com.example.sell.dao;

import com.example.sell.bean.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderMasterDao extends JpaRepository<OrderMaster,String> {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);

    OrderMaster findByOrderId(String orderId);

    @Query(value = "select * from order_master where date_format(create_time,'%Y-%m')= date_format(now(),'%Y-%m')", nativeQuery = true)
    List<OrderMaster> findAll();
}
