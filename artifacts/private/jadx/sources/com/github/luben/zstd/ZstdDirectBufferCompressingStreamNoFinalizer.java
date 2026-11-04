package com.github.luben.zstd;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ZstdDirectBufferCompressingStreamNoFinalizer implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f102973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f102974b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f102979g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f102975c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f102976d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f102977e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f102978f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f102980h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ZstdDictCompress f102981i = null;

    static {
        com.github.luben.zstd.util.a.o();
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer(ByteBuffer byteBuffer, int i10) throws IOException {
        this.f102979g = Zstd.defaultCompressionLevel();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Target buffer should be a direct buffer");
        }
        this.f102973a = byteBuffer;
        this.f102979g = i10;
        this.f102974b = createCStream();
    }

    public static int c() {
        return (int) recommendedCOutSize();
    }

    private native long compressDirectByteBuffer(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    private static native long createCStream();

    private native long endStream(long j10, ByteBuffer byteBuffer, int i10, int i11);

    private native long flushStream(long j10, ByteBuffer byteBuffer, int i10, int i11);

    private static native long freeCStream(long j10);

    private native long initCStream(long j10, int i10);

    private native long initCStreamWithDict(long j10, byte[] bArr, int i10, int i11);

    private native long initCStreamWithFastDict(long j10, ZstdDictCompress zstdDictCompress);

    private static native long recommendedCOutSize();

    public void a(ByteBuffer byteBuffer) throws IOException {
        ZstdDirectBufferCompressingStreamNoFinalizer zstdDirectBufferCompressingStreamNoFinalizer;
        long jInitCStream;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Source buffer should be a direct buffer");
        }
        if (this.f102977e) {
            throw new IOException("Stream closed");
        }
        if (this.f102978f) {
            zstdDirectBufferCompressingStreamNoFinalizer = this;
        } else {
            ZstdDictCompress zstdDictCompress = this.f102981i;
            if (zstdDictCompress != null) {
                zstdDictCompress.a();
                try {
                    long jInitCStreamWithFastDict = initCStreamWithFastDict(this.f102974b, zstdDictCompress);
                    zstdDictCompress.c();
                    jInitCStream = jInitCStreamWithFastDict;
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                } catch (Throwable th2) {
                    zstdDictCompress.c();
                    throw th2;
                }
            } else {
                byte[] bArr = this.f102980h;
                if (bArr != null) {
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    jInitCStream = zstdDirectBufferCompressingStreamNoFinalizer.initCStreamWithDict(this.f102974b, bArr, bArr.length, this.f102979g);
                } else {
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    jInitCStream = zstdDirectBufferCompressingStreamNoFinalizer.initCStream(zstdDirectBufferCompressingStreamNoFinalizer.f102974b, zstdDirectBufferCompressingStreamNoFinalizer.f102979g);
                }
            }
            if (Zstd.isError(jInitCStream)) {
                throw new p(jInitCStream);
            }
            zstdDirectBufferCompressingStreamNoFinalizer.f102978f = true;
        }
        while (byteBuffer.hasRemaining()) {
            if (!zstdDirectBufferCompressingStreamNoFinalizer.f102973a.hasRemaining()) {
                ByteBuffer byteBufferB = zstdDirectBufferCompressingStreamNoFinalizer.b(zstdDirectBufferCompressingStreamNoFinalizer.f102973a);
                zstdDirectBufferCompressingStreamNoFinalizer.f102973a = byteBufferB;
                if (!byteBufferB.isDirect()) {
                    throw new IllegalArgumentException("Target buffer should be a direct buffer");
                }
                if (!zstdDirectBufferCompressingStreamNoFinalizer.f102973a.hasRemaining()) {
                    throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                }
            }
            long j10 = zstdDirectBufferCompressingStreamNoFinalizer.f102974b;
            ByteBuffer byteBuffer2 = zstdDirectBufferCompressingStreamNoFinalizer.f102973a;
            ByteBuffer byteBuffer3 = byteBuffer;
            long jCompressDirectByteBuffer = zstdDirectBufferCompressingStreamNoFinalizer.compressDirectByteBuffer(j10, byteBuffer2, byteBuffer2.position(), zstdDirectBufferCompressingStreamNoFinalizer.f102973a.remaining(), byteBuffer3, byteBuffer.position(), byteBuffer.remaining());
            if (Zstd.isError(jCompressDirectByteBuffer)) {
                throw new p(jCompressDirectByteBuffer);
            }
            ByteBuffer byteBuffer4 = zstdDirectBufferCompressingStreamNoFinalizer.f102973a;
            byteBuffer4.position(byteBuffer4.position() + zstdDirectBufferCompressingStreamNoFinalizer.f102976d);
            byteBuffer3.position(byteBuffer3.position() + zstdDirectBufferCompressingStreamNoFinalizer.f102975c);
            byteBuffer = byteBuffer3;
        }
    }

    protected ByteBuffer b(ByteBuffer byteBuffer) throws IOException {
        return byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        ZstdDirectBufferCompressingStreamNoFinalizer zstdDirectBufferCompressingStreamNoFinalizer;
        if (this.f102977e) {
            return;
        }
        try {
            if (this.f102978f) {
                while (true) {
                    long j10 = this.f102974b;
                    ByteBuffer byteBuffer = this.f102973a;
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    try {
                        long jEndStream = zstdDirectBufferCompressingStreamNoFinalizer.endStream(j10, byteBuffer, byteBuffer.position(), this.f102973a.remaining());
                        if (Zstd.isError(jEndStream)) {
                            throw new p(jEndStream);
                        }
                        ByteBuffer byteBuffer2 = zstdDirectBufferCompressingStreamNoFinalizer.f102973a;
                        byteBuffer2.position(byteBuffer2.position() + zstdDirectBufferCompressingStreamNoFinalizer.f102976d);
                        ByteBuffer byteBufferB = zstdDirectBufferCompressingStreamNoFinalizer.b(zstdDirectBufferCompressingStreamNoFinalizer.f102973a);
                        zstdDirectBufferCompressingStreamNoFinalizer.f102973a = byteBufferB;
                        if (!byteBufferB.isDirect()) {
                            throw new IllegalArgumentException("Target buffer should be a direct buffer");
                        }
                        if (jEndStream > 0 && !zstdDirectBufferCompressingStreamNoFinalizer.f102973a.hasRemaining()) {
                            throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                        }
                        if (jEndStream > 0) {
                            this = zstdDirectBufferCompressingStreamNoFinalizer;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        freeCStream(zstdDirectBufferCompressingStreamNoFinalizer.f102974b);
                        zstdDirectBufferCompressingStreamNoFinalizer.f102977e = true;
                        zstdDirectBufferCompressingStreamNoFinalizer.f102978f = false;
                        zstdDirectBufferCompressingStreamNoFinalizer.f102973a = null;
                        throw th3;
                    }
                }
            } else {
                zstdDirectBufferCompressingStreamNoFinalizer = this;
            }
            freeCStream(zstdDirectBufferCompressingStreamNoFinalizer.f102974b);
            zstdDirectBufferCompressingStreamNoFinalizer.f102977e = true;
            zstdDirectBufferCompressingStreamNoFinalizer.f102978f = false;
            zstdDirectBufferCompressingStreamNoFinalizer.f102973a = null;
        } catch (Throwable th4) {
            th = th4;
            zstdDirectBufferCompressingStreamNoFinalizer = this;
        }
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer d(ZstdDictCompress zstdDictCompress) {
        if (this.f102978f) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        this.f102980h = null;
        this.f102981i = zstdDictCompress;
        return this;
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer e(byte[] bArr) {
        if (this.f102978f) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        this.f102980h = bArr;
        this.f102981i = null;
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f102977e) {
            throw new IOException("Already closed");
        }
        if (!this.f102978f) {
            return;
        }
        while (true) {
            long j10 = this.f102974b;
            ByteBuffer byteBuffer = this.f102973a;
            ZstdDirectBufferCompressingStreamNoFinalizer zstdDirectBufferCompressingStreamNoFinalizer = this;
            long jFlushStream = zstdDirectBufferCompressingStreamNoFinalizer.flushStream(j10, byteBuffer, byteBuffer.position(), this.f102973a.remaining());
            if (Zstd.isError(jFlushStream)) {
                throw new p(jFlushStream);
            }
            ByteBuffer byteBuffer2 = zstdDirectBufferCompressingStreamNoFinalizer.f102973a;
            byteBuffer2.position(byteBuffer2.position() + zstdDirectBufferCompressingStreamNoFinalizer.f102976d);
            ByteBuffer byteBufferB = zstdDirectBufferCompressingStreamNoFinalizer.b(zstdDirectBufferCompressingStreamNoFinalizer.f102973a);
            zstdDirectBufferCompressingStreamNoFinalizer.f102973a = byteBufferB;
            if (!byteBufferB.isDirect()) {
                throw new IllegalArgumentException("Target buffer should be a direct buffer");
            }
            if (jFlushStream > 0 && !zstdDirectBufferCompressingStreamNoFinalizer.f102973a.hasRemaining()) {
                throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
            }
            if (jFlushStream <= 0) {
                return;
            } else {
                this = zstdDirectBufferCompressingStreamNoFinalizer;
            }
        }
    }
}
