package org.locationtech.jts.triangulate.quadedge;

import org.locationtech.jts.algorithm.r;

/* JADX INFO: loaded from: classes14.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f339111b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f339112c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f339113d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f339114e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f339115f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f339116g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f339117h = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a f339118a;

    public m(double d10, double d11) {
        this.f339118a = new org.locationtech.jts.geom.a(d10, d11);
    }

    private org.locationtech.jts.algorithm.j a(m mVar, m mVar2) {
        double dL = mVar2.l() - mVar.l();
        double dM = mVar2.m() - mVar.m();
        double d10 = dL / 2.0d;
        double d11 = dM / 2.0d;
        return new org.locationtech.jts.algorithm.j(new org.locationtech.jts.algorithm.j(mVar.l() + d10, mVar.m() + d11, 1.0d), new org.locationtech.jts.algorithm.j((mVar.l() - dM) + d10, mVar.m() + dL + d11, 1.0d));
    }

    private double g(m mVar, m mVar2) {
        return Math.sqrt(Math.pow(mVar2.l() - mVar.l(), 2.0d) + Math.pow(mVar2.m() - mVar.m(), 2.0d));
    }

    public static double o(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        double dL = aVar2.l(aVar3);
        double dL2 = aVar.l(aVar2);
        double d10 = aVar3.f338094c;
        double d11 = aVar2.f338094c;
        return d11 + ((d10 - d11) * (dL2 / dL));
    }

    public static double p(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        double d10 = aVar2.f338092a;
        double d11 = aVar2.f338093b;
        double d12 = aVar3.f338092a - d10;
        double d13 = aVar4.f338092a - d10;
        double d14 = aVar3.f338093b - d11;
        double d15 = aVar4.f338093b - d11;
        double d16 = (d12 * d15) - (d13 * d14);
        double d17 = aVar.f338092a - d10;
        double d18 = aVar.f338093b - d11;
        double d19 = (((-d14) * d17) + (d12 * d18)) / d16;
        double d20 = aVar2.f338094c;
        return ((((d15 * d17) - (d13 * d18)) / d16) * (aVar3.f338094c - d20)) + d20 + (d19 * (aVar4.f338094c - d20));
    }

    m A(double d10) {
        org.locationtech.jts.geom.a aVar = this.f339118a;
        return new m(aVar.f338092a * d10, d10 * aVar.f338093b);
    }

    public m b(m mVar, m mVar2) {
        m mVar3 = new m(l(), m());
        org.locationtech.jts.algorithm.j jVar = new org.locationtech.jts.algorithm.j(a(mVar3, mVar), a(mVar, mVar2));
        try {
            return new m(jVar.b(), jVar.c());
        } catch (r e10) {
            System.err.println("a: " + mVar3 + "  b: " + mVar + "  c: " + mVar2);
            System.err.println(e10);
            return null;
        }
    }

    public double c(m mVar, m mVar2) {
        double dG = g(b(mVar, mVar2), mVar);
        double dG2 = g(this, mVar);
        double dG3 = g(mVar, mVar2);
        if (dG3 < dG2) {
            dG2 = dG3;
        }
        double dG4 = g(mVar2, this);
        if (dG4 < dG2) {
            dG2 = dG4;
        }
        return dG / dG2;
    }

    public int d(m mVar, m mVar2) {
        m mVarY = mVar2.y(mVar);
        m mVarY2 = y(mVar);
        double dF = mVarY.f(mVarY2);
        if (dF > 0.0d) {
            return 0;
        }
        if (dF < 0.0d) {
            return 1;
        }
        if (mVarY.l() * mVarY2.l() >= 0.0d && mVarY.m() * mVarY2.m() >= 0.0d) {
            if (mVarY.u() < mVarY2.u()) {
                return 2;
            }
            if (mVar.i(this)) {
                return 5;
            }
            return mVar2.i(this) ? 6 : 4;
        }
        return 3;
    }

    m e() {
        org.locationtech.jts.geom.a aVar = this.f339118a;
        return new m(aVar.f338093b, -aVar.f338092a);
    }

    double f(m mVar) {
        return (this.f339118a.f338092a * mVar.m()) - (this.f339118a.f338093b * mVar.l());
    }

    double h(m mVar) {
        return (this.f339118a.f338092a * mVar.l()) + (this.f339118a.f338093b * mVar.m());
    }

    public boolean i(m mVar) {
        return this.f339118a.f338092a == mVar.l() && this.f339118a.f338093b == mVar.m();
    }

    public boolean j(m mVar, double d10) {
        return this.f339118a.l(mVar.k()) < d10;
    }

    public org.locationtech.jts.geom.a k() {
        return this.f339118a;
    }

    public double l() {
        return this.f339118a.f338092a;
    }

    public double m() {
        return this.f339118a.f338093b;
    }

    public double n() {
        return this.f339118a.f338094c;
    }

    public double q(m mVar, m mVar2, m mVar3) {
        double dL = mVar.l();
        double dM = mVar.m();
        double dL2 = mVar2.l() - dL;
        double dL3 = mVar3.l() - dL;
        double dM2 = mVar2.m() - dM;
        double dM3 = mVar3.m() - dM;
        double d10 = (dL2 * dM3) - (dL3 * dM2);
        double dL4 = l() - dL;
        double dM4 = m() - dM;
        return mVar.n() + ((((dM3 * dL4) - (dL3 * dM4)) / d10) * (mVar2.n() - mVar.n())) + (((((-dM2) * dL4) + (dL2 * dM4)) / d10) * (mVar3.n() - mVar.n()));
    }

    public final boolean r(m mVar, m mVar2) {
        org.locationtech.jts.geom.a aVar = mVar.f339118a;
        double d10 = aVar.f338092a;
        org.locationtech.jts.geom.a aVar2 = this.f339118a;
        double d11 = aVar2.f338092a;
        org.locationtech.jts.geom.a aVar3 = mVar2.f339118a;
        double d12 = aVar3.f338093b;
        double d13 = aVar2.f338093b;
        return ((d10 - d11) * (d12 - d13)) - ((aVar.f338093b - d13) * (aVar3.f338092a - d11)) > 0.0d;
    }

    public boolean s(m mVar, m mVar2, m mVar3) {
        return k.h(mVar.f339118a, mVar2.f339118a, mVar3.f339118a, this.f339118a);
    }

    public final boolean t(d dVar) {
        return r(dVar.r(), dVar.e());
    }

    public String toString() {
        return "POINT (" + this.f339118a.f338092a + " " + this.f339118a.f338093b + ")";
    }

    double u() {
        org.locationtech.jts.geom.a aVar = this.f339118a;
        double d10 = aVar.f338092a;
        double d11 = aVar.f338093b;
        return Math.sqrt((d10 * d10) + (d11 * d11));
    }

    public m v(m mVar) {
        return new m((this.f339118a.f338092a + mVar.l()) / 2.0d, (this.f339118a.f338093b + mVar.m()) / 2.0d, (this.f339118a.f338094c + mVar.n()) / 2.0d);
    }

    public final boolean w(d dVar) {
        return r(dVar.e(), dVar.r());
    }

    public void x(double d10) {
        this.f339118a.f338094c = d10;
    }

    m y(m mVar) {
        return new m(this.f339118a.f338092a - mVar.l(), this.f339118a.f338093b - mVar.m());
    }

    m z(m mVar) {
        return new m(this.f339118a.f338092a + mVar.l(), this.f339118a.f338093b + mVar.m());
    }

    public m(double d10, double d11, double d12) {
        this.f339118a = new org.locationtech.jts.geom.a(d10, d11, d12);
    }

    public m(org.locationtech.jts.geom.a aVar) {
        this.f339118a = new org.locationtech.jts.geom.a(aVar);
    }
}
