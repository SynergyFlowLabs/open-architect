package com.rabbitmq.client.impl.nio;

import com.rabbitmq.client.impl.s0;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import javax.net.ssl.SSLEngine;

/* JADX INFO: loaded from: classes13.dex */
public class w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final org.slf4j.c f265614o = org.slf4j.e.k(w.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f265615p = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SocketChannel f265616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f265617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.rabbitmq.client.impl.i f265618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f265619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f265620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f265621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f265622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final SSLEngine f265623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final ByteBuffer f265624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ByteBuffer f265625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final ByteBuffer f265626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final ByteBuffer f265627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final DataOutputStream f265628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final f f265629n;

    public w(SocketChannel socketChannel, o oVar, r rVar, SSLEngine sSLEngine) {
        this.f265616a = socketChannel;
        this.f265621f = oVar.f265589f;
        this.f265620e = oVar.f265590g;
        i iVar = new i(rVar, sSLEngine);
        this.f265617b = rVar.o() == null ? r.f265591m.apply(iVar) : rVar.o().apply(iVar);
        this.f265623h = sSLEngine;
        if (sSLEngine == null) {
            int i10 = 0 << 0;
            this.f265622g = false;
            ByteBuffer byteBuffer = oVar.f265588e;
            this.f265624i = byteBuffer;
            this.f265626k = null;
            ByteBuffer byteBuffer2 = oVar.f265587d;
            this.f265625j = byteBuffer2;
            this.f265627l = null;
            this.f265628m = new DataOutputStream(new c(socketChannel, byteBuffer));
            this.f265629n = new f(socketChannel, byteBuffer2);
            return;
        }
        this.f265622g = true;
        ByteBuffer byteBufferD = rVar.d().d(iVar);
        this.f265624i = byteBufferD;
        ByteBuffer byteBufferC = rVar.d().c(iVar);
        this.f265626k = byteBufferC;
        ByteBuffer byteBufferA = rVar.d().a(iVar);
        this.f265625j = byteBufferA;
        ByteBuffer byteBufferB = rVar.d().b(iVar);
        this.f265627l = byteBufferB;
        this.f265628m = new DataOutputStream(new y(sSLEngine, byteBufferD, byteBufferC, socketChannel));
        this.f265629n = new z(sSLEngine, byteBufferA, byteBufferB, socketChannel);
    }

    private void k(b0 b0Var) throws IOException {
        try {
            if (!this.f265617b.a(b0Var)) {
                throw new IOException("Frame enqueuing failed");
            }
            this.f265620e.a(this, 4);
            this.f265621f.f265604a.wakeup();
        } catch (InterruptedException unused) {
            f265614o.m0("Thread interrupted during enqueuing frame in write queue");
            Thread.currentThread().interrupt();
        }
    }

    void a() throws IOException {
        if (this.f265622g) {
            a0.b(this.f265616a, this.f265623h);
        }
        if (this.f265616a.isOpen()) {
            this.f265616a.socket().setSoLinger(true, 1);
            this.f265616a.close();
        }
    }

    boolean b() throws IOException {
        if (!this.f265622g) {
            if (!this.f265625j.hasRemaining()) {
                this.f265625j.clear();
                j.a(this.f265616a, this.f265625j);
                this.f265625j.flip();
            }
            return this.f265625j.hasRemaining();
        }
        if (!this.f265625j.hasRemaining() && !this.f265627l.hasRemaining()) {
            this.f265627l.clear();
            if (j.a(this.f265616a, this.f265627l) == 0) {
                return false;
            }
            this.f265627l.flip();
        }
        return true;
    }

    void c() {
        if (this.f265622g) {
            return;
        }
        this.f265624i.clear();
    }

    public SocketChannel d() {
        return this.f265616a;
    }

    public com.rabbitmq.client.impl.i e() {
        return this.f265618c;
    }

    public long f() {
        return this.f265619d;
    }

    public s g() {
        return this.f265617b;
    }

    void h() throws IOException {
        if (!this.f265622g) {
            j.a(this.f265616a, this.f265625j);
            this.f265625j.flip();
        } else {
            this.f265627l.clear();
            this.f265625j.clear();
            this.f265627l.flip();
            this.f265625j.flip();
        }
    }

    void i() {
        if (this.f265622g) {
            this.f265624i.clear();
            this.f265626k.clear();
        }
    }

    public void j() throws IOException {
        k(h.f265572a);
    }

    public void l(com.rabbitmq.client.impl.i iVar) {
        this.f265618c = iVar;
    }

    public void m(long j10) {
        this.f265619d = j10;
    }

    public void n() {
        this.f265621f.a(this, 1);
    }

    public void o(s0 s0Var) throws IOException {
        k(new g(s0Var));
    }
}
