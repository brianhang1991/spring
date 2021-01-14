package com.example.spring.adapter;

import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;

/**
 * @ClassName: ServerChannelHandlerAdapter
 * @Author: hcy
 * CreateDate: 2021/1/11 1:55 下午
 */
@Slf4j
public class ServerChannelHandlerAdapter extends ChannelInboundHandlerAdapter {

    @Resource
    private RequestDispatcher dispatcher;

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable throwable){
        throwable.printStackTrace();
        ctx.close();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg){
        log.info("netty服务器的请求为：" + msg.toString());
        if(msg instanceof FullHttpRequest){
            FullHttpRequest request = (FullHttpRequest)msg;
            String uri = request.uri();
            log.info("netty服务器接收到的请求为：" + uri);
            if (uri == null){
                ctx.channel().writeAndFlush(new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.NOT_FOUND))
                        .addListener(ChannelFutureListener.CLOSE);
                return;
            }
        }
        ctx.channel().writeAndFlush(new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.NOT_FOUND))
                .addListener(ChannelFutureListener.CLOSE);
        return;
    }
}
