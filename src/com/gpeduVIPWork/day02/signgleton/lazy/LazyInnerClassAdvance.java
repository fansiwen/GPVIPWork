package com.gpeduVIPWork.day02.signgleton.lazy;

/**
 * 对懒汉式（内部类实现）进行优化
 * 在私有构造器中校验内部类初始化的对象是否为空，
 * 防止反射的恶意共计，重复new多个实例，破坏单例
 */
public class LazyInnerClassAdvance {
    //私有构造方法
    private LazyInnerClassAdvance(){
        if(InnerClassNew.lazy != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }
    //静态内部类
    private static class InnerClassNew{
        private static final LazyInnerClassAdvance lazy = new LazyInnerClassAdvance();
    }
    //提供外界调用方法，这里要设置成final防止方法被修改
    public static final LazyInnerClassAdvance getInstance(){
        return InnerClassNew.lazy;
    }

}
