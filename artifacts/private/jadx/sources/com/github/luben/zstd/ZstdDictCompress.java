package com.github.luben.zstd;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ZstdDictCompress extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f102968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f102969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f102970f;

    static {
        com.github.luben.zstd.util.a.o();
    }

    public ZstdDictCompress(byte[] bArr, int i10) {
        this(bArr, 0, bArr.length, i10);
    }

    private native void free();

    private native void init(byte[] bArr, int i10, int i11, int i12);

    private native void initDirect(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13);

    @Override // com.github.luben.zstd.a
    void b() {
        if (this.f102968d != 0) {
            free();
            this.f102968d = 0L;
            this.f102969e = null;
        }
    }

    @Override // com.github.luben.zstd.a, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public ByteBuffer e() {
        return this.f102969e;
    }

    int f() {
        return this.f102970f;
    }

    public ZstdDictCompress(byte[] bArr, int i10, int i11, int i12) {
        this.f102968d = 0L;
        this.f102969e = null;
        Zstd.defaultCompressionLevel();
        this.f102970f = i12;
        if (bArr.length - i10 < 0) {
            throw new IllegalArgumentException("Dictionary buffer is to short");
        }
        init(bArr, i10, i11, i12);
        if (0 == this.f102968d) {
            throw new IllegalStateException("ZSTD_createCDict failed");
        }
        d();
    }

    public ZstdDictCompress(ByteBuffer byteBuffer, int i10) {
        this(byteBuffer, i10, false);
    }

    public ZstdDictCompress(ByteBuffer byteBuffer, int i10, boolean z10) {
        this.f102968d = 0L;
        this.f102969e = null;
        Zstd.defaultCompressionLevel();
        this.f102970f = i10;
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dict must be a direct buffer");
        }
        if (iLimit >= 0) {
            initDirect(byteBuffer, byteBuffer.position(), iLimit, i10, z10 ? 1 : 0);
            if (this.f102968d != 0) {
                if (z10) {
                    this.f102969e = byteBuffer;
                }
                d();
                return;
            }
            throw new IllegalStateException("ZSTD_createCDict failed");
        }
        throw new IllegalArgumentException("dict cannot be empty.");
    }
}
