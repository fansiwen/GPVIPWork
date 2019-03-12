package com.gpeduVIPWork.day02.signgleton.lazy;

public class LazyDoubleCheck {
    private LazyDoubleCheck (){}

    private static LazyDoubleCheck lazyDoubleCheck = null;

    public static LazyDoubleCheck getLazyDoubleCheck(){
        if(lazyDoubleCheck == null){
            synchronized (LazyDoubleCheck.class){
                if(lazyDoubleCheck == null){
                    lazyDoubleCheck = new LazyDoubleCheck();
                }
            }
        }
        return lazyDoubleCheck;
    }
}
