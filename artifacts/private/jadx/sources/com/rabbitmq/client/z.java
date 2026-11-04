package com.rabbitmq.client;

import java.io.IOException;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes13.dex */
public class z implements n1 {
    @Override // com.rabbitmq.client.n1
    public void a(SocketChannel socketChannel) throws IOException {
        socketChannel.socket().setTcpNoDelay(true);
    }
}
