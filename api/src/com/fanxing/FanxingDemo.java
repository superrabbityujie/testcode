package com.fanxing;

import java.util.ArrayList;
import java.util.List;

public class FanxingDemo{
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.add(1.1);
        list.add("1234");
        list.add(true);
        list.add('中');
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        List<String> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(1.1);
        list2.add("1234");
//        list2.add(true);
//        list2.add('中');
        //泛型
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        List<Integer> list3 = new ArrayList<>();
        list3.add(200);//200是基本类型，转换成Integer类型，这个过程是自动装箱
    }
}
