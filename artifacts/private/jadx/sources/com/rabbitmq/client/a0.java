package com.rabbitmq.client;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes13.dex */
public class a0 implements s1 {
    @Override // com.rabbitmq.client.s1
    public void a(Socket socket) throws IOException {
        socket.setTcpNoDelay(true);
    }
}
