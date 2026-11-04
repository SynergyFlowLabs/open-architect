package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f337994a = 1.0E-15d;

    private f() {
    }

    public static org.locationtech.jts.geom.a a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        tm.a aVarD0 = tm.a.H0(aVar4.f338093b).s0(aVar3.f338093b).q0(tm.a.H0(aVar2.f338092a).s0(aVar.f338092a)).D0(tm.a.H0(aVar4.f338092a).s0(aVar3.f338092a).q0(tm.a.H0(aVar2.f338093b).s0(aVar.f338093b)));
        return new org.locationtech.jts.geom.a(tm.a.H0(aVar.f338092a).k0(tm.a.H0(aVar2.f338092a).s0(aVar.f338092a).o0(tm.a.H0(aVar4.f338092a).s0(aVar3.f338092a).q0(tm.a.H0(aVar.f338093b).s0(aVar3.f338093b)).D0(tm.a.H0(aVar4.f338093b).s0(aVar3.f338093b).q0(tm.a.H0(aVar.f338092a).s0(aVar3.f338092a))).n0(aVarD0).t())).t(), tm.a.H0(aVar3.f338093b).k0(tm.a.H0(aVar4.f338093b).s0(aVar3.f338093b).o0(tm.a.H0(aVar2.f338092a).s0(aVar.f338092a).q0(tm.a.H0(aVar.f338093b).s0(aVar3.f338093b)).D0(tm.a.H0(aVar2.f338093b).s0(aVar.f338093b).q0(tm.a.H0(aVar.f338092a).s0(aVar3.f338092a))).n0(aVarD0).t())).t());
    }

    public static int b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        int iC = c(aVar, aVar2, aVar3);
        if (iC <= 1) {
            return iC;
        }
        return tm.a.H0(aVar2.f338092a).i0(-aVar.f338092a).q0(tm.a.H0(aVar3.f338093b).i0(-aVar2.f338093b)).t0(tm.a.H0(aVar2.f338093b).i0(-aVar.f338093b).q0(tm.a.H0(aVar3.f338092a).i0(-aVar2.f338092a))).w0();
    }

    private static int c(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        double d10;
        double d11 = aVar.f338092a;
        double d12 = aVar3.f338092a;
        double d13 = aVar2.f338093b;
        double d14 = aVar3.f338093b;
        double d15 = (d11 - d12) * (d13 - d14);
        double d16 = (aVar.f338093b - d14) * (aVar2.f338092a - d12);
        double d17 = d15 - d16;
        if (d15 <= 0.0d) {
            if (d15 < 0.0d && d16 < 0.0d) {
                d10 = (-d15) - d16;
            }
            return f(d17);
        }
        if (d16 <= 0.0d) {
            return f(d17);
        }
        d10 = d15 + d16;
        double d18 = d10 * f337994a;
        if (d17 >= d18 || (-d17) >= d18) {
            return f(d17);
        }
        return 2;
    }

    public static int d(double d10, double d11, double d12, double d13) {
        return tm.a.H0(d10).c0(tm.a.H0(d13)).t0(tm.a.H0(d11).c0(tm.a.H0(d12))).w0();
    }

    public static int e(tm.a aVar, tm.a aVar2, tm.a aVar3, tm.a aVar4) {
        return aVar.c0(aVar4).t0(aVar2.c0(aVar3)).w0();
    }

    private static int f(double d10) {
        if (d10 > 0.0d) {
            return 1;
        }
        return d10 < 0.0d ? -1 : 0;
    }
}
