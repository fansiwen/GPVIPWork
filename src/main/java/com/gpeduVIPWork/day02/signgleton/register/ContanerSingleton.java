package com.gpeduVIPWork.day02.signgleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例（容器式）
 */
public class ContanerSingleton {
    private ContanerSingleton (){}
    //设置一个私有静态的容器
    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getBean(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object o = null;
                try{
                    o = Class.forName(className);
                    ioc.put(className,o);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return o;
            }else{
                return ioc.get(className);
            }
        }

    }
}
