package com.rabbitmq.client.impl;

import java.io.IOException;
import java.net.SocketException;

/* JADX INFO: loaded from: classes13.dex */
public interface t0 extends d1 {
    void a(int i10) throws SocketException;

    void b(s0 s0Var) throws IOException;

    s0 c() throws IOException;

    void close();

    void e() throws IOException;

    void f(i iVar);

    void flush() throws IOException;

    int i2() throws SocketException;
}
