package com.gpeduVIPWork.day04.proxy.DynamicProxy;

import com.gpeduVIPWork.day04.proxy.staticProxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * 测试代码
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new JDKMeipo().getInstance(new Girl());
        person.findLove();
        try{
            //将内存中的文件通过字节流的方式导出一个新的class文件
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream fos = new FileOutputStream("E://$Proxy0.class");
            fos.write(bytes);
            fos.flush();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
