package com.rabbitmq.client.impl.nio;

import com.rabbitmq.client.impl.t0;
import com.rabbitmq.client.impl.u1;
import com.rabbitmq.client.x1;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: loaded from: classes13.dex */
public class v extends com.rabbitmq.client.impl.l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final org.slf4j.c f265608i = org.slf4j.e.k(u.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final r f265609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x1 f265610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lock f265611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicLong f265612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<o> f265613h;

    public v(int i10, r rVar, boolean z10, x1 x1Var) throws IOException {
        super(i10, null, z10);
        this.f265611f = new ReentrantLock();
        this.f265612g = new AtomicLong();
        r rVar2 = new r(rVar);
        this.f265609d = rVar2;
        this.f265610e = x1Var;
        this.f265613h = new ArrayList(rVar2.f());
        for (int i11 = 0; i11 < this.f265609d.f(); i11++) {
            this.f265613h.add(new o(this, this.f265609d));
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00fc A[Catch: IOException -> 0x00ff, TRY_LEAVE, TryCatch #3 {IOException -> 0x00ff, blocks: (B:39:0x00f7, B:41:0x00fc), top: B:50:0x00f7 }] */
    @Override // com.rabbitmq.client.impl.u0
    public t0 a(com.rabbitmq.client.b bVar, String str) throws IOException {
        SocketChannel socketChannel;
        SSLEngine sSLEngineCreateSSLEngine;
        int iL0 = com.rabbitmq.client.r.l0(bVar.b(), this.f265502c);
        SSLEngine sSLEngine = null;
        SocketChannel socketChannelOpen = null;
        try {
            if (this.f265502c) {
                sSLEngineCreateSSLEngine = this.f265610e.a(str).createSSLEngine(bVar.a(), iL0);
                try {
                    sSLEngineCreateSSLEngine.setUseClientMode(true);
                    if (this.f265609d.j() != null) {
                        this.f265609d.j().a(sSLEngineCreateSSLEngine);
                    }
                } catch (IOException e10) {
                    e = e10;
                    socketChannel = socketChannelOpen;
                    sSLEngine = sSLEngineCreateSSLEngine;
                }
            } else {
                sSLEngineCreateSSLEngine = null;
            }
            InetSocketAddress inetSocketAddress = new InetSocketAddress(bVar.a(), iL0);
            socketChannelOpen = SocketChannel.open();
            socketChannelOpen.configureBlocking(true);
            if (this.f265609d.i() != null) {
                this.f265609d.i().a(socketChannelOpen);
            }
            socketChannelOpen.connect(inetSocketAddress);
            if (this.f265502c) {
                sSLEngineCreateSSLEngine.beginHandshake();
                try {
                    if (!a0.c(socketChannelOpen, sSLEngineCreateSSLEngine)) {
                        f265608i.j("TLS connection failed");
                        throw new SSLException("TLS handshake failed");
                    }
                    u1.s(sSLEngineCreateSSLEngine.getSession());
                } catch (SSLHandshakeException e11) {
                    f265608i.F("TLS connection failed: {}", e11.getMessage());
                    throw e11;
                }
                e = e10;
                socketChannel = socketChannelOpen;
                sSLEngine = sSLEngineCreateSSLEngine;
                if (sSLEngine != null && socketChannel != null) {
                    try {
                        a0.b(socketChannel, sSLEngine);
                        if (socketChannel != null) {
                            socketChannel.close();
                        }
                    } catch (IOException unused) {
                    }
                } else if (socketChannel != null) {
                    socketChannel.close();
                }
                throw e;
            }
            socketChannelOpen.configureBlocking(false);
            this.f265611f.lock();
            try {
                o oVar = this.f265613h.get((int) (this.f265612g.getAndIncrement() % ((long) this.f265609d.f())));
                oVar.b();
                w wVar = new w(socketChannelOpen, oVar, this.f265609d, sSLEngineCreateSSLEngine);
                wVar.n();
                u uVar = new u(wVar);
                this.f265611f.unlock();
                return uVar;
            } catch (Throwable th2) {
                this.f265611f.unlock();
                throw th2;
            }
        } catch (IOException e12) {
            e = e12;
            socketChannel = null;
        }
    }

    void b() {
        this.f265611f.lock();
    }

    void c() {
        this.f265611f.unlock();
    }
}
