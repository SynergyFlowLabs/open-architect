package org.locationtech.jts.operation.overlay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.algorithm.u;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geomgraph.j;
import org.locationtech.jts.geomgraph.l;
import org.locationtech.jts.geomgraph.o;

/* JADX INFO: loaded from: classes14.dex */
public class g extends org.locationtech.jts.operation.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f338814l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f338815m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f338816n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f338817o = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f338818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r f338819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n f338820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.locationtech.jts.geomgraph.r f338821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.locationtech.jts.geomgraph.i f338822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f338823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f338824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f338825k;

    public g(n nVar, n nVar2) {
        super(nVar, nVar2);
        this.f338818d = new u();
        this.f338822h = new org.locationtech.jts.geomgraph.i();
        this.f338823i = new ArrayList();
        this.f338824j = new ArrayList();
        this.f338825k = new ArrayList();
        this.f338821g = new org.locationtech.jts.geomgraph.r(new f());
        this.f338819e = nVar.g0();
    }

    private void c() {
        for (org.locationtech.jts.geomgraph.b bVar : this.f338821g.k()) {
            org.locationtech.jts.geomgraph.b bVarN = bVar.N();
            if (bVar.R() && bVarN.R()) {
                bVar.Z(false);
                bVarN.Z(false);
            }
        }
    }

    private n d(List list, List list2, List list3, int i10) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        return arrayList.isEmpty() ? i(i10, this.f338757c[0].P(), this.f338757c[1].P(), this.f338819e) : this.f338819e.b(arrayList);
    }

    private void e() {
        Iterator it = this.f338821g.n().iterator();
        while (it.hasNext()) {
            ((o) it.next()).p().c(this.f338757c);
        }
        v();
        z();
    }

    private void f() {
        Iterator itG = this.f338822h.g();
        while (itG.hasNext()) {
            org.locationtech.jts.geomgraph.d dVar = (org.locationtech.jts.geomgraph.d) itG.next();
            org.locationtech.jts.geomgraph.n nVarC = dVar.c();
            org.locationtech.jts.geomgraph.a aVarS = dVar.s();
            if (!aVarS.g()) {
                aVarS.j();
                for (int i10 = 0; i10 < 2; i10++) {
                    if (!nVarC.k(i10) && nVarC.g() && !aVarS.h(i10)) {
                        if (aVarS.d(i10) == 0) {
                            nVarC.r(i10);
                        } else {
                            org.locationtech.jts.util.a.d(!aVarS.i(i10, 1), "depth of LEFT side has not been initialized");
                            nVarC.q(i10, 1, aVarS.f(i10, 1));
                            org.locationtech.jts.util.a.d(true ^ aVarS.i(i10, 2), "depth of RIGHT side has not been initialized");
                            nVarC.q(i10, 2, aVarS.f(i10, 2));
                        }
                    }
                }
            }
        }
    }

    private void g(int i10) {
        h(0);
        h(1);
        this.f338757c[0].G(this.f338755a, false);
        this.f338757c[1].G(this.f338755a, false);
        l[] lVarArr = this.f338757c;
        lVarArr[0].F(lVarArr[1], this.f338755a, true);
        ArrayList arrayList = new ArrayList();
        this.f338757c[0].I(arrayList);
        this.f338757c[1].I(arrayList);
        n(arrayList);
        f();
        x();
        j.b(this.f338822h.f());
        this.f338821g.b(this.f338822h.f());
        e();
        u();
        j(i10);
        c();
        i iVar = new i(this.f338819e);
        iVar.b(this.f338821g);
        this.f338823i = iVar.i();
        this.f338824j = new c(this, this.f338819e, this.f338818d).a(i10);
        List listA = new h(this, this.f338819e, this.f338818d).a(i10);
        this.f338825k = listA;
        this.f338820f = d(listA, this.f338824j, this.f338823i, i10);
    }

    private void h(int i10) {
        Iterator itM = this.f338757c[i10].m();
        while (itM.hasNext()) {
            o oVar = (o) itM.next();
            this.f338821g.c(oVar.b()).u(i10, oVar.c().d(i10));
        }
    }

    public static n i(int i10, n nVar, n nVar2, r rVar) {
        int iY = y(i10, nVar, nVar2);
        if (iY == -1) {
            return rVar.d();
        }
        if (iY == 0) {
            return rVar.u();
        }
        if (iY == 1) {
            return rVar.f();
        }
        if (iY != 2) {
            return null;
        }
        return rVar.y();
    }

    private void j(int i10) {
        for (org.locationtech.jts.geomgraph.b bVar : this.f338821g.k()) {
            org.locationtech.jts.geomgraph.n nVarQ = bVar.q();
            if (nVarQ.g() && !bVar.S() && r(nVarQ.e(0, 2), nVarQ.e(1, 2), i10)) {
                bVar.Z(true);
            }
        }
    }

    private void n(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m((org.locationtech.jts.geomgraph.d) it.next());
        }
    }

    private boolean o(org.locationtech.jts.geom.a aVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (this.f338818d.c(aVar, (n) it.next()) != 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(int i10, int i11, int i12) {
        if (i10 == 1) {
            i10 = 0;
        }
        if (i11 == 1) {
            i11 = 0;
        }
        if (i12 == 1) {
            return i10 == 0 && i11 == 0;
        }
        if (i12 == 2) {
            return i10 == 0 || i11 == 0;
        }
        if (i12 == 3) {
            return i10 == 0 && i11 != 0;
        }
        if (i12 != 4) {
            return false;
        }
        return (i10 == 0 && i11 != 0) || (i10 != 0 && i11 == 0);
    }

    public static boolean s(org.locationtech.jts.geomgraph.n nVar, int i10) {
        return r(nVar.d(0), nVar.d(1), i10);
    }

    private void t(o oVar, int i10) {
        oVar.c().p(i10, this.f338818d.c(oVar.b(), this.f338757c[i10].P()));
    }

    private void u() {
        for (o oVar : this.f338821g.n()) {
            org.locationtech.jts.geomgraph.n nVarC = oVar.c();
            if (oVar.g()) {
                if (nVarC.k(0)) {
                    t(oVar, 0);
                } else {
                    t(oVar, 1);
                }
            }
            ((org.locationtech.jts.geomgraph.c) oVar.p()).B(nVarC);
        }
    }

    private void v() {
        Iterator it = this.f338821g.n().iterator();
        while (it.hasNext()) {
            ((org.locationtech.jts.geomgraph.c) ((o) it.next()).p()).A();
        }
    }

    public static n w(n nVar, n nVar2, int i10) {
        return new g(nVar, nVar2).l(i10);
    }

    private void x() {
        ArrayList arrayList = new ArrayList();
        Iterator itG = this.f338822h.g();
        while (itG.hasNext()) {
            org.locationtech.jts.geomgraph.d dVar = (org.locationtech.jts.geomgraph.d) itG.next();
            if (dVar.A()) {
                itG.remove();
                arrayList.add(dVar.p());
            }
        }
        this.f338822h.b(arrayList);
    }

    private static int y(int i10, n nVar, n nVar2) {
        int iRg = nVar.Rg();
        int iRg2 = nVar2.Rg();
        if (i10 == 1) {
            return Math.min(iRg, iRg2);
        }
        if (i10 == 2) {
            return Math.max(iRg, iRg2);
        }
        if (i10 == 3) {
            return iRg;
        }
        if (i10 != 4) {
            return -1;
        }
        return Math.max(iRg, iRg2);
    }

    private void z() {
        for (o oVar : this.f338821g.n()) {
            oVar.c().l(((org.locationtech.jts.geomgraph.c) oVar.p()).s());
        }
    }

    public org.locationtech.jts.geomgraph.r k() {
        return this.f338821g;
    }

    public n l(int i10) {
        g(i10);
        return this.f338820f;
    }

    protected void m(org.locationtech.jts.geomgraph.d dVar) {
        org.locationtech.jts.geomgraph.d dVarD = this.f338822h.d(dVar);
        if (dVarD == null) {
            this.f338822h.a(dVar);
            return;
        }
        org.locationtech.jts.geomgraph.n nVarC = dVarD.c();
        org.locationtech.jts.geomgraph.n nVarC2 = dVar.c();
        if (!dVarD.B(dVar)) {
            nVarC2 = new org.locationtech.jts.geomgraph.n(dVar.c());
            nVarC2.b();
        }
        org.locationtech.jts.geomgraph.a aVarS = dVarD.s();
        if (aVarS.g()) {
            aVarS.b(nVarC);
        }
        aVarS.b(nVarC2);
        nVarC.l(nVarC2);
    }

    public boolean p(org.locationtech.jts.geom.a aVar) {
        return o(aVar, this.f338823i);
    }

    public boolean q(org.locationtech.jts.geom.a aVar) {
        return o(aVar, this.f338824j) || o(aVar, this.f338823i);
    }
}
