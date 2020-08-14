package com.example.spring.netty;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @program: spring
 * @description: server udp
 * @author: hcy
 * @create: 2020-08-14 09:56
 **/
@Slf4j
public class ServerNetty {
    public static void main(String[] args) throws IOException {
        String strSend = "hello , this udp server";
        //DatagramSocket设置监听端口
        DatagramSocket datagramSocket = new DatagramSocket(3000);
        log.info("服务端socket创建完成...");
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 1024);
        while (true){
            log.info("进入服务器监听循环...");
            datagramSocket.receive(datagramPacket);
            String strReceive = "str receive";
            DatagramPacket datagramPacketSend = new DatagramPacket(strSend.getBytes(), strSend.length(),
                    datagramPacket.getAddress(), 9000);
            log.info("服务器向外发送信息初始化完毕...");
            datagramSocket.send(datagramPacketSend);
            log.info("服务器已经向外发送信息...");
            datagramPacket.setLength(1024);
        }
    }
}
