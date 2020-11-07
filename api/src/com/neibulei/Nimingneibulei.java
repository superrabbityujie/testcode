package com.neibulei;

public class Nimingneibulei {
    public static void main(String[] args) {
//        new B().eat();//匿名对象
        //接口不能new
        //结合匿名对象，--没名字-只能执行一个任务
        //匿名内部类--直接创建接口对象，并在匿名内部内里重写抽象方法
        new A() {//重写接口里的方法
            @Override
            public void save() {

            }
            @Override
            public void delete() {

            }
        }.delete();//匿名对象一次只能调用一个方法
        //jdk.8lmd表达式
//        A a = ()->{
//
//        }
        B b = new B() {//重写接口里的方法，给匿名对象取个名字就可以一次干很多事情
            @Override
            public void save() {

            }

            @Override
            public void delete() {

            }
        };//然后通过访问b就能干两件事
        b.save();
        b.delete();

        new C(){//创建抽象类的对象
            @Override
            public void save() {
                System.out.println("保存");
            }
            //普通方法想重写就重写,按业务需求
        }.save();
    }
}
interface A {
    void save();//补全代码 public abstract void save();
    void delete();
}
interface B {
    void save();
    void delete();
}
abstract class C{
    public abstract void save();//抽象类的方法不可以简写
    public void delete(){

    }
}