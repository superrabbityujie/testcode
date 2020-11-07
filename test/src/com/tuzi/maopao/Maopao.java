package com.tuzi.maopao;

import java.util.Arrays;

public class Maopao {
    public static void main(String[] args) {
           int[] arrs = {4,9,7,3,10};
           Maopao.paixu(arrs);
        System.out.println(Arrays.toString(arrs));

    }
    public static void paixu(int[] arrs){
        for (int i = 0; i < arrs.length-1; i++) {
            for (int j = 0; j < arrs.length-1-i; j++) {
                if(arrs[j]>arrs[j+1]){
                    //交换位置
                    int temp = arrs[j];
                    arrs[j]=arrs[j+1];
                    arrs[j+1]= temp;
                }
            }
        }
    }
}
