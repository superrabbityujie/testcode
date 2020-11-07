package com.test;

/**
 * 测试多线程编程
 */
public class ThreadTest {
    public static void main(String[] args) {
           //创建一个线程
        MyThread threadClass1 = new MyThread();//单线程程序--新建状态
             //只是普通方法调用，没有多线程的效果
//           threadClass1.run();
        MyThread threadClass2 = new MyThread();//模拟多线程
//           threadClass2.run();
        //start方法启动线程，变成可运行状态
        threadClass1.start();
        threadClass2.start();

    }
}
/**
 * 定一个类，继承Thread类
 */
class MyThread extends Thread{
    //需求：打印10次线程名称
    //多线程编程里，需要把业务代码放到重写run()
    @Override
    public void run() {
        //运行状态
        for (int i = 0; i <10 ; i++) {
            //调用父类的线程名称
            System.out.println(super.getName()+"--"+i);
        }
    }
    //结束状态

}
