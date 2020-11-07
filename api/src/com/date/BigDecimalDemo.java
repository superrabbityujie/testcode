package com.date;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigDecimalDemo {
    public static void main(String[] args) {
//        BigDecimal bigDecimal = new BigDecimal("1111");
//        BigDecimal bigDecimal1 = new BigDecimal(333.33);
        BigDecimalDemo decimalDemo = new BigDecimalDemo();
        decimalDemo.plus(2.3,4.4);
//        BigDecimal.valueOf(22.44);
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };

    }
    public void plus(double a,double b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        BigDecimal ab = new BigDecimal(String.valueOf(a));
        BigDecimal bb = new BigDecimal(String.valueOf(b));
        BigDecimal ac =ab.add(bb);
        System.out.println(ac);
        BigDecimal bc=ab.subtract(bb);
        System.out.println(bc);
        //乘
        BigDecimal cc = ab.multiply(bb);
        System.out.println(cc);
        BigDecimal dc = ab.divide(bb,2,BigDecimal.ROUND_HALF_UP);
        System.out.println(dc);
        List list = new ArrayList<>();

     }
}
