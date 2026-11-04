package org.locationtech.jts.geomgraph.index;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class g extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List f338323a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f338324b;

    private void c(org.locationtech.jts.geomgraph.d dVar, Object obj) {
        c cVarX = dVar.x();
        int[] iArrG = cVarX.g();
        for (int i10 = 0; i10 < iArrG.length - 1; i10++) {
            i iVar = new i(obj, cVarX.f(i10), new b(cVarX, i10));
            this.f338323a.add(iVar);
            this.f338323a.add(new i(cVarX.e(i10), iVar));
        }
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geomgraph.d dVar = (org.locationtech.jts.geomgraph.d) it.next();
            c(dVar, dVar);
        }
    }

    private void e(List list, Object obj) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((org.locationtech.jts.geomgraph.d) it.next(), obj);
        }
    }

    private void f(e eVar) {
        this.f338324b = 0;
        g();
        for (int i10 = 0; i10 < this.f338323a.size(); i10++) {
            i iVar = (i) this.f338323a.get(i10);
            if (iVar.p()) {
                h(i10, iVar.k(), iVar, eVar);
            }
            if (eVar.i()) {
                return;
            }
        }
    }

    private void g() {
        Collections.sort(this.f338323a);
        for (int i10 = 0; i10 < this.f338323a.size(); i10++) {
            i iVar = (i) this.f338323a.get(i10);
            if (iVar.o()) {
                iVar.l().r(i10);
            }
        }
    }

    private void h(int i10, int i11, i iVar, e eVar) {
        b bVar = (b) iVar.n();
        while (i10 < i11) {
            i iVar2 = (i) this.f338323a.get(i10);
            if (iVar2.p()) {
                b bVar2 = (b) iVar2.n();
                if (!iVar.q(iVar2)) {
                    bVar.a(bVar2, eVar);
                    this.f338324b++;
                }
            }
            i10++;
        }
    }

    @Override // org.locationtech.jts.geomgraph.index.a
    public void a(List list, List list2, e eVar) {
        e(list, list);
        e(list2, list2);
        f(eVar);
    }

    @Override // org.locationtech.jts.geomgraph.index.a
    public void b(List list, e eVar, boolean z10) {
        if (z10) {
            e(list, null);
        } else {
            d(list);
        }
        f(eVar);
    }
}
