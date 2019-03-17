package com.gpeduVIPWork.day04.proxy.DynamicProxy.handWriteJDK;

import java.lang.reflect.Method;

public interface FSWInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}

