package com.fanxing;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    /**
     * 第一组方法组，这些方法如果执行失败都是抛异常
     */
    public void TestMethods1(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        // 特有方法 对首元素的操作,没有返回值
        list.addFirst(100);
//        //特有方法 对尾元素的操作,没有返回值
        list.addLast(200);
        //100,1,2,3,4,5,200
        //获取首元素 100
        Integer first=list.getFirst();
        //获取尾元素 200
        Integer last =  list.getLast();
        //去除第一个元素,并返回去除的元素
        Integer rf = list.removeFirst();
        //去除最后一个元素，并返回去除的元素
        Integer rl = list.removeLast();
        System.out.println("测试结束");
    }

    /**
     * 第二组方法组，这些方法如果执行失败都是null
     */
    public void TestMethods2(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // 特有方法 对首元素的操作，有返回boolean值
        boolean of=list.offerFirst(100);
        // 特有方法 对尾元素的操作，有返回boolean值
        boolean pl = list.offerLast(200);
        //100,1,2,3,4,5,200
        //获取首元素 100
        Integer first=list.peekFirst();
        //获取尾元素 200
        Integer last =  list.peekLast();
        //去除第一个元素,并返回去除的元素
        Integer rf = list.pollFirst();
        //去除最后一个元素，并返回去除的元素
        Integer rl = list.pollLast();
        System.out.println("测试结束");
    }
    public static void main(String[] args) {
        LinkedListDemo demo = new LinkedListDemo();
        demo.TestMethods1();

    }
}
