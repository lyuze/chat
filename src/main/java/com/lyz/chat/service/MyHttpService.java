package com.lyz.chat.service;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

/**
 * @Author: liuyuze
 * @Date: 2019.9.17 13:48
 */
public interface MyHttpService {

    void handleHttpRequest(ChannelHandlerContext ctx, FullHttpRequest request);
}
