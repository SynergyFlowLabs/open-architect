package org.locationtech.jts.geom;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class b0 extends o implements f0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f338098t = -551033529766975875L;

    public b0(e0[] e0VarArr, g0 g0Var, int i10) {
        this(e0VarArr, new r(g0Var, i10));
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public n H0() {
        e0[] e0VarArr = new e0[this.f338185o.length];
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return g0().t(e0VarArr);
            }
            e0VarArr[i10] = (e0) nVarArr[i10].H0();
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public b0 w() {
        int length = this.f338185o.length;
        e0[] e0VarArr = new e0[length];
        for (int i10 = 0; i10 < length; i10++) {
            e0VarArr[i10] = (e0) this.f338185o[i10].w();
        }
        return new b0(e0VarArr, this.f338179b);
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public int Rg() {
        return 2;
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public boolean S(n nVar, double d10) {
        if (w0(nVar)) {
            return super.S(nVar, d10);
        }
        return false;
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public n Y() {
        if (v0()) {
            return g0().l();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return g0().m((v[]) arrayList.toArray(new v[arrayList.size()]));
            }
            n nVarY = ((e0) nVarArr[i10]).Y();
            for (int i11 = 0; i11 < nVarY.l0(); i11++) {
                arrayList.add(nVarY.h0(i11));
            }
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public int Z() {
        return 1;
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public String i0() {
        return org.locationtech.jts.io.gml2.a.f338500r;
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    protected int p0() {
        return 6;
    }

    public b0(e0[] e0VarArr, r rVar) {
        super(e0VarArr, rVar);
    }
}
