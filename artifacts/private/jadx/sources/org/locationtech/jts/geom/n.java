package org.locationtech.jts.geom;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class n implements Cloneable, Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f338168e = 8763622679187376702L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f338169f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f338170g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f338171h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f338172i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f338173j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f338174k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f338175l = 6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f338176m = 7;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final q f338177n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected m f338178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final r f338179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f338180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f338181d = null;

    class a implements q {
        a() {
        }

        @Override // org.locationtech.jts.geom.q
        public void a(n nVar) {
            nVar.W();
        }
    }

    class b implements org.locationtech.jts.geom.util.i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f338182a;

        b(n nVar) {
            this.f338182a = nVar;
        }

        @Override // org.locationtech.jts.geom.util.i.a
        public n a(n nVar) {
            return nVar.t0(this.f338182a);
        }
    }

    public n(r rVar) {
        this.f338179b = rVar;
        this.f338180c = rVar.G();
    }

    private d0 D(org.locationtech.jts.geom.a aVar, n nVar) {
        nVar.n0().s(aVar);
        return nVar.g0().v(aVar);
    }

    protected static boolean r0(n[] nVarArr) {
        for (n nVar : nVarArr) {
            if (!nVar.v0()) {
                return true;
            }
        }
        return false;
    }

    protected static boolean s0(Object[] objArr) {
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public boolean A0() {
        return org.locationtech.jts.operation.valid.d.A(this);
    }

    public boolean B0(n nVar, double d10) {
        if (f0().s(nVar.f0()) > d10) {
            return false;
        }
        return org.locationtech.jts.operation.distance.c.q(this, nVar, d10);
    }

    public n C0() {
        n nVarW = w();
        nVarW.D0();
        return nVarW;
    }

    public abstract void D0();

    public boolean E(n nVar) {
        if (f0().c0(nVar.f0())) {
            return F0(nVar).f(Rg(), nVar.Rg());
        }
        return false;
    }

    public boolean E0(n nVar) {
        if (f0().c0(nVar.f0())) {
            return F0(nVar).j(Rg(), nVar.Rg());
        }
        return false;
    }

    public t F0(n nVar) {
        n(this);
        n(nVar);
        return org.locationtech.jts.operation.relate.h.d(this, nVar);
    }

    public boolean G0(n nVar, String str) {
        return F0(nVar).p(str);
    }

    public n H(n nVar) {
        if (v0()) {
            return org.locationtech.jts.operation.overlay.g.i(3, this, nVar, this.f338179b);
        }
        if (nVar.v0()) {
            return w();
        }
        n(this);
        n(nVar);
        return org.locationtech.jts.operation.overlay.snap.c.d(this, nVar, 3);
    }

    public abstract n H0();

    public boolean I(n nVar) {
        return !u0(nVar);
    }

    public void I0(int i10) {
        this.f338180c = i10;
    }

    public void J0(Object obj) {
        this.f338181d = obj;
    }

    public n K0(n nVar) {
        if (v0() || nVar.v0()) {
            if (v0() && nVar.v0()) {
                return org.locationtech.jts.operation.overlay.g.i(4, this, nVar, this.f338179b);
            }
            if (v0()) {
                return nVar.w();
            }
            if (nVar.v0()) {
                return w();
            }
        }
        n(this);
        n(nVar);
        return org.locationtech.jts.operation.overlay.snap.c.d(this, nVar, 4);
    }

    public double L(n nVar) {
        return org.locationtech.jts.operation.distance.c.p(this, nVar);
    }

    public String L0() {
        return new rm.o().E(this);
    }

    protected boolean M(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, double d10) {
        if (d10 == 0.0d) {
            return aVar.equals(aVar2);
        }
        return aVar.l(aVar2) <= d10;
    }

    public boolean M0(n nVar) {
        if (f0().c0(nVar.f0())) {
            return F0(nVar).k(Rg(), nVar.Rg());
        }
        return false;
    }

    public boolean N(n nVar) {
        if (nVar == null) {
            return false;
        }
        return U(nVar);
    }

    public n N0() {
        return wm.c.f(this);
    }

    public boolean O(n nVar) {
        if (this != nVar && !S(nVar, 0.0d)) {
            return false;
        }
        return true;
    }

    public n O0(n nVar) {
        if (v0() || nVar.v0()) {
            if (v0() && nVar.v0()) {
                return org.locationtech.jts.operation.overlay.g.i(2, this, nVar, this.f338179b);
            }
            if (v0()) {
                return nVar.w();
            }
            if (nVar.v0()) {
                return w();
            }
        }
        n(this);
        n(nVar);
        return org.locationtech.jts.operation.overlay.snap.c.d(this, nVar, 2);
    }

    public boolean P0(n nVar) {
        return nVar.t(this);
    }

    public abstract int Rg();

    public abstract boolean S(n nVar, double d10);

    public boolean T(n nVar) {
        if (nVar == null) {
            return false;
        }
        return C0().O(nVar.C0());
    }

    public boolean U(n nVar) {
        if (f0().equals(nVar.f0())) {
            return F0(nVar).h(Rg(), nVar.Rg());
        }
        return false;
    }

    public void V() {
        d(f338177n);
    }

    protected void W() {
        this.f338178a = null;
    }

    public double X() {
        return 0.0d;
    }

    public abstract n Y();

    public abstract int Z();

    public d0 a0() {
        return v0() ? this.f338179b.u() : D(org.locationtech.jts.algorithm.g.k(this), this);
    }

    public abstract void b(c cVar);

    public abstract void c(h hVar);

    public abstract org.locationtech.jts.geom.a c0();

    public Object clone() {
        try {
            n nVar = (n) super.clone();
            m mVar = nVar.f338178a;
            if (mVar != null) {
                nVar.f338178a = new m(mVar);
            }
            return nVar;
        } catch (CloneNotSupportedException unused) {
            org.locationtech.jts.util.a.e();
            return null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        n nVar = (n) obj;
        if (p0() != nVar.p0()) {
            return p0() - nVar.p0();
        }
        if (v0() && nVar.v0()) {
            return 0;
        }
        if (v0()) {
            int i10 = 5 ^ (-1);
            return -1;
        }
        if (nVar.v0()) {
            return 1;
        }
        return q(obj);
    }

    public abstract void d(q qVar);

    public abstract org.locationtech.jts.geom.a[] d0();

    public abstract void e(s sVar);

    public n e0() {
        return g0().H(f0());
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return O((n) obj);
        }
        return false;
    }

    public n f(double d10) {
        return org.locationtech.jts.operation.buffer.c.b(this, d10);
    }

    public m f0() {
        if (this.f338178a == null) {
            this.f338178a = s();
        }
        return new m(this.f338178a);
    }

    public r g0() {
        return this.f338179b;
    }

    public n h0(int i10) {
        return this;
    }

    public int hashCode() {
        return f0().hashCode();
    }

    public abstract String i0();

    public d0 j0() {
        org.locationtech.jts.geom.a aVarF;
        if (v0()) {
            return this.f338179b.u();
        }
        int iRg = Rg();
        if (iRg == 0) {
            aVarF = new org.locationtech.jts.algorithm.m(this).c();
        } else {
            aVarF = iRg == 1 ? new org.locationtech.jts.algorithm.l(this).f() : new org.locationtech.jts.algorithm.k(this).f();
        }
        return D(aVarF, this);
    }

    public n k(double d10, int i10) {
        return org.locationtech.jts.operation.buffer.c.c(this, d10, i10);
    }

    public double k0() {
        return 0.0d;
    }

    public n l(double d10, int i10, int i11) {
        return org.locationtech.jts.operation.buffer.c.d(this, d10, i10, i11);
    }

    public int l0() {
        return 1;
    }

    public abstract int m0();

    protected void n(n nVar) {
        if (x0()) {
            throw new IllegalArgumentException("This method does not support GeometryCollection arguments");
        }
    }

    public g0 n0() {
        return this.f338179b.F();
    }

    protected int o(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        Iterator it2 = collection2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = ((Comparable) it.next()).compareTo((Comparable) it2.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    public int o0() {
        return this.f338180c;
    }

    public int p(Object obj, f fVar) {
        n nVar = (n) obj;
        if (p0() != nVar.p0()) {
            return p0() - nVar.p0();
        }
        if (v0() && nVar.v0()) {
            return 0;
        }
        if (v0()) {
            return -1;
        }
        if (nVar.v0()) {
            return 1;
        }
        return r(obj, fVar);
    }

    protected abstract int p0();

    protected abstract int q(Object obj);

    public Object q0() {
        return this.f338181d;
    }

    protected abstract int r(Object obj, f fVar);

    protected abstract m s();

    public boolean t(n nVar) {
        if (nVar.Rg() == 2 && Rg() < 2) {
            return false;
        }
        if ((nVar.Rg() != 1 || Rg() >= 1 || nVar.k0() <= 0.0d) && f0().o(nVar.f0())) {
            return y0() ? org.locationtech.jts.operation.predicate.c.b((e0) this, nVar) : F0(nVar).c();
        }
        return false;
    }

    public n t0(n nVar) {
        if (v0() || nVar.v0()) {
            return org.locationtech.jts.operation.overlay.g.i(1, this, nVar, this.f338179b);
        }
        if (x0()) {
            return org.locationtech.jts.geom.util.e.b((o) this, new b(nVar));
        }
        n(this);
        n(nVar);
        return org.locationtech.jts.operation.overlay.snap.c.d(this, nVar, 1);
    }

    public String toString() {
        return L0();
    }

    public boolean u0(n nVar) {
        if (!f0().c0(nVar.f0())) {
            return false;
        }
        if (y0()) {
            return org.locationtech.jts.operation.predicate.d.b((e0) this, nVar);
        }
        if (nVar.y0()) {
            return org.locationtech.jts.operation.predicate.d.b((e0) nVar, this);
        }
        if (!x0() && !nVar.x0()) {
            return F0(nVar).i();
        }
        for (int i10 = 0; i10 < l0(); i10++) {
            for (int i11 = 0; i11 < nVar.l0(); i11++) {
                if (h0(i10).u0(nVar.h0(i11))) {
                    return true;
                }
            }
        }
        return false;
    }

    public n v() {
        return new org.locationtech.jts.algorithm.h(this).e();
    }

    public abstract boolean v0();

    public abstract n w();

    protected boolean w0(n nVar) {
        return getClass().getName().equals(nVar.getClass().getName());
    }

    public boolean x(n nVar) {
        return nVar.z(this);
    }

    protected boolean x0() {
        return p0() == 7;
    }

    public boolean y0() {
        return false;
    }

    public boolean z(n nVar) {
        if (nVar.Rg() == 2 && Rg() < 2) {
            return false;
        }
        if ((nVar.Rg() == 1 && Rg() < 1 && nVar.k0() > 0.0d) || !f0().r(nVar.f0())) {
            return false;
        }
        if (y0()) {
            return true;
        }
        return F0(nVar).e();
    }

    public boolean z0() {
        return new org.locationtech.jts.operation.d(this).f();
    }
}
