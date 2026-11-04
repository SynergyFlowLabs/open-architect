package com.google.common.hash;

/* JADX INFO: loaded from: classes5.dex */
@k
final class l extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final q f118874a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f118875b = -4348849565147123417L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f118876c = -5435081209227447693L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f118877d = -7286425919675154353L;

    l() {
    }

    @com.google.common.annotations.e
    static long l(byte[] bytes, int offset, int length) {
        if (length <= 32) {
            return length <= 16 ? m(bytes, offset, length) : o(bytes, offset, length);
        }
        return length <= 64 ? p(bytes, offset, length) : q(bytes, offset, length);
    }

    private static long m(byte[] bytes, int offset, int length) {
        if (length >= 8) {
            long j10 = (((long) length) * 2) + f118877d;
            long jB = y.b(bytes, offset) + f118877d;
            long jB2 = y.b(bytes, (offset + length) - 8);
            return n((Long.rotateRight(jB2, 37) * j10) + jB, (Long.rotateRight(jB, 25) + jB2) * j10, j10);
        }
        if (length >= 4) {
            return n(((long) length) + ((((long) y.a(bytes, offset)) & com.rabbitmq.client.k0.f265952a) << 3), ((long) y.a(bytes, (offset + length) - 4)) & com.rabbitmq.client.k0.f265952a, ((long) (length * 2)) + f118877d);
        }
        if (length <= 0) {
            return f118877d;
        }
        return r((((long) ((bytes[offset] & 255) + ((bytes[(length >> 1) + offset] & 255) << 8))) * f118877d) ^ (((long) (length + ((bytes[offset + (length - 1)] & 255) << 2))) * f118875b)) * f118877d;
    }

    private static long n(long u10, long v10, long mul) {
        long j10 = (u10 ^ v10) * mul;
        long j11 = ((j10 ^ (j10 >>> 47)) ^ v10) * mul;
        return (j11 ^ (j11 >>> 47)) * mul;
    }

    private static long o(byte[] bytes, int offset, int length) {
        long j10 = (((long) length) * 2) + f118877d;
        long jB = y.b(bytes, offset) * f118876c;
        long jB2 = y.b(bytes, offset + 8);
        int i10 = offset + length;
        long jB3 = y.b(bytes, i10 - 8) * j10;
        return n(Long.rotateRight(jB + jB2, 43) + Long.rotateRight(jB3, 30) + (y.b(bytes, i10 - 16) * f118877d), jB3 + jB + Long.rotateRight(jB2 + f118877d, 18), j10);
    }

    private static long p(byte[] bytes, int offset, int length) {
        long j10 = (((long) length) * 2) + f118877d;
        long jB = y.b(bytes, offset) * f118877d;
        long jB2 = y.b(bytes, offset + 8);
        int i10 = offset + length;
        long jB3 = y.b(bytes, i10 - 8) * j10;
        long jRotateRight = Long.rotateRight(jB + jB2, 43) + Long.rotateRight(jB3, 30) + (y.b(bytes, i10 - 16) * f118877d);
        long jN = n(jRotateRight, jB3 + Long.rotateRight(jB2 + f118877d, 18) + jB, j10);
        long jB4 = y.b(bytes, offset + 16) * j10;
        long jB5 = y.b(bytes, offset + 24);
        long jB6 = (jRotateRight + y.b(bytes, i10 - 32)) * j10;
        return n(Long.rotateRight(jB4 + jB5, 43) + Long.rotateRight(jB6, 30) + ((jN + y.b(bytes, i10 - 24)) * j10), jB4 + Long.rotateRight(jB + jB5, 18) + jB6, j10);
    }

    private static long q(byte[] bytes, int offset, int length) {
        long j10 = 81;
        long j11 = f118876c;
        long j12 = (j10 * f118876c) + 113;
        long jR = r((j12 * f118877d) + 113) * f118877d;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        char c10 = 1;
        int i10 = length - 1;
        int i11 = offset + ((i10 / 64) * 64);
        int i12 = i10 & 63;
        int i13 = i11 + i12;
        int i14 = i13 - 63;
        long j13 = j12;
        long jB = (j10 * f118877d) + y.b(bytes, offset);
        int i15 = offset;
        while (true) {
            long j14 = j11;
            long jRotateRight = Long.rotateRight(jB + j13 + jArr[0] + y.b(bytes, i15 + 8), 37) * j14;
            long jRotateRight2 = Long.rotateRight(j13 + jArr[c10] + y.b(bytes, i15 + 48), 42) * j14;
            long j15 = jRotateRight ^ jArr2[c10];
            char c11 = c10;
            long jB2 = jRotateRight2 + jArr[0] + y.b(bytes, i15 + 40);
            long jRotateRight3 = Long.rotateRight(jR + jArr2[0], 33) * j14;
            s(bytes, i15, jArr[c11] * j14, j15 + jArr2[0], jArr);
            int i16 = i15;
            long[] jArr3 = jArr;
            s(bytes, i16 + 32, jArr2[c11] + jRotateRight3, jB2 + y.b(bytes, i16 + 16), jArr2);
            i15 = i16 + 64;
            if (i15 == i11) {
                long j16 = ((j15 & 255) << c11) + j14;
                long j17 = jArr2[0] + ((long) i12);
                jArr2[0] = j17;
                long j18 = jArr3[0] + j17;
                jArr3[0] = j18;
                jArr2[0] = jArr2[0] + j18;
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + jB2 + jArr3[0] + y.b(bytes, i13 - 55), 37) * j16;
                long jRotateRight5 = Long.rotateRight(jB2 + jArr3[c11] + y.b(bytes, i13 - 15), 42) * j16;
                long j19 = jRotateRight4 ^ (jArr2[c11] * 9);
                long jB3 = jRotateRight5 + (jArr3[0] * 9) + y.b(bytes, i13 - 23);
                long jRotateRight6 = Long.rotateRight(j15 + jArr2[0], 33) * j16;
                s(bytes, i14, jArr3[c11] * j16, jArr2[0] + j19, jArr3);
                s(bytes, i13 - 31, jArr2[c11] + jRotateRight6, y.b(bytes, i13 - 47) + jB3, jArr2);
                return n(n(jArr3[0], jArr2[0], j16) + (r(jB3) * f118875b) + j19, n(jArr3[c11], jArr2[c11], j16) + jRotateRight6, j16);
            }
            jB = jRotateRight3;
            j11 = j14;
            jR = j15;
            c10 = c11;
            j13 = jB2;
            jArr = jArr3;
        }
    }

    private static long r(long val) {
        return val ^ (val >>> 47);
    }

    private static void s(byte[] bytes, int offset, long seedA, long seedB, long[] output) {
        long jB = y.b(bytes, offset);
        long jB2 = y.b(bytes, offset + 8);
        long jB3 = y.b(bytes, offset + 16);
        long jB4 = y.b(bytes, offset + 24);
        long j10 = seedA + jB;
        long j11 = jB2 + j10 + jB3;
        long jRotateRight = Long.rotateRight(seedB + j10 + jB4, 21) + Long.rotateRight(j11, 44);
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
        return "Hashing.farmHashFingerprint64()";
    }
}
