package org.apache.commons.lang3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f337035a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f337036b = new Class[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f337037c = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f337038d = new long[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Long[] f337039e = new Long[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f337040f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Integer[] f337041g = new Integer[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final short[] f337042h = new short[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Short[] f337043i = new Short[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f337044j = new byte[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Byte[] f337045k = new Byte[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final double[] f337046l = new double[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Double[] f337047m = new Double[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float[] f337048n = new float[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Float[] f337049o = new Float[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean[] f337050p = new boolean[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Boolean[] f337051q = new Boolean[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final char[] f337052r = new char[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Character[] f337053s = new Character[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f337054t = -1;

    /* JADX INFO: Add missing generic type declarations: [T] */
    static class a<T> implements Comparator<T> {
        a() {
        }

        /* JADX WARN: Incorrect types in method signature: (TT;TT;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static short[] A(short[] sArr, short... sArr2) {
        if (sArr == null) {
            return J(sArr2);
        }
        if (sArr2 == null) {
            return J(sArr);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    public static boolean[] A0(int i10, boolean[] zArr, boolean... zArr2) {
        if (zArr == null) {
            return null;
        }
        if (zArr2 == null || zArr2.length == 0) {
            return K(zArr);
        }
        if (i10 < 0 || i10 > zArr.length) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Length: " + zArr.length);
        }
        boolean[] zArr3 = new boolean[zArr.length + zArr2.length];
        System.arraycopy(zArr2, 0, zArr3, i10, zArr2.length);
        if (i10 > 0) {
            System.arraycopy(zArr, 0, zArr3, 0, i10);
        }
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i10, zArr3, zArr2.length + i10, zArr.length - i10);
        }
        return zArr3;
    }

    public static int A1(long[] jArr, long j10) {
        return B1(jArr, j10, Integer.MAX_VALUE);
    }

    public static float[] A2(float[] fArr, float f10) {
        int iG0 = g0(fArr, f10);
        if (iG0 == -1) {
            return F(fArr);
        }
        int[] iArr = new int[fArr.length - iG0];
        iArr[0] = iG0;
        int i10 = 1;
        while (true) {
            int iH0 = h0(fArr, f10, iArr[i10 - 1] + 1);
            if (iH0 == -1) {
                return r2(fArr, Arrays.copyOf(iArr, i10));
            }
            iArr[i10] = iH0;
            i10++;
        }
    }

    public static void A3(long[] jArr, int i10) {
        if (jArr == null) {
            return;
        }
        B3(jArr, 0, jArr.length, i10);
    }

    public static void A4(boolean[] zArr, int i10, int i11, int i12) {
        if (zArr != null && zArr.length != 0 && i10 < zArr.length && i11 < zArr.length) {
            int i13 = 0;
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            int iMin = Math.min(Math.min(i12, zArr.length - i10), zArr.length - i11);
            while (i13 < iMin) {
                boolean z10 = zArr[i10];
                zArr[i10] = zArr[i11];
                zArr[i11] = z10;
                i13++;
                i10++;
                i11++;
            }
        }
    }

    public static boolean[] B(boolean[] zArr, boolean... zArr2) {
        if (zArr == null) {
            return K(zArr2);
        }
        if (zArr2 == null) {
            return K(zArr);
        }
        boolean[] zArr3 = new boolean[zArr.length + zArr2.length];
        System.arraycopy(zArr, 0, zArr3, 0, zArr.length);
        System.arraycopy(zArr2, 0, zArr3, zArr.length, zArr2.length);
        return zArr3;
    }

    public static boolean B0(byte[] bArr) {
        return W(bArr) == 0;
    }

    public static int B1(long[] jArr, long j10, int i10) {
        if (jArr != null && i10 >= 0) {
            if (i10 >= jArr.length) {
                i10 = jArr.length - 1;
            }
            while (i10 >= 0) {
                if (j10 == jArr[i10]) {
                    return i10;
                }
                i10--;
            }
            return -1;
        }
        return -1;
    }

    public static int[] B2(int[] iArr, int i10) {
        int iI0 = i0(iArr, i10);
        if (iI0 == -1) {
            return G(iArr);
        }
        int[] iArr2 = new int[iArr.length - iI0];
        iArr2[0] = iI0;
        int i11 = 1;
        while (true) {
            int iJ0 = j0(iArr, i10, iArr2[i11 - 1] + 1);
            if (iJ0 == -1) {
                return s2(iArr, Arrays.copyOf(iArr2, i11));
            }
            iArr2[i11] = iJ0;
            i11++;
        }
    }

    public static void B3(long[] jArr, int i10, int i11, int i12) {
        if (jArr != null && i10 < jArr.length - 1 && i11 > 0) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 >= jArr.length) {
                i11 = jArr.length;
            }
            int i13 = i11 - i10;
            if (i13 <= 1) {
                return;
            }
            int i14 = i12 % i13;
            if (i14 < 0) {
                i14 += i13;
            }
            while (i13 > 1 && i14 > 0) {
                int i15 = i13 - i14;
                if (i14 > i15) {
                    u4(jArr, i10, (i13 + i10) - i15, i15);
                    int i16 = i14;
                    i14 -= i15;
                    i13 = i16;
                } else if (i14 >= i15) {
                    u4(jArr, i10, i15 + i10, i14);
                    return;
                } else {
                    u4(jArr, i10, i10 + i15, i14);
                    i10 += i14;
                    i13 = i15;
                }
            }
        }
    }

    public static <T> T[] B4(T... tArr) {
        return tArr;
    }

    public static byte[] C(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static boolean C0(char[] cArr) {
        return W(cArr) == 0;
    }

    public static int C1(Object[] objArr, Object obj) {
        return D1(objArr, obj, Integer.MAX_VALUE);
    }

    public static long[] C2(long[] jArr, long j10) {
        int iK0 = k0(jArr, j10);
        if (iK0 == -1) {
            return H(jArr);
        }
        int[] iArr = new int[jArr.length - iK0];
        iArr[0] = iK0;
        int i10 = 1;
        while (true) {
            int iL0 = l0(jArr, j10, iArr[i10 - 1] + 1);
            if (iL0 == -1) {
                return t2(jArr, Arrays.copyOf(iArr, i10));
            }
            iArr[i10] = iL0;
            i10++;
        }
    }

    public static void C3(Object[] objArr, int i10) {
        if (objArr == null) {
            return;
        }
        D3(objArr, 0, objArr.length, i10);
    }

    public static Map<Object, Object> C4(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        HashMap map = new HashMap((int) (((double) objArr.length) * 1.5d));
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                map.put(entry.getKey(), entry.getValue());
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Array element " + i10 + ", '" + obj + "', is neither of type Map.Entry nor an Array");
                }
                Object[] objArr2 = (Object[]) obj;
                if (objArr2.length < 2) {
                    throw new IllegalArgumentException("Array element " + i10 + ", '" + obj + "', has a length less than 2");
                }
                map.put(objArr2[0], objArr2[1]);
            }
        }
        return map;
    }

    public static char[] D(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }

    public static boolean D0(double[] dArr) {
        return W(dArr) == 0;
    }

    public static int D1(Object[] objArr, Object obj, int i10) {
        if (objArr != null && i10 >= 0) {
            if (i10 >= objArr.length) {
                i10 = objArr.length - 1;
            }
            if (obj == null) {
                while (i10 >= 0) {
                    if (objArr[i10] == null) {
                        return i10;
                    }
                    i10--;
                }
            } else if (objArr.getClass().getComponentType().isInstance(obj)) {
                while (i10 >= 0) {
                    if (obj.equals(objArr[i10])) {
                        return i10;
                    }
                    i10--;
                }
            }
            return -1;
        }
        return -1;
    }

    public static <T> T[] D2(T[] tArr, T t10) {
        int iM0 = m0(tArr, t10);
        if (iM0 == -1) {
            return (T[]) I(tArr);
        }
        int[] iArr = new int[tArr.length - iM0];
        iArr[0] = iM0;
        int i10 = 1;
        while (true) {
            int iN0 = n0(tArr, t10, iArr[i10 - 1] + 1);
            if (iN0 == -1) {
                return (T[]) u2(tArr, Arrays.copyOf(iArr, i10));
            }
            iArr[i10] = iN0;
            i10++;
        }
    }

    public static void D3(Object[] objArr, int i10, int i11, int i12) {
        if (objArr != null && i10 < objArr.length - 1 && i11 > 0) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 >= objArr.length) {
                i11 = objArr.length;
            }
            int i13 = i11 - i10;
            if (i13 <= 1) {
                return;
            }
            int i14 = i12 % i13;
            if (i14 < 0) {
                i14 += i13;
            }
            while (i13 > 1 && i14 > 0) {
                int i15 = i13 - i14;
                if (i14 > i15) {
                    w4(objArr, i10, (i13 + i10) - i15, i15);
                    int i16 = i14;
                    i14 -= i15;
                    i13 = i16;
                } else if (i14 >= i15) {
                    w4(objArr, i10, i15 + i10, i14);
                    return;
                } else {
                    w4(objArr, i10, i10 + i15, i14);
                    i10 += i14;
                    i13 = i15;
                }
            }
        }
    }

    public static Boolean[] D4(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return f337051q;
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i10 = 0; i10 < zArr.length; i10++) {
            boolArr[i10] = zArr[i10] ? Boolean.TRUE : Boolean.FALSE;
        }
        return boolArr;
    }

    public static double[] E(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return (double[]) dArr.clone();
    }

    public static boolean E0(float[] fArr) {
        return W(fArr) == 0;
    }

    public static int E1(short[] sArr, short s10) {
        return F1(sArr, s10, Integer.MAX_VALUE);
    }

    public static short[] E2(short[] sArr, short s10) {
        int iO0 = o0(sArr, s10);
        if (iO0 == -1) {
            return J(sArr);
        }
        int[] iArr = new int[sArr.length - iO0];
        iArr[0] = iO0;
        int i10 = 1;
        while (true) {
            int iP0 = p0(sArr, s10, iArr[i10 - 1] + 1);
            if (iP0 == -1) {
                return v2(sArr, Arrays.copyOf(iArr, i10));
            }
            iArr[i10] = iP0;
            i10++;
        }
    }

    public static void E3(short[] sArr, int i10) {
        if (sArr == null) {
            return;
        }
        F3(sArr, 0, sArr.length, i10);
    }

    public static Byte[] E4(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f337045k;
        }
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    public static float[] F(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return (float[]) fArr.clone();
    }

    public static boolean F0(int[] iArr) {
        return W(iArr) == 0;
    }

    public static int F1(short[] sArr, short s10, int i10) {
        if (sArr == null || i10 < 0) {
            return -1;
        }
        if (i10 >= sArr.length) {
            i10 = sArr.length - 1;
        }
        while (i10 >= 0) {
            if (s10 == sArr[i10]) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static boolean[] F2(boolean[] zArr, boolean z10) {
        int iQ0 = q0(zArr, z10);
        if (iQ0 == -1) {
            return K(zArr);
        }
        int[] iArr = new int[zArr.length - iQ0];
        iArr[0] = iQ0;
        int i10 = 1;
        while (true) {
            int iR0 = r0(zArr, z10, iArr[i10 - 1] + 1);
            if (iR0 == -1) {
                return w2(zArr, Arrays.copyOf(iArr, i10));
            }
            iArr[i10] = iR0;
            i10++;
        }
    }

    public static void F3(short[] sArr, int i10, int i11, int i12) {
        if (sArr != null && i10 < sArr.length - 1 && i11 > 0) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 >= sArr.length) {
                i11 = sArr.length;
            }
            int i13 = i11 - i10;
            if (i13 <= 1) {
                return;
            }
            int i14 = i12 % i13;
            if (i14 < 0) {
                i14 += i13;
            }
            while (i13 > 1 && i14 > 0) {
                int i15 = i13 - i14;
                if (i14 > i15) {
                    y4(sArr, i10, (i13 + i10) - i15, i15);
                    int i16 = i14;
                    i14 -= i15;
                    i13 = i16;
                } else if (i14 >= i15) {
                    y4(sArr, i10, i15 + i10, i14);
                    return;
                } else {
                    y4(sArr, i10, i10 + i15, i14);
                    i10 += i14;
                    i13 = i15;
                }
            }
        }
    }

    public static Character[] F4(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return f337053s;
        }
        Character[] chArr = new Character[cArr.length];
        for (int i10 = 0; i10 < cArr.length; i10++) {
            chArr[i10] = Character.valueOf(cArr[i10]);
        }
        return chArr;
    }

    public static int[] G(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static boolean G0(long[] jArr) {
        return W(jArr) == 0;
    }

    public static int G1(boolean[] zArr, boolean z10) {
        return H1(zArr, z10, Integer.MAX_VALUE);
    }

    public static byte[] G2(byte[] bArr, byte b10) {
        int iY = Y(bArr, b10);
        return iY == -1 ? C(bArr) : d2(bArr, iY);
    }

    public static void G3(boolean[] zArr, int i10) {
        if (zArr == null) {
            return;
        }
        H3(zArr, 0, zArr.length, i10);
    }

    public static Double[] G4(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f337047m;
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    public static long[] H(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public static boolean H0(Object[] objArr) {
        return W(objArr) == 0;
    }

    public static int H1(boolean[] zArr, boolean z10, int i10) {
        if (J0(zArr) || i10 < 0) {
            return -1;
        }
        if (i10 >= zArr.length) {
            i10 = zArr.length - 1;
        }
        while (i10 >= 0) {
            if (z10 == zArr[i10]) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static char[] H2(char[] cArr, char c10) {
        int iA0 = a0(cArr, c10);
        return iA0 == -1 ? D(cArr) : e2(cArr, iA0);
    }

    public static void H3(boolean[] zArr, int i10, int i11, int i12) {
        if (zArr != null && i10 < zArr.length - 1 && i11 > 0) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 >= zArr.length) {
                i11 = zArr.length;
            }
            int i13 = i11 - i10;
            if (i13 <= 1) {
                return;
            }
            int i14 = i12 % i13;
            if (i14 < 0) {
                i14 += i13;
            }
            while (i13 > 1 && i14 > 0) {
                int i15 = i13 - i14;
                if (i14 > i15) {
                    A4(zArr, i10, (i13 + i10) - i15, i15);
                    int i16 = i14;
                    i14 -= i15;
                    i13 = i16;
                } else if (i14 >= i15) {
                    A4(zArr, i10, i15 + i10, i14);
                    return;
                } else {
                    A4(zArr, i10, i10 + i15, i14);
                    i10 += i14;
                    i13 = i15;
                }
            }
        }
    }

    public static Float[] H4(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f337049o;
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    public static <T> T[] I(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) ((Object[]) tArr.clone());
    }

    public static boolean I0(short[] sArr) {
        return W(sArr) == 0;
    }

    public static byte[] I1(byte[] bArr) {
        return B0(bArr) ? f337044j : bArr;
    }

    public static double[] I2(double[] dArr, double d10) {
        int iC0 = c0(dArr, d10);
        return iC0 == -1 ? E(dArr) : f2(dArr, iC0);
    }

    public static void I3(byte[] bArr) {
        J3(bArr, new Random());
    }

    public static Integer[] I4(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return f337041g;
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    public static short[] J(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static boolean J0(boolean[] zArr) {
        return W(zArr) == 0;
    }

    public static char[] J1(char[] cArr) {
        return C0(cArr) ? f337052r : cArr;
    }

    public static float[] J2(float[] fArr, float f10) {
        int iG0 = g0(fArr, f10);
        return iG0 == -1 ? F(fArr) : g2(fArr, iG0);
    }

    public static void J3(byte[] bArr, Random random) {
        for (int length = bArr.length; length > 1; length--) {
            k4(bArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static Long[] J4(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return f337039e;
        }
        Long[] lArr = new Long[jArr.length];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    public static boolean[] K(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    @Deprecated
    public static boolean K0(Object obj, Object obj2) {
        return new org.apache.commons.lang3.builder.g().g(obj, obj2).x();
    }

    public static double[] K1(double[] dArr) {
        if (D0(dArr)) {
            dArr = f337046l;
        }
        return dArr;
    }

    public static int[] K2(int[] iArr, int i10) {
        int iI0 = i0(iArr, i10);
        return iI0 == -1 ? G(iArr) : h2(iArr, iI0);
    }

    public static void K3(char[] cArr) {
        L3(cArr, new Random());
    }

    public static Short[] K4(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return f337043i;
        }
        Short[] shArr = new Short[sArr.length];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            shArr[i10] = Short.valueOf(sArr[i10]);
        }
        return shArr;
    }

    public static boolean L(byte[] bArr, byte b10) {
        return Y(bArr, b10) != -1;
    }

    public static boolean L0(byte[] bArr) {
        return !B0(bArr);
    }

    public static float[] L1(float[] fArr) {
        return E0(fArr) ? f337048n : fArr;
    }

    public static long[] L2(long[] jArr, long j10) {
        int iK0 = k0(jArr, j10);
        return iK0 == -1 ? H(jArr) : i2(jArr, iK0);
    }

    public static void L3(char[] cArr, Random random) {
        for (int length = cArr.length; length > 1; length--) {
            m4(cArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static Object L4(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> clsY = m.Y(obj.getClass().getComponentType());
        if (Integer.TYPE.equals(clsY)) {
            return U4((Integer[]) obj);
        }
        if (Long.TYPE.equals(clsY)) {
            return W4((Long[]) obj);
        }
        if (Short.TYPE.equals(clsY)) {
            return Y4((Short[]) obj);
        }
        if (Double.TYPE.equals(clsY)) {
            return Q4((Double[]) obj);
        }
        if (Float.TYPE.equals(clsY)) {
            obj = S4((Float[]) obj);
        }
        return obj;
    }

    public static boolean M(char[] cArr, char c10) {
        return a0(cArr, c10) != -1;
    }

    public static boolean M0(char[] cArr) {
        return !C0(cArr);
    }

    public static int[] M1(int[] iArr) {
        return F0(iArr) ? f337040f : iArr;
    }

    public static <T> T[] M2(T[] tArr, Object obj) {
        int iM0 = m0(tArr, obj);
        return iM0 == -1 ? (T[]) I(tArr) : (T[]) j2(tArr, iM0);
    }

    public static void M3(double[] dArr) {
        N3(dArr, new Random());
    }

    public static byte[] M4(Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f337044j;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = bArr[i10].byteValue();
        }
        return bArr2;
    }

    public static boolean N(double[] dArr, double d10) {
        return c0(dArr, d10) != -1;
    }

    public static boolean N0(double[] dArr) {
        return !D0(dArr);
    }

    public static long[] N1(long[] jArr) {
        if (G0(jArr)) {
            jArr = f337038d;
        }
        return jArr;
    }

    public static short[] N2(short[] sArr, short s10) {
        int iO0 = o0(sArr, s10);
        return iO0 == -1 ? J(sArr) : k2(sArr, iO0);
    }

    public static void N3(double[] dArr, Random random) {
        for (int length = dArr.length; length > 1; length--) {
            o4(dArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static byte[] N4(Byte[] bArr, byte b10) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f337044j;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            Byte b11 = bArr[i10];
            bArr2[i10] = b11 == null ? b10 : b11.byteValue();
        }
        return bArr2;
    }

    public static boolean O(double[] dArr, double d10, double d11) {
        return f0(dArr, d10, 0, d11) != -1;
    }

    public static boolean O0(float[] fArr) {
        return !E0(fArr);
    }

    public static Boolean[] O1(Boolean[] boolArr) {
        return H0(boolArr) ? f337051q : boolArr;
    }

    public static boolean[] O2(boolean[] zArr, boolean z10) {
        int iQ0 = q0(zArr, z10);
        return iQ0 == -1 ? K(zArr) : l2(zArr, iQ0);
    }

    public static void O3(float[] fArr) {
        P3(fArr, new Random());
    }

    public static char[] O4(Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return f337052r;
        }
        char[] cArr = new char[chArr.length];
        for (int i10 = 0; i10 < chArr.length; i10++) {
            cArr[i10] = chArr[i10].charValue();
        }
        return cArr;
    }

    public static boolean P(float[] fArr, float f10) {
        return g0(fArr, f10) != -1;
    }

    public static boolean P0(int[] iArr) {
        return !F0(iArr);
    }

    public static Byte[] P1(Byte[] bArr) {
        if (H0(bArr)) {
            bArr = f337045k;
        }
        return bArr;
    }

    public static byte[] P2(byte[] bArr, byte... bArr2) {
        if (B0(bArr) || B0(bArr2)) {
            return C(bArr);
        }
        HashMap map = new HashMap(bArr2.length);
        for (byte b10 : bArr2) {
            Byte bValueOf = Byte.valueOf(b10);
            tk.f fVar = (tk.f) map.get(bValueOf);
            if (fVar == null) {
                map.put(bValueOf, new tk.f(1));
            } else {
                fVar.s();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b11 = bArr[i10];
            tk.f fVar2 = (tk.f) map.get(Byte.valueOf(b11));
            if (fVar2 != null) {
                if (fVar2.l() == 0) {
                    map.remove(Byte.valueOf(b11));
                }
                bitSet.set(i10);
            }
        }
        return (byte[]) m2(bArr, bitSet);
    }

    public static void P3(float[] fArr, Random random) {
        for (int length = fArr.length; length > 1; length--) {
            q4(fArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static char[] P4(Character[] chArr, char c10) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return f337052r;
        }
        char[] cArr = new char[chArr.length];
        for (int i10 = 0; i10 < chArr.length; i10++) {
            Character ch2 = chArr[i10];
            cArr[i10] = ch2 == null ? c10 : ch2.charValue();
        }
        return cArr;
    }

    public static boolean Q(int[] iArr, int i10) {
        return i0(iArr, i10) != -1;
    }

    public static boolean Q0(long[] jArr) {
        return !G0(jArr);
    }

    public static Character[] Q1(Character[] chArr) {
        if (H0(chArr)) {
            chArr = f337053s;
        }
        return chArr;
    }

    public static char[] Q2(char[] cArr, char... cArr2) {
        if (C0(cArr) || C0(cArr2)) {
            return D(cArr);
        }
        HashMap map = new HashMap(cArr2.length);
        for (char c10 : cArr2) {
            Character chValueOf = Character.valueOf(c10);
            tk.f fVar = (tk.f) map.get(chValueOf);
            if (fVar == null) {
                map.put(chValueOf, new tk.f(1));
            } else {
                fVar.s();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c11 = cArr[i10];
            tk.f fVar2 = (tk.f) map.get(Character.valueOf(c11));
            if (fVar2 != null) {
                if (fVar2.l() == 0) {
                    map.remove(Character.valueOf(c11));
                }
                bitSet.set(i10);
            }
        }
        return (char[]) m2(cArr, bitSet);
    }

    public static void Q3(int[] iArr) {
        R3(iArr, new Random());
    }

    public static double[] Q4(Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f337046l;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr2[i10] = dArr[i10].doubleValue();
        }
        return dArr2;
    }

    public static boolean R(long[] jArr, long j10) {
        return k0(jArr, j10) != -1;
    }

    public static <T> boolean R0(T[] tArr) {
        return !H0(tArr);
    }

    public static Class<?>[] R1(Class<?>[] clsArr) {
        return H0(clsArr) ? f337036b : clsArr;
    }

    public static double[] R2(double[] dArr, double... dArr2) {
        if (D0(dArr) || D0(dArr2)) {
            return E(dArr);
        }
        HashMap map = new HashMap(dArr2.length);
        for (double d10 : dArr2) {
            Double dValueOf = Double.valueOf(d10);
            tk.f fVar = (tk.f) map.get(dValueOf);
            if (fVar == null) {
                map.put(dValueOf, new tk.f(1));
            } else {
                fVar.s();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i10 = 0; i10 < dArr.length; i10++) {
            double d11 = dArr[i10];
            tk.f fVar2 = (tk.f) map.get(Double.valueOf(d11));
            if (fVar2 != null) {
                if (fVar2.l() == 0) {
                    map.remove(Double.valueOf(d11));
                }
                bitSet.set(i10);
            }
        }
        return (double[]) m2(dArr, bitSet);
    }

    public static void R3(int[] iArr, Random random) {
        for (int length = iArr.length; length > 1; length--) {
            s4(iArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static double[] R4(Double[] dArr, double d10) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f337046l;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            Double d11 = dArr[i10];
            dArr2[i10] = d11 == null ? d10 : d11.doubleValue();
        }
        return dArr2;
    }

    public static boolean S(Object[] objArr, Object obj) {
        return m0(objArr, obj) != -1;
    }

    public static boolean S0(short[] sArr) {
        return !I0(sArr);
    }

    public static Double[] S1(Double[] dArr) {
        return H0(dArr) ? f337047m : dArr;
    }

    public static float[] S2(float[] fArr, float... fArr2) {
        if (E0(fArr) || E0(fArr2)) {
            return F(fArr);
        }
        HashMap map = new HashMap(fArr2.length);
        for (float f10 : fArr2) {
            Float fValueOf = Float.valueOf(f10);
            tk.f fVar = (tk.f) map.get(fValueOf);
            if (fVar == null) {
                map.put(fValueOf, new tk.f(1));
            } else {
                fVar.s();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i10 = 0; i10 < fArr.length; i10++) {
            float f11 = fArr[i10];
            tk.f fVar2 = (tk.f) map.get(Float.valueOf(f11));
            if (fVar2 != null) {
                if (fVar2.l() == 0) {
                    map.remove(Float.valueOf(f11));
                }
                bitSet.set(i10);
            }
        }
        return (float[]) m2(fArr, bitSet);
    }

    public static void S3(long[] jArr) {
        T3(jArr, new Random());
    }

    public static float[] S4(Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f337048n;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = fArr[i10].floatValue();
        }
        return fArr2;
    }

    public static boolean T(short[] sArr, short s10) {
        return o0(sArr, s10) != -1;
    }

    public static boolean T0(boolean[] zArr) {
        return !J0(zArr);
    }

    public static Float[] T1(Float[] fArr) {
        if (H0(fArr)) {
            fArr = f337049o;
        }
        return fArr;
    }

    public static int[] T2(int[] iArr, int... iArr2) {
        if (F0(iArr) || F0(iArr2)) {
            return G(iArr);
        }
        HashMap map = new HashMap(iArr2.length);
        for (int i10 : iArr2) {
            Integer numValueOf = Integer.valueOf(i10);
            tk.f fVar = (tk.f) map.get(numValueOf);
            if (fVar == null) {
                map.put(numValueOf, new tk.f(1));
            } else {
                fVar.s();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            tk.f fVar2 = (tk.f) map.get(Integer.valueOf(i12));
            if (fVar2 != null) {
                if (fVar2.l() == 0) {
                    map.remove(Integer.valueOf(i12));
                }
                bitSet.set(i11);
            }
        }
        return (int[]) m2(iArr, bitSet);
    }

    public static void T3(long[] jArr, Random random) {
        for (int length = jArr.length; length > 1; length--) {
            u4(jArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static float[] T4(Float[] fArr, float f10) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f337048n;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            Float f11 = fArr[i10];
            fArr2[i10] = f11 == null ? f10 : f11.floatValue();
        }
        return fArr2;
    }

    public static boolean U(boolean[] zArr, boolean z10) {
        return q0(zArr, z10) != -1;
    }

    public static boolean U0(byte[] bArr, byte[] bArr2) {
        return W(bArr) == W(bArr2);
    }

    public static Integer[] U1(Integer[] numArr) {
        return H0(numArr) ? f337041g : numArr;
    }

    public static long[] U2(long[] jArr, long... jArr2) {
        if (!G0(jArr) && !G0(jArr2)) {
            HashMap map = new HashMap(jArr2.length);
            for (long j10 : jArr2) {
                Long lValueOf = Long.valueOf(j10);
                tk.f fVar = (tk.f) map.get(lValueOf);
                if (fVar == null) {
                    map.put(lValueOf, new tk.f(1));
                } else {
                    fVar.s();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i10 = 0; i10 < jArr.length; i10++) {
                long j11 = jArr[i10];
                tk.f fVar2 = (tk.f) map.get(Long.valueOf(j11));
                if (fVar2 != null) {
                    if (fVar2.l() == 0) {
                        map.remove(Long.valueOf(j11));
                    }
                    bitSet.set(i10);
                }
            }
            return (long[]) m2(jArr, bitSet);
        }
        return H(jArr);
    }

    public static void U3(Object[] objArr) {
        V3(objArr, new Random());
    }

    public static int[] U4(Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return f337040f;
        }
        int[] iArr = new int[numArr.length];
        for (int i10 = 0; i10 < numArr.length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    private static Object V(Object obj, Class<?> cls) {
        if (obj == null) {
            return Array.newInstance(cls, 1);
        }
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        return objNewInstance;
    }

    public static boolean V0(char[] cArr, char[] cArr2) {
        return W(cArr) == W(cArr2);
    }

    public static Long[] V1(Long[] lArr) {
        return H0(lArr) ? f337039e : lArr;
    }

    @SafeVarargs
    public static <T> T[] V2(T[] tArr, T... tArr2) {
        if (!H0(tArr) && !H0(tArr2)) {
            HashMap map = new HashMap(tArr2.length);
            for (T t10 : tArr2) {
                tk.f fVar = (tk.f) map.get(t10);
                if (fVar == null) {
                    map.put(t10, new tk.f(1));
                } else {
                    fVar.s();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i10 = 0; i10 < tArr.length; i10++) {
                T t11 = tArr[i10];
                tk.f fVar2 = (tk.f) map.get(t11);
                if (fVar2 != null) {
                    if (fVar2.l() == 0) {
                        map.remove(t11);
                    }
                    bitSet.set(i10);
                }
            }
            return (T[]) ((Object[]) m2(tArr, bitSet));
        }
        return (T[]) I(tArr);
    }

    public static void V3(Object[] objArr, Random random) {
        for (int length = objArr.length; length > 1; length--) {
            w4(objArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static int[] V4(Integer[] numArr, int i10) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return f337040f;
        }
        int[] iArr = new int[numArr.length];
        for (int i11 = 0; i11 < numArr.length; i11++) {
            Integer num = numArr[i11];
            iArr[i11] = num == null ? i10 : num.intValue();
        }
        return iArr;
    }

    public static int W(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static boolean W0(double[] dArr, double[] dArr2) {
        return W(dArr) == W(dArr2);
    }

    public static Object[] W1(Object[] objArr) {
        return H0(objArr) ? f337035a : objArr;
    }

    public static short[] W2(short[] sArr, short... sArr2) {
        if (I0(sArr) || I0(sArr2)) {
            return J(sArr);
        }
        HashMap map = new HashMap(sArr2.length);
        for (short s10 : sArr2) {
            Short shValueOf = Short.valueOf(s10);
            tk.f fVar = (tk.f) map.get(shValueOf);
            if (fVar == null) {
                map.put(shValueOf, new tk.f(1));
            } else {
                fVar.s();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i10 = 0; i10 < sArr.length; i10++) {
            short s11 = sArr[i10];
            tk.f fVar2 = (tk.f) map.get(Short.valueOf(s11));
            if (fVar2 != null) {
                if (fVar2.l() == 0) {
                    map.remove(Short.valueOf(s11));
                }
                bitSet.set(i10);
            }
        }
        return (short[]) m2(sArr, bitSet);
    }

    public static void W3(short[] sArr) {
        X3(sArr, new Random());
    }

    public static long[] W4(Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return f337038d;
        }
        long[] jArr = new long[lArr.length];
        for (int i10 = 0; i10 < lArr.length; i10++) {
            jArr[i10] = lArr[i10].longValue();
        }
        return jArr;
    }

    public static int X(Object obj) {
        return new org.apache.commons.lang3.builder.i().g(obj).F();
    }

    public static boolean X0(float[] fArr, float[] fArr2) {
        return W(fArr) == W(fArr2);
    }

    public static <T> T[] X1(T[] tArr, Class<T[]> cls) {
        if (cls != null) {
            return tArr == null ? cls.cast(Array.newInstance(cls.getComponentType(), 0)) : tArr;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    public static boolean[] X2(boolean[] zArr, boolean... zArr2) {
        if (J0(zArr) || J0(zArr2)) {
            return K(zArr);
        }
        HashMap map = new HashMap(2);
        for (boolean z10 : zArr2) {
            Boolean boolValueOf = Boolean.valueOf(z10);
            tk.f fVar = (tk.f) map.get(boolValueOf);
            if (fVar == null) {
                map.put(boolValueOf, new tk.f(1));
            } else {
                fVar.s();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i10 = 0; i10 < zArr.length; i10++) {
            boolean z11 = zArr[i10];
            tk.f fVar2 = (tk.f) map.get(Boolean.valueOf(z11));
            if (fVar2 != null) {
                if (fVar2.l() == 0) {
                    map.remove(Boolean.valueOf(z11));
                }
                bitSet.set(i10);
            }
        }
        return (boolean[]) m2(zArr, bitSet);
    }

    public static void X3(short[] sArr, Random random) {
        for (int length = sArr.length; length > 1; length--) {
            y4(sArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static long[] X4(Long[] lArr, long j10) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return f337038d;
        }
        long[] jArr = new long[lArr.length];
        for (int i10 = 0; i10 < lArr.length; i10++) {
            Long l10 = lArr[i10];
            jArr[i10] = l10 == null ? j10 : l10.longValue();
        }
        return jArr;
    }

    public static int Y(byte[] bArr, byte b10) {
        return Z(bArr, b10, 0);
    }

    public static boolean Y0(int[] iArr, int[] iArr2) {
        return W(iArr) == W(iArr2);
    }

    public static Short[] Y1(Short[] shArr) {
        return H0(shArr) ? f337043i : shArr;
    }

    public static void Y2(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        Z2(bArr, 0, bArr.length);
    }

    public static void Y3(boolean[] zArr) {
        Z3(zArr, new Random());
    }

    public static short[] Y4(Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return f337042h;
        }
        short[] sArr = new short[shArr.length];
        for (int i10 = 0; i10 < shArr.length; i10++) {
            sArr[i10] = shArr[i10].shortValue();
        }
        return sArr;
    }

    public static int Z(byte[] bArr, byte b10, int i10) {
        if (bArr == null) {
            return -1;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < bArr.length) {
            if (b10 == bArr[i10]) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static boolean Z0(long[] jArr, long[] jArr2) {
        return W(jArr) == W(jArr2);
    }

    public static String[] Z1(String[] strArr) {
        return H0(strArr) ? f337037c : strArr;
    }

    public static void Z2(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iMin = Math.min(bArr.length, i11) - 1;
        while (iMin > i10) {
            byte b10 = bArr[iMin];
            bArr[iMin] = bArr[i10];
            bArr[i10] = b10;
            iMin--;
            i10++;
        }
    }

    public static void Z3(boolean[] zArr, Random random) {
        for (int length = zArr.length; length > 1; length--) {
            A4(zArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static short[] Z4(Short[] shArr, short s10) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return f337042h;
        }
        short[] sArr = new short[shArr.length];
        for (int i10 = 0; i10 < shArr.length; i10++) {
            Short sh2 = shArr[i10];
            sArr[i10] = sh2 == null ? s10 : sh2.shortValue();
        }
        return sArr;
    }

    private static Object a(Object obj, int i10, Object obj2, Class<?> cls) {
        if (obj == null) {
            if (i10 == 0) {
                Object objNewInstance = Array.newInstance(cls, 1);
                Array.set(objNewInstance, 0, obj2);
                return objNewInstance;
            }
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Length: 0");
        }
        int length = Array.getLength(obj);
        if (i10 > length || i10 < 0) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Length: " + length);
        }
        Object objNewInstance2 = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, objNewInstance2, 0, i10);
        Array.set(objNewInstance2, i10, obj2);
        if (i10 < length) {
            System.arraycopy(obj, i10, objNewInstance2, i10 + 1, length - i10);
        }
        return objNewInstance2;
    }

    public static int a0(char[] cArr, char c10) {
        return b0(cArr, c10, 0);
    }

    public static boolean a1(Object[] objArr, Object[] objArr2) {
        return W(objArr) == W(objArr2);
    }

    public static short[] a2(short[] sArr) {
        if (I0(sArr)) {
            sArr = f337042h;
        }
        return sArr;
    }

    public static void a3(char[] cArr) {
        if (cArr == null) {
            return;
        }
        b3(cArr, 0, cArr.length);
    }

    public static byte[] a4(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > bArr.length) {
            i11 = bArr.length;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return f337044j;
        }
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i10, bArr2, 0, i12);
        return bArr2;
    }

    public static boolean[] a5(Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return f337050p;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i10 = 0; i10 < boolArr.length; i10++) {
            zArr[i10] = boolArr[i10].booleanValue();
        }
        return zArr;
    }

    public static byte[] b(byte[] bArr, byte b10) {
        byte[] bArr2 = (byte[]) V(bArr, Byte.TYPE);
        bArr2[bArr2.length - 1] = b10;
        return bArr2;
    }

    public static int b0(char[] cArr, char c10, int i10) {
        if (cArr == null) {
            return -1;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < cArr.length) {
            if (c10 == cArr[i10]) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static boolean b1(short[] sArr, short[] sArr2) {
        return W(sArr) == W(sArr2);
    }

    public static boolean[] b2(boolean[] zArr) {
        if (J0(zArr)) {
            zArr = f337050p;
        }
        return zArr;
    }

    public static void b3(char[] cArr, int i10, int i11) {
        if (cArr == null) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iMin = Math.min(cArr.length, i11) - 1;
        while (iMin > i10) {
            char c10 = cArr[iMin];
            cArr[iMin] = cArr[i10];
            cArr[i10] = c10;
            iMin--;
            i10++;
        }
    }

    public static char[] b4(char[] cArr, int i10, int i11) {
        if (cArr == null) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > cArr.length) {
            i11 = cArr.length;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return f337052r;
        }
        char[] cArr2 = new char[i12];
        System.arraycopy(cArr, i10, cArr2, 0, i12);
        return cArr2;
    }

    public static boolean[] b5(Boolean[] boolArr, boolean z10) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return f337050p;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i10 = 0; i10 < boolArr.length; i10++) {
            Boolean bool = boolArr[i10];
            zArr[i10] = bool == null ? z10 : bool.booleanValue();
        }
        return zArr;
    }

    @Deprecated
    public static byte[] c(byte[] bArr, int i10, byte b10) {
        return (byte[]) a(bArr, i10, Byte.valueOf(b10), Byte.TYPE);
    }

    public static int c0(double[] dArr, double d10) {
        return e0(dArr, d10, 0);
    }

    public static boolean c1(boolean[] zArr, boolean[] zArr2) {
        return W(zArr) == W(zArr2);
    }

    private static Object c2(Object obj, int i10) {
        int iW = W(obj);
        if (i10 < 0 || i10 >= iW) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Length: " + iW);
        }
        int i11 = iW - 1;
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), i11);
        System.arraycopy(obj, 0, objNewInstance, 0, i10);
        if (i10 < i11) {
            System.arraycopy(obj, i10 + 1, objNewInstance, i10, (iW - i10) - 1);
        }
        return objNewInstance;
    }

    public static void c3(double[] dArr) {
        if (dArr == null) {
            return;
        }
        d3(dArr, 0, dArr.length);
    }

    public static double[] c4(double[] dArr, int i10, int i11) {
        if (dArr == null) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > dArr.length) {
            i11 = dArr.length;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return f337046l;
        }
        double[] dArr2 = new double[i12];
        System.arraycopy(dArr, i10, dArr2, 0, i12);
        return dArr2;
    }

    public static String c5(Object obj) {
        return d5(obj, "{}");
    }

    public static char[] d(char[] cArr, char c10) {
        char[] cArr2 = (char[]) V(cArr, Character.TYPE);
        cArr2[cArr2.length - 1] = c10;
        return cArr2;
    }

    public static int d0(double[] dArr, double d10, double d11) {
        return f0(dArr, d10, 0, d11);
    }

    public static boolean d1(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        return obj.getClass().getName().equals(obj2.getClass().getName());
    }

    public static byte[] d2(byte[] bArr, int i10) {
        return (byte[]) c2(bArr, i10);
    }

    public static void d3(double[] dArr, int i10, int i11) {
        if (dArr != null) {
            if (i10 < 0) {
                i10 = 0;
            }
            int iMin = Math.min(dArr.length, i11) - 1;
            while (iMin > i10) {
                double d10 = dArr[iMin];
                dArr[iMin] = dArr[i10];
                dArr[i10] = d10;
                iMin--;
                i10++;
            }
        }
    }

    public static float[] d4(float[] fArr, int i10, int i11) {
        if (fArr == null) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > fArr.length) {
            i11 = fArr.length;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return f337048n;
        }
        float[] fArr2 = new float[i12];
        System.arraycopy(fArr, i10, fArr2, 0, i12);
        return fArr2;
    }

    public static String d5(Object obj, String str) {
        return obj == null ? str : new org.apache.commons.lang3.builder.q(obj, org.apache.commons.lang3.builder.s.f337007p2).g(obj).toString();
    }

    @Deprecated
    public static char[] e(char[] cArr, int i10, char c10) {
        return (char[]) a(cArr, i10, Character.valueOf(c10), Character.TYPE);
    }

    public static int e0(double[] dArr, double d10, int i10) {
        if (D0(dArr)) {
            return -1;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < dArr.length) {
            if (d10 == dArr[i10]) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static boolean e1(byte[] bArr) {
        if (bArr != null && bArr.length >= 2) {
            byte b10 = bArr[0];
            int length = bArr.length;
            int i10 = 1;
            while (i10 < length) {
                byte b11 = bArr[i10];
                if (sk.c.a(b10, b11) > 0) {
                    return false;
                }
                i10++;
                b10 = b11;
            }
        }
        return true;
    }

    public static char[] e2(char[] cArr, int i10) {
        return (char[]) c2(cArr, i10);
    }

    public static void e3(float[] fArr) {
        if (fArr == null) {
            return;
        }
        f3(fArr, 0, fArr.length);
    }

    public static int[] e4(int[] iArr, int i10, int i11) {
        if (iArr == null) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > iArr.length) {
            i11 = iArr.length;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return f337040f;
        }
        int[] iArr2 = new int[i12];
        System.arraycopy(iArr, i10, iArr2, 0, i12);
        return iArr2;
    }

    public static String[] e5(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return f337037c;
        }
        String[] strArr = new String[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            strArr[i10] = objArr[i10].toString();
        }
        return strArr;
    }

    public static double[] f(double[] dArr, double d10) {
        double[] dArr2 = (double[]) V(dArr, Double.TYPE);
        dArr2[dArr2.length - 1] = d10;
        return dArr2;
    }

    public static int f0(double[] dArr, double d10, int i10, double d11) {
        if (D0(dArr)) {
            return -1;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        double d12 = d10 - d11;
        double d13 = d10 + d11;
        while (i10 < dArr.length) {
            double d14 = dArr[i10];
            if (d14 >= d12 && d14 <= d13) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static boolean f1(char[] cArr) {
        if (cArr != null && cArr.length >= 2) {
            char c10 = cArr[0];
            int length = cArr.length;
            int i10 = 1;
            while (i10 < length) {
                char c11 = cArr[i10];
                if (k.a(c10, c11) > 0) {
                    return false;
                }
                i10++;
                c10 = c11;
            }
        }
        return true;
    }

    public static double[] f2(double[] dArr, int i10) {
        return (double[]) c2(dArr, i10);
    }

    public static void f3(float[] fArr, int i10, int i11) {
        if (fArr == null) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iMin = Math.min(fArr.length, i11) - 1;
        while (iMin > i10) {
            float f10 = fArr[iMin];
            fArr[iMin] = fArr[i10];
            fArr[i10] = f10;
            iMin--;
            i10++;
        }
    }

    public static long[] f4(long[] jArr, int i10, int i11) {
        if (jArr == null) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > jArr.length) {
            i11 = jArr.length;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return f337038d;
        }
        long[] jArr2 = new long[i12];
        System.arraycopy(jArr, i10, jArr2, 0, i12);
        return jArr2;
    }

    public static String[] f5(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return f337037c;
        }
        String[] strArr = new String[objArr.length];
        int i10 = 3 ^ 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            strArr[i11] = obj == null ? str : obj.toString();
        }
        return strArr;
    }

    @Deprecated
    public static double[] g(double[] dArr, int i10, double d10) {
        return (double[]) a(dArr, i10, Double.valueOf(d10), Double.TYPE);
    }

    public static int g0(float[] fArr, float f10) {
        return h0(fArr, f10, 0);
    }

    public static boolean g1(double[] dArr) {
        if (dArr != null && dArr.length >= 2) {
            double d10 = dArr[0];
            int length = dArr.length;
            int i10 = 1;
            while (i10 < length) {
                double d11 = dArr[i10];
                if (Double.compare(d10, d11) > 0) {
                    return false;
                }
                i10++;
                d10 = d11;
            }
        }
        return true;
    }

    public static float[] g2(float[] fArr, int i10) {
        return (float[]) c2(fArr, i10);
    }

    public static void g3(int[] iArr) {
        if (iArr == null) {
            return;
        }
        h3(iArr, 0, iArr.length);
    }

    public static <T> T[] g4(T[] tArr, int i10, int i11) {
        if (tArr == null) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > tArr.length) {
            i11 = tArr.length;
        }
        int i12 = i11 - i10;
        Class<?> componentType = tArr.getClass().getComponentType();
        if (i12 <= 0) {
            return (T[]) ((Object[]) Array.newInstance(componentType, 0));
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(componentType, i12));
        System.arraycopy(tArr, i10, tArr2, 0, i12);
        return tArr2;
    }

    public static float[] h(float[] fArr, float f10) {
        float[] fArr2 = (float[]) V(fArr, Float.TYPE);
        fArr2[fArr2.length - 1] = f10;
        return fArr2;
    }

    public static int h0(float[] fArr, float f10, int i10) {
        if (E0(fArr)) {
            return -1;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < fArr.length) {
            if (f10 == fArr[i10]) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static boolean h1(float[] fArr) {
        if (fArr != null && fArr.length >= 2) {
            float f10 = fArr[0];
            int length = fArr.length;
            int i10 = 1;
            while (i10 < length) {
                float f11 = fArr[i10];
                if (Float.compare(f10, f11) > 0) {
                    return false;
                }
                i10++;
                f10 = f11;
            }
        }
        return true;
    }

    public static int[] h2(int[] iArr, int i10) {
        return (int[]) c2(iArr, i10);
    }

    public static void h3(int[] iArr, int i10, int i11) {
        if (iArr == null) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iMin = Math.min(iArr.length, i11) - 1;
        while (iMin > i10) {
            int i12 = iArr[iMin];
            iArr[iMin] = iArr[i10];
            iArr[i10] = i12;
            iMin--;
            i10++;
        }
    }

    public static short[] h4(short[] sArr, int i10, int i11) {
        if (sArr == null) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > sArr.length) {
            i11 = sArr.length;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return f337042h;
        }
        short[] sArr2 = new short[i12];
        System.arraycopy(sArr, i10, sArr2, 0, i12);
        return sArr2;
    }

    @Deprecated
    public static float[] i(float[] fArr, int i10, float f10) {
        return (float[]) a(fArr, i10, Float.valueOf(f10), Float.TYPE);
    }

    public static int i0(int[] iArr, int i10) {
        return j0(iArr, i10, 0);
    }

    public static boolean i1(int[] iArr) {
        if (iArr != null && iArr.length >= 2) {
            int i10 = iArr[0];
            int length = iArr.length;
            int i11 = 1;
            while (i11 < length) {
                int i12 = iArr[i11];
                if (sk.c.b(i10, i12) > 0) {
                    return false;
                }
                i11++;
                i10 = i12;
            }
        }
        return true;
    }

    public static long[] i2(long[] jArr, int i10) {
        return (long[]) c2(jArr, i10);
    }

    public static void i3(long[] jArr) {
        if (jArr == null) {
            return;
        }
        j3(jArr, 0, jArr.length);
    }

    public static boolean[] i4(boolean[] zArr, int i10, int i11) {
        if (zArr == null) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > zArr.length) {
            i11 = zArr.length;
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return f337050p;
        }
        boolean[] zArr2 = new boolean[i12];
        System.arraycopy(zArr, i10, zArr2, 0, i12);
        return zArr2;
    }

    public static int[] j(int[] iArr, int i10) {
        int[] iArr2 = (int[]) V(iArr, Integer.TYPE);
        iArr2[iArr2.length - 1] = i10;
        return iArr2;
    }

    public static int j0(int[] iArr, int i10, int i11) {
        if (iArr == null) {
            return -1;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < iArr.length) {
            if (i10 == iArr[i11]) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static boolean j1(long[] jArr) {
        if (jArr != null && jArr.length >= 2) {
            long j10 = jArr[0];
            int length = jArr.length;
            int i10 = 1;
            while (i10 < length) {
                long j11 = jArr[i10];
                if (sk.c.c(j10, j11) > 0) {
                    return false;
                }
                i10++;
                j10 = j11;
            }
        }
        return true;
    }

    public static <T> T[] j2(T[] tArr, int i10) {
        return (T[]) ((Object[]) c2(tArr, i10));
    }

    public static void j3(long[] jArr, int i10, int i11) {
        if (jArr != null) {
            if (i10 < 0) {
                i10 = 0;
            }
            int iMin = Math.min(jArr.length, i11) - 1;
            while (iMin > i10) {
                long j10 = jArr[iMin];
                jArr[iMin] = jArr[i10];
                jArr[i10] = j10;
                iMin--;
                i10++;
            }
        }
    }

    public static void j4(byte[] bArr, int i10, int i11) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        k4(bArr, i10, i11, 1);
    }

    @Deprecated
    public static int[] k(int[] iArr, int i10, int i11) {
        return (int[]) a(iArr, i10, Integer.valueOf(i11), Integer.TYPE);
    }

    public static int k0(long[] jArr, long j10) {
        return l0(jArr, j10, 0);
    }

    public static <T extends Comparable<? super T>> boolean k1(T[] tArr) {
        return l1(tArr, new a());
    }

    public static short[] k2(short[] sArr, int i10) {
        return (short[]) c2(sArr, i10);
    }

    public static void k3(Object[] objArr) {
        if (objArr == null) {
            return;
        }
        l3(objArr, 0, objArr.length);
    }

    public static void k4(byte[] bArr, int i10, int i11, int i12) {
        if (bArr == null || bArr.length == 0 || i10 >= bArr.length || i11 >= bArr.length) {
            return;
        }
        int i13 = 0;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        int iMin = Math.min(Math.min(i12, bArr.length - i10), bArr.length - i11);
        while (i13 < iMin) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
            i13++;
            i10++;
            i11++;
        }
    }

    @Deprecated
    public static long[] l(long[] jArr, int i10, long j10) {
        return (long[]) a(jArr, i10, Long.valueOf(j10), Long.TYPE);
    }

    public static int l0(long[] jArr, long j10, int i10) {
        if (jArr == null) {
            return -1;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < jArr.length) {
            if (j10 == jArr[i10]) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> boolean l1(T[] tArr, Comparator<T> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Comparator should not be null.");
        }
        if (tArr != null && tArr.length >= 2) {
            T t10 = tArr[0];
            int length = tArr.length;
            int i10 = 1;
            while (i10 < length) {
                T t11 = tArr[i10];
                if (comparator.compare(t10, t11) > 0) {
                    return false;
                }
                i10++;
                t10 = t11;
            }
        }
        return true;
    }

    public static boolean[] l2(boolean[] zArr, int i10) {
        return (boolean[]) c2(zArr, i10);
    }

    public static void l3(Object[] objArr, int i10, int i11) {
        if (objArr == null) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iMin = Math.min(objArr.length, i11) - 1;
        while (iMin > i10) {
            Object obj = objArr[iMin];
            objArr[iMin] = objArr[i10];
            objArr[i10] = obj;
            iMin--;
            i10++;
        }
    }

    public static void l4(char[] cArr, int i10, int i11) {
        if (cArr == null || cArr.length == 0) {
            return;
        }
        m4(cArr, i10, i11, 1);
    }

    public static long[] m(long[] jArr, long j10) {
        long[] jArr2 = (long[]) V(jArr, Long.TYPE);
        jArr2[jArr2.length - 1] = j10;
        return jArr2;
    }

    public static int m0(Object[] objArr, Object obj) {
        return n0(objArr, obj, 0);
    }

    public static boolean m1(short[] sArr) {
        if (sArr != null) {
            int i10 = 5 << 2;
            if (sArr.length >= 2) {
                short s10 = sArr[0];
                int length = sArr.length;
                int i11 = 1;
                while (i11 < length) {
                    short s11 = sArr[i11];
                    if (sk.c.d(s10, s11) > 0) {
                        return false;
                    }
                    i11++;
                    s10 = s11;
                }
            }
        }
        return true;
    }

    static Object m2(Object obj, BitSet bitSet) {
        int iW = W(obj);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), iW - bitSet.cardinality());
        int iNextClearBit = 0;
        int i10 = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(iNextClearBit);
            if (iNextSetBit == -1) {
                break;
            }
            int i11 = iNextSetBit - iNextClearBit;
            if (i11 > 0) {
                System.arraycopy(obj, iNextClearBit, objNewInstance, i10, i11);
                i10 += i11;
            }
            iNextClearBit = bitSet.nextClearBit(iNextSetBit);
        }
        int i12 = iW - iNextClearBit;
        if (i12 > 0) {
            System.arraycopy(obj, iNextClearBit, objNewInstance, i10, i12);
        }
        return objNewInstance;
    }

    public static void m3(short[] sArr) {
        if (sArr == null) {
            return;
        }
        n3(sArr, 0, sArr.length);
    }

    public static void m4(char[] cArr, int i10, int i11, int i12) {
        if (cArr != null && cArr.length != 0 && i10 < cArr.length && i11 < cArr.length) {
            int i13 = 0;
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            int iMin = Math.min(Math.min(i12, cArr.length - i10), cArr.length - i11);
            while (i13 < iMin) {
                char c10 = cArr[i10];
                cArr[i10] = cArr[i11];
                cArr[i11] = c10;
                i13++;
                i10++;
                i11++;
            }
        }
    }

    @Deprecated
    public static <T> T[] n(T[] tArr, int i10, T t10) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else {
            if (t10 == null) {
                throw new IllegalArgumentException("Array and element cannot both be null");
            }
            componentType = t10.getClass();
        }
        return (T[]) ((Object[]) a(tArr, i10, t10, componentType));
    }

    public static int n0(Object[] objArr, Object obj, int i10) {
        if (objArr == null) {
            return -1;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (obj == null) {
            while (i10 < objArr.length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
        } else {
            while (i10 < objArr.length) {
                if (obj.equals(objArr[i10])) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public static boolean n1(boolean[] zArr) {
        if (zArr != null && zArr.length >= 2) {
            boolean z10 = zArr[0];
            int length = zArr.length;
            int i10 = 1;
            while (i10 < length) {
                boolean z11 = zArr[i10];
                if (e.c(z10, z11) > 0) {
                    return false;
                }
                i10++;
                z10 = z11;
            }
        }
        return true;
    }

    static Object n2(Object obj, int... iArr) {
        int i10;
        int iW = W(obj);
        int[] iArrG = G(iArr);
        Arrays.sort(iArrG);
        if (P0(iArrG)) {
            int length = iArrG.length;
            int i11 = iW;
            i10 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                int i12 = iArrG[length];
                if (i12 < 0 || i12 >= iW) {
                    throw new IndexOutOfBoundsException("Index: " + i12 + ", Length: " + iW);
                }
                if (i12 < i11) {
                    i10++;
                    i11 = i12;
                }
            }
        } else {
            i10 = 0;
        }
        int i13 = iW - i10;
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), i13);
        if (i10 < iW) {
            int length2 = iArrG.length - 1;
            while (length2 >= 0) {
                int i14 = iArrG[length2];
                int i15 = iW - i14;
                if (i15 > 1) {
                    int i16 = i15 - 1;
                    i13 -= i16;
                    System.arraycopy(obj, i14 + 1, objNewInstance, i13, i16);
                }
                length2--;
                iW = i14;
            }
            if (iW > 0) {
                System.arraycopy(obj, 0, objNewInstance, 0, iW);
            }
        }
        return objNewInstance;
    }

    public static void n3(short[] sArr, int i10, int i11) {
        if (sArr != null) {
            if (i10 < 0) {
                i10 = 0;
            }
            int iMin = Math.min(sArr.length, i11) - 1;
            while (iMin > i10) {
                short s10 = sArr[iMin];
                sArr[iMin] = sArr[i10];
                sArr[i10] = s10;
                iMin--;
                i10++;
            }
        }
    }

    public static void n4(double[] dArr, int i10, int i11) {
        if (dArr == null || dArr.length == 0) {
            return;
        }
        o4(dArr, i10, i11, 1);
    }

    public static <T> T[] o(T[] tArr, T t10) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else {
            if (t10 == null) {
                throw new IllegalArgumentException("Arguments cannot both be null");
            }
            componentType = t10.getClass();
        }
        T[] tArr2 = (T[]) ((Object[]) V(tArr, componentType));
        tArr2[tArr2.length - 1] = t10;
        return tArr2;
    }

    public static int o0(short[] sArr, short s10) {
        return p0(sArr, s10, 0);
    }

    public static int o1(byte[] bArr, byte b10) {
        return p1(bArr, b10, Integer.MAX_VALUE);
    }

    public static byte[] o2(byte[] bArr, int... iArr) {
        return (byte[]) n2(bArr, iArr);
    }

    public static void o3(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        p3(zArr, 0, zArr.length);
    }

    public static void o4(double[] dArr, int i10, int i11, int i12) {
        if (dArr == null || dArr.length == 0 || i10 >= dArr.length || i11 >= dArr.length) {
            return;
        }
        int i13 = 0;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        int iMin = Math.min(Math.min(i12, dArr.length - i10), dArr.length - i11);
        while (i13 < iMin) {
            double d10 = dArr[i10];
            dArr[i10] = dArr[i11];
            dArr[i11] = d10;
            i13++;
            i10++;
            i11++;
        }
    }

    @Deprecated
    public static short[] p(short[] sArr, int i10, short s10) {
        return (short[]) a(sArr, i10, Short.valueOf(s10), Short.TYPE);
    }

    public static int p0(short[] sArr, short s10, int i10) {
        if (sArr == null) {
            return -1;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < sArr.length) {
            if (s10 == sArr[i10]) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int p1(byte[] bArr, byte b10, int i10) {
        if (bArr != null && i10 >= 0) {
            if (i10 >= bArr.length) {
                i10 = bArr.length - 1;
            }
            while (i10 >= 0) {
                if (b10 == bArr[i10]) {
                    return i10;
                }
                i10--;
            }
            return -1;
        }
        return -1;
    }

    public static char[] p2(char[] cArr, int... iArr) {
        return (char[]) n2(cArr, iArr);
    }

    public static void p3(boolean[] zArr, int i10, int i11) {
        if (zArr != null) {
            if (i10 < 0) {
                i10 = 0;
            }
            int iMin = Math.min(zArr.length, i11) - 1;
            while (iMin > i10) {
                boolean z10 = zArr[iMin];
                zArr[iMin] = zArr[i10];
                zArr[i10] = z10;
                iMin--;
                i10++;
            }
        }
    }

    public static void p4(float[] fArr, int i10, int i11) {
        if (fArr != null && fArr.length != 0) {
            q4(fArr, i10, i11, 1);
        }
    }

    public static short[] q(short[] sArr, short s10) {
        short[] sArr2 = (short[]) V(sArr, Short.TYPE);
        sArr2[sArr2.length - 1] = s10;
        return sArr2;
    }

    public static int q0(boolean[] zArr, boolean z10) {
        return r0(zArr, z10, 0);
    }

    public static int q1(char[] cArr, char c10) {
        return r1(cArr, c10, Integer.MAX_VALUE);
    }

    public static double[] q2(double[] dArr, int... iArr) {
        return (double[]) n2(dArr, iArr);
    }

    public static void q3(byte[] bArr, int i10) {
        if (bArr == null) {
            return;
        }
        r3(bArr, 0, bArr.length, i10);
    }

    public static void q4(float[] fArr, int i10, int i11, int i12) {
        if (fArr != null && fArr.length != 0 && i10 < fArr.length && i11 < fArr.length) {
            int i13 = 0;
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            int iMin = Math.min(Math.min(i12, fArr.length - i10), fArr.length - i11);
            while (i13 < iMin) {
                float f10 = fArr[i10];
                fArr[i10] = fArr[i11];
                fArr[i11] = f10;
                i13++;
                i10++;
                i11++;
            }
        }
    }

    @Deprecated
    public static boolean[] r(boolean[] zArr, int i10, boolean z10) {
        return (boolean[]) a(zArr, i10, Boolean.valueOf(z10), Boolean.TYPE);
    }

    public static int r0(boolean[] zArr, boolean z10, int i10) {
        if (J0(zArr)) {
            return -1;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < zArr.length) {
            if (z10 == zArr[i10]) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int r1(char[] cArr, char c10, int i10) {
        if (cArr == null || i10 < 0) {
            return -1;
        }
        if (i10 >= cArr.length) {
            i10 = cArr.length - 1;
        }
        while (i10 >= 0) {
            if (c10 == cArr[i10]) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static float[] r2(float[] fArr, int... iArr) {
        return (float[]) n2(fArr, iArr);
    }

    public static void r3(byte[] bArr, int i10, int i11, int i12) {
        if (bArr != null && i10 < bArr.length - 1 && i11 > 0) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 >= bArr.length) {
                i11 = bArr.length;
            }
            int i13 = i11 - i10;
            if (i13 <= 1) {
                return;
            }
            int i14 = i12 % i13;
            if (i14 < 0) {
                i14 += i13;
            }
            while (i13 > 1 && i14 > 0) {
                int i15 = i13 - i14;
                if (i14 > i15) {
                    k4(bArr, i10, (i13 + i10) - i15, i15);
                    int i16 = i14;
                    i14 -= i15;
                    i13 = i16;
                } else if (i14 >= i15) {
                    k4(bArr, i10, i15 + i10, i14);
                    return;
                } else {
                    k4(bArr, i10, i10 + i15, i14);
                    i10 += i14;
                    i13 = i15;
                }
            }
        }
    }

    public static void r4(int[] iArr, int i10, int i11) {
        if (iArr != null && iArr.length != 0) {
            s4(iArr, i10, i11, 1);
        }
    }

    public static boolean[] s(boolean[] zArr, boolean z10) {
        boolean[] zArr2 = (boolean[]) V(zArr, Boolean.TYPE);
        zArr2[zArr2.length - 1] = z10;
        return zArr2;
    }

    public static byte[] s0(int i10, byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 != null && bArr2.length != 0) {
            if (i10 < 0 || i10 > bArr.length) {
                throw new IndexOutOfBoundsException("Index: " + i10 + ", Length: " + bArr.length);
            }
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, i10, bArr2.length);
            if (i10 > 0) {
                System.arraycopy(bArr, 0, bArr3, 0, i10);
            }
            if (i10 < bArr.length) {
                System.arraycopy(bArr, i10, bArr3, bArr2.length + i10, bArr.length - i10);
            }
            return bArr3;
        }
        return C(bArr);
    }

    public static int s1(double[] dArr, double d10) {
        return u1(dArr, d10, Integer.MAX_VALUE);
    }

    public static int[] s2(int[] iArr, int... iArr2) {
        return (int[]) n2(iArr, iArr2);
    }

    public static void s3(char[] cArr, int i10) {
        if (cArr == null) {
            return;
        }
        t3(cArr, 0, cArr.length, i10);
    }

    public static void s4(int[] iArr, int i10, int i11, int i12) {
        if (iArr != null && iArr.length != 0 && i10 < iArr.length && i11 < iArr.length) {
            int i13 = 0;
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            int iMin = Math.min(Math.min(i12, iArr.length - i10), iArr.length - i11);
            while (i13 < iMin) {
                int i14 = iArr[i10];
                iArr[i10] = iArr[i11];
                iArr[i11] = i14;
                i13++;
                i10++;
                i11++;
            }
        }
    }

    public static byte[] t(byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return C(bArr2);
        }
        if (bArr2 == null) {
            return C(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static char[] t0(int i10, char[] cArr, char... cArr2) {
        if (cArr == null) {
            return null;
        }
        if (cArr2 == null || cArr2.length == 0) {
            return D(cArr);
        }
        if (i10 < 0 || i10 > cArr.length) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Length: " + cArr.length);
        }
        char[] cArr3 = new char[cArr.length + cArr2.length];
        System.arraycopy(cArr2, 0, cArr3, i10, cArr2.length);
        if (i10 > 0) {
            System.arraycopy(cArr, 0, cArr3, 0, i10);
        }
        if (i10 < cArr.length) {
            System.arraycopy(cArr, i10, cArr3, cArr2.length + i10, cArr.length - i10);
        }
        return cArr3;
    }

    public static int t1(double[] dArr, double d10, double d11) {
        return v1(dArr, d10, Integer.MAX_VALUE, d11);
    }

    public static long[] t2(long[] jArr, int... iArr) {
        return (long[]) n2(jArr, iArr);
    }

    public static void t3(char[] cArr, int i10, int i11, int i12) {
        if (cArr != null && i10 < cArr.length - 1 && i11 > 0) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 >= cArr.length) {
                i11 = cArr.length;
            }
            int i13 = i11 - i10;
            if (i13 <= 1) {
                return;
            }
            int i14 = i12 % i13;
            if (i14 < 0) {
                i14 += i13;
            }
            while (i13 > 1 && i14 > 0) {
                int i15 = i13 - i14;
                if (i14 > i15) {
                    m4(cArr, i10, (i13 + i10) - i15, i15);
                    int i16 = i14;
                    i14 -= i15;
                    i13 = i16;
                } else if (i14 >= i15) {
                    m4(cArr, i10, i15 + i10, i14);
                    return;
                } else {
                    m4(cArr, i10, i10 + i15, i14);
                    i10 += i14;
                    i13 = i15;
                }
            }
        }
    }

    public static void t4(long[] jArr, int i10, int i11) {
        if (jArr == null || jArr.length == 0) {
            return;
        }
        u4(jArr, i10, i11, 1);
    }

    public static char[] u(char[] cArr, char... cArr2) {
        if (cArr == null) {
            return D(cArr2);
        }
        if (cArr2 == null) {
            return D(cArr);
        }
        char[] cArr3 = new char[cArr.length + cArr2.length];
        System.arraycopy(cArr, 0, cArr3, 0, cArr.length);
        System.arraycopy(cArr2, 0, cArr3, cArr.length, cArr2.length);
        return cArr3;
    }

    public static double[] u0(int i10, double[] dArr, double... dArr2) {
        if (dArr == null) {
            return null;
        }
        if (dArr2 == null || dArr2.length == 0) {
            return E(dArr);
        }
        if (i10 < 0 || i10 > dArr.length) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Length: " + dArr.length);
        }
        double[] dArr3 = new double[dArr.length + dArr2.length];
        System.arraycopy(dArr2, 0, dArr3, i10, dArr2.length);
        if (i10 > 0) {
            System.arraycopy(dArr, 0, dArr3, 0, i10);
        }
        if (i10 < dArr.length) {
            System.arraycopy(dArr, i10, dArr3, dArr2.length + i10, dArr.length - i10);
        }
        return dArr3;
    }

    public static int u1(double[] dArr, double d10, int i10) {
        if (D0(dArr) || i10 < 0) {
            return -1;
        }
        if (i10 >= dArr.length) {
            i10 = dArr.length - 1;
        }
        while (i10 >= 0) {
            if (d10 == dArr[i10]) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static <T> T[] u2(T[] tArr, int... iArr) {
        return (T[]) ((Object[]) n2(tArr, iArr));
    }

    public static void u3(double[] dArr, int i10) {
        if (dArr == null) {
            return;
        }
        v3(dArr, 0, dArr.length, i10);
    }

    public static void u4(long[] jArr, int i10, int i11, int i12) {
        if (jArr != null && jArr.length != 0 && i10 < jArr.length && i11 < jArr.length) {
            int i13 = 0;
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            int iMin = Math.min(Math.min(i12, jArr.length - i10), jArr.length - i11);
            while (i13 < iMin) {
                long j10 = jArr[i10];
                jArr[i10] = jArr[i11];
                jArr[i11] = j10;
                i13++;
                i10++;
                i11++;
            }
        }
    }

    public static double[] v(double[] dArr, double... dArr2) {
        if (dArr == null) {
            return E(dArr2);
        }
        if (dArr2 == null) {
            return E(dArr);
        }
        double[] dArr3 = new double[dArr.length + dArr2.length];
        System.arraycopy(dArr, 0, dArr3, 0, dArr.length);
        System.arraycopy(dArr2, 0, dArr3, dArr.length, dArr2.length);
        return dArr3;
    }

    public static float[] v0(int i10, float[] fArr, float... fArr2) {
        if (fArr == null) {
            return null;
        }
        if (fArr2 != null && fArr2.length != 0) {
            if (i10 < 0 || i10 > fArr.length) {
                throw new IndexOutOfBoundsException("Index: " + i10 + ", Length: " + fArr.length);
            }
            float[] fArr3 = new float[fArr.length + fArr2.length];
            System.arraycopy(fArr2, 0, fArr3, i10, fArr2.length);
            if (i10 > 0) {
                System.arraycopy(fArr, 0, fArr3, 0, i10);
            }
            if (i10 < fArr.length) {
                System.arraycopy(fArr, i10, fArr3, fArr2.length + i10, fArr.length - i10);
            }
            return fArr3;
        }
        return F(fArr);
    }

    public static int v1(double[] dArr, double d10, int i10, double d11) {
        if (D0(dArr) || i10 < 0) {
            return -1;
        }
        if (i10 >= dArr.length) {
            i10 = dArr.length - 1;
        }
        double d12 = d10 - d11;
        double d13 = d10 + d11;
        while (i10 >= 0) {
            double d14 = dArr[i10];
            if (d14 >= d12 && d14 <= d13) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static short[] v2(short[] sArr, int... iArr) {
        return (short[]) n2(sArr, iArr);
    }

    public static void v3(double[] dArr, int i10, int i11, int i12) {
        if (dArr != null && i10 < dArr.length - 1 && i11 > 0) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 >= dArr.length) {
                i11 = dArr.length;
            }
            int i13 = i11 - i10;
            if (i13 > 1) {
                int i14 = i12 % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                while (i13 > 1 && i14 > 0) {
                    int i15 = i13 - i14;
                    if (i14 <= i15) {
                        if (i14 >= i15) {
                            o4(dArr, i10, i15 + i10, i14);
                            break;
                        } else {
                            o4(dArr, i10, i10 + i15, i14);
                            i10 += i14;
                            i13 = i15;
                        }
                    } else {
                        o4(dArr, i10, (i13 + i10) - i15, i15);
                        int i16 = i14;
                        i14 -= i15;
                        i13 = i16;
                    }
                }
            }
        }
    }

    public static void v4(Object[] objArr, int i10, int i11) {
        if (objArr != null && objArr.length != 0) {
            w4(objArr, i10, i11, 1);
        }
    }

    public static float[] w(float[] fArr, float... fArr2) {
        if (fArr == null) {
            return F(fArr2);
        }
        if (fArr2 == null) {
            return F(fArr);
        }
        float[] fArr3 = new float[fArr.length + fArr2.length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        return fArr3;
    }

    public static int[] w0(int i10, int[] iArr, int... iArr2) {
        if (iArr == null) {
            return null;
        }
        if (iArr2 == null || iArr2.length == 0) {
            return G(iArr);
        }
        if (i10 < 0 || i10 > iArr.length) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Length: " + iArr.length);
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        int i11 = 4 << 0;
        System.arraycopy(iArr2, 0, iArr3, i10, iArr2.length);
        if (i10 > 0) {
            System.arraycopy(iArr, 0, iArr3, 0, i10);
        }
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i10, iArr3, iArr2.length + i10, iArr.length - i10);
        }
        return iArr3;
    }

    public static int w1(float[] fArr, float f10) {
        return x1(fArr, f10, Integer.MAX_VALUE);
    }

    public static boolean[] w2(boolean[] zArr, int... iArr) {
        return (boolean[]) n2(zArr, iArr);
    }

    public static void w3(float[] fArr, int i10) {
        if (fArr == null) {
            return;
        }
        x3(fArr, 0, fArr.length, i10);
    }

    public static void w4(Object[] objArr, int i10, int i11, int i12) {
        if (objArr == null || objArr.length == 0 || i10 >= objArr.length || i11 >= objArr.length) {
            return;
        }
        int i13 = 0;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        int iMin = Math.min(Math.min(i12, objArr.length - i10), objArr.length - i11);
        while (i13 < iMin) {
            Object obj = objArr[i10];
            objArr[i10] = objArr[i11];
            objArr[i11] = obj;
            i13++;
            i10++;
            i11++;
        }
    }

    public static int[] x(int[] iArr, int... iArr2) {
        if (iArr == null) {
            return G(iArr2);
        }
        if (iArr2 == null) {
            return G(iArr);
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    public static long[] x0(int i10, long[] jArr, long... jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 == null || jArr2.length == 0) {
            return H(jArr);
        }
        if (i10 < 0 || i10 > jArr.length) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Length: " + jArr.length);
        }
        long[] jArr3 = new long[jArr.length + jArr2.length];
        System.arraycopy(jArr2, 0, jArr3, i10, jArr2.length);
        if (i10 > 0) {
            System.arraycopy(jArr, 0, jArr3, 0, i10);
        }
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i10, jArr3, jArr2.length + i10, jArr.length - i10);
        }
        return jArr3;
    }

    public static int x1(float[] fArr, float f10, int i10) {
        if (E0(fArr) || i10 < 0) {
            return -1;
        }
        if (i10 >= fArr.length) {
            i10 = fArr.length - 1;
        }
        while (i10 >= 0) {
            if (f10 == fArr[i10]) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static byte[] x2(byte[] bArr, byte b10) {
        int iY = Y(bArr, b10);
        if (iY == -1) {
            return C(bArr);
        }
        int[] iArr = new int[bArr.length - iY];
        iArr[0] = iY;
        int i10 = 1;
        while (true) {
            int iZ = Z(bArr, b10, iArr[i10 - 1] + 1);
            if (iZ == -1) {
                return o2(bArr, Arrays.copyOf(iArr, i10));
            }
            iArr[i10] = iZ;
            i10++;
        }
    }

    public static void x3(float[] fArr, int i10, int i11, int i12) {
        if (fArr != null && i10 < fArr.length - 1 && i11 > 0) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 >= fArr.length) {
                i11 = fArr.length;
            }
            int i13 = i11 - i10;
            if (i13 <= 1) {
                return;
            }
            int i14 = i12 % i13;
            if (i14 < 0) {
                i14 += i13;
            }
            while (i13 > 1 && i14 > 0) {
                int i15 = i13 - i14;
                if (i14 > i15) {
                    q4(fArr, i10, (i13 + i10) - i15, i15);
                    int i16 = i14;
                    i14 -= i15;
                    i13 = i16;
                } else if (i14 >= i15) {
                    q4(fArr, i10, i15 + i10, i14);
                    return;
                } else {
                    q4(fArr, i10, i10 + i15, i14);
                    i10 += i14;
                    i13 = i15;
                }
            }
        }
    }

    public static void x4(short[] sArr, int i10, int i11) {
        if (sArr == null || sArr.length == 0) {
            return;
        }
        y4(sArr, i10, i11, 1);
    }

    public static long[] y(long[] jArr, long... jArr2) {
        if (jArr == null) {
            return H(jArr2);
        }
        if (jArr2 == null) {
            return H(jArr);
        }
        long[] jArr3 = new long[jArr.length + jArr2.length];
        System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
        System.arraycopy(jArr2, 0, jArr3, jArr.length, jArr2.length);
        return jArr3;
    }

    @SafeVarargs
    public static <T> T[] y0(int i10, T[] tArr, T... tArr2) {
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || tArr2.length == 0) {
            return (T[]) I(tArr);
        }
        if (i10 < 0 || i10 > tArr.length) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Length: " + tArr.length);
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length));
        System.arraycopy(tArr2, 0, tArr3, i10, tArr2.length);
        if (i10 > 0) {
            System.arraycopy(tArr, 0, tArr3, 0, i10);
        }
        if (i10 < tArr.length) {
            System.arraycopy(tArr, i10, tArr3, tArr2.length + i10, tArr.length - i10);
        }
        return tArr3;
    }

    public static int y1(int[] iArr, int i10) {
        return z1(iArr, i10, Integer.MAX_VALUE);
    }

    public static char[] y2(char[] cArr, char c10) {
        int iA0 = a0(cArr, c10);
        if (iA0 == -1) {
            return D(cArr);
        }
        int[] iArr = new int[cArr.length - iA0];
        iArr[0] = iA0;
        int i10 = 1;
        while (true) {
            int iB0 = b0(cArr, c10, iArr[i10 - 1] + 1);
            if (iB0 == -1) {
                return p2(cArr, Arrays.copyOf(iArr, i10));
            }
            iArr[i10] = iB0;
            i10++;
        }
    }

    public static void y3(int[] iArr, int i10) {
        if (iArr == null) {
            return;
        }
        z3(iArr, 0, iArr.length, i10);
    }

    public static void y4(short[] sArr, int i10, int i11, int i12) {
        if (sArr == null || sArr.length == 0 || i10 >= sArr.length || i11 >= sArr.length) {
            return;
        }
        int i13 = 0;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if (i10 == i11) {
            return;
        }
        int iMin = Math.min(Math.min(i12, sArr.length - i10), sArr.length - i11);
        while (i13 < iMin) {
            short s10 = sArr[i10];
            sArr[i10] = sArr[i11];
            sArr[i11] = s10;
            i13++;
            i10++;
            i11++;
        }
    }

    public static <T> T[] z(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return (T[]) I(tArr2);
        }
        if (tArr2 == null) {
            return (T[]) I(tArr);
        }
        Class<?> componentType = tArr.getClass().getComponentType();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(componentType, tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        try {
            System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
            return tArr3;
        } catch (ArrayStoreException e10) {
            Class<?> componentType2 = tArr2.getClass().getComponentType();
            if (componentType.isAssignableFrom(componentType2)) {
                throw e10;
            }
            throw new IllegalArgumentException("Cannot store " + componentType2.getName() + " in an array of " + componentType.getName(), e10);
        }
    }

    public static short[] z0(int i10, short[] sArr, short... sArr2) {
        if (sArr == null) {
            return null;
        }
        if (sArr2 == null || sArr2.length == 0) {
            return J(sArr);
        }
        if (i10 < 0 || i10 > sArr.length) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Length: " + sArr.length);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr2, 0, sArr3, i10, sArr2.length);
        if (i10 > 0) {
            System.arraycopy(sArr, 0, sArr3, 0, i10);
        }
        if (i10 < sArr.length) {
            System.arraycopy(sArr, i10, sArr3, sArr2.length + i10, sArr.length - i10);
        }
        return sArr3;
    }

    public static int z1(int[] iArr, int i10, int i11) {
        if (iArr != null && i11 >= 0) {
            if (i11 >= iArr.length) {
                i11 = iArr.length - 1;
            }
            while (i11 >= 0) {
                if (i10 == iArr[i11]) {
                    return i11;
                }
                i11--;
            }
            return -1;
        }
        return -1;
    }

    public static double[] z2(double[] dArr, double d10) {
        int iC0 = c0(dArr, d10);
        if (iC0 == -1) {
            return E(dArr);
        }
        int[] iArr = new int[dArr.length - iC0];
        iArr[0] = iC0;
        int i10 = 1;
        while (true) {
            int iE0 = e0(dArr, d10, iArr[i10 - 1] + 1);
            if (iE0 == -1) {
                return q2(dArr, Arrays.copyOf(iArr, i10));
            }
            iArr[i10] = iE0;
            i10++;
        }
    }

    public static void z3(int[] iArr, int i10, int i11, int i12) {
        if (iArr != null && i10 < iArr.length - 1 && i11 > 0) {
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 >= iArr.length) {
                i11 = iArr.length;
            }
            int i13 = i11 - i10;
            if (i13 <= 1) {
                return;
            }
            int i14 = i12 % i13;
            if (i14 < 0) {
                i14 += i13;
            }
            while (i13 > 1 && i14 > 0) {
                int i15 = i13 - i14;
                if (i14 > i15) {
                    s4(iArr, i10, (i13 + i10) - i15, i15);
                    int i16 = i14;
                    i14 -= i15;
                    i13 = i16;
                } else if (i14 >= i15) {
                    s4(iArr, i10, i15 + i10, i14);
                    return;
                } else {
                    s4(iArr, i10, i10 + i15, i14);
                    i10 += i14;
                    i13 = i15;
                }
            }
        }
    }

    public static void z4(boolean[] zArr, int i10, int i11) {
        if (zArr != null && zArr.length != 0) {
            A4(zArr, i10, i11, 1);
        }
    }
}
