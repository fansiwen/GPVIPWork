package com.gpeduVIPWork.day02.signgleton.lazy;

public class InnerLazy {
    private InnerLazy(){}

    private static class InnerClass{
        private static final InnerLazy innerLazy = new InnerLazy();
    }
    public static final InnerLazy getInstance(){
        return InnerClass.innerLazy;
    }
}
