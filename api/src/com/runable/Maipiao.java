package com.runable;

public class Maipiao {
    public static void main(String[] args) {
        MyTicks myTicks = new MyTicks();
        Thread thread1 = new Thread(myTicks);
        Thread thread2 = new Thread(myTicks);
        Thread thread3 = new Thread(myTicks);
        Thread thread4 = new Thread(myTicks);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
class MyTicks implements Runnable{
    //一把锁对象
    Object o = new Object();
    String s = "123";
    //共享资源
    static int tickes=100;
    @Override
    public void run() {
        while(true){
            //同步代码块
            // 1锁的位置合理
            // 2锁对象(必须是同一个对象)
            //四个线程一把锁
//            synchronized (new Object()){
//                synchronized (o){
            //同一个锁对象
//            synchronized (s){
            synchronized (this){
                if(tickes>0){
                    //TODO 考验 Thread
                    try {
                        //问题
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+tickes--);
                }else {
                    break;//专门用来结束死循环
                }
            }
        }
    }
}
