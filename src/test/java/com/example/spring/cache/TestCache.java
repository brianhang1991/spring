package com.example.spring.cache;

import com.example.spring.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @program: spring
 * @description: Test cache
 * @author: hcy
 * @create: 2020-07-17 16:30
 **/

//@RunWith(Application.class)
@SpringBootTest
public class TestCache {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private EhCacheCacheManager ehCacheCacheManager;
    
    @Test
    public void testCache(){
        userService.selectById(234);


    }
}
