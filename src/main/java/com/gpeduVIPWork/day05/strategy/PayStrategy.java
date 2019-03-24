package com.gpeduVIPWork.day05.strategy;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
    public final static String AliPay = "Alipay";
    public final static String WeixinPay = "WeixinPay";
    public static final String DEFAULT_PAY = "Alipay";
    private static Map<String,Payment> payStrategy = new HashMap<String, Payment>();
    static {
        payStrategy.put(AliPay,new AliPay());
        payStrategy.put(WeixinPay,new WeixinPay());
    }

    public static Payment get(String key){
        if(!payStrategy.containsKey(key)){
            payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(key);
    }
}
