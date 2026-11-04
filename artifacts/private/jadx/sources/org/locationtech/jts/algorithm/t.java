package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class t {
    public static boolean a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a[] aVarArr) {
        return d(aVar, aVarArr) != 2;
    }

    public static boolean b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.e eVar) {
        y yVar = new y();
        org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a();
        org.locationtech.jts.geom.a aVar3 = new org.locationtech.jts.geom.a();
        int size = eVar.size();
        for (int i10 = 1; i10 < size; i10++) {
            eVar.Ob(i10 - 1, aVar2);
            eVar.Ob(i10, aVar3);
            yVar.e(aVar, aVar2, aVar3);
            if (yVar.n()) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a[] aVarArr) {
        y yVar = new y();
        for (int i10 = 1; i10 < aVarArr.length; i10++) {
            yVar.e(aVar, aVarArr[i10 - 1], aVarArr[i10]);
            if (yVar.n()) {
                return true;
            }
        }
        return false;
    }

    public static int d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a[] aVarArr) {
        return v.f(aVar, aVarArr);
    }
}
