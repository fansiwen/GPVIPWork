package com.gpeduVIPWork.day02.signgleton.lazy;

import com.gpeduVIPWork.day02.signgleton.ThreadLocal.ThreadLocalSingleton;

public class ExcuteThread implements Runnable{

    @Override
    public void run() {
        //LazyNotSafe l1 = LazyNotSafe.getInstance();
        //SynchronizedLazy s2 = SynchronizedLazy.getInstance();
        ThreadLocalSingleton t1 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+t1);
    }
}
