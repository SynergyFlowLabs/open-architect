package org.locationtech.jts.index.quadtree;

import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
public class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f338431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f338432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f338433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f338434f;

    public d(m mVar, int i10) {
        this.f338431c = mVar;
        this.f338434f = i10;
        this.f338432d = (mVar.L() + mVar.H()) / 2.0d;
        this.f338433e = (mVar.M() + mVar.I()) / 2.0d;
    }

    public static d p(d dVar, m mVar) {
        m mVar2 = new m(mVar);
        if (dVar != null) {
            mVar2.z(dVar.f338431c);
        }
        d dVarQ = q(mVar2);
        if (dVar != null) {
            dVarQ.w(dVar);
        }
        return dVarQ;
    }

    public static d q(m mVar) {
        c cVar = new c(mVar);
        return new d(cVar.e(), cVar.f());
    }

    private d r(int i10) {
        double dL;
        double dH;
        double dM;
        double dI;
        double d10;
        double d11;
        double d12;
        double d13;
        if (i10 == 0) {
            dL = this.f338431c.L();
            dH = this.f338432d;
            dM = this.f338431c.M();
            dI = this.f338433e;
        } else if (i10 == 1) {
            dL = this.f338432d;
            dH = this.f338431c.H();
            dM = this.f338431c.M();
            dI = this.f338433e;
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    d10 = 0.0d;
                    d11 = 0.0d;
                    d12 = 0.0d;
                    d13 = 0.0d;
                } else {
                    dL = this.f338432d;
                    dH = this.f338431c.H();
                    dM = this.f338433e;
                    dI = this.f338431c.I();
                }
                return new d(new m(d10, d11, d12, d13), this.f338434f - 1);
            }
            dL = this.f338431c.L();
            dH = this.f338432d;
            dM = this.f338433e;
            dI = this.f338431c.I();
        }
        d10 = dL;
        d11 = dH;
        d12 = dM;
        d13 = dI;
        return new d(new m(d10, d11, d12, d13), this.f338434f - 1);
    }

    private d v(int i10) {
        d[] dVarArr = this.f338436b;
        if (dVarArr[i10] == null) {
            dVarArr[i10] = r(i10);
        }
        return this.f338436b[i10];
    }

    @Override // org.locationtech.jts.index.quadtree.e
    protected boolean k(m mVar) {
        if (mVar == null) {
            return false;
        }
        return this.f338431c.c0(mVar);
    }

    public e s(m mVar) {
        d dVar;
        int iG = e.g(mVar, this.f338432d, this.f338433e);
        int i10 = 4 ^ (-1);
        return (iG == -1 || (dVar = this.f338436b[iG]) == null) ? this : dVar.s(mVar);
    }

    public m t() {
        return this.f338431c;
    }

    public d u(m mVar) {
        int iG = e.g(mVar, this.f338432d, this.f338433e);
        return iG != -1 ? v(iG).u(mVar) : this;
    }

    void w(d dVar) {
        m mVar = this.f338431c;
        org.locationtech.jts.util.a.c(mVar == null || mVar.o(dVar.f338431c));
        int iG = e.g(dVar.f338431c, this.f338432d, this.f338433e);
        if (dVar.f338434f == this.f338434f - 1) {
            this.f338436b[iG] = dVar;
            return;
        }
        d dVarR = r(iG);
        dVarR.w(dVar);
        this.f338436b[iG] = dVarR;
    }
}
