package com.gpeduVIPWork.day03.prototype.simple;

import java.util.Arrays;
import java.util.List;

/**
 * 浅克隆，复制的是引用地址，如果改变任意一个对象中
 * 的值，那么其他克隆的对象值也会随之改变
 */
public class SimpleTest {
    public static void main(String[] args) {
        ConcreatPrototypeA concreatPrototypeA = new ConcreatPrototypeA();
        concreatPrototypeA.setAge(18);
        concreatPrototypeA.setName("fan");
        concreatPrototypeA.setA(new int[]{1000,500});
        Client client = new Client();

        ConcreatPrototypeA concreatPrototypeB = (ConcreatPrototypeA) client.startClone(concreatPrototypeA);
        System.out.println(concreatPrototypeA);
        System.out.println(concreatPrototypeB);
        System.out.println(concreatPrototypeA.getA()[0]);
        System.out.println(concreatPrototypeB.getA()[0]);
        int[]a = concreatPrototypeB.getA();
        a[0] = 500;
        concreatPrototypeB.setA(a);
        System.out.println(concreatPrototypeA.getA()[0]);
        System.out.println(concreatPrototypeB.getA()[0]);

    }
}
