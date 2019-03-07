package com.gpeduVIPWork.day01.factory.simpleFactory;

public class TestSimpleFactory {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getProduct("Audi"));
        System.out.println(simpleFactory.getProduct("BMW"));
        System.out.println(simpleFactory.getProduct("Honda"));
    }
}
