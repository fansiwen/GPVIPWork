package com.gpeduVIPWork.day02.signgleton.hungry;

/**
 * 饿汉式单例模式
 */
public class HungrySignleton {


    private static final HungrySignleton hungrySignleton = new HungrySignleton();
    //私有化构造方法
    private HungrySignleton(){}
    //对外提供调用方法
    public static HungrySignleton getHungrySignleton(){
        return hungrySignleton;
    }

}
