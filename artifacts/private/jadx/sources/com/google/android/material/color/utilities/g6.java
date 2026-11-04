package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public class g6 extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final double[] f112180l = {0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final double[] f112181m = {45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final double[] f112182n = {120.0d, 120.0d, 20.0d, 45.0d, 20.0d, 15.0d, 20.0d, 120.0d, 120.0d};

    /* JADX WARN: Illegal instructions before constructor call */
    public g6(l lVar, boolean z10, double d10) {
        v6 v6Var = v6.EXPRESSIVE;
        s6 s6VarC = s6.c(v5.g(lVar.d() + 240.0d), 40.0d);
        double[] dArr = f112180l;
        super(lVar, v6Var, z10, d10, s6VarC, s6.c(k.a(lVar, dArr, f112181m), 24.0d), s6.c(k.a(lVar, dArr, f112182n), 32.0d), s6.c(v5.g(lVar.d() + 15.0d), 8.0d), s6.c(v5.g(lVar.d() + 15.0d), 12.0d));
    }
}
