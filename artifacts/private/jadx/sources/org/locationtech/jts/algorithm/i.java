package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class i {
    public static double a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        double d10 = aVar3.f338092a;
        double d11 = aVar2.f338092a;
        double d12 = aVar3.f338093b;
        double d13 = aVar2.f338093b;
        double d14 = ((d10 - d11) * (d10 - d11)) + ((d12 - d13) * (d12 - d13));
        return Math.abs((((d13 - aVar.f338093b) * (d10 - d11)) - ((d11 - aVar.f338092a) * (d12 - d13))) / d14) * Math.sqrt(d14);
    }

    public static double b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        double d10 = aVar2.f338092a;
        double d11 = aVar3.f338092a;
        if (d10 == d11 && aVar2.f338093b == aVar3.f338093b) {
            return aVar.l(aVar2);
        }
        double d12 = aVar3.f338093b;
        double d13 = aVar2.f338093b;
        double d14 = ((d11 - d10) * (d11 - d10)) + ((d12 - d13) * (d12 - d13));
        double d15 = aVar.f338092a;
        double d16 = (d15 - d10) * (d11 - d10);
        double d17 = aVar.f338093b;
        double d18 = (d16 + ((d17 - d13) * (d12 - d13))) / d14;
        if (d18 <= 0.0d) {
            return aVar.l(aVar2);
        }
        return d18 >= 1.0d ? aVar.l(aVar3) : Math.abs((((d13 - d17) * (d11 - d10)) - ((d10 - d15) * (d12 - d13))) / d14) * Math.sqrt(d14);
    }

    public static double c(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a[] aVarArr) {
        if (aVarArr.length == 0) {
            throw new IllegalArgumentException("Line array must contain at least one vertex");
        }
        int i10 = 0;
        double dL = aVar.l(aVarArr[0]);
        while (i10 < aVarArr.length - 1) {
            org.locationtech.jts.geom.a aVar2 = aVarArr[i10];
            i10++;
            double dB = b(aVar, aVar2, aVarArr[i10]);
            if (dB < dL) {
                dL = dB;
            }
        }
        return dL;
    }

    public static double d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        if (aVar.equals(aVar2)) {
            return b(aVar, aVar3, aVar4);
        }
        if (aVar3.equals(aVar4)) {
            return b(aVar4, aVar, aVar2);
        }
        if (org.locationtech.jts.geom.m.a0(aVar, aVar2, aVar3, aVar4)) {
            double d10 = aVar2.f338092a;
            double d11 = aVar.f338092a;
            double d12 = aVar4.f338093b;
            double d13 = aVar3.f338093b;
            double d14 = (d10 - d11) * (d12 - d13);
            double d15 = aVar2.f338093b;
            double d16 = aVar.f338093b;
            double d17 = d15 - d16;
            double d18 = aVar4.f338092a;
            double d19 = aVar3.f338092a;
            double d20 = d14 - (d17 * (d18 - d19));
            if (d20 != 0.0d) {
                double d21 = ((d16 - d13) * (d18 - d19)) - ((d11 - d19) * (d12 - d13));
                double d22 = (((d16 - d13) * (d10 - d11)) - ((d11 - d19) * (d15 - d16))) / d20;
                double d23 = d21 / d20;
                if (d23 >= 0.0d && d23 <= 1.0d && d22 >= 0.0d && d22 <= 1.0d) {
                    return 0.0d;
                }
            }
        }
        return tm.b.g(b(aVar, aVar3, aVar4), b(aVar2, aVar3, aVar4), b(aVar3, aVar, aVar2), b(aVar4, aVar, aVar2));
    }
}
