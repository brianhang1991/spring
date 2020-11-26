package com.example.spring;

import com.example.spring.entity.User;

import java.lang.reflect.Field;

public class TestReflect {

    public static void main(String[] args){
        User user = new User();
        user.setId(123);
        user.setName("hcy");
        Class clazz = user.getClass();
        Field[] fields = clazz.getDeclaredFields();
        if(fields[0].getName().equals("id")){

            fields[0].setAccessible(true);
            try {
                fields[0].set(user,2);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        System.out.println("test result = " + user.getId());
    }

}
