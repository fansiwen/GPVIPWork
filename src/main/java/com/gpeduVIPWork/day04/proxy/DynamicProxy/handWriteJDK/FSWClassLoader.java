package com.gpeduVIPWork.day04.proxy.DynamicProxy.handWriteJDK;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 手写一个ClassLoder
 */
public class FSWClassLoader extends ClassLoader{
    private File classPathFile;
    public FSWClassLoader(){
        String classPath = FSWClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = FSWClassLoader.class.getPackage().getName()+"."+name;
        if(classPathFile != null){
            File classFile = new File(classPathFile,name.replaceAll("\\.","/")+".class");
            if(classFile.exists()){
                FileInputStream fis = null;
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                try{
                    fis = new FileInputStream(classFile);
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = fis.read(buf))!= -1){
                        bos.write(buf,0,len);
                    }
                    return defineClass(className,bos.toByteArray(),0,bos.size());
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        bos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }
}
