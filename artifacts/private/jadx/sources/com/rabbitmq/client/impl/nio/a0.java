package com.rabbitmq.client.impl.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes13.dex */
public class a0 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f265558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f265559b;

        static {
            int[] iArr = new int[SSLEngineResult.Status.values().length];
            f265559b = iArr;
            try {
                iArr[SSLEngineResult.Status.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f265559b[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f265559b[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f265559b[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
            f265558a = iArr2;
            try {
                iArr2[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f265558a[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f265558a[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static int a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iMin = Math.min(byteBuffer2.remaining(), byteBuffer.remaining());
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(byteBufferDuplicate.position() + iMin);
        byteBuffer2.put(byteBufferDuplicate);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public static void b(WritableByteChannel writableByteChannel, SSLEngine sSLEngine) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sSLEngine.getSession().getApplicationBufferSize());
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        sSLEngine.closeOutbound();
        while (!sSLEngine.isOutboundDone()) {
            sSLEngine.wrap(byteBufferAllocate, byteBufferAllocate2);
            byteBufferAllocate2.flip();
            while (byteBufferAllocate2.hasRemaining() && writableByteChannel.write(byteBufferAllocate2) != -1) {
            }
            byteBufferAllocate2.clear();
        }
    }

    public static boolean c(SocketChannel socketChannel, SSLEngine sSLEngine) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(sSLEngine.getSession().getApplicationBufferSize());
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(sSLEngine.getSession().getApplicationBufferSize());
        ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        SSLEngineResult.HandshakeStatus handshakeStatus = sSLEngine.getHandshakeStatus();
        while (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED && handshakeStatus != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            int i10 = a.f265558a[handshakeStatus.ordinal()];
            if (i10 == 1) {
                handshakeStatus = e(sSLEngine);
            } else if (i10 == 2) {
                handshakeStatus = f(byteBufferAllocate4, byteBufferAllocate2, socketChannel, sSLEngine);
            } else if (i10 == 3) {
                handshakeStatus = g(byteBufferAllocate, byteBufferAllocate3, socketChannel, sSLEngine);
            }
        }
        return true;
    }

    private static int d(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int iA = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            iA = j.a(readableByteChannel, byteBuffer);
            if (iA > 0) {
                break;
            }
        }
        return iA;
    }

    private static SSLEngineResult.HandshakeStatus e(SSLEngine sSLEngine) {
        while (true) {
            Runnable delegatedTask = sSLEngine.getDelegatedTask();
            if (delegatedTask == null) {
                return sSLEngine.getHandshakeStatus();
            }
            delegatedTask.run();
        }
    }

    private static SSLEngineResult.HandshakeStatus f(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ReadableByteChannel readableByteChannel, SSLEngine sSLEngine) throws IOException {
        SSLEngineResult.HandshakeStatus handshakeStatus = sSLEngine.getHandshakeStatus();
        if (readableByteChannel.read(byteBuffer) < 0) {
            throw new SSLException("Could not read from socket channel");
        }
        byteBuffer.flip();
        do {
            SSLEngineResult sSLEngineResultUnwrap = sSLEngine.unwrap(byteBuffer, byteBuffer2);
            int i10 = a.f265559b[sSLEngineResultUnwrap.getStatus().ordinal()];
            if (i10 == 1) {
                byteBuffer2.clear();
                handshakeStatus = e(sSLEngine);
            } else {
                if (i10 == 2) {
                    throw new SSLException("Buffer overflow during handshake");
                }
                if (i10 != 3) {
                    int i11 = 6 ^ 4;
                    if (i10 != 4) {
                        throw new SSLException("Unexpected status from " + sSLEngineResultUnwrap);
                    }
                    sSLEngine.closeInbound();
                } else {
                    byteBuffer.compact();
                    if (j.a(readableByteChannel, byteBuffer) <= 0) {
                        d(readableByteChannel, byteBuffer);
                    }
                    byteBuffer.flip();
                }
            }
        } while (byteBuffer.hasRemaining());
        byteBuffer.compact();
        return handshakeStatus;
    }

    private static SSLEngineResult.HandshakeStatus g(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, WritableByteChannel writableByteChannel, SSLEngine sSLEngine) throws IOException {
        sSLEngine.getHandshakeStatus();
        SSLEngineResult.Status status = sSLEngine.wrap(byteBuffer, byteBuffer2).getStatus();
        int i10 = a.f265559b[status.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                throw new SSLException("Buffer overflow during handshake");
            }
            throw new SSLException("Unexpected status " + status);
        }
        SSLEngineResult.HandshakeStatus handshakeStatusE = e(sSLEngine);
        byteBuffer2.flip();
        while (byteBuffer2.hasRemaining()) {
            writableByteChannel.write(byteBuffer2);
        }
        byteBuffer2.clear();
        return handshakeStatusE;
    }

    public static void h(WritableByteChannel writableByteChannel, SSLEngine sSLEngine, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws IOException {
        while (byteBuffer.hasRemaining()) {
            byteBuffer2.clear();
            SSLEngineResult sSLEngineResultWrap = sSLEngine.wrap(byteBuffer, byteBuffer2);
            int i10 = a.f265559b[sSLEngineResultWrap.getStatus().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    throw new SSLException("Buffer overflow occured after a wrap.");
                }
                if (i10 == 3) {
                    throw new SSLException("Buffer underflow occured after a wrap.");
                }
                if (i10 == 4) {
                    throw new SSLException("Buffer closed");
                }
                throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultWrap.getStatus());
            }
            byteBuffer2.flip();
            while (byteBuffer2.hasRemaining()) {
                writableByteChannel.write(byteBuffer2);
            }
        }
    }
}
