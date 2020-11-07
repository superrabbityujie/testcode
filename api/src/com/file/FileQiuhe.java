package com.file;

import java.io.File;
import java.util.Scanner;

public class FileQiuhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dir = scanner.nextLine();
        File file = new File("/Users/iotest");
        File[] wjj = file.listFiles();
        long size=0;
        for (int i = 0; i <wjj.length ; i++) {
            File wjorwjj = wjj[i];
            if(wjorwjj.isFile()){
                //如果是文件
                long length = wjorwjj.length();
                size +=length;
            }else {
                System.out.println("我是文件夹");
            }
        }
        //打印问价总大小
        System.out.println(size+"字节");
    }
}
