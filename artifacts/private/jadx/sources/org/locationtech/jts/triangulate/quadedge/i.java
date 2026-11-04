package org.locationtech.jts.triangulate.quadedge;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class i {
    public static List a(d dVar) {
        ArrayList arrayList = new ArrayList();
        d dVarP = dVar;
        do {
            arrayList.add(dVarP);
            dVarP = dVarP.p();
        } while (dVarP != dVar);
        return arrayList;
    }
}
