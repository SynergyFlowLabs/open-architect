package org.locationtech.jts.geom;

/* JADX INFO: loaded from: classes14.dex */
public class z extends o implements w {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f338262t = 8166665132445433741L;

    public z(v[] vVarArr, g0 g0Var, int i10) {
        super(vVarArr, new r(g0Var, i10));
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public n H0() {
        int length = this.f338185o.length;
        v[] vVarArr = new v[length];
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return g0().m(vVarArr);
            }
            vVarArr[(length - 1) - i10] = (v) nVarArr[i10].H0();
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public z w() {
        int length = this.f338185o.length;
        v[] vVarArr = new v[length];
        for (int i10 = 0; i10 < length; i10++) {
            vVarArr[i10] = (v) this.f338185o[i10].w();
        }
        return new z(vVarArr, this.f338179b);
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public int Rg() {
        return 1;
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public boolean S(n nVar, double d10) {
        if (w0(nVar)) {
            return super.S(nVar, d10);
        }
        return false;
    }

    public boolean S0() {
        if (v0()) {
            return false;
        }
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return true;
            }
            if (!((v) nVarArr[i10]).X0()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public n Y() {
        return new org.locationtech.jts.operation.a(this).e();
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public int Z() {
        return S0() ? -1 : 0;
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public String i0() {
        return org.locationtech.jts.io.gml2.a.f338499q;
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    protected int p0() {
        return 4;
    }

    public z(v[] vVarArr, r rVar) {
        super(vVarArr, rVar);
    }
}
