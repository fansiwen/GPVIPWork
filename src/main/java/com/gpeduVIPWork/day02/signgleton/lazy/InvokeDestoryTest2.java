package com.gpeduVIPWork.day02.signgleton.lazy;

import java.lang.reflect.Constructor;

/**
 * 利用反射机制破坏单例测试
 */
public class InvokeDestoryTest2 {
    public static void main(String[] args) throws Exception {
        //获取懒汉式（内部类实现）的类
        Class<?> clazz = LazyInnerClassAdvance.class;
        //通过反射机制获取私有构造方法
        Constructor constructor = clazz.getDeclaredConstructor(null);
        //设置强制访问
        constructor.setAccessible(true);
        //暴力初始化,相当于调用了两次构造方法
        Object o1 = constructor.newInstance();
        Object o2 = constructor.newInstance();
        System.out.println(o1 == o2);
    }
}
