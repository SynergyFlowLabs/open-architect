package org.locationtech.jts.geom.prep;

import java.util.List;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.noding.a0;

/* JADX INFO: loaded from: classes14.dex */
class l extends m {
    public l(h hVar) {
        super(hVar);
    }

    public static boolean g(h hVar, n nVar) {
        return new l(hVar).f(nVar);
    }

    public boolean f(n nVar) {
        if (d(nVar)) {
            return true;
        }
        if (nVar.Rg() == 0) {
            return false;
        }
        List listB = a0.b(nVar);
        if (listB.size() <= 0 || !this.f338202a.p().b(listB)) {
            return nVar.Rg() == 2 && c(nVar, this.f338202a.n());
        }
        return true;
    }
}
