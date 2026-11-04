package org.locationtech.jts.algorithm;

import java.lang.reflect.Array;
import org.locationtech.jts.geom.g0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f338026i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f338027j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f338028k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f338029l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f338030m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f338031n = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f338032a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected org.locationtech.jts.geom.a[] f338034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int[][] f338035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f338036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected org.locationtech.jts.geom.a f338037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected org.locationtech.jts.geom.a f338038g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected org.locationtech.jts.geom.a[][] f338033b = (org.locationtech.jts.geom.a[][]) Array.newInstance((Class<?>) org.locationtech.jts.geom.a.class, 2, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected g0 f338039h = null;

    public o() {
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[2];
        this.f338034c = aVarArr;
        aVarArr[0] = new org.locationtech.jts.geom.a();
        this.f338034c[1] = new org.locationtech.jts.geom.a();
        org.locationtech.jts.geom.a[] aVarArr2 = this.f338034c;
        this.f338037f = aVarArr2[0];
        this.f338038g = aVarArr2[1];
        this.f338032a = 0;
    }

    public static double a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        double dAbs = Math.abs(aVar3.f338092a - aVar2.f338092a);
        double dAbs2 = Math.abs(aVar3.f338093b - aVar2.f338093b);
        if (aVar.equals(aVar2)) {
            dAbs = 0.0d;
        } else if (!aVar.equals(aVar3)) {
            double dAbs3 = Math.abs(aVar.f338092a - aVar2.f338092a);
            double dAbs4 = Math.abs(aVar.f338093b - aVar2.f338093b);
            dAbs = dAbs > dAbs2 ? dAbs3 : dAbs4;
            if (dAbs == 0.0d && !aVar.equals(aVar2)) {
                dAbs = Math.max(dAbs3, dAbs4);
            }
        } else if (dAbs <= dAbs2) {
            dAbs = dAbs2;
        }
        org.locationtech.jts.util.a.d(dAbs != 0.0d || aVar.equals(aVar2), "Bad distance calculation");
        return dAbs;
    }

    private String m() {
        StringBuilder sb2 = new StringBuilder();
        if (p()) {
            sb2.append(" endpoint");
        }
        if (this.f338036e) {
            sb2.append(" proper");
        }
        if (o()) {
            sb2.append(" collinear");
        }
        return sb2.toString();
    }

    public static double u(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        double d10 = aVar.f338092a - aVar2.f338092a;
        double d11 = aVar.f338093b - aVar2.f338093b;
        double dSqrt = Math.sqrt((d10 * d10) + (d11 * d11));
        org.locationtech.jts.util.a.d(dSqrt != 0.0d || aVar.equals(aVar2), "Invalid distance calculation");
        return dSqrt;
    }

    protected void b() {
        if (this.f338035d == null) {
            this.f338035d = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 2);
            c(0);
            c(1);
        }
    }

    protected void c(int i10) {
        if (g(i10, 0) > g(i10, 1)) {
            int[] iArr = this.f338035d[i10];
            iArr[0] = 0;
            iArr[1] = 1;
        } else {
            int[] iArr2 = this.f338035d[i10];
            iArr2[0] = 1;
            iArr2[1] = 0;
        }
    }

    protected abstract int d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4);

    public abstract void e(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3);

    public void f(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        org.locationtech.jts.geom.a[][] aVarArr = this.f338033b;
        aVarArr[0][0] = aVar;
        aVarArr[0][1] = aVar2;
        org.locationtech.jts.geom.a[] aVarArr2 = aVarArr[1];
        aVarArr2[0] = aVar3;
        aVarArr2[1] = aVar4;
        this.f338032a = d(aVar, aVar2, aVar3, aVar4);
    }

    public double g(int i10, int i11) {
        org.locationtech.jts.geom.a aVar = this.f338034c[i11];
        org.locationtech.jts.geom.a[] aVarArr = this.f338033b[i10];
        return a(aVar, aVarArr[0], aVarArr[1]);
    }

    public org.locationtech.jts.geom.a h(int i10, int i11) {
        return this.f338033b[i10][i11];
    }

    public int i(int i10, int i11) {
        b();
        return this.f338035d[i10][i11];
    }

    public org.locationtech.jts.geom.a j(int i10) {
        return this.f338034c[i10];
    }

    public org.locationtech.jts.geom.a k(int i10, int i11) {
        b();
        return this.f338034c[this.f338035d[i10][i11]];
    }

    public int l() {
        return this.f338032a;
    }

    public boolean n() {
        return this.f338032a != 0;
    }

    protected boolean o() {
        return this.f338032a == 2;
    }

    protected boolean p() {
        return n() && !this.f338036e;
    }

    public boolean q() {
        if (!r(0) && !r(1)) {
            return false;
        }
        return true;
    }

    public boolean r(int i10) {
        for (int i11 = 0; i11 < this.f338032a; i11++) {
            if (!this.f338034c[i11].p(this.f338033b[i10][0]) && !this.f338034c[i11].p(this.f338033b[i10][1])) {
                return true;
            }
        }
        return false;
    }

    public boolean s(org.locationtech.jts.geom.a aVar) {
        for (int i10 = 0; i10 < this.f338032a; i10++) {
            if (this.f338034c[i10].p(aVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean t() {
        return n() && this.f338036e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        org.locationtech.jts.geom.a[] aVarArr = this.f338033b[0];
        sb2.append(rm.o.A(aVarArr[0], aVarArr[1]));
        sb2.append(" - ");
        org.locationtech.jts.geom.a[] aVarArr2 = this.f338033b[1];
        sb2.append(rm.o.A(aVarArr2[0], aVarArr2[1]));
        sb2.append(m());
        return sb2.toString();
    }

    public void v(g0 g0Var) {
        this.f338039h = g0Var;
    }

    public void w(g0 g0Var) {
        this.f338039h = g0Var;
    }
}
