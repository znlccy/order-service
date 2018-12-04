package com.znlccy.orderserver.repository;

import com.znlccy.orderserver.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-18:24
 * @Version: v1.0.0
 * @Comment: 订单详情映射类
 */
@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

}
