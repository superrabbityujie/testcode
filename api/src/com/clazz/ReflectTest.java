package com.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Reflect.class;
        Object o = clazz.newInstance();
        Field[] fields =clazz.getDeclaredFields();
        for (int i = 0; i <fields.length ; i++) {
            Field field = fields[i];
            System.out.println(field.getName());
            String typeName = field.getType().getName();
            System.out.println(typeName);
        }
        Method[] methods =clazz.getDeclaredMethods();
        for (int i = 0; i <methods.length ; i++) {
            Method method = methods[i];
            String name =method.getName();
        }
        Method method1 = clazz.getDeclaredMethod("test",int.class);



        method1.setAccessible(true);
        method1.invoke(o,12);
    }
}
