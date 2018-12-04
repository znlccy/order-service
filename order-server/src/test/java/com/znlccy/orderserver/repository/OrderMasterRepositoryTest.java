package com.znlccy.orderserver.repository;

import com.znlccy.orderserver.OrderServerApplicationTests;
import com.znlccy.orderserver.enums.OrderStatusEnum;
import com.znlccy.orderserver.model.OrderMaster;
import org.hibernate.criterion.Order;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

@Component
public class OrderMasterRepositoryTest extends OrderServerApplicationTests {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1278178572134129340");
        orderMaster.setBuyerName("猴哥");
        orderMaster.setBuyerAddress("上海纵谷");
        orderMaster.setBuyerPhone("1584578751");
        orderMaster.setBuyerOpenid("113747");
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(OrderStatusEnum.CANCLE.getCode());
        orderMaster.setOrderAmount(new BigDecimal(23.54));
        orderMaster.setCreateTime(new Date());
        orderMaster.setUpdateTime(new Date());

        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertTrue(result != null);
    }
}