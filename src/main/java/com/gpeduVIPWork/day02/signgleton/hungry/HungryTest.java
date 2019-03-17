package com.gpeduVIPWork.day02.signgleton.hungry;

public class HungryTest {

    public static void main(String[] args) {
        HungrySignleton h1 = HungrySignleton.getHungrySignleton();
        HungrySignleton h2 = HungrySignleton.getHungrySignleton();
        System.out.println(h1 == h2);


        StaticHungrySignleton s1 = StaticHungrySignleton.getStaticHungrySignleton();
        StaticHungrySignleton s2 = StaticHungrySignleton.getStaticHungrySignleton();
        System.out.println(s1 == s2);
    }
}
