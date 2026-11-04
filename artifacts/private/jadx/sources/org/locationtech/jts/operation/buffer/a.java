package org.locationtech.jts.operation.buffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geomgraph.o;
import org.locationtech.jts.noding.n;
import org.locationtech.jts.noding.y;

/* JADX INFO: loaded from: classes14.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f338671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g0 f338672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f338673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r f338674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geomgraph.r f338675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.locationtech.jts.geomgraph.i f338676f = new org.locationtech.jts.geomgraph.i();

    public a(d dVar) {
        this.f338671a = dVar;
    }

    private void b(List list, org.locationtech.jts.operation.overlay.i iVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.l(new k(arrayList).d(eVar.w()));
            eVar.r();
            arrayList.add(eVar);
            iVar.a(eVar.s(), eVar.v());
        }
    }

    private void c(List list, g0 g0Var) {
        n nVarH = h(g0Var);
        nVarH.a(list);
        for (y yVar : nVarH.b()) {
            org.locationtech.jts.geom.a[] aVarArrN = yVar.n();
            if (aVarArrN.length != 2 || !aVarArrN[0].p(aVarArrN[1])) {
                i(new org.locationtech.jts.geomgraph.d(yVar.n(), new org.locationtech.jts.geomgraph.n((org.locationtech.jts.geomgraph.n) yVar.getData())));
            }
        }
    }

    private static org.locationtech.jts.geom.n d(Iterator it) {
        r rVar = new r();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(rVar.h(((y) it.next()).n()));
        }
        return rVar.b(arrayList);
    }

    private org.locationtech.jts.geom.n e() {
        return this.f338674d.y();
    }

    private List f(org.locationtech.jts.geomgraph.r rVar) {
        ArrayList arrayList = new ArrayList();
        for (o oVar : rVar.n()) {
            if (!oVar.h()) {
                e eVar = new e();
                eVar.q(oVar);
                arrayList.add(eVar);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        return arrayList;
    }

    private static int g(org.locationtech.jts.geomgraph.n nVar) {
        int iE = nVar.e(0, 1);
        int iE2 = nVar.e(0, 2);
        if (iE == 0 && iE2 == 2) {
            return 1;
        }
        return (iE == 2 && iE2 == 0) ? -1 : 0;
    }

    private n h(g0 g0Var) {
        n nVar = this.f338673c;
        if (nVar != null) {
            return nVar;
        }
        org.locationtech.jts.noding.i iVar = new org.locationtech.jts.noding.i();
        org.locationtech.jts.algorithm.y yVar = new org.locationtech.jts.algorithm.y();
        yVar.w(g0Var);
        iVar.c(new org.locationtech.jts.noding.f(yVar));
        return iVar;
    }

    public org.locationtech.jts.geom.n a(org.locationtech.jts.geom.n nVar, double d10) {
        g0 g0VarN0 = this.f338672b;
        if (g0VarN0 == null) {
            g0VarN0 = nVar.n0();
        }
        this.f338674d = nVar.g0();
        List listH = new g(nVar, d10, new f(g0VarN0, this.f338671a)).h();
        if (listH.size() <= 0) {
            return e();
        }
        c(listH, g0VarN0);
        org.locationtech.jts.geomgraph.r rVar = new org.locationtech.jts.geomgraph.r(new org.locationtech.jts.operation.overlay.f());
        this.f338675e = rVar;
        rVar.b(this.f338676f.f());
        List listF = f(this.f338675e);
        org.locationtech.jts.operation.overlay.i iVar = new org.locationtech.jts.operation.overlay.i(this.f338674d);
        b(listF, iVar);
        List listI = iVar.i();
        return listI.size() <= 0 ? e() : this.f338674d.b(listI);
    }

    protected void i(org.locationtech.jts.geomgraph.d dVar) {
        org.locationtech.jts.geomgraph.d dVarD = this.f338676f.d(dVar);
        if (dVarD == null) {
            this.f338676f.a(dVar);
            dVar.E(g(dVar.c()));
            return;
        }
        org.locationtech.jts.geomgraph.n nVarC = dVarD.c();
        org.locationtech.jts.geomgraph.n nVarC2 = dVar.c();
        if (!dVarD.B(dVar)) {
            nVarC2 = new org.locationtech.jts.geomgraph.n(dVar.c());
            nVarC2.b();
        }
        nVarC.l(nVarC2);
        dVarD.E(dVarD.t() + g(nVarC2));
    }

    public void j(n nVar) {
        this.f338673c = nVar;
    }

    public void k(g0 g0Var) {
        this.f338672b = g0Var;
    }
}
