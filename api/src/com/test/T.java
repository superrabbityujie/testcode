package com.test;


public class T {
     private T(){

     }
     private static T t;

     public static T get(){
         if(t==null){
             t = new T();
         }
         return t;
     }
    public void methods(){

    }
}
