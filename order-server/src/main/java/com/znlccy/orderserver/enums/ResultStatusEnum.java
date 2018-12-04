package com.znlccy.orderserver.enums;

import lombok.Getter;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-18:38
 * @Version: v1.0.0
 * @Comment: 结果状态枚举
 */

@Getter
public enum ResultStatusEnum {

    SUCCESS(200, "成功"),
    FAILED(404, "失败");

    private Integer code;

    private String message;

    ResultStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
