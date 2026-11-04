package org.locationtech.jts.operation.relate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.algorithm.o;
import org.locationtech.jts.algorithm.u;
import org.locationtech.jts.algorithm.y;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.t;
import org.locationtech.jts.geomgraph.l;
import org.locationtech.jts.geomgraph.q;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l[] f338905c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338909g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f338903a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u f338904b = new u();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q f338906d = new q(new f());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t f338907e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f338908f = new ArrayList();

    public d(l[] lVarArr) {
        this.f338905c = lVarArr;
    }

    private void a(t tVar) {
        n nVarP = this.f338905c[0].P();
        if (!nVarP.v0()) {
            tVar.r(0, 2, nVarP.Rg());
            tVar.r(1, 2, nVarP.Z());
        }
        n nVarP2 = this.f338905c[1].P();
        if (!nVarP2.v0()) {
            tVar.r(2, 0, nVarP2.Rg());
            tVar.r(2, 1, nVarP2.Z());
        }
    }

    private void c(int i10) {
        Iterator itL = this.f338905c[i10].l();
        while (itL.hasNext()) {
            org.locationtech.jts.geomgraph.d dVar = (org.locationtech.jts.geomgraph.d) itL.next();
            int iD = dVar.c().d(i10);
            Iterator itF = dVar.u().f();
            while (itF.hasNext()) {
                e eVar = (e) this.f338906d.b(((org.locationtech.jts.geomgraph.g) itF.next()).f338297a);
                if (iD == 1) {
                    eVar.v(i10);
                } else if (eVar.c().k(i10)) {
                    eVar.u(i10, 0);
                }
            }
        }
    }

    private void d(org.locationtech.jts.geomgraph.index.e eVar, t tVar) {
        int iRg = this.f338905c[0].P().Rg();
        boolean z10 = true & true;
        int iRg2 = this.f338905c[1].P().Rg();
        boolean zE = eVar.e();
        boolean zD = eVar.d();
        if (iRg == 2 && iRg2 == 2) {
            if (zE) {
                tVar.v("212101212");
                return;
            }
            return;
        }
        if (iRg == 2 && iRg2 == 1) {
            if (zE) {
                tVar.v("FFF0FFFF2");
            }
            if (zD) {
                tVar.v("1FFFFF1FF");
                return;
            }
            return;
        }
        if (iRg == 1 && iRg2 == 2) {
            if (zE) {
                tVar.v("F0FFFFFF2");
            }
            if (zD) {
                tVar.v("1F1FFFFFF");
                return;
            }
            return;
        }
        if (iRg == 1 && iRg2 == 1 && zD) {
            tVar.v("0FFFFFFFF");
        }
    }

    private void e(int i10) {
        Iterator itM = this.f338905c[i10].m();
        while (itM.hasNext()) {
            org.locationtech.jts.geomgraph.o oVar = (org.locationtech.jts.geomgraph.o) itM.next();
            this.f338906d.b(oVar.b()).u(i10, oVar.c().d(i10));
        }
    }

    private void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f338906d.a((org.locationtech.jts.geomgraph.e) it.next());
        }
    }

    private void g(int i10) {
        Iterator itL = this.f338905c[i10].l();
        while (itL.hasNext()) {
            org.locationtech.jts.geomgraph.d dVar = (org.locationtech.jts.geomgraph.d) itL.next();
            int iD = dVar.c().d(i10);
            Iterator itF = dVar.u().f();
            while (itF.hasNext()) {
                e eVar = (e) this.f338906d.d(((org.locationtech.jts.geomgraph.g) itF.next()).f338297a);
                if (eVar.c().k(i10)) {
                    if (iD == 1) {
                        eVar.v(i10);
                    } else {
                        eVar.u(i10, 0);
                    }
                }
            }
        }
    }

    private void h(org.locationtech.jts.geomgraph.d dVar, int i10, n nVar) {
        if (nVar.Rg() <= 0) {
            dVar.c().m(i10, 2);
        } else {
            dVar.c().m(i10, this.f338904b.c(dVar.b(), nVar));
        }
    }

    private void i(int i10, int i11) {
        Iterator itL = this.f338905c[i10].l();
        while (itL.hasNext()) {
            org.locationtech.jts.geomgraph.d dVar = (org.locationtech.jts.geomgraph.d) itL.next();
            if (dVar.g()) {
                h(dVar, i11, this.f338905c[i11].P());
                this.f338908f.add(dVar);
            }
        }
    }

    private void j(org.locationtech.jts.geomgraph.o oVar, int i10) {
        oVar.c().m(i10, this.f338904b.c(oVar.b(), this.f338905c[i10].P()));
    }

    private void k() {
        Iterator itF = this.f338906d.f();
        while (itF.hasNext()) {
            org.locationtech.jts.geomgraph.o oVar = (org.locationtech.jts.geomgraph.o) itF.next();
            org.locationtech.jts.geomgraph.n nVarC = oVar.c();
            org.locationtech.jts.util.a.d(nVarC.c() > 0, "node with empty label found");
            if (oVar.g()) {
                if (nVarC.k(0)) {
                    j(oVar, 0);
                } else {
                    j(oVar, 1);
                }
            }
        }
    }

    private void l() {
        Iterator itF = this.f338906d.f();
        while (itF.hasNext()) {
            ((e) itF.next()).p().c(this.f338905c);
        }
    }

    private void m(t tVar) {
        Iterator it = this.f338908f.iterator();
        while (it.hasNext()) {
            ((org.locationtech.jts.geomgraph.d) it.next()).m(tVar);
        }
        Iterator itF = this.f338906d.f();
        while (itF.hasNext()) {
            e eVar = (e) itF.next();
            eVar.m(tVar);
            eVar.w(tVar);
        }
    }

    public t b() {
        t tVar = new t();
        tVar.r(2, 2, 2);
        int i10 = 7 | 1;
        if (!this.f338905c[0].P().f0().c0(this.f338905c[1].P().f0())) {
            a(tVar);
            return tVar;
        }
        this.f338905c[0].G(this.f338903a, false);
        this.f338905c[1].G(this.f338903a, false);
        l[] lVarArr = this.f338905c;
        org.locationtech.jts.geomgraph.index.e eVarF = lVarArr[0].F(lVarArr[1], this.f338903a, false);
        c(0);
        c(1);
        e(0);
        e(1);
        k();
        d(eVarF, tVar);
        a aVar = new a();
        f(aVar.a(this.f338905c[0].l()));
        f(aVar.a(this.f338905c[1].l()));
        l();
        i(0, 1);
        i(1, 0);
        m(tVar);
        return tVar;
    }
}
