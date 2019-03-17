package com.gpeduVIPWork.day01.factory.factoryMethod;

/**
 * 工厂方法模式保证了开闭原则，
 * 降低了类与类之间的耦合性。
 * 使代码更易于扩展和维护，
 * 但是同时产生了大量的工厂类和产品类，适用于产品数量不是特别多的场景。
 * 同时，这里也有一个问题，那就是用户要知道具体的工厂类的名称，
 * 那么对于这一点还有没有更好的办法呢....
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        //给我来一辆奥迪
        AudiFactory audiFactory = new AudiFactory();
        System.out.println(audiFactory.getCar());
        //给我来一辆宝马
        BMWFactory bmwFactory = new BMWFactory();
        System.out.println(bmwFactory.getCar());
        //给我来一辆丰田
        HondaFactory hondaFactory = new HondaFactory();
        System.out.println(hondaFactory.getCar());
    }
}
