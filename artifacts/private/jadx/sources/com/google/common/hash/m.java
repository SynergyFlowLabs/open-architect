package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@k
final class m extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final q f118878a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f118879b = -6505348102511208375L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f118880c = -8261664234251669945L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f118881d = -4288712594273399085L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f118882e = -4132994306676758123L;

    m() {
    }

    @com.google.common.annotations.e
    static long l(byte[] bytes, int offset, int length) {
        long jO;
        if (length <= 32) {
            jO = p(bytes, offset, length, -1397348546323613475L);
        } else {
            jO = length <= 64 ? o(bytes, offset, length) : m(bytes, offset, length);
        }
        long jB = f118879b;
        long jB2 = length >= 8 ? y.b(bytes, offset) : -6505348102511208375L;
        if (length >= 9) {
            jB = y.b(bytes, (offset + length) - 8);
        }
        long jN = n(jO + jB, jB2);
        return (jN == 0 || jN == 1) ? jN - 2 : jN;
    }

    private static long m(byte[] bytes, int offset, int length) {
        byte[] bArr = bytes;
        long jB = y.b(bytes, offset);
        int i10 = offset + length;
        long jB2 = y.b(bArr, i10 - 16) ^ f118880c;
        long jB3 = f118879b ^ y.b(bArr, i10 - 56);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j10 = length;
        r(bArr, i10 - 64, j10, jB2, jArr);
        r(bArr, i10 - 32, j10 * f118880c, f118879b, jArr2);
        long[] jArr3 = jArr2;
        long jQ = jB3 + (q(jArr[1]) * f118880c);
        long jRotateRight = Long.rotateRight(jB + jQ, 39) * f118880c;
        int i11 = (length - 1) & (-64);
        long jRotateRight2 = Long.rotateRight(jB2, 33) * f118880c;
        long j11 = jRotateRight;
        int i12 = offset;
        while (true) {
            long jRotateRight3 = Long.rotateRight(j11 + jRotateRight2 + jArr[0] + y.b(bArr, i12 + 16), 37) * f118880c;
            long jRotateRight4 = Long.rotateRight(jRotateRight2 + jArr[1] + y.b(bArr, i12 + 48), 42) * f118880c;
            long j12 = jArr3[1] ^ jRotateRight3;
            long j13 = jRotateRight4 ^ jArr[0];
            long jRotateRight5 = Long.rotateRight(jArr3[0] ^ jQ, 33);
            r(bArr, i12, jArr[1] * f118880c, jArr3[0] + j12, jArr);
            int i13 = i12;
            long[] jArr4 = jArr3;
            jRotateRight2 = j13;
            r(bytes, i13 + 32, jArr3[1] + jRotateRight5, jRotateRight2, jArr4);
            i12 = i13 + 64;
            i11 -= 64;
            if (i11 == 0) {
                return n(n(jArr[0], jArr4[0]) + (q(jRotateRight2) * f118880c) + j12, n(jArr[1], jArr4[1]) + jRotateRight5);
            }
            bArr = bytes;
            jArr3 = jArr4;
            j11 = jRotateRight5;
            jQ = j12;
        }
    }

    @com.google.common.annotations.e
    static long n(long high, long low) {
        long j10 = (low ^ high) * f118882e;
        long j11 = (high ^ (j10 ^ (j10 >>> 47))) * f118882e;
        return (j11 ^ (j11 >>> 47)) * f118882e;
    }

    private static long o(byte[] bytes, int offset, int length) {
        long jB = y.b(bytes, offset + 24);
        int i10 = offset + length;
        int i11 = i10 - 16;
        long jB2 = y.b(bytes, offset) + ((((long) length) + y.b(bytes, i11)) * f118879b);
        long jRotateRight = Long.rotateRight(jB2 + jB, 52);
        long jRotateRight2 = Long.rotateRight(jB2, 37);
        long jB3 = jB2 + y.b(bytes, offset + 8);
        long jRotateRight3 = jRotateRight2 + Long.rotateRight(jB3, 7);
        int i12 = offset + 16;
        long jB4 = jB3 + y.b(bytes, i12);
        long j10 = jB + jB4;
        long jRotateRight4 = jRotateRight + Long.rotateRight(jB4, 31) + jRotateRight3;
        long jB5 = y.b(bytes, i12) + y.b(bytes, i10 - 32);
        long jB6 = y.b(bytes, i10 - 8);
        long jRotateRight5 = Long.rotateRight(jB5 + jB6, 52);
        long jRotateRight6 = Long.rotateRight(jB5, 37);
        long jB7 = jB5 + y.b(bytes, i10 - 24);
        long jRotateRight7 = jRotateRight6 + Long.rotateRight(jB7, 7);
        long jB8 = jB7 + y.b(bytes, i11);
        return q((q(((j10 + jRotateRight5 + Long.rotateRight(jB8, 31) + jRotateRight7) * f118881d) + ((jB6 + jB8 + jRotateRight4) * f118879b)) * f118879b) + jRotateRight4) * f118881d;
    }

    @com.google.common.annotations.e
    static long p(byte[] bytes, int offset, int length, long seed) {
        int i10 = length & (-8);
        int i11 = length & 7;
        long jC = seed ^ (((long) length) * f118882e);
        for (int i12 = 0; i12 < i10; i12 += 8) {
            jC = (jC ^ (q(y.b(bytes, offset + i12) * f118882e) * f118882e)) * f118882e;
        }
        if (i11 != 0) {
            jC = (y.c(bytes, offset + i10, i11) ^ jC) * f118882e;
        }
        return q(q(jC) * f118882e);
    }

    private static long q(long val) {
        return val ^ (val >>> 47);
    }

    private static void r(byte[] bytes, int offset, long seedA, long seedB, long[] output) {
        long jB = y.b(bytes, offset);
        long jB2 = y.b(bytes, offset + 8);
        long jB3 = y.b(bytes, offset + 16);
        long jB4 = y.b(bytes, offset + 24);
        long j10 = seedA + jB;
        long j11 = jB2 + j10 + jB3;
        long jRotateRight = Long.rotateRight(seedB + j10 + jB4, 51) + Long.rotateRight(j11, 23);
        output[0] = j11 + jB4;
        output[1] = jRotateRight + j10;
    }

    @Override // com.google.common.hash.q
    public int h() {
        return 64;
    }

    @Override // com.google.common.hash.e, com.google.common.hash.c, com.google.common.hash.q
    public p k(byte[] input, int off, int len) {
        com.google.common.base.j0.f0(off, off + len, input.length);
        return p.j(l(input, off, len));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}
