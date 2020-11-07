package com.file;

import java.io.*;
import java.util.Collection;

/**
 * 完成文件的复制
 */
public class IOUtils {

    public static void copyOf(String fromPath,String  toPath){
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new BufferedInputStream(new FileInputStream(fromPath));
            os = new BufferedOutputStream(new FileOutputStream(toPath));
            int read = 0;
//            while((read=is.read())!=-1){
//                os.write(read);
//
//            }
           byte[] bytes = new byte[8*1024];
            while((read=is.read(bytes))!=-1){
                os.write(bytes);
            }
            os.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            close(is);
            close(os);
        }
    }

    /**
     * 封装关流方法
     * @param io
     */
    public  static void close(Closeable io){
        try {
            if(io!=null){
                io.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
