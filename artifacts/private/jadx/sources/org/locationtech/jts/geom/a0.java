package org.locationtech.jts.geom;

/* JADX INFO: loaded from: classes14.dex */
public class a0 extends o implements h0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f338096t = -8048474874175355449L;

    public a0(d0[] d0VarArr, g0 g0Var, int i10) {
        super(d0VarArr, new r(g0Var, i10));
    }

    @Override // org.locationtech.jts.geom.n
    public boolean A0() {
        return true;
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a0 w() {
        int length = this.f338185o.length;
        d0[] d0VarArr = new d0[length];
        int i10 = 5 >> 0;
        for (int i11 = 0; i11 < length; i11++) {
            d0VarArr[i11] = (d0) this.f338185o[i11].w();
        }
        return new a0(d0VarArr, this.f338179b);
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public int Rg() {
        return 0;
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
        return g0().d();
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public int Z() {
        return -1;
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    public String i0() {
        return org.locationtech.jts.io.gml2.a.f338498p;
    }

    @Override // org.locationtech.jts.geom.o, org.locationtech.jts.geom.n
    protected int p0() {
        return 1;
    }

    protected a w4(int i10) {
        return ((d0) this.f338185o[i10]).c0();
    }

    public a0(d0[] d0VarArr, r rVar) {
        super(d0VarArr, rVar);
    }
}
