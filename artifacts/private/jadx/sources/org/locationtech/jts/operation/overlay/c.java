package org.locationtech.jts.operation.overlay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.algorithm.u;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geomgraph.n;
import org.locationtech.jts.geomgraph.o;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f338809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f338810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u f338811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f338812d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f338813e = new ArrayList();

    public c(g gVar, r rVar, u uVar) {
        this.f338809a = gVar;
        this.f338810b = rVar;
        this.f338811c = uVar;
    }

    private void b(int i10) {
        for (org.locationtech.jts.geomgraph.d dVar : this.f338812d) {
            dVar.c();
            this.f338813e.add(this.f338810b.h(dVar.r()));
            dVar.j(true);
        }
    }

    private void c(org.locationtech.jts.geomgraph.b bVar, int i10, List list) {
        n nVarQ = bVar.q();
        if (bVar.T() || bVar.U() || bVar.S() || bVar.p().f()) {
            return;
        }
        org.locationtech.jts.util.a.c(((bVar.R() || bVar.N().R()) && bVar.p().f()) ? false : true);
        if (g.s(nVarQ, i10) && i10 == 1) {
            list.add(bVar.p());
            bVar.g0(true);
        }
    }

    private void d(org.locationtech.jts.geomgraph.b bVar, int i10, List list) {
        n nVarQ = bVar.q();
        org.locationtech.jts.geomgraph.d dVarP = bVar.p();
        if (bVar.T() && !bVar.U() && g.s(nVarQ, i10) && !dVarP.d()) {
            list.add(dVarP);
            bVar.g0(true);
        }
    }

    private void e(int i10) {
        for (org.locationtech.jts.geomgraph.b bVar : this.f338809a.k().k()) {
            d(bVar, i10, this.f338812d);
            c(bVar, i10, this.f338812d);
        }
    }

    private void f() {
        Iterator it = this.f338809a.k().n().iterator();
        while (it.hasNext()) {
            ((org.locationtech.jts.geomgraph.c) ((o) it.next()).p()).r();
        }
        for (org.locationtech.jts.geomgraph.b bVar : this.f338809a.k().k()) {
            org.locationtech.jts.geomgraph.d dVarP = bVar.p();
            if (bVar.T() && !dVarP.e()) {
                dVarP.i(this.f338809a.p(bVar.k()));
            }
        }
    }

    private void g(org.locationtech.jts.geomgraph.d dVar, int i10) {
        dVar.c().p(i10, this.f338811c.c(dVar.b(), this.f338809a.a(i10)));
    }

    private void h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geomgraph.d dVar = (org.locationtech.jts.geomgraph.d) it.next();
            n nVarC = dVar.c();
            if (dVar.g()) {
                int i10 = 0 << 0;
                if (nVarC.k(0)) {
                    g(dVar, 0);
                } else {
                    g(dVar, 1);
                }
            }
        }
    }

    public List a(int i10) {
        f();
        e(i10);
        b(i10);
        return this.f338813e;
    }
}
