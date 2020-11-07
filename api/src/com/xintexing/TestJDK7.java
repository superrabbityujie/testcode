package com.xintexing;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestJDK7 {
    public static void main(String[] args) {
            methods1();
    }

    /**
     * 1.7以前关闭流
     */
    public static void methods1() {
        //接受键盘接受的数据
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
        InputStream in = null;
        BufferedInputStream inputStream =null;
        int b = 0;
        try {
            in = System.in;
            inputStream = new BufferedInputStream(in);
            while((b=inputStream.read())!=-1){
                System.out.println(b);
                char c = (char)b;
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //读完释放资源,放到trycatch的final里
            try {
                in.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 1.7以后关闭流 try--with--resource，在try后加一个()
     */
    public static void methods2() {
        //接受键盘接受的数据
        int b = 0;
        try (InputStream in = System.in;
             BufferedInputStream inputStream =new BufferedInputStream(in)){
            while((b=inputStream.read())!=-1){
                System.out.println(b);
                char c = (char)b;
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //1.7以后可以一下子catch多个异常,可以通过｜来追加捕获的异常
    public static void methods3() {
        //接受键盘接受的数据
        int b = 0;

        try(InputStream in = System.in;
            BufferedInputStream inputStream =new BufferedInputStream(in)){
            while((b=inputStream.read())!=-1){
                System.out.println(b);
                char c = (char)b;
                System.out.println(c);
            }
        } catch (IOException|ArithmeticException|ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}
