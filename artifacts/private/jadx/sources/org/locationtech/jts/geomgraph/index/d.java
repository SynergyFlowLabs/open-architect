package org.locationtech.jts.geomgraph.index;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geomgraph.t;

/* JADX INFO: loaded from: classes14.dex */
public class d {
    private int a(org.locationtech.jts.geom.a[] aVarArr, int i10) {
        org.locationtech.jts.geom.a aVar = aVarArr[i10];
        int i11 = i10 + 1;
        int iF = t.f(aVar, aVarArr[i11]);
        while (i11 < aVarArr.length && t.f(aVarArr[i11 - 1], aVarArr[i11]) == iF) {
            i11++;
        }
        return i11 - 1;
    }

    public static int[] c(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) list.get(i10)).intValue();
        }
        return iArr;
    }

    public int[] b(org.locationtech.jts.geom.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        int iA = 0;
        arrayList.add(new Integer(0));
        do {
            iA = a(aVarArr, iA);
            arrayList.add(new Integer(iA));
        } while (iA < aVarArr.length - 1);
        return c(arrayList);
    }
}
