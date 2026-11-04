package org.locationtech.jts.operation.overlay;

import org.locationtech.jts.geom.r;
import org.locationtech.jts.geomgraph.k;

/* JADX INFO: loaded from: classes14.dex */
public class e extends k {
    public e(org.locationtech.jts.geomgraph.b bVar, r rVar) {
        super(bVar, rVar);
    }

    @Override // org.locationtech.jts.geomgraph.k
    public org.locationtech.jts.geomgraph.b l(org.locationtech.jts.geomgraph.b bVar) {
        return bVar.M();
    }

    @Override // org.locationtech.jts.geomgraph.k
    public void s(org.locationtech.jts.geomgraph.b bVar, k kVar) {
        bVar.a0(kVar);
    }
}
