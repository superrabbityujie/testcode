package com.clazz;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FansheZhujieTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Hello.class;
        //获取Hello所有方法,可以用暴力反射谁还用普通反射
        Method[] methods =clazz.getDeclaredMethods();
        Object o = clazz.newInstance();
        for (Method m:methods) {
            //获取方法上面的注解--参数是注解类型的Class对象
            Deprecated d=m.getAnnotation(Deprecated.class);
            //判断方法上有这个注解吗，有就执行xx方法
            if(d!=null){
                m.setAccessible(true);
                m.invoke(o);
            }
        }
    }
}class Hello{
    @Deprecated
    public void test(){
        System.out.println("test");

    }
    public void show(){
        System.out.println("show");
    }
}
