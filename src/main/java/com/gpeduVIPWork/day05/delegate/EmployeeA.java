package com.gpeduVIPWork.day05.delegate;

public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工 A，我现在开始干" + command + "工作");
    }
}
