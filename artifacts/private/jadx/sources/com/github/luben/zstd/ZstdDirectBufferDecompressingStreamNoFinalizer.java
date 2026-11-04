package com.github.luben.zstd;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ZstdDirectBufferDecompressingStreamNoFinalizer extends b {
    static {
        com.github.luben.zstd.util.a.o();
    }

    public ZstdDirectBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        super(byteBuffer);
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Source buffer should be a direct buffer");
        }
        this.f103015b = byteBuffer;
        long jA = a();
        this.f103014a = jA;
        e(jA);
    }

    private static native long createDStreamNative();

    private native long decompressStreamNative(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    private static native long freeDStreamNative(long j10);

    private native long initDStreamNative(long j10);

    public static int m() {
        return (int) recommendedDOutSizeNative();
    }

    private static native long recommendedDOutSizeNative();

    @Override // com.github.luben.zstd.b
    long a() {
        return createDStreamNative();
    }

    @Override // com.github.luben.zstd.b
    long b(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
        return decompressStreamNative(j10, byteBuffer, i10, i11, byteBuffer2, i12, i13);
    }

    @Override // com.github.luben.zstd.b
    long c(long j10) {
        return freeDStreamNative(j10);
    }

    @Override // com.github.luben.zstd.b
    long e(long j10) {
        return initDStreamNative(j10);
    }

    @Override // com.github.luben.zstd.b
    public int read(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.isDirect()) {
            return f(byteBuffer, true);
        }
        throw new IllegalArgumentException("Target buffer should be a direct buffer");
    }
}
