package com.gpeduVIPWork.day02.signgleton.lazy;

public class LazyNotSafeTest {

    public static void main(String[] args) {
        LazyNotSafe l1 = LazyNotSafe.getInstance();
        LazyNotSafe l2 = LazyNotSafe.getInstance();
        System.out.println(l1 == l2);
    }
}
