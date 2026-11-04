package org.locationtech.jts.geomgraph.index;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f338322a;

    private void c(org.locationtech.jts.geomgraph.d dVar, org.locationtech.jts.geomgraph.d dVar2, e eVar) {
        org.locationtech.jts.geom.a[] aVarArrR = dVar.r();
        org.locationtech.jts.geom.a[] aVarArrR2 = dVar2.r();
        for (int i10 = 0; i10 < aVarArrR.length - 1; i10++) {
            for (int i11 = 0; i11 < aVarArrR2.length - 1; i11++) {
                eVar.a(dVar, i10, dVar2, i11);
            }
        }
    }

    @Override // org.locationtech.jts.geomgraph.index.a
    public void a(List list, List list2, e eVar) {
        this.f338322a = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geomgraph.d dVar = (org.locationtech.jts.geomgraph.d) it.next();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                c(dVar, (org.locationtech.jts.geomgraph.d) it2.next(), eVar);
            }
        }
    }

    @Override // org.locationtech.jts.geomgraph.index.a
    public void b(List list, e eVar, boolean z10) {
        this.f338322a = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geomgraph.d dVar = (org.locationtech.jts.geomgraph.d) it.next();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                org.locationtech.jts.geomgraph.d dVar2 = (org.locationtech.jts.geomgraph.d) it2.next();
                if (z10 || dVar != dVar2) {
                    c(dVar, dVar2, eVar);
                }
            }
        }
    }
}
