package com.gpeduVIPWork.day04.proxy.staticProxy;

public class Son implements Person {
    //儿子需要找对象，有标准
    @Override
    public void findLove() {
        System.out.println("胸大、屁股翘、皮肤白");
    }
}
