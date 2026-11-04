package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class u5 {
    public static /* synthetic */ Double A0(u5 u5Var, k kVar) {
        u5Var.getClass();
        if (r2(kVar)) {
            return Double.valueOf(j.d(u5Var.Q2().f112192c.apply(kVar).doubleValue(), 4.5d));
        }
        if (s2(kVar)) {
            return Double.valueOf(kVar.f112203d ? 0.0d : 100.0d);
        }
        return Double.valueOf(kVar.f112203d ? 90.0d : 10.0d);
    }

    public static /* synthetic */ t6 C(u5 u5Var, k kVar) {
        return new t6(u5Var.W2(), u5Var.V2(), 15.0d, u6.NEARER, false);
    }

    public static /* synthetic */ t6 D(u5 u5Var, k kVar) {
        return new t6(u5Var.l2(), u5Var.k2(), 15.0d, u6.NEARER, false);
    }

    public static /* synthetic */ Double D1(k kVar) {
        if (s2(kVar)) {
            return Double.valueOf(kVar.f112203d ? 90.0d : 25.0d);
        }
        return Double.valueOf(kVar.f112203d ? 80.0d : 40.0d);
    }

    public static /* synthetic */ Double I0(k kVar) {
        if (s2(kVar)) {
            return Double.valueOf(kVar.f112203d ? 100.0d : 0.0d);
        }
        return Double.valueOf(kVar.f112203d ? 80.0d : 40.0d);
    }

    public static /* synthetic */ Double K0(k kVar) {
        if (s2(kVar)) {
            return Double.valueOf(kVar.f112203d ? 10.0d : 90.0d);
        }
        return Double.valueOf(kVar.f112203d ? 20.0d : 100.0d);
    }

    public static /* synthetic */ Double N(k kVar) {
        if (s2(kVar)) {
            return Double.valueOf(kVar.f112203d ? 10.0d : 100.0d);
        }
        return Double.valueOf(kVar.f112203d ? 20.0d : 100.0d);
    }

    static double O2(l lVar, k kVar) {
        l lVarF = lVar.f(v3(kVar));
        return (!j.l(lVar.e()) || j.k(lVarF.e())) ? j.c(lVarF.e()) : j.c(lVar.e());
    }

    public static /* synthetic */ Double Q0(k kVar) {
        if (r2(kVar)) {
            return Double.valueOf(O2(kVar.f112201b, kVar));
        }
        if (s2(kVar)) {
            return Double.valueOf(kVar.f112203d ? 85.0d : 25.0d);
        }
        return Double.valueOf(kVar.f112203d ? 30.0d : 90.0d);
    }

    public static /* synthetic */ t6 X1(u5 u5Var, k kVar) {
        return new t6(u5Var.n3(), u5Var.o3(), 10.0d, u6.LIGHTER, true);
    }

    public static /* synthetic */ t6 Z0(u5 u5Var, k kVar) {
        return new t6(u5Var.W2(), u5Var.V2(), 15.0d, u6.NEARER, false);
    }

    public static /* synthetic */ t6 a(u5 u5Var, k kVar) {
        return new t6(u5Var.R2(), u5Var.S2(), 10.0d, u6.LIGHTER, true);
    }

    public static /* synthetic */ Double a1(k kVar) {
        if (s2(kVar)) {
            return Double.valueOf(kVar.f112203d ? 10.0d : 90.0d);
        }
        return Double.valueOf(kVar.f112203d ? 20.0d : 100.0d);
    }

    public static /* synthetic */ t6 e1(u5 u5Var, k kVar) {
        return new t6(u5Var.X2(), u5Var.Y2(), 10.0d, u6.LIGHTER, true);
    }

    public static /* synthetic */ t6 f(u5 u5Var, k kVar) {
        return new t6(u5Var.R2(), u5Var.S2(), 10.0d, u6.LIGHTER, true);
    }

    public static /* synthetic */ Double g1(u5 u5Var, k kVar) {
        u5Var.getClass();
        if (s2(kVar)) {
            return Double.valueOf(kVar.f112203d ? 0.0d : 100.0d);
        }
        if (r2(kVar)) {
            return Double.valueOf(j.d(u5Var.m3().f112192c.apply(kVar).doubleValue(), 4.5d));
        }
        return Double.valueOf(kVar.f112203d ? 90.0d : 10.0d);
    }

    public static /* synthetic */ Double h1(k kVar) {
        if (s2(kVar)) {
            return Double.valueOf(kVar.f112203d ? 60.0d : 49.0d);
        }
        if (r2(kVar)) {
            return Double.valueOf(g.a(kVar.f112207h.f(O2(kVar.f112207h.f(kVar.f112201b.e()), kVar))).e());
        }
        return Double.valueOf(kVar.f112203d ? 30.0d : 90.0d);
    }

    public static /* synthetic */ Double k(k kVar) {
        double d10 = 30.0d;
        double d11 = kVar.f112203d ? 30.0d : 90.0d;
        if (s2(kVar)) {
            if (!kVar.f112203d) {
                d10 = 85.0d;
            }
            return Double.valueOf(d10);
        }
        if (r2(kVar)) {
            return Double.valueOf(O2(kVar.f112206g.f(m2(kVar.f112206g.g(), kVar.f112206g.e(), d11, !kVar.f112203d)), kVar));
        }
        return Double.valueOf(d11);
    }

    public static /* synthetic */ Double m(u5 u5Var, k kVar) {
        u5Var.getClass();
        if (r2(kVar)) {
            return Double.valueOf(j.d(u5Var.W2().f112192c.apply(kVar).doubleValue(), 4.5d));
        }
        return Double.valueOf(kVar.f112203d ? 90.0d : 10.0d);
    }

    public static /* synthetic */ t6 m1(u5 u5Var, k kVar) {
        return new t6(u5Var.Q2(), u5Var.P2(), 15.0d, u6.NEARER, false);
    }

    static double m2(double d10, double d11, double d12, boolean z10) {
        l lVarA = l.a(d10, d11, d12);
        if (lVarA.c() < d11) {
            double dC = lVarA.c();
            while (lVarA.c() < d11) {
                d12 += z10 ? -1.0d : 1.0d;
                l lVarA2 = l.a(d10, d11, d12);
                if (dC > lVarA2.c() || Math.abs(lVarA2.c() - d11) < 0.4d) {
                    return d12;
                }
                if (Math.abs(lVarA2.c() - d11) < Math.abs(lVarA.c() - d11)) {
                    lVarA = lVarA2;
                }
                dC = Math.max(dC, lVarA2.c());
            }
        }
        return d12;
    }

    public static /* synthetic */ t6 o0(u5 u5Var, k kVar) {
        return new t6(u5Var.l2(), u5Var.k2(), 15.0d, u6.NEARER, false);
    }

    private static boolean r2(k kVar) {
        v6 v6Var = kVar.f112202c;
        return v6Var == v6.FIDELITY || v6Var == v6.CONTENT;
    }

    public static /* synthetic */ t6 s0(u5 u5Var, k kVar) {
        return new t6(u5Var.X2(), u5Var.Y2(), 10.0d, u6.LIGHTER, true);
    }

    private static boolean s2(k kVar) {
        return kVar.f112202c == v6.MONOCHROME;
    }

    public static /* synthetic */ t6 u(u5 u5Var, k kVar) {
        return new t6(u5Var.Q2(), u5Var.P2(), 15.0d, u6.NEARER, false);
    }

    public static /* synthetic */ t6 v1(u5 u5Var, k kVar) {
        return new t6(u5Var.n3(), u5Var.o3(), 10.0d, u6.LIGHTER, true);
    }

    private static w6 v3(k kVar) {
        return w6.a(kVar.f112203d ? 30.0d : 80.0d);
    }

    public static /* synthetic */ t6 y0(u5 u5Var, k kVar) {
        return new t6(u5Var.m3(), u5Var.l3(), 15.0d, u6.NEARER, false);
    }

    public static /* synthetic */ t6 z1(u5 u5Var, k kVar) {
        int i10 = 7 >> 0;
        return new t6(u5Var.m3(), u5Var.l3(), 15.0d, u6.NEARER, false);
    }

    @NonNull
    public j A2() {
        return new j("on_primary_fixed", new Function() { // from class: com.google.android.material.color.utilities.p0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112205f;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(u5.s2((k) obj) ? 100.0d : 10.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.r0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112247a.S2();
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112254a.R2();
            }
        }, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j B2() {
        return new j("on_primary_fixed_variant", new Function() { // from class: com.google.android.material.color.utilities.f4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112205f;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(u5.s2((k) obj) ? 90.0d : 30.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.h4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112185a.S2();
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112189a.R2();
            }
        }, new e(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public j C2() {
        return new j("on_secondary", new Function() { // from class: com.google.android.material.color.utilities.o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112206g;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.N((k) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112246a.V2();
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j D2() {
        return new j("on_secondary_container", new Function() { // from class: com.google.android.material.color.utilities.m0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112206g;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.n0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.m(this.f112225a, (k) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.o0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112231a.W2();
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j E2() {
        return new j("on_secondary_fixed", new Function() { // from class: com.google.android.material.color.utilities.b0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112206g;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.c0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(10.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.d0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112116a.Y2();
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.e0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112145a.X2();
            }
        }, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j F2() {
        return new j("on_secondary_fixed_variant", new Function() { // from class: com.google.android.material.color.utilities.x1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112206g;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.y1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(u5.s2((k) obj) ? 25.0d : 30.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.z1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112301a.Y2();
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.a2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112086a.X2();
            }
        }, new e(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public j G2() {
        return new j("on_surface", new Function() { // from class: com.google.android.material.color.utilities.x4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 90.0d : 10.0d);
            }
        }, false, new t5(this), null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j H2() {
        return new j("on_surface_variant", new Function() { // from class: com.google.android.material.color.utilities.b1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112209j;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.c1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 80.0d : 30.0d);
            }
        }, false, new t5(this), null, new e(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public j I2() {
        return new j("on_tertiary", new Function() { // from class: com.google.android.material.color.utilities.q3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112207h;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.a1((k) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.m4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112223a.l3();
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j J2() {
        return new j("on_tertiary_container", new Function() { // from class: com.google.android.material.color.utilities.i0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112207h;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.g1(this.f112211a, (k) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.l0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112216a.m3();
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j K2() {
        return new j("on_tertiary_fixed", new Function() { // from class: com.google.android.material.color.utilities.w2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112207h;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.x2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(u5.s2((k) obj) ? 100.0d : 10.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.y2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112299a.o3();
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.z2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112302a.n3();
            }
        }, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j L2() {
        return new j("on_tertiary_fixed_variant", new Function() { // from class: com.google.android.material.color.utilities.k2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112207h;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.l2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(u5.s2((k) obj) ? 90.0d : 30.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.m2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112222a.o3();
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.n2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112227a.n3();
            }
        }, new e(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public j M2() {
        return new j("outline", new Function() { // from class: com.google.android.material.color.utilities.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112209j;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.x
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 60.0d : 50.0d);
            }
        }, false, new t5(this), null, new e(1.5d, 3.0d, 4.5d, 7.0d), null);
    }

    @NonNull
    public j N2() {
        return new j("outline_variant", new Function() { // from class: com.google.android.material.color.utilities.r3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112209j;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 30.0d : 80.0d);
            }
        }, false, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), null);
    }

    @NonNull
    public j P2() {
        return new j("primary", new Function() { // from class: com.google.android.material.color.utilities.s1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112205f;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.t1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.I0((k) obj);
            }
        }, true, new t5(this), null, new e(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: com.google.android.material.color.utilities.u1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.m1(this.f112268a, (k) obj);
            }
        });
    }

    @NonNull
    public j Q2() {
        return new j("primary_container", new Function() { // from class: com.google.android.material.color.utilities.g3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112205f;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.h3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.Q0((k) obj);
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.i3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.u(this.f112188a, (k) obj);
            }
        });
    }

    @NonNull
    public j R2() {
        return new j("primary_fixed", new Function() { // from class: com.google.android.material.color.utilities.k5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112205f;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.l5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(u5.s2((k) obj) ? 40.0d : 90.0d);
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.m5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.a(this.f112224a, (k) obj);
            }
        });
    }

    @NonNull
    public j S2() {
        return new j("primary_fixed_dim", new Function() { // from class: com.google.android.material.color.utilities.n5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112205f;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(u5.s2((k) obj) ? 30.0d : 80.0d);
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.p5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.f(this.f112244a, (k) obj);
            }
        });
    }

    @NonNull
    public j T2() {
        return j.f("primary_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.h2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112205f;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112205f.h().e());
            }
        });
    }

    @NonNull
    public j U2() {
        return new j("scrim", new Function() { // from class: com.google.android.material.color.utilities.v1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.w1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(0.0d);
            }
        }, false, null, null, null, null);
    }

    @NonNull
    public j V2() {
        return new j("secondary", new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112206g;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 80.0d : 40.0d);
            }
        }, true, new t5(this), null, new e(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: com.google.android.material.color.utilities.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.C(this.f112260a, (k) obj);
            }
        });
    }

    @NonNull
    public j W2() {
        return new j("secondary_container", new Function() { // from class: com.google.android.material.color.utilities.s2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112206g;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.t2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.k((k) obj);
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.v2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.Z0(this.f112275a, (k) obj);
            }
        });
    }

    @NonNull
    public j X2() {
        return new j("secondary_fixed", new Function() { // from class: com.google.android.material.color.utilities.c4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112206g;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.d4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(u5.s2((k) obj) ? 80.0d : 90.0d);
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.e4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.e1(this.f112147a, (k) obj);
            }
        });
    }

    @NonNull
    public j Y2() {
        return new j("secondary_fixed_dim", new Function() { // from class: com.google.android.material.color.utilities.v4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112206g;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.w4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(u5.s2((k) obj) ? 70.0d : 80.0d);
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.y4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.s0(this.f112300a, (k) obj);
            }
        });
    }

    @NonNull
    public j Z2() {
        return j.f("secondary_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.o2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112206g;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112206g.h().e());
            }
        });
    }

    @NonNull
    public j a3() {
        return new j("shadow", new Function() { // from class: com.google.android.material.color.utilities.f5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(0.0d);
            }
        }, false, null, null, null, null);
    }

    @NonNull
    public j b3() {
        return new j("surface", new Function() { // from class: com.google.android.material.color.utilities.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.j2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 6.0d : 98.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j c3() {
        return new j("surface_bright", new Function() { // from class: com.google.android.material.color.utilities.t3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.u3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 24.0d : 98.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j d3() {
        return new j("surface_container", new Function() { // from class: com.google.android.material.color.utilities.z0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.a1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 12.0d : 94.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j e3() {
        int i10 = 1 >> 0;
        return new j("surface_container_high", new Function() { // from class: com.google.android.material.color.utilities.l3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.m3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 17.0d : 92.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j f3() {
        return new j("surface_container_highest", new Function() { // from class: com.google.android.material.color.utilities.h5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.j5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 22.0d : 90.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j g2() {
        return new j("background", new Function() { // from class: com.google.android.material.color.utilities.j3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 6.0d : 98.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j g3() {
        return new j("surface_container_low", new Function() { // from class: com.google.android.material.color.utilities.q2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 10.0d : 96.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j h2() {
        return j.f("control_activated", new Function() { // from class: com.google.android.material.color.utilities.f2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112205f;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 30.0d : 90.0d);
            }
        });
    }

    @NonNull
    public j h3() {
        return new j("surface_container_lowest", new Function() { // from class: com.google.android.material.color.utilities.u
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 4.0d : 100.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j i2() {
        return new j("control_highlight", new Function() { // from class: com.google.android.material.color.utilities.c3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.d3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 100.0d : 0.0d);
            }
        }, false, null, null, null, null, new Function() { // from class: com.google.android.material.color.utilities.e3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 0.2d : 0.12d);
            }
        });
    }

    @NonNull
    public j i3() {
        return new j("surface_dim", new Function() { // from class: com.google.android.material.color.utilities.u0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.f1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 6.0d : 87.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j j2() {
        return j.f("control_normal", new Function() { // from class: com.google.android.material.color.utilities.q1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112209j;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 80.0d : 30.0d);
            }
        });
    }

    @NonNull
    public j j3() {
        return new j("surface_tint", new Function() { // from class: com.google.android.material.color.utilities.z
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112205f;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.a0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 80.0d : 40.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j k2() {
        return new j("error", new Function() { // from class: com.google.android.material.color.utilities.t0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112210k;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.v0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 80.0d : 40.0d);
            }
        }, true, new t5(this), null, new e(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: com.google.android.material.color.utilities.w0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.D(this.f112286a, (k) obj);
            }
        });
    }

    @NonNull
    public j k3() {
        return new j("surface_variant", new Function() { // from class: com.google.android.material.color.utilities.z4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112209j;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.a5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 30.0d : 90.0d);
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j l2() {
        return new j("error_container", new Function() { // from class: com.google.android.material.color.utilities.l1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112210k;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.m1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 30.0d : 90.0d);
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.n1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.o0(this.f112226a, (k) obj);
            }
        });
    }

    @NonNull
    public j l3() {
        return new j("tertiary", new Function() { // from class: com.google.android.material.color.utilities.c2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112207h;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.d2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.D1((k) obj);
            }
        }, true, new t5(this), null, new e(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: com.google.android.material.color.utilities.e2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.z1(this.f112146a, (k) obj);
            }
        });
    }

    @NonNull
    public j m3() {
        return new j("tertiary_container", new Function() { // from class: com.google.android.material.color.utilities.q5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112207h;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.h1((k) obj);
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.s5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.y0(this.f112255a, (k) obj);
            }
        });
    }

    @NonNull
    public j n2(@NonNull k kVar) {
        return kVar.f112203d ? c3() : i3();
    }

    @NonNull
    public j n3() {
        return new j("tertiary_fixed", new Function() { // from class: com.google.android.material.color.utilities.o1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112207h;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.p1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(u5.s2((k) obj) ? 40.0d : 90.0d);
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.r1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.X1(this.f112248a, (k) obj);
            }
        });
    }

    @NonNull
    public j o2() {
        return new j("inverse_on_surface", new Function() { // from class: com.google.android.material.color.utilities.f0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.g0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 20.0d : 95.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.h0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112184a.q2();
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j o3() {
        return new j("tertiary_fixed_dim", new Function() { // from class: com.google.android.material.color.utilities.j4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112207h;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(u5.s2((k) obj) ? 30.0d : 80.0d);
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: com.google.android.material.color.utilities.l4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.v1(this.f112217a, (k) obj);
            }
        });
    }

    @NonNull
    public j p2() {
        return new j("inverse_primary", new Function() { // from class: com.google.android.material.color.utilities.y3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112205f;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.z3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 40.0d : 80.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.a4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112087a.q2();
            }
        }, null, new e(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public j p3() {
        return j.f("tertiary_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.a3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112207h;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112207h.h().e());
            }
        });
    }

    @NonNull
    public j q2() {
        return new j("inverse_surface", new Function() { // from class: com.google.android.material.color.utilities.d1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.e1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 90.0d : 20.0d);
            }
        }, false, null, null, null, null);
    }

    @NonNull
    public j q3() {
        return j.f("text_hint_inverse", new Function() { // from class: com.google.android.material.color.utilities.d5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.e5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 10.0d : 90.0d);
            }
        });
    }

    @NonNull
    public j r3() {
        return j.f("text_primary_inverse", new Function() { // from class: com.google.android.material.color.utilities.x0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.y0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 10.0d : 90.0d);
            }
        });
    }

    @NonNull
    public j s3() {
        return j.f("text_primary_inverse_disable_only", new Function() { // from class: com.google.android.material.color.utilities.q4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 10.0d : 90.0d);
            }
        });
    }

    @NonNull
    public j t2() {
        return j.f("neutral_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.y
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.j0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112208i.h().e());
            }
        });
    }

    @NonNull
    public j t3() {
        return j.f("text_secondary_and_tertiary_inverse", new Function() { // from class: com.google.android.material.color.utilities.j1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112209j;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.k1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 30.0d : 80.0d);
            }
        });
    }

    @NonNull
    public j u2() {
        return j.f("neutral_variant_palette_key_color", new Function() { // from class: com.google.android.material.color.utilities.b5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112209j;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.c5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112209j.h().e());
            }
        });
    }

    @NonNull
    public j u3() {
        return j.f("text_secondary_and_tertiary_inverse_disabled", new Function() { // from class: com.google.android.material.color.utilities.u2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.f3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 10.0d : 90.0d);
            }
        });
    }

    @NonNull
    public j v2() {
        return new j("on_background", new Function() { // from class: com.google.android.material.color.utilities.n3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112208i;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 90.0d : 10.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.p3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112242a.g2();
            }
        }, null, new e(3.0d, 3.0d, 4.5d, 7.0d), null);
    }

    @NonNull
    public j w2() {
        return new j("on_error", new Function() { // from class: com.google.android.material.color.utilities.n4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112210k;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.o4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 20.0d : 100.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.p4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112243a.k2();
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j x2() {
        return new j("on_error_container", new Function() { // from class: com.google.android.material.color.utilities.g1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112210k;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.h1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((k) obj).f112203d ? 90.0d : 10.0d);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.i1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112187a.l2();
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j y2() {
        return new j("on_primary", new Function() { // from class: com.google.android.material.color.utilities.v3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112205f;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.w3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.K0((k) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.x3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112298a.P2();
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j z2() {
        return new j("on_primary_container", new Function() { // from class: com.google.android.material.color.utilities.s4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).f112205f;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.t4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.A0(this.f112261a, (k) obj);
            }
        }, false, new Function() { // from class: com.google.android.material.color.utilities.u4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112269a.Q2();
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }
}
