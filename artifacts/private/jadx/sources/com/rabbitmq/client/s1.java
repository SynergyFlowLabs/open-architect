package com.rabbitmq.client;

import java.io.IOException;
import java.net.Socket;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
@FunctionalInterface
public interface s1 {
    static /* synthetic */ void c(s1 s1Var, s1 s1Var2, Socket socket) throws IOException {
        s1Var.a(socket);
        s1Var2.a(socket);
    }

    void a(Socket socket) throws IOException;

    default s1 b(final s1 s1Var) {
        Objects.requireNonNull(s1Var);
        return new s1() { // from class: com.rabbitmq.client.r1
            @Override // com.rabbitmq.client.s1
            public final void a(Socket socket) throws IOException {
                s1.c(this.f266024a, s1Var, socket);
            }
        };
    }
}
