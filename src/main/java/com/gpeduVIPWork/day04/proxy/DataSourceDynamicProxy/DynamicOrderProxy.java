package com.gpeduVIPWork.day04.proxy.DataSourceDynamicProxy;

import com.gpeduVIPWork.day04.proxy.staticProxy.dbsourceChange.Order;
import com.gpeduVIPWork.day04.proxy.staticProxy.dbsourceChange.OrderService;
import com.gpeduVIPWork.day04.proxy.staticProxy.dbsourceChange.OrderServiceImp;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试类
 */
public class DynamicOrderProxy {
    public static void main(String[] args) {
        try{
            Order order = new Order();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd");
            Date date = sf.parse("2019-01-01");
            order.setCreatTime(date.getTime());

            OrderService orderService = (OrderService) new OrderServiceDynamicProxy().getInstance(new OrderServiceImp());
            orderService.insert(order);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
