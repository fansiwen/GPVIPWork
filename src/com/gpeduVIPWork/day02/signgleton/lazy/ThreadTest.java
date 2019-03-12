package com.gpeduVIPWork.day02.signgleton.lazy;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExcuteThread());
        Thread t2 = new Thread(new ExcuteThread());
        t1.start();
        t2.start();
        System.out.println("end");
    }
}
