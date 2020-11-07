package com.test;

public class Ttest {
    public static void main(String[] args) {
        T t = T.get();
        t.methods();
        System.out.println("abcdefghijklmnopqrstuvwxyz".substring(5, 26));
    }
}

class One {
    public One foo() {
        return this;
    }
}

class Two extends One {
    public One foo() {
        return this;
    }
}

class Three extends Two{
    ///
}