package com.google.common.primitives;

import com.google.common.base.j0;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f119809a = -1;

    enum a implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compare(long[] left, long[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                long j10 = left[i10];
                long j11 = right[i10];
                if (j10 != j11) {
                    return y.a(j10, j11);
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final long[] f119812a = new long[37];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int[] f119813b = new int[37];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int[] f119814c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i10 = 2; i10 <= 36; i10++) {
                long j10 = i10;
                f119812a[i10] = y.c(-1L, j10);
                f119813b[i10] = (int) y.k(-1L, j10);
                f119814c[i10] = bigInteger.toString(i10).length() - 1;
            }
        }

        private b() {
        }

        static boolean a(long current, int digit, int radix) {
            if (current < 0) {
                return true;
            }
            long j10 = f119812a[radix];
            if (current < j10) {
                return false;
            }
            return current > j10 || digit > f119813b[radix];
        }
    }

    private y() {
    }

    public static int a(long a10, long b10) {
        return n.e(d(a10), d(b10));
    }

    @z7.a
    public static long b(String stringValue) {
        p pVarA = p.a(stringValue);
        try {
            return j(pVarA.f119768a, pVarA.f119769b);
        } catch (NumberFormatException e10) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + stringValue);
            numberFormatException.initCause(e10);
            throw numberFormatException;
        }
    }

    public static long c(long dividend, long divisor) {
        if (divisor < 0) {
            return a(dividend, divisor) < 0 ? 0L : 1L;
        }
        if (dividend >= 0) {
            return dividend / divisor;
        }
        long j10 = ((dividend >>> 1) / divisor) << 1;
        return j10 + ((long) (a(dividend - (j10 * divisor), divisor) < 0 ? 0 : 1));
    }

    private static long d(long a10) {
        return a10 ^ Long.MIN_VALUE;
    }

    public static String e(String separator, long... array) {
        j0.E(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 5);
        sb2.append(p(array[0]));
        for (int i10 = 1; i10 < array.length; i10++) {
            sb2.append(separator);
            sb2.append(p(array[i10]));
        }
        return sb2.toString();
    }

    public static Comparator<long[]> f() {
        return a.INSTANCE;
    }

    public static long g(long... array) {
        j0.d(array.length > 0);
        long jD = d(array[0]);
        for (int i10 = 1; i10 < array.length; i10++) {
            long jD2 = d(array[i10]);
            if (jD2 > jD) {
                jD = jD2;
            }
        }
        return d(jD);
    }

    public static long h(long... array) {
        j0.d(array.length > 0);
        long jD = d(array[0]);
        for (int i10 = 1; i10 < array.length; i10++) {
            long jD2 = d(array[i10]);
            if (jD2 < jD) {
                jD = jD2;
            }
        }
        return d(jD);
    }

    @z7.a
    public static long i(String string) {
        return j(string, 10);
    }

    @z7.a
    public static long j(String string, int radix) {
        j0.E(string);
        if (string.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (radix < 2 || radix > 36) {
            throw new NumberFormatException("illegal radix: " + radix);
        }
        int i10 = b.f119814c[radix] - 1;
        long j10 = 0;
        for (int i11 = 0; i11 < string.length(); i11++) {
            int iDigit = Character.digit(string.charAt(i11), radix);
            if (iDigit == -1) {
                throw new NumberFormatException(string);
            }
            if (i11 > i10 && b.a(j10, iDigit, radix)) {
                throw new NumberFormatException("Too large for unsigned long: " + string);
            }
            j10 = (j10 * ((long) radix)) + ((long) iDigit);
        }
        return j10;
    }

    public static long k(long dividend, long divisor) {
        if (divisor < 0) {
            return a(dividend, divisor) < 0 ? dividend : dividend - divisor;
        }
        if (dividend >= 0) {
            return dividend % divisor;
        }
        long j10 = dividend - ((((dividend >>> 1) / divisor) << 1) * divisor);
        if (a(j10, divisor) < 0) {
            divisor = 0;
        }
        return j10 - divisor;
    }

    public static void l(long[] array) {
        j0.E(array);
        m(array, 0, array.length);
    }

    public static void m(long[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        for (int i10 = fromIndex; i10 < toIndex; i10++) {
            array[i10] = d(array[i10]);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = d(array[fromIndex]);
            fromIndex++;
        }
    }

    public static void n(long[] array) {
        j0.E(array);
        o(array, 0, array.length);
    }

    public static void o(long[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        for (int i10 = fromIndex; i10 < toIndex; i10++) {
            array[i10] = Long.MAX_VALUE ^ array[i10];
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = array[fromIndex] ^ Long.MAX_VALUE;
            fromIndex++;
        }
    }

    public static String p(long x10) {
        return q(x10, 10);
    }

    public static String q(long x10, int radix) {
        j0.k(radix >= 2 && radix <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", radix);
        if (x10 == 0) {
            return com.facebook.appevents.p.f99189d0;
        }
        if (x10 > 0) {
            return Long.toString(x10, radix);
        }
        int i10 = 64;
        char[] cArr = new char[64];
        int i11 = radix - 1;
        if ((radix & i11) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(radix);
            do {
                i10--;
                cArr[i10] = Character.forDigit(((int) x10) & i11, radix);
                x10 >>>= iNumberOfTrailingZeros;
            } while (x10 != 0);
        } else {
            long jC = (radix & 1) == 0 ? (x10 >>> 1) / ((long) (radix >>> 1)) : c(x10, radix);
            long j10 = radix;
            int i12 = 63;
            cArr[63] = Character.forDigit((int) (x10 - (jC * j10)), radix);
            while (jC > 0) {
                i12--;
                cArr[i12] = Character.forDigit((int) (jC % j10), radix);
                jC /= j10;
            }
            i10 = i12;
        }
        return new String(cArr, i10, 64 - i10);
    }
}
