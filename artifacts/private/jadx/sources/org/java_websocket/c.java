package org.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes14.dex */
public class c implements l, ByteChannel, jm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.slf4j.c f337810a = org.slf4j.e.k(c.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SocketChannel f337811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLEngine f337812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f337813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f337814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f337815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f337816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ExecutorService f337817h;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f337818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f337819b;

        static {
            int[] iArr = new int[SSLEngineResult.HandshakeStatus.values().length];
            f337819b = iArr;
            try {
                iArr[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f337819b[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f337819b[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f337819b[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f337819b[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[SSLEngineResult.Status.values().length];
            f337818a = iArr2;
            try {
                iArr2[SSLEngineResult.Status.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f337818a[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f337818a[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f337818a[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public c(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || this.f337817h == executorService) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.f337811b = socketChannel;
        this.f337812c = sSLEngine;
        this.f337817h = executorService;
        this.f337814e = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        this.f337816g = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        sSLEngine.beginHandshake();
        if (c()) {
            if (selectionKey != null) {
                selectionKey.interestOps(selectionKey.interestOps() | 4);
            }
        } else {
            try {
                socketChannel.close();
            } catch (IOException e10) {
                this.f337810a.c("Exception during the closing of the channel", e10);
            }
        }
    }

    private void b() throws IOException {
        this.f337812c.closeOutbound();
        try {
            c();
        } catch (IOException unused) {
        }
        this.f337811b.close();
    }

    private boolean c() throws IOException {
        SSLEngineResult.HandshakeStatus handshakeStatus;
        int applicationBufferSize = this.f337812c.getSession().getApplicationBufferSize();
        this.f337813d = ByteBuffer.allocate(applicationBufferSize);
        this.f337815f = ByteBuffer.allocate(applicationBufferSize);
        this.f337814e.clear();
        this.f337816g.clear();
        SSLEngineResult.HandshakeStatus handshakeStatus2 = this.f337812c.getHandshakeStatus();
        boolean z10 = false;
        while (!z10) {
            int i10 = a.f337819b[handshakeStatus2.ordinal()];
            if (i10 == 1) {
                boolean zHasRemaining = this.f337816g.hasRemaining();
                boolean z11 = !zHasRemaining;
                if (!zHasRemaining) {
                    return true;
                }
                this.f337811b.write(this.f337816g);
                z10 = z11;
            } else if (i10 != 2) {
                if (i10 == 3) {
                    this.f337814e.clear();
                    try {
                        SSLEngineResult sSLEngineResultWrap = this.f337812c.wrap(this.f337813d, this.f337814e);
                        handshakeStatus = sSLEngineResultWrap.getHandshakeStatus();
                        int i11 = a.f337818a[sSLEngineResultWrap.getStatus().ordinal()];
                        if (i11 == 1) {
                            this.f337814e.flip();
                            while (this.f337814e.hasRemaining()) {
                                this.f337811b.write(this.f337814e);
                            }
                        } else {
                            if (i11 == 2) {
                                throw new SSLException("Buffer underflow occurred after a wrap. I don't think we should ever get here.");
                            }
                            if (i11 == 3) {
                                this.f337814e = f(this.f337814e);
                            } else {
                                if (i11 != 4) {
                                    throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultWrap.getStatus());
                                }
                                try {
                                    this.f337814e.flip();
                                    while (this.f337814e.hasRemaining()) {
                                        this.f337811b.write(this.f337814e);
                                    }
                                    this.f337816g.clear();
                                } catch (Exception unused) {
                                    handshakeStatus2 = this.f337812c.getHandshakeStatus();
                                }
                            }
                        }
                        handshakeStatus2 = handshakeStatus;
                    } catch (SSLException unused2) {
                        this.f337812c.closeOutbound();
                        handshakeStatus2 = this.f337812c.getHandshakeStatus();
                    }
                } else if (i10 == 4) {
                    while (true) {
                        Runnable delegatedTask = this.f337812c.getDelegatedTask();
                        if (delegatedTask == null) {
                            break;
                        }
                        this.f337817h.execute(delegatedTask);
                    }
                    handshakeStatus2 = this.f337812c.getHandshakeStatus();
                } else if (i10 != 5) {
                    throw new IllegalStateException("Invalid SSL status: " + handshakeStatus2);
                }
            } else if (this.f337811b.read(this.f337816g) >= 0) {
                this.f337816g.flip();
                try {
                    SSLEngineResult sSLEngineResultUnwrap = this.f337812c.unwrap(this.f337816g, this.f337815f);
                    this.f337816g.compact();
                    handshakeStatus = sSLEngineResultUnwrap.getHandshakeStatus();
                    int i12 = a.f337818a[sSLEngineResultUnwrap.getStatus().ordinal()];
                    if (i12 != 1) {
                        if (i12 == 2) {
                            this.f337816g = g(this.f337816g);
                        } else if (i12 == 3) {
                            this.f337815f = d(this.f337815f);
                        } else {
                            if (i12 != 4) {
                                throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultUnwrap.getStatus());
                            }
                            if (this.f337812c.isOutboundDone()) {
                                return false;
                            }
                            this.f337812c.closeOutbound();
                            handshakeStatus2 = this.f337812c.getHandshakeStatus();
                        }
                    }
                    handshakeStatus2 = handshakeStatus;
                } catch (SSLException unused3) {
                    this.f337812c.closeOutbound();
                    handshakeStatus2 = this.f337812c.getHandshakeStatus();
                }
            } else {
                if (this.f337812c.isInboundDone() && this.f337812c.isOutboundDone()) {
                    return false;
                }
                try {
                    this.f337812c.closeInbound();
                } catch (SSLException unused4) {
                }
                this.f337812c.closeOutbound();
                handshakeStatus2 = this.f337812c.getHandshakeStatus();
            }
        }
        return true;
    }

    private ByteBuffer d(ByteBuffer byteBuffer) {
        return e(byteBuffer, this.f337812c.getSession().getApplicationBufferSize());
    }

    private ByteBuffer e(ByteBuffer byteBuffer, int i10) {
        return i10 > byteBuffer.capacity() ? ByteBuffer.allocate(i10) : ByteBuffer.allocate(byteBuffer.capacity() * 2);
    }

    private ByteBuffer f(ByteBuffer byteBuffer) {
        return e(byteBuffer, this.f337812c.getSession().getPacketBufferSize());
    }

    private ByteBuffer g(ByteBuffer byteBuffer) {
        if (this.f337812c.getSession().getPacketBufferSize() < byteBuffer.limit()) {
            return byteBuffer;
        }
        ByteBuffer byteBufferF = f(byteBuffer);
        byteBuffer.flip();
        byteBufferF.put(byteBuffer);
        return byteBufferF;
    }

    private void h() throws IOException {
        try {
            this.f337812c.closeInbound();
        } catch (Exception unused) {
            this.f337810a.j("This engine was forced to close inbound, without having received the proper SSL/TLS close notification message from the peer, due to end of stream.");
        }
        b();
    }

    @Override // org.java_websocket.l
    public boolean K4() {
        if (!this.f337816g.hasRemaining() && !this.f337815f.hasRemaining()) {
            return false;
        }
        return true;
    }

    @Override // jm.a
    public SSLEngine a() {
        return this.f337812c;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b();
    }

    @Override // org.java_websocket.l
    public boolean g2() {
        return this.f337811b.isBlocking();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f337811b.isOpen();
    }

    @Override // org.java_websocket.l
    public void rb() throws IOException {
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        try {
            if (!byteBuffer.hasRemaining()) {
                return 0;
            }
            if (this.f337815f.hasRemaining()) {
                this.f337815f.flip();
                return org.java_websocket.util.b.b(this.f337815f, byteBuffer);
            }
            this.f337816g.compact();
            int i10 = this.f337811b.read(this.f337816g);
            if (i10 > 0 || this.f337816g.hasRemaining()) {
                this.f337816g.flip();
                if (this.f337816g.hasRemaining()) {
                    this.f337815f.compact();
                    try {
                        SSLEngineResult sSLEngineResultUnwrap = this.f337812c.unwrap(this.f337816g, this.f337815f);
                        int i11 = a.f337818a[sSLEngineResultUnwrap.getStatus().ordinal()];
                        if (i11 == 1) {
                            this.f337815f.flip();
                            return org.java_websocket.util.b.b(this.f337815f, byteBuffer);
                        }
                        if (i11 == 2) {
                            this.f337815f.flip();
                            return org.java_websocket.util.b.b(this.f337815f, byteBuffer);
                        }
                        if (i11 == 3) {
                            this.f337815f = d(this.f337815f);
                            return read(byteBuffer);
                        }
                        if (i11 == 4) {
                            b();
                            byteBuffer.clear();
                            return -1;
                        }
                        throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultUnwrap.getStatus());
                    } catch (SSLException e10) {
                        this.f337810a.c("SSLException during unwrap", e10);
                        throw e10;
                    }
                }
            } else if (i10 < 0) {
                h();
            }
            org.java_websocket.util.b.b(this.f337815f, byteBuffer);
            return i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public synchronized int write(ByteBuffer byteBuffer) throws IOException {
        int iWrite = 0;
        while (byteBuffer.hasRemaining()) {
            try {
                this.f337814e.clear();
                SSLEngineResult sSLEngineResultWrap = this.f337812c.wrap(byteBuffer, this.f337814e);
                int i10 = a.f337818a[sSLEngineResultWrap.getStatus().ordinal()];
                if (i10 == 1) {
                    this.f337814e.flip();
                    while (this.f337814e.hasRemaining()) {
                        iWrite += this.f337811b.write(this.f337814e);
                    }
                } else {
                    if (i10 == 2) {
                        throw new SSLException("Buffer underflow occurred after a wrap. I don't think we should ever get here.");
                    }
                    if (i10 != 3) {
                        if (i10 == 4) {
                            b();
                            return 0;
                        }
                        throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultWrap.getStatus());
                    }
                    this.f337814e = f(this.f337814e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iWrite;
    }

    @Override // org.java_websocket.l
    public boolean y4() {
        return false;
    }

    @Override // org.java_websocket.l
    public int yb(ByteBuffer byteBuffer) throws IOException {
        return read(byteBuffer);
    }
}
