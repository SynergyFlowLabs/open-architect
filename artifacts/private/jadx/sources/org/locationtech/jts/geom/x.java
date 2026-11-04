package org.locationtech.jts.geom;

/* JADX INFO: loaded from: classes14.dex */
public class x extends v {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f338256t = 4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f338257v = -4261142084085851829L;

    public x(a[] aVarArr, g0 g0Var, int i10) {
        this(aVarArr, new r(g0Var, i10));
        b1();
    }

    private void b1() {
        if (!v0() && !super.X0()) {
            throw new IllegalArgumentException("Points of LinearRing do not form a closed linestring");
        }
        if (S0().size() < 1 || S0().size() >= 4) {
            return;
        }
        throw new IllegalArgumentException("Invalid number of points in LinearRing (found " + S0().size() + " - must be 0 or >= 4)");
    }

    @Override // org.locationtech.jts.geom.v, org.locationtech.jts.geom.n
    public n H0() {
        e eVarCopy = this.f338255o.copy();
        i.h(eVarCopy);
        return g0().j(eVarCopy);
    }

    @Override // org.locationtech.jts.geom.v
    public boolean X0() {
        if (v0()) {
            return true;
        }
        return super.X0();
    }

    @Override // org.locationtech.jts.geom.v, org.locationtech.jts.geom.n
    public int Z() {
        return -1;
    }

    @Override // org.locationtech.jts.geom.v, org.locationtech.jts.geom.n
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public x w() {
        return new x(this.f338255o.copy(), this.f338179b);
    }

    @Override // org.locationtech.jts.geom.v, org.locationtech.jts.geom.n
    public String i0() {
        return org.locationtech.jts.io.gml2.a.f338494l;
    }

    @Override // org.locationtech.jts.geom.v, org.locationtech.jts.geom.n
    protected int p0() {
        return 3;
    }

    private x(a[] aVarArr, r rVar) {
        this(rVar.D().a(aVarArr), rVar);
    }

    public x(e eVar, r rVar) {
        super(eVar, rVar);
        b1();
    }
}
