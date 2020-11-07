package com.duoxiancheng;

public class MyThread{
    public static void main(String[] args) {

        MyTickes myTickes1 =new MyTickes();
        MyTickes myTickes2 =new MyTickes();
        MyTickes myTickes3 =new MyTickes();
        MyTickes myTickes4 =new MyTickes();
        myTickes1.start();
        myTickes2.start();
        myTickes3.start();
        myTickes4.start();

    }

}

class MyTickes extends Thread{
    //全局共享的
    static int tickes = 100;


//    synchronized public void run() {
    @Override
    public void run() {
        while(true){
            //锁对象怎么分配--看你的共享资源是普通还是静态的
            //静态资源的锁对象必须是类名.class
            synchronized (MyTickes.class){
                if(tickes>0){
                    //TODO 考验 Thread
                    try {

                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(super.getName()+":"+tickes--);
                }else {
                    break;//专门用来结束死循环
                }
            }

        }
    }
}
