package com.test;

public class RunableDemo{
    public static void main(String[] args) {
        MyRunable target = new MyRunable();
//        target居然没有start();
        //把Thread类与target的关系进行绑定
        Thread t1 = new Thread(target);//单线程
        t1.start();

        Thread t2 = new Thread(target);
        t2.start();
    }
}
//自定义多线程程序
class MyRunable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //Runable接口里面什么也没提供....所以我们只能用Thread类里的获取当前线程，然后获取他的名字
            System.out.println(Thread.currentThread().getName()+"+"+i);
        }
    }
}
