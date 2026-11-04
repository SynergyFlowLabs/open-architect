package org.locationtech.jts.operation.buffer;

import org.locationtech.jts.geom.g0;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f338715a = 0.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g0 f338716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f338717c;

    public f(g0 g0Var, d dVar) {
        this.f338716b = g0Var;
        this.f338717c = dVar;
    }

    private void a(org.locationtech.jts.geom.a[] aVarArr, h hVar) {
        double dL = l(this.f338715a);
        org.locationtech.jts.geom.a[] aVarArrJ = b.j(aVarArr, dL);
        int length = aVarArrJ.length;
        int i10 = length - 1;
        hVar.u(aVarArrJ[0], aVarArrJ[1], 1);
        for (int i11 = 2; i11 <= i10; i11++) {
            hVar.k(aVarArrJ[i11], true);
        }
        hVar.g();
        hVar.i(aVarArrJ[length - 2], aVarArrJ[i10]);
        org.locationtech.jts.geom.a[] aVarArrJ2 = b.j(aVarArr, -dL);
        int length2 = aVarArrJ2.length;
        hVar.u(aVarArrJ2[length2 - 1], aVarArrJ2[length2 - 2], 1);
        for (int i12 = length2 - 3; i12 >= 0; i12--) {
            hVar.k(aVarArrJ2[i12], true);
        }
        hVar.g();
        hVar.i(aVarArrJ2[1], aVarArrJ2[0]);
        hVar.n();
    }

    private void b(org.locationtech.jts.geom.a[] aVarArr, boolean z10, h hVar) {
        double dL = l(this.f338715a);
        if (z10) {
            org.locationtech.jts.geom.a[] aVarArrJ = b.j(aVarArr, -dL);
            int length = aVarArrJ.length;
            hVar.u(aVarArrJ[length - 1], aVarArrJ[length - 2], 1);
            hVar.e();
            for (int i10 = length - 3; i10 >= 0; i10--) {
                hVar.k(aVarArrJ[i10], true);
            }
        } else {
            org.locationtech.jts.geom.a[] aVarArrJ2 = b.j(aVarArr, dL);
            int length2 = aVarArrJ2.length - 1;
            hVar.u(aVarArrJ2[0], aVarArrJ2[1], 1);
            hVar.e();
            for (int i11 = 2; i11 <= length2; i11++) {
                hVar.k(aVarArrJ2[i11], true);
            }
        }
        hVar.g();
    }

    private void c(org.locationtech.jts.geom.a aVar, h hVar) {
        int iB = this.f338717c.b();
        if (iB == 1) {
            hVar.p(aVar);
        } else {
            if (iB != 3) {
                return;
            }
            hVar.q(aVar);
        }
    }

    private void d(org.locationtech.jts.geom.a[] aVarArr, int i10, h hVar) {
        double dL = l(this.f338715a);
        if (i10 == 2) {
            dL = -dL;
        }
        org.locationtech.jts.geom.a[] aVarArrJ = b.j(aVarArr, dL);
        int length = aVarArrJ.length;
        int i11 = length - 1;
        hVar.u(aVarArrJ[length - 2], aVarArrJ[0], i10);
        int i12 = 1;
        while (i12 <= i11) {
            hVar.k(aVarArrJ[i12], i12 != 1);
            i12++;
        }
        hVar.n();
    }

    private void e(org.locationtech.jts.geom.a[] aVarArr, boolean z10, h hVar) {
        double dL = l(this.f338715a);
        if (z10) {
            hVar.m(aVarArr, true);
            org.locationtech.jts.geom.a[] aVarArrJ = b.j(aVarArr, -dL);
            int length = aVarArrJ.length;
            hVar.u(aVarArrJ[length - 1], aVarArrJ[length - 2], 1);
            hVar.e();
            for (int i10 = length - 3; i10 >= 0; i10--) {
                hVar.k(aVarArrJ[i10], true);
            }
        } else {
            hVar.m(aVarArr, false);
            org.locationtech.jts.geom.a[] aVarArrJ2 = b.j(aVarArr, dL);
            int length2 = aVarArrJ2.length - 1;
            hVar.u(aVarArrJ2[0], aVarArrJ2[1], 1);
            hVar.e();
            for (int i11 = 2; i11 <= length2; i11++) {
                hVar.k(aVarArrJ2[i11], true);
            }
        }
        hVar.g();
        hVar.n();
    }

    private static org.locationtech.jts.geom.a[] f(org.locationtech.jts.geom.a[] aVarArr) {
        int length = aVarArr.length;
        org.locationtech.jts.geom.a[] aVarArr2 = new org.locationtech.jts.geom.a[length];
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr2[i10] = new org.locationtech.jts.geom.a(aVarArr[i10]);
        }
        return aVarArr2;
    }

    private h k(double d10) {
        return new h(this.f338716b, this.f338717c, d10);
    }

    private double l(double d10) {
        return d10 * this.f338717c.f();
    }

    public d g() {
        return this.f338717c;
    }

    public org.locationtech.jts.geom.a[] h(org.locationtech.jts.geom.a[] aVarArr, double d10) {
        this.f338715a = d10;
        if ((d10 < 0.0d && !this.f338717c.g()) || d10 == 0.0d) {
            return null;
        }
        h hVarK = k(Math.abs(d10));
        if (aVarArr.length <= 1) {
            c(aVarArr[0], hVarK);
        } else if (this.f338717c.g()) {
            e(aVarArr, d10 < 0.0d, hVarK);
        } else {
            a(aVarArr, hVarK);
        }
        return hVarK.r();
    }

    public org.locationtech.jts.geom.a[] i(org.locationtech.jts.geom.a[] aVarArr, double d10) {
        this.f338715a = d10;
        if (d10 == 0.0d) {
            return null;
        }
        boolean z10 = d10 < 0.0d;
        h hVarK = k(Math.abs(d10));
        if (aVarArr.length <= 1) {
            c(aVarArr[0], hVarK);
        } else {
            b(aVarArr, z10, hVarK);
        }
        org.locationtech.jts.geom.a[] aVarArrR = hVarK.r();
        if (z10) {
            org.locationtech.jts.geom.b.t(aVarArrR);
        }
        return aVarArrR;
    }

    public org.locationtech.jts.geom.a[] j(org.locationtech.jts.geom.a[] aVarArr, int i10, double d10) {
        this.f338715a = d10;
        if (aVarArr.length <= 2) {
            return h(aVarArr, d10);
        }
        if (d10 == 0.0d) {
            return f(aVarArr);
        }
        h hVarK = k(d10);
        d(aVarArr, i10, hVarK);
        return hVarK.r();
    }
}
