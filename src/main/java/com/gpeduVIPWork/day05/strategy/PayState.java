package com.gpeduVIPWork.day05.strategy;

/**
 * 支付状态类
 * 支付完成之后的状态
 */
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data);
    }
}
