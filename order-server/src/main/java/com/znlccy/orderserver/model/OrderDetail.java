package com.znlccy.orderserver.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-15:02
 * @Version: v1.0.0
 * @Comment: 订单详情实体类
 */

@Data
@Entity
public class OrderDetail {

    /* 主键 */
    @Id
    private String detailId;

    /* 订单主键 */
    private String orderId;

    /* 产品主键 */
    private String productId;

    /* 产品名称 */
    private String productName;

    /* 产品价格 */
    private BigDecimal productPrice;

    /* 产品数量 */
    private Integer productQuantity;

    /* 产品图片 */
    private String productIcon;

}
