package com.rabbitmq.client;

import java.io.IOException;
import java.nio.channels.SocketChannel;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
@FunctionalInterface
public interface n1 {
    static /* synthetic */ void c(n1 n1Var, n1 n1Var2, SocketChannel socketChannel) throws IOException {
        n1Var.a(socketChannel);
        n1Var2.a(socketChannel);
    }

    void a(SocketChannel socketChannel) throws IOException;

    default n1 b(final n1 n1Var) {
        Objects.requireNonNull(n1Var);
        return new n1() { // from class: com.rabbitmq.client.m1
            @Override // com.rabbitmq.client.n1
            public final void a(SocketChannel socketChannel) throws IOException {
                n1.c(this.f265968a, n1Var, socketChannel);
            }
        };
    }
}
