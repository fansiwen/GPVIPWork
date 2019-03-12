package com.gpeduVIPWork.day02.signgleton.lazy;

public class LazyNotSafe {
    private LazyNotSafe(){}

    private static LazyNotSafe lazyNotSafe = null;

    public static LazyNotSafe getInstance(){
        if(lazyNotSafe == null) {
            lazyNotSafe = new LazyNotSafe();
        }
        return lazyNotSafe;
    }
}
