package com.tuzi.fs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestFsZhujie {
    public static void main(String[] args) {
        Class clazz = ZhujieMethod.class;

        try {
            Object o = clazz.newInstance();
            Method method=clazz.getMethod("method1");
           Deprecated deprecated= method.getAnnotation(Deprecated.class);
           if(deprecated!=null){
               System.out.println("执行这个方法");

               method.invoke(o);
           }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
class ZhujieMethod{
    @Deprecated
    public void method1(){
        System.out.println("1");
    }
    public void method2(){
        System.out.println("2");
    }
}
