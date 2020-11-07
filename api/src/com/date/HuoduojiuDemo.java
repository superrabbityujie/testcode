package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HuoduojiuDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //出生日期
            Date date  =df.parse(str);
            long birthtime =date.getTime();
            long nowtime = System.currentTimeMillis();
            long days =(nowtime-birthtime)/1000/60/60/24;
            System.out.println(days);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
