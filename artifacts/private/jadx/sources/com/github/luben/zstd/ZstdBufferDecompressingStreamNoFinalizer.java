package com.github.luben.zstd;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ZstdBufferDecompressingStreamNoFinalizer extends b {
    static {
        com.github.luben.zstd.util.a.o();
    }

    public ZstdBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        super(byteBuffer);
        if (byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Source buffer should be a non-direct buffer");
        }
        long jA = a();
        this.f103014a = jA;
        e(jA);
    }

    private native long createDStreamNative();

    private native long decompressStreamNative(long j10, byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13);

    private native long freeDStreamNative(long j10);

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
        if (!byteBuffer2.hasArray()) {
            throw new IllegalArgumentException("provided source ByteBuffer lacks array");
        }
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("provided destination ByteBuffer lacks array");
        }
        return decompressStreamNative(j10, byteBuffer.array(), i10 + byteBuffer.arrayOffset(), i11, byteBuffer2.array(), i12 + byteBuffer2.arrayOffset(), i13);
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
            throw new IllegalArgumentException("Target buffer should be a non-direct buffer");
        }
        return f(byteBuffer, false);
    }
}
