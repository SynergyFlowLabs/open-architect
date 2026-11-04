package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f337977a = 6.283185307179586d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f337978b = 1.5707963267948966d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f337979c = 0.7853981633974483d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f337980d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f337981e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f337982f = 0;

    private a() {
    }

    public static double a(org.locationtech.jts.geom.a aVar) {
        return Math.atan2(aVar.f338093b, aVar.f338092a);
    }

    public static double b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        return Math.atan2(aVar2.f338093b - aVar.f338093b, aVar2.f338092a - aVar.f338092a);
    }

    public static double c(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        return e(b(aVar2, aVar), b(aVar2, aVar3));
    }

    public static double d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        double dB = b(aVar2, aVar3) - b(aVar2, aVar);
        if (dB <= -3.141592653589793d) {
            return dB + 6.283185307179586d;
        }
        return dB > 3.141592653589793d ? dB - 6.283185307179586d : dB;
    }

    public static double e(double d10, double d11) {
        double d12 = d10 < d11 ? d11 - d10 : d10 - d11;
        return d12 > 3.141592653589793d ? 6.283185307179586d - d12 : d12;
    }

    public static int f(double d10, double d11) {
        double dSin = Math.sin(d11 - d10);
        if (dSin > 0.0d) {
            return 1;
        }
        return dSin < 0.0d ? -1 : 0;
    }

    public static double g(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        return Math.abs(b(aVar2, aVar3) - b(aVar2, aVar));
    }

    public static boolean h(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        double d10 = aVar.f338092a;
        double d11 = aVar2.f338092a;
        double d12 = d10 - d11;
        double d13 = aVar.f338093b;
        double d14 = aVar2.f338093b;
        return (d12 * (aVar3.f338092a - d11)) + ((d13 - d14) * (aVar3.f338093b - d14)) > 0.0d;
    }

    public static boolean i(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        double d10 = aVar.f338092a;
        double d11 = aVar2.f338092a;
        double d12 = d10 - d11;
        double d13 = aVar.f338093b;
        double d14 = aVar2.f338093b;
        return (d12 * (aVar3.f338092a - d11)) + ((d13 - d14) * (aVar3.f338093b - d14)) < 0.0d;
    }

    public static double j(double d10) {
        while (d10 > 3.141592653589793d) {
            d10 -= 6.283185307179586d;
        }
        while (d10 <= -3.141592653589793d) {
            d10 += 6.283185307179586d;
        }
        return d10;
    }

    public static double k(double d10) {
        if (d10 < 0.0d) {
            while (d10 < 0.0d) {
                d10 += 6.283185307179586d;
            }
            if (d10 >= 6.283185307179586d) {
                return 0.0d;
            }
            return d10;
        }
        while (d10 >= 6.283185307179586d) {
            d10 -= 6.283185307179586d;
        }
        if (d10 < 0.0d) {
            return 0.0d;
        }
        return d10;
    }

    public static double l(double d10) {
        return (d10 * 180.0d) / 3.141592653589793d;
    }

    public static double m(double d10) {
        return (d10 * 3.141592653589793d) / 180.0d;
    }
}
