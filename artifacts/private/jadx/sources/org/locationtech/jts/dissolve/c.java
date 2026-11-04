package org.locationtech.jts.dissolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.locationtech.jts.geom.d;
import org.locationtech.jts.geom.e;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.q;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f338074b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f338078f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f338076d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Stack f338077e = new Stack();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.dissolve.a f338075c = new org.locationtech.jts.dissolve.a();

    class a implements q {
        a() {
        }

        @Override // org.locationtech.jts.geom.q
        public void a(n nVar) {
            if (nVar instanceof v) {
                c.this.d((v) nVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(v vVar) {
        if (this.f338074b == null) {
            this.f338074b = vVar.g0();
        }
        e eVarS0 = vVar.S0();
        boolean z10 = false;
        for (int i10 = 1; i10 < eVarS0.size(); i10++) {
            b bVar = (b) this.f338075c.a(eVarS0.w4(i10 - 1), eVarS0.w4(i10));
            if (bVar != null && !z10) {
                bVar.E();
                z10 = true;
            }
        }
    }

    private void e(d dVar) {
        this.f338076d.add(this.f338074b.h(dVar.Uf()));
    }

    private void f(org.locationtech.jts.edgegraph.c cVar) {
        d dVar = new d();
        b bVar = (b) cVar;
        this.f338078f = null;
        org.locationtech.jts.edgegraph.d.z(bVar);
        dVar.i(bVar.p().k(), false);
        while (bVar.u().d() == 2) {
            n(bVar);
            bVar = (b) bVar.n();
            if (bVar == cVar) {
                h(this.f338078f);
                return;
            } else {
                dVar.i(bVar.p().k(), false);
                org.locationtech.jts.edgegraph.d.z(bVar);
            }
        }
        dVar.k(bVar.g().clone(), false);
        m(bVar.u());
        e(dVar);
    }

    private void g() {
        while (!this.f338077e.empty()) {
            org.locationtech.jts.edgegraph.c cVar = (org.locationtech.jts.edgegraph.c) this.f338077e.pop();
            if (!org.locationtech.jts.edgegraph.d.w(cVar)) {
                f(cVar);
            }
        }
    }

    private void h(org.locationtech.jts.edgegraph.c cVar) {
        org.locationtech.jts.edgegraph.c cVarN;
        d dVar = new d();
        dVar.i(cVar.p().k(), false);
        org.locationtech.jts.edgegraph.c cVar2 = cVar;
        while (cVar2.u().d() == 2 && (cVarN = cVar2.n()) != cVar) {
            dVar.i(cVarN.p().k(), false);
            cVar2 = cVarN;
        }
        dVar.i(cVar2.g().k(), false);
        e(dVar);
    }

    private void i() {
        for (org.locationtech.jts.edgegraph.c cVar : this.f338075c.e()) {
            if (!org.locationtech.jts.edgegraph.d.w(cVar)) {
                l(cVar);
            }
        }
        this.f338073a = this.f338074b.b(this.f338076d);
    }

    public static n j(n nVar) {
        c cVar = new c();
        cVar.c(nVar);
        return cVar.k();
    }

    private void l(org.locationtech.jts.edgegraph.c cVar) {
        org.locationtech.jts.edgegraph.c cVarR = cVar.r();
        if (cVarR != null) {
            cVar = cVarR;
        }
        m(cVar);
        g();
    }

    private void m(org.locationtech.jts.edgegraph.c cVar) {
        org.locationtech.jts.edgegraph.c cVarO = cVar;
        do {
            if (!org.locationtech.jts.edgegraph.d.w(cVarO)) {
                this.f338077e.add(cVarO);
            }
            cVarO = cVarO.o();
        } while (cVarO != cVar);
    }

    private void n(b bVar) {
        if (!bVar.D()) {
            bVar = (b) bVar.u();
            if (!bVar.D()) {
                return;
            }
        }
        if (this.f338078f == null) {
            this.f338078f = bVar;
        } else if (bVar.p().compareTo(this.f338078f.p()) < 0) {
            this.f338078f = bVar;
        }
    }

    public void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((n) it.next());
        }
    }

    public void c(n nVar) {
        nVar.d(new a());
    }

    public n k() {
        if (this.f338073a == null) {
            i();
        }
        return this.f338073a;
    }
}
