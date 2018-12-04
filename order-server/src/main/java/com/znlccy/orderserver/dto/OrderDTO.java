package com.znlccy.orderserver.dto;

import com.znlccy.orderserver.model.OrderDetail;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderDTO {

    /* 主键 */
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

    /* 包含多个订单详情 */
    private List<OrderDetail> orderDetailList;
}
