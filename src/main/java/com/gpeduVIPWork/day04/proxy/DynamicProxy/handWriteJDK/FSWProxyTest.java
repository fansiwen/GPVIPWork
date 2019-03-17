package com.gpeduVIPWork.day04.proxy.DynamicProxy.handWriteJDK;

import com.gpeduVIPWork.day04.proxy.DynamicProxy.Girl;
import com.gpeduVIPWork.day04.proxy.DynamicProxy.JDKMeipo;
import com.gpeduVIPWork.day04.proxy.staticProxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * 测试类
 */
public class FSWProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new FSWMeipo().getInstance(new Girl());
        person.findLove();
    }

}
