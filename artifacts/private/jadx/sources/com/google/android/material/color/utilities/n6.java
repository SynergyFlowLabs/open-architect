package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public class n6 extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final double[] f112228l = {0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final double[] f112229m = {18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final double[] f112230n = {35.0d, 30.0d, 20.0d, 25.0d, 30.0d, 35.0d, 30.0d, 25.0d, 25.0d};

    /* JADX WARN: Illegal instructions before constructor call */
    public n6(l lVar, boolean z10, double d10) {
        v6 v6Var = v6.VIBRANT;
        s6 s6VarC = s6.c(lVar.d(), 200.0d);
        double[] dArr = f112228l;
        super(lVar, v6Var, z10, d10, s6VarC, s6.c(k.a(lVar, dArr, f112229m), 24.0d), s6.c(k.a(lVar, dArr, f112230n), 32.0d), s6.c(lVar.d(), 10.0d), s6.c(lVar.d(), 12.0d));
    }
}
