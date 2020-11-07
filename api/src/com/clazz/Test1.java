package com.clazz;

public class Test1 {
    public static void main(String[] args) {
        //String解析字符串,jvm是怎么获取方法，类名之类，就是通过反射技术
        //三种方式都是获取String类的Class对象
        try {
//            Class<?> clazz = Class.forName("java.lang.String");
            Class<?> clazz = Class.forName("String");
            //java.lang.ClassNotFoundException: String,直接点进去，往上移动可以看到
            System.out.println(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //第二种：类名.class
        Class<?> clazz2=String.class;
        Class clazz3 = new String().getClass();
    }
}
