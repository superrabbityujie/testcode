package com.fanxing;

import com.sun.codemodel.internal.JMethod;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        metods();
//        //创建一个HashMap对象
//        Map<Integer,String> map1 = new HashMap<>();
//        map1.put(1,"2");
//        map1.put(2,"1");
//
//        map1.containsKey(1);
//
//        Map<Integer,String> map2 = new HashMap<>();
//        map2.put(3,"3");
//        map1.putAll(map2);
//        System.out.println(map1);
//        //遍历方式一 keySet存的key
//        Set<Integer> set =map1.keySet();
//        for (Integer key: set) {
//            String value = map1.get(key);
//            System.out.println("key:"+key+"value:"+value);
//        }
//        //遍历方法--entrySet存放的是Entry<Integer,String>对象,这个Entry<Integer,String>是Map接口中内部接口
//        //把map里的key和value存到
//        Set<Map.Entry<Integer,String>>  set2=map1.entrySet();
//        //遍历set得到一个Entry<Integer,String>对象
//        for (Map.Entry<Integer,String> entry: set2) {
//            Integer key =entry.getKey();
//            String value = entry.getValue();
//            System.out.println("key:"+key+"value:"+value);
//        }
//        //遍历方式3 Map的valyes()方Collection,
//        Collection<String> c1 =map1.values();
//        //当然也可以用迭代器
//        for (String s: c1) {
//            //只能打印value值
//            System.out.println(s);
//        }

    }

    public static void metods(){
//        //统计字符串字符出现的次数
//        String str = "a1b34gduqtks123";
//        Map<Character,Integer> map = new HashMap<>();
//        //统计每个字符出现的次数
//        for (int i = 0; i <str.length() ; i++) {
//            char c=str.charAt(i);
//            //根据key获取value
//            if(map.get(c)==null){
//                //以前没存过
//                map.put(c,1);
//            }else {
//                int value =map.get(c);
//                map.put(c,value+1);
//            }
//        }
//        System.out.println(map);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            //根据key获取value
            Integer value =map.get(c);
            if(value==null){
                map.put(c,1);
            }else {
                map.put(c,value+1);
            }
        }
        System.out.println(map);
    }

}
