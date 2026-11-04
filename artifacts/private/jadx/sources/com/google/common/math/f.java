package com.google.common.math;

import androidx.constraintlayout.core.motion.utils.v;
import com.google.common.base.j0;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
@e
@com.google.common.annotations.b(emulated = true)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    static final int f119407a = 1073741824;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    static final int f119408b = -1257966797;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.google.common.annotations.e
    static final int f119412f = 46340;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.common.annotations.e
    static final byte[] f119409c = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.google.common.annotations.e
    static final int[] f119410d = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.google.common.annotations.e
    static final int[] f119411e = {3, 31, v.a.f43974q, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f119413g = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.google.common.annotations.e
    static int[] f119414h = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f119415a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f119415a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f119415a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f119415a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f119415a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f119415a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f119415a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f119415a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f119415a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private f() {
    }

    public static int a(int n10, int k10) {
        i.e("n", n10);
        i.e("k", k10);
        int i10 = 0;
        j0.m(k10 <= n10, "k (%s) > n (%s)", k10, n10);
        if (k10 > (n10 >> 1)) {
            k10 = n10 - k10;
        }
        int[] iArr = f119414h;
        if (k10 >= iArr.length || n10 > iArr[k10]) {
            return Integer.MAX_VALUE;
        }
        if (k10 == 0) {
            return 1;
        }
        if (k10 == 1) {
            return n10;
        }
        long j10 = 1;
        while (i10 < k10) {
            long j11 = j10 * ((long) (n10 - i10));
            i10++;
            j10 = j11 / ((long) i10);
        }
        return (int) j10;
    }

    public static int b(int x10) {
        i.h("x", x10);
        if (x10 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(x10 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + x10 + ") not representable as an int");
    }

    public static int c(int a10, int b10) {
        long j10 = ((long) a10) + ((long) b10);
        int i10 = (int) j10;
        i.b(j10 == ((long) i10), "checkedAdd", a10, b10);
        return i10;
    }

    public static int d(int a10, int b10) {
        long j10 = ((long) a10) * ((long) b10);
        int i10 = (int) j10;
        i.b(j10 == ((long) i10), "checkedMultiply", a10, b10);
        return i10;
    }

    public static int e(int b10, int k10) {
        i.e("exponent", k10);
        int i10 = (-2) ^ (-1);
        if (b10 == -2) {
            i.b(k10 < 32, "checkedPow", b10, k10);
            return (k10 & 1) == 0 ? 1 << k10 : (-1) << k10;
        }
        if (b10 == -1) {
            return (k10 & 1) == 0 ? 1 : -1;
        }
        if (b10 == 0) {
            return k10 == 0 ? 1 : 0;
        }
        if (b10 == 1) {
            return 1;
        }
        if (b10 == 2) {
            i.b(k10 < 31, "checkedPow", b10, k10);
            return 1 << k10;
        }
        int iD = 1;
        while (k10 != 0) {
            if (k10 == 1) {
                return d(iD, b10);
            }
            if ((k10 & 1) != 0) {
                iD = d(iD, b10);
            }
            k10 >>= 1;
            if (k10 > 0) {
                i.b((-46340 <= b10) & (b10 <= f119412f), "checkedPow", b10, k10);
                b10 *= b10;
            }
        }
        return iD;
    }

    public static int f(int a10, int b10) {
        long j10 = ((long) a10) - ((long) b10);
        int i10 = (int) j10;
        i.b(j10 == ((long) i10), "checkedSubtract", a10, b10);
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int g(int p10, int q10, RoundingMode mode) {
        j0.E(mode);
        if (q10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i10 = p10 / q10;
        int i11 = p10 - (q10 * i10);
        if (i11 == 0) {
            return i10;
        }
        boolean z10 = true;
        int i12 = ((p10 ^ q10) >> 31) | 1;
        switch (a.f119415a[mode.ordinal()]) {
            case 1:
                if (i11 != 0) {
                    z10 = false;
                }
                i.k(z10);
                return i10;
            case 2:
                return i10;
            case 3:
                if (i12 >= 0) {
                    return i10;
                }
                return i10 + i12;
            case 4:
                return i10 + i12;
            case 5:
                if (i12 <= 0) {
                    return i10;
                }
                return i10 + i12;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i11);
                int iAbs2 = iAbs - (Math.abs(q10) - iAbs);
                if (iAbs2 == 0) {
                    if (mode != RoundingMode.HALF_UP) {
                        boolean z11 = mode == RoundingMode.HALF_EVEN;
                        if ((i10 & 1) == 0) {
                            z10 = false;
                        }
                        if (!(z11 & z10)) {
                            return i10;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i10;
                }
                return i10 + i12;
            default:
                throw new AssertionError();
        }
    }

    public static int h(int n10) {
        i.e("n", n10);
        int[] iArr = f119413g;
        if (n10 < iArr.length) {
            return iArr[n10];
        }
        return Integer.MAX_VALUE;
    }

    public static int i(int x10) {
        i.h("x", x10);
        return Integer.highestOneBit(x10);
    }

    public static int j(int a10, int b10) {
        i.e(androidx.media3.exoplayer.upstream.h.f65998l, a10);
        i.e("b", b10);
        if (a10 == 0) {
            return b10;
        }
        if (b10 == 0) {
            return a10;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(a10);
        int iNumberOfTrailingZeros2 = a10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(b10);
        int i10 = b10 >> iNumberOfTrailingZeros3;
        while (iNumberOfTrailingZeros2 != i10) {
            int i11 = iNumberOfTrailingZeros2 - i10;
            int i12 = (i11 >> 31) & i11;
            int i13 = (i11 - i12) - i12;
            i10 += i12;
            iNumberOfTrailingZeros2 = i13 >> Integer.numberOfTrailingZeros(i13);
        }
        return iNumberOfTrailingZeros2 << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
    }

    public static boolean k(int x10) {
        return (x10 > 0) & ((x10 & (x10 + (-1))) == 0);
    }

    @com.google.common.annotations.c
    public static boolean l(int n10) {
        return h.m(n10);
    }

    @com.google.common.annotations.e
    static int m(int x10, int y10) {
        return (~(~(x10 - y10))) >>> 31;
    }

    @com.google.common.annotations.c
    public static int n(int x10, RoundingMode mode) {
        int iM;
        i.h("x", x10);
        int iO = o(x10);
        int i10 = f119410d[iO];
        switch (a.f119415a[mode.ordinal()]) {
            case 1:
                i.k(x10 == i10);
                return iO;
            case 2:
            case 3:
                return iO;
            case 4:
            case 5:
                iM = m(i10, x10);
                break;
            case 6:
            case 7:
            case 8:
                iM = m(f119411e[iO], x10);
                break;
            default:
                throw new AssertionError();
        }
        return iO + iM;
    }

    private static int o(int x10) {
        byte b10 = f119409c[Integer.numberOfLeadingZeros(x10)];
        return b10 - m(x10, f119410d[b10]);
    }

    public static int p(int x10, RoundingMode mode) {
        i.h("x", x10);
        switch (a.f119415a[mode.ordinal()]) {
            case 1:
                i.k(k(x10));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(x10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(x10);
                return (31 - iNumberOfLeadingZeros) + m(f119408b >>> iNumberOfLeadingZeros, x10);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(x10);
    }

    public static int q(int x10, int y10) {
        return (x10 & y10) + ((x10 ^ y10) >> 1);
    }

    public static int r(int x10, int m10) {
        if (m10 > 0) {
            int i10 = x10 % m10;
            return i10 >= 0 ? i10 : i10 + m10;
        }
        throw new ArithmeticException("Modulus " + m10 + " must be > 0");
    }

    @com.google.common.annotations.c
    public static int s(int b10, int k10) {
        i.e("exponent", k10);
        if (b10 == -2) {
            if (k10 < 32) {
                return (k10 & 1) == 0 ? 1 << k10 : -(1 << k10);
            }
            return 0;
        }
        if (b10 == -1) {
            return (k10 & 1) == 0 ? 1 : -1;
        }
        if (b10 == 0) {
            return k10 == 0 ? 1 : 0;
        }
        if (b10 == 1) {
            return 1;
        }
        if (b10 == 2) {
            if (k10 < 32) {
                return 1 << k10;
            }
            return 0;
        }
        int i10 = 1;
        while (k10 != 0) {
            if (k10 == 1) {
                return b10 * i10;
            }
            i10 *= (k10 & 1) == 0 ? 1 : b10;
            b10 *= b10;
            k10 >>= 1;
        }
        return i10;
    }

    public static int t(int a10, int b10) {
        return com.google.common.primitives.l.A(((long) a10) + ((long) b10));
    }

    public static int u(int a10, int b10) {
        return com.google.common.primitives.l.A(((long) a10) * ((long) b10));
    }

    public static int v(int b10, int k10) {
        i.e("exponent", k10);
        if (b10 == -2) {
            if (k10 >= 32) {
                return (k10 & 1) + Integer.MAX_VALUE;
            }
            return (k10 & 1) == 0 ? 1 << k10 : (-1) << k10;
        }
        if (b10 == -1) {
            return (k10 & 1) == 0 ? 1 : -1;
        }
        if (b10 == 0) {
            return k10 == 0 ? 1 : 0;
        }
        if (b10 == 1) {
            return 1;
        }
        if (b10 == 2) {
            if (k10 >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << k10;
        }
        int i10 = ((b10 >>> 31) & k10 & 1) + Integer.MAX_VALUE;
        int iU = 1;
        while (k10 != 0) {
            if (k10 == 1) {
                return u(iU, b10);
            }
            if ((k10 & 1) != 0) {
                iU = u(iU, b10);
            }
            k10 >>= 1;
            if (k10 > 0) {
                if ((-46340 > b10) || (b10 > f119412f)) {
                    return i10;
                }
                b10 *= b10;
            }
        }
        return iU;
    }

    public static int w(int a10, int b10) {
        return com.google.common.primitives.l.A(((long) a10) - ((long) b10));
    }

    @com.google.common.annotations.c
    public static int x(int x10, RoundingMode mode) {
        int iM;
        i.e("x", x10);
        int iY = y(x10);
        switch (a.f119415a[mode.ordinal()]) {
            case 1:
                i.k(iY * iY == x10);
                return iY;
            case 2:
            case 3:
                return iY;
            case 4:
            case 5:
                iM = m(iY * iY, x10);
                break;
            case 6:
            case 7:
            case 8:
                iM = m((iY * iY) + iY, x10);
                break;
            default:
                throw new AssertionError();
        }
        return iY + iM;
    }

    private static int y(int x10) {
        return (int) Math.sqrt(x10);
    }
}
