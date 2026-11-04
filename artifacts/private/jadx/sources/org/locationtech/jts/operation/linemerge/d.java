package org.locationtech.jts.operation.linemerge;

import org.locationtech.jts.geom.v;
import org.locationtech.jts.planargraph.g;

/* JADX INFO: loaded from: classes14.dex */
public class d extends g {
    private org.locationtech.jts.planargraph.e q(org.locationtech.jts.geom.a aVar) {
        org.locationtech.jts.planargraph.e eVarH = h(aVar);
        if (eVarH != null) {
            return eVarH;
        }
        org.locationtech.jts.planargraph.e eVar = new org.locationtech.jts.planargraph.e(aVar);
        c(eVar);
        return eVar;
    }

    public void p(v vVar) {
        if (vVar.v0()) {
            return;
        }
        org.locationtech.jts.geom.a[] aVarArrS = org.locationtech.jts.geom.b.s(vVar.d0());
        if (aVarArrS.length <= 1) {
            return;
        }
        org.locationtech.jts.geom.a aVar = aVarArrS[0];
        org.locationtech.jts.geom.a aVar2 = aVarArrS[aVarArrS.length - 1];
        org.locationtech.jts.planargraph.e eVarQ = q(aVar);
        org.locationtech.jts.planargraph.e eVarQ2 = q(aVar2);
        b bVar = new b(eVarQ, eVarQ2, aVarArrS[1], true);
        b bVar2 = new b(eVarQ2, eVarQ, aVarArrS[aVarArrS.length - 2], false);
        c cVar = new c(vVar);
        cVar.H(bVar, bVar2);
        b(cVar);
    }
}
