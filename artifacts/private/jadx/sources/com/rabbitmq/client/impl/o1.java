package com.rabbitmq.client.impl;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes13.dex */
public class o1 extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SocketFactory f265640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f265641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.rabbitmq.client.x1 f265642f;

    public o1(int i10, SocketFactory socketFactory, com.rabbitmq.client.s1 s1Var, boolean z10) {
        this(i10, socketFactory, s1Var, z10, null);
    }

    private static void d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.rabbitmq.client.impl.u0
    public t0 a(com.rabbitmq.client.b bVar, String str) throws IOException {
        Socket socketC;
        String strA = bVar.a();
        int iL0 = com.rabbitmq.client.r.l0(bVar.b(), this.f265502c);
        try {
            socketC = c(str);
            try {
                this.f265501b.a(socketC);
                socketC.connect(new InetSocketAddress(strA, iL0), this.f265500a);
                return b(socketC);
            } catch (IOException e10) {
                e = e10;
                d(socketC);
                throw e;
            }
        } catch (IOException e11) {
            e = e11;
            socketC = null;
        }
    }

    public t0 b(Socket socket) throws IOException {
        return new n1(socket, this.f265641e);
    }

    protected Socket c(String str) throws IOException {
        SocketFactory socketFactory = this.f265640d;
        if (socketFactory != null) {
            return socketFactory.createSocket();
        }
        return this.f265502c ? this.f265642f.a(str).getSocketFactory().createSocket() : SocketFactory.getDefault().createSocket();
    }

    public o1(int i10, SocketFactory socketFactory, com.rabbitmq.client.s1 s1Var, boolean z10, ExecutorService executorService) {
        this(i10, socketFactory, s1Var, z10, executorService, null);
    }

    public o1(int i10, SocketFactory socketFactory, com.rabbitmq.client.s1 s1Var, boolean z10, ExecutorService executorService, com.rabbitmq.client.x1 x1Var) {
        super(i10, s1Var, z10);
        this.f265640d = socketFactory;
        this.f265641e = executorService;
        this.f265642f = x1Var;
    }
}
