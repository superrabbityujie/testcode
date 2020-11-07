package com.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
//        File file = new File("/Users/yujie/Desktop/iotest/2.txt");
        //权限问题
        File file = new File("/Users/yujie/Desktop");
//        File file = new File("/Users/iotest");
        //获取文件的字节量，跟右键属性看到的是一样的
//        System.out.println(file.length());
//        System.out.println(file.exists());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
//        System.out.println(file.getName());
//        System.out.println(file.getParent());
//        System.out.println(file.getAbsolutePath());
        //如果没有该文件创建，有就没他什么事了
//            boolean cre=file.createNewFile();
//            System.out.println(cre);
//        boolean mkdir=file.mkdir();
//        //新建一层文件夹
//        System.out.println(mkdir);
//        //新建多层文件夹
//            boolean mkdirs = file.mkdirs();
//        System.out.println(mkdirs);
        //
        //我的是权限问题
        String[] list =file.list();
        for (int i = 0; i <list.length ; i++) {
            System.out.println(list[i]);
        }
        File[]  files =file.listFiles();
        for (int i = 0; i <files.length ; i++) {
            File f = files[i];
            System.out.println(f.length());

        }




    }
}
