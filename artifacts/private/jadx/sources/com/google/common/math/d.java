package com.google.common.math;

import com.google.common.base.j0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@e
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f119400a = 4503599627370495L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f119401b = 9218868437227405312L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f119402c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f119403d = 52;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f119404e = 1023;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f119405f = 4503599627370496L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.google.common.annotations.e
    static final long f119406g = 4607182418800017408L;

    private d() {
    }

    static double a(BigInteger x10) {
        BigInteger bigIntegerAbs = x10.abs();
        int iBitLength = bigIntegerAbs.bitLength();
        int i10 = iBitLength - 1;
        if (i10 < 63) {
            return x10.longValue();
        }
        if (i10 > 1023) {
            return ((double) x10.signum()) * Double.POSITIVE_INFINITY;
        }
        int i11 = iBitLength - 54;
        long jLongValue = bigIntegerAbs.shiftRight(i11).longValue();
        long j10 = jLongValue >> 1;
        long j11 = f119400a & j10;
        if ((jLongValue & 1) != 0 && ((j10 & 1) != 0 || bigIntegerAbs.getLowestSetBit() < i11)) {
            j11++;
        }
        return Double.longBitsToDouble(((((long) (iBitLength + androidx.media3.exoplayer.analytics.b.f62802b0)) << 52) + j11) | (((long) x10.signum()) & Long.MIN_VALUE));
    }

    static double b(double value) {
        j0.d(!Double.isNaN(value));
        return Math.max(value, 0.0d);
    }

    static long c(double d10) {
        j0.e(d(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & f119400a;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | f119405f;
    }

    static boolean d(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    static boolean e(double d10) {
        return Math.getExponent(d10) >= -1022;
    }

    static double f(double d10) {
        return -Math.nextUp(-d10);
    }

    static double g(double x10) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(x10) & f119400a) | f119406g);
    }
}
