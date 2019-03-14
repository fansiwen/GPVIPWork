package com.gpeduVIPWork.day03.prototype.deep;

import java.util.ArrayList;

/**
 * 测试类，深克隆
 */
public class DeepTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        QiTianDaSheng copy = (QiTianDaSheng) qiTianDaSheng.deepClone();

        System.out.println(qiTianDaSheng.getJinGuBang() == copy.getJinGuBang());
    }
}
