package org.locationtech.jts.geom;

/* JADX INFO: loaded from: classes14.dex */
public class v extends n implements w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f338254s = 3110669828065365560L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected e f338255o;

    public v(a[] aVarArr, g0 g0Var, int i10) {
        super(new r(g0Var, i10));
        W0(g0().D().a(aVarArr));
    }

    private void W0(e eVar) {
        if (eVar == null) {
            eVar = g0().D().a(new a[0]);
        }
        if (eVar.size() != 1) {
            this.f338255o = eVar;
            return;
        }
        throw new IllegalArgumentException("Invalid number of points in LineString (found " + eVar.size() + " - must be 0 or >= 2)");
    }

    @Override // org.locationtech.jts.geom.n
    public void D0() {
        for (int i10 = 0; i10 < this.f338255o.size() / 2; i10++) {
            int size = (this.f338255o.size() - 1) - i10;
            if (!this.f338255o.w4(i10).equals(this.f338255o.w4(size))) {
                if (this.f338255o.w4(i10).compareTo(this.f338255o.w4(size)) > 0) {
                    e eVarCopy = this.f338255o.copy();
                    i.h(eVarCopy);
                    this.f338255o = eVarCopy;
                    return;
                }
                return;
            }
        }
    }

    @Override // org.locationtech.jts.geom.n
    public n H0() {
        e eVarCopy = this.f338255o.copy();
        i.h(eVarCopy);
        return g0().g(eVarCopy);
    }

    @Override // org.locationtech.jts.geom.n
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public v w() {
        return new v(this.f338255o.copy(), this.f338179b);
    }

    public a R0(int i10) {
        return this.f338255o.w4(i10);
    }

    @Override // org.locationtech.jts.geom.n
    public int Rg() {
        return 1;
    }

    @Override // org.locationtech.jts.geom.n
    public boolean S(n nVar, double d10) {
        if (!w0(nVar)) {
            return false;
        }
        v vVar = (v) nVar;
        if (this.f338255o.size() != vVar.f338255o.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f338255o.size(); i10++) {
            if (!M(this.f338255o.w4(i10), vVar.f338255o.w4(i10), d10)) {
                return false;
            }
        }
        return true;
    }

    public e S0() {
        return this.f338255o;
    }

    public d0 T0() {
        if (v0()) {
            return null;
        }
        return U0(m0() - 1);
    }

    public d0 U0(int i10) {
        return g0().v(this.f338255o.w4(i10));
    }

    public d0 V0() {
        if (v0()) {
            return null;
        }
        return U0(0);
    }

    public boolean X0() {
        if (v0()) {
            return false;
        }
        return R0(0).p(R0(m0() - 1));
    }

    @Override // org.locationtech.jts.geom.n
    public n Y() {
        return new org.locationtech.jts.operation.a(this).e();
    }

    public boolean Y0(a aVar) {
        for (int i10 = 0; i10 < this.f338255o.size(); i10++) {
            if (this.f338255o.w4(i10).equals(aVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.locationtech.jts.geom.n
    public int Z() {
        return X0() ? -1 : 0;
    }

    public boolean Z0() {
        return X0() && z0();
    }

    @Override // org.locationtech.jts.geom.n
    public void b(c cVar) {
        for (int i10 = 0; i10 < this.f338255o.size(); i10++) {
            cVar.a(this.f338255o.w4(i10));
        }
    }

    @Override // org.locationtech.jts.geom.n
    public void c(h hVar) {
        if (this.f338255o.size() == 0) {
            return;
        }
        for (int i10 = 0; i10 < this.f338255o.size(); i10++) {
            hVar.a(this.f338255o, i10);
            if (hVar.isDone()) {
                break;
            }
        }
        if (hVar.b()) {
            V();
        }
    }

    @Override // org.locationtech.jts.geom.n
    public a c0() {
        if (v0()) {
            return null;
        }
        return this.f338255o.w4(0);
    }

    @Override // org.locationtech.jts.geom.n
    public Object clone() {
        return w();
    }

    @Override // org.locationtech.jts.geom.n
    public void d(q qVar) {
        qVar.a(this);
    }

    @Override // org.locationtech.jts.geom.n
    public a[] d0() {
        return this.f338255o.Uf();
    }

    @Override // org.locationtech.jts.geom.n
    public void e(s sVar) {
        sVar.a(this);
    }

    @Override // org.locationtech.jts.geom.n
    public String i0() {
        return org.locationtech.jts.io.gml2.a.f338493k;
    }

    @Override // org.locationtech.jts.geom.n
    public double k0() {
        return org.locationtech.jts.algorithm.n.a(this.f338255o);
    }

    @Override // org.locationtech.jts.geom.n
    public int m0() {
        return this.f338255o.size();
    }

    @Override // org.locationtech.jts.geom.n
    protected int p0() {
        return 2;
    }

    @Override // org.locationtech.jts.geom.n
    protected int q(Object obj) {
        v vVar = (v) obj;
        boolean z10 = false & false;
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f338255o.size() && i11 < vVar.f338255o.size()) {
            int iCompareTo = this.f338255o.w4(i10).compareTo(vVar.f338255o.w4(i11));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i10++;
            i11++;
        }
        if (i10 >= this.f338255o.size()) {
            return i11 < vVar.f338255o.size() ? -1 : 0;
        }
        int i12 = 7 ^ 1;
        return 1;
    }

    @Override // org.locationtech.jts.geom.n
    protected int r(Object obj, f fVar) {
        return fVar.compare(this.f338255o, ((v) obj).f338255o);
    }

    @Override // org.locationtech.jts.geom.n
    protected m s() {
        return v0() ? new m() : this.f338255o.Ij(new m());
    }

    @Override // org.locationtech.jts.geom.n
    public boolean v0() {
        return this.f338255o.size() == 0;
    }

    @Override // org.locationtech.jts.geom.n
    protected boolean w0(n nVar) {
        return nVar instanceof v;
    }

    public v(e eVar, r rVar) {
        super(rVar);
        W0(eVar);
    }
}
