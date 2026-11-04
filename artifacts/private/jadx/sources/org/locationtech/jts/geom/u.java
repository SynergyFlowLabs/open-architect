package org.locationtech.jts.geom;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class u implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f338210c = 3252005833466256227L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f338211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f338212b;

    public u(a aVar, a aVar2) {
        this.f338211a = aVar;
        this.f338212b = aVar2;
    }

    public static a I(a aVar, a aVar2) {
        return new a((aVar.f338092a + aVar2.f338092a) / 2.0d, (aVar.f338093b + aVar2.f338093b) / 2.0d);
    }

    public double D() {
        return Math.max(this.f338211a.f338092a, this.f338212b.f338092a);
    }

    public double E() {
        return Math.max(this.f338211a.f338093b, this.f338212b.f338093b);
    }

    public a H() {
        return I(this.f338211a, this.f338212b);
    }

    public double L() {
        return Math.min(this.f338211a.f338092a, this.f338212b.f338092a);
    }

    public double M() {
        return Math.min(this.f338211a.f338093b, this.f338212b.f338093b);
    }

    public void N() {
        if (this.f338212b.compareTo(this.f338211a) < 0) {
            X();
        }
    }

    public int O(a aVar) {
        return org.locationtech.jts.algorithm.s.a(this.f338211a, this.f338212b, aVar);
    }

    public int R(u uVar) {
        int iA = org.locationtech.jts.algorithm.s.a(this.f338211a, this.f338212b, uVar.f338211a);
        int iA2 = org.locationtech.jts.algorithm.s.a(this.f338211a, this.f338212b, uVar.f338212b);
        if (iA >= 0 && iA2 >= 0) {
            return Math.max(iA, iA2);
        }
        if (iA > 0 || iA2 > 0) {
            return 0;
        }
        return Math.max(iA, iA2);
    }

    public a S(double d10) {
        a aVar = new a();
        a aVar2 = this.f338211a;
        double d11 = aVar2.f338092a;
        a aVar3 = this.f338212b;
        aVar.f338092a = d11 + ((aVar3.f338092a - d11) * d10);
        double d12 = aVar2.f338093b;
        aVar.f338093b = d12 + (d10 * (aVar3.f338093b - d12));
        return aVar;
    }

    public a T(double d10, double d11) {
        double d12;
        a aVar = this.f338211a;
        double d13 = aVar.f338092a;
        a aVar2 = this.f338212b;
        double d14 = aVar2.f338092a;
        double d15 = ((d14 - d13) * d10) + d13;
        double d16 = aVar.f338093b;
        double d17 = aVar2.f338093b;
        double d18 = ((d17 - d16) * d10) + d16;
        double d19 = d14 - d13;
        double d20 = d17 - d16;
        double dSqrt = Math.sqrt((d19 * d19) + (d20 * d20));
        double d21 = 0.0d;
        if (d11 == 0.0d) {
            d12 = 0.0d;
        } else {
            if (dSqrt <= 0.0d) {
                throw new IllegalStateException("Cannot compute offset from zero-length line segment");
            }
            d21 = (d11 * d20) / dSqrt;
            d12 = (d19 * d11) / dSqrt;
        }
        return new a(d15 - d21, d18 + d12);
    }

    public a U(a aVar) {
        if (aVar.equals(this.f338211a) || aVar.equals(this.f338212b)) {
            return new a(aVar);
        }
        double dW = W(aVar);
        a aVar2 = new a();
        a aVar3 = this.f338211a;
        double d10 = aVar3.f338092a;
        a aVar4 = this.f338212b;
        aVar2.f338092a = d10 + ((aVar4.f338092a - d10) * dW);
        double d11 = aVar3.f338093b;
        aVar2.f338093b = d11 + (dW * (aVar4.f338093b - d11));
        return aVar2;
    }

    public u V(u uVar) {
        double dW = W(uVar.f338211a);
        double dW2 = W(uVar.f338212b);
        if (dW >= 1.0d && dW2 >= 1.0d) {
            return null;
        }
        if (dW <= 0.0d && dW2 <= 0.0d) {
            return null;
        }
        a aVarU = U(uVar.f338211a);
        if (dW < 0.0d) {
            aVarU = this.f338211a;
        }
        if (dW > 1.0d) {
            aVarU = this.f338212b;
        }
        a aVarU2 = U(uVar.f338212b);
        if (dW2 < 0.0d) {
            aVarU2 = this.f338211a;
        }
        if (dW2 > 1.0d) {
            aVarU2 = this.f338212b;
        }
        return new u(aVarU, aVarU2);
    }

    public double W(a aVar) {
        if (aVar.equals(this.f338211a)) {
            return 0.0d;
        }
        if (aVar.equals(this.f338212b)) {
            return 1.0d;
        }
        a aVar2 = this.f338212b;
        double d10 = aVar2.f338092a;
        a aVar3 = this.f338211a;
        double d11 = aVar3.f338092a;
        double d12 = d10 - d11;
        double d13 = aVar2.f338093b;
        double d14 = aVar3.f338093b;
        double d15 = d13 - d14;
        double d16 = (d12 * d12) + (d15 * d15);
        if (d16 <= 0.0d) {
            return Double.NaN;
        }
        return (((aVar.f338092a - d11) * d12) + ((aVar.f338093b - d14) * d15)) / d16;
    }

    public void X() {
        a aVar = this.f338211a;
        this.f338211a = this.f338212b;
        this.f338212b = aVar;
    }

    public double Y(a aVar) {
        double dW = W(aVar);
        if (dW < 0.0d) {
            return 0.0d;
        }
        if (dW > 1.0d || Double.isNaN(dW)) {
            return 1.0d;
        }
        return dW;
    }

    public void Z(a aVar, a aVar2) {
        a aVar3 = this.f338211a;
        aVar3.f338092a = aVar.f338092a;
        aVar3.f338093b = aVar.f338093b;
        a aVar4 = this.f338212b;
        aVar4.f338092a = aVar2.f338092a;
        aVar4.f338093b = aVar2.f338093b;
    }

    public void a0(u uVar) {
        Z(uVar.f338211a, uVar.f338212b);
    }

    public v c0(r rVar) {
        return rVar.h(new a[]{this.f338211a, this.f338212b});
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        u uVar = (u) obj;
        int iCompareTo = this.f338211a.compareTo(uVar.f338211a);
        return iCompareTo != 0 ? iCompareTo : this.f338212b.compareTo(uVar.f338212b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f338211a.equals(uVar.f338211a) && this.f338212b.equals(uVar.f338212b);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f338211a.f338092a) ^ (Double.doubleToLongBits(this.f338211a.f338093b) * 31);
        int i10 = (int) jDoubleToLongBits;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f338212b.f338092a) ^ (Double.doubleToLongBits(this.f338212b.f338093b) * 31);
        return (((int) jDoubleToLongBits2) ^ ((int) (jDoubleToLongBits2 >> 32))) ^ (((int) (jDoubleToLongBits >> 32)) ^ i10);
    }

    public double k() {
        a aVar = this.f338212b;
        double d10 = aVar.f338093b;
        a aVar2 = this.f338211a;
        return Math.atan2(d10 - aVar2.f338093b, aVar.f338092a - aVar2.f338092a);
    }

    public a l(a aVar) {
        double dW = W(aVar);
        if (dW <= 0.0d || dW >= 1.0d) {
            return this.f338211a.l(aVar) < this.f338212b.l(aVar) ? this.f338211a : this.f338212b;
        }
        return U(aVar);
    }

    public a[] n(u uVar) {
        a aVarV = v(uVar);
        if (aVarV != null) {
            return new a[]{aVarV, aVarV};
        }
        a aVarL = l(uVar.f338211a);
        double dL = aVarL.l(uVar.f338211a);
        a[] aVarArr = {aVarL, uVar.f338211a};
        a aVarL2 = l(uVar.f338212b);
        double dL2 = aVarL2.l(uVar.f338212b);
        if (dL2 < dL) {
            aVarArr[0] = aVarL2;
            aVarArr[1] = uVar.f338212b;
            dL = dL2;
        }
        a aVarL3 = uVar.l(this.f338211a);
        double dL3 = aVarL3.l(this.f338211a);
        if (dL3 < dL) {
            aVarArr[0] = this.f338211a;
            aVarArr[1] = aVarL3;
            dL = dL3;
        }
        a aVarL4 = uVar.l(this.f338212b);
        if (aVarL4.l(this.f338212b) < dL) {
            aVarArr[0] = this.f338212b;
            aVarArr[1] = aVarL4;
        }
        return aVarArr;
    }

    public double o(a aVar) {
        return org.locationtech.jts.algorithm.i.b(aVar, this.f338211a, this.f338212b);
    }

    public double p(u uVar) {
        return org.locationtech.jts.algorithm.i.d(this.f338211a, this.f338212b, uVar.f338211a, uVar.f338212b);
    }

    public double q(a aVar) {
        return org.locationtech.jts.algorithm.i.a(aVar, this.f338211a, this.f338212b);
    }

    public boolean r(u uVar) {
        if (this.f338211a.equals(uVar.f338211a) && this.f338212b.equals(uVar.f338212b)) {
            return true;
        }
        return this.f338211a.equals(uVar.f338212b) && this.f338212b.equals(uVar.f338211a);
    }

    public a s(int i10) {
        return i10 == 0 ? this.f338211a : this.f338212b;
    }

    public double t() {
        return this.f338211a.l(this.f338212b);
    }

    public String toString() {
        return "LINESTRING( " + this.f338211a.f338092a + " " + this.f338211a.f338093b + ", " + this.f338212b.f338092a + " " + this.f338212b.f338093b + ")";
    }

    public a v(u uVar) {
        org.locationtech.jts.algorithm.y yVar = new org.locationtech.jts.algorithm.y();
        yVar.f(this.f338211a, this.f338212b, uVar.f338211a, uVar.f338212b);
        if (yVar.n()) {
            return yVar.j(0);
        }
        return null;
    }

    public boolean w() {
        return this.f338211a.f338093b == this.f338212b.f338093b;
    }

    public boolean x() {
        return this.f338211a.f338092a == this.f338212b.f338092a;
    }

    public a z(u uVar) {
        try {
            return org.locationtech.jts.algorithm.j.d(this.f338211a, this.f338212b, uVar.f338211a, uVar.f338212b);
        } catch (org.locationtech.jts.algorithm.r unused) {
            return null;
        }
    }

    public u(double d10, double d11, double d12, double d13) {
        this(new a(d10, d11), new a(d12, d13));
    }

    public u(u uVar) {
        this(uVar.f338211a, uVar.f338212b);
    }

    public u() {
        this(new a(), new a());
    }
}
