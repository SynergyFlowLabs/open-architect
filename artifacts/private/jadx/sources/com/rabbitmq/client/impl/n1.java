package com.rabbitmq.client.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes13.dex */
public class n1 implements t0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final org.slf4j.c f265548e = org.slf4j.e.k(n1.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f265549f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Socket f265550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f265551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DataInputStream f265552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DataOutputStream f265553d;

    class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            n1.this.flush();
            return null;
        }
    }

    public n1(Socket socket) throws IOException {
        this(socket, null);
    }

    @Override // com.rabbitmq.client.impl.t0
    public void a(int i10) throws SocketException {
        this.f265550a.setSoTimeout(i10);
    }

    @Override // com.rabbitmq.client.impl.t0
    public void b(s0 s0Var) throws IOException {
        synchronized (this.f265553d) {
            s0Var.n(this.f265553d);
        }
    }

    @Override // com.rabbitmq.client.impl.t0
    public s0 c() throws IOException {
        s0 s0VarJ;
        synchronized (this.f265552c) {
            s0VarJ = s0.j(this.f265552c);
        }
        return s0VarJ;
    }

    @Override // com.rabbitmq.client.impl.t0
    public void close() {
        try {
            this.f265550a.setSoLinger(true, 1);
        } catch (Exception unused) {
        }
        a aVar = new a();
        Future futureSubmit = null;
        try {
            ExecutorService executorService = this.f265551b;
            if (executorService == null) {
                aVar.call();
            } else {
                futureSubmit = executorService.submit(aVar);
                futureSubmit.get(1L, TimeUnit.SECONDS);
            }
        } catch (Exception unused2) {
            if (futureSubmit != null) {
                futureSubmit.cancel(true);
            }
        }
        try {
            this.f265550a.close();
        } catch (Exception unused3) {
        }
    }

    public DataInputStream d() {
        return this.f265552c;
    }

    @Override // com.rabbitmq.client.impl.t0
    public void e() throws IOException {
        h(0, 9, 1);
        Socket socket = this.f265550a;
        if (socket instanceof SSLSocket) {
            u1.s(((SSLSocket) socket).getSession());
        }
    }

    @Override // com.rabbitmq.client.impl.t0
    public void f(i iVar) {
        iVar.d2();
    }

    @Override // com.rabbitmq.client.impl.t0
    public void flush() throws IOException {
        this.f265553d.flush();
    }

    public void g(int i10, int i11) throws IOException {
        synchronized (this.f265553d) {
            try {
                this.f265553d.write("AMQP".getBytes("US-ASCII"));
                this.f265553d.write(1);
                this.f265553d.write(1);
                this.f265553d.write(i10);
                this.f265553d.write(i11);
                try {
                    this.f265553d.flush();
                } catch (SSLHandshakeException e10) {
                    f265548e.F("TLS connection failed: {}", e10.getMessage());
                    throw e10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.rabbitmq.client.impl.d1
    public InetAddress getLocalAddress() {
        return this.f265550a.getLocalAddress();
    }

    @Override // com.rabbitmq.client.impl.d1
    public int getLocalPort() {
        return this.f265550a.getLocalPort();
    }

    @Override // com.rabbitmq.client.impl.d1
    public int getPort() {
        return this.f265550a.getPort();
    }

    public void h(int i10, int i11, int i12) throws IOException {
        synchronized (this.f265553d) {
            try {
                this.f265553d.write("AMQP".getBytes("US-ASCII"));
                this.f265553d.write(0);
                this.f265553d.write(i10);
                this.f265553d.write(i11);
                this.f265553d.write(i12);
                try {
                    this.f265553d.flush();
                } catch (SSLHandshakeException e10) {
                    f265548e.F("TLS connection failed: {}", e10.getMessage());
                    throw e10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.rabbitmq.client.impl.t0
    public int i2() throws SocketException {
        return this.f265550a.getSoTimeout();
    }

    @Override // com.rabbitmq.client.impl.d1
    public InetAddress v1() {
        return this.f265550a.getInetAddress();
    }

    public n1(Socket socket, ExecutorService executorService) throws IOException {
        this.f265550a = socket;
        this.f265551b = executorService;
        this.f265552c = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        this.f265553d = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    }
}
