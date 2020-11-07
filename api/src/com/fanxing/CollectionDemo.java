package com.fanxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        //判断是否包含这个3.3这个元素
        boolean contain = c.contains(3.3);

        Collection c1 = new ArrayList();
        c1.add(1);
        c1.add(3.3);
        boolean ca =c.containsAll(c1);
//        System.out.println(ca);
//        System.out.println(c.hashCode());
//        Object[] os = c.toArray();
//        System.out.println(Arrays.toString(os));
//        boolean equals=c.equals(1);
//        System.out.println(equals);
//        c.clear();
//        System.out.println(contain);
//        for (Object o:c) {
//            System.out.println(o);
//        }
        Iterator<Integer> iterator =c.iterator();
        while(iterator.hasNext()){
            int a = iterator.next();
            System.out.println(a);
        }


    }
    public static void arrayListTest(){

    }
}
