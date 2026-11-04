package org.locationtech.jts.geom;

/* JADX INFO: loaded from: classes14.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f338146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f338147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f338148c;

    public j0(a aVar, a aVar2, a aVar3) {
        this.f338146a = aVar;
        this.f338147b = aVar2;
        this.f338148c = aVar3;
    }

    public static a a(a aVar, a aVar2, a aVar3) {
        double dL = aVar2.l(aVar);
        double dL2 = dL / (aVar2.l(aVar3) + dL);
        double d10 = aVar3.f338092a;
        double d11 = aVar.f338092a;
        double d12 = aVar3.f338093b;
        double d13 = aVar.f338093b;
        return new a(d11 + ((d10 - d11) * dL2), d13 + (dL2 * (d12 - d13)));
    }

    public static double c(a aVar, a aVar2, a aVar3) {
        double d10 = aVar3.f338092a;
        double d11 = aVar.f338092a;
        double d12 = aVar2.f338093b;
        double d13 = aVar.f338093b;
        return Math.abs((((d10 - d11) * (d12 - d13)) - ((aVar2.f338092a - d11) * (aVar3.f338093b - d13))) / 2.0d);
    }

    public static double e(a aVar, a aVar2, a aVar3) {
        double d10 = aVar2.f338092a;
        double d11 = aVar.f338092a;
        double d12 = d10 - d11;
        double d13 = aVar2.f338093b;
        double d14 = aVar.f338093b;
        double d15 = d13 - d14;
        double d16 = aVar2.f338094c;
        double d17 = aVar.f338094c;
        double d18 = d16 - d17;
        double d19 = aVar3.f338092a - d11;
        double d20 = aVar3.f338093b - d14;
        double d21 = aVar3.f338094c - d17;
        double d22 = (d15 * d21) - (d18 * d20);
        double d23 = (d18 * d19) - (d21 * d12);
        double d24 = (d12 * d20) - (d15 * d19);
        return Math.sqrt(((d22 * d22) + (d23 * d23)) + (d24 * d24)) / 2.0d;
    }

    public static a g(a aVar, a aVar2, a aVar3) {
        return new a(((aVar.f338092a + aVar2.f338092a) + aVar3.f338092a) / 3.0d, ((aVar.f338093b + aVar2.f338093b) + aVar3.f338093b) / 3.0d);
    }

    public static a i(a aVar, a aVar2, a aVar3) {
        double d10 = aVar3.f338092a;
        double d11 = aVar3.f338093b;
        double d12 = aVar.f338092a - d10;
        double d13 = aVar.f338093b - d11;
        double d14 = aVar2.f338092a - d10;
        double d15 = aVar2.f338093b - d11;
        double dJ = j(d12, d13, d14, d15) * 2.0d;
        double d16 = (d13 * d13) + (d12 * d12);
        double d17 = (d14 * d14) + (d15 * d15);
        return new a(d10 - (j(d13, d16, d15, d17) / dJ), d11 + (j(d12, d16, d14, d17) / dJ));
    }

    private static double j(double d10, double d11, double d12, double d13) {
        return (d10 * d13) - (d11 * d12);
    }

    public static a l(a aVar, a aVar2, a aVar3) {
        double dL = aVar2.l(aVar3);
        double dL2 = aVar.l(aVar3);
        double dL3 = aVar.l(aVar2);
        double d10 = dL + dL2 + dL3;
        return new a((((aVar.f338092a * dL) + (aVar2.f338092a * dL2)) + (aVar3.f338092a * dL3)) / d10, (((dL * aVar.f338093b) + (dL2 * aVar2.f338093b)) + (dL3 * aVar3.f338093b)) / d10);
    }

    public static double n(a aVar, a aVar2, a aVar3, a aVar4) {
        double d10 = aVar2.f338092a;
        double d11 = aVar2.f338093b;
        double d12 = aVar3.f338092a - d10;
        double d13 = aVar4.f338092a - d10;
        double d14 = aVar3.f338093b - d11;
        double d15 = aVar4.f338093b - d11;
        double d16 = (d12 * d15) - (d13 * d14);
        double d17 = aVar.f338092a - d10;
        double d18 = aVar.f338093b - d11;
        double d19 = (((-d14) * d17) + (d12 * d18)) / d16;
        double d20 = aVar2.f338094c;
        return ((((d15 * d17) - (d13 * d18)) / d16) * (aVar3.f338094c - d20)) + d20 + (d19 * (aVar4.f338094c - d20));
    }

    public static boolean p(a aVar, a aVar2, a aVar3) {
        return org.locationtech.jts.algorithm.a.h(aVar, aVar2, aVar3) && org.locationtech.jts.algorithm.a.h(aVar2, aVar3, aVar) && org.locationtech.jts.algorithm.a.h(aVar3, aVar, aVar2);
    }

    public static double r(a aVar, a aVar2, a aVar3) {
        double dL = aVar.l(aVar2);
        double dL2 = aVar2.l(aVar3);
        double dL3 = aVar3.l(aVar);
        if (dL2 > dL) {
            dL = dL2;
        }
        return dL3 > dL ? dL3 : dL;
    }

    public static org.locationtech.jts.algorithm.j s(a aVar, a aVar2) {
        double d10 = aVar2.f338092a;
        double d11 = aVar.f338092a;
        double d12 = d10 - d11;
        double d13 = aVar2.f338093b;
        double d14 = aVar.f338093b;
        double d15 = d13 - d14;
        double d16 = d12 / 2.0d;
        double d17 = d15 / 2.0d;
        return new org.locationtech.jts.algorithm.j(new org.locationtech.jts.algorithm.j(d11 + d16, d14 + d17, 1.0d), new org.locationtech.jts.algorithm.j((aVar.f338092a - d15) + d16, aVar.f338093b + d12 + d17, 1.0d));
    }

    public static double u(a aVar, a aVar2, a aVar3) {
        double d10 = aVar3.f338092a;
        double d11 = aVar.f338092a;
        double d12 = aVar2.f338093b;
        double d13 = aVar.f338093b;
        return (((d10 - d11) * (d12 - d13)) - ((aVar2.f338092a - d11) * (aVar3.f338093b - d13))) / 2.0d;
    }

    public double b() {
        return c(this.f338146a, this.f338147b, this.f338148c);
    }

    public double d() {
        return e(this.f338146a, this.f338147b, this.f338148c);
    }

    public a f() {
        return g(this.f338146a, this.f338147b, this.f338148c);
    }

    public a h() {
        return i(this.f338146a, this.f338147b, this.f338148c);
    }

    public a k() {
        return l(this.f338146a, this.f338147b, this.f338148c);
    }

    public double m(a aVar) {
        if (aVar != null) {
            return n(aVar, this.f338146a, this.f338147b, this.f338148c);
        }
        throw new IllegalArgumentException("Supplied point is null.");
    }

    public boolean o() {
        return p(this.f338146a, this.f338147b, this.f338148c);
    }

    public double q() {
        return r(this.f338146a, this.f338147b, this.f338148c);
    }

    public double t() {
        return u(this.f338146a, this.f338147b, this.f338148c);
    }
}
