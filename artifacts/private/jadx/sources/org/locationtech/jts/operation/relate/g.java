package org.locationtech.jts.operation.relate;

import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geomgraph.l;
import org.locationtech.jts.geomgraph.o;
import org.locationtech.jts.geomgraph.q;

/* JADX INFO: loaded from: classes14.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q f338910a = new q(new f());

    public void a(l lVar) {
        b(lVar, 0);
        c(lVar, 0);
        e(new a().a(lVar.l()));
    }

    public void b(l lVar, int i10) {
        Iterator itL = lVar.l();
        while (itL.hasNext()) {
            org.locationtech.jts.geomgraph.d dVar = (org.locationtech.jts.geomgraph.d) itL.next();
            int iD = dVar.c().d(i10);
            Iterator itF = dVar.u().f();
            while (itF.hasNext()) {
                e eVar = (e) this.f338910a.b(((org.locationtech.jts.geomgraph.g) itF.next()).f338297a);
                if (iD == 1) {
                    eVar.v(i10);
                } else if (eVar.c().k(i10)) {
                    eVar.u(i10, 0);
                }
            }
        }
    }

    public void c(l lVar, int i10) {
        Iterator itM = lVar.m();
        while (itM.hasNext()) {
            o oVar = (o) itM.next();
            this.f338910a.b(oVar.b()).u(i10, oVar.c().d(i10));
        }
    }

    public Iterator d() {
        return this.f338910a.f();
    }

    public void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f338910a.a((org.locationtech.jts.geomgraph.e) it.next());
        }
    }
}
