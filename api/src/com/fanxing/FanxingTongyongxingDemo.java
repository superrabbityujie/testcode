package com.fanxing;

import java.util.Collection;
import java.util.HashMap;

/**
 * 测试泛型的通用性
 */
public class FanxingTongyongxingDemo{
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5,6};
        Double[] b = {1.1,2d,3.4,4.4};
        String[]  s = {"1","2"};
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//        for (int i = 0; i <a.length ; i++) {
//            System.out.println(a[i]);
//        }
//        for (int i = 0; i <b.length ; i++) {
//            System.out.println(b[i]);
//        }
//        for (Integer i : a) {
////            System.out.println(i);
//            print(i);
//        }
//        for (Double i : b) {
////            System.out.println(i);
//            print(i);
//        }

        for (Double i : b) {
//            System.out.println(i);
            print(i);
        }
        for (String i : s) {
//            System.out.println(i);
            print(i);
        }
    }
//    public static void print(Integer a){
//        System.out.println(a);
//    }
//    public static void print(Double a){
//        System.out.println(a);
//    }

    public static <A>void print(A a){
        System.out.println(a);
//        Collection
    }
//    public static <N> N[] print(N[] a){
//        return a;
//    }
}
