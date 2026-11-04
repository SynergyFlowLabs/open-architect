package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class n {
    public static double a(org.locationtech.jts.geom.e eVar) {
        int size = eVar.size();
        double dSqrt = 0.0d;
        int i10 = 1;
        if (size <= 1) {
            return 0.0d;
        }
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a();
        eVar.Ob(0, aVar);
        double d10 = aVar.f338092a;
        double d11 = aVar.f338093b;
        while (i10 < size) {
            eVar.Ob(i10, aVar);
            double d12 = aVar.f338092a;
            double d13 = aVar.f338093b;
            double d14 = d12 - d10;
            double d15 = d13 - d11;
            dSqrt += Math.sqrt((d14 * d14) + (d15 * d15));
            i10++;
            d10 = d12;
            d11 = d13;
        }
        return dSqrt;
    }
}
