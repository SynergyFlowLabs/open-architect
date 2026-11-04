package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f112212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f112213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f112214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f112215d;

    private l(int i10) {
        i(i10);
    }

    public static l a(double d10, double d11, double d12) {
        return new l(m.r(d10, d11, d12));
    }

    public static l b(int i10) {
        return new l(i10);
    }

    private void i(int i10) {
        this.f112215d = i10;
        b bVarB = b.b(i10);
        this.f112212a = bVarB.l();
        this.f112213b = bVarB.k();
        this.f112214c = c.o(i10);
    }

    public double c() {
        return this.f112213b;
    }

    public double d() {
        return this.f112212a;
    }

    public double e() {
        return this.f112214c;
    }

    public l f(w6 w6Var) {
        double[] dArrT = b.b(k()).t(w6Var, null);
        b bVarH = b.h(dArrT[0], dArrT[1], dArrT[2], w6.f112287k);
        return a(bVarH.l(), bVarH.k(), c.p(dArrT[1]));
    }

    public void g(double d10) {
        i(m.r(this.f112212a, d10, this.f112214c));
    }

    public void h(double d10) {
        i(m.r(d10, this.f112213b, this.f112214c));
    }

    public void j(double d10) {
        i(m.r(this.f112212a, this.f112213b, d10));
    }

    public int k() {
        return this.f112215d;
    }
}
