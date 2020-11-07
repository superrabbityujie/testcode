package com.test;

import sun.security.action.GetPropertyAction;

import java.security.AccessController;

/**
 * 字符串测试类
 */
public class StringTest {
    public static void main(String[] args) {
        //创建String对象--本质上就是维护了一个char[]
        char[] chars = {'h','e','l'};
        //触发String(char[] value)构造方法
        String str = new String(chars);

        char a =str.charAt(1);
        System.out.println(a);
        boolean startsWith=str.startsWith("h");
        System.out.println(startsWith);
        System.out.println(startsWith);
        char[] ch=str.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            System.out.println(ch[i]);
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
//        StringBuffer
//         "2".equals(
//         1);
        java.security.PrivilegedAction pa = new GetPropertyAction("file.encoding");
        String csn = (String) AccessController.doPrivileged(pa);
        System.out.println(csn);
        String hello = "123456";

    }
}
