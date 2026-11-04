package org.locationtech.jts.geom;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class r implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f338204d = -6820524753094095635L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g0 f338205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f338206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f338207c;

    class a extends org.locationtech.jts.geom.util.g.b {
        a() {
        }

        @Override // org.locationtech.jts.geom.util.g.b
        public e b(e eVar, n nVar) {
            return r.this.f338206b.b(eVar);
        }
    }

    public r(g0 g0Var, int i10, g gVar) {
        this.f338205a = g0Var;
        this.f338206b = gVar;
        this.f338207c = i10;
    }

    private static g E() {
        return org.locationtech.jts.geom.impl.b.d();
    }

    public static n[] I(Collection collection) {
        if (collection == null) {
            return null;
        }
        return (n[]) collection.toArray(new n[collection.size()]);
    }

    public static v[] J(Collection collection) {
        return (v[]) collection.toArray(new v[collection.size()]);
    }

    public static x[] K(Collection collection) {
        return (x[]) collection.toArray(new x[collection.size()]);
    }

    public static z[] L(Collection collection) {
        return (z[]) collection.toArray(new z[collection.size()]);
    }

    public static a0[] M(Collection collection) {
        return (a0[]) collection.toArray(new a0[collection.size()]);
    }

    public static b0[] N(Collection collection) {
        return (b0[]) collection.toArray(new b0[collection.size()]);
    }

    public static d0[] O(Collection collection) {
        return (d0[]) collection.toArray(new d0[collection.size()]);
    }

    public static e0[] P(Collection collection) {
        return (e0[]) collection.toArray(new e0[collection.size()]);
    }

    public static d0 x(org.locationtech.jts.geom.a aVar, n nVar) {
        nVar.n0().s(aVar);
        return nVar.g0().v(aVar);
    }

    public e0 A(x xVar) {
        return B(xVar, null);
    }

    public e0 B(x xVar, x[] xVarArr) {
        return new e0(xVar, xVarArr, this);
    }

    public e0 C(org.locationtech.jts.geom.a[] aVarArr) {
        return A(k(aVarArr));
    }

    public g D() {
        return this.f338206b;
    }

    public g0 F() {
        return this.f338205a;
    }

    public int G() {
        return this.f338207c;
    }

    public n H(m mVar) {
        if (mVar.d0()) {
            return u();
        }
        if (mVar.L() == mVar.H() && mVar.M() == mVar.I()) {
            return v(new org.locationtech.jts.geom.a(mVar.L(), mVar.M()));
        }
        return (mVar.L() == mVar.H() || mVar.M() == mVar.I()) ? h(new org.locationtech.jts.geom.a[]{new org.locationtech.jts.geom.a(mVar.L(), mVar.M()), new org.locationtech.jts.geom.a(mVar.H(), mVar.I())}) : B(k(new org.locationtech.jts.geom.a[]{new org.locationtech.jts.geom.a(mVar.L(), mVar.M()), new org.locationtech.jts.geom.a(mVar.L(), mVar.I()), new org.locationtech.jts.geom.a(mVar.H(), mVar.I()), new org.locationtech.jts.geom.a(mVar.H(), mVar.M()), new org.locationtech.jts.geom.a(mVar.L(), mVar.M())}), null);
    }

    public n b(Collection collection) {
        Iterator it = collection.iterator();
        Class<?> cls = null;
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            n nVar = (n) it.next();
            Class<?> cls2 = nVar.getClass();
            if (cls == null) {
                cls = cls2;
            }
            if (cls2 != cls) {
                z10 = true;
            }
            if (nVar instanceof o) {
                z11 = true;
            }
        }
        if (cls == null) {
            return d();
        }
        if (z10 || z11) {
            return e(I(collection));
        }
        n nVar2 = (n) collection.iterator().next();
        if (collection.size() > 1) {
            if (nVar2 instanceof e0) {
                return t(P(collection));
            }
            if (nVar2 instanceof v) {
                return m(J(collection));
            }
            if (nVar2 instanceof d0) {
                return q(O(collection));
            }
            org.locationtech.jts.util.a.f("Unhandled class: " + nVar2.getClass().getName());
        }
        return nVar2;
    }

    public n c(n nVar) {
        return new org.locationtech.jts.geom.util.g(this).a(nVar, new a());
    }

    public o d() {
        return new o(null, this);
    }

    public o e(n[] nVarArr) {
        return new o(nVarArr, this);
    }

    public v f() {
        return g(D().a(new org.locationtech.jts.geom.a[0]));
    }

    public v g(e eVar) {
        return new v(eVar, this);
    }

    public v h(org.locationtech.jts.geom.a[] aVarArr) {
        return g(aVarArr != null ? D().a(aVarArr) : null);
    }

    public x i() {
        return j(D().a(new org.locationtech.jts.geom.a[0]));
    }

    public x j(e eVar) {
        return new x(eVar, this);
    }

    public x k(org.locationtech.jts.geom.a[] aVarArr) {
        return j(aVarArr != null ? D().a(aVarArr) : null);
    }

    public z l() {
        return new z(null, this);
    }

    public z m(v[] vVarArr) {
        return new z(vVarArr, this);
    }

    public a0 n() {
        return new a0(null, this);
    }

    public a0 o(e eVar) {
        if (eVar == null) {
            return q(new d0[0]);
        }
        d0[] d0VarArr = new d0[eVar.size()];
        for (int i10 = 0; i10 < eVar.size(); i10++) {
            e eVarC = D().c(1, eVar.Rg());
            i.a(eVar, i10, eVarC, 0, 1);
            d0VarArr[i10] = w(eVarC);
        }
        return q(d0VarArr);
    }

    public a0 p(org.locationtech.jts.geom.a[] aVarArr) {
        return o(aVarArr != null ? D().a(aVarArr) : null);
    }

    public a0 q(d0[] d0VarArr) {
        return new a0(d0VarArr, this);
    }

    public a0 r(org.locationtech.jts.geom.a[] aVarArr) {
        return o(aVarArr != null ? D().a(aVarArr) : null);
    }

    public b0 s() {
        return new b0(null, this);
    }

    public b0 t(e0[] e0VarArr) {
        return new b0(e0VarArr, this);
    }

    public d0 u() {
        return w(D().a(new org.locationtech.jts.geom.a[0]));
    }

    public d0 v(org.locationtech.jts.geom.a aVar) {
        return w(aVar != null ? D().a(new org.locationtech.jts.geom.a[]{aVar}) : null);
    }

    public d0 w(e eVar) {
        return new d0(eVar, this);
    }

    public e0 y() {
        return B(null, null);
    }

    public e0 z(e eVar) {
        return A(j(eVar));
    }

    public r(g gVar) {
        this(new g0(), 0, gVar);
    }

    public r(g0 g0Var) {
        this(g0Var, 0, E());
    }

    public r(g0 g0Var, int i10) {
        this(g0Var, i10, E());
    }

    public r() {
        this(new g0(), 0);
    }
}
