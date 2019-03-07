package com.gpeduVIPWork.day01.factory.factoryMethod;

import com.gpeduVIPWork.day01.factory.abstractFactory.CarFacory;
import com.gpeduVIPWork.day01.product.BMW;
import com.gpeduVIPWork.day01.product.Car;
import com.gpeduVIPWork.day01.product.X5;
import com.gpeduVIPWork.day01.product.X6;

public class BMWFactory extends CarFacory implements CarFactory{
    @Override
    public Car getCar() {
        return new BMW();
    }
    public X5 getX5(){
        return new X5();
    }
    public X6 getX6(){
        return new X6();
    }
}
