package com.gpeduVIPWork.day01.factory.abstractFactory;

import com.gpeduVIPWork.day01.product.Prado;
import com.gpeduVIPWork.day01.product.Q7;
import com.gpeduVIPWork.day01.product.X5;

/**
 * 现在来看看，首先用户就不需要知道具体的类名了，
 * 只需要去创建一个汽车工厂即可，剩下的就是想要
 * 啥车就造什么车就行了。具体过程都已经封装，用户
 * 直接可以得到结果，而不用去管过程。
 * 缺点：违反了开闭原则，因为如果要生产其他牌子的
 * 车还需要去创建对应牌子的工厂。
 * 这里宝马工厂、奥迪工厂、丰田工厂就是产品族
 * 而其他汽车系列就是产品结构等级。
 */
public class TestAbstract {
    public static void main(String[] args) {
        //先创建一个汽车工厂
        CarFacory carFacory = new CarFacory();
        //买一辆X5
        X5 x5 = carFacory.getBMWFactory().getX5();
        //买一辆Q7
        Q7 q7 = carFacory.getAudiFactory().getQ7();
        //买一辆霸道
        Prado prado = carFacory.getHondaFactory().getPrado();

    }
}
