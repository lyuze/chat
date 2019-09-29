package com.lyz.chat.handler;

import com.lyz.chat.service.impl.WebSocketServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Configurations implements CommandLineRunner {

    //    private static String ip = "192.168.1.118";
    private static String ip = "127.0.0.1";
    //    private static String ip = "192.168.1.100";

    private static Integer post = 9999;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Netty ready ... ...");
        new WebSocketServer(ip, post).start();
    }
}
