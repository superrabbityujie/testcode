package com.annotation;

import com.sun.codemodel.internal.JMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */
//@Controller
public class ZidingyiZhujie {
    @Controller(name ="11")
    int a = 10;
    String ab ="22";
    @Controller(name="12",age = 1)
    public static void main(String[] args) {
        ZidingyiZhujie zidingyiZhujie = new ZidingyiZhujie();
        zidingyiZhujie.methods();
        String abc = "123";
        int a = 1;

    }
    @Deprecated
    public  void methods(){
        System.out.println("已过时");
    }
}
//1.定义注解
@Target({ElementType.FIELD,ElementType.METHOD})//可以出现在成员变量上,可以用在方法上
@Retention(RetentionPolicy.SOURCE)//表示在.java文件中存在活着
@interface Controller{
//    String name() default "";//给属性设置默认值
       String name() default "";
       int age() default 0;
}
//2.使用注解
