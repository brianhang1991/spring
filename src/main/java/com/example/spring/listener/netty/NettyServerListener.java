package com.example.spring.listener.netty;

import com.example.spring.adapter.ServerChannelHandlerAdapter;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;

import javax.annotation.Resource;

/**
* @ClassName: NettyServerListener
 * @Author: hcy
 * CreateDate: 2020/12/9 2:11 下午
 */
@Component
@Slf4j
public class NettyServerListener {
    ServerBootstrap serverBootstrap = new ServerBootstrap();
    EventLoopGroup boss = new NioEventLoopGroup();
    EventLoopGroup worker = new NioEventLoopGroup();
    @Resource
    private ServerChannelHandlerAdapter channelHandlerAdapter;

}
