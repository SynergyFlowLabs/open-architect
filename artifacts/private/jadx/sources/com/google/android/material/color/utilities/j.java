package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<k, s6> f112191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function<k, Double> f112192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f112193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function<k, j> f112194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function<k, j> f112195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f112196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function<k, t6> f112197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function<k, Double> f112198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final HashMap<k, l> f112199j;

    public j(@NonNull String str, @NonNull Function<k, s6> function, @NonNull Function<k, Double> function2, boolean z10, @androidx.annotation.p0 Function<k, j> function3, @androidx.annotation.p0 Function<k, j> function4, @androidx.annotation.p0 e eVar, @androidx.annotation.p0 Function<k, t6> function5) {
        this.f112199j = new HashMap<>();
        this.f112190a = str;
        this.f112191b = function;
        this.f112192c = function2;
        this.f112193d = z10;
        this.f112194e = function3;
        this.f112195f = function4;
        this.f112196g = eVar;
        this.f112197h = function5;
        this.f112198i = null;
    }

    public static /* synthetic */ s6 b(s6 s6Var, k kVar) {
        return s6Var;
    }

    public static double c(double d10) {
        if (!l(d10) || k(d10)) {
            return d10;
        }
        return 49.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r11 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r6 < r4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double d(double r11, double r13) {
        /*
            double r0 = com.google.android.material.color.utilities.d.d(r11, r13)
            double r2 = com.google.android.material.color.utilities.d.b(r11, r13)
            double r4 = com.google.android.material.color.utilities.d.e(r0, r11)
            double r6 = com.google.android.material.color.utilities.d.e(r2, r11)
            boolean r11 = l(r11)
            r10 = 7
            if (r11 == 0) goto L43
            double r11 = r4 - r6
            double r11 = java.lang.Math.abs(r11)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 >= 0) goto L35
            r10 = 7
            int r11 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r11 >= 0) goto L35
            r10 = 1
            int r11 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            r10 = 4
            if (r11 >= 0) goto L35
            r11 = 1
            r11 = 1
            r10 = 5
            goto L36
        L35:
            r11 = 0
        L36:
            int r12 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r12 >= 0) goto L4d
            r10 = 7
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 >= 0) goto L4d
            r10 = 7
            if (r11 == 0) goto L4f
            goto L4d
        L43:
            r10 = 3
            int r11 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 < 0) goto L4d
            goto L4f
        L4d:
            r10 = 1
            return r0
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.j.d(double, double):double");
    }

    @NonNull
    public static j e(@NonNull String str, int i10) {
        final l lVarB = l.b(i10);
        final s6 s6VarD = s6.d(i10);
        return f(str, new Function() { // from class: com.google.android.material.color.utilities.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j.b(s6VarD, (k) obj);
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(lVarB.e());
            }
        });
    }

    @NonNull
    public static j f(@NonNull String str, @NonNull Function<k, s6> function, @NonNull Function<k, Double> function2) {
        return new j(str, function, function2, false, null, null, null, null);
    }

    @NonNull
    public static j g(@NonNull String str, @NonNull Function<k, s6> function, @NonNull Function<k, Double> function2, boolean z10) {
        return new j(str, function, function2, z10, null, null, null, null);
    }

    public static boolean k(double d10) {
        return Math.round(d10) <= 49;
    }

    public static boolean l(double d10) {
        return Math.round(d10) < 60;
    }

    public int h(@NonNull k kVar) {
        int iK = i(kVar).k();
        Function<k, Double> function = this.f112198i;
        if (function == null) {
            return iK;
        }
        return (v5.b(0, 255, (int) Math.round(function.apply(kVar).doubleValue() * 255.0d)) << 24) | (16777215 & iK);
    }

    @NonNull
    public l i(@NonNull k kVar) {
        l lVar = this.f112199j.get(kVar);
        if (lVar != null) {
            return lVar;
        }
        l lVarF = this.f112191b.apply(kVar).f(j(kVar));
        if (this.f112199j.size() > 4) {
            this.f112199j.clear();
        }
        this.f112199j.put(kVar, lVarF);
        return lVarF;
    }

    public double j(@NonNull k kVar) {
        double d10;
        double dMax;
        double dMin;
        boolean z10 = false;
        boolean z11 = kVar.f112204e < 0.0d;
        Function<k, t6> function = this.f112197h;
        if (function == null) {
            double dDoubleValue = this.f112192c.apply(kVar).doubleValue();
            Function<k, j> function2 = this.f112194e;
            if (function2 == null) {
                return dDoubleValue;
            }
            double dJ = function2.apply(kVar).j(kVar);
            double dA = this.f112196g.a(kVar.f112204e);
            if (d.e(dJ, dDoubleValue) < dA) {
                dDoubleValue = d(dJ, dA);
            }
            if (z11) {
                dDoubleValue = d(dJ, dA);
            }
            if (!this.f112193d || 50.0d > dDoubleValue || dDoubleValue >= 60.0d) {
                d10 = dDoubleValue;
            } else {
                d10 = 49.0d;
                if (d.e(49.0d, dJ) < dA) {
                    d10 = 60.0d;
                }
            }
            if (this.f112195f != null) {
                double dJ2 = this.f112194e.apply(kVar).j(kVar);
                double dJ3 = this.f112195f.apply(kVar).j(kVar);
                double dMax2 = Math.max(dJ2, dJ3);
                double dMin2 = Math.min(dJ2, dJ3);
                if (d.e(dMax2, d10) < dA || d.e(dMin2, d10) < dA) {
                    double dC = d.c(dMax2, dA);
                    double dA2 = d.a(dMin2, dA);
                    ArrayList arrayList = new ArrayList();
                    if (dC != -1.0d) {
                        arrayList.add(Double.valueOf(dC));
                    }
                    if (dA2 != -1.0d) {
                        arrayList.add(Double.valueOf(dA2));
                    }
                    if (l(dJ2) || l(dJ3)) {
                        if (dC == -1.0d) {
                            return 100.0d;
                        }
                        return dC;
                    }
                    if (arrayList.size() == 1) {
                        return ((Double) arrayList.get(0)).doubleValue();
                    }
                    if (dA2 == -1.0d) {
                        return 0.0d;
                    }
                    return dA2;
                }
            }
            return d10;
        }
        t6 t6VarApply = function.apply(kVar);
        j jVarC = t6VarApply.c();
        j jVarD = t6VarApply.d();
        double dA3 = t6VarApply.a();
        u6 u6VarB = t6VarApply.b();
        boolean zE = t6VarApply.e();
        double dJ4 = this.f112194e.apply(kVar).j(kVar);
        if (u6VarB == u6.NEARER || ((u6VarB == u6.LIGHTER && !kVar.f112203d) || (u6VarB == u6.DARKER && kVar.f112203d))) {
            z10 = true;
        }
        j jVar = z10 ? jVarC : jVarD;
        j jVar2 = z10 ? jVarD : jVarC;
        boolean zEquals = this.f112190a.equals(jVar.f112190a);
        double d11 = kVar.f112203d ? 1.0d : -1.0d;
        double dA4 = jVar.f112196g.a(kVar.f112204e);
        double dA5 = jVar2.f112196g.a(kVar.f112204e);
        double dDoubleValue2 = jVar.f112192c.apply(kVar).doubleValue();
        if (d.e(dJ4, dDoubleValue2) < dA4) {
            dDoubleValue2 = d(dJ4, dA4);
        }
        double dDoubleValue3 = jVar2.f112192c.apply(kVar).doubleValue();
        if (d.e(dJ4, dDoubleValue3) < dA5) {
            dDoubleValue3 = d(dJ4, dA5);
        }
        if (z11) {
            dDoubleValue2 = d(dJ4, dA4);
            dDoubleValue3 = d(dJ4, dA5);
        }
        if ((dDoubleValue3 - dDoubleValue2) * d11 < dA3) {
            double d12 = dA3 * d11;
            dDoubleValue3 = v5.a(0.0d, 100.0d, dDoubleValue2 + d12);
            if ((dDoubleValue3 - dDoubleValue2) * d11 < dA3) {
                dDoubleValue2 = v5.a(0.0d, 100.0d, dDoubleValue3 - d12);
            }
        }
        if (50.0d > dDoubleValue2 || dDoubleValue2 >= 60.0d) {
            if (50.0d > dDoubleValue3 || dDoubleValue3 >= 60.0d) {
                dMax = dDoubleValue3;
            } else if (!zE) {
                dMax = d11 > 0.0d ? 60.0d : 49.0d;
            } else if (d11 > 0.0d) {
                dMax = Math.max(dDoubleValue3, (dA3 * d11) + 60.0d);
                dDoubleValue2 = 60.0d;
            } else {
                dMin = Math.min(dDoubleValue3, (dA3 * d11) + 49.0d);
                dMax = dMin;
                dDoubleValue2 = 49.0d;
            }
        } else if (d11 > 0.0d) {
            dMax = Math.max(dDoubleValue3, (dA3 * d11) + 60.0d);
            dDoubleValue2 = 60.0d;
        } else {
            dMin = Math.min(dDoubleValue3, (dA3 * d11) + 49.0d);
            dMax = dMin;
            dDoubleValue2 = 49.0d;
        }
        return zEquals ? dDoubleValue2 : dMax;
    }

    public j(@NonNull String str, @NonNull Function<k, s6> function, @NonNull Function<k, Double> function2, boolean z10, @androidx.annotation.p0 Function<k, j> function3, @androidx.annotation.p0 Function<k, j> function4, @androidx.annotation.p0 e eVar, @androidx.annotation.p0 Function<k, t6> function5, @androidx.annotation.p0 Function<k, Double> function6) {
        this.f112199j = new HashMap<>();
        this.f112190a = str;
        this.f112191b = function;
        this.f112192c = function2;
        this.f112193d = z10;
        this.f112194e = function3;
        this.f112195f = function4;
        this.f112196g = eVar;
        this.f112197h = function5;
        this.f112198i = function6;
    }
}
