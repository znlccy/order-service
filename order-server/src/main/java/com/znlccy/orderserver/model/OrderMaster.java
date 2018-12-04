package com.znlccy.orderserver.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-15:03
 * @Version: v1.0.0
 * @Comment: 订单主体实体类
 */
@Data
@Entity
public class OrderMaster {

    /* 主键 */
    @Id
    private String orderId;

    /* 买家姓名 */
    private String buyerName;

    /* 买家手机 */
    private String buyerPhone;

    /* 买家地址 */
    private String buyerAddress;

    /* 买家公开主键 */
    private String buyerOpenid;

    /* 订单总价 */
    private BigDecimal orderAmount;

    /* 订单状态 */
    private Integer orderStatus;

    /* 支付状态 */
    private Integer payStatus;

    /* 创建时间 */
    private Date createTime;

    /* 更新时间 */
    private Date updateTime;


}
