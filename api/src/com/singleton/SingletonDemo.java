package com.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
           //单例设计模式思路，new十次也只能保证只有一个实例对象
//        new Hellow();
//        new Hellow();
//        new Hellow();
//        new Hellow();
//        new Hellow();
        Hellow1 h1=Hellow1.get();
        Hellow1 h2 = Hellow1.get();
        System.out.println(h1==h2);
        //饿汉式
        Hellow2 h3=Hellow2.get();
        Hellow2 h4 = Hellow2.get();
        //无论new几次，h1和h2是一个对象
        System.out.println(h3==h4);

    }
}class Hellow1{
    //懒汉式

    private static Hellow1 hellow;

    private Hellow1(){}

    //锁方法 普通方法的锁对象默认是this，静态方法的锁对象是类名.class
     synchronized public static Hellow1 get(){
        //这里用锁代码块也行
//         synchronized (Hellow.class){}
        if(hellow==null){
            //如果没有new过就new，new过就不new
            hellow = new Hellow1();
        }
        return hellow;//把自己创建好的hellow对象返回调用位置
    }

}
class Hellow2 {
    //饿汉式
    //第二步 自己在类的内部，创建一个对象
    //加static 是因为要被静态的get()调用--静态只能调静态
    private static Hellow2 hellow = new Hellow2();

    //第一步 私有化构造方法，不让外面随便new
    private Hellow2() {
    }

    //第三步 提供一个方法，把hellow返回
    //加static是因为这个类不能通过new对象进行调用get()
    public static Hellow2 get() {
        return hellow;//把自己创建好的hellow对象返回调用位置
    }
}