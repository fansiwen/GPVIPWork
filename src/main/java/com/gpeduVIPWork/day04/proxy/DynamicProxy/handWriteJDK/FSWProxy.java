package com.gpeduVIPWork.day04.proxy.DynamicProxy.handWriteJDK;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class FSWProxy {
    public static final String ln = "\r\n";
    public static Object newProxyInstance(FSWClassLoader loader,
                                          Class<?>[] interfaces,
                                          FSWInvocationHandler h)
            throws IllegalArgumentException{

        try{
            //1动态生成java源代码.java文件
            String src = generateSrc(interfaces);
            //2.java文件输出到磁盘
            String filePath = FSWProxy.class.getResource("").getPath();
            System.out.println(filePath);
            File f = new File(filePath+"$Proxy0.java");
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();
            //3.把生成的.java文件编译成.class文件
            JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = javaCompiler.getStandardFileManager(null,null,null);
            Iterable iterable = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = javaCompiler.getTask(null,manager,null,null,null,iterable);
            task.call();
            manager.close();
            //4.编译生成的.class文件加载到JVM中
            Class proxyclass = loader.findClass("$Proxy0");
            Constructor constructor = proxyclass.getConstructor(FSWInvocationHandler.class);
            f.delete();
            //5.返回字节码重组以后新的代理对象
            return constructor.newInstance(h);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    /*
    动态生成java源代码的方法
     */
    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.gpeduVIPWork.day04.proxy.DynamicProxy.handWriteJDK;" + ln);
        sb.append("import com.gpeduVIPWork.day04.proxy.staticProxy.Person;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        sb.append("FSWInvocationHandler h;" + ln);
        sb.append("public $Proxy0(FSWInvocationHandler h) { " + ln);
        sb.append("this.h = h;");
        sb.append("}" + ln);
        for (Method m : interfaces[0].getMethods()){
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" +
                    ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\""
                    + m.getName() + "\",new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}");
            sb.append("}");
        }
        sb.append("}" + ln);
        return sb.toString();
    }
}
