package com.znlccy.orderserver.service;

import com.znlccy.orderserver.dto.OrderDTO;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-14:59
 * @Version: v1.0.0
 * @Comment: 订单服务接口
 */
public interface OrderService {

    OrderDTO create(OrderDTO orderDTO);
}
