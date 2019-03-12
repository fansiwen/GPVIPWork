package com.gpeduVIPWork.day02.signgleton.hungry;

public class StaticHungrySignleton {
    private static final StaticHungrySignleton staticHungrySignleton;
    static{
        staticHungrySignleton = new StaticHungrySignleton();
    }
    private StaticHungrySignleton(){}

    public static StaticHungrySignleton getStaticHungrySignleton(){
        return staticHungrySignleton;
    }
}
