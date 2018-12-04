package com.znlccy.orderserver.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-17:46
 * @Version: v1.0.0
 * @Comment: 返回订单数据
 */
public class OrderVO {

    @JsonProperty("orderId")
    private Integer orderId;
}
