package org.locationtech.jts.geom;

/* JADX INFO: loaded from: classes14.dex */
public class d0 extends n implements h0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f338110s = 4902022702746614570L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e f338111o;

    public d0(a aVar, g0 g0Var, int i10) {
        super(new r(g0Var, i10));
        U0(g0().D().a(aVar != null ? new a[]{aVar} : new a[0]));
    }

    private void U0(e eVar) {
        if (eVar == null) {
            eVar = g0().D().a(new a[0]);
        }
        org.locationtech.jts.util.a.c(eVar.size() <= 1);
        this.f338111o = eVar;
    }

    @Override // org.locationtech.jts.geom.n
    public void D0() {
    }

    @Override // org.locationtech.jts.geom.n
    public n H0() {
        return w();
    }

    @Override // org.locationtech.jts.geom.n
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public d0 w() {
        return new d0(this.f338111o.copy(), this.f338179b);
    }

    public e R0() {
        return this.f338111o;
    }

    @Override // org.locationtech.jts.geom.n
    public int Rg() {
        return 0;
    }

    @Override // org.locationtech.jts.geom.n
    public boolean S(n nVar, double d10) {
        if (!w0(nVar)) {
            return false;
        }
        if (v0() && nVar.v0()) {
            return true;
        }
        if (v0() != nVar.v0()) {
            return false;
        }
        return M(((d0) nVar).c0(), c0(), d10);
    }

    public double S0() {
        if (c0() != null) {
            return c0().f338092a;
        }
        throw new IllegalStateException("getX called on empty Point");
    }

    public double T0() {
        if (c0() != null) {
            return c0().f338093b;
        }
        throw new IllegalStateException("getY called on empty Point");
    }

    @Override // org.locationtech.jts.geom.n
    public n Y() {
        return g0().d();
    }

    @Override // org.locationtech.jts.geom.n
    public int Z() {
        return -1;
    }

    @Override // org.locationtech.jts.geom.n
    public void b(c cVar) {
        if (v0()) {
            return;
        }
        cVar.a(c0());
    }

    @Override // org.locationtech.jts.geom.n
    public void c(h hVar) {
        if (v0()) {
            return;
        }
        hVar.a(this.f338111o, 0);
        if (hVar.b()) {
            V();
        }
    }

    @Override // org.locationtech.jts.geom.n
    public a c0() {
        if (this.f338111o.size() != 0) {
            return this.f338111o.w4(0);
        }
        return null;
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
        return v0() ? new a[0] : new a[]{c0()};
    }

    @Override // org.locationtech.jts.geom.n
    public void e(s sVar) {
        sVar.a(this);
    }

    @Override // org.locationtech.jts.geom.n
    public String i0() {
        return org.locationtech.jts.io.gml2.a.f338492j;
    }

    @Override // org.locationtech.jts.geom.n
    public int m0() {
        return !v0() ? 1 : 0;
    }

    @Override // org.locationtech.jts.geom.n
    protected int p0() {
        return 0;
    }

    @Override // org.locationtech.jts.geom.n
    protected int q(Object obj) {
        return c0().compareTo(((d0) obj).c0());
    }

    @Override // org.locationtech.jts.geom.n
    protected int r(Object obj, f fVar) {
        return fVar.compare(this.f338111o, ((d0) obj).f338111o);
    }

    @Override // org.locationtech.jts.geom.n
    protected m s() {
        if (v0()) {
            return new m();
        }
        m mVar = new m();
        mVar.w(this.f338111o.N5(0), this.f338111o.I3(0));
        return mVar;
    }

    @Override // org.locationtech.jts.geom.n
    public boolean v0() {
        return this.f338111o.size() == 0;
    }

    @Override // org.locationtech.jts.geom.n
    public boolean z0() {
        return true;
    }

    public d0(e eVar, r rVar) {
        super(rVar);
        U0(eVar);
    }
}
