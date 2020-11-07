package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.getDate());
        double a=Double.valueOf("122");
        SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd HH:mm:dd");
        try {
            Date date1=df.parse("1987-01-01 00:00:00");
            String format=df.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
