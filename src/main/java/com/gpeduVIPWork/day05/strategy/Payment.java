package com.gpeduVIPWork.day05.strategy;

/**
 * 定义一个支付方式的抽象类
 */
public abstract class Payment {
    //支付类型
    public abstract String getName();
    //查询余额
    public abstract double queryBalance(String id);
    //扣款支付
    public PayState pay(String uid,double amout){
        if(queryBalance(uid)<amout){
            return new PayState(500,"支付失败","余额不足");
        }return new PayState(200,"支付成功","支付金额"+amout);
    }
}
