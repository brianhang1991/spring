package com.example.spring.thread;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: spring
 * @description: test thread
 * @author: hcy
 * @create: 2020-08-20 14:17
 **/
public class TestThread {

    public static void main(String[] args){
        Map<Thread, StackTraceElement[]> allThread = Thread.getAllStackTraces();
        List<Thread> ss = allThread.keySet().stream().collect(Collectors.toList());
        for(Thread a:ss){
            System.out.println("thread name = " + a.getName());
            if(a.getName().equals("Attach Listener")){
//                a.();
            }
        }

        Map<Thread, StackTraceElement[]> allThread1 = Thread.getAllStackTraces();
        List<Thread> ss1 = allThread1.keySet().stream().collect(Collectors.toList());
        for(Thread a:ss1){
            System.out.println("-----------------------------------");
            System.out.println("thread name = " + a.getName());
        }

    }
}
