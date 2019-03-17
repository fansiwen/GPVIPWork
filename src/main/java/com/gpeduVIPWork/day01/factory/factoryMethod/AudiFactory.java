package com.gpeduVIPWork.day01.factory.factoryMethod;

import com.gpeduVIPWork.day01.factory.abstractFactory.CarFacory;
import com.gpeduVIPWork.day01.product.Audi;
import com.gpeduVIPWork.day01.product.Car;
import com.gpeduVIPWork.day01.product.Q5;
import com.gpeduVIPWork.day01.product.Q7;

public class AudiFactory extends CarFacory implements CarFactory {
    @Override
    public Car getCar() {
        return new Audi();
    }
    //生产一辆Q5
    public Q5 getQ5(){
        return new Q5();
    }
    //生产一辆Q7
    public Q7 getQ7(){
        return new Q7();
    }
}
