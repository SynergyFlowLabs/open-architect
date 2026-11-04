package org.locationtech.jts.geom;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class m implements Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f338163e = 5873921885273102420L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f338164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f338166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f338167d;

    public m() {
        O();
    }

    public static boolean Z(a aVar, a aVar2, a aVar3) {
        double d10 = aVar3.f338092a;
        double d11 = aVar.f338092a;
        double d12 = aVar2.f338092a;
        if (d10 < (d11 < d12 ? d11 : d12)) {
            return false;
        }
        if (d11 <= d12) {
            d11 = d12;
        }
        if (d10 > d11) {
            return false;
        }
        double d13 = aVar3.f338093b;
        double d14 = aVar.f338093b;
        double d15 = aVar2.f338093b;
        if (d13 < (d14 < d15 ? d14 : d15)) {
            return false;
        }
        if (d14 <= d15) {
            d14 = d15;
        }
        return d13 <= d14;
    }

    public static boolean a0(a aVar, a aVar2, a aVar3, a aVar4) {
        double dMin = Math.min(aVar3.f338092a, aVar4.f338092a);
        double dMax = Math.max(aVar3.f338092a, aVar4.f338092a);
        double dMin2 = Math.min(aVar.f338092a, aVar2.f338092a);
        double dMax2 = Math.max(aVar.f338092a, aVar2.f338092a);
        if (dMin2 > dMax || dMax2 < dMin) {
            return false;
        }
        double dMin3 = Math.min(aVar3.f338093b, aVar4.f338093b);
        return Math.min(aVar.f338093b, aVar2.f338093b) <= Math.max(aVar3.f338093b, aVar4.f338093b) && Math.max(aVar.f338093b, aVar2.f338093b) >= dMin3;
    }

    public double D() {
        return N() * E();
    }

    public double E() {
        if (d0()) {
            return 0.0d;
        }
        return this.f338167d - this.f338166c;
    }

    public double H() {
        return this.f338165b;
    }

    public double I() {
        return this.f338167d;
    }

    public double L() {
        return this.f338164a;
    }

    public double M() {
        return this.f338166c;
    }

    public double N() {
        if (d0()) {
            return 0.0d;
        }
        return this.f338165b - this.f338164a;
    }

    public void O() {
        j0();
    }

    public void R(double d10, double d11, double d12, double d13) {
        if (d10 < d11) {
            this.f338164a = d10;
            this.f338165b = d11;
        } else {
            this.f338164a = d11;
            this.f338165b = d10;
        }
        if (d12 < d13) {
            this.f338166c = d12;
            this.f338167d = d13;
        } else {
            this.f338166c = d13;
            this.f338167d = d12;
        }
    }

    public void S(a aVar) {
        double d10 = aVar.f338092a;
        double d11 = aVar.f338093b;
        R(d10, d10, d11, d11);
    }

    public void T(a aVar, a aVar2) {
        R(aVar.f338092a, aVar2.f338092a, aVar.f338093b, aVar2.f338093b);
    }

    public void U(m mVar) {
        this.f338164a = mVar.f338164a;
        this.f338165b = mVar.f338165b;
        this.f338166c = mVar.f338166c;
        this.f338167d = mVar.f338167d;
    }

    public m V(m mVar) {
        if (d0() || mVar.d0() || !c0(mVar)) {
            return new m();
        }
        double d10 = this.f338164a;
        double d11 = mVar.f338164a;
        double d12 = d10 > d11 ? d10 : d11;
        double d13 = this.f338166c;
        double d14 = mVar.f338166c;
        double d15 = d13 > d14 ? d13 : d14;
        double d16 = this.f338165b;
        double d17 = mVar.f338165b;
        double d18 = d16 < d17 ? d16 : d17;
        double d19 = this.f338167d;
        double d20 = mVar.f338167d;
        return new m(d12, d18, d15, d19 < d20 ? d19 : d20);
    }

    public boolean W(double d10, double d11) {
        return !d0() && d10 <= this.f338165b && d10 >= this.f338164a && d11 <= this.f338167d && d11 >= this.f338166c;
    }

    public boolean X(a aVar) {
        return W(aVar.f338092a, aVar.f338093b);
    }

    public boolean Y(a aVar, a aVar2) {
        if (d0()) {
            return false;
        }
        double d10 = aVar.f338092a;
        double d11 = aVar2.f338092a;
        if ((d10 < d11 ? d10 : d11) > this.f338165b) {
            return false;
        }
        if (d10 <= d11) {
            d10 = d11;
        }
        if (d10 < this.f338164a) {
            return false;
        }
        double d12 = aVar.f338093b;
        double d13 = aVar2.f338093b;
        if ((d12 < d13 ? d12 : d13) > this.f338167d) {
            return false;
        }
        if (d12 <= d13) {
            d12 = d13;
        }
        return d12 >= this.f338166c;
    }

    public boolean c0(m mVar) {
        return !d0() && !mVar.d0() && mVar.f338164a <= this.f338165b && mVar.f338165b >= this.f338164a && mVar.f338166c <= this.f338167d && mVar.f338167d >= this.f338166c;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        m mVar = (m) obj;
        if (d0()) {
            return mVar.d0() ? 0 : -1;
        }
        if (mVar.d0()) {
            return 1;
        }
        double d10 = this.f338164a;
        double d11 = mVar.f338164a;
        if (d10 < d11) {
            return -1;
        }
        if (d10 > d11) {
            return 1;
        }
        double d12 = this.f338166c;
        double d13 = mVar.f338166c;
        if (d12 < d13) {
            return -1;
        }
        if (d12 > d13) {
            return 1;
        }
        double d14 = this.f338165b;
        double d15 = mVar.f338165b;
        if (d14 < d15) {
            return -1;
        }
        if (d14 > d15) {
            return 1;
        }
        double d16 = this.f338167d;
        double d17 = mVar.f338167d;
        if (d16 < d17) {
            return -1;
        }
        return d16 > d17 ? 1 : 0;
    }

    public boolean d0() {
        return this.f338165b < this.f338164a;
    }

    public double e0() {
        if (d0()) {
            return 0.0d;
        }
        double dN = N();
        double dE = E();
        return dN > dE ? dN : dE;
    }

    public boolean equals(Object obj) {
        int i10 = 0 >> 0;
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (d0()) {
            return mVar.d0();
        }
        if (this.f338165b != mVar.H() || this.f338167d != mVar.I() || this.f338164a != mVar.L() || this.f338166c != mVar.M()) {
            return false;
        }
        int i11 = 2 & 1;
        return true;
    }

    public double f0() {
        if (d0()) {
            return 0.0d;
        }
        double dN = N();
        double dE = E();
        return dN < dE ? dN : dE;
    }

    public boolean g0(double d10, double d11) {
        return W(d10, d11);
    }

    public boolean h0(a aVar) {
        return X(aVar);
    }

    public int hashCode() {
        return ((((((629 + a.t(this.f338164a)) * 37) + a.t(this.f338165b)) * 37) + a.t(this.f338166c)) * 37) + a.t(this.f338167d);
    }

    public boolean i0(m mVar) {
        return c0(mVar);
    }

    public void j0() {
        this.f338164a = 0.0d;
        this.f338165b = -1.0d;
        this.f338166c = 0.0d;
        this.f338167d = -1.0d;
    }

    public a k() {
        if (d0()) {
            return null;
        }
        return new a((L() + H()) / 2.0d, (M() + I()) / 2.0d);
    }

    public void k0(double d10, double d11) {
        if (d0()) {
            return;
        }
        R(L() + d10, H() + d10, M() + d11, I() + d11);
    }

    public boolean l(double d10, double d11) {
        return p(d10, d11);
    }

    public boolean n(a aVar) {
        return q(aVar);
    }

    public boolean o(m mVar) {
        return r(mVar);
    }

    public boolean p(double d10, double d11) {
        return !d0() && d10 >= this.f338164a && d10 <= this.f338165b && d11 >= this.f338166c && d11 <= this.f338167d;
    }

    public boolean q(a aVar) {
        return p(aVar.f338092a, aVar.f338093b);
    }

    public boolean r(m mVar) {
        if (d0() || mVar.d0() || mVar.L() < this.f338164a || mVar.H() > this.f338165b || mVar.M() < this.f338166c || mVar.I() > this.f338167d) {
            return false;
        }
        int i10 = 2 ^ 1;
        return true;
    }

    public double s(m mVar) {
        double d10;
        double d11;
        if (c0(mVar)) {
            return 0.0d;
        }
        double d12 = this.f338165b;
        double d13 = mVar.f338164a;
        if (d12 < d13) {
            d10 = d13 - d12;
        } else {
            double d14 = this.f338164a;
            double d15 = mVar.f338165b;
            d10 = d14 > d15 ? d14 - d15 : 0.0d;
        }
        double d16 = this.f338167d;
        double d17 = mVar.f338166c;
        if (d16 < d17) {
            d11 = d17 - d16;
        } else {
            double d18 = this.f338166c;
            double d19 = mVar.f338167d;
            d11 = d18 > d19 ? d18 - d19 : 0.0d;
        }
        if (d10 == 0.0d) {
            return d11;
        }
        return d11 == 0.0d ? d10 : Math.sqrt((d10 * d10) + (d11 * d11));
    }

    public void t(double d10) {
        v(d10, d10);
    }

    public String toString() {
        return "Env[" + this.f338164a + " : " + this.f338165b + ", " + this.f338166c + " : " + this.f338167d + "]";
    }

    public void v(double d10, double d11) {
        if (d0()) {
            return;
        }
        double d12 = this.f338164a - d10;
        this.f338164a = d12;
        double d13 = this.f338165b + d10;
        this.f338165b = d13;
        double d14 = this.f338166c - d11;
        this.f338166c = d14;
        double d15 = this.f338167d + d11;
        this.f338167d = d15;
        if (d12 <= d13 && d14 <= d15) {
            return;
        }
        j0();
    }

    public void w(double d10, double d11) {
        if (d0()) {
            this.f338164a = d10;
            this.f338165b = d10;
            this.f338166c = d11;
            this.f338167d = d11;
            return;
        }
        if (d10 < this.f338164a) {
            this.f338164a = d10;
        }
        if (d10 > this.f338165b) {
            this.f338165b = d10;
        }
        if (d11 < this.f338166c) {
            this.f338166c = d11;
        }
        if (d11 > this.f338167d) {
            this.f338167d = d11;
        }
    }

    public void x(a aVar) {
        w(aVar.f338092a, aVar.f338093b);
    }

    public void z(m mVar) {
        if (mVar.d0()) {
            return;
        }
        if (d0()) {
            this.f338164a = mVar.L();
            this.f338165b = mVar.H();
            this.f338166c = mVar.M();
            this.f338167d = mVar.I();
            return;
        }
        double d10 = mVar.f338164a;
        if (d10 < this.f338164a) {
            this.f338164a = d10;
        }
        double d11 = mVar.f338165b;
        if (d11 > this.f338165b) {
            this.f338165b = d11;
        }
        double d12 = mVar.f338166c;
        if (d12 < this.f338166c) {
            this.f338166c = d12;
        }
        double d13 = mVar.f338167d;
        if (d13 > this.f338167d) {
            this.f338167d = d13;
        }
    }

    public m(double d10, double d11, double d12, double d13) {
        R(d10, d11, d12, d13);
    }

    public m(a aVar, a aVar2) {
        R(aVar.f338092a, aVar2.f338092a, aVar.f338093b, aVar2.f338093b);
    }

    public m(a aVar) {
        double d10 = aVar.f338092a;
        double d11 = aVar.f338093b;
        R(d10, d10, d11, d11);
    }

    public m(m mVar) {
        U(mVar);
    }
}
