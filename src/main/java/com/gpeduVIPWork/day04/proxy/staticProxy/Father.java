package com.gpeduVIPWork.day04.proxy.staticProxy;

/**
 * 父亲为儿子找对象，父亲就是儿子的代理
 * 父亲只能为儿子找对象，那么父亲就是一个静态代理
 */
public class Father {
    private Person person;

    //通过构造方法把儿子的引用传递给父亲
    public Father(Person person){
        this.person = person;
    }

    public void findLove(){
        System.out.println("儿子你别担心，爸爸帮你找对象");
        this.person.findLove();
        System.out.println("你爸给你找个绝色大美女，喜欢把！");
    }
}
