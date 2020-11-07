package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端
 * 接受客户端发来的请求，给客户端做出相应
 */
public class Server {
    public static void main(String[] args) {
          //1服务器启动，跟开机一个概念
        try {
            //服务器开的端口号0-65535,开个门
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("服务器已启动");
            //切到切到客户端代码--去写链接服务器代码
            //不写这句，启动客户端会报错
            Socket socket =serverSocket.accept();
            System.out.println("服务器接收到客户端的请求");
            //服务器读取的代码
            InputStream inputStream =socket.getInputStream();
            //服务器段写数据到客户端
            OutputStream outputStream =socket.getOutputStream();
            outputStream.write("llll".getBytes());
//            outputStream.close();
            outputStream.flush();
            int data=0;
            while((data=inputStream.read())!=-1){
                //把这个整数转字符
                char a = (char) data;
                System.out.print(a);
            }


            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
