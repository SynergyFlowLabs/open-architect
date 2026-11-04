package com.github.luben.zstd;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ZstdDictDecompress extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f102971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f102972e;

    static {
        com.github.luben.zstd.util.a.o();
    }

    public ZstdDictDecompress(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private native void free();

    private native void init(byte[] bArr, int i10, int i11);

    private native void initDirect(ByteBuffer byteBuffer, int i10, int i11, int i12);

    @Override // com.github.luben.zstd.a
    void b() {
        if (this.f102971d != 0) {
            free();
            this.f102971d = 0L;
            this.f102972e = null;
        }
    }

    @Override // com.github.luben.zstd.a, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public ByteBuffer e() {
        return this.f102972e;
    }

    public ZstdDictDecompress(byte[] bArr, int i10, int i11) {
        this.f102971d = 0L;
        this.f102972e = null;
        init(bArr, i10, i11);
        if (this.f102971d == 0) {
            throw new IllegalStateException("ZSTD_createDDict failed");
        }
        d();
    }

    public ZstdDictDecompress(ByteBuffer byteBuffer) {
        this(byteBuffer, false);
    }

    public ZstdDictDecompress(ByteBuffer byteBuffer, boolean z10) {
        this.f102971d = 0L;
        this.f102972e = null;
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dict must be a direct buffer");
        }
        if (iLimit >= 0) {
            initDirect(byteBuffer, byteBuffer.position(), iLimit, z10 ? 1 : 0);
            if (this.f102971d == 0) {
                throw new IllegalStateException("ZSTD_createDDict failed");
            }
            if (z10) {
                this.f102972e = byteBuffer;
            }
            d();
            return;
        }
        throw new IllegalArgumentException("dict cannot be empty.");
    }
}
