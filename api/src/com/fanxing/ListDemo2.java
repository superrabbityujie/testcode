package com.fanxing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(100.1);
        list.add(200.2);
        list.add(300.3);
        list.add(400.4);
//        Iterator<Integer> iterator =list.iterator();
//        while(iterator.hasNext()){
//            Integer str = iterator.next();
//            iterator.remove();
//            System.out.println(str);
//        }
//
//        while(iterator.hasNext()){
//            Integer str = iterator.next();
//            System.out.println(str);
//        }

        for (int i = 0; i <list.size() ; i++) {
//            list.remove(i);`
              list.remove(200.2);
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}
