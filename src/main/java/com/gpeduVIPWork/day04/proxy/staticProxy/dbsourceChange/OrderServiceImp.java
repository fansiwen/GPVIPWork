package com.gpeduVIPWork.day04.proxy.staticProxy.dbsourceChange;

public class OrderServiceImp implements OrderService{

    private OrderDao orderDao;

    /**
     * 在Spring中这里是自动注入的，但是为了方便测试这里
     * 在构造函数中对OrderDao进行初始化
     */
    public OrderServiceImp(){
       this.orderDao = new OrderDao();
    }
    @Override
    public int insert(Order order) {
        System.out.println("OrderService调用OrderDao类");
        return this.orderDao.insert(order);
    }
}
