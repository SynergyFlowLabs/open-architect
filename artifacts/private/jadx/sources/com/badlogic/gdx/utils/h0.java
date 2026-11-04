package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {
    public static long a(double d10) {
        return Double.doubleToLongBits(d10);
    }

    public static int b(float f10) {
        return Float.floatToIntBits(f10);
    }

    public static int c(float f10) {
        return Float.floatToRawIntBits(f10);
    }

    public static int d(float f10) {
        return Float.floatToRawIntBits(f10);
    }

    public static float e(int i10) {
        return Float.intBitsToFloat(i10);
    }

    public static float f(int i10) {
        return Float.intBitsToFloat(i10 & (-16777217));
    }

    public static double g(long j10) {
        return Double.longBitsToDouble(j10);
    }
}
