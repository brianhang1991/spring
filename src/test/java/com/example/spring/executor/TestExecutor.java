package com.example.spring.executor;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutorService;

/**
 * @program: spring
 * @description: test executor
 * @author: hcy
 * @create: 2020-08-14 15:55
 **/
@SpringBootTest
@RunWith(SpringRunner.class)

@Slf4j
public class TestExecutor {

    @Autowired
    private ExecutorService executorService;

    @Test
    public void test(){
        for (int i = 0; i < 5; i++){
            executorService.execute(new Thread(() -> log.info("thread is :" + Thread.currentThread())));
        }
    }
}
