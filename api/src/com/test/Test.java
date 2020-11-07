package com.test;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//     Student  s1=new  Student("渣渣辉",12);
//     Student  s2 = new Student("渣渣辉",12);
//     System.out.println( s1.equals(s2));
//        Scanner scanner =new Scanner(System.in);
//        String  str=scanner.nextLine();
//     getStringArr(str);(
        String str =new String("123");
        String str2 = new String("123");
        System.out.println(str==str2);

    }
    public static void getStringArr(String str){
        char[] s=str.toCharArray();
        System.out.println(Arrays.toString(s));
    }
}
class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//    @Override
//    public boolean equals(Object obj){
//        Student s = (Student)obj;//向下转型
//        if(name ==s.name&& age ==s.age){
//            return true;
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
