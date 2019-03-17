package com.gpeduVIPWork.day04.proxy.DynamicProxy;

import com.gpeduVIPWork.day04.proxy.staticProxy.Person;

public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("我是个小姑娘，我想找个高富帅");
    }
}
