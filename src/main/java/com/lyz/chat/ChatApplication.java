package com.lyz.chat;

import com.lyz.chat.service.impl.WebSocketServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatApplication {

    private static String ip = "172.17.47.112";
//    private static String ip = "192.168.1.100";

    private static Integer post = 10000;

    public static void main(String[] args) {
        new WebSocketServer(ip, post).start();
    }


}
