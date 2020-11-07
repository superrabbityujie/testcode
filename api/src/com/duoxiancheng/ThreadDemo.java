package com.duoxiancheng;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * 创建方法 ，第一种继承THread类
 */
public class ThreadDemo {
    //main也是一个线程
    public static void main(String[] args) {
        Thread t = new Thread();

       //底层操作系统给的一个唯一id，我们只能看，不能该
       Long id=t.getId();
        System.out.println(id);
        //打印默认的现成名称
       String name = t.getName();
        System.out.println(name);
        t.setName("兔子");
        String tName=t.getName();
        System.out.println(tName);
        t.run();
        t.start();
        //结束线程
        t.stop();
        try {
            //这个sleep方法也是静态方法，让线程休10000毫秒，也就是10秒
            Thread.sleep(10000l);
//            t.sleep(1L);
        } catch (InterruptedException e) {
        }
        //返回的当前干活的县城
        Thread now=t.currentThread();
        //打印main
        System.out.println(now.getName());
    }
}
