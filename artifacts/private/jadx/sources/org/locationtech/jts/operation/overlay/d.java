package org.locationtech.jts.operation.overlay;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geomgraph.k;

/* JADX INFO: loaded from: classes14.dex */
public class d extends k {
    public d(org.locationtech.jts.geomgraph.b bVar, r rVar) {
        super(bVar, rVar);
    }

    @Override // org.locationtech.jts.geomgraph.k
    public org.locationtech.jts.geomgraph.b l(org.locationtech.jts.geomgraph.b bVar) {
        return bVar.L();
    }

    @Override // org.locationtech.jts.geomgraph.k
    public void s(org.locationtech.jts.geomgraph.b bVar, k kVar) {
        bVar.Y(kVar);
    }

    public List w() {
        ArrayList arrayList = new ArrayList();
        org.locationtech.jts.geomgraph.b bVarL = this.f338339a;
        do {
            if (bVarL.I() == null) {
                arrayList.add(new e(bVarL, this.f338348j));
            }
            bVarL = bVarL.L();
        } while (bVarL != this.f338339a);
        return arrayList;
    }

    public void x() {
        org.locationtech.jts.geomgraph.b bVarL = this.f338339a;
        do {
            ((org.locationtech.jts.geomgraph.c) bVarL.r().p()).y(this);
            bVarL = bVarL.L();
        } while (bVarL != this.f338339a);
    }
}
