package com.example.spring.classloader;


import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: TestClassLoader
 * @Author: hcy
 * CreateDate: 2021/1/5 4:06 下午
 */
@Slf4j
public class TestClassLoader {
    public static void main(String[] args){
        CustomClassLoader customClassLoader = new CustomClassLoader();
        Class<?> aClass = customClassLoader.findClass("com.example.spring.classloader.TestClassLoader");
        try {
//            Class<?> testTarget = customClassLoader.loadClass("com.example.spring.classloader.TestClassLoader");
            log.info("类加载器是" + customClassLoader.toString());
            Method method = aClass.getDeclaredMethod("main1", String[].class);
            Object object = aClass.newInstance();
//            String[] argsTest = new String[2];
//            argsTest[0] = "test1";
//            argsTest[1] = "test2";
            method.invoke(object, (Object) new String[]{});
        }catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
