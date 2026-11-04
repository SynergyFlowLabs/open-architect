package androidx.dynamicanimation.animation;

import androidx.annotation.b1;
import androidx.annotation.x;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f51025k = 10000.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f51026l = 1500.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f51027m = 200.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f51028n = 50.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f51029o = 0.2f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f51030p = 0.5f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f51031q = 0.75f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f51032r = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final double f51033s = 62.5d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final double f51034t = Double.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f51035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f51036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f51037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f51038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f51039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f51040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f51041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f51042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f51043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b.p f51044j;

    public h() {
        this.f51035a = Math.sqrt(1500.0d);
        this.f51036b = 0.5d;
        this.f51037c = false;
        this.f51043i = Double.MAX_VALUE;
        this.f51044j = new b.p();
    }

    private void f() {
        if (this.f51037c) {
            return;
        }
        if (this.f51043i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f51036b;
        if (d10 > 1.0d) {
            double d11 = this.f51035a;
            this.f51040f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f51036b;
            double d13 = this.f51035a;
            this.f51041g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f51042h = this.f51035a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f51037c = true;
    }

    @Override // androidx.dynamicanimation.animation.f
    @b1({b1.a.LIBRARY})
    public float a(float f10, float f11) {
        float fD = f10 - d();
        double d10 = this.f51035a;
        return (float) (((-(d10 * d10)) * ((double) fD)) - (((d10 * 2.0d) * this.f51036b) * ((double) f11)));
    }

    @Override // androidx.dynamicanimation.animation.f
    @b1({b1.a.LIBRARY})
    public boolean b(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f51039e && ((double) Math.abs(f10 - d())) < this.f51038d;
    }

    public float c() {
        return (float) this.f51036b;
    }

    public float d() {
        return (float) this.f51043i;
    }

    public float e() {
        double d10 = this.f51035a;
        return (float) (d10 * d10);
    }

    public h g(@x(from = 0.0d) float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f51036b = f10;
        this.f51037c = false;
        return this;
    }

    public h h(float f10) {
        this.f51043i = f10;
        return this;
    }

    public h i(@x(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f51035a = Math.sqrt(f10);
        this.f51037c = false;
        return this;
    }

    void j(double d10) {
        double dAbs = Math.abs(d10);
        this.f51038d = dAbs;
        this.f51039e = dAbs * f51033s;
    }

    b.p k(double d10, double d11, long j10) {
        double dPow;
        double dCos;
        f();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f51043i;
        double d14 = this.f51036b;
        if (d14 > 1.0d) {
            double d15 = this.f51041g;
            double d16 = this.f51040f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f51040f * d12) * d18);
            double d19 = this.f51041g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f51040f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f51035a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f51035a) * d12);
            double d24 = this.f51035a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f51042h;
            double d26 = this.f51035a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            dPow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f51042h * d12) * d13) + (Math.sin(this.f51042h * d12) * d27));
            double d28 = this.f51035a;
            double d29 = this.f51036b;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f51042h;
            double dSin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f51042h;
            dCos = ((-d28) * dPow * d29) + (dPow4 * (dSin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        b.p pVar = this.f51044j;
        pVar.f51015a = (float) (dPow + this.f51043i);
        pVar.f51016b = (float) dCos;
        return pVar;
    }

    public h(float f10) {
        this.f51035a = Math.sqrt(1500.0d);
        this.f51036b = 0.5d;
        this.f51037c = false;
        this.f51043i = Double.MAX_VALUE;
        this.f51044j = new b.p();
        this.f51043i = f10;
    }
}
