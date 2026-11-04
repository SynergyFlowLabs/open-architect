package org.locationtech.jts.operation.relate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geomgraph.n;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public List a(Iterator it) {
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            b((org.locationtech.jts.geomgraph.d) it.next(), arrayList);
        }
        return arrayList;
    }

    public void b(org.locationtech.jts.geomgraph.d dVar, List list) {
        org.locationtech.jts.geomgraph.h hVarU = dVar.u();
        hVarU.b();
        Iterator itF = hVarU.f();
        if (!itF.hasNext()) {
            return;
        }
        org.locationtech.jts.geomgraph.g gVar = (org.locationtech.jts.geomgraph.g) itF.next();
        org.locationtech.jts.geomgraph.g gVar2 = null;
        while (true) {
            org.locationtech.jts.geomgraph.g gVar3 = itF.hasNext() ? (org.locationtech.jts.geomgraph.g) itF.next() : null;
            if (gVar != null) {
                d(dVar, list, gVar, gVar2);
                c(dVar, list, gVar, gVar3);
            }
            if (gVar == null) {
                return;
            }
            gVar2 = gVar;
            gVar = gVar3;
        }
    }

    void c(org.locationtech.jts.geomgraph.d dVar, List list, org.locationtech.jts.geomgraph.g gVar, org.locationtech.jts.geomgraph.g gVar2) {
        int i10 = gVar.f338298b + 1;
        if (i10 < dVar.y() || gVar2 != null) {
            org.locationtech.jts.geom.a aVarQ = dVar.q(i10);
            if (gVar2 != null && gVar2.f338298b == gVar.f338298b) {
                aVarQ = gVar2.f338297a;
            }
            list.add(new org.locationtech.jts.geomgraph.e(dVar, gVar.f338297a, aVarQ, new n(dVar.c())));
        }
    }

    void d(org.locationtech.jts.geomgraph.d dVar, List list, org.locationtech.jts.geomgraph.g gVar, org.locationtech.jts.geomgraph.g gVar2) {
        int i10 = gVar.f338298b;
        if (gVar.f338299c == 0.0d) {
            if (i10 == 0) {
                return;
            } else {
                i10--;
            }
        }
        org.locationtech.jts.geom.a aVarQ = dVar.q(i10);
        if (gVar2 != null && gVar2.f338298b >= i10) {
            aVarQ = gVar2.f338297a;
        }
        n nVar = new n(dVar.c());
        nVar.b();
        list.add(new org.locationtech.jts.geomgraph.e(dVar, gVar.f338297a, aVarQ, nVar));
    }
}
