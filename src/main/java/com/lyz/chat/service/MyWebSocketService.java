package com.lyz.chat.service;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;

/**
 * @Author: liuyuze
 * @Date: 2019.9.17 13:48
 */
public interface MyWebSocketService {

    void handleFrame(ChannelHandlerContext ctx, WebSocketFrame frame);
}
