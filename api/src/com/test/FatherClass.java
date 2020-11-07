package com.test;

public class FatherClass {
    public static void main(String[] args) {
       FatherClass f = new Zi();

    }
}

class Zi extends FatherClass{
    public static void methods() {
        System.out.println("111");
    }
}
