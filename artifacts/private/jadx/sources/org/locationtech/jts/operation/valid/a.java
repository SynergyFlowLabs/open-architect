package org.locationtech.jts.operation.valid;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geomgraph.k;
import org.locationtech.jts.geomgraph.l;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f338912a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f338913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338914c;

    public a(l lVar) {
        this.f338913b = lVar;
    }

    private List a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geomgraph.b bVar = (org.locationtech.jts.geomgraph.b) it.next();
            if (bVar.R() && bVar.H() == null) {
                org.locationtech.jts.operation.overlay.d dVar = new org.locationtech.jts.operation.overlay.d(bVar, this.f338912a);
                dVar.x();
                arrayList.addAll(dVar.w());
            }
        }
        return arrayList;
    }

    public static org.locationtech.jts.geom.a b(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.a aVar) {
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (!aVarArr[i10].equals(aVar)) {
                return aVarArr[i10];
            }
        }
        return null;
    }

    private boolean d(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            k kVar = (k) list.get(i10);
            if (!kVar.n()) {
                List listH = kVar.h();
                if (((org.locationtech.jts.geomgraph.b) listH.get(0)).q().e(0, 2) != 0) {
                    continue;
                } else {
                    for (int i11 = 0; i11 < listH.size(); i11++) {
                        org.locationtech.jts.geomgraph.b bVar = (org.locationtech.jts.geomgraph.b) listH.get(i11);
                        if (!bVar.U()) {
                            this.f338914c = bVar.k();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private void f(org.locationtech.jts.geomgraph.r rVar) {
        for (org.locationtech.jts.geomgraph.b bVar : rVar.k()) {
            boolean z10 = false & false;
            if (bVar.q().e(0, 2) == 0) {
                bVar.Z(true);
            }
        }
    }

    private void g(v vVar, org.locationtech.jts.geomgraph.r rVar) {
        org.locationtech.jts.geom.a[] aVarArrD0 = vVar.d0();
        org.locationtech.jts.geom.a aVar = aVarArrD0[0];
        org.locationtech.jts.geomgraph.b bVarN = (org.locationtech.jts.geomgraph.b) rVar.i(rVar.j(aVar, b(aVarArrD0, aVar)));
        if (bVarN.q().e(0, 2) != 0) {
            bVarN = bVarN.N().q().e(0, 2) == 0 ? bVarN.N() : null;
        }
        org.locationtech.jts.util.a.d(bVarN != null, "unable to find dirEdge with Interior on RHS");
        h(bVarN);
    }

    private void i(n nVar, org.locationtech.jts.geomgraph.r rVar) {
        if (nVar instanceof e0) {
            g(((e0) nVar).R0(), rVar);
        }
        if (nVar instanceof b0) {
            b0 b0Var = (b0) nVar;
            for (int i10 = 0; i10 < b0Var.l0(); i10++) {
                g(((e0) b0Var.h0(i10)).R0(), rVar);
            }
        }
    }

    public org.locationtech.jts.geom.a c() {
        return this.f338914c;
    }

    public boolean e() {
        ArrayList arrayList = new ArrayList();
        this.f338913b.I(arrayList);
        org.locationtech.jts.geomgraph.r rVar = new org.locationtech.jts.geomgraph.r(new org.locationtech.jts.operation.overlay.f());
        rVar.b(arrayList);
        f(rVar);
        rVar.r();
        List listA = a(rVar.k());
        i(this.f338913b.P(), rVar);
        return !d(listA);
    }

    protected void h(org.locationtech.jts.geomgraph.b bVar) {
        org.locationtech.jts.geomgraph.b bVarL = bVar;
        do {
            org.locationtech.jts.util.a.d(bVarL != null, "found null Directed Edge");
            bVarL.f0(true);
            bVarL = bVarL.L();
        } while (bVarL != bVar);
    }
}
