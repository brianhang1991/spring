package com.example.spring.jdk8;

public interface TestInterfaceMethod {

    default void test(){
        System.out.println("test interface method!");
    }

}
