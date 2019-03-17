package com.gpeduVIPWork.day04.proxy.DynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.omg.PortableInterceptor.Interceptor;

import java.lang.reflect.Method;

/**
 * 使用Cglib方式实现动态代理
 */
public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        //设置要生成的父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        //业务增强
        before();
        Object returnObj = proxy.invokeSuper(obj,args);
        after();
        return returnObj;
    }

    private void after() {
        System.out.println("如果合适的话，就准备办事");
    }

    private void before() {
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }
}
