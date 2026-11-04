package org.locationtech.jts.operation.overlay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.i0;
import org.locationtech.jts.geomgraph.n;
import org.locationtech.jts.geomgraph.o;
import org.locationtech.jts.geomgraph.r;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f338804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f338805b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f338806c = 2;

    public a(r rVar) {
        this.f338804a = rVar;
    }

    private List c(org.locationtech.jts.geomgraph.c cVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Iterator itM = cVar.m();
        while (itM.hasNext()) {
            org.locationtech.jts.geomgraph.b bVar = (org.locationtech.jts.geomgraph.b) itM.next();
            if (d(bVar, i10) || d(bVar.N(), i10)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private boolean d(org.locationtech.jts.geomgraph.b bVar, int i10) {
        n nVarQ = bVar.q();
        return nVarQ.g() && !bVar.S() && g.r(nVarQ.e(0, 2), nVarQ.e(1, 2), i10);
    }

    private void e(org.locationtech.jts.geomgraph.c cVar, int i10) {
        List listC = c(cVar, i10);
        org.locationtech.jts.geomgraph.b bVar = null;
        char c10 = 1;
        for (int i11 = 0; i11 < listC.size(); i11++) {
            org.locationtech.jts.geomgraph.b bVar2 = (org.locationtech.jts.geomgraph.b) listC.get(i11);
            org.locationtech.jts.geomgraph.b bVarN = bVar2.N();
            if (bVar2.q().g()) {
                if (bVar == null && d(bVar2, i10)) {
                    bVar = bVar2;
                }
                if (c10 != 1) {
                    if (c10 == 2 && d(bVar2, i10)) {
                        c10 = 1;
                    }
                } else if (d(bVarN, i10)) {
                    c10 = 2;
                }
            }
        }
        if (c10 == 2 && bVar == null) {
            throw new i0("no outgoing dirEdge found", cVar.e());
        }
    }

    public void a(int i10) {
        Iterator itM = this.f338804a.m();
        while (itM.hasNext()) {
            e((org.locationtech.jts.geomgraph.c) ((o) itM.next()).p(), i10);
        }
    }

    public void b() {
        a(1);
        a(3);
        a(2);
        a(4);
    }
}
