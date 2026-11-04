package org.locationtech.jts.noding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class a0 {
    public static List a(org.locationtech.jts.geom.n nVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = org.locationtech.jts.geom.util.l.h(nVar).iterator();
        while (it.hasNext()) {
            arrayList.add(new m(((org.locationtech.jts.geom.v) it.next()).d0(), nVar));
        }
        return arrayList;
    }

    public static List b(org.locationtech.jts.geom.n nVar) {
        return a(nVar);
    }

    public static org.locationtech.jts.geom.n c(Collection collection, org.locationtech.jts.geom.r rVar) {
        int size = collection.size();
        org.locationtech.jts.geom.v[] vVarArr = new org.locationtech.jts.geom.v[size];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            vVarArr[i10] = rVar.h(((y) it.next()).n());
            i10++;
        }
        return size == 1 ? vVarArr[0] : rVar.m(vVarArr);
    }

    public static String d(List list) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((y) it.next()).toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}
