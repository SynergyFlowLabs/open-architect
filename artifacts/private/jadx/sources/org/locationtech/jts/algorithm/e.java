package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f337988a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f337989b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f337990c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f337991d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f337992e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f337993f = 0;

    public static int a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        return k(aVar, aVar2, aVar3);
    }

    public static double b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        if (aVar.equals(aVar2)) {
            return c(aVar, aVar3, aVar4);
        }
        if (aVar3.equals(aVar4)) {
            return c(aVar4, aVar, aVar2);
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
        return tm.b.g(c(aVar, aVar3, aVar4), c(aVar2, aVar3, aVar4), c(aVar3, aVar, aVar2), c(aVar4, aVar, aVar2));
    }

    public static double c(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
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

    public static double d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a[] aVarArr) {
        if (aVarArr.length == 0) {
            throw new IllegalArgumentException("Line array must contain at least one vertex");
        }
        int i10 = 0;
        double dL = aVar.l(aVarArr[0]);
        while (i10 < aVarArr.length - 1) {
            org.locationtech.jts.geom.a aVar2 = aVarArr[i10];
            i10++;
            double dC = c(aVar, aVar2, aVarArr[i10]);
            if (dC < dL) {
                dL = dC;
            }
        }
        return dL;
    }

    public static double e(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        double d10 = aVar3.f338092a;
        double d11 = aVar2.f338092a;
        double d12 = aVar3.f338093b;
        double d13 = aVar2.f338093b;
        double d14 = ((d10 - d11) * (d10 - d11)) + ((d12 - d13) * (d12 - d13));
        return Math.abs((((d13 - aVar.f338093b) * (d10 - d11)) - ((d11 - aVar.f338092a) * (d12 - d13))) / d14) * Math.sqrt(d14);
    }

    public static boolean f(org.locationtech.jts.geom.a[] aVarArr) {
        int length = aVarArr.length - 1;
        if (length < 3) {
            throw new IllegalArgumentException("Ring has fewer than 4 points, so orientation cannot be determined");
        }
        org.locationtech.jts.geom.a aVar = aVarArr[0];
        int i10 = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            org.locationtech.jts.geom.a aVar2 = aVarArr[i11];
            if (aVar2.f338093b > aVar.f338093b) {
                i10 = i11;
                aVar = aVar2;
            }
        }
        int i12 = i10;
        do {
            i12--;
            if (i12 < 0) {
                i12 = length;
            }
            if (!aVarArr[i12].p(aVar)) {
                break;
            }
        } while (i12 != i10);
        int i13 = i10;
        do {
            i13 = (i13 + 1) % length;
            if (!aVarArr[i13].p(aVar)) {
                break;
            }
        } while (i13 != i10);
        org.locationtech.jts.geom.a aVar3 = aVarArr[i12];
        org.locationtech.jts.geom.a aVar4 = aVarArr[i13];
        if (!aVar3.p(aVar) && !aVar4.p(aVar) && !aVar3.p(aVar4)) {
            int iA = a(aVar3, aVar, aVar4);
            if (iA == 0) {
                return aVar3.f338092a > aVar4.f338092a;
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a[] aVarArr) {
        y yVar = new y();
        for (int i10 = 1; i10 < aVarArr.length; i10++) {
            yVar.e(aVar, aVarArr[i10 - 1], aVarArr[i10]);
            if (yVar.n()) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a[] aVarArr) {
        return j(aVar, aVarArr) != 2;
    }

    public static double i(org.locationtech.jts.geom.e eVar) {
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

    public static int j(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a[] aVarArr) {
        return v.f(aVar, aVarArr);
    }

    public static int k(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        return f.b(aVar, aVar2, aVar3);
    }

    public static double l(org.locationtech.jts.geom.e eVar) {
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

    public static double m(org.locationtech.jts.geom.a[] aVarArr) {
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
