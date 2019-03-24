package com.gpeduVIPWork.day05.delegate;

public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工 B，我现在开始干" + command + "工作");
    }
}
