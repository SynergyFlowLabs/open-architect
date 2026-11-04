package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class d {
    private d() {
    }

    public static double a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (!Double.isNaN(aVar.f338094c) && !Double.isNaN(aVar2.f338094c)) {
            double d10 = aVar.f338092a - aVar2.f338092a;
            double d11 = aVar.f338093b - aVar2.f338093b;
            double d12 = aVar.f338094c - aVar2.f338094c;
            return Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12));
        }
        return aVar.l(aVar2);
    }

    public static double b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        if (aVar2.r(aVar3)) {
            return a(aVar, aVar2);
        }
        double d10 = aVar3.f338092a;
        double d11 = aVar2.f338092a;
        double d12 = (d10 - d11) * (d10 - d11);
        double d13 = aVar3.f338093b;
        double d14 = aVar2.f338093b;
        double d15 = d12 + ((d13 - d14) * (d13 - d14));
        double d16 = aVar3.f338094c;
        double d17 = aVar2.f338094c;
        double d18 = d15 + ((d16 - d17) * (d16 - d17));
        if (Double.isNaN(d18)) {
            throw new IllegalArgumentException("Ordinates must not be NaN");
        }
        double d19 = aVar.f338092a;
        double d20 = aVar2.f338092a;
        double d21 = aVar3.f338092a;
        double d22 = (d19 - d20) * (d21 - d20);
        double d23 = aVar.f338093b;
        double d24 = aVar2.f338093b;
        double d25 = d23 - d24;
        double d26 = aVar3.f338093b;
        double d27 = d22 + (d25 * (d26 - d24));
        double d28 = aVar.f338094c;
        double d29 = aVar2.f338094c;
        double d30 = d28 - d29;
        double d31 = aVar3.f338094c;
        double d32 = (d27 + (d30 * (d31 - d29))) / d18;
        if (d32 <= 0.0d) {
            return a(aVar, aVar2);
        }
        if (d32 >= 1.0d) {
            return a(aVar, aVar3);
        }
        double d33 = d19 - (d20 + ((d21 - d20) * d32));
        double d34 = d23 - (d24 + ((d26 - d24) * d32));
        double d35 = d28 - (d29 + (d32 * (d31 - d29)));
        return Math.sqrt((d33 * d33) + (d34 * d34) + (d35 * d35));
    }

    public static double c(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        double d10;
        double d11;
        if (aVar.r(aVar2)) {
            return b(aVar, aVar3, aVar4);
        }
        if (aVar3.r(aVar2)) {
            return b(aVar3, aVar, aVar2);
        }
        double dE = tm.f.e(aVar, aVar2, aVar, aVar2);
        double dE2 = tm.f.e(aVar, aVar2, aVar3, aVar4);
        double dE3 = tm.f.e(aVar3, aVar4, aVar3, aVar4);
        double dE4 = tm.f.e(aVar, aVar2, aVar3, aVar);
        double dE5 = tm.f.e(aVar3, aVar4, aVar3, aVar);
        double d12 = (dE * dE3) - (dE2 * dE2);
        if (Double.isNaN(d12)) {
            throw new IllegalArgumentException("Ordinates must not be NaN");
        }
        if (d12 <= 0.0d) {
            d11 = dE2 > dE3 ? dE4 / dE2 : dE5 / dE3;
            d10 = 0.0d;
        } else {
            d10 = ((dE2 * dE5) - (dE3 * dE4)) / d12;
            d11 = ((dE * dE5) - (dE2 * dE4)) / d12;
        }
        if (d10 < 0.0d) {
            return b(aVar, aVar3, aVar4);
        }
        if (d10 > 1.0d) {
            return b(aVar2, aVar3, aVar4);
        }
        if (d11 < 0.0d) {
            return b(aVar3, aVar, aVar2);
        }
        if (d11 > 1.0d) {
            return b(aVar4, aVar, aVar2);
        }
        double d13 = aVar.f338092a;
        double d14 = d13 + ((aVar2.f338092a - d13) * d10);
        double d15 = aVar.f338093b;
        double d16 = d15 + ((aVar2.f338093b - d15) * d10);
        double d17 = aVar.f338094c;
        double d18 = d17 + (d10 * (aVar2.f338094c - d17));
        double d19 = aVar3.f338092a;
        double d20 = d19 + ((aVar4.f338092a - d19) * d11);
        double d21 = aVar3.f338093b;
        double d22 = d21 + ((aVar4.f338093b - d21) * d11);
        double d23 = aVar3.f338094c;
        return a(new org.locationtech.jts.geom.a(d14, d16, d18), new org.locationtech.jts.geom.a(d20, d22, d23 + (d11 * (aVar4.f338094c - d23))));
    }
}
