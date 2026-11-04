package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f112201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v6 f112202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f112203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f112204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s6 f112205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s6 f112206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s6 f112207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s6 f112208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s6 f112209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s6 f112210k = s6.c(25.0d, 84.0d);

    public k(l lVar, v6 v6Var, boolean z10, double d10, s6 s6Var, s6 s6Var2, s6 s6Var3, s6 s6Var4, s6 s6Var5) {
        this.f112200a = lVar.k();
        this.f112201b = lVar;
        this.f112202c = v6Var;
        this.f112203d = z10;
        this.f112204e = d10;
        this.f112205f = s6Var;
        this.f112206g = s6Var2;
        this.f112207h = s6Var3;
        this.f112208i = s6Var4;
        this.f112209j = s6Var5;
    }

    public static double a(l lVar, double[] dArr, double[] dArr2) {
        double d10 = lVar.d();
        int i10 = 0;
        if (dArr2.length == 1) {
            return v5.g(d10 + dArr2[0]);
        }
        int length = dArr.length;
        while (i10 <= length - 2) {
            double d11 = dArr[i10];
            int i11 = i10 + 1;
            double d12 = dArr[i11];
            if (d11 < d10 && d10 < d12) {
                return v5.g(d10 + dArr2[i10]);
            }
            i10 = i11;
        }
        return d10;
    }
}
