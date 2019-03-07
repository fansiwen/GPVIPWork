package com.gpeduVIPWork.day01.factory.abstractFactory;

import com.gpeduVIPWork.day01.factory.factoryMethod.AudiFactory;
import com.gpeduVIPWork.day01.factory.factoryMethod.BMWFactory;
import com.gpeduVIPWork.day01.factory.factoryMethod.HondaFactory;

/**
 * 抽象工厂方法模式
 * 将工厂进行抽象，将工厂进行产品族和产品等级结构划分
 * 产品族可以看做是一个品牌，而产品等级结构可以看成是同一类的产品
 * 抽象工厂可以实现对产品批次的划分，而工厂方法模式是一个专有工厂生产一个具体的产品
 * 比如奥迪品牌下面有Q5,Q7，A4，A6....
 * 宝马有X5，X6，X3，750，550...
 * 丰田有CRV,LeiVIN,Prado..
 */
public abstract class AbstractFactory {
    //奥迪工厂
    public abstract AudiFactory getAudiFactory();
    //宝马工厂
    public abstract BMWFactory getBMWFactory();
    //丰田工厂
    public abstract HondaFactory getHondaFactory();
}
