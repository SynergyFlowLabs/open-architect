package org.locationtech.jts.linearref;

import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338529a;

    public c(n nVar) {
        this.f338529a = nVar;
    }

    private g k(double d10) {
        return d.e(this.f338529a, d10);
    }

    private g l(double d10, boolean z10) {
        return d.f(this.f338529a, d10, z10);
    }

    private double m(double d10) {
        return d10 >= 0.0d ? d10 : this.f338529a.k0() + d10;
    }

    public double a(double d10) {
        double dM = m(d10);
        double dF = f();
        if (dM < dF) {
            return dF;
        }
        double dE = e();
        return dM > dE ? dE : dM;
    }

    public n b(double d10, double d11) {
        new j(this.f338529a);
        double dA = a(d10);
        double dA2 = a(d11);
        return a.c(this.f338529a, l(dA, dA == dA2), k(dA2));
    }

    public org.locationtech.jts.geom.a c(double d10) {
        return d.e(this.f338529a, d10).n(this.f338529a);
    }

    public org.locationtech.jts.geom.a d(double d10, double d11) {
        g gVarI = d.e(this.f338529a, d10).I(this.f338529a);
        return gVarI.p(this.f338529a).T(gVarI.q(), d11);
    }

    public double e() {
        return this.f338529a.k0();
    }

    public double f() {
        return 0.0d;
    }

    public double g(org.locationtech.jts.geom.a aVar) {
        return b.b(this.f338529a, aVar);
    }

    public double h(org.locationtech.jts.geom.a aVar, double d10) {
        return b.d(this.f338529a, aVar, d10);
    }

    public double[] i(n nVar) {
        g[] gVarArrB = h.b(this.f338529a, nVar);
        return new double[]{d.a(this.f338529a, gVarArrB[0]), d.a(this.f338529a, gVarArrB[1])};
    }

    public boolean j(double d10) {
        if (d10 < f() || d10 > e()) {
            return false;
        }
        boolean z10 = false & true;
        return true;
    }

    public double n(org.locationtech.jts.geom.a aVar) {
        return b.b(this.f338529a, aVar);
    }
}
