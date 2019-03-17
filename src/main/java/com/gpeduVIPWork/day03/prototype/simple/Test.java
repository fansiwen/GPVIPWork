package com.gpeduVIPWork.day03.prototype.simple;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        CreatPrototype c1 = new CreatPrototype();
        c1.setAge(11);
        c1.setName("fsw");
        c1.setArrays(new int[]{1000,200});

        CreatPrototype c2 = (CreatPrototype) c1.clone();
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.getArrays()[0]);
        System.out.println(c2.getArrays()[0]);
        int[]a = c2.getArrays();
        a[0] = 500;
        c2.setArrays(a);
        System.out.println(c1.getArrays()[0]);
        System.out.println(c2.getArrays()[0]);
    }
}
