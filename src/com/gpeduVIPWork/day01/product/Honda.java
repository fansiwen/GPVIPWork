package com.gpeduVIPWork.day01.product;

public class Honda implements Car{
    public Honda() {
        System.out.println("生产一辆丰田");
    }

    @Override
    public String getCar(String name) {
        return "生产一辆丰田";
    }
}
