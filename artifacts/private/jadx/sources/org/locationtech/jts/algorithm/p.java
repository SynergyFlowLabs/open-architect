package org.locationtech.jts.algorithm;

import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.j0;

/* JADX INFO: loaded from: classes14.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.n f338040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338041b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338042c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f338043d = 0.0d;

    public p(org.locationtech.jts.geom.n nVar) {
        this.f338040a = nVar;
    }

    private void a() {
        if (this.f338041b == null) {
            c();
            b();
            org.locationtech.jts.geom.a aVar = this.f338042c;
            if (aVar != null) {
                this.f338043d = aVar.l(this.f338041b[0]);
            }
        }
    }

    private void b() {
        org.locationtech.jts.geom.a[] aVarArr = this.f338041b;
        int length = aVarArr.length;
        if (length == 0) {
            this.f338042c = null;
            return;
        }
        if (length == 1) {
            this.f338042c = aVarArr[0];
            return;
        }
        if (length != 2) {
            if (length != 3) {
                return;
            }
            this.f338042c = j0.i(aVarArr[0], aVarArr[1], aVarArr[2]);
        } else {
            org.locationtech.jts.geom.a aVar = aVarArr[0];
            double d10 = aVar.f338092a;
            org.locationtech.jts.geom.a aVar2 = aVarArr[1];
            this.f338042c = new org.locationtech.jts.geom.a((d10 + aVar2.f338092a) / 2.0d, (aVar.f338093b + aVar2.f338093b) / 2.0d);
        }
    }

    private void c() {
        if (this.f338040a.v0()) {
            this.f338041b = new org.locationtech.jts.geom.a[0];
            return;
        }
        if (this.f338040a.m0() == 1) {
            this.f338041b = new org.locationtech.jts.geom.a[]{new org.locationtech.jts.geom.a(this.f338040a.d0()[0])};
            return;
        }
        org.locationtech.jts.geom.a[] aVarArrD0 = this.f338040a.v().d0();
        if (aVarArrD0[0].p(aVarArrD0[aVarArrD0.length - 1])) {
            org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[aVarArrD0.length - 1];
            org.locationtech.jts.geom.b.d(aVarArrD0, 0, aVarArr, 0, aVarArrD0.length - 1);
            aVarArrD0 = aVarArr;
        }
        if (aVarArrD0.length <= 2) {
            this.f338041b = org.locationtech.jts.geom.b.e(aVarArrD0);
            return;
        }
        org.locationtech.jts.geom.a aVarJ = j(aVarArrD0);
        org.locationtech.jts.geom.a aVarK = k(aVarArrD0, aVarJ);
        for (int i10 = 0; i10 < aVarArrD0.length; i10++) {
            org.locationtech.jts.geom.a aVarL = l(aVarArrD0, aVarJ, aVarK);
            if (a.i(aVarJ, aVarL, aVarK)) {
                this.f338041b = new org.locationtech.jts.geom.a[]{new org.locationtech.jts.geom.a(aVarJ), new org.locationtech.jts.geom.a(aVarK)};
                return;
            }
            if (a.i(aVarL, aVarJ, aVarK)) {
                aVarJ = aVarL;
            } else {
                if (!a.i(aVarL, aVarK, aVarJ)) {
                    this.f338041b = new org.locationtech.jts.geom.a[]{new org.locationtech.jts.geom.a(aVarJ), new org.locationtech.jts.geom.a(aVarK), new org.locationtech.jts.geom.a(aVarL)};
                    return;
                }
                aVarK = aVarL;
            }
        }
        org.locationtech.jts.util.a.f("Logic failure in Minimum Bounding Circle algorithm!");
    }

    private static org.locationtech.jts.geom.a j(org.locationtech.jts.geom.a[] aVarArr) {
        org.locationtech.jts.geom.a aVar = aVarArr[0];
        for (int i10 = 1; i10 < aVarArr.length; i10++) {
            org.locationtech.jts.geom.a aVar2 = aVarArr[i10];
            if (aVar2.f338093b < aVar.f338093b) {
                aVar = aVar2;
            }
        }
        return aVar;
    }

    private static org.locationtech.jts.geom.a k(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.a aVar) {
        double d10 = Double.MAX_VALUE;
        org.locationtech.jts.geom.a aVar2 = null;
        for (org.locationtech.jts.geom.a aVar3 : aVarArr) {
            if (aVar3 != aVar) {
                double d11 = aVar3.f338092a - aVar.f338092a;
                double d12 = aVar3.f338093b - aVar.f338093b;
                if (d12 < 0.0d) {
                    d12 = -d12;
                }
                double dSqrt = d12 / Math.sqrt((d11 * d11) + (d12 * d12));
                if (dSqrt < d10) {
                    aVar2 = aVar3;
                    d10 = dSqrt;
                }
            }
        }
        return aVar2;
    }

    private static org.locationtech.jts.geom.a l(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        double d10 = Double.MAX_VALUE;
        org.locationtech.jts.geom.a aVar3 = null;
        for (org.locationtech.jts.geom.a aVar4 : aVarArr) {
            if (aVar4 != aVar && aVar4 != aVar2) {
                double dC = a.c(aVar, aVar4, aVar2);
                if (dC < d10) {
                    aVar3 = aVar4;
                    d10 = dC;
                }
            }
        }
        return aVar3;
    }

    public org.locationtech.jts.geom.a d() {
        a();
        return this.f338042c;
    }

    public org.locationtech.jts.geom.n e() {
        a();
        if (this.f338042c == null) {
            return this.f338040a.g0().y();
        }
        d0 d0VarV = this.f338040a.g0().v(this.f338042c);
        double d10 = this.f338043d;
        return d10 == 0.0d ? d0VarV : d0VarV.f(d10);
    }

    public org.locationtech.jts.geom.n f() {
        a();
        org.locationtech.jts.geom.a[] aVarArr = this.f338041b;
        int length = aVarArr.length;
        if (length == 0) {
            return this.f338040a.g0().f();
        }
        if (length == 1) {
            return this.f338040a.g0().v(this.f338042c);
        }
        int i10 = 5 & 0;
        return this.f338040a.g0().h(new org.locationtech.jts.geom.a[]{aVarArr[0], aVarArr[1]});
    }

    public org.locationtech.jts.geom.a[] g() {
        a();
        return this.f338041b;
    }

    public org.locationtech.jts.geom.n h() {
        a();
        org.locationtech.jts.geom.a[] aVarArr = this.f338041b;
        int length = aVarArr.length;
        if (length == 0) {
            return this.f338040a.g0().f();
        }
        if (length == 1) {
            return this.f338040a.g0().v(this.f338042c);
        }
        return this.f338040a.g0().h(new org.locationtech.jts.geom.a[]{aVarArr[0], aVarArr[aVarArr.length - 1]});
    }

    public double i() {
        a();
        return this.f338043d;
    }
}
