package com.planner5d.library.engine.util.math;

import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public final class e {
    private static final double A = 16384.999999999996d;
    private static final double B = 16384.5d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f165444a = 1.0E-9f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f165445b = 1.0E-6f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f165446c = 3.1415927f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f165447d = 6.2831855f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f165448e = 2.7182817f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f165449f = 14;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f165450g = 16383;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f165451h = 16384;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f165452i = 6.2831855f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f165453j = 360.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f165454k = 2607.5945f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f165455l = 45.511112f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f165456m = 57.295776f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f165457n = 57.295776f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f165458o = 0.017453292f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f165459p = 0.017453292f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f165460q = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f165461r = 14;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f165462s = 16383;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f165463t = 16384;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final int f165464u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f165465v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static Random f165466w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f165467x = 16384;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final double f165468y = 16384.0d;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final double f165469z = 0.9999999d;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final float[] f165470a = new float[16384];

        static {
            for (int i10 = 0; i10 < e.f165464u; i10++) {
                int i11 = 0;
                while (true) {
                    int i12 = e.f165464u;
                    if (i11 < i12) {
                        f165470a[(i12 * i11) + i10] = (float) Math.atan2(i11 / i12, i10 / i12);
                        i11++;
                    }
                }
            }
        }

        private a() {
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final float[] f165471a = new float[16384];

        static {
            for (int i10 = 0; i10 < 16384; i10++) {
                f165471a[i10] = (float) Math.sin(((i10 + 0.5f) / 16384.0f) * 6.2831855f);
            }
            for (int i11 = 0; i11 < 360; i11 += 90) {
                float f10 = i11;
                f165471a[((int) (e.f165455l * f10)) & 16383] = (float) Math.sin(f10 * 0.017453292f);
            }
        }

        private b() {
        }
    }

    static {
        int iSqrt = (int) Math.sqrt(f165468y);
        f165464u = iSqrt;
        f165465v = 1.0f / (iSqrt - 1);
        f165466w = new j();
    }

    public static long A(long j10) {
        return (long) (f165466w.nextDouble() * j10);
    }

    public static long B(long j10, long j11) {
        return j10 + ((long) (f165466w.nextDouble() * (j11 - j10)));
    }

    public static boolean C() {
        return f165466w.nextBoolean();
    }

    public static boolean D(float f10) {
        return v() < f10;
    }

    public static int E() {
        return (f165466w.nextInt() >> 31) | 1;
    }

    public static float F() {
        return f165466w.nextFloat() - f165466w.nextFloat();
    }

    public static float G(float f10) {
        return (f165466w.nextFloat() - f165466w.nextFloat()) * f10;
    }

    public static float H(float f10, float f11) {
        return I(f10, f11, ((f11 - f10) * 0.5f) + f10);
    }

    public static float I(float f10, float f11, float f12) {
        float fNextFloat = f165466w.nextFloat();
        float f13 = f11 - f10;
        float f14 = f12 - f10;
        return fNextFloat <= f14 / f13 ? f10 + ((float) Math.sqrt(fNextFloat * f13 * f14)) : f11 - ((float) Math.sqrt(((1.0f - fNextFloat) * f13) * (f11 - f12)));
    }

    public static int J(float f10) {
        return ((int) (((double) f10) + B)) - 16384;
    }

    public static int K(float f10) {
        return (int) (f10 + 0.5f);
    }

    public static float L(float f10) {
        return b.f165471a[((int) (f10 * f165454k)) & 16383];
    }

    public static float M(float f10) {
        return b.f165471a[((int) (f10 * f165455l)) & 16383];
    }

    public static float a(float f10, float f11) {
        float fAtan2;
        float f12 = 0.0f;
        float f13 = -1.0f;
        if (f11 < 0.0f) {
            if (f10 < 0.0f) {
                f10 = -f10;
                f13 = 1.0f;
            }
            f11 = -f11;
            f12 = -3.1415927f;
        } else if (f10 < 0.0f) {
            f10 = -f10;
        } else {
            f13 = 1.0f;
        }
        float f14 = 1.0f / ((f11 < f10 ? f10 : f11) * f165465v);
        if (f14 == Float.POSITIVE_INFINITY) {
            fAtan2 = (float) Math.atan2(f10, f11);
        } else {
            fAtan2 = a.f165470a[(((int) (f10 * f14)) * f165464u) + ((int) (f11 * f14))];
        }
        return (fAtan2 + f12) * f13;
    }

    public static int b(float f10) {
        return ((int) (((double) f10) + A)) - 16384;
    }

    public static int c(float f10) {
        return (int) (((double) f10) + f165469z);
    }

    public static double d(double d10, double d11, double d12) {
        if (d10 < d11) {
            return d11;
        }
        return d10 > d12 ? d12 : d10;
    }

    public static float e(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    public static int f(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static long g(long j10, long j11, long j12) {
        if (j10 < j11) {
            return j11;
        }
        return j10 > j12 ? j12 : j10;
    }

    public static short h(short s10, short s11, short s12) {
        if (s10 < s11) {
            return s11;
        }
        return s10 > s12 ? s12 : s10;
    }

    public static float i(float f10) {
        return b.f165471a[((int) ((f10 + 1.5707964f) * f165454k)) & 16383];
    }

    public static float j(float f10) {
        return b.f165471a[((int) ((f10 + 90.0f) * f165455l)) & 16383];
    }

    public static int k(float f10) {
        return ((int) (((double) f10) + f165468y)) - 16384;
    }

    public static int l(float f10) {
        return (int) f10;
    }

    public static boolean m(float f10, float f11) {
        return Math.abs(f10 - f11) <= 1.0E-6f;
    }

    public static boolean n(float f10, float f11, float f12) {
        return Math.abs(f10 - f11) <= f12;
    }

    public static boolean o(int i10) {
        return i10 != 0 && (i10 & (i10 + (-1))) == 0;
    }

    public static boolean p(float f10) {
        return Math.abs(f10) <= 1.0E-6f;
    }

    public static boolean q(float f10, float f11) {
        return Math.abs(f10) <= f11;
    }

    public static float r(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public static float s(float f10, float f11) {
        return (float) (Math.log(f11) / Math.log(f10));
    }

    public static float t(float f10) {
        return s(2.0f, f10);
    }

    public static int u(int i10) {
        if (i10 == 0) {
            return 1;
        }
        int i11 = i10 - 1;
        int i12 = i11 | (i11 >> 1);
        int i13 = i12 | (i12 >> 2);
        int i14 = i13 | (i13 >> 4);
        int i15 = i14 | (i14 >> 8);
        return (i15 | (i15 >> 16)) + 1;
    }

    public static float v() {
        return f165466w.nextFloat();
    }

    public static float w(float f10) {
        return f165466w.nextFloat() * f10;
    }

    public static float x(float f10, float f11) {
        return f10 + (f165466w.nextFloat() * (f11 - f10));
    }

    public static int y(int i10) {
        return f165466w.nextInt(i10 + 1);
    }

    public static int z(int i10, int i11) {
        return i10 + f165466w.nextInt((i11 - i10) + 1);
    }
}
