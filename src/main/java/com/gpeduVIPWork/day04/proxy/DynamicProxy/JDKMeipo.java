package com.gpeduVIPWork.day04.proxy.DynamicProxy;

import com.gpeduVIPWork.day04.proxy.staticProxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 媒婆，作为所有想找对象的人的代理
 * JDK动态代理实现
 */
public class JDKMeipo implements InvocationHandler {
    //持有一个被代理的对象
    private Person target;

    //获取代理对象的方法
    public Object getInstance(Person target){
        this.target = target;
        Class <?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        befroe();
       Object object = method.invoke(this.target,args);
       after();
       return object;
    }

    private void after() {
        System.out.println("这个对象还满意不，如果满意给个好评");
    }

    private void befroe() {
        System.out.println("我是媒婆，我开始给你找对象啦");
    }
}
