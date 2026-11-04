package org.locationtech.jts.geom.prep;

import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.algorithm.u;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.noding.a0;

/* JADX INFO: loaded from: classes14.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f338198a;

    public f(e eVar) {
        this.f338198a = eVar;
    }

    public static boolean b(e eVar, n nVar) {
        return new f(eVar).a(nVar);
    }

    public boolean a(n nVar) {
        List listB = a0.b(nVar);
        if (listB.size() > 0 && this.f338198a.p().b(listB)) {
            return true;
        }
        if (nVar.Rg() == 1) {
            return false;
        }
        if (nVar.Rg() == 2 && this.f338198a.o(nVar)) {
            return true;
        }
        if (nVar.Rg() == 0) {
            return c(nVar);
        }
        return false;
    }

    protected boolean c(n nVar) {
        u uVar = new u();
        Iterator it = org.locationtech.jts.geom.util.d.b(nVar).iterator();
        while (it.hasNext()) {
            if (uVar.b((org.locationtech.jts.geom.a) it.next(), this.f338198a.j())) {
                return true;
            }
        }
        return false;
    }
}
