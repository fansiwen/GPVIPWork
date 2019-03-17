package com.gpeduVIPWork.day02.signgleton.lazy;

public class SynchronizedLazy {
    private SynchronizedLazy(){}

    private static SynchronizedLazy synchronizedLazy = null;

    public synchronized static SynchronizedLazy getInstance(){
        if(synchronizedLazy == null) {
            synchronizedLazy = new SynchronizedLazy();
        }
        return synchronizedLazy;
    }
}
