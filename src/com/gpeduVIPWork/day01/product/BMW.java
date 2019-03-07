package com.gpeduVIPWork.day01.product;

public class BMW implements Car{
    public BMW() {
        System.out.println("一辆宝马生产出来了");
    }

    @Override
    public String getCar(String name) {
        return "生产一辆宝马";
    }
}
