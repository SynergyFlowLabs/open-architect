package com.google.vr.sdk.base.sensors.internal;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f127628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f127629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f127630c;

    public d() {
    }

    public static void a(d dVar, d dVar2, d dVar3) {
        dVar3.k(dVar.f127628a + dVar2.f127628a, dVar.f127629b + dVar2.f127629b, dVar.f127630c + dVar2.f127630c);
    }

    public static void b(d dVar, d dVar2, d dVar3) {
        double d10 = dVar.f127629b;
        double d11 = dVar2.f127630c;
        double d12 = dVar.f127630c;
        double d13 = dVar2.f127629b;
        double d14 = dVar2.f127628a;
        double d15 = dVar.f127628a;
        dVar3.k((d10 * d11) - (d12 * d13), (d12 * d14) - (d11 * d15), (d15 * d13) - (d10 * d14));
    }

    public static double c(d dVar, d dVar2) {
        return (dVar.f127628a * dVar2.f127628a) + (dVar.f127629b * dVar2.f127629b) + (dVar.f127630c * dVar2.f127630c);
    }

    public static int d(d dVar) {
        double dAbs = Math.abs(dVar.f127628a);
        double dAbs2 = Math.abs(dVar.f127629b);
        double dAbs3 = Math.abs(dVar.f127630c);
        if (dAbs > dAbs2) {
            return dAbs > dAbs3 ? 0 : 2;
        }
        return dAbs2 > dAbs3 ? 1 : 2;
    }

    public static void h(d dVar, d dVar2) {
        int iD = d(dVar) - 1;
        if (iD < 0) {
            iD = 2;
        }
        dVar2.n();
        dVar2.m(iD, 1.0d);
        b(dVar, dVar2, dVar2);
        dVar2.g();
    }

    public static void o(d dVar, d dVar2, d dVar3) {
        dVar3.k(dVar.f127628a - dVar2.f127628a, dVar.f127629b - dVar2.f127629b, dVar.f127630c - dVar2.f127630c);
    }

    public double e() {
        double d10 = this.f127628a;
        double d11 = this.f127629b;
        double d12 = (d10 * d10) + (d11 * d11);
        double d13 = this.f127630c;
        return Math.sqrt(d12 + (d13 * d13));
    }

    public double f() {
        return Math.max(Math.abs(this.f127628a), Math.max(Math.abs(this.f127629b), Math.abs(this.f127630c)));
    }

    public void g() {
        double dE = e();
        if (dE != 0.0d) {
            j(1.0d / dE);
        }
    }

    public boolean i(d dVar) {
        return this.f127628a == dVar.f127628a && this.f127629b == dVar.f127629b && this.f127630c == dVar.f127630c;
    }

    public void j(double d10) {
        this.f127628a *= d10;
        this.f127629b *= d10;
        this.f127630c *= d10;
    }

    public void k(double d10, double d11, double d12) {
        this.f127628a = d10;
        this.f127629b = d11;
        this.f127630c = d12;
    }

    public void l(d dVar) {
        this.f127628a = dVar.f127628a;
        this.f127629b = dVar.f127629b;
        this.f127630c = dVar.f127630c;
    }

    public void m(int i10, double d10) {
        if (i10 == 0) {
            this.f127628a = d10;
        } else if (i10 == 1) {
            this.f127629b = d10;
        } else {
            this.f127630c = d10;
        }
    }

    public void n() {
        this.f127630c = 0.0d;
        this.f127629b = 0.0d;
        this.f127628a = 0.0d;
    }

    public String toString() {
        return String.format("%+05f %+05f %+05f", Double.valueOf(this.f127628a), Double.valueOf(this.f127629b), Double.valueOf(this.f127630c));
    }

    public d(double d10, double d11, double d12) {
        k(d10, d11, d12);
    }
}
