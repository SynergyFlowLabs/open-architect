package org.java_websocket;

import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes14.dex */
public class d implements ByteChannel, l, jm.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static ByteBuffer f337834n = ByteBuffer.allocate(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f337835o = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ExecutorService f337837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<Future<?>> f337838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ByteBuffer f337839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ByteBuffer f337840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ByteBuffer f337841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected SocketChannel f337842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected SelectionKey f337843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected SSLEngine f337844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected SSLEngineResult f337845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected SSLEngineResult f337846k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.slf4j.c f337836a = org.slf4j.e.k(d.class);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f337847l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f337848m = null;

    public d(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || executorService == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.f337842g = socketChannel;
        this.f337844i = sSLEngine;
        this.f337837b = executorService;
        SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, sSLEngine.getHandshakeStatus(), 0, 0);
        this.f337846k = sSLEngineResult;
        this.f337845j = sSLEngineResult;
        this.f337838c = new ArrayList(3);
        if (selectionKey != null) {
            selectionKey.interestOps(selectionKey.interestOps() | 4);
            this.f337843h = selectionKey;
        }
        f(sSLEngine.getSession());
        this.f337842g.write(y(f337834n));
        l();
    }

    private void e(Future<?> future) {
        while (true) {
            try {
                try {
                    future.get();
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } catch (ExecutionException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private boolean h() {
        SSLEngineResult.HandshakeStatus handshakeStatus = this.f337844i.getHandshakeStatus();
        return handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED || handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    private synchronized void l() throws IOException {
        try {
            if (this.f337844i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
                return;
            }
            if (!this.f337838c.isEmpty()) {
                Iterator<Future<?>> it = this.f337838c.iterator();
                while (it.hasNext()) {
                    Future<?> next = it.next();
                    if (!next.isDone()) {
                        if (g2()) {
                            e(next);
                        }
                        return;
                    }
                    it.remove();
                }
            }
            if (this.f337844i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                if (!g2() || this.f337845j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                    this.f337841f.compact();
                    int i10 = 2 ^ (-1);
                    if (this.f337842g.read(this.f337841f) == -1) {
                        throw new IOException("connection closed unexpectedly by peer");
                    }
                    this.f337841f.flip();
                }
                this.f337839d.compact();
                x();
                if (this.f337845j.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    f(this.f337844i.getSession());
                    return;
                }
            }
            d();
            if (this.f337838c.isEmpty() || this.f337844i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                this.f337842g.write(y(f337834n));
                if (this.f337846k.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    f(this.f337844i.getSession());
                    return;
                }
            }
            this.f337847l = 1;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private int m(ByteBuffer byteBuffer) throws SSLException {
        if (this.f337839d.hasRemaining()) {
            return r(this.f337839d, byteBuffer);
        }
        if (!this.f337839d.hasRemaining()) {
            this.f337839d.clear();
        }
        t();
        if (this.f337841f.hasRemaining()) {
            x();
            int iR = r(this.f337839d, byteBuffer);
            if (this.f337845j.getStatus() == SSLEngineResult.Status.CLOSED) {
                return -1;
            }
            if (iR > 0) {
                return iR;
            }
        }
        return 0;
    }

    private void o() {
        ByteBuffer byteBuffer = this.f337841f;
        if (byteBuffer == null || byteBuffer.remaining() <= 0) {
            return;
        }
        byte[] bArr = new byte[this.f337841f.remaining()];
        this.f337848m = bArr;
        this.f337841f.get(bArr);
    }

    private int r(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iRemaining = byteBuffer.remaining();
        int iRemaining2 = byteBuffer2.remaining();
        if (iRemaining <= iRemaining2) {
            byteBuffer2.put(byteBuffer);
            return iRemaining;
        }
        int iMin = Math.min(iRemaining, iRemaining2);
        for (int i10 = 0; i10 < iMin; i10++) {
            byteBuffer2.put(byteBuffer.get());
        }
        return iMin;
    }

    private void t() {
        if (this.f337848m != null) {
            this.f337841f.clear();
            this.f337841f.put(this.f337848m);
            this.f337841f.flip();
            this.f337848m = null;
        }
    }

    private synchronized ByteBuffer x() throws SSLException {
        if (this.f337845j.getStatus() == SSLEngineResult.Status.CLOSED && this.f337844i.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            try {
                close();
            } catch (IOException unused) {
            }
        }
        while (true) {
            int iRemaining = this.f337839d.remaining();
            SSLEngineResult sSLEngineResultUnwrap = this.f337844i.unwrap(this.f337841f, this.f337839d);
            this.f337845j = sSLEngineResultUnwrap;
            if (sSLEngineResultUnwrap.getStatus() != SSLEngineResult.Status.OK || (iRemaining == this.f337839d.remaining() && this.f337844i.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_UNWRAP)) {
                break;
            }
        }
        this.f337839d.flip();
        return this.f337839d;
    }

    private synchronized ByteBuffer y(ByteBuffer byteBuffer) throws SSLException {
        this.f337840e.compact();
        this.f337846k = this.f337844i.wrap(byteBuffer, this.f337840e);
        this.f337840e.flip();
        return this.f337840e;
    }

    @Override // org.java_websocket.l
    public boolean K4() {
        if (this.f337848m == null && !this.f337839d.hasRemaining() && (!this.f337841f.hasRemaining() || this.f337845j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW || this.f337845j.getStatus() == SSLEngineResult.Status.CLOSED)) {
            return false;
        }
        return true;
    }

    @Override // jm.a
    public SSLEngine a() {
        return this.f337844i;
    }

    public SelectableChannel b(boolean z10) throws IOException {
        return this.f337842g.configureBlocking(z10);
    }

    public boolean c(SocketAddress socketAddress) throws IOException {
        return this.f337842g.connect(socketAddress);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f337844i.closeOutbound();
        this.f337844i.getSession().invalidate();
        try {
            if (this.f337842g.isOpen()) {
                this.f337842g.write(y(f337834n));
            }
        } finally {
            this.f337842g.close();
        }
    }

    protected void d() {
        while (true) {
            Runnable delegatedTask = this.f337844i.getDelegatedTask();
            if (delegatedTask == null) {
                return;
            } else {
                this.f337838c.add(this.f337837b.submit(delegatedTask));
            }
        }
    }

    protected void f(SSLSession sSLSession) {
        o();
        int packetBufferSize = sSLSession.getPacketBufferSize();
        int iMax = Math.max(sSLSession.getApplicationBufferSize(), packetBufferSize);
        ByteBuffer byteBuffer = this.f337839d;
        if (byteBuffer == null) {
            this.f337839d = ByteBuffer.allocate(iMax);
            this.f337840e = ByteBuffer.allocate(packetBufferSize);
            this.f337841f = ByteBuffer.allocate(packetBufferSize);
        } else {
            if (byteBuffer.capacity() != iMax) {
                this.f337839d = ByteBuffer.allocate(iMax);
            }
            if (this.f337840e.capacity() != packetBufferSize) {
                this.f337840e = ByteBuffer.allocate(packetBufferSize);
            }
            if (this.f337841f.capacity() != packetBufferSize) {
                this.f337841f = ByteBuffer.allocate(packetBufferSize);
            }
        }
        if (this.f337839d.remaining() != 0 && this.f337836a.R()) {
            this.f337836a.J(new String(this.f337839d.array(), this.f337839d.position(), this.f337839d.remaining()));
        }
        this.f337839d.rewind();
        this.f337839d.flip();
        if (this.f337841f.remaining() != 0 && this.f337836a.R()) {
            this.f337836a.J(new String(this.f337841f.array(), this.f337841f.position(), this.f337841f.remaining()));
        }
        this.f337841f.rewind();
        this.f337841f.flip();
        this.f337840e.rewind();
        this.f337840e.flip();
        this.f337847l++;
    }

    public boolean g() throws IOException {
        return this.f337842g.finishConnect();
    }

    @Override // org.java_websocket.l
    public boolean g2() {
        return this.f337842g.isBlocking();
    }

    public boolean isConnected() {
        return this.f337842g.isConnected();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f337842g.isOpen();
    }

    public boolean j() {
        return this.f337844i.isInboundDone();
    }

    public Socket q() {
        return this.f337842g.socket();
    }

    @Override // org.java_websocket.l
    public void rb() throws IOException {
        write(this.f337840e);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        t();
        while (byteBuffer.hasRemaining()) {
            if (!h()) {
                if (g2()) {
                    while (!h()) {
                        l();
                    }
                } else {
                    l();
                    if (!h()) {
                        return 0;
                    }
                }
            }
            int iM = m(byteBuffer);
            if (iM != 0) {
                return iM;
            }
            this.f337839d.clear();
            if (this.f337841f.hasRemaining()) {
                this.f337841f.compact();
            } else {
                this.f337841f.clear();
            }
            if ((g2() || this.f337845j.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) && this.f337842g.read(this.f337841f) == -1) {
                return -1;
            }
            this.f337841f.flip();
            x();
            int iR = r(this.f337839d, byteBuffer);
            if (iR != 0 || !g2()) {
                return iR;
            }
        }
        return 0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!h()) {
            l();
            return 0;
        }
        int iWrite = this.f337842g.write(y(byteBuffer));
        if (this.f337846k.getStatus() != SSLEngineResult.Status.CLOSED) {
            return iWrite;
        }
        throw new EOFException("Connection is closed");
    }

    @Override // org.java_websocket.l
    public boolean y4() {
        return this.f337840e.hasRemaining() || !h();
    }

    @Override // org.java_websocket.l
    public int yb(ByteBuffer byteBuffer) throws SSLException {
        return m(byteBuffer);
    }
}
