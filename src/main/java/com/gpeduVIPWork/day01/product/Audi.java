package com.gpeduVIPWork.day01.product;

public class Audi implements Car{
    public Audi() {
        System.out.println("一辆奥迪生产出来了");
    }

    @Override
    public String getCar(String name) {
        return "生产一辆奥迪";
    }
}
