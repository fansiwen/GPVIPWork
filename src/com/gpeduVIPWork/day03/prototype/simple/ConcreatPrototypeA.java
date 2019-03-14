package com.gpeduVIPWork.day03.prototype.simple;

import java.util.List;

/**
 * 创建一个需要被克隆的对象
 */
public class ConcreatPrototypeA implements Prototype{
    private int age;
    private String name;
    private List hobbies;

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

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }
    /*
    实现clone方法
     */
    @Override
    public ConcreatPrototypeA clone() {
        ConcreatPrototypeA concreatPrototypeA = new ConcreatPrototypeA();
        concreatPrototypeA.setAge(this.age);
        concreatPrototypeA.setName(this.name);
        concreatPrototypeA.setHobbies(this.hobbies);
        return concreatPrototypeA;
    }
}
