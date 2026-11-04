package com.google.common.primitives;

import com.google.common.base.j0;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f119801a = 4294967295L;

    enum a implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compare(int[] left, int[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int i11 = left[i10];
                int i12 = right[i10];
                if (i11 != i12) {
                    return w.b(i11, i12);
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }

    private w() {
    }

    public static int a(long value) {
        j0.p((value >> 32) == 0, "out of range: %s", value);
        return (int) value;
    }

    public static int b(int a10, int b10) {
        return l.f(e(a10), e(b10));
    }

    @z7.a
    public static int c(String stringValue) {
        p pVarA = p.a(stringValue);
        try {
            return k(pVarA.f119768a, pVarA.f119769b);
        } catch (NumberFormatException e10) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + stringValue);
            numberFormatException.initCause(e10);
            throw numberFormatException;
        }
    }

    public static int d(int dividend, int divisor) {
        return (int) (r(dividend) / r(divisor));
    }

    static int e(int value) {
        return value ^ Integer.MIN_VALUE;
    }

    public static String f(String separator, int... array) {
        j0.E(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 5);
        sb2.append(s(array[0]));
        for (int i10 = 1; i10 < array.length; i10++) {
            sb2.append(separator);
            sb2.append(s(array[i10]));
        }
        return sb2.toString();
    }

    public static Comparator<int[]> g() {
        return a.INSTANCE;
    }

    public static int h(int... array) {
        j0.d(array.length > 0);
        int iE = e(array[0]);
        for (int i10 = 1; i10 < array.length; i10++) {
            int iE2 = e(array[i10]);
            if (iE2 > iE) {
                iE = iE2;
            }
        }
        return e(iE);
    }

    public static int i(int... array) {
        j0.d(array.length > 0);
        int iE = e(array[0]);
        for (int i10 = 1; i10 < array.length; i10++) {
            int iE2 = e(array[i10]);
            if (iE2 < iE) {
                iE = iE2;
            }
        }
        return e(iE);
    }

    @z7.a
    public static int j(String s10) {
        return k(s10, 10);
    }

    @z7.a
    public static int k(String string, int radix) {
        j0.E(string);
        long j10 = Long.parseLong(string, radix);
        if ((4294967295L & j10) == j10) {
            return (int) j10;
        }
        throw new NumberFormatException("Input " + string + " in base " + radix + " is not in the range of an unsigned integer");
    }

    public static int l(int dividend, int divisor) {
        return (int) (r(dividend) % r(divisor));
    }

    public static int m(long value) {
        if (value <= 0) {
            return 0;
        }
        if (value >= 4294967296L) {
            return -1;
        }
        return (int) value;
    }

    public static void n(int[] array) {
        j0.E(array);
        o(array, 0, array.length);
    }

    public static void o(int[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        for (int i10 = fromIndex; i10 < toIndex; i10++) {
            array[i10] = e(array[i10]);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = e(array[fromIndex]);
            fromIndex++;
        }
    }

    public static void p(int[] array) {
        j0.E(array);
        q(array, 0, array.length);
    }

    public static void q(int[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        for (int i10 = fromIndex; i10 < toIndex; i10++) {
            array[i10] = Integer.MAX_VALUE ^ array[i10];
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = array[fromIndex] ^ Integer.MAX_VALUE;
            fromIndex++;
        }
    }

    public static long r(int value) {
        return ((long) value) & 4294967295L;
    }

    public static String s(int x10) {
        return t(x10, 10);
    }

    public static String t(int x10, int radix) {
        return Long.toString(((long) x10) & 4294967295L, radix);
    }
}
