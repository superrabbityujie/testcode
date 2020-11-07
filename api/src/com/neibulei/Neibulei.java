package com.neibulei;


public class Neibulei {
    public static void main(String[] args) {
//        Outer outer=new Outer();
        //外部类名.内部类名 变量名 = 外部类对象.内部类对象
        Outer.Inner oi = new Outer().new Inner();
        oi.in();
        Outer.Inner oi2 = new Outer().new Inner();
    }
}
class Outer{//外部类
        String name;
        //1.外部类想用内部类的资源--创建内部类对象来访问
        public void out() {
            Inner inner=new Inner();
            inner.in();
            class Inner{//匿名内部类，从内存方面讲，匿名内部类省内存。执行完毕了，GC垃圾回收机制就会把它给回收了

                //2.内部类使用外部类的资源？？
                public void in(){
                    System.out.println(name);
                }
            }
        }
        class Inner{//内部类
            //2.内部类使用外部类的资源？？
            public void in(){
                System.out.println(name);
            }
        }
}
