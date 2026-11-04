package com.badlogic.gdx.math;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d0 f95033a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d0 f95034b = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d0 f95035c = new d0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v f95036d = new v(new d0(), 0.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d0 f95037e = new d0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d0 f95038f = new d0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d0 f95039g = new d0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static d0 f95040h = new d0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static d0 f95041i = new d0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static d0 f95042j = new d0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static d0 f95043k = new d0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static d0 f95044l = new d0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static c0 f95045m = new c0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static d0 f95046n = new d0();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c0 f95047a = new c0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f95048b = 0.0f;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f95049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f95050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float[] f95051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f95052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f95053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f95054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f95055g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f95056h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f95057i = 0;

        public b(int i10) {
            int i11 = i10 * 6;
            this.f95049a = new float[i11];
            this.f95050b = new float[i11];
            this.f95051c = new float[i10];
        }

        void a(float[] fArr, int i10, int i11) {
            if (this.f95055g) {
                System.arraycopy(fArr, i10, this.f95049a, this.f95056h, i11);
                this.f95056h += i11;
            } else {
                System.arraycopy(fArr, i10, this.f95050b, this.f95057i, i11);
                this.f95057i += i11;
            }
        }

        boolean b() {
            return this.f95055g;
        }

        void c() {
            this.f95055g = false;
            this.f95056h = 0;
            this.f95057i = 0;
            this.f95052d = 0;
            this.f95053e = 0;
            this.f95054f = 0;
        }

        void d(boolean z10) {
            this.f95055g = z10;
        }

        public String toString() {
            return "SplitTriangle [front=" + Arrays.toString(this.f95049a) + ", back=" + Arrays.toString(this.f95050b) + ", numFront=" + this.f95052d + ", numBack=" + this.f95053e + ", total=" + this.f95054f + "]";
        }
    }

    public static boolean A(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4, c0 c0Var5) {
        float f10 = c0Var.f94907a;
        float f11 = c0Var.f94908b;
        float f12 = c0Var2.f94907a;
        float f13 = c0Var2.f94908b;
        float f14 = c0Var3.f94907a;
        float f15 = c0Var3.f94908b;
        float f16 = c0Var4.f94907a;
        float f17 = c0Var4.f94908b - f15;
        float f18 = f12 - f10;
        float f19 = f16 - f14;
        float f20 = f13 - f11;
        float f21 = (f17 * f18) - (f19 * f20);
        int i10 = 0 >> 0;
        if (f21 == 0.0f) {
            return false;
        }
        float f22 = f11 - f15;
        float f23 = f10 - f14;
        float f24 = ((f19 * f22) - (f17 * f23)) / f21;
        if (f24 >= 0.0f && f24 <= 1.0f) {
            float f25 = ((f22 * f18) - (f23 * f20)) / f21;
            if (f25 >= 0.0f && f25 <= 1.0f) {
                if (c0Var5 == null) {
                    return true;
                }
                c0Var5.K0(f10 + (f18 * f24), f11 + (f20 * f24));
                return true;
            }
        }
        return false;
    }

    public static boolean B(com.badlogic.gdx.utils.b<c0> bVar, c0 c0Var) {
        c0 c0VarPeek = bVar.peek();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < bVar.f95174b) {
            c0 c0Var2 = bVar.get(i10);
            float f10 = c0Var2.f94908b;
            float f11 = c0Var.f94908b;
            if ((f10 < f11 && c0VarPeek.f94908b >= f11) || (c0VarPeek.f94908b < f11 && f10 >= f11)) {
                float f12 = c0Var2.f94907a;
                if (f12 + (((f11 - f10) / (c0VarPeek.f94908b - f10)) * (c0VarPeek.f94907a - f12)) < c0Var.f94907a) {
                    z10 = !z10;
                }
            }
            i10++;
            c0VarPeek = c0Var2;
        }
        return z10;
    }

    public static boolean C(float[] fArr, int i10, int i11, float f10, float f11) {
        int i12 = (i11 + i10) - 2;
        boolean z10 = false;
        int i13 = i12;
        while (i10 <= i12) {
            float f12 = fArr[i10 + 1];
            float f13 = fArr[i13 + 1];
            if ((f12 < f11 && f13 >= f11) || (f13 < f11 && f12 >= f11)) {
                float f14 = fArr[i10];
                if (f14 + (((f11 - f12) / (f13 - f12)) * (fArr[i13] - f14)) < f10) {
                    z10 = !z10;
                }
            }
            i13 = i10;
            i10 += 2;
        }
        return z10;
    }

    public static boolean D(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = f10 - f12;
        float f19 = f11 - f13;
        boolean z10 = ((f14 - f12) * f19) - ((f15 - f13) * f18) > 0.0f;
        if ((((f16 - f12) * f19) - ((f17 - f13) * f18) > 0.0f) == z10) {
            return false;
        }
        return (((((f16 - f14) * (f11 - f15)) - ((f17 - f15) * (f10 - f14))) > 0.0f ? 1 : ((((f16 - f14) * (f11 - f15)) - ((f17 - f15) * (f10 - f14))) == 0.0f ? 0 : -1)) > 0) == z10;
    }

    public static boolean E(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        float f10 = c0Var.f94907a;
        float f11 = c0Var2.f94907a;
        float f12 = f10 - f11;
        float f13 = c0Var.f94908b;
        float f14 = c0Var2.f94908b;
        float f15 = f13 - f14;
        float f16 = c0Var3.f94907a;
        float f17 = c0Var3.f94908b;
        boolean z10 = ((f16 - f11) * f15) - ((f17 - f14) * f12) > 0.0f;
        float f18 = c0Var4.f94907a;
        float f19 = c0Var4.f94908b;
        if ((((f18 - f11) * f15) - ((f19 - f14) * f12) > 0.0f) == z10) {
            return false;
        }
        return (((((f18 - f16) * (f13 - f17)) - ((f19 - f17) * (f10 - f16))) > 0.0f ? 1 : ((((f18 - f16) * (f13 - f17)) - ((f19 - f17) * (f10 - f16))) == 0.0f ? 0 : -1)) > 0) == z10;
    }

    public static boolean F(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4) {
        d0 d0Var5 = f95033a;
        d0Var5.L(d0Var2).K(d0Var);
        d0 d0Var6 = f95034b;
        d0Var6.L(d0Var3).K(d0Var);
        d0 d0Var7 = f95035c;
        d0Var7.L(d0Var4).K(d0Var);
        float fB = d0Var5.b(d0Var6);
        float fB2 = d0Var5.b(d0Var7);
        float fB3 = d0Var6.b(d0Var7);
        if ((fB3 * fB2) - (d0Var7.b(d0Var7) * fB) >= 0.0f && (fB * fB3) - (fB2 * d0Var6.b(d0Var6)) >= 0.0f) {
            return true;
        }
        return false;
    }

    public static void G(String[] strArr) {
        v vVar = new v(new d0(1.0f, 0.0f, 0.0f), 0.0f);
        b bVar = new b(3);
        T(new float[]{-10.0f, 0.0f, 10.0f, -1.0f, 0.0f, 0.0f, -10.0f, 0.0f, 10.0f}, vVar, bVar);
        System.out.println(bVar);
        T(new float[]{-10.0f, 0.0f, 10.0f, 10.0f, 0.0f, 0.0f, -10.0f, 0.0f, -10.0f}, vVar, bVar);
        System.out.println(bVar);
        f fVar = new f(0.0f, 0.0f, 1.0f);
        f fVar2 = new f(0.0f, 0.0f, 1.0f);
        f fVar3 = new f(2.0f, 0.0f, 1.0f);
        f fVar4 = new f(0.0f, 0.0f, 2.0f);
        System.out.println("Circle test cases");
        System.out.println(fVar.f(fVar));
        System.out.println(fVar.f(fVar2));
        System.out.println(fVar.f(fVar3));
        System.out.println(fVar.f(fVar4));
        System.out.println(fVar4.f(fVar));
        System.out.println(fVar.c(0.0f, 1.0f));
        System.out.println(fVar.c(0.0f, 2.0f));
        System.out.println(fVar.d(fVar));
        System.out.println(fVar.d(fVar4));
        System.out.println(fVar4.d(fVar));
        System.out.println("Rectangle test cases");
        a0 a0Var = new a0(0.0f, 0.0f, 1.0f, 1.0f);
        a0 a0Var2 = new a0(1.0f, 0.0f, 2.0f, 1.0f);
        System.out.println(a0Var.s(a0Var));
        System.out.println(a0Var.s(a0Var2));
        System.out.println(a0Var.b(0.0f, 0.0f));
        System.out.println("BoundingBox test cases");
        d0 d0Var = d0.f94933h;
        com.planner5d.library.engine.util.math.b bVar2 = new com.planner5d.library.engine.util.math.b(d0Var, new d0(1.0f, 1.0f, 1.0f));
        com.planner5d.library.engine.util.math.b bVar3 = new com.planner5d.library.engine.util.math.b(new d0(1.0f, 1.0f, 1.0f), new d0(2.0f, 2.0f, 2.0f));
        System.out.println(bVar2.c(d0Var));
        System.out.println(bVar2.b(bVar2));
        System.out.println(bVar2.b(bVar3));
    }

    public static c0 H(float f10, float f11, float f12, float f13, float f14, float f15, c0 c0Var) {
        float f16 = f12 - f10;
        float f17 = f13 - f11;
        float f18 = (f16 * f16) + (f17 * f17);
        if (f18 == 0.0f) {
            return c0Var.K0(f10, f11);
        }
        float f19 = (((f14 - f10) * f16) + ((f15 - f11) * f17)) / f18;
        if (f19 < 0.0f) {
            return c0Var.K0(f10, f11);
        }
        return f19 > 1.0f ? c0Var.K0(f12, f13) : c0Var.K0(f10 + (f16 * f19), f11 + (f19 * f17));
    }

    public static c0 I(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        float fL = c0Var.l(c0Var2);
        int i10 = 7 | 0;
        if (fL == 0.0f) {
            return c0Var4.L(c0Var);
        }
        float f10 = c0Var3.f94907a;
        float f11 = c0Var.f94907a;
        float f12 = c0Var2.f94907a;
        float f13 = c0Var3.f94908b;
        float f14 = c0Var.f94908b;
        float f15 = c0Var2.f94908b;
        float f16 = (((f10 - f11) * (f12 - f11)) + ((f13 - f14) * (f15 - f14))) / fL;
        if (f16 < 0.0f) {
            return c0Var4.L(c0Var);
        }
        return f16 > 1.0f ? c0Var4.L(c0Var2) : c0Var4.K0(f11 + ((f12 - f11) * f16), f14 + (f16 * (f15 - f14)));
    }

    public static boolean J(w wVar, w wVar2) {
        return K(wVar, wVar2, null);
    }

    public static boolean K(w wVar, w wVar2, a aVar) {
        return M(wVar.j(), wVar2.j(), aVar);
    }

    public static boolean L(float[] fArr, int i10, int i11, float[] fArr2, int i12, int i13, a aVar) {
        int i14 = i10 + i11;
        int i15 = i12 + i13;
        float f10 = Float.MAX_VALUE;
        float f11 = 0.0f;
        int i16 = i10;
        float f12 = 0.0f;
        while (i16 < i14) {
            float f13 = fArr[i16];
            float f14 = fArr[i16 + 1];
            int i17 = i16 + 2;
            float f15 = fArr[i17 % i11];
            float f16 = fArr[(i16 + 3) % i11];
            float f17 = f14 - f16;
            float f18 = -(f13 - f15);
            float fSqrt = (float) Math.sqrt((f17 * f17) + (f18 * f18));
            float f19 = f17 / fSqrt;
            float f20 = f18 / fSqrt;
            float f21 = (fArr[0] * f19) + (fArr[1] * f20);
            float f22 = f21;
            for (int i18 = i10; i18 < i14; i18 += 2) {
                float f23 = (fArr[i18] * f19) + (fArr[i18 + 1] * f20);
                if (f23 < f21) {
                    f21 = f23;
                } else if (f23 > f22) {
                    f22 = f23;
                }
            }
            float f24 = (fArr2[0] * f19) + (fArr2[1] * f20);
            float f25 = f10;
            float f26 = f11;
            float f27 = f24;
            int iQ = 0;
            int i19 = i12;
            while (i19 < i15) {
                float f28 = f22;
                int i20 = i19 + 1;
                float f29 = f24;
                int i21 = i19;
                float f30 = f12;
                iQ -= Q(f13, f14, f15, f16, fArr2[i19], fArr2[i20]);
                float f31 = (fArr2[i21] * f19) + (fArr2[i20] * f20);
                if (f31 < f29) {
                    f24 = f31;
                } else if (f31 > f27) {
                    f24 = f29;
                    f27 = f31;
                } else {
                    f24 = f29;
                }
                f22 = f28;
                i19 = i21 + 2;
                f12 = f30;
            }
            float f32 = f12;
            float f33 = f22;
            float f34 = f24;
            if ((f21 > f34 || f33 < f34) && (f34 > f21 || f27 < f21)) {
                return false;
            }
            float fMin = Math.min(f33, f27) - Math.max(f21, f34);
            if ((f21 < f34 && f33 > f27) || (f34 < f21 && f27 > f33)) {
                float fAbs = Math.abs(f21 - f34);
                float fAbs2 = Math.abs(f33 - f27);
                fMin = fAbs < fAbs2 ? fMin + fAbs : fMin + fAbs2;
            }
            if (fMin < f25) {
                if (iQ < 0) {
                    f19 = -f19;
                }
                if (iQ < 0) {
                    f20 = -f20;
                }
                f11 = f19;
                f12 = f20;
                f10 = fMin;
            } else {
                f10 = f25;
                f11 = f26;
                f12 = f32;
            }
            i16 = i17;
        }
        int i22 = i12;
        while (i22 < i15) {
            float f35 = fArr2[i22];
            float f36 = fArr2[i22 + 1];
            int i23 = i22 + 2;
            float f37 = fArr2[i23 % i13];
            float f38 = fArr2[(i22 + 3) % i13];
            float f39 = f36 - f38;
            float f40 = -(f35 - f37);
            float fSqrt2 = (float) Math.sqrt((f39 * f39) + (f40 * f40));
            float f41 = f39 / fSqrt2;
            float f42 = f40 / fSqrt2;
            float f43 = (fArr[0] * f41) + (fArr[1] * f42);
            int i24 = i10;
            float f44 = f43;
            int iQ2 = 0;
            while (i24 < i14) {
                float f45 = f43;
                float f46 = fArr[i24];
                float f47 = fArr[i24 + 1];
                float f48 = (f41 * f46) + (f42 * f47);
                int i25 = i14;
                int i26 = i24;
                iQ2 -= Q(f35, f36, f37, f38, f46, f47);
                if (f48 < f44) {
                    f43 = f45;
                    f44 = f48;
                } else {
                    f43 = f48 > f45 ? f48 : f45;
                }
                i24 = i26 + 2;
                i14 = i25;
            }
            int i27 = i14;
            float f49 = f43;
            float f50 = (fArr2[0] * f41) + (fArr2[1] * f42);
            float f51 = f50;
            for (int i28 = i12; i28 < i15; i28 += 2) {
                float f52 = (fArr2[i28] * f41) + (fArr2[i28 + 1] * f42);
                if (f52 < f50) {
                    f50 = f52;
                } else if (f52 > f51) {
                    f51 = f52;
                }
            }
            if ((f44 > f50 || f49 < f50) && (f50 > f44 || f51 < f44)) {
                return false;
            }
            float fMin2 = Math.min(f49, f51) - Math.max(f44, f50);
            if ((f44 < f50 && f49 > f51) || (f50 < f44 && f51 > f49)) {
                float fAbs3 = Math.abs(f44 - f50);
                float fAbs4 = Math.abs(f49 - f51);
                fMin2 = fAbs3 < fAbs4 ? fMin2 + fAbs3 : fMin2 + fAbs4;
            }
            if (fMin2 < f10) {
                if (iQ2 >= 0) {
                    f41 = -f41;
                }
                if (iQ2 >= 0) {
                    f42 = -f42;
                }
                f11 = f41;
                f10 = fMin2;
                f12 = f42;
            }
            i22 = i23;
            i14 = i27;
        }
        if (aVar != null) {
            aVar.f95047a.K0(f11, f12);
            aVar.f95048b = f10;
        }
        return true;
    }

    public static boolean M(float[] fArr, float[] fArr2, a aVar) {
        return L(fArr, 0, fArr.length, fArr2, 0, fArr2.length, aVar);
    }

    public static boolean N(f fVar, f fVar2) {
        return fVar.f(fVar2);
    }

    public static boolean O(f fVar, a0 a0Var) {
        float f10 = fVar.f94941a;
        float f11 = fVar.f94942b;
        float f12 = a0Var.f94886a;
        if (f10 >= f12) {
            float f13 = a0Var.f94888c;
            f12 = f10 > f12 + f13 ? f12 + f13 : f10;
        }
        float f14 = a0Var.f94887b;
        if (f11 >= f14) {
            float f15 = a0Var.f94889d;
            f14 = f11 > f14 + f15 ? f14 + f15 : f11;
        }
        float f16 = f12 - f10;
        float f17 = f14 - f11;
        float f18 = (f16 * f16) + (f17 * f17);
        float f19 = fVar.f94943c;
        return f18 < f19 * f19;
    }

    public static boolean P(a0 a0Var, a0 a0Var2) {
        return a0Var.s(a0Var2);
    }

    public static int Q(float f10, float f11, float f12, float f13, float f14, float f15) {
        return (int) Math.signum(((f12 - f10) * (f15 - f11)) - ((f13 - f11) * (f14 - f10)));
    }

    public static int R(c0 c0Var, c0 c0Var2, c0 c0Var3) {
        float f10 = c0Var2.f94907a;
        float f11 = c0Var.f94907a;
        float f12 = c0Var3.f94908b;
        float f13 = c0Var.f94908b;
        return (int) Math.signum(((f10 - f11) * (f12 - f13)) - ((c0Var2.f94908b - f13) * (c0Var3.f94907a - f11)));
    }

    private static void S(float[] fArr, int i10, int i11, int i12, v vVar, float[] fArr2, int i13) {
        float f10 = f(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i11], fArr[i11 + 1], fArr[i11 + 2], vVar, f95046n);
        d0 d0Var = f95046n;
        fArr2[i13] = d0Var.f180482a;
        fArr2[i13 + 1] = d0Var.f180483b;
        fArr2[i13 + 2] = d0Var.f180484c;
        for (int i14 = 3; i14 < i12; i14++) {
            float f11 = fArr[i10 + i14];
            fArr2[i13 + i14] = f11 + ((fArr[i11 + i14] - f11) * f10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    public static void T(float[] fArr, v vVar, b bVar) {
        int length = fArr.length / 3;
        v.a aVarJ = vVar.j(fArr[0], fArr[1], fArr[2]);
        v.a aVar = v.a.Back;
        ?? r11 = aVarJ == aVar ? 1 : 0;
        int i10 = vVar.j(fArr[length], fArr[length + 1], fArr[length + 2]) == aVar ? 1 : 0;
        int i11 = length * 2;
        int i12 = vVar.j(fArr[i11], fArr[i11 + 1], fArr[i11 + 2]) == aVar ? 1 : 0;
        bVar.c();
        if (r11 == i10 && i10 == i12) {
            bVar.f95054f = 1;
            if (r11 != 0) {
                bVar.f95053e = 1;
                System.arraycopy(fArr, 0, bVar.f95050b, 0, fArr.length);
                return;
            } else {
                bVar.f95052d = 1;
                System.arraycopy(fArr, 0, bVar.f95049a, 0, fArr.length);
                return;
            }
        }
        bVar.f95054f = 3;
        int i13 = r11 + i10 + i12;
        bVar.f95052d = i13;
        bVar.f95053e = 3 - i13;
        bVar.d(r11);
        int i14 = length;
        if (r11 != i10) {
            S(fArr, 0, i14, i14, vVar, bVar.f95051c, 0);
            bVar.a(fArr, 0, i14);
            bVar.a(bVar.f95051c, 0, i14);
            bVar.d(!bVar.b());
            bVar.a(bVar.f95051c, 0, i14);
        } else {
            bVar.a(fArr, 0, i14);
        }
        int i15 = i14 + i14;
        if (i10 != i12) {
            S(fArr, i14, i15, i14, vVar, bVar.f95051c, 0);
            bVar.a(fArr, i14, i14);
            bVar.a(bVar.f95051c, 0, i14);
            bVar.d(!bVar.b());
            bVar.a(bVar.f95051c, 0, i14);
        } else {
            bVar.a(fArr, i14, i14);
        }
        if (i12 != r11) {
            i14 = i14;
            i15 = i15;
            int i16 = i14;
            S(fArr, i15, 0, i16, vVar, bVar.f95051c, 0);
            i14 = i16;
            bVar.a(fArr, i15, i14);
            bVar.a(bVar.f95051c, 0, i14);
            bVar.d(!bVar.b());
            bVar.a(bVar.f95051c, 0, i14);
        } else {
            i14 = i14;
            i15 = i15;
            bVar.a(fArr, i15, i14);
        }
        if (bVar.f95052d == 2) {
            float[] fArr2 = bVar.f95049a;
            System.arraycopy(fArr2, i11, fArr2, i14 * 3, i11);
            float[] fArr3 = bVar.f95049a;
            System.arraycopy(fArr3, 0, fArr3, i14 * 5, i14);
            return;
        }
        float[] fArr4 = bVar.f95050b;
        System.arraycopy(fArr4, i11, fArr4, i14 * 3, i11);
        float[] fArr5 = bVar.f95050b;
        System.arraycopy(fArr5, 0, fArr5, i14 * 5, i14);
    }

    static float a(float f10, float f11, float f12, float f13) {
        return (f10 * f13) - (f11 * f12);
    }

    static double b(double d10, double d11, double d12, double d13) {
        return (d10 * d13) - (d11 * d12);
    }

    public static float c(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f12 - f10;
        float f17 = f13 - f11;
        return Math.abs(((f14 - f10) * f17) - ((f15 - f11) * f16)) / ((float) Math.sqrt((f16 * f16) + (f17 * f17)));
    }

    public static float d(float f10, float f11, float f12, float f13, float f14, float f15) {
        return H(f10, f11, f12, f13, f14, f15, f95045m).c0(f14, f15);
    }

    public static float e(c0 c0Var, c0 c0Var2, c0 c0Var3) {
        return I(c0Var, c0Var2, c0Var3, f95045m).H(c0Var3);
    }

    public static float f(float f10, float f11, float f12, float f13, float f14, float f15, v vVar, com.planner5d.library.math.m mVar) {
        d0 d0VarG0 = f95041i.y0(f13, f14, f15).G0(f10, f11, f12);
        d0 d0VarY0 = f95043k.y0(f10, f11, f12);
        float fB = d0VarG0.b(vVar.c());
        if (fB != 0.0f) {
            float f16 = (-(d0VarY0.b(vVar.c()) + vVar.b())) / fB;
            if (mVar != null) {
                mVar.A0(d0VarY0).R(d0VarG0.c(f16));
            }
            return f16;
        }
        if (vVar.k(d0VarY0) != v.a.OnPlane) {
            return -1.0f;
        }
        if (mVar != null) {
            mVar.A0(d0VarY0);
        }
        return 0.0f;
    }

    public static boolean g(c0 c0Var, c0 c0Var2, w wVar) {
        float[] fArrJ = wVar.j();
        float f10 = c0Var.f94907a;
        float f11 = c0Var.f94908b;
        float f12 = c0Var2.f94907a;
        float f13 = c0Var2.f94908b;
        int length = fArrJ.length;
        float f14 = fArrJ[length - 2];
        float f15 = fArrJ[length - 1];
        int i10 = 0;
        while (i10 < length) {
            float f16 = fArrJ[i10];
            float f17 = fArrJ[i10 + 1];
            float f18 = f17 - f15;
            float f19 = f16 - f14;
            float f20 = ((f12 - f10) * f18) - ((f13 - f11) * f19);
            if (f20 != 0.0f) {
                float f21 = ((f19 * (f11 - f15)) - (f18 * (f10 - f14))) / f20;
                if (f21 >= 0.0f && f21 <= 1.0f) {
                    return true;
                }
            }
            i10 += 2;
            f14 = f16;
            f15 = f17;
        }
        return false;
    }

    public static boolean h(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, c0 c0Var) {
        float f18 = f17 - f15;
        float f19 = f12 - f10;
        float f20 = f16 - f14;
        float f21 = f13 - f11;
        float f22 = (f18 * f19) - (f20 * f21);
        if (f22 == 0.0f) {
            return false;
        }
        if (c0Var != null) {
            float f23 = ((f20 * (f11 - f15)) - (f18 * (f10 - f14))) / f22;
            c0Var.K0(f10 + (f19 * f23), f11 + (f21 * f23));
        }
        return true;
    }

    public static boolean i(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4, c0 c0Var5) {
        float f10 = c0Var.f94907a;
        float f11 = c0Var.f94908b;
        float f12 = c0Var2.f94907a;
        float f13 = c0Var2.f94908b;
        float f14 = c0Var3.f94907a;
        float f15 = c0Var3.f94908b;
        float f16 = c0Var4.f94907a;
        float f17 = c0Var4.f94908b - f15;
        float f18 = f12 - f10;
        float f19 = f16 - f14;
        float f20 = f13 - f11;
        float f21 = (f17 * f18) - (f19 * f20);
        if (f21 == 0.0f) {
            return false;
        }
        if (c0Var5 != null) {
            float f22 = ((f19 * (f11 - f15)) - (f17 * (f10 - f14))) / f21;
            c0Var5.K0(f10 + (f18 * f22), f11 + (f20 * f22));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0236  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    public static boolean j(com.badlogic.gdx.math.collision.b bVar, com.planner5d.library.engine.util.math.b bVar2, com.planner5d.library.math.m mVar) {
        boolean z10;
        float f10;
        boolean z11 = true;
        if (bVar2.c(bVar.f94917a)) {
            if (mVar != null) {
                mVar.A0(bVar.f94917a);
            }
            return true;
        }
        float f11 = bVar.f94917a.f180482a;
        float f12 = bVar2.f165422a.f180482a;
        if (f11 <= f12) {
            d0 d0Var = bVar.f94918b;
            float f13 = d0Var.f180482a;
            if (f13 > 0.0f) {
                f10 = (f12 - f11) / f13;
                if (f10 >= 0.0f) {
                    d0 d0Var2 = f95035c;
                    d0Var2.L(d0Var).c(f10).i(bVar.f94917a);
                    float f14 = d0Var2.f180483b;
                    com.planner5d.library.math.m mVar2 = bVar2.f165422a;
                    if (f14 >= mVar2.f180483b) {
                        com.planner5d.library.math.m mVar3 = bVar2.f165423b;
                        if (f14 <= mVar3.f180483b) {
                            float f15 = d0Var2.f180484c;
                            if (f15 < mVar2.f180484c || f15 > mVar3.f180484c) {
                                z10 = false;
                                f10 = 0.0f;
                            } else {
                                z10 = true;
                            }
                        } else {
                            z10 = false;
                            f10 = 0.0f;
                        }
                    } else {
                        z10 = false;
                        f10 = 0.0f;
                    }
                } else {
                    z10 = false;
                    f10 = 0.0f;
                }
            } else {
                z10 = false;
                f10 = 0.0f;
            }
        } else {
            z10 = false;
            f10 = 0.0f;
        }
        float f16 = bVar.f94917a.f180482a;
        float f17 = bVar2.f165423b.f180482a;
        if (f16 >= f17) {
            d0 d0Var3 = bVar.f94918b;
            float f18 = d0Var3.f180482a;
            if (f18 < 0.0f) {
                float f19 = (f17 - f16) / f18;
                if (f19 >= 0.0f) {
                    d0 d0Var4 = f95035c;
                    d0Var4.L(d0Var3).c(f19).i(bVar.f94917a);
                    float f20 = d0Var4.f180483b;
                    com.planner5d.library.math.m mVar4 = bVar2.f165422a;
                    if (f20 >= mVar4.f180483b) {
                        com.planner5d.library.math.m mVar5 = bVar2.f165423b;
                        if (f20 <= mVar5.f180483b) {
                            float f21 = d0Var4.f180484c;
                            if (f21 >= mVar4.f180484c && f21 <= mVar5.f180484c && (!z10 || f19 < f10)) {
                                z10 = true;
                                f10 = f19;
                            }
                        }
                    }
                }
            }
        }
        float f22 = bVar.f94917a.f180483b;
        float f23 = bVar2.f165422a.f180483b;
        if (f22 <= f23) {
            d0 d0Var5 = bVar.f94918b;
            float f24 = d0Var5.f180483b;
            if (f24 > 0.0f) {
                float f25 = (f23 - f22) / f24;
                if (f25 >= 0.0f) {
                    d0 d0Var6 = f95035c;
                    d0Var6.L(d0Var5).c(f25).i(bVar.f94917a);
                    float f26 = d0Var6.f180482a;
                    com.planner5d.library.math.m mVar6 = bVar2.f165422a;
                    if (f26 >= mVar6.f180482a) {
                        com.planner5d.library.math.m mVar7 = bVar2.f165423b;
                        if (f26 <= mVar7.f180482a) {
                            float f27 = d0Var6.f180484c;
                            if (f27 >= mVar6.f180484c && f27 <= mVar7.f180484c && (!z10 || f25 < f10)) {
                                z10 = true;
                                f10 = f25;
                            }
                        }
                    }
                }
            }
        }
        float f28 = bVar.f94917a.f180483b;
        float f29 = bVar2.f165423b.f180483b;
        if (f28 >= f29) {
            d0 d0Var7 = bVar.f94918b;
            float f30 = d0Var7.f180483b;
            if (f30 < 0.0f) {
                float f31 = (f29 - f28) / f30;
                if (f31 >= 0.0f) {
                    d0 d0Var8 = f95035c;
                    d0Var8.L(d0Var7).c(f31).i(bVar.f94917a);
                    float f32 = d0Var8.f180482a;
                    com.planner5d.library.math.m mVar8 = bVar2.f165422a;
                    if (f32 >= mVar8.f180482a) {
                        com.planner5d.library.math.m mVar9 = bVar2.f165423b;
                        if (f32 <= mVar9.f180482a) {
                            float f33 = d0Var8.f180484c;
                            if (f33 >= mVar8.f180484c && f33 <= mVar9.f180484c && (!z10 || f31 < f10)) {
                                z10 = true;
                                f10 = f31;
                            }
                        }
                    }
                }
            }
        }
        float f34 = bVar.f94917a.f180484c;
        float f35 = bVar2.f165422a.f180484c;
        if (f34 <= f35) {
            d0 d0Var9 = bVar.f94918b;
            float f36 = d0Var9.f180484c;
            if (f36 > 0.0f) {
                float f37 = (f35 - f34) / f36;
                if (f37 >= 0.0f) {
                    d0 d0Var10 = f95035c;
                    d0Var10.L(d0Var9).c(f37).i(bVar.f94917a);
                    float f38 = d0Var10.f180482a;
                    com.planner5d.library.math.m mVar10 = bVar2.f165422a;
                    if (f38 >= mVar10.f180482a) {
                        com.planner5d.library.math.m mVar11 = bVar2.f165423b;
                        if (f38 <= mVar11.f180482a) {
                            float f39 = d0Var10.f180483b;
                            if (f39 >= mVar10.f180483b && f39 <= mVar11.f180483b && (!z10 || f37 < f10)) {
                                z10 = true;
                                f10 = f37;
                            }
                        }
                    }
                }
            }
        }
        float f40 = bVar.f94917a.f180484c;
        float f41 = bVar2.f165423b.f180484c;
        if (f40 >= f41) {
            d0 d0Var11 = bVar.f94918b;
            float f42 = d0Var11.f180484c;
            if (f42 < 0.0f) {
                float f43 = (f41 - f40) / f42;
                if (f43 >= 0.0f) {
                    d0 d0Var12 = f95035c;
                    d0Var12.L(d0Var11).c(f43).i(bVar.f94917a);
                    float f44 = d0Var12.f180482a;
                    com.planner5d.library.math.m mVar12 = bVar2.f165422a;
                    if (f44 >= mVar12.f180482a) {
                        com.planner5d.library.math.m mVar13 = bVar2.f165423b;
                        if (f44 <= mVar13.f180482a) {
                            float f45 = d0Var12.f180483b;
                            if (f45 < mVar12.f180483b || f45 > mVar13.f180483b || (z10 && f43 >= f10)) {
                                z11 = z10;
                            } else {
                                f10 = f43;
                            }
                        } else {
                            z11 = z10;
                        }
                    } else {
                        z11 = z10;
                    }
                } else {
                    z11 = z10;
                }
            } else {
                z11 = z10;
            }
        } else {
            z11 = z10;
        }
        if (z11 && mVar != null) {
            mVar.A0(bVar.f94918b).v0(f10).R(bVar.f94917a);
            float f46 = mVar.f180482a;
            com.planner5d.library.math.m mVar14 = bVar2.f165422a;
            float f47 = mVar14.f180482a;
            if (f46 < f47) {
                mVar.f180482a = f47;
            } else {
                float f48 = bVar2.f165423b.f180482a;
                if (f46 > f48) {
                    mVar.f180482a = f48;
                }
            }
            float f49 = mVar.f180483b;
            float f50 = mVar14.f180483b;
            if (f49 < f50) {
                mVar.f180483b = f50;
            } else {
                float f51 = bVar2.f165423b.f180483b;
                if (f49 > f51) {
                    mVar.f180483b = f51;
                }
            }
            float f52 = mVar.f180484c;
            float f53 = mVar14.f180484c;
            if (f52 < f53) {
                mVar.f180484c = f53;
                return z11;
            }
            float f54 = bVar2.f165423b.f180484c;
            if (f52 > f54) {
                mVar.f180484c = f54;
            }
        }
        return z11;
    }

    public static boolean k(com.badlogic.gdx.math.collision.b bVar, d0 d0Var, d0 d0Var2) {
        d0 d0Var3 = bVar.f94918b;
        float f10 = 1.0f / d0Var3.f180482a;
        float f11 = 1.0f / d0Var3.f180483b;
        float f12 = 1.0f / d0Var3.f180484c;
        float f13 = d0Var.f180482a;
        float f14 = d0Var2.f180482a;
        d0 d0Var4 = bVar.f94917a;
        float f15 = d0Var4.f180482a;
        float f16 = ((f13 - (f14 * 0.5f)) - f15) * f10;
        float f17 = ((f13 + (f14 * 0.5f)) - f15) * f10;
        if (f16 > f17) {
            f16 = f17;
            f17 = f16;
        }
        float f18 = d0Var.f180483b;
        float f19 = d0Var2.f180483b;
        float f20 = d0Var4.f180483b;
        float f21 = ((f18 - (f19 * 0.5f)) - f20) * f11;
        float f22 = ((f18 + (f19 * 0.5f)) - f20) * f11;
        if (f21 > f22) {
            f21 = f22;
            f22 = f21;
        }
        float f23 = d0Var.f180484c;
        float f24 = d0Var2.f180484c;
        float f25 = d0Var4.f180484c;
        float f26 = ((f23 - (f24 * 0.5f)) - f25) * f12;
        float f27 = ((f23 + (f24 * 0.5f)) - f25) * f12;
        if (f26 > f27) {
            f26 = f27;
            f27 = f26;
        }
        float fMax = Math.max(Math.max(f16, f21), f26);
        float fMin = Math.min(Math.min(f17, f22), f27);
        return fMin >= 0.0f && fMin >= fMax;
    }

    public static boolean l(com.badlogic.gdx.math.collision.b bVar, com.planner5d.library.engine.util.math.b bVar2) {
        return m(bVar, Float.valueOf(bVar2.i(f95042j).f180482a), Float.valueOf(f95042j.f180483b), Float.valueOf(f95042j.f180484c), Float.valueOf(bVar2.v(f95043k).f180482a), Float.valueOf(f95043k.f180483b), Float.valueOf(f95043k.f180484c));
    }

    public static boolean m(com.badlogic.gdx.math.collision.b bVar, Float f10, Float f11, Float f12, Float f13, Float f14, Float f15) {
        d0 d0Var = bVar.f94918b;
        float f16 = 1.0f / d0Var.f180482a;
        float f17 = 1.0f / d0Var.f180483b;
        float f18 = 1.0f / d0Var.f180484c;
        float fFloatValue = ((f10.floatValue() - (f13.floatValue() * 0.5f)) - bVar.f94917a.f180482a) * f16;
        float fFloatValue2 = ((f10.floatValue() + (f13.floatValue() * 0.5f)) - bVar.f94917a.f180482a) * f16;
        if (fFloatValue > fFloatValue2) {
            fFloatValue = fFloatValue2;
            fFloatValue2 = fFloatValue;
        }
        float fFloatValue3 = ((f11.floatValue() - (f14.floatValue() * 0.5f)) - bVar.f94917a.f180483b) * f17;
        float fFloatValue4 = ((f11.floatValue() + (f14.floatValue() * 0.5f)) - bVar.f94917a.f180483b) * f17;
        if (fFloatValue3 > fFloatValue4) {
            fFloatValue3 = fFloatValue4;
            fFloatValue4 = fFloatValue3;
        }
        float fFloatValue5 = ((f12.floatValue() - (f15.floatValue() * 0.5f)) - bVar.f94917a.f180484c) * f18;
        float fFloatValue6 = ((f12.floatValue() + (f15.floatValue() * 0.5f)) - bVar.f94917a.f180484c) * f18;
        if (fFloatValue5 > fFloatValue6) {
            fFloatValue5 = fFloatValue6;
            fFloatValue6 = fFloatValue5;
        }
        float fMax = Math.max(Math.max(fFloatValue, fFloatValue3), fFloatValue5);
        float fMin = Math.min(Math.min(fFloatValue2, fFloatValue4), fFloatValue6);
        return fMin >= 0.0f && fMin >= fMax;
    }

    public static boolean n(com.badlogic.gdx.math.collision.b bVar, v vVar, com.planner5d.library.math.m mVar) {
        float fB = bVar.f94918b.b(vVar.c());
        if (fB == 0.0f) {
            if (vVar.k(bVar.f94917a) != v.a.OnPlane) {
                return false;
            }
            if (mVar != null) {
                mVar.A0(bVar.f94917a);
            }
            return true;
        }
        float f10 = (-(bVar.f94917a.b(vVar.c()) + vVar.b())) / fB;
        if (f10 < 0.0f) {
            return false;
        }
        if (mVar != null) {
            mVar.A0(bVar.f94917a).R(f95033a.L(bVar.f94918b).c(f10));
        }
        return true;
    }

    public static float o(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        float f10 = c0Var3.f94907a - c0Var.f94907a;
        float f11 = c0Var3.f94908b - c0Var.f94908b;
        float f12 = c0Var2.f94907a;
        float f13 = c0Var4.f94908b;
        float f14 = c0Var2.f94908b;
        float f15 = c0Var4.f94907a;
        float f16 = (f12 * f13) - (f14 * f15);
        if (f16 == 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        return (f10 * (f13 / f16)) - (f11 * (f15 / f16));
    }

    public static boolean p(com.badlogic.gdx.math.collision.b bVar, d0 d0Var, float f10, d0 d0Var2) {
        d0 d0Var3 = bVar.f94918b;
        float f11 = d0Var.f180482a;
        d0 d0Var4 = bVar.f94917a;
        float fW = d0Var3.W(f11 - d0Var4.f180482a, d0Var.f180483b - d0Var4.f180483b, d0Var.f180484c - d0Var4.f180484c);
        if (fW < 0.0f) {
            return false;
        }
        d0 d0Var5 = bVar.f94917a;
        float f12 = d0Var5.f180482a;
        d0 d0Var6 = bVar.f94918b;
        float fA0 = d0Var.a0(f12 + (d0Var6.f180482a * fW), d0Var5.f180483b + (d0Var6.f180483b * fW), d0Var5.f180484c + (d0Var6.f180484c * fW));
        float f13 = f10 * f10;
        if (fA0 > f13) {
            return false;
        }
        if (d0Var2 != null) {
            d0Var2.L(bVar.f94918b).c(fW - ((float) Math.sqrt(f13 - fA0))).i(bVar.f94917a);
        }
        return true;
    }

    public static boolean q(com.badlogic.gdx.math.collision.b bVar, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4) {
        if (d0Var.V0(bVar.f94917a) || d0Var2.V0(bVar.f94917a) || d0Var3.V0(bVar.f94917a)) {
            if (d0Var4 != null) {
                d0Var4.L(bVar.f94917a);
            }
            return true;
        }
        v vVar = f95036d;
        vVar.i(d0Var, d0Var2, d0Var3);
        d0 d0Var5 = f95037e;
        if (!n(bVar, vVar, d0Var5)) {
            return false;
        }
        d0 d0Var6 = f95033a;
        d0Var6.L(d0Var3).K(d0Var);
        d0 d0Var7 = f95034b;
        d0Var7.L(d0Var2).K(d0Var);
        d0 d0Var8 = f95035c;
        d0Var8.L(d0Var5).K(d0Var);
        float fB = d0Var6.b(d0Var6);
        float fB2 = d0Var6.b(d0Var7);
        float fB3 = d0Var6.b(d0Var8);
        float fB4 = d0Var7.b(d0Var7);
        float fB5 = d0Var7.b(d0Var8);
        float f10 = (fB * fB4) - (fB2 * fB2);
        if (f10 == 0.0f) {
            return false;
        }
        float f11 = ((fB4 * fB3) - (fB2 * fB5)) / f10;
        float f12 = ((fB * fB5) - (fB2 * fB3)) / f10;
        if (f11 < 0.0f || f12 < 0.0f || f11 + f12 > 1.0f) {
            return false;
        }
        if (d0Var4 != null) {
            d0Var4.L(d0Var5);
        }
        return true;
    }

    public static boolean r(com.badlogic.gdx.math.collision.b bVar, List<d0> list, d0 d0Var) {
        if (list.size() % 3 != 0) {
            throw new RuntimeException("triangle list size is not a multiple of 3");
        }
        float f10 = Float.MAX_VALUE;
        boolean z10 = false;
        for (int i10 = 0; i10 < list.size() - 2; i10 += 3) {
            if (q(bVar, list.get(i10), list.get(i10 + 1), list.get(i10 + 2), f95041i)) {
                float fL = bVar.f94917a.l(f95041i);
                if (fL < f10) {
                    f95040h.L(f95041i);
                    f10 = fL;
                    z10 = true;
                }
            }
        }
        if (!z10) {
            return false;
        }
        if (d0Var != null) {
            d0Var.L(f95040h);
        }
        return true;
    }

    public static boolean s(com.badlogic.gdx.math.collision.b bVar, float[] fArr, com.planner5d.library.math.m mVar) {
        if ((fArr.length / 3) % 3 != 0) {
            throw new RuntimeException("triangle list size is not a multiple of 3");
        }
        float f10 = Float.MAX_VALUE;
        boolean z10 = false;
        for (int i10 = 0; i10 < fArr.length - 6; i10 += 9) {
            if (q(bVar, f95042j.y0(fArr[i10], fArr[i10 + 1], fArr[i10 + 2]), f95043k.y0(fArr[i10 + 3], fArr[i10 + 4], fArr[i10 + 5]), f95044l.y0(fArr[i10 + 6], fArr[i10 + 7], fArr[i10 + 8]), f95041i)) {
                float fL = bVar.f94917a.l(f95041i);
                if (fL < f10) {
                    f95040h.L(f95041i);
                    f10 = fL;
                    z10 = true;
                }
            }
        }
        if (!z10) {
            return false;
        }
        if (mVar != null) {
            mVar.A0(f95040h);
        }
        return true;
    }

    public static boolean t(com.badlogic.gdx.math.collision.b bVar, float[] fArr, short[] sArr, int i10, d0 d0Var) {
        if (sArr.length % 3 != 0) {
            throw new RuntimeException("triangle list size is not a multiple of 3");
        }
        float f10 = Float.MAX_VALUE;
        boolean z10 = false;
        for (int i11 = 0; i11 < sArr.length; i11 += 3) {
            int i12 = sArr[i11] * i10;
            int i13 = sArr[i11 + 1] * i10;
            int i14 = sArr[i11 + 2] * i10;
            if (q(bVar, f95042j.y0(fArr[i12], fArr[i12 + 1], fArr[i12 + 2]), f95043k.y0(fArr[i13], fArr[i13 + 1], fArr[i13 + 2]), f95044l.y0(fArr[i14], fArr[i14 + 1], fArr[i14 + 2]), f95041i)) {
                float fL = bVar.f94917a.l(f95041i);
                if (fL < f10) {
                    f95040h.L(f95041i);
                    f10 = fL;
                    z10 = true;
                }
            }
        }
        if (!z10) {
            return false;
        }
        if (d0Var != null) {
            d0Var.L(f95040h);
        }
        return true;
    }

    public static boolean u(a0 a0Var, a0 a0Var2, a0 a0Var3) {
        if (!a0Var.s(a0Var2)) {
            return false;
        }
        a0Var3.f94886a = Math.max(a0Var.f94886a, a0Var2.f94886a);
        a0Var3.f94888c = Math.min(a0Var.f94886a + a0Var.f94888c, a0Var2.f94886a + a0Var2.f94888c) - a0Var3.f94886a;
        a0Var3.f94887b = Math.max(a0Var.f94887b, a0Var2.f94887b);
        a0Var3.f94889d = Math.min(a0Var.f94887b + a0Var.f94889d, a0Var2.f94887b + a0Var2.f94889d) - a0Var3.f94887b;
        return true;
    }

    public static boolean v(c0 c0Var, c0 c0Var2, c0 c0Var3, float f10) {
        f95041i.y0(c0Var2.f94907a - c0Var.f94907a, c0Var2.f94908b - c0Var.f94908b, 0.0f);
        f95042j.y0(c0Var3.f94907a - c0Var.f94907a, c0Var3.f94908b - c0Var.f94908b, 0.0f);
        float fT = f95041i.t();
        float fB = f95042j.b(f95041i.f());
        if (fB <= 0.0f) {
            f95043k.y0(c0Var.f94907a, c0Var.f94908b, 0.0f);
        } else if (fB >= fT) {
            f95043k.y0(c0Var2.f94907a, c0Var2.f94908b, 0.0f);
        } else {
            f95044l.L(f95041i.c(fB));
            d0 d0Var = f95043k;
            d0 d0Var2 = f95044l;
            d0Var.y0(d0Var2.f180482a + c0Var.f94907a, d0Var2.f180483b + c0Var.f94908b, 0.0f);
        }
        float f11 = c0Var3.f94907a;
        d0 d0Var3 = f95043k;
        float f12 = f11 - d0Var3.f180482a;
        float f13 = c0Var3.f94908b - d0Var3.f180483b;
        return (f12 * f12) + (f13 * f13) <= f10;
    }

    public static float w(c0 c0Var, c0 c0Var2, c0 c0Var3, float f10, c0 c0Var4) {
        float f11 = c0Var3.f94907a;
        float f12 = c0Var.f94907a;
        float f13 = (f11 - f12) * (c0Var2.f94907a - f12);
        float f14 = c0Var3.f94908b;
        float f15 = c0Var.f94908b;
        float f16 = f13 + ((f14 - f15) * (c0Var2.f94908b - f15));
        float fH = c0Var.H(c0Var2);
        float f17 = f16 / (fH * fH);
        if (f17 >= 0.0f && f17 <= 1.0f) {
            f95041i.y0(c0Var2.f94907a, c0Var2.f94908b, 0.0f).G0(c0Var.f94907a, c0Var.f94908b, 0.0f);
            f95043k.y0(c0Var.f94907a, c0Var.f94908b, 0.0f).i(f95041i.c(f17));
            float fY = f95043k.Y(c0Var3.f94907a, c0Var3.f94908b, 0.0f);
            if (fY < f10) {
                c0 c0VarL = c0Var4.L(c0Var3);
                d0 d0Var = f95043k;
                c0VarL.R0(d0Var.f180482a, d0Var.f180483b).f();
                return fY;
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public static boolean x(d0 d0Var, d0 d0Var2, v vVar, d0 d0Var3) {
        d0 d0VarK = f95033a.L(d0Var2).K(d0Var);
        float fB = (-(d0Var.b(vVar.c()) + vVar.b())) / d0VarK.b(vVar.c());
        if (fB < 0.0f || fB > 1.0f) {
            return false;
        }
        d0Var3.L(d0Var).i(d0VarK.c(fB));
        return true;
    }

    public static boolean y(c0 c0Var, c0 c0Var2, w wVar) {
        float[] fArrJ = wVar.j();
        float f10 = c0Var.f94907a;
        float f11 = c0Var.f94908b;
        float f12 = c0Var2.f94907a;
        float f13 = c0Var2.f94908b;
        int length = fArrJ.length;
        float f14 = fArrJ[length - 2];
        float f15 = fArrJ[length - 1];
        int i10 = 0;
        while (i10 < length) {
            float f16 = fArrJ[i10];
            float f17 = fArrJ[i10 + 1];
            float f18 = f17 - f15;
            float f19 = f12 - f10;
            float f20 = f16 - f14;
            float f21 = f13 - f11;
            float f22 = (f18 * f19) - (f20 * f21);
            if (f22 != 0.0f) {
                float f23 = f11 - f15;
                float f24 = f10 - f14;
                float f25 = ((f20 * f23) - (f18 * f24)) / f22;
                if (f25 >= 0.0f && f25 <= 1.0f) {
                    float f26 = ((f19 * f23) - (f21 * f24)) / f22;
                    if (f26 >= 0.0f && f26 <= 1.0f) {
                        return true;
                    }
                }
            }
            i10 += 2;
            f14 = f16;
            f15 = f17;
        }
        return false;
    }

    public static boolean z(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, c0 c0Var) {
        float f18 = f17 - f15;
        float f19 = f12 - f10;
        float f20 = f16 - f14;
        float f21 = f13 - f11;
        float f22 = (f18 * f19) - (f20 * f21);
        if (f22 == 0.0f) {
            return false;
        }
        float f23 = f11 - f15;
        float f24 = f10 - f14;
        float f25 = ((f20 * f23) - (f18 * f24)) / f22;
        if (f25 >= 0.0f && f25 <= 1.0f) {
            float f26 = ((f23 * f19) - (f24 * f21)) / f22;
            if (f26 >= 0.0f && f26 <= 1.0f) {
                if (c0Var == null) {
                    return true;
                }
                c0Var.K0(f10 + (f19 * f25), f11 + (f21 * f25));
                return true;
            }
        }
        return false;
    }
}
