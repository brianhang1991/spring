package com.example.spring.classloader;

import com.sun.org.apache.bcel.internal.util.ClassLoader;

import java.io.*;

/**
 * @ClassName: CustomClassLoader
 * @Author: hcy
 * CreateDate: 2021/1/5 2:07 下午
 */
public class CustomClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String className) {
        Class test = null;
        byte[] classData = getData();
        if (classData != null){
            test = defineClass(className, classData, 0 , classData.length);
        }
        return test;
    }

    private byte[] getData(){
        String classPath = "/Users/hangchongyang/IdeaProjects/spring/target/classes/com/example/spring/classloader/TestClassLoader.class";
        File file = new File(classPath);
        FileInputStream fileInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[2048];
            int size = 0;
            while ((size = fileInputStream.read(bytes)) != -1){
                byteArrayOutputStream.write(bytes, 0, size );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }
}
