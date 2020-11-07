package com.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        //1.获取Student类的Class对象
        try {
            Class clazz = Class.forName("com.clazz.Student");
            //调用methods方法
//            methods1(clazz);
//            methods2(clazz);
//            methods3(clazz);
//            methods4(clazz);
//              methods5(clazz);
            methods6(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 解析Student.class文件的构造方法
     */
    public static void methods1(Class clazz){
        //获取所有的构造方法存Constructor[]
        Constructor<Student>[]  cons=clazz.getConstructors();
        //遍历数组，得到每个构造方法
        for (Constructor con:cons) {
            //获取构造方法的名字
            String name = con.getName();
            System.out.println(name);
            //com.clazz.Student
            //解析构造方法的参数类型
            Class[] pt=con.getParameterTypes();
            System.out.println(Arrays.toString(pt));
//            com.clazz.Student
//                    [class java.lang.String]
//            com.clazz.Student
//                    [class java.lang.String, int]
//            com.clazz.Student
//                    [int]
//            com.clazz.Student
        }
        //获取某一个构造方法,前提是这个构造方法得要是公共public，不然报错
        try {
           Constructor con =clazz.getConstructor(int.class);
            System.out.println(con.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

//        for (int i = 0; i <cons.length ; i++) {
//            Constructor<Student>  con = cons[i];
//            String name =con.getParameterTypes()
//            System.out.println(con.getAnnotatedReceiverType().getType().getTypeName());
//        }
    }
    /**
     * 解析Student.class文件的成员变量,前提也得是公共public
     */
    public static void methods2(Class clazz){
        //获取多个字段类型，得是公开的
          Field[] fields =clazz.getFields();
        for (int i = 0; i <fields.length ; i++) {
            Field field = fields[i];
            String name=field.getName();
            Class type=field.getType();
            System.out.println(name+":"+type);
        }
        //获取某一个字段类型，得是公开的，否则会报错
        try {
            Field field=clazz.getField("age");
            System.out.println(field.getName()+":"+field.getType());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /**
     * 解析Student.class文件的成员方法,前提也得是公共public
     */
    public static void methods3(Class clazz){
       Method[] methods =clazz.getMethods();
        for (Method m: methods) {
            String name=m.getName();
            //会打印超类和自己所有方法，得是public
            System.out.println(name);
            Class[] pts=m.getParameterTypes();
            System.out.println(Arrays.toString(pts));
        }
//        public Method getMethod(String name, Class<?>... parameterTypes)
        try {
            Method method=clazz.getMethod("test",int.class);
            System.out.println(method.getName());
            Class[] pts=method.getParameterTypes();
            System.out.println(Arrays.toString(pts));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    //用反射创建对象
    public static void methods4(Class clazz){
        try {
            Object o=clazz.newInstance();
            //向下转型--把父类转换成他的子类类型
            Student student = (Student)o;
            student.show();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    //用反射创建对象获取属性值和设置属性获取
    public static void methods5(Class clazz){
        try {
            Field field  = clazz.getField("name");
            //set(m,n) m是对象--n是想要设置的值
            Object o = clazz.newInstance();
            field.set(o,"兔子");
            System.out.println(field.get(o));//获取Object对象的值

        } catch (NoSuchFieldException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    //用反射创建对象获取指定的方法，并执行这个方法
    public static void methods6(Class clazz){
        try {
            //如果这个方法啥参数都没有，就什么参数都不用写
            Method method=clazz.getMethod("test",int.class);
            //执行，需要两个参数
            Object o = clazz.newInstance();
            //会进入到Student类的test方法中,将int类型的50传入
            method.invoke(o,50);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    //用暴力反射，反射类中的公开数据和自由数据
    //暴力反射 除了public的基础连private都可以获取s
    public static void methods7(Class clazz){

    }
}
