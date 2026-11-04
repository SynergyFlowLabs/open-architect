package org.locationtech.jts.index.chain;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geomgraph.t;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    private static int a(org.locationtech.jts.geom.a[] aVarArr, int i10) {
        int i11 = i10;
        while (i11 < aVarArr.length - 1) {
            int i12 = i11 + 1;
            if (!aVarArr[i11].p(aVarArr[i12])) {
                break;
            }
            i11 = i12;
        }
        if (i11 >= aVarArr.length - 1) {
            return aVarArr.length - 1;
        }
        int iF = t.f(aVarArr[i11], aVarArr[i11 + 1]);
        while (true) {
            i10++;
            if (i10 >= aVarArr.length) {
                break;
            }
            int i13 = i10 - 1;
            if (!aVarArr[i13].p(aVarArr[i10]) && t.f(aVarArr[i13], aVarArr[i10]) != iF) {
                break;
            }
        }
        return i10 - 1;
    }

    public static int[] b(org.locationtech.jts.geom.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        int iA = 0;
        arrayList.add(new Integer(0));
        do {
            iA = a(aVarArr, iA);
            arrayList.add(new Integer(iA));
        } while (iA < aVarArr.length - 1);
        return e(arrayList);
    }

    public static List c(org.locationtech.jts.geom.a[] aVarArr) {
        return d(aVarArr, null);
    }

    public static List d(org.locationtech.jts.geom.a[] aVarArr, Object obj) {
        ArrayList arrayList = new ArrayList();
        int[] iArrB = b(aVarArr);
        int i10 = 0;
        while (i10 < iArrB.length - 1) {
            int i11 = iArrB[i10];
            i10++;
            arrayList.add(new a(aVarArr, i11, iArrB[i10], obj));
        }
        return arrayList;
    }

    public static int[] e(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) list.get(i10)).intValue();
        }
        return iArr;
    }
}
