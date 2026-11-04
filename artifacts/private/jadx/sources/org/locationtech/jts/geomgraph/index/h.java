package org.locationtech.jts.geomgraph.index;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List f338325a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f338326b;

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geomgraph.d dVar = (org.locationtech.jts.geomgraph.d) it.next();
            e(dVar, dVar);
        }
    }

    private void d(List list, Object obj) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((org.locationtech.jts.geomgraph.d) it.next(), obj);
        }
    }

    private void e(org.locationtech.jts.geomgraph.d dVar, Object obj) {
        org.locationtech.jts.geom.a[] aVarArrR = dVar.r();
        for (int i10 = 0; i10 < aVarArrR.length - 1; i10++) {
            j jVar = new j(dVar, i10);
            i iVar = new i(obj, jVar.c(), null);
            this.f338325a.add(iVar);
            this.f338325a.add(new i(jVar.b(), iVar));
        }
    }

    private void f(e eVar) {
        this.f338326b = 0;
        g();
        for (int i10 = 0; i10 < this.f338325a.size(); i10++) {
            i iVar = (i) this.f338325a.get(i10);
            if (iVar.p()) {
                h(i10, iVar.k(), iVar, eVar);
            }
        }
    }

    private void g() {
        Collections.sort(this.f338325a);
        for (int i10 = 0; i10 < this.f338325a.size(); i10++) {
            i iVar = (i) this.f338325a.get(i10);
            if (iVar.o()) {
                iVar.l().r(i10);
            }
        }
    }

    private void h(int i10, int i11, i iVar, e eVar) {
        j jVar = (j) iVar.n();
        while (i10 < i11) {
            i iVar2 = (i) this.f338325a.get(i10);
            if (iVar2.p()) {
                j jVar2 = (j) iVar2.n();
                if (!iVar.q(iVar2)) {
                    jVar.a(jVar2, eVar);
                    this.f338326b++;
                }
            }
            i10++;
        }
    }

    @Override // org.locationtech.jts.geomgraph.index.a
    public void a(List list, List list2, e eVar) {
        d(list, list);
        d(list2, list2);
        f(eVar);
    }

    @Override // org.locationtech.jts.geomgraph.index.a
    public void b(List list, e eVar, boolean z10) {
        if (z10) {
            d(list, null);
        } else {
            c(list);
        }
        f(eVar);
    }
}
