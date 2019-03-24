package com.gpeduVIPWork.day05.strategy;

/**
 * 支付宝支付
 */
public class AliPay extends Payment{
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String id) {
        return 900;
    }
}
