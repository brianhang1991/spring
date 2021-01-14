package com.example.spring.listener.netty;

import com.example.spring.adapter.ServerChannelHandlerAdapter;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
* @ClassName: NettyServerListener
 * @Author: hcy
 * CreateDate: 2020/12/9 2:11 下午
 */
@Component
@Slf4j
public class NettyServerListener implements ApplicationRunner {

    @Value("${netty.websocket.ip}")
    private String ip;

    @Value("${netty.websocket.port}")
    private int port;

    ServerBootstrap serverBootstrap = new ServerBootstrap();
    EventLoopGroup boss = new NioEventLoopGroup();
    EventLoopGroup worker = new NioEventLoopGroup();
    private Channel serverChannel;

    public void run(ApplicationArguments args){
        serverBootstrap.group(boss, worker);
        serverBootstrap.channel(NioServerSocketChannel.class);
        serverBootstrap.localAddress(ip, port);
        serverBootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {
                ChannelPipeline channelPipeline = socketChannel.pipeline();
                channelPipeline.addLast(new ServerChannelHandlerAdapter());
            }
        });
        try {
            Channel channel = serverBootstrap.bind().sync().channel();
            this.serverChannel = channel;
            log.info("netty服务器启动");
            channel.closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
        finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }
    }
}
