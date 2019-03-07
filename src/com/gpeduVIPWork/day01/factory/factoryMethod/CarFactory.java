package com.gpeduVIPWork.day01.factory.factoryMethod;

import com.gpeduVIPWork.day01.product.Car;

/**
 * 工厂方法模式-23种常见的设计模式之一
 * 这是一个汽车工厂的接口
 * 如果需要一辆奥迪车，那么就先创建一个奥迪的车工厂
 * 如果需要一辆宝马，就创建一个宝马的工厂
 * 如果需要一辆本田就创建一个本田的工厂
 * 这样做的好处是，每次新增一个产品就直接增加一个工厂和一个产品类即可
 * 但是同样也有缺点，那么就是工厂类和产品类数量会很多，不易于管理。
 */
public interface CarFactory {
    public Car getCar();
}
