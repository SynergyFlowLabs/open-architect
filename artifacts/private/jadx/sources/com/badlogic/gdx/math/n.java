package com.badlogic.gdx.math;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c0 f94999a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c0 f95000b = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c0 f95001c = new c0();

    private static boolean a(float[] fArr, int i10, int i11) {
        if (i11 <= 2) {
            return false;
        }
        int i12 = (i10 + i11) - 3;
        float f10 = 0.0f;
        while (i10 < i12) {
            int i13 = i10 + 2;
            f10 += (fArr[i10] * fArr[i10 + 3]) - (fArr[i13] * fArr[i10 + 1]);
            i10 = i13;
        }
        return (f10 + (fArr[i11 + (-2)] * fArr[1])) - (fArr[0] * fArr[i11 - 1]) < 0.0f;
    }

    public static boolean b(c0 c0Var) {
        float f10 = c0Var.f94907a;
        if (f10 >= 0.0f) {
            float f11 = c0Var.f94908b;
            if (f11 >= 0.0f && f10 + f11 <= 1.0f) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(((f14 - f12) * (f13 - f11)) - ((f12 - f10) * (f15 - f13))) < 1.0E-6f;
    }

    public static void d(float[] fArr) {
        if (a(fArr, 0, fArr.length)) {
            int length = fArr.length - 2;
            int length2 = fArr.length / 2;
            for (int i10 = 0; i10 < length2; i10 += 2) {
                int i11 = length - i10;
                float f10 = fArr[i10];
                int i12 = i10 + 1;
                float f11 = fArr[i12];
                fArr[i10] = fArr[i11];
                int i13 = i11 + 1;
                fArr[i12] = fArr[i13];
                fArr[i11] = f10;
                fArr[i13] = f11;
            }
        }
    }

    public static float e(c0 c0Var, float f10, float f11, float f12) {
        float f13 = c0Var.f94907a;
        float f14 = c0Var.f94908b;
        return (((1.0f - f13) - f14) * f10) + (f13 * f11) + (f14 * f12);
    }

    public static c0 f(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4, c0 c0Var5) {
        float f10 = c0Var.f94907a;
        float f11 = c0Var.f94908b;
        float f12 = (1.0f - f10) - f11;
        c0Var5.f94907a = (c0Var2.f94907a * f12) + (f10 * c0Var3.f94907a) + (c0Var4.f94907a * f11);
        c0Var5.f94908b = (f12 * c0Var2.f94908b) + (c0Var.f94907a * c0Var3.f94908b) + (f11 * c0Var4.f94908b);
        return c0Var5;
    }

    public static float g(float f10, float f11, float f12) {
        float f13 = (f11 * f11) - ((4.0f * f10) * f12);
        if (f13 < 0.0f) {
            return Float.NaN;
        }
        float fSqrt = (float) Math.sqrt(f13);
        float f14 = 1.0f / (f10 * 2.0f);
        float f15 = -f11;
        float f16 = (f15 - fSqrt) * f14;
        float f17 = (f15 + fSqrt) * f14;
        if (f16 > f17) {
            f16 = f17;
            f17 = f16;
        }
        if (f16 > 0.0f) {
            return f16;
        }
        if (f17 > 0.0f) {
            return f17;
        }
        return Float.NaN;
    }

    public static float h(float[] fArr, int i10, int i11) {
        int i12 = i11 + i10;
        float f10 = 0.0f;
        int i13 = i10;
        while (i13 < i12) {
            int i14 = i13 + 1;
            int i15 = i13 + 2;
            int i16 = i15 % i12;
            if (i16 < i10) {
                i16 += i10;
            }
            int i17 = (i13 + 3) % i12;
            if (i17 < i10) {
                i17 += i10;
            }
            f10 = (f10 + (fArr[i13] * fArr[i17])) - (fArr[i16] * fArr[i14]);
            i13 = i15;
        }
        return f10 * 0.5f;
    }

    public static c0 i(float[] fArr, int i10, int i11, c0 c0Var) {
        if (i11 < 6) {
            throw new IllegalArgumentException("A polygon must have 3 or more coordinate pairs.");
        }
        int i12 = (i11 + i10) - 2;
        int i13 = i10;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (i13 < i12) {
            float f13 = fArr[i13];
            float f14 = fArr[i13 + 1];
            int i14 = i13 + 2;
            float f15 = fArr[i14];
            float f16 = fArr[i13 + 3];
            float f17 = (f13 * f16) - (f15 * f14);
            f10 += f17;
            f11 += (f13 + f15) * f17;
            f12 += (f14 + f16) * f17;
            i13 = i14;
        }
        float f18 = fArr[i13];
        float f19 = fArr[i13 + 1];
        float f20 = fArr[i10];
        float f21 = fArr[i10 + 1];
        float f22 = (f18 * f21) - (f20 * f19);
        float f23 = f10 + f22;
        float f24 = f11 + ((f18 + f20) * f22);
        float f25 = f12 + ((f19 + f21) * f22);
        if (f23 == 0.0f) {
            c0Var.f94907a = 0.0f;
            c0Var.f94908b = 0.0f;
            return c0Var;
        }
        float f26 = f23 * 0.5f * 6.0f;
        c0Var.f94907a = f24 / f26;
        c0Var.f94908b = f25 / f26;
        return c0Var;
    }

    public static c0 j(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, c0 c0Var) {
        float f18 = ((f12 + f10) + f14) / 3.0f;
        float f19 = ((f13 + f11) + f15) / 3.0f;
        c0Var.f94907a = f18 - ((f18 - (((f10 + f16) + f14) / 3.0f)) / 2.0f);
        c0Var.f94908b = f19 - ((f19 - (((f11 + f17) + f15) / 3.0f)) / 2.0f);
        return c0Var;
    }

    public static c0 k(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4, c0 c0Var5) {
        c0 c0VarK = f94999a.L(c0Var3).K(c0Var2);
        c0 c0VarK2 = f95000b.L(c0Var4).K(c0Var2);
        c0 c0VarK3 = f95001c.L(c0Var).K(c0Var2);
        float fB = c0VarK.b(c0VarK);
        float fB2 = c0VarK.b(c0VarK2);
        float fB3 = c0VarK2.b(c0VarK2);
        float fB4 = c0VarK3.b(c0VarK);
        float fB5 = c0VarK3.b(c0VarK2);
        float f10 = (fB * fB3) - (fB2 * fB2);
        c0Var5.f94907a = ((fB3 * fB4) - (fB2 * fB5)) / f10;
        c0Var5.f94908b = ((fB * fB5) - (fB2 * fB4)) / f10;
        return c0Var5;
    }

    public static float l(float f10, float f11, float f12, float f13, float f14, float f15) {
        return Math.abs(((f10 - f14) * (f13 - f11)) - ((f10 - f12) * (f15 - f11))) * 0.5f;
    }

    public static c0 m(float f10, float f11, float f12, float f13, float f14, float f15, c0 c0Var) {
        c0Var.f94907a = ((f10 + f12) + f14) / 3.0f;
        c0Var.f94908b = ((f11 + f13) + f15) / 3.0f;
        return c0Var;
    }

    public static c0 n(float f10, float f11, float f12, float f13, float f14, float f15, c0 c0Var) {
        float f16 = f12 - f10;
        float f17 = f13 - f11;
        float f18 = f14 - f12;
        float f19 = f15 - f13;
        float f20 = f10 - f14;
        float f21 = f11 - f15;
        float f22 = (f18 * f17) - (f16 * f19);
        if (Math.abs(f22) < 1.0E-6f) {
            throw new IllegalArgumentException("Triangle points must not be colinear.");
        }
        float f23 = f22 * 2.0f;
        float f24 = (f10 * f10) + (f11 * f11);
        float f25 = (f12 * f12) + (f13 * f13);
        float f26 = (f14 * f14) + (f15 * f15);
        c0Var.K0((((f19 * f24) + (f21 * f25)) + (f17 * f26)) / f23, (-(((f24 * f18) + (f25 * f20)) + (f26 * f16))) / f23);
        return c0Var;
    }
}
