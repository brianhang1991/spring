package com.example.spring.netty;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.*;

/**
 * @program: spring
 * @description: client udp
 * @author: hcy
 * @create: 2020-08-14 10:54
 **/
@Slf4j
public class ClientUdp {

    public static void main(String[] args) throws IOException {
        String strSend = "hello , this is udp client";
        byte[] buff = new byte[1024];
        DatagramSocket datagramSocket = new DatagramSocket(9000);
        InetAddress inetAddress = InetAddress.getLocalHost();
        DatagramPacket datagramPacket = new DatagramPacket(strSend.getBytes(), strSend.length(), inetAddress,
                 3000);
        DatagramPacket datagramPacketReceive = new DatagramPacket(buff, 1024);
        datagramSocket.send(datagramPacket);
        datagramSocket.setSoTimeout(5000);
        int tries = 0;
        boolean receiveResponse = false;
        while (!receiveResponse && tries < 5){
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(datagramPacketReceive);
            if (!datagramPacketReceive.getAddress().equals(inetAddress)){

            }
            receiveResponse = true;
        }
        if (receiveResponse){
            log.info("已经接收到服务器信息 : " + new String(datagramPacketReceive.getData(), 0 , datagramPacketReceive.getLength()));
        }

    }

}
