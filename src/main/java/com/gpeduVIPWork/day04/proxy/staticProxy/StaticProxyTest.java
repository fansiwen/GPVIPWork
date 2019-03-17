package com.gpeduVIPWork.day04.proxy.staticProxy;

/**
 * 测试类
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
