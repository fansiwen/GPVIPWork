package com.gpeduVIPWork.day03.prototype.simple;

import java.util.List;

/**
 * 创建一个需要被克隆的对象
 */
public class ConcreatPrototypeA implements Prototype{
    private int age;
    private String name;
    private int[]a;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    /*
        实现clone方法
         */
    @Override
    public ConcreatPrototypeA clone() {
        ConcreatPrototypeA concreatPrototypeA = new ConcreatPrototypeA();
        concreatPrototypeA.setAge(this.age);
        concreatPrototypeA.setName(this.name);
        concreatPrototypeA.setA(this.a);
        return concreatPrototypeA;
    }
}
