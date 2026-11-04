package org.locationtech.jts.triangulate.quadedge;

import java.io.PrintStream;
import org.locationtech.jts.geom.j0;
import rm.o;

/* JADX INFO: loaded from: classes14.dex */
public class k {
    private static void a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        boolean zF = f(aVar, aVar2, aVar3, aVar4);
        boolean zE = e(aVar, aVar2, aVar3, aVar4);
        boolean zB = b(aVar, aVar2, aVar3, aVar4);
        org.locationtech.jts.geom.a aVarI = j0.i(aVar, aVar2, aVar3);
        System.out.println("p radius diff a = " + (Math.abs(aVar4.l(aVarI) - aVar.l(aVarI)) / aVar.l(aVarI)));
        if (zF == zE && zF == zB) {
            return;
        }
        System.out.println("inCircle robustness failure (double result = " + zF + ", DD result = " + zE + ", CC result = " + zB + ")");
        System.out.println(o.B(new org.locationtech.jts.geom.impl.a(new org.locationtech.jts.geom.a[]{aVar, aVar2, aVar3, aVar4})));
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Circumcentre = ");
        sb2.append(o.D(aVarI));
        sb2.append(" radius = ");
        sb2.append(aVar.l(aVarI));
        printStream.println(sb2.toString());
        System.out.println("p radius diff a = " + Math.abs((aVar4.l(aVarI) / aVar.l(aVarI)) - 1.0d));
        System.out.println("p radius diff b = " + Math.abs((aVar4.l(aVarI) / aVar2.l(aVarI)) - 1.0d));
        System.out.println("p radius diff c = " + Math.abs((aVar4.l(aVarI) / aVar3.l(aVarI)) - 1.0d));
        System.out.println();
    }

    public static boolean b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        org.locationtech.jts.geom.a aVarI = j0.i(aVar, aVar2, aVar3);
        return aVar4.l(aVarI) - aVar.l(aVarI) <= 0.0d;
    }

    public static boolean c(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        return tm.a.y0(aVar.f338092a).k0(tm.a.y0(aVar.f338093b)).q0(j(aVar2, aVar3, aVar4)).t0(tm.a.y0(aVar2.f338092a).k0(tm.a.y0(aVar2.f338093b)).q0(j(aVar, aVar3, aVar4))).k0(tm.a.y0(aVar3.f338092a).k0(tm.a.y0(aVar3.f338093b)).q0(j(aVar, aVar2, aVar4))).t0(tm.a.y0(aVar4.f338092a).k0(tm.a.y0(aVar4.f338093b)).q0(j(aVar, aVar2, aVar3))).t() > 0.0d;
    }

    public static boolean d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        tm.a aVarS0 = tm.a.H0(aVar.f338092a).s0(aVar4.f338092a);
        tm.a aVarS1 = tm.a.H0(aVar.f338093b).s0(aVar4.f338093b);
        tm.a aVarS2 = tm.a.H0(aVar2.f338092a).s0(aVar4.f338092a);
        tm.a aVarS3 = tm.a.H0(aVar2.f338093b).s0(aVar4.f338093b);
        tm.a aVarS4 = tm.a.H0(aVar3.f338092a).s0(aVar4.f338092a);
        tm.a aVarS5 = tm.a.H0(aVar3.f338093b).s0(aVar4.f338093b);
        tm.a aVarT0 = aVarS0.c0(aVarS3).t0(aVarS2.c0(aVarS1));
        return aVarS0.c0(aVarS0).k0(aVarS1.c0(aVarS1)).q0(aVarS2.c0(aVarS5).t0(aVarS4.c0(aVarS3))).k0(aVarS2.c0(aVarS2).k0(aVarS3.c0(aVarS3)).q0(aVarS4.c0(aVarS1).t0(aVarS0.c0(aVarS5)))).k0(aVarS4.c0(aVarS4).k0(aVarS5.c0(aVarS5)).q0(aVarT0)).t() > 0.0d;
    }

    public static boolean e(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        tm.a aVarH0 = tm.a.H0(aVar4.f338092a);
        tm.a aVarH1 = tm.a.H0(aVar4.f338093b);
        tm.a aVarH2 = tm.a.H0(aVar.f338092a);
        tm.a aVarH3 = tm.a.H0(aVar.f338093b);
        tm.a aVarH4 = tm.a.H0(aVar2.f338092a);
        tm.a aVarH5 = tm.a.H0(aVar2.f338093b);
        tm.a aVarH6 = tm.a.H0(aVar3.f338092a);
        tm.a aVarH7 = tm.a.H0(aVar3.f338093b);
        return aVarH2.c0(aVarH2).n(aVarH3.c0(aVarH3)).c0(k(aVarH4, aVarH5, aVarH6, aVarH7, aVarH0, aVarH1)).D0(aVarH4.c0(aVarH4).n(aVarH5.c0(aVarH5)).c0(k(aVarH2, aVarH3, aVarH6, aVarH7, aVarH0, aVarH1))).n(aVarH6.c0(aVarH6).n(aVarH7.c0(aVarH7)).c0(k(aVarH2, aVarH3, aVarH4, aVarH5, aVarH0, aVarH1))).D0(aVarH0.c0(aVarH0).n(aVarH1.c0(aVarH1)).c0(k(aVarH2, aVarH3, aVarH4, aVarH5, aVarH6, aVarH7))).t() > 0.0d;
    }

    public static boolean f(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        double d10 = aVar.f338092a;
        double d11 = aVar.f338093b;
        double dI = ((d10 * d10) + (d11 * d11)) * i(aVar2, aVar3, aVar4);
        double d12 = aVar2.f338092a;
        double d13 = aVar2.f338093b;
        double dI2 = dI - (((d12 * d12) + (d13 * d13)) * i(aVar, aVar3, aVar4));
        double d14 = aVar3.f338092a;
        double d15 = aVar3.f338093b;
        double dI3 = dI2 + (((d14 * d14) + (d15 * d15)) * i(aVar, aVar2, aVar4));
        double d16 = aVar4.f338092a;
        double d17 = aVar4.f338093b;
        return dI3 - (((d16 * d16) + (d17 * d17)) * i(aVar, aVar2, aVar3)) > 0.0d;
    }

    public static boolean g(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        double d10 = aVar.f338092a;
        double d11 = aVar4.f338092a;
        double d12 = d10 - d11;
        double d13 = aVar.f338093b;
        double d14 = aVar4.f338093b;
        double d15 = d13 - d14;
        double d16 = aVar2.f338092a - d11;
        double d17 = aVar2.f338093b - d14;
        double d18 = aVar3.f338092a - d11;
        double d19 = aVar3.f338093b - d14;
        return ((((d12 * d12) + (d15 * d15)) * ((d16 * d19) - (d18 * d17))) + (((d16 * d16) + (d17 * d17)) * ((d18 * d15) - (d12 * d19)))) + (((d18 * d18) + (d19 * d19)) * ((d12 * d17) - (d16 * d15))) > 0.0d;
    }

    public static boolean h(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        return g(aVar, aVar2, aVar3, aVar4);
    }

    private static double i(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        double d10 = aVar2.f338092a;
        double d11 = aVar.f338092a;
        double d12 = aVar3.f338093b;
        double d13 = aVar.f338093b;
        return ((d10 - d11) * (d12 - d13)) - ((aVar2.f338093b - d13) * (aVar3.f338092a - d11));
    }

    public static tm.a j(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        return tm.a.H0(aVar2.f338092a).s0(aVar.f338092a).q0(tm.a.H0(aVar3.f338093b).s0(aVar.f338093b)).t0(tm.a.H0(aVar2.f338093b).s0(aVar.f338093b).q0(tm.a.H0(aVar3.f338092a).s0(aVar.f338092a)));
    }

    public static tm.a k(tm.a aVar, tm.a aVar2, tm.a aVar3, tm.a aVar4, tm.a aVar5, tm.a aVar6) {
        return aVar3.D0(aVar).c0(aVar6.D0(aVar2)).D0(aVar4.D0(aVar2).c0(aVar5.D0(aVar)));
    }
}
