package tm;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f381097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f381098b;

    public e() {
        this(0.0d, 0.0d);
    }

    public static e f(double d10, double d11) {
        return new e(d10, d11);
    }

    public static e g(org.locationtech.jts.geom.a aVar) {
        return new e(aVar);
    }

    public static e h(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        return new e(aVar, aVar2);
    }

    public static e i(e eVar) {
        return new e(eVar);
    }

    public e A(e eVar, double d10) {
        double d11 = 1.0d - d10;
        return f((this.f381097a * d10) + (eVar.f381097a * d11), (d10 * this.f381098b) + (d11 * eVar.f381098b));
    }

    public e a(e eVar) {
        return f(this.f381097a + eVar.f381097a, this.f381098b + eVar.f381098b);
    }

    public double b() {
        return Math.atan2(this.f381098b, this.f381097a);
    }

    public double c(e eVar) {
        return org.locationtech.jts.algorithm.a.e(eVar.b(), b());
    }

    public Object clone() {
        return new e(this);
    }

    public double d(e eVar) {
        double dB = eVar.b() - b();
        if (dB <= -3.141592653589793d) {
            return dB + 6.283185307179586d;
        }
        if (dB > 3.141592653589793d) {
            dB -= 6.283185307179586d;
        }
        return dB;
    }

    public e e(e eVar) {
        return A(eVar, 0.5d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f381097a == eVar.f381097a && this.f381098b == eVar.f381098b;
    }

    public int hashCode() {
        return ((629 + org.locationtech.jts.geom.a.t(this.f381097a)) * 37) + org.locationtech.jts.geom.a.t(this.f381098b);
    }

    public double j(e eVar) {
        double d10 = eVar.f381097a - this.f381097a;
        double d11 = eVar.f381098b - this.f381098b;
        return Math.sqrt((d10 * d10) + (d11 * d11));
    }

    public e k(double d10) {
        return f(this.f381097a / d10, this.f381098b / d10);
    }

    public double l(e eVar) {
        return (this.f381097a * eVar.f381097a) + (this.f381098b * eVar.f381098b);
    }

    public double m(int i10) {
        return i10 == 0 ? this.f381097a : this.f381098b;
    }

    public double n() {
        return this.f381097a;
    }

    public double o() {
        return this.f381098b;
    }

    public boolean p(e eVar) {
        return 0.0d == ((double) org.locationtech.jts.algorithm.f.d(this.f381097a, this.f381098b, eVar.f381097a, eVar.f381098b));
    }

    public double q() {
        double d10 = this.f381097a;
        double d11 = this.f381098b;
        return Math.sqrt((d10 * d10) + (d11 * d11));
    }

    public double r() {
        double d10 = this.f381097a;
        double d11 = this.f381098b;
        return (d10 * d10) + (d11 * d11);
    }

    public e s(double d10) {
        return f(this.f381097a * d10, this.f381098b * d10);
    }

    public e t() {
        return f(-this.f381097a, -this.f381098b);
    }

    public String toString() {
        return "[" + this.f381097a + ", " + this.f381098b + "]";
    }

    public e u() {
        double dQ = q();
        return dQ > 0.0d ? k(dQ) : f(0.0d, 0.0d);
    }

    public e v(double d10) {
        double dCos = Math.cos(d10);
        double dSin = Math.sin(d10);
        double d11 = this.f381097a;
        double d12 = this.f381098b;
        return f((d11 * dCos) - (d12 * dSin), (d11 * dSin) + (d12 * dCos));
    }

    public e w(int i10) {
        int i11 = i10 % 4;
        if (i10 < 0 && i11 != 0) {
            i11 += 4;
        }
        if (i11 == 0) {
            return f(this.f381097a, this.f381098b);
        }
        if (i11 == 1) {
            return f(-this.f381098b, this.f381097a);
        }
        if (i11 == 2) {
            return f(-this.f381097a, -this.f381098b);
        }
        if (i11 == 3) {
            return f(this.f381098b, -this.f381097a);
        }
        org.locationtech.jts.util.a.e();
        return null;
    }

    public e x(e eVar) {
        return f(this.f381097a - eVar.f381097a, this.f381098b - eVar.f381098b);
    }

    public org.locationtech.jts.geom.a y() {
        return new org.locationtech.jts.geom.a(this.f381097a, this.f381098b);
    }

    public org.locationtech.jts.geom.a z(org.locationtech.jts.geom.a aVar) {
        return new org.locationtech.jts.geom.a(this.f381097a + aVar.f338092a, this.f381098b + aVar.f338093b);
    }

    public e(double d10, double d11) {
        this.f381097a = d10;
        this.f381098b = d11;
    }

    public e(e eVar) {
        this.f381097a = eVar.f381097a;
        this.f381098b = eVar.f381098b;
    }

    public e(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        this.f381097a = aVar2.f338092a - aVar.f338092a;
        this.f381098b = aVar2.f338093b - aVar.f338093b;
    }

    public e(org.locationtech.jts.geom.a aVar) {
        this.f381097a = aVar.f338092a;
        this.f381098b = aVar.f338093b;
    }
}
