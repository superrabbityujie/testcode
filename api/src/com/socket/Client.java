package com.socket;

import java.io.*;
import java.net.Socket;

/**
 *给服务器发送请求,接受服务器发送过来的数据
 */
public class Client {
    public static void main(String[] args) {
        //链接服务器
        try {
//            Socket socket = new Socket("176.17.2.134",8000);
            //本机ip
            Socket socket = new Socket("127.0.0.1",8000);
            System.out.println("客户端已启动");
            //测试的时候先启动服务器，再启动客户端
            //2，准备发送要给服务器发送数据，写出数据用outInut

            OutputStream outputStream = (FileOutputStream) socket.getOutputStream();
            //将字符串转换成字节,在写进写出流中
//            outputStream.write("Hello".getBytes("utf-8"));
            outputStream.write("Hello".getBytes());
            //这里不能关系流
//            outputStream.close();
            outputStream.flush();
            //读取服务端发送的信息
            InputStream inputStream =socket.getInputStream();
            int data=0;
            while((data=inputStream.read())!=-1){
                char c = (char)data;
                System.out.print(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
