package com.github.luben.zstd;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ZstdOutputStreamNoFinalizer extends FilterOutputStream {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f103000k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f103001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f103002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f103003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f103004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ByteBuffer f103005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f103006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f103007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f103008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f103009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f103010j;

    static {
        com.github.luben.zstd.util.a.o();
        f103000k = (int) recommendedCOutSize();
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, int i10) throws IOException {
        this(outputStream, f.f103032a);
        Zstd.setCompressionLevel(this.f103001a, i10);
    }

    private native int compressStream(long j10, byte[] bArr, int i10, byte[] bArr2, int i11);

    private static native long createCStream();

    private native int endStream(long j10, byte[] bArr, int i10);

    private native int flushStream(long j10, byte[] bArr, int i10);

    private static native int freeCStream(long j10);

    private void i(boolean z10) throws IOException {
        int iEndStream;
        if (this.f103007g) {
            return;
        }
        try {
            if (!this.f103010j) {
                long jResetCStream = resetCStream(this.f103001a);
                if (Zstd.isError(jResetCStream)) {
                    throw new p(jResetCStream);
                }
                this.f103009i = false;
            }
            if (!this.f103009i) {
                do {
                    iEndStream = endStream(this.f103001a, this.f103006f, f103000k);
                    long j10 = iEndStream;
                    if (Zstd.isError(j10)) {
                        throw new p(j10);
                    }
                    ((FilterOutputStream) this).out.write(this.f103006f, 0, (int) this.f103003c);
                } while (iEndStream > 0);
            }
            if (z10) {
                ((FilterOutputStream) this).out.close();
            }
            this.f103007g = true;
            this.f103004d.a(this.f103005e);
            freeCStream(this.f103001a);
        } catch (Throwable th2) {
            this.f103007g = true;
            this.f103004d.a(this.f103005e);
            freeCStream(this.f103001a);
            throw th2;
        }
    }

    public static native long recommendedCOutSize();

    private native int resetCStream(long j10);

    public synchronized void a() throws IOException {
        i(false);
    }

    public synchronized ZstdOutputStreamNoFinalizer b(int i10) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionChainLog = Zstd.setCompressionChainLog(this.f103001a, i10);
            if (Zstd.isError(compressionChainLog)) {
                throw new p(compressionChainLog);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer c(boolean z10) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionChecksums = Zstd.setCompressionChecksums(this.f103001a, z10);
            if (Zstd.isError(compressionChecksums)) {
                throw new p(compressionChecksums);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        i(true);
    }

    public synchronized ZstdOutputStreamNoFinalizer d(boolean z10) {
        if (!this.f103009i) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        this.f103008h = z10;
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer e(ZstdDictCompress zstdDictCompress) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long jLoadFastDictCompress = Zstd.loadFastDictCompress(this.f103001a, zstdDictCompress);
            if (Zstd.isError(jLoadFastDictCompress)) {
                throw new p(jLoadFastDictCompress);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer f(byte[] bArr) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long jLoadDictCompress = Zstd.loadDictCompress(this.f103001a, bArr, bArr.length);
            if (Zstd.isError(jLoadDictCompress)) {
                throw new p(jLoadDictCompress);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        int iFlushStream;
        int iEndStream;
        try {
            if (this.f103007g) {
                throw new IOException("StreamClosed");
            }
            if (!this.f103009i) {
                if (this.f103008h) {
                    do {
                        iEndStream = endStream(this.f103001a, this.f103006f, f103000k);
                        long j10 = iEndStream;
                        if (Zstd.isError(j10)) {
                            throw new p(j10);
                        }
                        ((FilterOutputStream) this).out.write(this.f103006f, 0, (int) this.f103003c);
                    } while (iEndStream > 0);
                    this.f103009i = true;
                } else {
                    do {
                        iFlushStream = flushStream(this.f103001a, this.f103006f, f103000k);
                        long j11 = iFlushStream;
                        if (Zstd.isError(j11)) {
                            throw new p(j11);
                        }
                        ((FilterOutputStream) this).out.write(this.f103006f, 0, (int) this.f103003c);
                    } while (iFlushStream > 0);
                }
                ((FilterOutputStream) this).out.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized ZstdOutputStreamNoFinalizer g(int i10) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionHashLog = Zstd.setCompressionHashLog(this.f103001a, i10);
            if (Zstd.isError(compressionHashLog)) {
                throw new p(compressionHashLog);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer h(int i10) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionJobSize = Zstd.setCompressionJobSize(this.f103001a, i10);
            if (Zstd.isError(compressionJobSize)) {
                throw new p(compressionJobSize);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer j(int i10) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionLevel = Zstd.setCompressionLevel(this.f103001a, i10);
            if (Zstd.isError(compressionLevel)) {
                throw new p(compressionLevel);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer l(int i10) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionLong = Zstd.setCompressionLong(this.f103001a, i10);
            if (Zstd.isError(compressionLong)) {
                throw new p(compressionLong);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer m(int i10) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionMinMatch = Zstd.setCompressionMinMatch(this.f103001a, i10);
            if (Zstd.isError(compressionMinMatch)) {
                throw new p(compressionMinMatch);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer o(int i10) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionOverlapLog = Zstd.setCompressionOverlapLog(this.f103001a, i10);
            if (Zstd.isError(compressionOverlapLog)) {
                throw new p(compressionOverlapLog);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer q(int i10) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionSearchLog = Zstd.setCompressionSearchLog(this.f103001a, i10);
            if (Zstd.isError(compressionSearchLog)) {
                throw new p(compressionSearchLog);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer r(int i10) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionStrategy = Zstd.setCompressionStrategy(this.f103001a, i10);
            if (Zstd.isError(compressionStrategy)) {
                throw new p(compressionStrategy);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer t(int i10) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionTargetLength = Zstd.setCompressionTargetLength(this.f103001a, i10);
            if (Zstd.isError(compressionTargetLength)) {
                throw new p(compressionTargetLength);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) throws Throwable {
        Throwable th2;
        ZstdOutputStreamNoFinalizer zstdOutputStreamNoFinalizer;
        try {
            try {
                if (this.f103007g) {
                    throw new IOException("StreamClosed");
                }
                if (this.f103009i) {
                    try {
                        long jResetCStream = resetCStream(this.f103001a);
                        if (Zstd.isError(jResetCStream)) {
                            throw new p(jResetCStream);
                        }
                        this.f103009i = false;
                        this.f103010j = true;
                    } catch (Throwable th3) {
                        th2 = th3;
                        zstdOutputStreamNoFinalizer = this;
                    }
                }
                int i12 = i10 + i11;
                this.f103002b = i10;
                while (this.f103002b < i12) {
                    ZstdOutputStreamNoFinalizer zstdOutputStreamNoFinalizer2 = this;
                    byte[] bArr2 = bArr;
                    long jCompressStream = zstdOutputStreamNoFinalizer2.compressStream(this.f103001a, this.f103006f, f103000k, bArr2, i12);
                    if (Zstd.isError(jCompressStream)) {
                        throw new p(jCompressStream);
                    }
                    long j10 = zstdOutputStreamNoFinalizer2.f103003c;
                    if (j10 > 0) {
                        ((FilterOutputStream) zstdOutputStreamNoFinalizer2).out.write(zstdOutputStreamNoFinalizer2.f103006f, 0, (int) j10);
                    }
                    this = zstdOutputStreamNoFinalizer2;
                    bArr = bArr2;
                }
                return;
            } catch (Throwable th4) {
                th = th4;
                zstdOutputStreamNoFinalizer = this;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th2;
    }

    public synchronized ZstdOutputStreamNoFinalizer x(int i10) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionWindowLog = Zstd.setCompressionWindowLog(this.f103001a, i10);
            if (Zstd.isError(compressionWindowLog)) {
                throw new p(compressionWindowLog);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer y(int i10) throws IOException {
        try {
            if (!this.f103009i) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionWorkers = Zstd.setCompressionWorkers(this.f103001a, i10);
            if (Zstd.isError(compressionWorkers)) {
                throw new p(compressionWorkers);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream) throws IOException {
        this(outputStream, f.f103032a);
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, c cVar, int i10) throws IOException {
        this(outputStream, cVar);
        Zstd.setCompressionLevel(this.f103001a, i10);
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, c cVar) throws IOException {
        super(outputStream);
        this.f103002b = 0L;
        this.f103003c = 0L;
        this.f103007g = false;
        this.f103008h = false;
        this.f103009i = true;
        this.f103010j = false;
        this.f103001a = createCStream();
        this.f103004d = cVar;
        ByteBuffer byteBufferL0 = Zstd.l0(cVar, f103000k);
        this.f103005e = byteBufferL0;
        this.f103006f = byteBufferL0.array();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws Throwable {
        write(new byte[]{(byte) i10}, 0, 1);
    }
}
