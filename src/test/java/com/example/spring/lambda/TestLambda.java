package com.example.spring.lambda;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: spring
 * @description: test lambda
 * @author: hcy
 * @create: 2020-08-01 10:37
 **/
public class TestLambda {

    public static void main(String[] args){
        List<String> list = new LinkedList<String>();
        list.add("123");
        list.add("234");
        list.add("456");
        list = list.stream().filter(r -> r.equals("123")).collect(Collectors.toList());

        list.forEach(r -> System.out.println("test = " + r));
    }

}
