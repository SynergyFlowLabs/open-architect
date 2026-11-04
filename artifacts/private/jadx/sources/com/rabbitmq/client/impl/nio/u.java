package com.rabbitmq.client.impl.nio;

import com.rabbitmq.client.impl.s0;
import com.rabbitmq.client.impl.t0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;

/* JADX INFO: loaded from: classes13.dex */
public class u implements t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final org.slf4j.c f265606b = org.slf4j.e.k(u.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f265607a;

    public u(w wVar) {
        this.f265607a = wVar;
    }

    @Override // com.rabbitmq.client.impl.t0
    public void a(int i10) throws SocketException {
        this.f265607a.d().socket().setSoTimeout(i10);
    }

    @Override // com.rabbitmq.client.impl.t0
    public void b(s0 s0Var) throws IOException {
        this.f265607a.o(s0Var);
    }

    @Override // com.rabbitmq.client.impl.t0
    public s0 c() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.rabbitmq.client.impl.t0
    public void close() {
        try {
            this.f265607a.a();
        } catch (IOException e10) {
            f265606b.p("Error while closing SocketChannel", e10);
        }
    }

    public w d() {
        return this.f265607a;
    }

    @Override // com.rabbitmq.client.impl.t0
    public void e() throws IOException {
        this.f265607a.j();
    }

    @Override // com.rabbitmq.client.impl.t0
    public void f(com.rabbitmq.client.impl.i iVar) {
        this.f265607a.l(iVar);
    }

    @Override // com.rabbitmq.client.impl.t0
    public void flush() throws IOException {
    }

    @Override // com.rabbitmq.client.impl.d1
    public InetAddress getLocalAddress() {
        return this.f265607a.d().socket().getLocalAddress();
    }

    @Override // com.rabbitmq.client.impl.d1
    public int getLocalPort() {
        return this.f265607a.d().socket().getLocalPort();
    }

    @Override // com.rabbitmq.client.impl.d1
    public int getPort() {
        return this.f265607a.d().socket().getPort();
    }

    @Override // com.rabbitmq.client.impl.t0
    public int i2() throws SocketException {
        return this.f265607a.d().socket().getSoTimeout();
    }

    @Override // com.rabbitmq.client.impl.d1
    public InetAddress v1() {
        return this.f265607a.d().socket().getInetAddress();
    }
}
