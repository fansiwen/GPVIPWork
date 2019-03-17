package com.gpeduVIPWork.day04.proxy.DynamicProxy.cglib;

/**
 * 测试类
 */
public class CglibTest {
    public static void main(String[] args) {
        Girl girl = (Girl) new CglibMeipo().getInstance(Girl.class);
        girl.findLove();
    }
}
