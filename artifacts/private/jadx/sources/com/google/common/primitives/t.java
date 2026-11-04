package com.google.common.primitives;

import com.google.common.base.j0;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte f119782a = 64;

    private enum a implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] left, byte[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Byte.compare(left[i10], right[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }

    private t() {
    }

    public static byte a(long value) {
        byte b10 = (byte) value;
        j0.p(((long) b10) == value, "Out of range: %s", value);
        return b10;
    }

    public static int b(byte a10, byte b10) {
        return Byte.compare(a10, b10);
    }

    public static String c(String separator, byte... array) {
        j0.E(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 5);
        sb2.append((int) array[0]);
        for (int i10 = 1; i10 < array.length; i10++) {
            sb2.append(separator);
            sb2.append((int) array[i10]);
        }
        return sb2.toString();
    }

    public static Comparator<byte[]> d() {
        return a.INSTANCE;
    }

    public static byte e(byte... array) {
        j0.d(array.length > 0);
        byte b10 = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            byte b11 = array[i10];
            if (b11 > b10) {
                b10 = b11;
            }
        }
        return b10;
    }

    public static byte f(byte... array) {
        j0.d(array.length > 0);
        byte b10 = array[0];
        for (int i10 = 1; i10 < array.length; i10++) {
            byte b11 = array[i10];
            if (b11 < b10) {
                b10 = b11;
            }
        }
        return b10;
    }

    public static byte g(long value) {
        if (value > 127) {
            return (byte) 127;
        }
        if (value < -128) {
            return (byte) -128;
        }
        return (byte) value;
    }

    public static void h(byte[] array) {
        j0.E(array);
        i(array, 0, array.length);
    }

    public static void i(byte[] array, int fromIndex, int toIndex) {
        j0.E(array);
        j0.f0(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        b.o(array, fromIndex, toIndex);
    }
}
