package com.gpeduVIPWork.day05.strategy;

public class WeixinPay extends Payment{
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public double queryBalance(String id) {
        return 500;
    }
}
