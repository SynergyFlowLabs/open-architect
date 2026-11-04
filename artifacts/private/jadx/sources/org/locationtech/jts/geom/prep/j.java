package org.locationtech.jts.geom.prep;

import org.locationtech.jts.geom.f0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.noding.a0;

/* JADX INFO: loaded from: classes14.dex */
class j extends m {
    public j(h hVar) {
        super(hVar);
    }

    public static boolean g(h hVar, n nVar) {
        return new j(hVar).f(nVar);
    }

    public boolean f(n nVar) {
        if (!b(nVar)) {
            return false;
        }
        if (this.f338202a.p().b(a0.b(nVar))) {
            return false;
        }
        return ((nVar instanceof f0) && c(nVar, this.f338202a.n())) ? false : true;
    }
}
