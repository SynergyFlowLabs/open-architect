package org.locationtech.jts.geom.util;

/* JADX INFO: loaded from: classes14.dex */
public class a implements Cloneable, org.locationtech.jts.geom.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f338213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f338215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f338216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f338217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f338218f;

    public a() {
        z();
    }

    public static a N(double d10, double d11) {
        a aVar = new a();
        aVar.I(d10, d11);
        return aVar;
    }

    public static a T(double d10, double d11) {
        a aVar = new a();
        aVar.J(d10, d11);
        return aVar;
    }

    public static a k(double d10, double d11) {
        a aVar = new a();
        aVar.A(d10, d11);
        return aVar;
    }

    public static a l(double d10, double d11, double d12, double d13) {
        a aVar = new a();
        aVar.B(d10, d11, d12, d13);
        return aVar;
    }

    public static a r(double d10) {
        return s(Math.sin(d10), Math.cos(d10));
    }

    public static a s(double d10, double d11) {
        a aVar = new a();
        aVar.E(d10, d11);
        return aVar;
    }

    public static a t(double d10, double d11, double d12) {
        return u(Math.sin(d10), Math.cos(d10), d11, d12);
    }

    public static a u(double d10, double d11, double d12, double d13) {
        a aVar = new a();
        aVar.G(d10, d11, d12, d13);
        return aVar;
    }

    public static a w(double d10, double d11) {
        a aVar = new a();
        aVar.H(d10, d11);
        return aVar;
    }

    public static a x(double d10, double d11, double d12, double d13) {
        a aVar = new a();
        aVar.S(-d12, -d13);
        aVar.v(d10, d11);
        aVar.S(d12, d13);
        return aVar;
    }

    public a A(double d10, double d11) {
        if (d10 == 0.0d && d11 == 0.0d) {
            throw new IllegalArgumentException("Reflection vector must be non-zero");
        }
        if (d10 == d11) {
            this.f338213a = 0.0d;
            this.f338214b = 1.0d;
            this.f338215c = 0.0d;
            this.f338216d = 1.0d;
            this.f338217e = 0.0d;
            this.f338218f = 0.0d;
            return this;
        }
        double dSqrt = Math.sqrt((d10 * d10) + (d11 * d11));
        double d12 = d11 / dSqrt;
        double d13 = d10 / dSqrt;
        o(-d12, d13);
        v(1.0d, -1.0d);
        o(d12, d13);
        return this;
    }

    public a B(double d10, double d11, double d12, double d13) {
        if (d10 == d12 && d11 == d13) {
            throw new IllegalArgumentException("Reflection line points must be distinct");
        }
        J(-d10, -d11);
        double d14 = d12 - d10;
        double d15 = d13 - d11;
        double dSqrt = Math.sqrt((d14 * d14) + (d15 * d15));
        double d16 = d15 / dSqrt;
        double d17 = d14 / dSqrt;
        o(-d16, d17);
        v(1.0d, -1.0d);
        o(d16, d17);
        S(d10, d11);
        return this;
    }

    public a C(double d10, double d11, double d12, double d13) {
        if (d10 == d12 && d11 == d13) {
            throw new IllegalArgumentException("Reflection line points must be distinct");
        }
        double d14 = d12 - d10;
        double d15 = d13 - d11;
        double dSqrt = Math.sqrt((d14 * d14) + (d15 * d15));
        double d16 = d15 / dSqrt;
        double d17 = d14 / dSqrt;
        double d18 = 2.0d * d16 * d17;
        double d19 = (d17 * d17) - (d16 * d16);
        this.f338213a = d19;
        this.f338214b = d18;
        this.f338215c = 0.0d;
        this.f338216d = d18;
        this.f338217e = -d19;
        this.f338218f = 0.0d;
        return this;
    }

    public a D(double d10) {
        E(Math.sin(d10), Math.cos(d10));
        return this;
    }

    public a E(double d10, double d11) {
        this.f338213a = d11;
        this.f338214b = -d10;
        this.f338215c = 0.0d;
        this.f338216d = d10;
        this.f338217e = d11;
        this.f338218f = 0.0d;
        return this;
    }

    public a F(double d10, double d11, double d12) {
        G(Math.sin(d10), Math.cos(d10), d11, d12);
        return this;
    }

    public a G(double d10, double d11, double d12, double d13) {
        this.f338213a = d11;
        this.f338214b = -d10;
        this.f338215c = (d12 - (d12 * d11)) + (d13 * d10);
        this.f338216d = d10;
        this.f338217e = d11;
        this.f338218f = (d13 - (d12 * d10)) - (d13 * d11);
        return this;
    }

    public a H(double d10, double d11) {
        this.f338213a = d10;
        this.f338214b = 0.0d;
        this.f338215c = 0.0d;
        this.f338216d = 0.0d;
        this.f338217e = d11;
        this.f338218f = 0.0d;
        return this;
    }

    public a I(double d10, double d11) {
        this.f338213a = 1.0d;
        this.f338214b = d10;
        this.f338215c = 0.0d;
        this.f338216d = d11;
        this.f338217e = 1.0d;
        this.f338218f = 0.0d;
        return this;
    }

    public a J(double d10, double d11) {
        this.f338213a = 1.0d;
        this.f338214b = 0.0d;
        this.f338215c = d10;
        this.f338216d = 0.0d;
        this.f338217e = 1.0d;
        this.f338218f = d11;
        return this;
    }

    public a K(double d10, double d11, double d12, double d13, double d14, double d15) {
        this.f338213a = d10;
        this.f338214b = d11;
        this.f338215c = d12;
        this.f338216d = d13;
        this.f338217e = d14;
        this.f338218f = d15;
        return this;
    }

    public a L(a aVar) {
        this.f338213a = aVar.f338213a;
        this.f338214b = aVar.f338214b;
        this.f338215c = aVar.f338215c;
        this.f338216d = aVar.f338216d;
        this.f338217e = aVar.f338217e;
        this.f338218f = aVar.f338218f;
        return this;
    }

    public a M(double d10, double d11) {
        c(N(d10, d11));
        return this;
    }

    public org.locationtech.jts.geom.a O(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        double d10 = this.f338213a;
        double d11 = aVar.f338092a;
        double d12 = this.f338214b;
        double d13 = aVar.f338093b;
        double d14 = (d10 * d11) + (d12 * d13) + this.f338215c;
        double d15 = (this.f338216d * d11) + (this.f338217e * d13) + this.f338218f;
        aVar2.f338092a = d14;
        aVar2.f338093b = d15;
        return aVar2;
    }

    public org.locationtech.jts.geom.n P(org.locationtech.jts.geom.n nVar) {
        org.locationtech.jts.geom.n nVarW = nVar.w();
        nVarW.c(this);
        return nVarW;
    }

    public void Q(org.locationtech.jts.geom.e eVar, int i10) {
        double dIj = (this.f338213a * eVar.ij(i10, 0)) + (this.f338214b * eVar.ij(i10, 1)) + this.f338215c;
        double dIj2 = (this.f338216d * eVar.ij(i10, 0)) + (this.f338217e * eVar.ij(i10, 1)) + this.f338218f;
        eVar.Ld(i10, 0, dIj);
        eVar.Ld(i10, 1, dIj2);
    }

    public a S(double d10, double d11) {
        c(T(d10, d11));
        return this;
    }

    @Override // org.locationtech.jts.geom.h
    public void a(org.locationtech.jts.geom.e eVar, int i10) {
        Q(eVar, i10);
    }

    @Override // org.locationtech.jts.geom.h
    public boolean b() {
        return true;
    }

    public a c(a aVar) {
        double d10 = aVar.f338213a;
        double d11 = this.f338213a;
        double d12 = aVar.f338214b;
        double d13 = this.f338216d;
        double d14 = (d10 * d11) + (d12 * d13);
        double d15 = this.f338214b;
        double d16 = d10 * d15;
        double d17 = this.f338217e;
        double d18 = d16 + (d12 * d17);
        double d19 = this.f338215c;
        double d20 = d10 * d19;
        double d21 = this.f338218f;
        double d22 = d20 + (d12 * d21) + aVar.f338215c;
        double d23 = aVar.f338216d;
        double d24 = d11 * d23;
        double d25 = aVar.f338217e;
        double d26 = d24 + (d13 * d25);
        double d27 = (d23 * d15) + (d25 * d17);
        double d28 = (d23 * d19) + (d25 * d21) + aVar.f338218f;
        this.f338213a = d14;
        this.f338214b = d18;
        this.f338215c = d22;
        this.f338216d = d26;
        this.f338217e = d27;
        this.f338218f = d28;
        return this;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Exception unused) {
            org.locationtech.jts.util.a.e();
            return null;
        }
    }

    public a d(a aVar) {
        double d10 = this.f338213a;
        double d11 = aVar.f338213a;
        double d12 = this.f338214b;
        double d13 = aVar.f338216d;
        double d14 = (d10 * d11) + (d12 * d13);
        double d15 = aVar.f338214b;
        double d16 = d10 * d15;
        double d17 = aVar.f338217e;
        double d18 = d16 + (d12 * d17);
        double d19 = aVar.f338215c;
        double d20 = aVar.f338218f;
        double d21 = (d10 * d19) + (d12 * d20) + this.f338215c;
        double d22 = this.f338216d;
        double d23 = d11 * d22;
        double d24 = this.f338217e;
        double d25 = d23 + (d13 * d24);
        double d26 = (d22 * d15) + (d24 * d17);
        double d27 = (d22 * d19) + (d24 * d20) + this.f338218f;
        this.f338213a = d14;
        this.f338214b = d18;
        this.f338215c = d21;
        this.f338216d = d25;
        this.f338217e = d26;
        this.f338218f = d27;
        return this;
    }

    public double e() {
        return (this.f338213a * this.f338217e) - (this.f338214b * this.f338216d);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f338213a == aVar.f338213a && this.f338214b == aVar.f338214b && this.f338215c == aVar.f338215c && this.f338216d == aVar.f338216d && this.f338217e == aVar.f338217e && this.f338218f == aVar.f338218f;
    }

    public a f() throws m {
        double dE = e();
        if (dE == 0.0d) {
            throw new m("Transformation is non-invertible");
        }
        double d10 = this.f338217e;
        double d11 = d10 / dE;
        double d12 = this.f338216d;
        double d13 = (-d12) / dE;
        double d14 = this.f338214b;
        double d15 = (-d14) / dE;
        double d16 = this.f338213a;
        double d17 = this.f338218f;
        double d18 = d14 * d17;
        double d19 = this.f338215c;
        return new a(d11, d15, (d18 - (d10 * d19)) / dE, d13, d16 / dE, (((-d16) * d17) + (d12 * d19)) / dE);
    }

    public double[] g() {
        return new double[]{this.f338213a, this.f338214b, this.f338215c, this.f338216d, this.f338217e, this.f338218f};
    }

    public boolean h() {
        return this.f338213a == 1.0d && this.f338214b == 0.0d && this.f338215c == 0.0d && this.f338216d == 0.0d && this.f338217e == 1.0d && this.f338218f == 0.0d;
    }

    public a i(double d10, double d11) {
        c(k(d10, d11));
        return this;
    }

    @Override // org.locationtech.jts.geom.h
    public boolean isDone() {
        return false;
    }

    public a j(double d10, double d11, double d12, double d13) {
        c(l(d10, d11, d12, d13));
        return this;
    }

    public a n(double d10) {
        c(r(d10));
        return this;
    }

    public a o(double d10, double d11) {
        c(s(d10, d11));
        return this;
    }

    public a p(double d10, double d11, double d12) {
        c(t(d10, d11, d12));
        return this;
    }

    public a q(double d10, double d11, double d12, double d13) {
        c(s(d10, d11));
        return this;
    }

    public String toString() {
        return "AffineTransformation[[" + this.f338213a + ", " + this.f338214b + ", " + this.f338215c + "], [" + this.f338216d + ", " + this.f338217e + ", " + this.f338218f + "]]";
    }

    public a v(double d10, double d11) {
        c(w(d10, d11));
        return this;
    }

    public a z() {
        this.f338213a = 1.0d;
        this.f338214b = 0.0d;
        this.f338215c = 0.0d;
        this.f338216d = 0.0d;
        this.f338217e = 1.0d;
        this.f338218f = 0.0d;
        return this;
    }

    public a(double[] dArr) {
        this.f338213a = dArr[0];
        this.f338214b = dArr[1];
        this.f338215c = dArr[2];
        this.f338216d = dArr[3];
        this.f338217e = dArr[4];
        this.f338218f = dArr[5];
    }

    public a(double d10, double d11, double d12, double d13, double d14, double d15) {
        K(d10, d11, d12, d13, d14, d15);
    }

    public a(a aVar) {
        L(aVar);
    }

    public a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4, org.locationtech.jts.geom.a aVar5, org.locationtech.jts.geom.a aVar6) {
    }
}
