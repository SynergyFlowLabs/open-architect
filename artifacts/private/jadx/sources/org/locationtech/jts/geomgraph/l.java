package org.locationtech.jts.geomgraph;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.locationtech.jts.geom.a0;
import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.f0;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;
import org.locationtech.jts.geom.z;

/* JADX INFO: loaded from: classes14.dex */
public class l extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.n f338349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f338350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.locationtech.jts.algorithm.c f338351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f338352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f338353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Collection f338354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f338355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.locationtech.jts.algorithm.locate.b f338357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final org.locationtech.jts.algorithm.u f338358m;

    public l(int i10, org.locationtech.jts.geom.n nVar) {
        this(i10, nVar, org.locationtech.jts.algorithm.c.f337987e);
    }

    private void A(d0 d0Var) {
        T(this.f338353h, d0Var.c0(), 0);
    }

    private void B(e0 e0Var) {
        C((x) e0Var.R0(), 2, 0);
        for (int i10 = 0; i10 < e0Var.T0(); i10++) {
            C((x) e0Var.S0(i10), 0, 2);
        }
    }

    private void C(x xVar, int i10, int i11) {
        if (xVar.v0()) {
            return;
        }
        org.locationtech.jts.geom.a[] aVarArrS = org.locationtech.jts.geom.b.s(xVar.d0());
        int i12 = 7 ^ 4;
        if (aVarArrS.length < 4) {
            this.f338355j = true;
            this.f338356k = aVarArrS[0];
            return;
        }
        if (org.locationtech.jts.algorithm.s.b(aVarArrS)) {
            i11 = i10;
            i10 = i11;
        }
        d dVar = new d(aVarArrS, new n(this.f338353h, 1, i10, i11));
        this.f338350e.put(xVar, dVar);
        o(dVar);
        T(this.f338353h, aVarArrS[0], 1);
    }

    private void D(int i10, org.locationtech.jts.geom.a aVar, int i11) {
        if (p(i10, aVar)) {
            return;
        }
        if (i11 == 1 && this.f338352g) {
            S(i10, aVar);
        } else {
            T(i10, aVar, i11);
        }
    }

    private void E(int i10) {
        for (d dVar : this.f338369a) {
            int iD = dVar.c().d(i10);
            Iterator itF = dVar.f338280h.f();
            while (itF.hasNext()) {
                D(i10, ((g) itF.next()).f338297a, iD);
            }
        }
    }

    private org.locationtech.jts.geomgraph.index.a J() {
        return new org.locationtech.jts.geomgraph.index.g();
    }

    public static int K(org.locationtech.jts.algorithm.c cVar, int i10) {
        return cVar.a(i10) ? 1 : 0;
    }

    private void S(int i10, org.locationtech.jts.geom.a aVar) {
        n nVarC = this.f338370b.b(aVar).c();
        nVarC.p(i10, K(this.f338351f, nVarC.e(i10, 0) == 1 ? 2 : 1));
    }

    private void T(int i10, org.locationtech.jts.geom.a aVar, int i11) {
        o oVarB = this.f338370b.b(aVar);
        n nVarC = oVarB.c();
        if (nVarC == null) {
            oVarB.f338359a = new n(i10, i11);
        } else {
            nVarC.p(i10, i11);
        }
    }

    private void v(org.locationtech.jts.geom.n nVar) {
        if (nVar.v0()) {
            return;
        }
        boolean z10 = nVar instanceof b0;
        if (z10) {
            this.f338352g = false;
        }
        if (nVar instanceof e0) {
            B((e0) nVar);
            return;
        }
        if (nVar instanceof v) {
            y((v) nVar);
            return;
        }
        if (nVar instanceof d0) {
            A((d0) nVar);
            return;
        }
        if (nVar instanceof a0) {
            w((a0) nVar);
            return;
        }
        if (nVar instanceof z) {
            w((z) nVar);
        } else if (z10) {
            w((b0) nVar);
        } else {
            if (!(nVar instanceof org.locationtech.jts.geom.o)) {
                throw new UnsupportedOperationException(nVar.getClass().getName());
            }
            w((org.locationtech.jts.geom.o) nVar);
        }
    }

    private void w(org.locationtech.jts.geom.o oVar) {
        for (int i10 = 0; i10 < oVar.l0(); i10++) {
            v(oVar.h0(i10));
        }
    }

    private void y(v vVar) {
        org.locationtech.jts.geom.a[] aVarArrS = org.locationtech.jts.geom.b.s(vVar.d0());
        if (aVarArrS.length < 2) {
            this.f338355j = true;
            this.f338356k = aVarArrS[0];
            return;
        }
        d dVar = new d(aVarArrS, new n(this.f338353h, 0));
        this.f338350e.put(vVar, dVar);
        o(dVar);
        org.locationtech.jts.util.a.d(aVarArrS.length >= 2, "found LineString with single point");
        S(this.f338353h, aVarArrS[0]);
        S(this.f338353h, aVarArrS[aVarArrS.length - 1]);
    }

    public org.locationtech.jts.geomgraph.index.e F(l lVar, org.locationtech.jts.algorithm.o oVar, boolean z10) {
        org.locationtech.jts.geomgraph.index.e eVar = new org.locationtech.jts.geomgraph.index.e(oVar, z10, true);
        eVar.k(N(), lVar.N());
        J().a(this.f338369a, lVar.f338369a, eVar);
        return eVar;
    }

    public org.locationtech.jts.geomgraph.index.e G(org.locationtech.jts.algorithm.o oVar, boolean z10) {
        return H(oVar, z10, false);
    }

    public org.locationtech.jts.geomgraph.index.e H(org.locationtech.jts.algorithm.o oVar, boolean z10, boolean z11) {
        boolean z12 = true;
        org.locationtech.jts.geomgraph.index.e eVar = new org.locationtech.jts.geomgraph.index.e(oVar, true, false);
        eVar.l(z11);
        org.locationtech.jts.geomgraph.index.a aVarJ = J();
        org.locationtech.jts.geom.n nVar = this.f338349d;
        boolean z13 = (nVar instanceof x) || (nVar instanceof e0) || (nVar instanceof b0);
        if (!z10 && z13) {
            z12 = false;
        }
        aVarJ.b(this.f338369a, eVar, z12);
        E(this.f338353h);
        return eVar;
    }

    public void I(List list) {
        Iterator it = this.f338369a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).f338280h.c(list);
        }
    }

    public d L(v vVar) {
        return (d) this.f338350e.get(vVar);
    }

    public org.locationtech.jts.algorithm.c M() {
        return this.f338351f;
    }

    public Collection N() {
        if (this.f338354i == null) {
            this.f338354i = this.f338370b.e(this.f338353h);
        }
        return this.f338354i;
    }

    public org.locationtech.jts.geom.a[] O() {
        Collection collectionN = N();
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[collectionN.size()];
        Iterator it = collectionN.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            aVarArr[i10] = ((o) it.next()).b().k();
            i10++;
        }
        return aVarArr;
    }

    public org.locationtech.jts.geom.n P() {
        return this.f338349d;
    }

    public org.locationtech.jts.geom.a Q() {
        return this.f338356k;
    }

    public boolean R() {
        return this.f338355j;
    }

    public int U(org.locationtech.jts.geom.a aVar) {
        org.locationtech.jts.geom.n nVar = this.f338349d;
        if (!(nVar instanceof f0) || nVar.l0() <= 50) {
            return this.f338358m.c(aVar, this.f338349d);
        }
        if (this.f338357l == null) {
            this.f338357l = new org.locationtech.jts.algorithm.locate.a(this.f338349d);
        }
        return this.f338357l.a(aVar);
    }

    public void x(d dVar) {
        o(dVar);
        org.locationtech.jts.geom.a[] aVarArrR = dVar.r();
        T(this.f338353h, aVarArrR[0], 1);
        T(this.f338353h, aVarArrR[aVarArrR.length - 1], 1);
    }

    public void z(org.locationtech.jts.geom.a aVar) {
        T(this.f338353h, aVar, 0);
    }

    public l(int i10, org.locationtech.jts.geom.n nVar, org.locationtech.jts.algorithm.c cVar) {
        this.f338350e = new HashMap();
        this.f338351f = null;
        this.f338352g = true;
        this.f338355j = false;
        this.f338356k = null;
        this.f338357l = null;
        this.f338358m = new org.locationtech.jts.algorithm.u();
        this.f338353h = i10;
        this.f338349d = nVar;
        this.f338351f = cVar;
        if (nVar != null) {
            v(nVar);
        }
    }
}
