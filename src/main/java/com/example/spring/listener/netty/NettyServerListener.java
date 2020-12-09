package com.example.spring.listener.netty;

import io.netty.bootstrap.ServerBootstrap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName: NettyServerListener
 * @Author: hcy
 * CreateDate: 2020/12/9 2:11 下午
 */
@Component
@Slf4j
public class NettyServerListener {
    ServerBootstrap serverBootstrap = new ServerBootstrap();

}
