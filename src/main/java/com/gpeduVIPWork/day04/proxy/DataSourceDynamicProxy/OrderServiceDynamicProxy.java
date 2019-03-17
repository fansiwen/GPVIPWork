package com.gpeduVIPWork.day04.proxy.DataSourceDynamicProxy;

import com.gpeduVIPWork.day04.proxy.staticProxy.dbsourceChange.DynamicDataSourceEntry;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceDynamicProxy implements InvocationHandler {
    private SimpleDateFormat sf = new SimpleDateFormat("yyyy");
    private Object object;

    public Object getInstance(Object target){
        this.object = target;
        Class clzz = object.getClass();
        return Proxy.newProxyInstance(clzz.getClassLoader(),clzz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object obj = method.invoke(this.object,args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("this is after proxy");
    }

    /**
     * 获取订单的生成时间，得出年份，设置不同的数据源
     * @param arg
     */
    private void before(Object arg) {
        try{
            System.out.println("this is before proxy");
            Long time = (Long) arg.getClass().getMethod("getCreatTime").invoke(arg);
            int dbRouter = Integer.valueOf(sf.format(new Date(time)));
            System.out.println("自动分配到DB"+dbRouter+"数据源进行处理");
            DynamicDataSourceEntry.setName(dbRouter);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
