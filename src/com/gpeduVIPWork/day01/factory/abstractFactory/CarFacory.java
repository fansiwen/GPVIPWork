package com.gpeduVIPWork.day01.factory.abstractFactory;

import com.gpeduVIPWork.day01.factory.factoryMethod.AudiFactory;
import com.gpeduVIPWork.day01.factory.factoryMethod.BMWFactory;
import com.gpeduVIPWork.day01.factory.factoryMethod.HondaFactory;

/**
 * 一个统一的汽车工厂
 * 可以获得用户想要的品牌工厂
 */
public class CarFacory extends AbstractFactory{
    @Override
    public AudiFactory getAudiFactory() {
        return new AudiFactory();
    }

    @Override
    public BMWFactory getBMWFactory() {
        return new BMWFactory();
    }

    @Override
    public HondaFactory getHondaFactory() {
        return new HondaFactory();
    }
}
