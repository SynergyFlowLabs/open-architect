package com.github.luben.zstd;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ZstdInputStreamNoFinalizer extends FilterInputStream {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f102988l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f102989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f102990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f102991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f102992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f102993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f102994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ByteBuffer f102995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f102996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f102997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f102998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f102999k;

    static {
        com.github.luben.zstd.util.a.o();
        f102988l = (int) recommendedDInSize();
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream) throws IOException {
        this(inputStream, f.f103032a);
    }

    private static native long createDStream();

    private native int decompressStream(long j10, byte[] bArr, int i10, byte[] bArr2, int i11);

    private static native int freeDStream(long j10);

    private native int initDStream(long j10);

    public static native long recommendedDInSize();

    public static native long recommendedDOutSize();

    public synchronized boolean a() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f102997i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        try {
            if (this.f102999k) {
                throw new IOException("Stream closed");
            }
            if (!this.f102993e) {
                return 1;
            }
            return ((FilterInputStream) this).in.available();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    int b(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f102999k) {
            throw new IOException("Stream closed");
        }
        if (i10 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException("Requested length " + i11 + " from offset " + i10 + " in buffer of size " + bArr.length);
        }
        int i12 = i10 + i11;
        long j10 = i10;
        this.f102990b = j10;
        long j11 = -1;
        while (true) {
            long j12 = this.f102990b;
            long j13 = i12;
            if (j12 >= j13 || j11 >= j12) {
                return (int) (j12 - j10);
            }
            boolean z10 = false;
            if (this.f102993e && (((FilterInputStream) this).in.available() > 0 || this.f102990b == j10)) {
                long j14 = ((FilterInputStream) this).in.read(this.f102996h, 0, f102988l);
                this.f102992d = j14;
                this.f102991c = 0L;
                if (j14 < 0) {
                    this.f102992d = 0L;
                    if (this.f102998j) {
                        return -1;
                    }
                    if (!this.f102997i) {
                        throw new p(Zstd.errCorruptionDetected(), "Truncated source");
                    }
                    long j15 = (int) (this.f102990b - j10);
                    this.f102992d = j15;
                    if (j15 > 0) {
                        return (int) j15;
                    }
                    return -1;
                }
                this.f102998j = false;
            }
            long j16 = this.f102990b;
            int iDecompressStream = decompressStream(this.f102989a, bArr, i12, this.f102996h, (int) this.f102992d);
            long j17 = iDecompressStream;
            if (Zstd.isError(j17)) {
                throw new p(j17);
            }
            if (iDecompressStream == 0) {
                this.f102998j = true;
                this.f102993e = this.f102991c == this.f102992d;
                return (int) (this.f102990b - j10);
            }
            if (this.f102990b < j13) {
                z10 = true;
            }
            this.f102993e = z10;
            j11 = j16;
        }
    }

    public synchronized ZstdInputStreamNoFinalizer c(boolean z10) {
        try {
            this.f102997i = z10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f102999k) {
            return;
        }
        this.f102999k = true;
        this.f102994f.a(this.f102995g);
        freeDStream(this.f102989a);
        ((FilterInputStream) this).in.close();
    }

    public synchronized ZstdInputStreamNoFinalizer d(ZstdDictDecompress zstdDictDecompress) throws IOException {
        try {
            zstdDictDecompress.a();
            try {
                long jLoadFastDictDecompress = Zstd.loadFastDictDecompress(this.f102989a, zstdDictDecompress);
                if (Zstd.isError(jLoadFastDictDecompress)) {
                    throw new p(jLoadFastDictDecompress);
                }
                zstdDictDecompress.c();
            } catch (Throwable th2) {
                zstdDictDecompress.c();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer e(byte[] bArr) throws IOException {
        long jLoadDictDecompress = Zstd.loadDictDecompress(this.f102989a, bArr, bArr.length);
        if (Zstd.isError(jLoadDictDecompress)) {
            throw new p(jLoadDictDecompress);
        }
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer f(int i10) throws IOException {
        try {
            long decompressionLongMax = Zstd.setDecompressionLongMax(this.f102989a, i10);
            if (Zstd.isError(decompressionLongMax)) {
                throw new p(decompressionLongMax);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer g(boolean z10) throws IOException {
        try {
            long refMultipleDDicts = Zstd.setRefMultipleDDicts(this.f102989a, z10);
            if (Zstd.isError(refMultipleDDicts)) {
                throw new p(refMultipleDDicts);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i10 >= 0) {
            if (i11 <= bArr.length - i10) {
                int iB = 0;
                if (i11 == 0) {
                    return 0;
                }
                while (iB == 0) {
                    iB = b(bArr, i10, i11);
                }
                return iB;
            }
        }
        throw new IndexOutOfBoundsException("Requested length " + i11 + " from offset " + i10 + " in buffer of size " + bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        int i10;
        try {
            if (this.f102999k) {
                throw new IOException("Stream closed");
            }
            if (j10 <= 0) {
                return 0L;
            }
            int iRecommendedDOutSize = (int) recommendedDOutSize();
            if (iRecommendedDOutSize > j10) {
                iRecommendedDOutSize = (int) j10;
            }
            ByteBuffer byteBufferL0 = Zstd.l0(this.f102994f, iRecommendedDOutSize);
            try {
                byte[] bArrArray = byteBufferL0.array();
                long j11 = j10;
                while (j11 > 0 && (i10 = read(bArrArray, 0, (int) Math.min(iRecommendedDOutSize, j11))) >= 0) {
                    j11 -= (long) i10;
                }
                this.f102994f.a(byteBufferL0);
                return j10 - j11;
            } catch (Throwable th2) {
                this.f102994f.a(byteBufferL0);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public ZstdInputStreamNoFinalizer(InputStream inputStream, c cVar) throws IOException {
        super(inputStream);
        this.f102990b = 0L;
        this.f102991c = 0L;
        this.f102992d = 0L;
        this.f102993e = true;
        this.f102997i = false;
        this.f102998j = true;
        this.f102999k = false;
        this.f102994f = cVar;
        ByteBuffer byteBufferL0 = Zstd.l0(cVar, f102988l);
        this.f102995g = byteBufferL0;
        this.f102996h = byteBufferL0.array();
        synchronized (this) {
            long jCreateDStream = createDStream();
            this.f102989a = jCreateDStream;
            initDStream(jCreateDStream);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        try {
            byte[] bArr = new byte[1];
            int iB = 0;
            while (iB == 0) {
                iB = b(bArr, 0, 1);
            }
            if (iB != 1) {
                return -1;
            }
            return bArr[0] & 255;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
