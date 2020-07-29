package com.example.spring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: spring
 * @description: test date
 * @author: hcy
 * @create: 2020-07-22 16:37
 **/
public class TestDate {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为 : " + simpleDateFormat.parse(simpleDateFormat.format(date)));
    }
}
