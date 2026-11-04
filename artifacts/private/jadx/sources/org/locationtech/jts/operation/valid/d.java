package org.locationtech.jts.operation.valid;

import java.util.Iterator;
import java.util.TreeSet;
import org.locationtech.jts.algorithm.t;
import org.locationtech.jts.algorithm.y;
import org.locationtech.jts.geom.a0;
import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.o;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;
import org.locationtech.jts.geomgraph.g;
import org.locationtech.jts.geomgraph.h;
import org.locationtech.jts.geomgraph.l;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338925b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f338926c;

    public d(n nVar) {
        this.f338924a = nVar;
    }

    public static boolean A(n nVar) {
        return new d(nVar).y();
    }

    private void a(x xVar) {
        if (xVar.X0()) {
            return;
        }
        this.f338926c = new f(11, xVar.m0() >= 1 ? xVar.R0(0) : null);
    }

    private void b(e0 e0Var) {
        a((x) e0Var.R0());
        if (this.f338926c != null) {
            return;
        }
        for (int i10 = 0; i10 < e0Var.T0(); i10++) {
            a((x) e0Var.S0(i10));
            if (this.f338926c != null) {
                return;
            }
        }
    }

    private void c(l lVar) {
        a aVar = new a(lVar);
        if (!aVar.e()) {
            this.f338926c = new f(4, aVar.c());
        }
    }

    private void d(l lVar) {
        b bVar = new b(lVar);
        if (!bVar.c()) {
            this.f338926c = new f(5, bVar.a());
        } else {
            if (bVar.b()) {
                this.f338926c = new f(8, bVar.a());
            }
        }
    }

    private void e(e0 e0Var, l lVar) {
        org.locationtech.jts.geom.a aVarW;
        x xVar = (x) e0Var.R0();
        org.locationtech.jts.algorithm.locate.a aVar = new org.locationtech.jts.algorithm.locate.a(xVar);
        for (int i10 = 0; i10 < e0Var.T0() && (aVarW = w(((x) e0Var.S0(i10)).d0(), xVar, lVar)) != null; i10++) {
            if (2 == aVar.a(aVarW)) {
                this.f338926c = new f(2, aVarW);
                return;
            }
        }
    }

    private void f(e0 e0Var, l lVar) {
        c cVar = new c(lVar);
        for (int i10 = 0; i10 < e0Var.T0(); i10++) {
            cVar.a((x) e0Var.S0(i10));
        }
        if (cVar.d()) {
            return;
        }
        this.f338926c = new f(3, cVar.c());
    }

    private void g(e0 e0Var) {
        h(e0Var.R0().d0());
        if (this.f338926c != null) {
            return;
        }
        for (int i10 = 0; i10 < e0Var.T0(); i10++) {
            h(e0Var.S0(i10).d0());
            if (this.f338926c != null) {
                return;
            }
        }
    }

    private void h(org.locationtech.jts.geom.a[] aVarArr) {
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (!z(aVarArr[i10])) {
                this.f338926c = new f(10, aVarArr[i10]);
                return;
            }
        }
    }

    private void i(h hVar) {
        TreeSet treeSet = new TreeSet();
        Iterator itF = hVar.f();
        boolean z10 = true;
        while (itF.hasNext()) {
            g gVar = (g) itF.next();
            if (z10) {
                z10 = false;
            } else {
                if (treeSet.contains(gVar.f338297a)) {
                    this.f338926c = new f(6, gVar.f338297a);
                    return;
                }
                treeSet.add(gVar.f338297a);
            }
        }
    }

    private void j(l lVar) {
        Iterator itL = lVar.l();
        while (itL.hasNext()) {
            i(((org.locationtech.jts.geomgraph.d) itL.next()).u());
            if (this.f338926c != null) {
                break;
            }
        }
    }

    private org.locationtech.jts.geom.a k(x xVar, x xVar2, l lVar) {
        org.locationtech.jts.geom.a[] aVarArrD0 = xVar.d0();
        org.locationtech.jts.geom.a[] aVarArrD1 = xVar2.d0();
        org.locationtech.jts.geom.a aVarW = w(aVarArrD0, xVar2, lVar);
        if (aVarW != null && !t.a(aVarW, aVarArrD1)) {
            return aVarW;
        }
        org.locationtech.jts.geom.a aVarW2 = w(aVarArrD1, xVar, lVar);
        if (aVarW2 == null) {
            org.locationtech.jts.util.a.f("points in shell and hole appear to be equal");
            return null;
        }
        if (t.a(aVarW2, aVarArrD0)) {
            return aVarW2;
        }
        return null;
    }

    private void l(x xVar, e0 e0Var, l lVar) {
        org.locationtech.jts.geom.a[] aVarArrD0 = xVar.d0();
        x xVar2 = (x) e0Var.R0();
        org.locationtech.jts.geom.a[] aVarArrD1 = xVar2.d0();
        org.locationtech.jts.geom.a aVarW = w(aVarArrD0, xVar2, lVar);
        if (aVarW != null && t.a(aVarW, aVarArrD1)) {
            if (e0Var.T0() <= 0) {
                this.f338926c = new f(7, aVarW);
                return;
            }
            org.locationtech.jts.geom.a aVarK = null;
            for (int i10 = 0; i10 < e0Var.T0(); i10++) {
                aVarK = k(xVar, (x) e0Var.S0(i10), lVar);
                if (aVarK != null) {
                }
            }
            this.f338926c = new f(7, aVarK);
        }
    }

    private void m(b0 b0Var, l lVar) {
        for (int i10 = 0; i10 < b0Var.l0(); i10++) {
            x xVar = (x) ((e0) b0Var.h0(i10)).R0();
            for (int i11 = 0; i11 < b0Var.l0(); i11++) {
                if (i10 != i11) {
                    l(xVar, (e0) b0Var.h0(i11), lVar);
                    if (this.f338926c != null) {
                        return;
                    }
                }
            }
        }
    }

    private void n(l lVar) {
        if (lVar.R()) {
            this.f338926c = new f(9, lVar.Q());
        }
    }

    private void o(n nVar) {
        this.f338926c = null;
        if (nVar.v0()) {
            return;
        }
        if (nVar instanceof d0) {
            u((d0) nVar);
            return;
        }
        if (nVar instanceof a0) {
            s((a0) nVar);
            return;
        }
        if (nVar instanceof x) {
            r((x) nVar);
            return;
        }
        if (nVar instanceof v) {
            q((v) nVar);
            return;
        }
        if (nVar instanceof e0) {
            v((e0) nVar);
        } else if (nVar instanceof b0) {
            t((b0) nVar);
        } else {
            if (!(nVar instanceof o)) {
                throw new UnsupportedOperationException(nVar.getClass().getName());
            }
            p((o) nVar);
        }
    }

    private void p(o oVar) {
        for (int i10 = 0; i10 < oVar.l0(); i10++) {
            o(oVar.h0(i10));
            if (this.f338926c != null) {
                return;
            }
        }
    }

    private void q(v vVar) {
        h(vVar.d0());
        if (this.f338926c != null) {
            return;
        }
        n(new l(0, vVar));
    }

    private void r(x xVar) {
        h(xVar.d0());
        if (this.f338926c != null) {
            return;
        }
        a(xVar);
        if (this.f338926c != null) {
            return;
        }
        l lVar = new l(0, xVar);
        n(lVar);
        if (this.f338926c != null) {
            return;
        }
        lVar.H(new y(), true, true);
        j(lVar);
    }

    private void s(a0 a0Var) {
        h(a0Var.d0());
    }

    private void t(b0 b0Var) {
        for (int i10 = 0; i10 < b0Var.l0(); i10++) {
            e0 e0Var = (e0) b0Var.h0(i10);
            g(e0Var);
            if (this.f338926c != null) {
                return;
            }
            b(e0Var);
            if (this.f338926c != null) {
                return;
            }
        }
        l lVar = new l(0, b0Var);
        n(lVar);
        if (this.f338926c != null) {
            return;
        }
        d(lVar);
        if (this.f338926c != null) {
            return;
        }
        if (!this.f338925b) {
            j(lVar);
            if (this.f338926c != null) {
                return;
            }
        }
        for (int i11 = 0; i11 < b0Var.l0(); i11++) {
            e((e0) b0Var.h0(i11), lVar);
            if (this.f338926c != null) {
                return;
            }
        }
        for (int i12 = 0; i12 < b0Var.l0(); i12++) {
            f((e0) b0Var.h0(i12), lVar);
            if (this.f338926c != null) {
                return;
            }
        }
        m(b0Var, lVar);
        if (this.f338926c != null) {
            return;
        }
        c(lVar);
    }

    private void u(d0 d0Var) {
        h(d0Var.d0());
    }

    private void v(e0 e0Var) {
        g(e0Var);
        if (this.f338926c != null) {
            return;
        }
        b(e0Var);
        if (this.f338926c != null) {
            return;
        }
        l lVar = new l(0, e0Var);
        n(lVar);
        if (this.f338926c != null) {
            return;
        }
        d(lVar);
        if (this.f338926c != null) {
            return;
        }
        if (!this.f338925b) {
            j(lVar);
            if (this.f338926c != null) {
                return;
            }
        }
        e(e0Var, lVar);
        if (this.f338926c != null) {
            return;
        }
        f(e0Var, lVar);
        if (this.f338926c != null) {
            return;
        }
        c(lVar);
    }

    public static org.locationtech.jts.geom.a w(org.locationtech.jts.geom.a[] aVarArr, x xVar, l lVar) {
        h hVarU = lVar.L(xVar).u();
        for (org.locationtech.jts.geom.a aVar : aVarArr) {
            if (!hVarU.e(aVar)) {
                return aVar;
            }
        }
        return null;
    }

    public static boolean z(org.locationtech.jts.geom.a aVar) {
        return (Double.isNaN(aVar.f338092a) || Double.isInfinite(aVar.f338092a) || Double.isNaN(aVar.f338093b) || Double.isInfinite(aVar.f338093b)) ? false : true;
    }

    public void B(boolean z10) {
        this.f338925b = z10;
    }

    public f x() {
        o(this.f338924a);
        return this.f338926c;
    }

    public boolean y() {
        o(this.f338924a);
        return this.f338926c == null;
    }
}
