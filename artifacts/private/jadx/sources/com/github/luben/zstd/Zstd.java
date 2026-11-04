package com.github.luben.zstd;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Zstd {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f102955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f102956b;

        a(byte[] bArr, int i10) {
            long jJ0 = Zstd.j0(bArr, i10);
            this.f102956b = jJ0;
            this.f102955a = Zstd.r0(bArr, i10, (int) jJ0);
        }
    }

    public enum b {
        AUTO(0),
        ENABLE(1),
        DISABLE(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f102961a;

        b(int i10) {
            this.f102961a = i10;
        }

        public int k() {
            return this.f102961a;
        }
    }

    static {
        com.github.luben.zstd.util.a.o();
    }

    public static long A(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.Y(i12);
            zstdCompressCtx.x(bArr3);
            long j10 = zstdCompressCtx.j(bArr, i10, bArr.length - i10, bArr2, i11, bArr2.length - i11);
            zstdCompressCtx.close();
            return j10;
        } catch (Throwable th2) {
            zstdCompressCtx.close();
            throw th2;
        }
    }

    @Deprecated
    public static long B(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        return z(bArr, 0, bArr2, 0, bArr2.length, bArr3, i10);
    }

    public static byte[] C(byte[] bArr, byte[] bArr2, int i10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.x(bArr2);
            zstdCompressCtx.Y(i10);
            byte[] bArrH = zstdCompressCtx.h(bArr);
            zstdCompressCtx.close();
            return bArrH;
        } catch (Throwable th2) {
            zstdCompressCtx.close();
            throw th2;
        }
    }

    public static int D(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            int iE = zstdDecompressCtx.e(byteBuffer, byteBuffer2);
            zstdDecompressCtx.close();
            return iE;
        } catch (Throwable th2) {
            zstdDecompressCtx.close();
            throw th2;
        }
    }

    public static int E(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ZstdDictDecompress zstdDictDecompress) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.E(zstdDictDecompress);
            int iE = zstdDecompressCtx.e(byteBuffer, byteBuffer2);
            zstdDecompressCtx.close();
            return iE;
        } catch (Throwable th2) {
            zstdDecompressCtx.close();
            throw th2;
        }
    }

    public static int F(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.H(bArr);
            return zstdDecompressCtx.e(byteBuffer, byteBuffer2);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static int G(ByteBuffer byteBuffer, byte[] bArr) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.f(byteBuffer, bArr);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static int H(byte[] bArr, ByteBuffer byteBuffer) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.g(bArr, byteBuffer);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long I(byte[] bArr, byte[] bArr2) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            long jH = zstdDecompressCtx.h(bArr, bArr2);
            zstdDecompressCtx.close();
            return jH;
        } catch (Throwable th2) {
            zstdDecompressCtx.close();
            throw th2;
        }
    }

    public static long J(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return Z(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    public static ByteBuffer K(ByteBuffer byteBuffer, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.j(byteBuffer, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static ByteBuffer L(ByteBuffer byteBuffer, ZstdDictDecompress zstdDictDecompress, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.E(zstdDictDecompress);
            return zstdDecompressCtx.j(byteBuffer, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static ByteBuffer M(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.H(bArr);
            return zstdDecompressCtx.j(byteBuffer, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static byte[] N(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[a(bArr, arrayList)];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < arrayList.size()) {
            a aVar = (a) arrayList.get(i10);
            byte[] bArr3 = bArr;
            long jR = R(bArr2, i11, (int) aVar.f102955a, bArr3, i12, (int) aVar.f102956b);
            if (isError(jR)) {
                throw new o(jR, String.format("error %s while decompressing %d frame", getErrorName(jR), Integer.valueOf(i10)));
            }
            long j10 = aVar.f102955a;
            if (jR != j10) {
                throw new IllegalStateException("decompressed size mismatch");
            }
            i12 += (int) aVar.f102956b;
            i11 += (int) j10;
            i10++;
            bArr = bArr3;
        }
        return bArr2;
    }

    public static byte[] O(byte[] bArr, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.l(bArr, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static byte[] P(byte[] bArr, ZstdDictDecompress zstdDictDecompress, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.E(zstdDictDecompress);
            return zstdDecompressCtx.l(bArr, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static byte[] Q(byte[] bArr, byte[] bArr2, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.H(bArr2);
            byte[] bArrL = zstdDecompressCtx.l(bArr, i10);
            zstdDecompressCtx.close();
            return bArrL;
        } catch (Throwable th2) {
            zstdDecompressCtx.close();
            throw th2;
        }
    }

    public static long R(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.o(bArr, i10, i11, bArr2, i12, i13);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long S(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.r(byteBuffer, i10, i11, byteBuffer2, i12, i13);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long T(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, ZstdDictDecompress zstdDictDecompress) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.E(zstdDictDecompress);
            return zstdDecompressCtx.r(byteBuffer, i10, i11, byteBuffer2, i12, i13);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long U(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, byte[] bArr) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.H(bArr);
            return zstdDecompressCtx.r(byteBuffer, i10, i11, byteBuffer2, i12, i13);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long V(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, ZstdDictDecompress zstdDictDecompress) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.E(zstdDictDecompress);
            return zstdDecompressCtx.o(bArr, i10, bArr.length - i10, bArr2, i11, i12);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static byte[] W(byte[] bArr) {
        return X(bArr, 0);
    }

    public static byte[] X(byte[] bArr, int i10) {
        int iJ0 = (int) j0(bArr, i10);
        return Y(bArr, i10, iJ0, (int) r0(bArr, i10, iJ0));
    }

    public static byte[] Y(byte[] bArr, int i10, int i11, int i12) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            byte[] bArrM = zstdDecompressCtx.m(bArr, i10, i11, i12);
            zstdDecompressCtx.close();
            return bArrM;
        } catch (Throwable th2) {
            zstdDecompressCtx.close();
            throw th2;
        }
    }

    public static long Z(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, byte[] bArr3) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.H(bArr3);
            return zstdDecompressCtx.o(bArr, i10, bArr.length - i10, bArr2, i11, i12);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    private static int a(byte[] bArr, List<a> list) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            a aVar = new a(bArr, i10);
            list.add(aVar);
            i10 += (int) aVar.f102956b;
            i11 += (int) aVar.f102955a;
        }
        return i11;
    }

    @Deprecated
    public static long a0(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return Z(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    public static int b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return c(byteBuffer, byteBuffer2, defaultCompressionLevel());
    }

    @Deprecated
    public static long b0(ByteBuffer byteBuffer, int i10, int i11) {
        return decompressedDirectByteBufferSize(byteBuffer, i10, i11, false);
    }

    public static native int blockSizeMax();

    public static int c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10) {
        return d(byteBuffer, byteBuffer2, i10, false);
    }

    @Deprecated
    public static long c0(ByteBuffer byteBuffer) {
        return b0(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    public static native int chainLogMax();

    public static native int chainLogMin();

    public static native long compressBound(long j10);

    public static native long compressUnsafe(long j10, long j11, long j12, long j13, int i10, boolean z10);

    public static int d(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, boolean z10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.Y(i10);
            zstdCompressCtx.H(z10);
            int iE = zstdCompressCtx.e(byteBuffer, byteBuffer2);
            zstdCompressCtx.close();
            return iE;
        } catch (Throwable th2) {
            zstdCompressCtx.close();
            throw th2;
        }
    }

    @Deprecated
    public static long d0(byte[] bArr) {
        return e0(bArr, 0);
    }

    public static native long decompressUnsafe(long j10, long j11, long j12, long j13);

    @Deprecated
    public static native long decompressedDirectByteBufferSize(ByteBuffer byteBuffer, int i10, int i11, boolean z10);

    private static native long decompressedSize0(byte[] bArr, int i10, int i11, boolean z10);

    public static native int defaultCompressionLevel();

    public static int e(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.t(zstdDictCompress);
            zstdCompressCtx.Y(zstdDictCompress.f());
            return zstdCompressCtx.e(byteBuffer, byteBuffer2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    @Deprecated
    public static long e0(byte[] bArr, int i10) {
        return f0(bArr, i10, bArr.length - i10);
    }

    public static native long errChecksumWrong();

    public static native long errCorruptionDetected();

    public static native long errDictionaryCorrupted();

    public static native long errDictionaryCreationFailed();

    public static native long errDictionaryWrong();

    public static native long errDstBufferNull();

    public static native long errDstSizeTooSmall();

    public static native long errFrameParameterUnsupported();

    public static native long errFrameParameterWindowTooLarge();

    public static native long errGeneric();

    public static native long errInitMissing();

    public static native long errMaxSymbolValueTooLarge();

    public static native long errMaxSymbolValueTooSmall();

    public static native long errMemoryAllocation();

    public static native long errNoError();

    public static native long errParameterOutOfBound();

    public static native long errParameterUnsupported();

    public static native long errPrefixUnknown();

    public static native long errSrcSizeWrong();

    public static native long errStageWrong();

    public static native long errTableLogTooLarge();

    public static native long errVersionUnsupported();

    public static native long errWorkSpaceTooSmall();

    public static int f(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr, int i10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.x(bArr);
            zstdCompressCtx.Y(i10);
            return zstdCompressCtx.e(byteBuffer, byteBuffer2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    @Deprecated
    public static long f0(byte[] bArr, int i10, int i11) {
        return g0(bArr, i10, i11, false);
    }

    public static native long findDirectByteBufferFrameCompressedSize(ByteBuffer byteBuffer, int i10, int i11);

    private static native long findFrameCompressedSize0(byte[] bArr, int i10, int i11);

    public static long g(byte[] bArr, byte[] bArr2, int i10) {
        return h(bArr, bArr2, i10, false);
    }

    @Deprecated
    public static long g0(byte[] bArr, int i10, int i11, boolean z10) {
        if (i10 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i10);
        }
        int i12 = i10 + i11;
        if (i12 <= bArr.length) {
            return decompressedSize0(bArr, i10, i11, z10);
        }
        throw new ArrayIndexOutOfBoundsException(i12);
    }

    static native void generateSequences(long j10, long j11, long j12, long j13, long j14);

    static native long getBuiltinSequenceProducer();

    public static native long getDictIdFromDict(byte[] bArr);

    private static native long getDictIdFromDictDirect(ByteBuffer byteBuffer, int i10, int i11);

    public static native long getDictIdFromFrame(byte[] bArr);

    public static native long getDictIdFromFrameBuffer(ByteBuffer byteBuffer);

    public static native long getDirectByteBufferFrameContentSize(ByteBuffer byteBuffer, int i10, int i11, boolean z10);

    public static native long getErrorCode(long j10);

    public static native String getErrorName(long j10);

    private static native long getFrameContentSize0(byte[] bArr, int i10, int i11, boolean z10);

    static native long getStubSequenceProducer();

    public static long h(byte[] bArr, byte[] bArr2, int i10, boolean z10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.Y(i10);
            zstdCompressCtx.H(z10);
            long jF = zstdCompressCtx.f(bArr, bArr2);
            zstdCompressCtx.close();
            return jF;
        } catch (Throwable th2) {
            zstdCompressCtx.close();
            throw th2;
        }
    }

    public static long h0(ByteBuffer byteBuffer) {
        return findDirectByteBufferFrameCompressedSize(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    public static native int hashLogMax();

    public static native int hashLogMin();

    public static long i(byte[] bArr, byte[] bArr2, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.t(zstdDictCompress);
            zstdCompressCtx.Y(zstdDictCompress.f());
            long jF = zstdCompressCtx.f(bArr, bArr2);
            zstdCompressCtx.close();
            return jF;
        } catch (Throwable th2) {
            zstdCompressCtx.close();
            throw th2;
        }
    }

    public static long i0(byte[] bArr) {
        return j0(bArr, 0);
    }

    public static native boolean isError(long j10);

    public static long j(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        return z(bArr, 0, bArr2, 0, bArr2.length, bArr3, i10);
    }

    public static long j0(byte[] bArr, int i10) {
        return k0(bArr, i10, bArr.length - i10);
    }

    public static ByteBuffer k(ByteBuffer byteBuffer, int i10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.Y(i10);
            ByteBuffer byteBufferG = zstdCompressCtx.g(byteBuffer);
            zstdCompressCtx.close();
            return byteBufferG;
        } catch (Throwable th2) {
            zstdCompressCtx.close();
            throw th2;
        }
    }

    public static long k0(byte[] bArr, int i10, int i11) {
        if (i10 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i10);
        }
        int i12 = i10 + i11;
        if (i12 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i12);
        }
        long jFindFrameCompressedSize0 = findFrameCompressedSize0(bArr, i10, i11);
        if (isError(jFindFrameCompressedSize0)) {
            throw new o(jFindFrameCompressedSize0);
        }
        return jFindFrameCompressedSize0;
    }

    public static ByteBuffer l(ByteBuffer byteBuffer, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.t(zstdDictCompress);
            zstdCompressCtx.Y(zstdDictCompress.f());
            ByteBuffer byteBufferG = zstdCompressCtx.g(byteBuffer);
            zstdCompressCtx.close();
            return byteBufferG;
        } catch (Throwable th2) {
            zstdCompressCtx.close();
            throw th2;
        }
    }

    static ByteBuffer l0(c cVar, int i10) throws p {
        ByteBuffer byteBuffer = cVar.get(i10);
        if (byteBuffer != null) {
            if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
                return byteBuffer;
            }
            cVar.a(byteBuffer);
            throw new IllegalArgumentException("provided ByteBuffer lacks array or has non-zero arrayOffset");
        }
        throw new p(errMemoryAllocation(), "Cannot get ByteBuffer of size " + i10 + " from the BufferPool");
    }

    public static native int loadDictCompress(long j10, byte[] bArr, int i10);

    public static native int loadDictDecompress(long j10, byte[] bArr, int i10);

    public static native int loadFastDictCompress(long j10, ZstdDictCompress zstdDictCompress);

    public static native int loadFastDictDecompress(long j10, ZstdDictDecompress zstdDictDecompress);

    public static ByteBuffer m(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.x(bArr);
            zstdCompressCtx.Y(i10);
            return zstdCompressCtx.g(byteBuffer);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long m0(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dict must be a direct buffer");
        }
        if (iLimit >= 0) {
            return getDictIdFromDictDirect(byteBuffer, byteBuffer.position(), iLimit);
        }
        throw new IllegalArgumentException("dict cannot be empty.");
    }

    public static native int magicNumber();

    public static native int maxCompressionLevel();

    public static native int minCompressionLevel();

    public static byte[] n(byte[] bArr) {
        return o(bArr, defaultCompressionLevel());
    }

    public static long n0(ByteBuffer byteBuffer, int i10, int i11) {
        return getDirectByteBufferFrameContentSize(byteBuffer, i10, i11, false);
    }

    public static byte[] o(byte[] bArr, int i10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.Y(i10);
            return zstdCompressCtx.h(bArr);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long o0(ByteBuffer byteBuffer) {
        return n0(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    public static byte[] p(byte[] bArr, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.t(zstdDictCompress);
            zstdCompressCtx.Y(zstdDictCompress.f());
            return zstdCompressCtx.h(bArr);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long p0(byte[] bArr) {
        return q0(bArr, 0);
    }

    public static long q(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13, int i14) {
        return r(bArr, i10, i11, bArr2, i12, i13, i14, false);
    }

    public static long q0(byte[] bArr, int i10) {
        return r0(bArr, i10, bArr.length - i10);
    }

    public static long r(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13, int i14, boolean z10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.Y(i14);
            zstdCompressCtx.H(z10);
            return zstdCompressCtx.j(bArr, i10, i11, bArr2, i12, i13);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long r0(byte[] bArr, int i10, int i11) {
        return s0(bArr, i10, i11, false);
    }

    public static native void registerSequenceProducer(long j10, long j11, long j12);

    public static long s(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14) {
        return t(byteBuffer, i10, i11, byteBuffer2, i12, i13, i14, false);
    }

    public static long s0(byte[] bArr, int i10, int i11, boolean z10) {
        if (i10 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i10);
        }
        int i12 = i10 + i11;
        if (i12 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i12);
        }
        long frameContentSize0 = getFrameContentSize0(bArr, i10, i11, z10);
        if (!isError(frameContentSize0)) {
            return frameContentSize0;
        }
        if (frameContentSize0 == -1) {
            throw new o(frameContentSize0, "Content size is unknown");
        }
        throw new o(frameContentSize0);
    }

    public static native int searchLengthMax();

    public static native int searchLengthMin();

    public static native int searchLogMax();

    public static native int searchLogMin();

    public static native int setCompressionChainLog(long j10, int i10);

    public static native int setCompressionChecksums(long j10, boolean z10);

    public static native int setCompressionHashLog(long j10, int i10);

    public static native int setCompressionJobSize(long j10, int i10);

    public static native int setCompressionLevel(long j10, int i10);

    public static native int setCompressionLong(long j10, int i10);

    public static native int setCompressionMagicless(long j10, boolean z10);

    public static native int setCompressionMinMatch(long j10, int i10);

    public static native int setCompressionOverlapLog(long j10, int i10);

    public static native int setCompressionSearchLog(long j10, int i10);

    public static native int setCompressionStrategy(long j10, int i10);

    public static native int setCompressionTargetLength(long j10, int i10);

    public static native int setCompressionWindowLog(long j10, int i10);

    public static native int setCompressionWorkers(long j10, int i10);

    public static native int setDecompressionLongMax(long j10, int i10);

    public static native int setDecompressionMagicless(long j10, boolean z10);

    public static native int setEnableLongDistanceMatching(long j10, int i10);

    public static native int setRefMultipleDDicts(long j10, boolean z10);

    public static native int setSearchForExternalRepcodes(long j10, int i10);

    public static native int setSequenceProducerFallback(long j10, boolean z10);

    public static native int setValidateSequences(long j10, int i10);

    public static long t(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14, boolean z10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.Y(i14);
            zstdCompressCtx.H(z10);
            return zstdCompressCtx.l(byteBuffer, i10, i11, byteBuffer2, i12, i13);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long t0(byte[][] bArr, byte[] bArr2) {
        return u0(bArr, bArr2, false);
    }

    private static native long trainFromBuffer0(byte[][] bArr, byte[] bArr2, boolean z10, int i10);

    private static native long trainFromBufferDirect0(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, boolean z10, int i10);

    public static long u(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.t(zstdDictCompress);
            zstdCompressCtx.Y(zstdDictCompress.f());
            long jL = zstdCompressCtx.l(byteBuffer, i10, i11, byteBuffer2, i12, i13);
            zstdCompressCtx.close();
            return jL;
        } catch (Throwable th2) {
            zstdCompressCtx.close();
            throw th2;
        }
    }

    public static long u0(byte[][] bArr, byte[] bArr2, boolean z10) {
        return v0(bArr, bArr2, z10, defaultCompressionLevel());
    }

    public static long v(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, byte[] bArr, int i14) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.Y(i14);
            zstdCompressCtx.x(bArr);
            return zstdCompressCtx.l(byteBuffer, i10, i11, byteBuffer2, i12, i13);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long v0(byte[][] bArr, byte[] bArr2, boolean z10, int i10) {
        if (bArr.length > 10) {
            return trainFromBuffer0(bArr, bArr2, z10, i10);
        }
        throw new o(errGeneric(), "nb of samples too low");
    }

    public static long w(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.t(zstdDictCompress);
            zstdCompressCtx.Y(zstdDictCompress.f());
            return zstdCompressCtx.j(bArr, i10, bArr.length - i10, bArr2, i11, i12);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long w0(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2) {
        return x0(byteBuffer, iArr, byteBuffer2, false);
    }

    public static native int windowLogMax();

    public static native int windowLogMin();

    public static long x(byte[] bArr, int i10, byte[] bArr2, int i11, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.t(zstdDictCompress);
            zstdCompressCtx.Y(zstdDictCompress.f());
            return zstdCompressCtx.j(bArr, i10, bArr.length - i10, bArr2, i11, bArr2.length - i11);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long x0(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, boolean z10) {
        return y0(byteBuffer, iArr, byteBuffer2, z10, defaultCompressionLevel());
    }

    public static long y(long j10, long j11, long j12, long j13, int i10) {
        return compressUnsafe(j10, j11, j12, j13, i10, false);
    }

    public static long y0(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, boolean z10, int i10) {
        if (iArr.length > 10) {
            return trainFromBufferDirect0(byteBuffer, iArr, byteBuffer2, z10, i10);
        }
        throw new o(errGeneric(), "nb of samples too low");
    }

    public static long z(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, byte[] bArr3, int i13) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.Y(i13);
            zstdCompressCtx.x(bArr3);
            return zstdCompressCtx.j(bArr, i10, bArr.length - i10, bArr2, i11, i12);
        } finally {
            zstdCompressCtx.close();
        }
    }
}
