package com.tuzi.thread;

public class ThreadTest{
    public static void main(String[] args) {
         Shoupiaochuangkou s1 = new Shoupiaochuangkou();
        Shoupiaochuangkou s2 = new Shoupiaochuangkou();
        Shoupiaochuangkou s3 = new Shoupiaochuangkou();
        Shoupiaochuangkou s4 = new Shoupiaochuangkou();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
class Shoupiaochuangkou extends Thread{
    //继承Thread类实现run方法
    static int ticket = 100;
    @Override
    synchronized public void run() {
        //这个是一个线程干的活，需要重复干，没有指定干几次
        synchronized (ThreadTest.class) {
            while (true) {
                if (ticket > 0) {
                    //如果有票就卖
                    System.out.println(super.getName() + ":" + ticket--);
                } else {
                    //当票为0张时就退出whiile循环
                    break;
                }
            }
        }
    }
}
