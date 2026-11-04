package org.locationtech.jts.util;

import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected r f339138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected g0 f339139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected a f339140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f339141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected double f339142e;

    protected static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public org.locationtech.jts.geom.a f339143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public org.locationtech.jts.geom.a f339144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f339145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f339146d;

        protected a() {
        }

        public org.locationtech.jts.geom.a a() {
            return this.f339143a;
        }

        public org.locationtech.jts.geom.a b() {
            if (this.f339144b == null) {
                org.locationtech.jts.geom.a aVar = this.f339143a;
                this.f339144b = new org.locationtech.jts.geom.a(aVar.f338092a + (this.f339145c / 2.0d), aVar.f338093b + (this.f339146d / 2.0d));
            }
            return this.f339144b;
        }

        public org.locationtech.jts.geom.m c() {
            org.locationtech.jts.geom.a aVar = this.f339143a;
            if (aVar != null) {
                double d10 = aVar.f338092a;
                double d11 = this.f339145c + d10;
                double d12 = aVar.f338093b;
                return new org.locationtech.jts.geom.m(d10, d11, d12, this.f339146d + d12);
            }
            org.locationtech.jts.geom.a aVar2 = this.f339144b;
            if (aVar2 == null) {
                return new org.locationtech.jts.geom.m(0.0d, this.f339145c, 0.0d, this.f339146d);
            }
            double d13 = aVar2.f338092a;
            double d14 = this.f339145c;
            double d15 = d13 - (d14 / 2.0d);
            double d16 = (d14 / 2.0d) + d13;
            double d17 = aVar2.f338093b;
            double d18 = this.f339146d;
            return new org.locationtech.jts.geom.m(d15, d16, d17 - (d18 / 2.0d), d17 + (d18 / 2.0d));
        }

        public double d() {
            return this.f339146d;
        }

        public double e() {
            return Math.min(this.f339145c, this.f339146d);
        }

        public double f() {
            return this.f339145c;
        }

        public void g(org.locationtech.jts.geom.a aVar) {
            this.f339143a = aVar;
        }

        public void h(org.locationtech.jts.geom.a aVar) {
            this.f339144b = aVar;
        }

        public void i(org.locationtech.jts.geom.m mVar) {
            this.f339145c = mVar.N();
            this.f339146d = mVar.E();
            this.f339143a = new org.locationtech.jts.geom.a(mVar.L(), mVar.M());
            this.f339144b = new org.locationtech.jts.geom.a(mVar.k());
        }

        public void j(double d10) {
            this.f339146d = d10;
        }

        public void k(double d10) {
            this.f339146d = d10;
            this.f339145c = d10;
        }

        public void l(double d10) {
            this.f339145c = d10;
        }
    }

    public g() {
        this(new r());
    }

    protected org.locationtech.jts.geom.a a(double d10, double d11) {
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a(d10, d11);
        this.f339139b.s(aVar);
        return aVar;
    }

    protected org.locationtech.jts.geom.a b(double d10, double d11, org.locationtech.jts.geom.a aVar) {
        return a(d10 + aVar.f338092a, d11 + aVar.f338093b);
    }

    public v c(double d10, double d11) {
        org.locationtech.jts.geom.m mVarC = this.f339140c.c();
        double dN = mVarC.N() / 2.0d;
        double dE = mVarC.E() / 2.0d;
        double dL = mVarC.L() + dN;
        double dM = mVarC.M() + dE;
        double d12 = 6.283185307179586d;
        if (d11 > 0.0d && d11 <= 6.283185307179586d) {
            d12 = d11;
        }
        int i10 = this.f339141d;
        double d13 = d12 / ((double) (i10 - 1));
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.f339141d) {
            double d14 = d10 + (((double) i11) * d13);
            aVarArr[i12] = a((Math.cos(d14) * dN) + dL, (Math.sin(d14) * dE) + dM);
            i11++;
            i12++;
            dN = dN;
        }
        return (v) j(this.f339138a.h(aVarArr));
    }

    public e0 d(double d10, double d11) {
        org.locationtech.jts.geom.m mVarC = this.f339140c.c();
        double dN = mVarC.N() / 2.0d;
        double dE = mVarC.E() / 2.0d;
        double dL = mVarC.L() + dN;
        double dM = mVarC.M() + dE;
        double d12 = 6.283185307179586d;
        if (d11 > 0.0d && d11 <= 6.283185307179586d) {
            d12 = d11;
        }
        int i10 = this.f339141d;
        double d13 = d12 / ((double) (i10 - 1));
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[i10 + 2];
        int i11 = 0;
        aVarArr[0] = a(dL, dM);
        int i12 = 1;
        while (i11 < this.f339141d) {
            double d14 = d10 + (((double) i11) * d13);
            aVarArr[i12] = a((Math.cos(d14) * dN) + dL, (Math.sin(d14) * dE) + dM);
            i11++;
            i12++;
            dN = dN;
        }
        aVarArr[i12] = a(dL, dM);
        return (e0) j(this.f339138a.A(this.f339138a.k(aVarArr)));
    }

    public e0 e() {
        return f();
    }

    public e0 f() {
        org.locationtech.jts.geom.m mVarC = this.f339140c.c();
        double dN = mVarC.N() / 2.0d;
        double dE = mVarC.E() / 2.0d;
        double dL = mVarC.L() + dN;
        double dM = mVarC.M() + dE;
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[this.f339141d + 1];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.f339141d;
            if (i10 >= i12) {
                aVarArr[i11] = new org.locationtech.jts.geom.a(aVarArr[0]);
                return (e0) j(this.f339138a.A(this.f339138a.k(aVarArr)));
            }
            double d10 = ((double) i10) * (6.283185307179586d / ((double) i12));
            aVarArr[i11] = a((Math.cos(d10) * dN) + dL, (Math.sin(d10) * dE) + dM);
            i10++;
            i11++;
        }
    }

    public e0 g() {
        int i10 = this.f339141d / 4;
        if (i10 < 1) {
            i10 = 1;
        }
        double d10 = i10;
        double dN = this.f339140c.c().N() / d10;
        double dE = this.f339140c.c().E() / d10;
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[(i10 * 4) + 1];
        org.locationtech.jts.geom.m mVarC = this.f339140c.c();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            aVarArr[i12] = a(mVarC.L() + (((double) i11) * dN), mVarC.M());
            i11++;
            i12++;
        }
        int i13 = 0;
        while (i13 < i10) {
            double d11 = dE;
            aVarArr[i12] = a(mVarC.H(), mVarC.M() + (((double) i13) * d11));
            i13++;
            i12++;
            dE = d11;
        }
        double d12 = dE;
        int i14 = 0;
        while (i14 < i10) {
            aVarArr[i12] = a(mVarC.H() - (((double) i14) * dN), mVarC.I());
            i14++;
            i12++;
        }
        int i15 = 0;
        while (i15 < i10) {
            aVarArr[i12] = a(mVarC.L(), mVarC.I() - (((double) i15) * d12));
            i15++;
            i12++;
        }
        aVarArr[i12] = new org.locationtech.jts.geom.a(aVarArr[0]);
        return (e0) j(this.f339138a.A(this.f339138a.k(aVarArr)));
    }

    public e0 h() {
        return i(4.0d);
    }

    public e0 i(double d10) {
        double d11;
        int i10;
        double dPow;
        double d12 = d10;
        double d13 = 1.0d / d12;
        double dE = this.f339140c.e() / 2.0d;
        org.locationtech.jts.geom.a aVarB = this.f339140c.b();
        double dPow2 = Math.pow(dE, d12);
        double dPow3 = Math.pow(dPow2 / 2.0d, d13);
        int i11 = this.f339141d / 8;
        int i12 = i11 * 8;
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[i12 + 1];
        double d14 = dPow3 / ((double) i11);
        int i13 = 0;
        while (i13 <= i11) {
            if (i13 != 0) {
                double d15 = ((double) i13) * d14;
                i10 = i13;
                dPow = Math.pow(dPow2 - Math.pow(d15, d12), d13);
                d11 = d15;
            } else {
                d11 = 0.0d;
                i10 = i13;
                dPow = dE;
            }
            org.locationtech.jts.geom.a aVarB2 = b(d11, dPow, aVarB);
            double d16 = dPow;
            double d17 = d11;
            aVarArr[i10] = aVarB2;
            int i14 = i11 * 2;
            aVarArr[i14 - i10] = b(d16, d17, aVarB);
            double d18 = -d17;
            aVarArr[i14 + i10] = b(d16, d18, aVarB);
            int i15 = i11 * 4;
            double d19 = -d16;
            aVarArr[i15 - i10] = b(d17, d19, aVarB);
            aVarArr[i15 + i10] = b(d18, d19, aVarB);
            int i16 = i11 * 6;
            aVarArr[i16 - i10] = b(d19, d18, aVarB);
            aVarArr[i16 + i10] = b(d19, d17, aVarB);
            aVarArr[i12 - i10] = b(d18, d16, aVarB);
            i13 = i10 + 1;
            aVarArr = aVarArr;
            d12 = d10;
        }
        org.locationtech.jts.geom.a[] aVarArr2 = aVarArr;
        aVarArr2[i12] = new org.locationtech.jts.geom.a(aVarArr2[0]);
        return (e0) j(this.f339138a.A(this.f339138a.k(aVarArr2)));
    }

    protected org.locationtech.jts.geom.n j(org.locationtech.jts.geom.n nVar) {
        double d10 = this.f339142e;
        if (d10 != 0.0d) {
            nVar.c(org.locationtech.jts.geom.util.a.t(d10, this.f339140c.b().f338092a, this.f339140c.b().f338093b));
        }
        return nVar;
    }

    public void k(org.locationtech.jts.geom.a aVar) {
        this.f339140c.g(aVar);
    }

    public void l(org.locationtech.jts.geom.a aVar) {
        this.f339140c.h(aVar);
    }

    public void m(org.locationtech.jts.geom.m mVar) {
        this.f339140c.i(mVar);
    }

    public void n(double d10) {
        this.f339140c.j(d10);
    }

    public void o(int i10) {
        this.f339141d = i10;
    }

    public void p(double d10) {
        this.f339142e = d10;
    }

    public void q(double d10) {
        this.f339140c.k(d10);
    }

    public void r(double d10) {
        this.f339140c.l(d10);
    }

    public g(r rVar) {
        this.f339139b = null;
        this.f339140c = new a();
        this.f339141d = 100;
        this.f339142e = 0.0d;
        this.f339138a = rVar;
        this.f339139b = rVar.F();
    }
}
