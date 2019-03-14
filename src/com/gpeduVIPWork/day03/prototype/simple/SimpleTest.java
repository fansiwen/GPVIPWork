package com.gpeduVIPWork.day03.prototype.simple;

import java.util.Arrays;

/**
 * 浅克隆，复制的是引用地址，如果改变任意一个对象中
 * 的值，那么其他克隆的对象值也会随之改变
 */
public class SimpleTest {
    public static void main(String[] args) {
        ConcreatPrototypeA concreatPrototypeA = new ConcreatPrototypeA();
        concreatPrototypeA.setAge(18);
        concreatPrototypeA.setName("fan");
        concreatPrototypeA.setHobbies(Arrays.asList(new String[]{"看电影","旅游"}));

        Client client = new Client();

        ConcreatPrototypeA concreatPrototypeB = (ConcreatPrototypeA) client.startClone(concreatPrototypeA);

        System.out.println(concreatPrototypeA.getHobbies());
        System.out.println(concreatPrototypeB.getHobbies());
    }
}
