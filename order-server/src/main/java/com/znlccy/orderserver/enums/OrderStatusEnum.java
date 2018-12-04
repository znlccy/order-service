package com.znlccy.orderserver.enums;

import lombok.Getter;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-18:36
 * @Version: v1.0.0
 * @Comment: 订单状态枚举
 */
@Getter
public enum OrderStatusEnum {
    /* 声明状态 */
    NEW(0,"新建订单"),
    FINISHED(1,"完结"),
    CANCLE(2,"取消");

    /* 声明状态码 */
    private Integer code;

    /* 声明状态信息 */
    private String message;

    /* 声明构造函数 */
    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
