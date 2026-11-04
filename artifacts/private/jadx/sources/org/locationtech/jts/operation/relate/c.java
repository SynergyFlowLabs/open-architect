package org.locationtech.jts.operation.relate;

import java.util.Iterator;
import org.locationtech.jts.geom.t;

/* JADX INFO: loaded from: classes14.dex */
public class c extends org.locationtech.jts.geomgraph.f {
    @Override // org.locationtech.jts.geomgraph.f
    public void j(org.locationtech.jts.geomgraph.e eVar) {
        b bVar = (b) this.f338294a.get(eVar);
        if (bVar == null) {
            k(eVar, new b(eVar));
        } else {
            bVar.H(eVar);
        }
    }

    void p(t tVar) {
        Iterator itM = m();
        while (itM.hasNext()) {
            ((b) itM.next()).I(tVar);
        }
    }
}
