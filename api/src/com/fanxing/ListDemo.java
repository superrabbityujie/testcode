package com.fanxing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        //Collecton中可以迭代集合的迭代器，继承自Collection类
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        //List接口是List
        ListIterator<String> listIterator =list.listIterator();
        while(listIterator.hasNext()){
            String str =listIterator.next();
            System.out.println(str);
        }
        //逆向遍历必须先顺序遍历再逆向遍历，假如把上面的代码给去掉，这个功能就不能使用
        while(listIterator.hasPrevious()){
            String str = listIterator.previous();
            System.out.println(str);
        }



    }
    public static void didai(List<String > list){

    }
}
