package com.davidehrmann.vcdiff.engine;

import com.rabbitmq.client.k0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f97830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f97831b;

    protected static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f97832a = 257;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f97833b = 8388608;

        protected a() {
        }

        public static long[] a(int i10) {
            if (i10 < 2) {
                throw new IllegalArgumentException();
            }
            long[] jArr = new long[256];
            long jF = 1;
            for (int i11 = 0; i11 < i10 - 1; i11++) {
                jF = f(jF * 257);
            }
            long jF2 = 0;
            for (int i12 = 0; i12 < 256; i12++) {
                jArr[i12] = b(jF2);
                jF2 = f(jF2 + jF);
            }
            return jArr;
        }

        public static long b(long j10) {
            return k0.f265952a & (4294967296L - f(j10));
        }

        public static long c(ByteBuffer byteBuffer) {
            return ((long) ((byteBuffer.get() & 255) * 257)) + ((long) (byteBuffer.get() & 255));
        }

        public static long d(byte[] bArr, int i10) {
            return ((bArr[i10] & 255) * 257) + (bArr[i10 + 1] & 255);
        }

        public static long e(long j10, byte b10) {
            return f((j10 * 257) + ((long) (b10 & 255)));
        }

        public static long f(long j10) {
            return j10 & 8388607;
        }
    }

    public e(int i10) {
        if (i10 < 2) {
            throw new IllegalArgumentException();
        }
        this.f97830a = i10;
        this.f97831b = a.a(i10);
    }

    public long a(ByteBuffer byteBuffer) {
        long jC = a.c(byteBuffer);
        for (int i10 = 2; i10 < this.f97830a; i10++) {
            jC = a.e(jC, byteBuffer.get());
        }
        return jC;
    }

    public long b(byte[] bArr, int i10, int i11) {
        long jD = a.d(bArr, i10);
        for (int i12 = 2; i12 < this.f97830a; i12++) {
            jD = a.e(jD, bArr[i10 + i12]);
        }
        return jD;
    }

    protected long c(long j10, byte b10) {
        return a.f(j10 + this.f97831b[b10 & 255]);
    }

    public long d(long j10, byte b10, byte b11) {
        return a.e(c(j10, b10), b11);
    }
}
