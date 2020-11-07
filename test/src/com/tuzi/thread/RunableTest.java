package com.tuzi.thread;

public class RunableTest {
    public static void main(String[] args) {
        //    Thread t1 = new Thread();
        //用一个参数的构造
        MaipiaoCK maipiaoCK = new MaipiaoCK();
        Thread t1 = new Thread(maipiaoCK);
        Thread t2 = new Thread(maipiaoCK);
        Thread t3 = new Thread(maipiaoCK);
        Thread t4 = new Thread(maipiaoCK);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class MaipiaoCK implements Runnable{
    int tiks = 10000;
    @Override
    synchronized public void run() {
        //这个线程一直买票，需要一个for循环
        while(true){
            if(tiks>0){
                //还有票卖
                System.out.println(Thread.currentThread().getName()+":"+tiks--);
            }else {
                break;
            }
        }
    }
}
