package com.znlccy.orderserver.repository;

import com.znlccy.orderserver.OrderServerApplicationTests;
import com.znlccy.orderserver.model.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@Component
public class OrderDetailRepositoryTest extends OrderServerApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void testSave() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("y2837r812837213");
        orderDetail.setOrderId("1278178572134129340");
        orderDetail.setProductIcon("eritfu ");
        orderDetail.setProductId("164103465734242707");
        orderDetail.setProductName("蜜汁鸡翅");
        orderDetail.setProductQuantity(3);
        orderDetail.setProductPrice(new BigDecimal(12.34));
        OrderDetail result = orderDetailRepository.save(orderDetail);
        Assert.assertTrue(result != null);
    }

}