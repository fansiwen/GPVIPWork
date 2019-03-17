package com.gpeduVIPWork.day01.factory.factoryMethod;

import com.gpeduVIPWork.day01.factory.abstractFactory.CarFacory;
import com.gpeduVIPWork.day01.product.CRV;
import com.gpeduVIPWork.day01.product.Car;
import com.gpeduVIPWork.day01.product.Honda;
import com.gpeduVIPWork.day01.product.Prado;

public class HondaFactory extends CarFacory implements CarFactory{
    @Override
    public Car getCar() {
        return new Honda();
    }
    public CRV getCRV(){
        return new CRV();
    }
    public Prado getPrado(){
        return new Prado();
    }
}
