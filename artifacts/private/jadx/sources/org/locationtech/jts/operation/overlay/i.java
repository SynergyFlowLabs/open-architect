package org.locationtech.jts.operation.overlay;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.algorithm.t;
import org.locationtech.jts.geom.i0;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.x;
import org.locationtech.jts.geomgraph.k;

/* JADX INFO: loaded from: classes14.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f338829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f338830b = new ArrayList();

    public i(r rVar) {
        this.f338829a = rVar;
    }

    private List c(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geomgraph.b bVar = (org.locationtech.jts.geomgraph.b) it.next();
            if (bVar.R() && bVar.q().g() && bVar.H() == null) {
                d dVar = new d(bVar, this.f338829a);
                arrayList.add(dVar);
                dVar.t();
            }
        }
        return arrayList;
    }

    private List d(List list, List list2, List list3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.k() > 2) {
                dVar.x();
                List listW = dVar.w();
                k kVarH = h(listW);
                if (kVarH != null) {
                    k(kVarH, listW);
                    list2.add(kVarH);
                } else {
                    list3.addAll(listW);
                }
            } else {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    private List e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) it.next()).v(this.f338829a));
        }
        return arrayList;
    }

    private k g(k kVar, List list) {
        x xVarJ = kVar.j();
        m mVarF0 = xVarJ.f0();
        org.locationtech.jts.geom.a aVarR0 = xVarJ.R0(0);
        Iterator it = list.iterator();
        k kVar2 = null;
        m mVarF1 = null;
        while (it.hasNext()) {
            k kVar3 = (k) it.next();
            x xVarJ2 = kVar3.j();
            m mVarF2 = xVarJ2.f0();
            if (kVar2 != null) {
                mVarF1 = kVar2.j().f0();
            }
            if (mVarF2.o(mVarF0) && t.a(aVarR0, xVarJ2.d0()) && (kVar2 == null || mVarF1.o(mVarF2))) {
                kVar2 = kVar3;
            }
        }
        return kVar2;
    }

    private k h(List list) {
        Iterator it = list.iterator();
        e eVar = null;
        int i10 = 0;
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            if (!eVar2.n()) {
                i10++;
                eVar = eVar2;
            }
        }
        org.locationtech.jts.util.a.d(i10 <= 1, "found two shells in MinimalEdgeRing list");
        return eVar;
    }

    private void j(List list, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.m() == null) {
                k kVarG = g(kVar, list);
                if (kVarG == null) {
                    throw new i0("unable to assign hole to a shell", kVar.g(0));
                }
                kVar.u(kVarG);
            }
        }
    }

    private void k(k kVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.n()) {
                eVar.u(kVar);
            }
        }
    }

    private void l(List list, List list2, List list3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.n()) {
                list3.add(kVar);
            } else {
                list2.add(kVar);
            }
        }
    }

    public void a(Collection collection, Collection collection2) {
        org.locationtech.jts.geomgraph.r.s(collection2);
        List listC = c(collection);
        ArrayList arrayList = new ArrayList();
        l(d(listC, this.f338830b, arrayList), this.f338830b, arrayList);
        j(this.f338830b, arrayList);
    }

    public void b(org.locationtech.jts.geomgraph.r rVar) {
        a(rVar.k(), rVar.n());
    }

    public boolean f(org.locationtech.jts.geom.a aVar) {
        Iterator it = this.f338830b.iterator();
        while (it.hasNext()) {
            if (((k) it.next()).f(aVar)) {
                return true;
            }
        }
        return false;
    }

    public List i() {
        return e(this.f338830b);
    }
}
