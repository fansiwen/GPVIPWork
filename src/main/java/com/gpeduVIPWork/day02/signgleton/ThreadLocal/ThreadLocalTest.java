package com.gpeduVIPWork.day02.signgleton.ThreadLocal;

import com.gpeduVIPWork.day02.signgleton.lazy.ExcuteThread;

/**
 * 线程单例测试
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExcuteThread());

        Thread t2 = new Thread(new ExcuteThread());

        t1.start();
        t2.start();

    }
}
