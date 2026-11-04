package org.locationtech.jts.algorithm;

import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;

/* JADX INFO: loaded from: classes14.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a f337995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.a f337996b = new org.locationtech.jts.geom.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f337997c = 0.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.a f337998d = new org.locationtech.jts.geom.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.a f337999e = new org.locationtech.jts.geom.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f338000f = 0.0d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f338001g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338002h = new org.locationtech.jts.geom.a();

    public g(org.locationtech.jts.geom.n nVar) {
        this.f337995a = null;
        this.f337995a = null;
        a(nVar);
    }

    private void a(org.locationtech.jts.geom.n nVar) {
        if (nVar.v0()) {
            return;
        }
        if (nVar instanceof d0) {
            e(nVar.c0());
            return;
        }
        if (nVar instanceof org.locationtech.jts.geom.v) {
            d(nVar.d0());
            return;
        }
        if (nVar instanceof e0) {
            b((e0) nVar);
            return;
        }
        if (nVar instanceof org.locationtech.jts.geom.o) {
            org.locationtech.jts.geom.o oVar = (org.locationtech.jts.geom.o) nVar;
            for (int i10 = 0; i10 < oVar.l0(); i10++) {
                a(oVar.h0(i10));
            }
        }
    }

    private void b(e0 e0Var) {
        f(e0Var.R0().d0());
        for (int i10 = 0; i10 < e0Var.T0(); i10++) {
            c(e0Var.S0(i10).d0());
        }
    }

    private void c(org.locationtech.jts.geom.a[] aVarArr) {
        boolean zB = s.b(aVarArr);
        int i10 = 0;
        while (i10 < aVarArr.length - 1) {
            org.locationtech.jts.geom.a aVar = this.f337995a;
            org.locationtech.jts.geom.a aVar2 = aVarArr[i10];
            i10++;
            g(aVar, aVar2, aVarArr[i10], zB);
        }
        d(aVarArr);
    }

    private void d(org.locationtech.jts.geom.a[] aVarArr) {
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i10 = 0;
        while (i10 < aVarArr.length - 1) {
            int i11 = i10 + 1;
            double dL = aVarArr[i10].l(aVarArr[i11]);
            if (dL != d10) {
                d11 += dL;
                org.locationtech.jts.geom.a aVar = aVarArr[i10];
                double d12 = aVar.f338092a;
                org.locationtech.jts.geom.a aVar2 = aVarArr[i11];
                double d13 = (d12 + aVar2.f338092a) / 2.0d;
                org.locationtech.jts.geom.a aVar3 = this.f337999e;
                aVar3.f338092a += d13 * dL;
                aVar3.f338093b += dL * ((aVar.f338093b + aVar2.f338093b) / 2.0d);
            }
            i10 = i11;
            d10 = d10;
        }
        double d14 = d10;
        this.f338000f += d11;
        if (d11 != d14 || aVarArr.length <= 0) {
            return;
        }
        e(aVarArr[0]);
    }

    private void e(org.locationtech.jts.geom.a aVar) {
        this.f338001g++;
        org.locationtech.jts.geom.a aVar2 = this.f338002h;
        aVar2.f338092a += aVar.f338092a;
        aVar2.f338093b += aVar.f338093b;
    }

    private void f(org.locationtech.jts.geom.a[] aVarArr) {
        int i10 = 0;
        if (aVarArr.length > 0) {
            l(aVarArr[0]);
        }
        boolean z10 = !s.b(aVarArr);
        while (i10 < aVarArr.length - 1) {
            org.locationtech.jts.geom.a aVar = this.f337995a;
            org.locationtech.jts.geom.a aVar2 = aVarArr[i10];
            i10++;
            g(aVar, aVar2, aVarArr[i10], z10);
        }
        d(aVarArr);
    }

    private void g(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, boolean z10) {
        double d10 = z10 ? 1.0d : -1.0d;
        i(aVar, aVar2, aVar3, this.f337996b);
        double dH = h(aVar, aVar2, aVar3);
        org.locationtech.jts.geom.a aVar4 = this.f337998d;
        double d11 = aVar4.f338092a;
        double d12 = d10 * dH;
        org.locationtech.jts.geom.a aVar5 = this.f337996b;
        aVar4.f338092a = d11 + (aVar5.f338092a * d12);
        aVar4.f338093b += aVar5.f338093b * d12;
        this.f337997c += d12;
    }

    private static double h(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3) {
        double d10 = aVar2.f338092a;
        double d11 = aVar.f338092a;
        double d12 = aVar3.f338093b;
        double d13 = aVar.f338093b;
        return ((d10 - d11) * (d12 - d13)) - ((aVar3.f338092a - d11) * (aVar2.f338093b - d13));
    }

    private static void i(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        aVar4.f338092a = aVar.f338092a + aVar2.f338092a + aVar3.f338092a;
        aVar4.f338093b = aVar.f338093b + aVar2.f338093b + aVar3.f338093b;
    }

    public static org.locationtech.jts.geom.a k(org.locationtech.jts.geom.n nVar) {
        return new g(nVar).j();
    }

    private void l(org.locationtech.jts.geom.a aVar) {
        this.f337995a = aVar;
    }

    public org.locationtech.jts.geom.a j() {
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a();
        if (Math.abs(this.f337997c) > 0.0d) {
            org.locationtech.jts.geom.a aVar2 = this.f337998d;
            double d10 = aVar2.f338092a / 3.0d;
            double d11 = this.f337997c;
            aVar.f338092a = d10 / d11;
            aVar.f338093b = (aVar2.f338093b / 3.0d) / d11;
            return aVar;
        }
        double d12 = this.f338000f;
        if (d12 > 0.0d) {
            org.locationtech.jts.geom.a aVar3 = this.f337999e;
            aVar.f338092a = aVar3.f338092a / d12;
            aVar.f338093b = aVar3.f338093b / d12;
            return aVar;
        }
        int i10 = this.f338001g;
        if (i10 <= 0) {
            return null;
        }
        org.locationtech.jts.geom.a aVar4 = this.f338002h;
        aVar.f338092a = aVar4.f338092a / ((double) i10);
        aVar.f338093b = aVar4.f338093b / ((double) i10);
        return aVar;
    }
}
