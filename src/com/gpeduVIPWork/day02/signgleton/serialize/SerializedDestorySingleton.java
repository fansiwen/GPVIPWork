package com.gpeduVIPWork.day02.signgleton.serialize;

import java.io.Serializable;

/**
 * 序列化方式也可以破坏单例模式，
 * 将对象序列化到磁盘中，再由反序列化将对象读取到内存中，
 * 在这个过程中，对象会被重新分配内存，重新创建，破坏了单例模式的初衷
 */
public class SerializedDestorySingleton implements Serializable {
    private static final SerializedDestorySingleton serializedDestorySingleton = new SerializedDestorySingleton();

    private SerializedDestorySingleton(){}

    public static  SerializedDestorySingleton getInstance(){
        return serializedDestorySingleton;
    }
    //解决序列化破坏单例的方案，增加readResolve()fangfa
    private Object readResolve(){
        return serializedDestorySingleton;
    }
}
