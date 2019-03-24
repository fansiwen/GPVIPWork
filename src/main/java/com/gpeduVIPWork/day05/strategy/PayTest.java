package com.gpeduVIPWork.day05.strategy;

public class PayTest {
    public static void main(String[] args) {
        Order order = new Order("1","fsw001",264.5);
        System.out.println(order.pay(PayStrategy.AliPay));
    }
}
