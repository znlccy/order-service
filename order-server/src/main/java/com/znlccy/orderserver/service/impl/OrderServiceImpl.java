package com.znlccy.orderserver.service.impl;

import com.znlccy.orderserver.dto.OrderDTO;
import com.znlccy.orderserver.enums.OrderStatusEnum;
import com.znlccy.orderserver.model.OrderMaster;
import com.znlccy.orderserver.repository.OrderDetailRepository;
import com.znlccy.orderserver.repository.OrderMasterRepository;
import com.znlccy.orderserver.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-15:00
 * @Version: v1.0.0
 * @Comment: 订单服务实现类
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        OrderMaster orderMaster = new OrderMaster();
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(34.54));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(0);
        /*orderMaster.setOrderId();*/
        orderMasterRepository.save(orderMaster);
        return null;
    }
}
