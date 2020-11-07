package com.clazz;

public class Student {
    public String name;
    public int age;
    public Student(){
        System.out.println("wucanshu ");
    }
    public Student(int age){
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("show");
    }
    public void test(int a){
        System.out.println(a);
    }
}
