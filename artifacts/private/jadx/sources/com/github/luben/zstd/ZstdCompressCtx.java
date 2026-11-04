package com.github.luben.zstd;

import androidx.collection.g3;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class ZstdCompressCtx extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f102962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ZstdDictCompress f102963e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f102964f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f102965g = 0;

    static {
        com.github.luben.zstd.util.a.o();
    }

    public ZstdCompressCtx() {
        this.f102962d = 0L;
        long jInit = init();
        this.f102962d = jInit;
        if (0 == jInit) {
            throw new IllegalStateException("ZSTD_createCompressCtx failed");
        }
        d();
    }

    private static native long compressByteArray0(long j10, byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13);

    private static native long compressDirectByteBuffer0(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13);

    private static native long compressDirectByteBufferStream0(long j10, ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14);

    private static native void free(long j10);

    private static native ZstdFrameProgression getFrameProgression0(long j10);

    private static native long init();

    private native long loadCDict0(long j10, byte[] bArr);

    private native long loadCDictFast0(long j10, ZstdDictCompress zstdDictCompress);

    private void o() {
        if (this.f102962d == 0) {
            throw new IllegalStateException("Compression context is closed");
        }
    }

    private static native long reset0(long j10);

    private static native void setChecksum0(long j10, boolean z10);

    private static native void setContentSize0(long j10, boolean z10);

    private static native void setDictID0(long j10, boolean z10);

    private static native void setLevel0(long j10, int i10);

    private static native long setPledgedSrcSize0(long j10, long j11);

    public ZstdCompressCtx B0(Zstd.b bVar) {
        o();
        a();
        try {
            long validateSequences = Zstd.setValidateSequences(this.f102962d, bVar.k());
            if (Zstd.isError(validateSequences)) {
                throw new o(validateSequences);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx E(int i10) {
        o();
        a();
        try {
            long compressionChainLog = Zstd.setCompressionChainLog(this.f102962d, i10);
            if (Zstd.isError(compressionChainLog)) {
                throw new o(compressionChainLog);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx H(boolean z10) {
        o();
        a();
        setChecksum0(this.f102962d, z10);
        c();
        return this;
    }

    public ZstdCompressCtx H0(int i10) {
        o();
        a();
        try {
            long compressionWindowLog = Zstd.setCompressionWindowLog(this.f102962d, i10);
            if (Zstd.isError(compressionWindowLog)) {
                throw new o(compressionWindowLog);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx I(boolean z10) {
        o();
        a();
        setContentSize0(this.f102962d, z10);
        c();
        return this;
    }

    public ZstdCompressCtx M0(int i10) {
        o();
        a();
        try {
            long compressionWorkers = Zstd.setCompressionWorkers(this.f102962d, i10);
            if (Zstd.isError(compressionWorkers)) {
                throw new o(compressionWorkers);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx N(boolean z10) {
        o();
        a();
        setDictID0(this.f102962d, z10);
        c();
        return this;
    }

    public ZstdCompressCtx R(Zstd.b bVar) {
        o();
        a();
        try {
            long enableLongDistanceMatching = Zstd.setEnableLongDistanceMatching(this.f102962d, bVar.k());
            if (Zstd.isError(enableLongDistanceMatching)) {
                throw new o(enableLongDistanceMatching);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx T(int i10) {
        o();
        a();
        try {
            long compressionHashLog = Zstd.setCompressionHashLog(this.f102962d, i10);
            if (Zstd.isError(compressionHashLog)) {
                throw new o(compressionHashLog);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx X(int i10) {
        o();
        a();
        try {
            long compressionJobSize = Zstd.setCompressionJobSize(this.f102962d, i10);
            if (Zstd.isError(compressionJobSize)) {
                throw new o(compressionJobSize);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx Y(int i10) {
        o();
        a();
        setLevel0(this.f102962d, i10);
        c();
        return this;
    }

    @Override // com.github.luben.zstd.a
    void b() {
        long j10 = this.f102962d;
        if (j10 != 0) {
            free(j10);
            this.f102962d = 0L;
            i iVar = this.f102964f;
            if (iVar != null) {
                iVar.c(this.f102965g);
                this.f102964f = null;
            }
        }
    }

    @Override // com.github.luben.zstd.a, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public ZstdCompressCtx d0(int i10) {
        o();
        a();
        Zstd.setCompressionLong(this.f102962d, i10);
        c();
        return this;
    }

    public int e(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iL = l(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit() - byteBuffer2.position());
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer.position(byteBuffer.position() + iL);
        return iL;
    }

    public int f(byte[] bArr, byte[] bArr2) {
        return j(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public ZstdCompressCtx f0(boolean z10) {
        o();
        a();
        Zstd.setCompressionMagicless(this.f102962d, z10);
        c();
        return this;
    }

    public ByteBuffer g(ByteBuffer byteBuffer) throws o {
        long jCompressBound = Zstd.compressBound(byteBuffer.limit() - byteBuffer.position());
        if (jCompressBound > g3.f12256c) {
            throw new o(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
        }
        int i10 = (int) jCompressBound;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10);
        int iL = l(byteBufferAllocateDirect, 0, i10, byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
        byteBuffer.position(byteBuffer.limit());
        byteBufferAllocateDirect.limit(iL);
        return byteBufferAllocateDirect;
    }

    public ZstdCompressCtx g0(int i10) {
        o();
        a();
        try {
            long compressionMinMatch = Zstd.setCompressionMinMatch(this.f102962d, i10);
            if (Zstd.isError(compressionMinMatch)) {
                throw new o(compressionMinMatch);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public byte[] h(byte[] bArr) {
        long jCompressBound = Zstd.compressBound(bArr.length);
        if (jCompressBound > g3.f12256c) {
            throw new o(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
        }
        int i10 = (int) jCompressBound;
        byte[] bArr2 = new byte[i10];
        int i11 = 3 ^ 0;
        return Arrays.copyOfRange(bArr2, 0, j(bArr2, 0, i10, bArr, 0, bArr.length));
    }

    public int j(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        g.a(i12, i13, bArr2.length);
        g.a(i10, i11, bArr.length);
        o();
        a();
        try {
            long jCompressByteArray0 = compressByteArray0(this.f102962d, bArr, i10, i11, bArr2, i12, i13);
            if (Zstd.isError(jCompressByteArray0)) {
                throw new o(jCompressByteArray0);
            }
            if (jCompressByteArray0 > g3.f12256c) {
                throw new o(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) jCompressByteArray0;
            c();
            return i14;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx j0(int i10) {
        o();
        a();
        try {
            long compressionOverlapLog = Zstd.setCompressionOverlapLog(this.f102962d, i10);
            if (Zstd.isError(compressionOverlapLog)) {
                throw new o(compressionOverlapLog);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public void k0(long j10) {
        o();
        a();
        try {
            long pledgedSrcSize0 = setPledgedSrcSize0(this.f102962d, j10);
            if (Zstd.isError(pledgedSrcSize0)) {
                throw new o(pledgedSrcSize0);
            }
            c();
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public int l(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
        o();
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
            long jCompressDirectByteBuffer0 = compressDirectByteBuffer0(this.f102962d, byteBuffer, i10, i11, byteBuffer2, i12, i13);
            if (Zstd.isError(jCompressDirectByteBuffer0)) {
                throw new o(jCompressDirectByteBuffer0);
            }
            if (jCompressDirectByteBuffer0 > g3.f12256c) {
                throw new o(Zstd.errGeneric(), "Output size is greater than MAX_INT");
            }
            int i14 = (int) jCompressDirectByteBuffer0;
            c();
            return i14;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public boolean m(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, e eVar) {
        o();
        a();
        try {
            long jCompressDirectByteBufferStream0 = compressDirectByteBufferStream0(this.f102962d, byteBuffer, byteBuffer.position(), byteBuffer.limit(), byteBuffer2, byteBuffer2.position(), byteBuffer2.limit(), eVar.k());
            if ((2147483648L & jCompressDirectByteBufferStream0) != 0) {
                long j10 = jCompressDirectByteBufferStream0 & 255;
                throw new o(j10, Zstd.getErrorName(j10));
            }
            byteBuffer2.position((int) (g3.f12256c & jCompressDirectByteBufferStream0));
            byteBuffer.position(((int) (jCompressDirectByteBufferStream0 >>> 32)) & Integer.MAX_VALUE);
            boolean z10 = (jCompressDirectByteBufferStream0 >>> 63) == 1;
            c();
            return z10;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx o0(Zstd.b bVar) {
        o();
        a();
        try {
            long searchForExternalRepcodes = Zstd.setSearchForExternalRepcodes(this.f102962d, bVar.k());
            if (Zstd.isError(searchForExternalRepcodes)) {
                throw new o(searchForExternalRepcodes);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdFrameProgression q() {
        o();
        a();
        try {
            return getFrameProgression0(this.f102962d);
        } finally {
            c();
        }
    }

    long r() {
        return this.f102962d;
    }

    public ZstdCompressCtx r0(int i10) {
        o();
        a();
        try {
            long compressionSearchLog = Zstd.setCompressionSearchLog(this.f102962d, i10);
            if (Zstd.isError(compressionSearchLog)) {
                throw new o(compressionSearchLog);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public void reset() {
        o();
        a();
        try {
            long jReset0 = reset0(this.f102962d);
            if (Zstd.isError(jReset0)) {
                throw new o(jReset0);
            }
            c();
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx t(ZstdDictCompress zstdDictCompress) {
        o();
        a();
        zstdDictCompress.a();
        try {
            long jLoadCDictFast0 = loadCDictFast0(this.f102962d, zstdDictCompress);
            if (Zstd.isError(jLoadCDictFast0)) {
                throw new o(jLoadCDictFast0);
            }
            this.f102963e = zstdDictCompress;
            zstdDictCompress.c();
            c();
            return this;
        } catch (Throwable th2) {
            zstdDictCompress.c();
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx w0(boolean z10) {
        o();
        a();
        try {
            long sequenceProducerFallback = Zstd.setSequenceProducerFallback(this.f102962d, z10);
            if (Zstd.isError(sequenceProducerFallback)) {
                throw new o(sequenceProducerFallback);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx x(byte[] bArr) {
        o();
        a();
        try {
            long jLoadCDict0 = loadCDict0(this.f102962d, bArr);
            if (Zstd.isError(jLoadCDict0)) {
                throw new o(jLoadCDict0);
            }
            this.f102963e = null;
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx x0(int i10) {
        o();
        a();
        try {
            long compressionStrategy = Zstd.setCompressionStrategy(this.f102962d, i10);
            if (Zstd.isError(compressionStrategy)) {
                throw new o(compressionStrategy);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx y(i iVar) {
        o();
        a();
        try {
            try {
                i iVar2 = this.f102964f;
                if (iVar2 != null) {
                    iVar2.c(this.f102965g);
                    this.f102964f = null;
                }
                if (iVar == null) {
                    Zstd.registerSequenceProducer(this.f102962d, 0L, 0L);
                } else {
                    long jB = iVar.b();
                    this.f102965g = jB;
                    Zstd.registerSequenceProducer(this.f102962d, jB, iVar.a());
                    this.f102964f = iVar;
                }
                c();
                return this;
            } catch (Exception e10) {
                this.f102964f = null;
                Zstd.registerSequenceProducer(this.f102962d, 0L, 0L);
                throw e10;
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public ZstdCompressCtx y0(int i10) {
        o();
        a();
        try {
            long compressionTargetLength = Zstd.setCompressionTargetLength(this.f102962d, i10);
            if (Zstd.isError(compressionTargetLength)) {
                throw new o(compressionTargetLength);
            }
            c();
            return this;
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }
}
