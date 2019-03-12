package com.gpeduVIPWork.day02.signgleton.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedTest {
    public static void main(String[] args) {
        SerializedDestorySingleton s1 = null;
        SerializedDestorySingleton s2 = SerializedDestorySingleton.getInstance();
        try{
            //将对象序列化到磁盘文件
            FileOutputStream fos = new FileOutputStream("Serialized.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            //反序列化将对象读进来
            FileInputStream fis = new FileInputStream("Serialized.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializedDestorySingleton)ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
