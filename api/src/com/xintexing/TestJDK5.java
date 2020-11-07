package com.xintexing;

public class TestJDK5 {
    public static void main(String[] args) {
       add(1);
       add(1,1,2,3,4,5,6);
    }
    //可变参数必须是参数列表的最后一个
    public static void add(int x,int... a){
        for (int i: a) {
            System.out.println(i);
        }
    }
}
