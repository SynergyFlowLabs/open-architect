package org.locationtech.jts.geom.util;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public static a a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        double d10 = org.locationtech.jts.algorithm.a.d(aVar2, aVar, new org.locationtech.jts.geom.a((aVar.f338092a + aVar4.f338092a) - aVar3.f338092a, (aVar.f338093b + aVar4.f338093b) - aVar3.f338093b));
        double dL = aVar2.l(aVar);
        double dL2 = aVar4.l(aVar3);
        if (dL == 0.0d) {
            return new a();
        }
        double d11 = dL2 / dL;
        a aVarT = a.T(-aVar.f338092a, -aVar.f338093b);
        aVarT.n(d10);
        aVarT.v(d11, d11);
        aVarT.S(aVar3.f338092a, aVar3.f338093b);
        return aVarT;
    }

    public static a b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        return a.T(aVar2.f338092a - aVar.f338092a, aVar2.f338093b - aVar.f338093b);
    }

    public static a c(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        double d10 = org.locationtech.jts.algorithm.a.d(aVar2, aVar, new org.locationtech.jts.geom.a(aVar4.f338092a - aVar3.f338092a, aVar4.f338093b - aVar3.f338093b));
        double dL = aVar2.l(aVar);
        double dL2 = aVar4.l(aVar3);
        if (dL == 0.0d) {
            return null;
        }
        double d11 = dL2 / dL;
        a aVarT = a.T(-aVar.f338092a, -aVar.f338093b);
        aVarT.n(d10);
        aVarT.v(d11, d11);
        aVarT.S(aVar3.f338092a, aVar3.f338093b);
        return aVarT;
    }

    public static a d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4, org.locationtech.jts.geom.a aVar5, org.locationtech.jts.geom.a aVar6) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6).b();
    }

    public static a e(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.a[] aVarArr2) {
        if (aVarArr.length != aVarArr2.length) {
            throw new IllegalArgumentException("Src and Dest arrays are not the same length");
        }
        if (aVarArr.length <= 0) {
            throw new IllegalArgumentException("Too few control points");
        }
        if (aVarArr.length > 3) {
            throw new IllegalArgumentException("Too many control points");
        }
        int i10 = 5 & 0;
        if (aVarArr.length == 1) {
            return b(aVarArr[0], aVarArr2[0]);
        }
        return aVarArr.length == 2 ? c(aVarArr[0], aVarArr[1], aVarArr2[0], aVarArr2[1]) : d(aVarArr[0], aVarArr[1], aVarArr[2], aVarArr2[0], aVarArr2[1], aVarArr2[2]);
    }
}
