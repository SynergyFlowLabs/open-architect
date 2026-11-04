package org.apache.commons.lang3;

import java.util.Random;

/* JADX INFO: loaded from: classes14.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Random f337526a = new Random();

    public static boolean a() {
        return f337526a.nextBoolean();
    }

    public static byte[] b(int i10) {
        c0.v(i10 >= 0, "Count cannot be negative.", new Object[0]);
        byte[] bArr = new byte[i10];
        f337526a.nextBytes(bArr);
        return bArr;
    }

    public static double c() {
        return d(0.0d, Double.MAX_VALUE);
    }

    public static double d(double d10, double d11) {
        c0.v(d11 >= d10, "Start value must be smaller or equal to end value.", new Object[0]);
        c0.v(d10 >= 0.0d, "Both range values must be non-negative.", new Object[0]);
        return d10 == d11 ? d10 : d10 + ((d11 - d10) * f337526a.nextDouble());
    }

    public static float e() {
        return f(0.0f, Float.MAX_VALUE);
    }

    public static float f(float f10, float f11) {
        c0.v(f11 >= f10, "Start value must be smaller or equal to end value.", new Object[0]);
        c0.v(f10 >= 0.0f, "Both range values must be non-negative.", new Object[0]);
        return f10 == f11 ? f10 : f10 + ((f11 - f10) * f337526a.nextFloat());
    }

    public static int g() {
        return h(0, Integer.MAX_VALUE);
    }

    public static int h(int i10, int i11) {
        boolean z10 = true;
        c0.v(i11 >= i10, "Start value must be smaller or equal to end value.", new Object[0]);
        if (i10 < 0) {
            z10 = false;
        }
        c0.v(z10, "Both range values must be non-negative.", new Object[0]);
        return i10 == i11 ? i10 : i10 + f337526a.nextInt(i11 - i10);
    }

    public static long i() {
        return j(0L, Long.MAX_VALUE);
    }

    public static long j(long j10, long j11) {
        c0.v(j11 >= j10, "Start value must be smaller or equal to end value.", new Object[0]);
        c0.v(j10 >= 0, "Both range values must be non-negative.", new Object[0]);
        return j10 == j11 ? j10 : (long) d(j10, j11);
    }
}
