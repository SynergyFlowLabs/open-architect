package com.google.common.math;

import com.google.common.base.j0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@e
@com.google.common.annotations.b(emulated = true)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    static final int f119386a = 256;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    static final BigInteger f119387b = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f119388c = Math.log(10.0d);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final double f119389d = Math.log(2.0d);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f119390a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f119390a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f119390a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f119390a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f119390a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f119390a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f119390a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f119390a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f119390a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.math.b$b, reason: collision with other inner class name */
    @com.google.common.annotations.c
    private static class C1107b extends p<BigInteger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C1107b f119391a = new C1107b();

        private C1107b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigInteger a(BigInteger a10, BigInteger b10) {
            return a10.subtract(b10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public double c(BigInteger bigInteger) {
            return d.a(bigInteger);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int d(BigInteger bigInteger) {
            return bigInteger.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public BigInteger e(double d10, RoundingMode mode) {
            return c.o(d10, mode);
        }
    }

    private b() {
    }

    public static BigInteger a(int n10, int k10) {
        i.e("n", n10);
        i.e("k", k10);
        int i10 = 1;
        j0.m(k10 <= n10, "k (%s) > n (%s)", k10, n10);
        if (k10 > (n10 >> 1)) {
            k10 = n10 - k10;
        }
        int[] iArr = h.f119431h;
        if (k10 < iArr.length && n10 <= iArr[k10]) {
            return BigInteger.valueOf(h.a(n10, k10));
        }
        BigInteger bigIntegerDivide = BigInteger.ONE;
        long j10 = n10;
        int iQ = h.q(j10, RoundingMode.CEILING);
        long j11 = 1;
        while (true) {
            int i11 = iQ;
            while (i10 < k10) {
                int i12 = n10 - i10;
                i10++;
                i11 += iQ;
                if (i11 >= 63) {
                    bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.valueOf(j10)).divide(BigInteger.valueOf(j11));
                    j10 = i12;
                    j11 = i10;
                } else {
                    j10 *= (long) i12;
                    j11 *= (long) i10;
                }
            }
            return bigIntegerDivide.multiply(BigInteger.valueOf(j10)).divide(BigInteger.valueOf(j11));
        }
    }

    public static BigInteger b(BigInteger x10) {
        return BigInteger.ZERO.setBit(k(x10, RoundingMode.CEILING));
    }

    @com.google.common.annotations.c
    public static BigInteger c(BigInteger p10, BigInteger q10, RoundingMode mode) {
        return new BigDecimal(p10).divide(new BigDecimal(q10), 0, mode).toBigIntegerExact();
    }

    public static BigInteger d(int n10) {
        i.e("n", n10);
        long[] jArr = h.f119430g;
        if (n10 < jArr.length) {
            return BigInteger.valueOf(jArr[n10]);
        }
        RoundingMode roundingMode = RoundingMode.CEILING;
        ArrayList arrayList = new ArrayList(f.g(f.p(n10, roundingMode) * n10, 64, roundingMode));
        int length = jArr.length;
        long j10 = jArr[length - 1];
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long j11 = j10 >> iNumberOfTrailingZeros;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int i10 = 1;
        int iQ = h.q(j11, roundingMode2) + 1;
        long j12 = length;
        int iQ2 = h.q(j12, roundingMode2);
        int i11 = iQ2 + 1;
        int i12 = 1 << iQ2;
        while (j12 <= n10) {
            int i13 = i10;
            long j13 = j12;
            if ((((long) i12) & j13) != 0) {
                i12 <<= 1;
                i11++;
            }
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j13);
            long j14 = j13 >> iNumberOfTrailingZeros2;
            iNumberOfTrailingZeros += iNumberOfTrailingZeros2;
            if ((i11 - iNumberOfTrailingZeros2) + iQ >= 64) {
                arrayList.add(BigInteger.valueOf(j11));
                j11 = 1;
            }
            j11 *= j14;
            iQ = h.q(j11, RoundingMode.FLOOR) + i13;
            j12 = j13 + 1;
            i10 = i13;
        }
        if (j11 > 1) {
            arrayList.add(BigInteger.valueOf(j11));
        }
        return h(arrayList).shiftLeft(iNumberOfTrailingZeros);
    }

    @com.google.common.annotations.c
    static boolean e(BigInteger x10) {
        return x10.bitLength() <= 63;
    }

    public static BigInteger f(BigInteger x10) {
        return BigInteger.ZERO.setBit(k(x10, RoundingMode.FLOOR));
    }

    public static boolean g(BigInteger x10) {
        j0.E(x10);
        return x10.signum() > 0 && x10.getLowestSetBit() == x10.bitLength() - 1;
    }

    static BigInteger h(List<BigInteger> nums) {
        return i(nums, 0, nums.size());
    }

    static BigInteger i(List<BigInteger> nums, int start, int end) {
        int i10 = end - start;
        if (i10 == 0) {
            return BigInteger.ONE;
        }
        if (i10 == 1) {
            return nums.get(start);
        }
        if (i10 == 2) {
            return nums.get(start).multiply(nums.get(start + 1));
        }
        if (i10 == 3) {
            return nums.get(start).multiply(nums.get(start + 1)).multiply(nums.get(start + 2));
        }
        int i11 = (end + start) >>> 1;
        return i(nums, start, i11).multiply(i(nums, i11, end));
    }

    @com.google.common.annotations.c
    public static int j(BigInteger x10, RoundingMode mode) {
        int i10;
        int iCompareTo;
        i.j("x", x10);
        if (e(x10)) {
            return h.o(x10.longValue(), mode);
        }
        int iK = (int) ((((double) k(x10, RoundingMode.FLOOR)) * f119389d) / f119388c);
        BigInteger bigInteger = BigInteger.TEN;
        BigInteger bigIntegerPow = bigInteger.pow(iK);
        int iCompareTo2 = bigIntegerPow.compareTo(x10);
        if (iCompareTo2 > 0) {
            do {
                iK--;
                bigIntegerPow = bigIntegerPow.divide(BigInteger.TEN);
                iCompareTo = bigIntegerPow.compareTo(x10);
            } while (iCompareTo > 0);
        } else {
            BigInteger bigIntegerMultiply = bigInteger.multiply(bigIntegerPow);
            int iCompareTo3 = bigIntegerMultiply.compareTo(x10);
            while (true) {
                int i11 = iCompareTo3;
                i10 = iCompareTo2;
                iCompareTo2 = i11;
                if (iCompareTo2 > 0) {
                    break;
                }
                iK++;
                BigInteger bigIntegerMultiply2 = BigInteger.TEN.multiply(bigIntegerMultiply);
                iCompareTo3 = bigIntegerMultiply2.compareTo(x10);
                bigIntegerPow = bigIntegerMultiply;
                bigIntegerMultiply = bigIntegerMultiply2;
            }
            iCompareTo = i10;
        }
        switch (a.f119390a[mode.ordinal()]) {
            case 1:
                i.k(iCompareTo == 0);
                return iK;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                if (!bigIntegerPow.equals(x10)) {
                    iK++;
                }
                break;
            case 6:
            case 7:
            case 8:
                if (x10.pow(2).compareTo(bigIntegerPow.pow(2).multiply(BigInteger.TEN)) > 0) {
                    return iK + 1;
                }
                break;
            default:
                throw new AssertionError();
        }
        return iK;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int k(BigInteger x10, RoundingMode mode) {
        i.j("x", (BigInteger) j0.E(x10));
        int iBitLength = x10.bitLength();
        int i10 = iBitLength - 1;
        switch (a.f119390a[mode.ordinal()]) {
            case 1:
                i.k(g(x10));
                return i10;
            case 2:
            case 3:
            case 4:
            case 5:
                return g(x10) ? i10 : iBitLength;
            case 6:
            case 7:
            case 8:
                if (i10 < 256) {
                    if (x10.compareTo(f119387b.shiftRight(256 - i10)) > 0) {
                        return iBitLength;
                    }
                } else if (x10.pow(2).bitLength() - 1 >= (i10 * 2) + 1) {
                    return iBitLength;
                }
            default:
                throw new AssertionError();
        }
    }

    @com.google.common.annotations.c
    public static double l(BigInteger x10, RoundingMode mode) {
        return C1107b.f119391a.b(x10, mode);
    }

    @com.google.common.annotations.c
    public static BigInteger m(BigInteger x10, RoundingMode mode) {
        i.g("x", x10);
        if (e(x10)) {
            return BigInteger.valueOf(h.B(x10.longValue(), mode));
        }
        BigInteger bigIntegerO = o(x10);
        switch (a.f119390a[mode.ordinal()]) {
            case 1:
                i.k(bigIntegerO.pow(2).equals(x10));
                return bigIntegerO;
            case 2:
            case 3:
                return bigIntegerO;
            case 4:
            case 5:
                int iIntValue = bigIntegerO.intValue();
                return (iIntValue * iIntValue == x10.intValue() && bigIntegerO.pow(2).equals(x10)) ? bigIntegerO : bigIntegerO.add(BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                return bigIntegerO.pow(2).add(bigIntegerO).compareTo(x10) >= 0 ? bigIntegerO : bigIntegerO.add(BigInteger.ONE);
            default:
                throw new AssertionError();
        }
    }

    @com.google.common.annotations.c
    private static BigInteger n(BigInteger x10) {
        return c.o(Math.sqrt(d.a(x10)), RoundingMode.HALF_EVEN);
    }

    @com.google.common.annotations.c
    private static BigInteger o(BigInteger x10) {
        BigInteger bigIntegerShiftLeft;
        int iK = k(x10, RoundingMode.FLOOR);
        if (iK < 1023) {
            bigIntegerShiftLeft = n(x10);
        } else {
            int i10 = (iK - 52) & (-2);
            bigIntegerShiftLeft = n(x10.shiftRight(i10)).shiftLeft(i10 >> 1);
        }
        BigInteger bigIntegerShiftRight = bigIntegerShiftLeft.add(x10.divide(bigIntegerShiftLeft)).shiftRight(1);
        if (bigIntegerShiftLeft.equals(bigIntegerShiftRight)) {
            return bigIntegerShiftLeft;
        }
        while (true) {
            BigInteger bigIntegerShiftRight2 = bigIntegerShiftRight.add(x10.divide(bigIntegerShiftRight)).shiftRight(1);
            if (bigIntegerShiftRight2.compareTo(bigIntegerShiftRight) >= 0) {
                return bigIntegerShiftRight;
            }
            bigIntegerShiftRight = bigIntegerShiftRight2;
        }
    }
}
