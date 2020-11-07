package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
       //一次性往list中添加多个元素
       Collections.addAll(list1,1,2,3,4,5,6,7,8,9);
        System.out.println(list1);
        //获取集合中的最大值
        int max =Collections.max(list1);
        System.out.println(max);
        //获取集合中的最小值
        int min=Collections.min(list1);
        System.out.println(min);
        //翻转
        Collections.reverse(list1);
        System.out.println(list1);
        //排序 --从小到大
        Collections.sort(list1);
        //交换集合中两个元素之间的位置
        Collections.swap(list1,2,1);
        System.out.println(list1);
    }
}
