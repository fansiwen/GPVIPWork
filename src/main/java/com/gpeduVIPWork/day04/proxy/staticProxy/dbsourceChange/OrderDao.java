package com.gpeduVIPWork.day04.proxy.staticProxy.dbsourceChange;

public class OrderDao {
    public int insert(Order order){
        System.out.println("订单信息插入成功");
        return 1;
    }
}
