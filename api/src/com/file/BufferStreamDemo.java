package com.file;

import com.sun.tools.internal.ws.wsdl.document.Output;

import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) {
        try {
            //创建多态对象，这个参数可以用继承InputStream的子类都行，这个类读的比较快
            InputStream is = new BufferedInputStream(new FileInputStream("/Users/iot1/1.txt"));
            OutputStream os = new BufferedOutputStream(new FileOutputStream("/Users/iot1/3.txt",true));
            int read=0;
            while((read=is.read())!=-1) {
                //写流
                os.write(read);

            }
            os.flush();
           is.close();
           os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
