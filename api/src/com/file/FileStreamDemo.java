package com.file;

import java.io.*;

public class FileStreamDemo {

    public static void main(String[] args) throws Exception {
       copyArray(new File("/Users/iot1/3.txt"),new File("/Users/iot1/4.txt"));
    }
    // 一个数组一个数组的复制

    private static void copyArray(File from, File to) throws Exception {

        // 2，读取from，写出到to

        InputStream in = new FileInputStream(from);

        OutputStream out = new FileOutputStream(to);



        // 3，批量的读和写

        int b = 0;// 记录每次读取到的数据

        //源码：数组默认的长度一般是8M数组的长度就是8*1024

        byte[] bs = new byte[8*1024];//用来缓存数据
        while ((b = in.read(bs)) != -1) {//读取数组中的内容
            System.out.println(bs);
            out.write(bs);// 把读到的数组里的内容写出去

        }



        // 4，关闭资源

        in.close();

        out.close();
    }

}
