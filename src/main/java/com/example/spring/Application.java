package com.example.spring;

import com.example.spring.config.ExecutorConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;


@Import(value = ExecutorConfig.class)
@SpringBootApplication
@MapperScan("com.example.spring.mapper")
@EnableAspectJAutoProxy
@EnableCaching
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
