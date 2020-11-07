package com.file;

import java.io.File;

public class FileDiguiQiuhe {
    public static void main(String[] args) {
         String dir ="/Users/iotest";
         FileDiguiQiuhe fileDiguiQiuhe = new FileDiguiQiuhe();
         fileDiguiQiuhe.filesum(dir);
    }
    public void filesum(String dir){
        File file = new File(dir);
        //求文件夹和问价的大小的方法
        long sum = sum(file);
        System.out.println(sum+"字节");

    }
    public long sum(File file){
        long  sum = 0;
        File[] files =file.listFiles();
        for (int i = 0; i <files.length ; i++) {
            File f = files[i];
            if(f.isFile()){
                //如果是文件就统计
                sum+=f.length();
            }else {
                //如果是文件夹，自己调用自己
                sum+=sum(f);
            }
        }
        return sum;
    }
}