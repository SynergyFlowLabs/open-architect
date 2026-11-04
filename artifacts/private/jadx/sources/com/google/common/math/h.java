package com.google.common.math;

import androidx.media3.exoplayer.audio.s0;
import androidx.media3.exoplayer.c4;
import com.google.common.base.j0;
import com.google.common.primitives.y;
import com.rabbitmq.client.k0;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
@e
@com.google.common.annotations.b(emulated = true)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    static final long f119424a = 4611686018427387904L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    static final long f119425b = -5402926248376769404L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.google.common.annotations.e
    static final long f119429f = 3037000499L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f119433j = -545925251;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.common.annotations.e
    static final byte[] f119426c = {19, com.google.common.base.c.f116468u, com.google.common.base.c.f116468u, com.google.common.base.c.f116468u, com.google.common.base.c.f116468u, 17, 17, 17, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116465r, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116464q, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116463p, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116462o, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.e
    static final long[] f119427d = {1, 10, 100, 1000, 10000, s0.f63372z, 1000000, 10000000, 100000000, 1000000000, okhttp3.internal.connection.f.f334128w, 100000000000L, c4.f63520s, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.google.common.annotations.c
    @com.google.common.annotations.e
    static final long[] f119428e = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long[] f119430g = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f119431h = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, com.rabbitmq.client.impl.k.b.p.f265340a, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.google.common.annotations.e
    static final int[] f119432i = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long[][] f119434k = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f119435a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f119435a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f119435a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f119435a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f119435a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f119435a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f119435a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f119435a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f119435a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f119436a = new a("SMALL", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f119437b = new C1108b("LARGE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f119438c = k();

        final enum a extends b {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.math.h.b
            long l(long a10, long b10, long m10) {
                return (a10 * b10) % m10;
            }

            @Override // com.google.common.math.h.b
            long o(long a10, long m10) {
                return (a10 * a10) % m10;
            }
        }

        /* JADX INFO: renamed from: com.google.common.math.h$b$b, reason: collision with other inner class name */
        final enum C1108b extends b {
            C1108b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            private long r(long a10, long b10, long m10) {
                long j10 = a10 + b10;
                return a10 >= m10 - b10 ? j10 - m10 : j10;
            }

            private long s(long a10, long m10) {
                int i10 = 32;
                do {
                    int iMin = Math.min(i10, Long.numberOfLeadingZeros(a10));
                    a10 = y.k(a10 << iMin, m10);
                    i10 -= iMin;
                } while (i10 > 0);
                return a10;
            }

            @Override // com.google.common.math.h.b
            long l(long a10, long b10, long m10) {
                long j10 = a10 >>> 32;
                long j11 = b10 >>> 32;
                long j12 = a10 & k0.f265952a;
                long j13 = b10 & k0.f265952a;
                long jS = s(j10 * j11, m10) + (j10 * j13);
                if (jS < 0) {
                    jS = y.k(jS, m10);
                }
                return r(s(jS + (j11 * j12), m10), y.k(j12 * j13, m10), m10);
            }

            @Override // com.google.common.math.h.b
            long o(long a10, long m10) {
                long j10 = a10 >>> 32;
                long j11 = a10 & k0.f265952a;
                long jS = s(j10 * j10, m10);
                long jK = j10 * j11 * 2;
                if (jK < 0) {
                    jK = y.k(jK, m10);
                }
                return r(s(jS + jK, m10), y.k(j11 * j11, m10), m10);
            }
        }

        private b(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ b[] k() {
            return new b[]{f119436a, f119437b};
        }

        private long n(long a10, long p10, long m10) {
            long jO = a10;
            long jL = 1;
            for (long j10 = p10; j10 != 0; j10 >>= 1) {
                if ((j10 & 1) != 0) {
                    jL = l(jL, jO, m10);
                }
                jO = o(jO, m10);
            }
            return jL;
        }

        static boolean p(long base, long n10) {
            return (n10 <= h.f119429f ? f119436a : f119437b).q(base, n10);
        }

        private boolean q(long base, long n10) {
            long j10 = n10 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
            long j11 = j10 >> iNumberOfTrailingZeros;
            long j12 = base % n10;
            if (j12 == 0) {
                return true;
            }
            long jN = n(j12, j11, n10);
            if (jN == 1) {
                return true;
            }
            int i10 = 0;
            while (jN != j10) {
                i10++;
                if (i10 == iNumberOfTrailingZeros) {
                    return false;
                }
                jN = o(jN, n10);
            }
            return true;
        }

        public static b valueOf(String name) {
            return (b) Enum.valueOf(b.class, name);
        }

        public static b[] values() {
            return (b[]) f119438c.clone();
        }

        abstract long l(long a10, long b10, long m10);

        abstract long o(long a10, long m10);

        /* synthetic */ b(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    static {
        int i10 = 7 ^ 6;
        int i11 = 1 >> 7;
    }

    private h() {
    }

    public static long A(long a10, long b10) {
        long j10 = a10 - b10;
        return (((b10 ^ a10) > 0L ? 1 : ((b10 ^ a10) == 0L ? 0 : -1)) >= 0) | ((a10 ^ j10) >= 0) ? j10 : ((j10 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @com.google.common.annotations.c
    public static long B(long j10, RoundingMode roundingMode) {
        i.f("x", j10);
        if (i(j10)) {
            return f.x((int) j10, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j10);
        long j11 = jSqrt * jSqrt;
        switch (a.f119435a[roundingMode.ordinal()]) {
            case 1:
                i.k(j11 == j10);
                return jSqrt;
            case 2:
            case 3:
                return j10 < j11 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j10 > j11 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                long j12 = jSqrt - ((long) (j10 < j11 ? 1 : 0));
                return j12 + ((long) n((j12 * j12) + j12, j10));
            default:
                throw new AssertionError();
        }
    }

    public static long a(int n10, int k10) {
        i.e("n", n10);
        i.e("k", k10);
        j0.m(k10 <= n10, "k (%s) > n (%s)", k10, n10);
        if (k10 > (n10 >> 1)) {
            k10 = n10 - k10;
        }
        long jU = 1;
        if (k10 == 0) {
            return 1L;
        }
        if (k10 == 1) {
            return n10;
        }
        long[] jArr = f119430g;
        if (n10 < jArr.length) {
            return jArr[n10] / (jArr[k10] * jArr[n10 - k10]);
        }
        int[] iArr = f119431h;
        if (k10 >= iArr.length || n10 > iArr[k10]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = f119432i;
        if (k10 < iArr2.length && n10 <= iArr2[k10]) {
            int i10 = n10 - 1;
            long j10 = n10;
            for (int i11 = 2; i11 <= k10; i11++) {
                j10 = (j10 * ((long) i10)) / ((long) i11);
                i10--;
            }
            return j10;
        }
        long j11 = n10;
        int iQ = q(j11, RoundingMode.CEILING);
        int i12 = n10 - 1;
        int i13 = iQ;
        int i14 = 2;
        long j12 = j11;
        long j13 = 1;
        while (i14 <= k10) {
            i13 += iQ;
            if (i13 < 63) {
                j12 *= (long) i12;
                j13 *= (long) i14;
            } else {
                jU = u(jU, j12, j13);
                j12 = i12;
                j13 = i14;
                i13 = iQ;
            }
            i14++;
            i12--;
        }
        return u(jU, j12, j13);
    }

    public static long b(long x10) {
        i.i("x", x10);
        if (x10 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(x10 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + x10 + ") is not representable as a long");
    }

    public static long c(long a10, long b10) {
        long j10 = a10 + b10;
        i.c(((a10 ^ b10) < 0) | ((a10 ^ j10) >= 0), "checkedAdd", a10, b10);
        return j10;
    }

    public static long d(long a10, long b10) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(a10) + Long.numberOfLeadingZeros(~a10) + Long.numberOfLeadingZeros(b10) + Long.numberOfLeadingZeros(~b10);
        if (iNumberOfLeadingZeros > 65) {
            return a10 * b10;
        }
        i.c(iNumberOfLeadingZeros >= 64, "checkedMultiply", a10, b10);
        i.c((a10 >= 0) | (b10 != Long.MIN_VALUE), "checkedMultiply", a10, b10);
        long j10 = a10 * b10;
        i.c(a10 == 0 || j10 / a10 == b10, "checkedMultiply", a10, b10);
        return j10;
    }

    @com.google.common.annotations.c
    public static long e(long b10, int k10) {
        int i10 = k10;
        i.e("exponent", i10);
        long jD = 1;
        if (!(b10 >= -2) || !(b10 <= 2)) {
            long j10 = b10;
            while (i10 != 0) {
                if (i10 == 1) {
                    return d(jD, j10);
                }
                if ((i10 & 1) != 0) {
                    jD = d(jD, j10);
                }
                i10 >>= 1;
                if (i10 > 0) {
                    i.c(-3037000499L <= j10 && j10 <= f119429f, "checkedPow", j10, i10);
                    j10 *= j10;
                }
            }
            return jD;
        }
        int i11 = (int) b10;
        if (i11 == -2) {
            i.c(i10 < 64, "checkedPow", b10, i10);
            return (i10 & 1) == 0 ? 1 << i10 : (-1) << i10;
        }
        if (i11 == -1) {
            return (i10 & 1) == 0 ? 1L : -1L;
        }
        if (i11 == 0) {
            return i10 == 0 ? 1L : 0L;
        }
        if (i11 == 1) {
            return 1L;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        i.c(i10 < 63, "checkedPow", b10, i10);
        return 1 << i10;
    }

    @com.google.common.annotations.c
    public static long f(long a10, long b10) {
        long j10 = a10 - b10;
        i.c(((a10 ^ b10) >= 0) | ((a10 ^ j10) >= 0), "checkedSubtract", a10, b10);
        return j10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @com.google.common.annotations.c
    public static long g(long p10, long q10, RoundingMode mode) {
        j0.E(mode);
        long j10 = p10 / q10;
        long j11 = p10 - (q10 * j10);
        if (j11 == 0) {
            return j10;
        }
        int i10 = ((int) ((p10 ^ q10) >> 63)) | 1;
        switch (a.f119435a[mode.ordinal()]) {
            case 1:
                i.k(j11 == 0);
                return j10;
            case 2:
                return j10;
            case 3:
                if (i10 >= 0) {
                    return j10;
                }
                return j10 + ((long) i10);
            case 4:
                return j10 + ((long) i10);
            case 5:
                if (i10 <= 0) {
                    return j10;
                }
                return j10 + ((long) i10);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j11);
                long jAbs2 = jAbs - (Math.abs(q10) - jAbs);
                if (jAbs2 == 0) {
                    if (mode != RoundingMode.HALF_UP && (mode != RoundingMode.HALF_EVEN || (1 & j10) == 0)) {
                        return j10;
                    }
                } else if (jAbs2 <= 0) {
                    return j10;
                }
                return j10 + ((long) i10);
            default:
                throw new AssertionError();
        }
    }

    @com.google.common.annotations.c
    public static long h(int n10) {
        i.e("n", n10);
        long[] jArr = f119430g;
        if (n10 < jArr.length) {
            return jArr[n10];
        }
        return Long.MAX_VALUE;
    }

    static boolean i(long x10) {
        return ((long) ((int) x10)) == x10;
    }

    public static long j(long x10) {
        i.i("x", x10);
        return 1 << (63 - Long.numberOfLeadingZeros(x10));
    }

    public static long k(long a10, long b10) {
        i.f(androidx.media3.exoplayer.upstream.h.f65998l, a10);
        i.f("b", b10);
        if (a10 == 0) {
            return b10;
        }
        if (b10 == 0) {
            return a10;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(a10);
        long jNumberOfTrailingZeros = a10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(b10);
        long j10 = b10 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j10) {
            long j11 = jNumberOfTrailingZeros - j10;
            long j12 = (j11 >> 63) & j11;
            long j13 = (j11 - j12) - j12;
            j10 += j12;
            jNumberOfTrailingZeros = j13 >> Long.numberOfTrailingZeros(j13);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean l(long x10) {
        return (x10 > 0) & ((x10 & (x10 - 1)) == 0);
    }

    @com.google.common.annotations.c
    public static boolean m(long n10) {
        if (n10 < 2) {
            i.f("n", n10);
            return false;
        }
        if (n10 < 66) {
            return ((722865708377213483 >> (((int) n10) + (-2))) & 1) != 0;
        }
        if (((1 << ((int) (n10 % 30))) & f119433j) != 0 || n10 % 7 == 0 || n10 % 11 == 0 || n10 % 13 == 0) {
            return false;
        }
        if (n10 < 289) {
            return true;
        }
        for (long[] jArr : f119434k) {
            if (n10 <= jArr[0]) {
                for (int i10 = 1; i10 < jArr.length; i10++) {
                    if (!b.p(jArr[i10], n10)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    @com.google.common.annotations.e
    static int n(long x10, long y10) {
        return (int) ((~(~(x10 - y10))) >>> 63);
    }

    @com.google.common.annotations.c
    public static int o(long x10, RoundingMode mode) {
        int iN;
        i.i("x", x10);
        int iP = p(x10);
        long j10 = f119427d[iP];
        switch (a.f119435a[mode.ordinal()]) {
            case 1:
                i.k(x10 == j10);
                return iP;
            case 2:
            case 3:
                return iP;
            case 4:
            case 5:
                iN = n(j10, x10);
                break;
            case 6:
            case 7:
            case 8:
                iN = n(f119428e[iP], x10);
                break;
            default:
                throw new AssertionError();
        }
        return iP + iN;
    }

    @com.google.common.annotations.c
    static int p(long x10) {
        byte b10 = f119426c[Long.numberOfLeadingZeros(x10)];
        return b10 - n(x10, f119427d[b10]);
    }

    public static int q(long x10, RoundingMode mode) {
        i.i("x", x10);
        switch (a.f119435a[mode.ordinal()]) {
            case 1:
                i.k(l(x10));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(x10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(x10);
                return (63 - iNumberOfLeadingZeros) + n(f119425b >>> iNumberOfLeadingZeros, x10);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(x10);
    }

    public static long r(long x10, long y10) {
        return (x10 & y10) + ((x10 ^ y10) >> 1);
    }

    @com.google.common.annotations.c
    public static int s(long x10, int m10) {
        return (int) t(x10, m10);
    }

    @com.google.common.annotations.c
    public static long t(long x10, long m10) {
        if (m10 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j10 = x10 % m10;
        return j10 >= 0 ? j10 : j10 + m10;
    }

    static long u(long x10, long numerator, long denominator) {
        if (x10 == 1) {
            return numerator / denominator;
        }
        long jK = k(x10, denominator);
        return (x10 / jK) * (numerator / (denominator / jK));
    }

    @com.google.common.annotations.c
    public static long v(long b10, int k10) {
        i.e("exponent", k10);
        if (-2 > b10 || b10 > 2) {
            long j10 = 1;
            while (k10 != 0) {
                if (k10 == 1) {
                    j10 *= b10;
                    break;
                }
                j10 *= (k10 & 1) == 0 ? 1L : b10;
                b10 *= b10;
                k10 >>= 1;
            }
            return j10;
        }
        int i10 = (int) b10;
        if (i10 == -2) {
            if (k10 < 64) {
                return (k10 & 1) == 0 ? 1 << k10 : -(1 << k10);
            }
            return 0L;
        }
        if (i10 == -1) {
            return (k10 & 1) == 0 ? 1L : -1L;
        }
        if (i10 == 0) {
            return k10 == 0 ? 1L : 0L;
        }
        if (i10 == 1) {
            return 1L;
        }
        if (i10 != 2) {
            throw new AssertionError();
        }
        if (k10 < 64) {
            return 1 << k10;
        }
        return 0L;
    }

    @com.google.common.annotations.c
    public static double w(long x10, RoundingMode mode) {
        double dNextUp;
        long jCeil;
        double d10 = x10;
        long j10 = (long) d10;
        int iCompare = j10 == Long.MAX_VALUE ? -1 : Long.compare(x10, j10);
        int[] iArr = a.f119435a;
        switch (iArr[mode.ordinal()]) {
            case 1:
                i.k(iCompare == 0);
                return d10;
            case 2:
                if (x10 >= 0) {
                    if (iCompare < 0) {
                        return d.f(d10);
                    }
                } else if (iCompare > 0) {
                    return Math.nextUp(d10);
                }
                return d10;
            case 3:
                if (iCompare < 0) {
                    return d.f(d10);
                }
                return d10;
            case 4:
                if (x10 >= 0) {
                    if (iCompare > 0) {
                        return Math.nextUp(d10);
                    }
                } else if (iCompare < 0) {
                    return d.f(d10);
                }
                return d10;
            case 5:
                if (iCompare > 0) {
                    return Math.nextUp(d10);
                }
                return d10;
            case 6:
            case 7:
            case 8:
                if (iCompare >= 0) {
                    dNextUp = Math.nextUp(d10);
                    jCeil = (long) Math.ceil(dNextUp);
                } else {
                    double dF = d.f(d10);
                    long jFloor = (long) Math.floor(dF);
                    dNextUp = d10;
                    d10 = dF;
                    jCeil = j10;
                    j10 = jFloor;
                }
                long j11 = x10 - j10;
                long j12 = jCeil - x10;
                if (jCeil == 9223372036854775807) {
                    j12++;
                }
                int iCompare2 = Long.compare(j11, j12);
                if (iCompare2 >= 0) {
                    if (iCompare2 <= 0) {
                        int i10 = iArr[mode.ordinal()];
                        if (i10 != 6) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    throw new AssertionError("impossible");
                                }
                                if ((d.c(d10) & 1) == 0) {
                                }
                            } else if (x10 >= 0) {
                            }
                        } else if (x10 >= 0) {
                        }
                    }
                    return dNextUp;
                }
                return d10;
            default:
                throw new AssertionError("impossible");
        }
    }

    public static long x(long a10, long b10) {
        long j10 = a10 + b10;
        return (((b10 ^ a10) > 0L ? 1 : ((b10 ^ a10) == 0L ? 0 : -1)) < 0) | ((a10 ^ j10) >= 0) ? j10 : ((j10 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long y(long a10, long b10) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(a10) + Long.numberOfLeadingZeros(~a10) + Long.numberOfLeadingZeros(b10) + Long.numberOfLeadingZeros(~b10);
        if (iNumberOfLeadingZeros > 65) {
            return a10 * b10;
        }
        long j10 = ((a10 ^ b10) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((b10 == Long.MIN_VALUE) & (a10 < 0)))) {
            long j11 = a10 * b10;
            if (a10 == 0 || j11 / a10 == b10) {
                return j11;
            }
        }
        return j10;
    }

    public static long z(long b10, int k10) {
        i.e("exponent", k10);
        long jY = 1;
        if (!(b10 >= -2) || !(b10 <= 2)) {
            long j10 = ((b10 >>> 63) & ((long) (k10 & 1))) + Long.MAX_VALUE;
            while (k10 != 0) {
                if (k10 == 1) {
                    return y(jY, b10);
                }
                if ((k10 & 1) != 0) {
                    jY = y(jY, b10);
                }
                k10 >>= 1;
                if (k10 > 0) {
                    if ((-3037000499L > b10) || (b10 > f119429f)) {
                        return j10;
                    }
                    b10 *= b10;
                }
            }
            return jY;
        }
        int i10 = (int) b10;
        if (i10 == -2) {
            if (k10 >= 64) {
                return ((long) (k10 & 1)) + Long.MAX_VALUE;
            }
            return (k10 & 1) == 0 ? 1 << k10 : (-1) << k10;
        }
        if (i10 == -1) {
            return (k10 & 1) == 0 ? 1L : -1L;
        }
        if (i10 == 0) {
            return k10 == 0 ? 1L : 0L;
        }
        if (i10 == 1) {
            return 1L;
        }
        if (i10 != 2) {
            throw new AssertionError();
        }
        if (k10 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << k10;
    }
}
