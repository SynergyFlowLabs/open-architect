package org.locationtech.jts.algorithm;

import org.locationtech.jts.geom.e0;

/* JADX INFO: loaded from: classes14.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.locationtech.jts.geom.n f338044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f338045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.u f338047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f338049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f338050g;

    public q(org.locationtech.jts.geom.n nVar) {
        this(nVar, false);
    }

    private static double a(double d10, double d11, org.locationtech.jts.geom.a aVar) {
        return (d10 * aVar.f338093b) - (d11 * aVar.f338092a);
    }

    private void b(org.locationtech.jts.geom.a[] aVarArr) {
        this.f338050g = Double.MAX_VALUE;
        org.locationtech.jts.geom.u uVar = new org.locationtech.jts.geom.u();
        int i10 = 0;
        int iF = 1;
        while (i10 < aVarArr.length - 1) {
            uVar.f338211a = aVarArr[i10];
            i10++;
            uVar.f338212b = aVarArr[i10];
            iF = f(aVarArr, uVar, iF);
        }
    }

    private void c() {
        if (this.f338048e != null) {
            return;
        }
        if (this.f338045b) {
            e(this.f338044a);
        } else {
            e(new h(this.f338044a).e());
        }
    }

    private static org.locationtech.jts.geom.u d(double d10, double d11, double d12) {
        org.locationtech.jts.geom.a aVar;
        org.locationtech.jts.geom.a aVar2;
        if (Math.abs(d11) > Math.abs(d10)) {
            double d13 = d12 / d11;
            aVar = new org.locationtech.jts.geom.a(0.0d, d13);
            aVar2 = new org.locationtech.jts.geom.a(1.0d, d13 - (d10 / d11));
        } else {
            double d14 = d12 / d10;
            aVar = new org.locationtech.jts.geom.a(d14, 0.0d);
            aVar2 = new org.locationtech.jts.geom.a(d14 - (d11 / d10), 1.0d);
        }
        return new org.locationtech.jts.geom.u(aVar, aVar2);
    }

    private void e(org.locationtech.jts.geom.n nVar) {
        if (nVar instanceof e0) {
            this.f338046c = ((e0) nVar).R0().d0();
        } else {
            this.f338046c = nVar.d0();
        }
        org.locationtech.jts.geom.a[] aVarArr = this.f338046c;
        if (aVarArr.length == 0) {
            this.f338050g = 0.0d;
            this.f338048e = null;
            this.f338047d = null;
            return;
        }
        if (aVarArr.length == 1) {
            this.f338050g = 0.0d;
            org.locationtech.jts.geom.a aVar = aVarArr[0];
            this.f338048e = aVar;
            org.locationtech.jts.geom.u uVar = this.f338047d;
            uVar.f338211a = aVar;
            uVar.f338212b = aVar;
            return;
        }
        if (aVarArr.length != 2 && aVarArr.length != 3) {
            b(aVarArr);
            return;
        }
        this.f338050g = 0.0d;
        org.locationtech.jts.geom.a aVar2 = aVarArr[0];
        this.f338048e = aVar2;
        org.locationtech.jts.geom.u uVar2 = this.f338047d;
        uVar2.f338211a = aVar2;
        uVar2.f338212b = aVarArr[1];
    }

    private int f(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.u uVar, int i10) {
        double dQ = uVar.q(aVarArr[i10]);
        int i11 = i10;
        double d10 = dQ;
        while (d10 >= dQ) {
            int iN = n(aVarArr, i10);
            double dQ2 = uVar.q(aVarArr[iN]);
            i11 = i10;
            i10 = iN;
            dQ = d10;
            d10 = dQ2;
        }
        if (dQ < this.f338050g) {
            this.f338049f = i11;
            this.f338050g = dQ;
            this.f338048e = aVarArr[i11];
            this.f338047d = new org.locationtech.jts.geom.u(uVar);
        }
        return i11;
    }

    public static org.locationtech.jts.geom.n i(org.locationtech.jts.geom.n nVar) {
        return new q(nVar).g();
    }

    public static org.locationtech.jts.geom.n k(org.locationtech.jts.geom.n nVar) {
        return new q(nVar).j();
    }

    private static int n(org.locationtech.jts.geom.a[] aVarArr, int i10) {
        int i11 = i10 + 1;
        if (i11 >= aVarArr.length) {
            return 0;
        }
        return i11;
    }

    public org.locationtech.jts.geom.v g() {
        c();
        org.locationtech.jts.geom.a aVar = this.f338048e;
        if (aVar == null) {
            return this.f338044a.g0().f();
        }
        return this.f338044a.g0().h(new org.locationtech.jts.geom.a[]{this.f338047d.U(aVar), this.f338048e});
    }

    public double h() {
        c();
        return this.f338050g;
    }

    public org.locationtech.jts.geom.n j() {
        c();
        if (this.f338050g == 0.0d) {
            org.locationtech.jts.geom.u uVar = this.f338047d;
            return uVar.f338211a.p(uVar.f338212b) ? this.f338044a.g0().v(this.f338047d.f338211a) : this.f338047d.c0(this.f338044a.g0());
        }
        org.locationtech.jts.geom.u uVar2 = this.f338047d;
        org.locationtech.jts.geom.a aVar = uVar2.f338212b;
        double d10 = aVar.f338092a;
        org.locationtech.jts.geom.a aVar2 = uVar2.f338211a;
        double d11 = d10 - aVar2.f338092a;
        double d12 = aVar.f338093b - aVar2.f338093b;
        double d13 = -1.7976931348623157E308d;
        int i10 = 0;
        double d14 = -1.7976931348623157E308d;
        double d15 = Double.MAX_VALUE;
        double d16 = Double.MAX_VALUE;
        while (true) {
            org.locationtech.jts.geom.a[] aVarArr = this.f338046c;
            if (i10 >= aVarArr.length) {
                double d17 = -d11;
                double d18 = -d12;
                org.locationtech.jts.geom.u uVarD = d(d17, d18, d14);
                org.locationtech.jts.geom.u uVarD2 = d(d17, d18, d15);
                org.locationtech.jts.geom.u uVarD3 = d(d18, d11, d13);
                org.locationtech.jts.geom.u uVarD4 = d(d18, d11, d16);
                org.locationtech.jts.geom.a aVarZ = uVarD3.z(uVarD);
                return this.f338044a.g0().A(this.f338044a.g0().k(new org.locationtech.jts.geom.a[]{aVarZ, uVarD4.z(uVarD), uVarD4.z(uVarD2), uVarD3.z(uVarD2), aVarZ}));
            }
            double dA = a(d11, d12, aVarArr[i10]);
            if (dA > d13) {
                d13 = dA;
            }
            if (dA < d16) {
                d16 = dA;
            }
            double dA2 = a(-d12, d11, this.f338046c[i10]);
            if (dA2 > d14) {
                d14 = dA2;
            }
            if (dA2 < d15) {
                d15 = dA2;
            }
            i10++;
        }
    }

    public org.locationtech.jts.geom.v l() {
        c();
        org.locationtech.jts.geom.r rVarG0 = this.f338044a.g0();
        org.locationtech.jts.geom.u uVar = this.f338047d;
        return rVarG0.h(new org.locationtech.jts.geom.a[]{uVar.f338211a, uVar.f338212b});
    }

    public org.locationtech.jts.geom.a m() {
        c();
        return this.f338048e;
    }

    public q(org.locationtech.jts.geom.n nVar, boolean z10) {
        this.f338046c = null;
        this.f338047d = new org.locationtech.jts.geom.u();
        this.f338048e = null;
        this.f338050g = 0.0d;
        this.f338044a = nVar;
        this.f338045b = z10;
    }
}
