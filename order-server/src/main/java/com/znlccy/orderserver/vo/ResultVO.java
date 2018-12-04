package com.znlccy.orderserver.vo;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-17:44
 * @Version: v1.0.0
 * @Comment: 返回结果数据
 */
public class ResultVO<T> {

    /* 返回状态码 */
    private Integer code;

    /* 返回状态信息 */
    private String msg;

    /*  */
    private T data;
}
