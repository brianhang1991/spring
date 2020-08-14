package com.example.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: spring
 * @description: executor config
 * @author: hcy
 * @create: 2020-08-14 15:56
 **/
@Configuration
public class ExecutorConfig {

    @Bean
    public ExecutorService getExecutorService(){
        return Executors.newCachedThreadPool();
    }

}

