package com.gpeduVIPWork.day02.signgleton.register;

import java.lang.reflect.Constructor;

/**
 * 测试通过反射是否可以破坏
 * 枚举式单例
 */
public class EnumInvokeTest {
    public static void main(String[] args) {
        Class<?> clazz = EnumSingleton.class;
        /*try{
            Constructor c = clazz.getDeclaredConstructor();
            c.setAccessible(true);
            Object o = c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }*/
        try{
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            Object o = c.newInstance("fsw",666);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
