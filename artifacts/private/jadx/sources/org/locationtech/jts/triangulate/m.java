package org.locationtech.jts.triangulate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f339079a = new TreeMap();

    private void d(org.locationtech.jts.geom.a[] aVarArr, Object obj) {
        for (org.locationtech.jts.geom.a aVar : aVarArr) {
            this.f339079a.put(aVar, obj);
        }
    }

    public List a() {
        return new ArrayList(this.f339079a.keySet());
    }

    public void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geom.n nVar = (org.locationtech.jts.geom.n) it.next();
            d(nVar.d0(), nVar.q0());
        }
    }

    public void c(org.locationtech.jts.geom.n nVar) {
        for (int i10 = 0; i10 < nVar.l0(); i10++) {
            org.locationtech.jts.geom.n nVarH0 = nVar.h0(i10);
            d(nVarH0.d0(), nVarH0.q0());
        }
    }

    public void e(org.locationtech.jts.geom.n nVar) {
        for (int i10 = 0; i10 < nVar.l0(); i10++) {
            org.locationtech.jts.geom.n nVarH0 = nVar.h0(i10);
            org.locationtech.jts.geom.a aVar = (org.locationtech.jts.geom.a) nVarH0.q0();
            if (aVar != null) {
                nVarH0.J0(this.f339079a.get(aVar));
            }
        }
    }
}
