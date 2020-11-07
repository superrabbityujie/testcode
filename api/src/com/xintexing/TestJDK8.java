package com.xintexing;

public class TestJDK8 {
    public static void main(String[] args) {
          new A() {
              @Override
              public void test() {
                  System.out.println("aa");
              }
          }.test();
          //lamd表达式，只针对接口，而且接口里只有一个方法，优化匿名内部类的写法
        //语法结构:类名 变量 = ()->{}; 其中()里面是传入test()方法的具体参数
        //语法 :()->{};//小括号指向大括号
        //如果接口里有多个抽象方法,就会报错，无法使用lanmda表达式
        A a = ()->{
            System.out.println("aa");
        };
        //有参数的lamda表达式,m是个占位符,不能和接口里的参数的形参的名字一样，否则会报错
        B b = (int m)->{
            System.out.println("get"+m);
        };
        b.get(1000);
        //接口C的匿名对象用lanmda表示
        C c = (String n) ->{
            System.out.println("删除");
            //有返回值就返回
            return 100;
        };
        //100返回给x
        int x = c.delete("jack");
        System.out.println(x);
    }
}
interface A{
    //无参数，无返回
    void test();
}
interface B{
    //有参数，无返回
    void get(int a);
}
interface C {
    //有参数，有返回
    int delete(String id);
}
