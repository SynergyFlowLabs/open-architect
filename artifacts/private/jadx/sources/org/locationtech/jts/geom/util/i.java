package org.locationtech.jts.geom.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class i {

    public interface a {
        org.locationtech.jts.geom.n a(org.locationtech.jts.geom.n nVar);
    }

    public static Collection a(Collection collection, a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geom.n nVarA = aVar.a((org.locationtech.jts.geom.n) it.next());
            if (nVarA != null) {
                arrayList.add(nVarA);
            }
        }
        return arrayList;
    }

    public static org.locationtech.jts.geom.n b(org.locationtech.jts.geom.n nVar, a aVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < nVar.l0(); i10++) {
            org.locationtech.jts.geom.n nVarA = aVar.a(nVar.h0(i10));
            if (nVarA != null) {
                arrayList.add(nVarA);
            }
        }
        return nVar.g0().b(arrayList);
    }
}
