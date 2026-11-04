package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static double a(org.locationtech.jts.geom.e eVar) {
        return Math.abs(c(eVar));
    }

    public static double b(org.locationtech.jts.geom.a[] aVarArr) {
        return Math.abs(d(aVarArr));
    }

    public static double c(org.locationtech.jts.geom.e eVar) {
        int size = eVar.size();
        double d10 = 0.0d;
        if (size < 3) {
            return 0.0d;
        }
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a();
        org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a();
        org.locationtech.jts.geom.a aVar3 = new org.locationtech.jts.geom.a();
        eVar.Ob(0, aVar2);
        eVar.Ob(1, aVar3);
        double d11 = aVar2.f338092a;
        aVar3.f338092a -= d11;
        int i10 = 1;
        while (i10 < size - 1) {
            aVar.f338093b = aVar2.f338093b;
            aVar2.f338092a = aVar3.f338092a;
            aVar2.f338093b = aVar3.f338093b;
            i10++;
            eVar.Ob(i10, aVar3);
            aVar3.f338092a -= d11;
            d10 += aVar2.f338092a * (aVar.f338093b - aVar3.f338093b);
            d11 = d11;
        }
        return d10 / 2.0d;
    }

    public static double d(org.locationtech.jts.geom.a[] aVarArr) {
        double d10 = 0.0d;
        if (aVarArr.length < 3) {
            return 0.0d;
        }
        double d11 = aVarArr[0].f338092a;
        int i10 = 1;
        while (i10 < aVarArr.length - 1) {
            int i11 = i10 + 1;
            d10 += (aVarArr[i10].f338092a - d11) * (aVarArr[i10 - 1].f338093b - aVarArr[i11].f338093b);
            i10 = i11;
        }
        return d10 / 2.0d;
    }
}
