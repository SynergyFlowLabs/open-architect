package com.github.luben.zstd;

import androidx.collection.g3;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class ZstdDecompressCtx extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f102966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ZstdDictDecompress f102967e = null;

    static {
        com.github.luben.zstd.util.a.o();
    }

    public ZstdDecompressCtx() {
        this.f102966d = 0L;
        long jInit = init();
        this.f102966d = jInit;
        if (0 == jInit) {
            throw new IllegalStateException("ZSTD_createDeCompressCtx failed");
        }
        d();
    }

    private static native long decompressByteArray0(long j10, byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13);

    private static native long decompressByteArrayToDirectByteBuffer0(long j10, ByteBuffer byteBuffer, int i10, int i11, byte[] bArr, int i12, int i13);

    private static native long decompressDirectByteBuffer0(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    private static native long decompressDirectByteBufferStream0(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    private static native long decompressDirectByteBufferToByteArray0(long j10, byte[] bArr, int i10, int i11, ByteBuffer byteBuffer, int i12, int i13);

    private static native void free(long j10);

    private static native long init();

    private static native long loadDDict0(long j10, byte[] bArr);

    private static native long loadDDictFast0(long j10, ZstdDictDecompress zstdDictDecompress);

    private static native long reset0(long j10);

    private void y() {
        if (this.f102966d == 0) {
            throw new IllegalStateException("Decompression context is closed");
        }
    }

    public ZstdDecompressCtx E(ZstdDictDecompress zstdDictDecompress) {
        y();
        a();
        zstdDictDecompress.a();
        try {
            long jLoadDDictFast0 = loadDDictFast0(this.f102966d, zstdDictDecompress);
            if (Zstd.isError(jLoadDDictFast0)) {
                throw new o(jLoadDDictFast0);
            }
            this.f102967e = zstdDictDecompress;
            zstdDictDecompress.c();
            c();
            return this;
        } catch (Throwable th2) {
            zstdDictDecompress.c();
            c();
            throw th2;
        }
    }

    public ZstdDecompressCtx H(byte[] bArr) {
        y();
        a();
        try {
            long jLoadDDict0 = loadDDict0(this.f102966d, bArr);
            if (Zstd.isError(jLoadDDict0)) {
                throw new o(jLoadDDict0);
            }
            this.f102967e = null;
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdDecompressCtx I(boolean z10) {
        y();
        a();
        Zstd.setDecompressionMagicless(this.f102966d, z10);
        c();
        return this;
    }

    @Override // com.github.luben.zstd.a
    void b() {
        long j10 = this.f102966d;
        if (j10 != 0) {
            free(j10);
            this.f102966d = 0L;
        }
    }

    @Override // com.github.luben.zstd.a, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public int e(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws o {
        int iR = r(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position());
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer.position(byteBuffer.position() + iR);
        return iR;
    }

    public int f(ByteBuffer byteBuffer, byte[] bArr) throws o {
        int iQ = q(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), bArr, 0, bArr.length);
        byteBuffer.position(byteBuffer.position() + iQ);
        return iQ;
    }

    public int g(byte[] bArr, ByteBuffer byteBuffer) throws o {
        int iX = x(bArr, 0, bArr.length, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
        byteBuffer.position(byteBuffer.limit());
        return iX;
    }

    public int h(byte[] bArr, byte[] bArr2) {
        return o(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public ByteBuffer j(ByteBuffer byteBuffer, int i10) throws o {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10);
        r(byteBufferAllocateDirect, 0, i10, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
        byteBuffer.position(byteBuffer.limit());
        return byteBufferAllocateDirect;
    }

    public byte[] l(byte[] bArr, int i10) throws o {
        return m(bArr, 0, bArr.length, i10);
    }

    public byte[] m(byte[] bArr, int i10, int i11, int i12) throws o {
        if (i12 < 0) {
            throw new o(Zstd.errGeneric(), "Original size should not be negative");
        }
        byte[] bArr2 = new byte[i12];
        int iO = o(bArr2, 0, i12, bArr, i10, i11);
        if (iO == i12) {
            return bArr2;
        }
        int i13 = 2 ^ 0;
        return Arrays.copyOfRange(bArr2, 0, iO);
    }

    public int o(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        g.a(i12, i13, bArr2.length);
        g.a(i10, i11, bArr.length);
        y();
        a();
        try {
            long jDecompressByteArray0 = decompressByteArray0(this.f102966d, bArr, i10, i11, bArr2, i12, i13);
            if (Zstd.isError(jDecompressByteArray0)) {
                throw new o(jDecompressByteArray0);
            }
            if (jDecompressByteArray0 > g3.f12256c) {
                throw new o(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) jDecompressByteArray0;
            c();
            return i14;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public int q(ByteBuffer byteBuffer, int i10, int i11, byte[] bArr, int i12, int i13) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dstBuff must be a direct buffer");
        }
        g.a(i12, i13, bArr.length);
        g.a(i10, i11, byteBuffer.limit());
        y();
        a();
        try {
            long jDecompressByteArrayToDirectByteBuffer0 = decompressByteArrayToDirectByteBuffer0(this.f102966d, byteBuffer, i10, i11, bArr, i12, i13);
            if (Zstd.isError(jDecompressByteArrayToDirectByteBuffer0)) {
                throw new o(jDecompressByteArrayToDirectByteBuffer0);
            }
            if (jDecompressByteArrayToDirectByteBuffer0 > g3.f12256c) {
                throw new o(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) jDecompressByteArrayToDirectByteBuffer0;
            c();
            return i14;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public int r(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
        y();
        if (!byteBuffer2.isDirect()) {
            throw new IllegalArgumentException("srcBuff must be a direct buffer");
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dstBuff must be a direct buffer");
        }
        g.a(i12, i13, byteBuffer2.limit());
        g.a(i10, i11, byteBuffer.limit());
        a();
        try {
            long jDecompressDirectByteBuffer0 = decompressDirectByteBuffer0(this.f102966d, byteBuffer, i10, i11, byteBuffer2, i12, i13);
            if (Zstd.isError(jDecompressDirectByteBuffer0)) {
                throw new o(jDecompressDirectByteBuffer0);
            }
            if (jDecompressDirectByteBuffer0 > g3.f12256c) {
                throw new o(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) jDecompressDirectByteBuffer0;
            c();
            return i14;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public void reset() {
        y();
        a();
        try {
            long jReset0 = reset0(this.f102966d);
            if (Zstd.isError(jReset0)) {
                throw new o(jReset0);
            }
            c();
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public boolean t(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        y();
        a();
        try {
            long jDecompressDirectByteBufferStream0 = decompressDirectByteBufferStream0(this.f102966d, byteBuffer, byteBuffer.position(), byteBuffer.limit(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit());
            if ((2147483648L & jDecompressDirectByteBufferStream0) != 0) {
                long j10 = jDecompressDirectByteBufferStream0 & 255;
                throw new o(j10, Zstd.getErrorName(j10));
            }
            byteBuffer2.position((int) (g3.f12256c & jDecompressDirectByteBufferStream0));
            byteBuffer.position(((int) (jDecompressDirectByteBufferStream0 >>> 32)) & Integer.MAX_VALUE);
            boolean z10 = (jDecompressDirectByteBufferStream0 >>> 63) == 1;
            c();
            return z10;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public int x(byte[] bArr, int i10, int i11, ByteBuffer byteBuffer, int i12, int i13) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("srcBuff must be a direct buffer");
        }
        g.a(i12, i13, byteBuffer.limit());
        g.a(i10, i11, bArr.length);
        y();
        a();
        try {
            long jDecompressDirectByteBufferToByteArray0 = decompressDirectByteBufferToByteArray0(this.f102966d, bArr, i10, i11, byteBuffer, i12, i13);
            if (Zstd.isError(jDecompressDirectByteBufferToByteArray0)) {
                throw new o(jDecompressDirectByteBufferToByteArray0);
            }
            if (jDecompressDirectByteBufferToByteArray0 > g3.f12256c) {
                throw new o(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) jDecompressDirectByteBufferToByteArray0;
            c();
            return i14;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }
}
