package com.gpeduVIPWork.day01.factory.simpleFactory;

import com.gpeduVIPWork.day01.product.Audi;
import com.gpeduVIPWork.day01.product.BMW;
import com.gpeduVIPWork.day01.product.Car;
import com.gpeduVIPWork.day01.product.Honda;

/**
 * 简单工厂模式
 * 想要什么车就传入车辆的名称，由统一的工厂制造，
 * 如果有新增加的产品就要修改工厂的代码，
 * 违反了开闭原则。
 */
public class SimpleFactory {
    public Car getProduct(String name){
        if("Audi".equals(name)){
            return new Audi();
        }else if ("BMW".equals(name)){
            return new BMW();
        }else if("Honda".equals(name)){
            return new Honda();
        }else{
            System.out.println("没有您指定的车辆!");
            return null;
        }
    }
}
