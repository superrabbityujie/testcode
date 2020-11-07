package com.file;

import java.io.File;

public class DiguishanDemo {
    public static void main(String[] args) {
            DiguishanDemo demo = new DiguishanDemo();
            demo.diguishan("");
    }

    public void diguishan(String dir){
           File file = new File(dir);
           delete(file);

    }
    public void delete(File file){
        //删除文件夹以及文件，这里需要注意的是，文件夹要是没有东西才能删
        File[]  files = file.listFiles();
        for (int i = 0; i <files.length ; i++) {
            File f = files[i];
            if(f.isFile()){
                //如果是文件，可以直接删除
                boolean flag=f.delete();
                if(flag){
                    //打印一些信息
                }
            }else{
                //如果是文件夹，则自己调用自己
                delete(f);
            }
        }
    }
}
