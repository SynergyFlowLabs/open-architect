package com.github.luben.zstd;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long f103014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f103015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f103016c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f103017d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f103018e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f103019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f103020g;

    b(ByteBuffer byteBuffer) {
        this.f103015b = byteBuffer;
    }

    abstract long a();

    abstract long b(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    abstract long c(long j10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f103016c) {
            return;
        }
        try {
            c(this.f103014a);
            this.f103016c = true;
            this.f103015b = null;
        } catch (Throwable th2) {
            this.f103016c = true;
            this.f103015b = null;
            throw th2;
        }
    }

    public boolean d() {
        return !this.f103018e && (this.f103015b.hasRemaining() || !this.f103017d);
    }

    abstract long e(long j10);

    int f(ByteBuffer byteBuffer, boolean z10) throws IOException {
        if (this.f103016c) {
            throw new IOException("Stream closed");
        }
        if (this.f103018e) {
            return 0;
        }
        long j10 = this.f103014a;
        int iPosition = byteBuffer.position();
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.f103015b;
        long jB = b(j10, byteBuffer, iPosition, iRemaining, byteBuffer2, byteBuffer2.position(), this.f103015b.remaining());
        if (Zstd.isError(jB)) {
            throw new p(jB);
        }
        ByteBuffer byteBuffer3 = this.f103015b;
        byteBuffer3.position(byteBuffer3.position() + this.f103019f);
        byteBuffer.position(byteBuffer.position() + this.f103020g);
        if (!this.f103015b.hasRemaining()) {
            ByteBuffer byteBufferG = g(this.f103015b);
            this.f103015b = byteBufferG;
            if (!z10 && byteBufferG.isDirect()) {
                throw new IllegalArgumentException("Source buffer should be a non-direct buffer");
            }
            if (z10 && !this.f103015b.isDirect()) {
                throw new IllegalArgumentException("Source buffer should be a direct buffer");
            }
        }
        boolean z11 = jB == 0;
        this.f103017d = z11;
        if (z11) {
            this.f103018e = !this.f103015b.hasRemaining();
        }
        return this.f103020g;
    }

    protected ByteBuffer g(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    public b h(ZstdDictDecompress zstdDictDecompress) throws IOException {
        zstdDictDecompress.a();
        try {
            long jLoadFastDictDecompress = Zstd.loadFastDictDecompress(this.f103014a, zstdDictDecompress);
            if (Zstd.isError(jLoadFastDictDecompress)) {
                throw new p(jLoadFastDictDecompress);
            }
            zstdDictDecompress.c();
            return this;
        } catch (Throwable th2) {
            zstdDictDecompress.c();
            throw th2;
        }
    }

    public b j(byte[] bArr) throws IOException {
        long jLoadDictDecompress = Zstd.loadDictDecompress(this.f103014a, bArr, bArr.length);
        if (Zstd.isError(jLoadDictDecompress)) {
            throw new p(jLoadDictDecompress);
        }
        return this;
    }

    public b l(int i10) throws IOException {
        long decompressionLongMax = Zstd.setDecompressionLongMax(this.f103014a, i10);
        if (Zstd.isError(decompressionLongMax)) {
            throw new p(decompressionLongMax);
        }
        return this;
    }

    public abstract int read(ByteBuffer byteBuffer) throws IOException;
}
