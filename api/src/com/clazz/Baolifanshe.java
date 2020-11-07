package com.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 暴力反射的一套api公开的私有的都可以操作,想设置或者获取私有属性，得开启私有的访问权限
 */
public class Baolifanshe {
    public static void main(String[] args) {
        try {
            Class clazz=Class.forName("com.clazz.Person");
//            methods1(clazz);//暴力反射获取
            methods2(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param clazz
     */
    public static void methods1(Class clazz){
        //
        Field[] fields =clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            String name = field.getName();
//            String type =field.getType();
            System.out.println(name);
        }

        try {
            Field field=clazz.getDeclaredField("name");
            Object o = clazz.newInstance();
            field.setAccessible(true);//开启私有的访问权限
            field.set(o,"tuzi");//会对私有
            String name =(String)field.get(o);
            System.out.println(name);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
    public static void methods2(Class clazz){
        //通过暴力反射的这套api获取方法列表不会获取父类的，只会获取本类的所有方法，包括私有的公开的s
         Method[] methods =clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            String name=method.getName();
            System.out.println(name);

        }
        try {
            Method method=clazz.getDeclaredMethod("show",int.class);
            String name =method.getName();
            System.out.println(name);
            Object o = clazz.newInstance();
//            java.lang.IllegalAccessException: Class com.clazz.Baolifanshe can not access a member of class com.clazz.Person with modifiers "private"
//            at sun.reflect.Reflection.ensureMemberAccess(Reflection.java:102)
            method.setAccessible(true);//不加会爆非法的访问异常
            method.invoke(o,11);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
