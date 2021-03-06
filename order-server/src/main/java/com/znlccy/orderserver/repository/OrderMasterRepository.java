package com.znlccy.orderserver.repository;

import com.znlccy.orderserver.model.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-18:23
 * @Version: v1.0.0
 * @Comment: 订单主体映射类
 */
@Repository
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {


}
