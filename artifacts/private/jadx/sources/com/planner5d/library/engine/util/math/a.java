package com.planner5d.library.engine.util.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f165413g = 1524569123485049187L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f165414a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f165415b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f165416c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f165417d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f165418e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f165419f = 0.0f;

    public a() {
    }

    public a A(float f10, float f11) {
        this.f165414a = f10;
        this.f165415b = -f11;
        this.f165416c = 0.0f;
        this.f165417d = f11;
        this.f165418e = f10;
        this.f165419f = 0.0f;
        return this;
    }

    public a B(float f10) {
        float fI = e.i(f10);
        float fL = e.L(f10);
        this.f165414a = fI;
        this.f165415b = -fL;
        this.f165416c = 0.0f;
        this.f165417d = fL;
        this.f165418e = fI;
        this.f165419f = 0.0f;
        return this;
    }

    public a C(float f10, float f11) {
        this.f165414a = f10;
        this.f165415b = 0.0f;
        this.f165416c = 0.0f;
        this.f165417d = 0.0f;
        this.f165418e = f11;
        this.f165419f = 0.0f;
        return this;
    }

    public a D(com.planner5d.library.math.k kVar) {
        return C(kVar.f180480a, kVar.f180481b);
    }

    public a E(float f10, float f11) {
        this.f165414a = 1.0f;
        this.f165415b = f10;
        this.f165416c = 0.0f;
        this.f165417d = f11;
        this.f165418e = 1.0f;
        this.f165419f = 0.0f;
        return this;
    }

    public a F(com.planner5d.library.math.k kVar) {
        return E(kVar.f180480a, kVar.f180481b);
    }

    public a G(float f10, float f11) {
        this.f165414a = 1.0f;
        this.f165415b = 0.0f;
        this.f165416c = f10;
        this.f165417d = 0.0f;
        this.f165418e = 1.0f;
        this.f165419f = f11;
        return this;
    }

    public a H(com.planner5d.library.math.k kVar) {
        return G(kVar.f180480a, kVar.f180481b);
    }

    public a I(float f10, float f11, float f12, float f13, float f14) {
        this.f165416c = f10;
        this.f165419f = f11;
        if (f12 == 0.0f) {
            this.f165414a = f13;
            this.f165415b = 0.0f;
            this.f165417d = 0.0f;
            this.f165418e = f14;
            return this;
        }
        float fL = e.L(f12);
        float fI = e.i(f12);
        this.f165414a = fI * f13;
        this.f165415b = (-fL) * f14;
        this.f165417d = fL * f13;
        this.f165418e = fI * f14;
        return this;
    }

    public a J(com.planner5d.library.math.k kVar, float f10, com.planner5d.library.math.k kVar2) {
        return I(kVar.f180480a, kVar.f180481b, f10, kVar2.f180480a, kVar2.f180481b);
    }

    public a K(float f10, float f11, float f12, float f13, float f14) {
        this.f165416c = f10;
        this.f165419f = f11;
        int i10 = 2 | 0;
        if (f12 == 0.0f) {
            this.f165414a = f13;
            this.f165415b = 0.0f;
            this.f165417d = 0.0f;
            this.f165418e = f14;
            return this;
        }
        float fM = e.M(f12);
        float fJ = e.j(f12);
        this.f165414a = fJ * f13;
        this.f165415b = (-fM) * f14;
        this.f165417d = fM * f13;
        this.f165418e = fJ * f14;
        return this;
    }

    public a L(com.planner5d.library.math.k kVar, float f10, com.planner5d.library.math.k kVar2) {
        return K(kVar.f180480a, kVar.f180481b, f10, kVar2.f180480a, kVar2.f180481b);
    }

    public a M(float f10, float f11, float f12, float f13) {
        this.f165414a = f12;
        this.f165415b = 0.0f;
        this.f165416c = f10;
        this.f165417d = 0.0f;
        this.f165418e = f13;
        this.f165419f = f11;
        return this;
    }

    public a N(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        return M(kVar.f180480a, kVar.f180481b, kVar2.f180480a, kVar2.f180481b);
    }

    public a O(float f10, float f11) {
        float f12 = this.f165414a;
        float f13 = this.f165415b;
        this.f165414a = (f11 * f13) + f12;
        this.f165415b = f13 + (f12 * f10);
        float f14 = this.f165417d;
        float f15 = this.f165418e;
        this.f165417d = (f11 * f15) + f14;
        this.f165418e = f15 + (f10 * f14);
        return this;
    }

    public a P(com.planner5d.library.math.k kVar) {
        return O(kVar.f180480a, kVar.f180481b);
    }

    public a Q(float f10, float f11) {
        this.f165416c += (this.f165414a * f10) + (this.f165415b * f11);
        this.f165419f += (this.f165417d * f10) + (this.f165418e * f11);
        return this;
    }

    public a R(com.planner5d.library.math.k kVar) {
        return Q(kVar.f180480a, kVar.f180481b);
    }

    public void a(com.planner5d.library.math.k kVar) {
        float f10 = kVar.f180480a;
        float f11 = kVar.f180481b;
        kVar.f180480a = (this.f165414a * f10) + (this.f165415b * f11) + this.f165416c;
        kVar.f180481b = (this.f165417d * f10) + (this.f165418e * f11) + this.f165419f;
    }

    public float b() {
        return (this.f165414a * this.f165418e) - (this.f165415b * this.f165417d);
    }

    public com.planner5d.library.math.k c(com.planner5d.library.math.k kVar) {
        kVar.f180480a = this.f165416c;
        kVar.f180481b = this.f165419f;
        return kVar;
    }

    public a d() {
        this.f165414a = 1.0f;
        this.f165415b = 0.0f;
        this.f165416c = 0.0f;
        this.f165417d = 0.0f;
        this.f165418e = 1.0f;
        this.f165419f = 0.0f;
        return this;
    }

    public a e() {
        float fB = b();
        if (fB == 0.0f) {
            throw new RuntimeException("Can't invert a singular affine matrix");
        }
        float f10 = 1.0f / fB;
        float f11 = this.f165418e;
        float f12 = this.f165415b;
        float f13 = -f12;
        float f14 = this.f165419f;
        float f15 = this.f165416c;
        float f16 = this.f165417d;
        float f17 = -f16;
        float f18 = this.f165414a;
        this.f165414a = f11 * f10;
        this.f165415b = f13 * f10;
        this.f165416c = ((f12 * f14) - (f11 * f15)) * f10;
        this.f165417d = f17 * f10;
        this.f165418e = f18 * f10;
        this.f165419f = f10 * ((f16 * f15) - (f14 * f18));
        return this;
    }

    public boolean f() {
        return this.f165414a == 1.0f && this.f165416c == 0.0f && this.f165419f == 0.0f && this.f165418e == 1.0f && this.f165415b == 0.0f && this.f165417d == 0.0f;
    }

    public boolean g() {
        return this.f165414a == 1.0f && this.f165418e == 1.0f && this.f165415b == 0.0f && this.f165417d == 0.0f;
    }

    public a h(a aVar) {
        float f10 = this.f165414a;
        float f11 = aVar.f165414a;
        float f12 = this.f165415b;
        float f13 = aVar.f165417d;
        float f14 = (f10 * f11) + (f12 * f13);
        float f15 = aVar.f165415b;
        float f16 = aVar.f165418e;
        float f17 = (f10 * f15) + (f12 * f16);
        float f18 = aVar.f165416c;
        float f19 = aVar.f165419f;
        float f20 = (f10 * f18) + (f12 * f19) + this.f165416c;
        float f21 = this.f165417d;
        float f22 = this.f165418e;
        float f23 = (f11 * f21) + (f13 * f22);
        float f24 = (f15 * f21) + (f16 * f22);
        float f25 = (f21 * f18) + (f22 * f19) + this.f165419f;
        this.f165414a = f14;
        this.f165415b = f17;
        this.f165416c = f20;
        this.f165417d = f23;
        this.f165418e = f24;
        this.f165419f = f25;
        return this;
    }

    public a i(a aVar) {
        float f10 = aVar.f165414a;
        float f11 = this.f165414a;
        float f12 = aVar.f165415b;
        float f13 = this.f165417d;
        float f14 = (f10 * f11) + (f12 * f13);
        float f15 = this.f165415b;
        float f16 = this.f165418e;
        float f17 = (f10 * f15) + (f12 * f16);
        float f18 = this.f165416c;
        float f19 = this.f165419f;
        float f20 = (f10 * f18) + (f12 * f19) + aVar.f165416c;
        float f21 = aVar.f165417d;
        float f22 = aVar.f165418e;
        float f23 = (f11 * f21) + (f13 * f22);
        float f24 = (f15 * f21) + (f16 * f22);
        float f25 = (f21 * f18) + (f22 * f19) + aVar.f165419f;
        this.f165414a = f14;
        this.f165415b = f17;
        this.f165416c = f20;
        this.f165417d = f23;
        this.f165418e = f24;
        this.f165419f = f25;
        return this;
    }

    public a j(float f10) {
        if (f10 == 0.0f) {
            return this;
        }
        float fJ = e.j(f10);
        float fM = e.M(f10);
        float f11 = this.f165414a;
        float f12 = this.f165417d;
        float f13 = (fJ * f11) - (fM * f12);
        float f14 = this.f165415b;
        float f15 = this.f165418e;
        float f16 = (fJ * f14) - (fM * f15);
        float f17 = this.f165416c;
        float f18 = this.f165419f;
        this.f165414a = f13;
        this.f165415b = f16;
        this.f165416c = (fJ * f17) - (fM * f18);
        this.f165417d = (f11 * fM) + (f12 * fJ);
        this.f165418e = (f14 * fM) + (f15 * fJ);
        this.f165419f = (fM * f17) + (fJ * f18);
        return this;
    }

    public a k(float f10) {
        if (f10 == 0.0f) {
            return this;
        }
        float fI = e.i(f10);
        float fL = e.L(f10);
        float f11 = this.f165414a;
        float f12 = this.f165417d;
        float f13 = (fI * f11) - (fL * f12);
        float f14 = this.f165415b;
        float f15 = this.f165418e;
        float f16 = (fI * f14) - (fL * f15);
        float f17 = this.f165416c;
        float f18 = this.f165419f;
        this.f165414a = f13;
        this.f165415b = f16;
        this.f165416c = (fI * f17) - (fL * f18);
        this.f165417d = (f11 * fL) + (f12 * fI);
        this.f165418e = (f14 * fL) + (f15 * fI);
        this.f165419f = (fL * f17) + (fI * f18);
        return this;
    }

    public a l(float f10, float f11) {
        this.f165414a *= f10;
        this.f165415b *= f10;
        this.f165416c *= f10;
        this.f165417d *= f11;
        this.f165418e *= f11;
        this.f165419f *= f11;
        return this;
    }

    public a m(com.planner5d.library.math.k kVar) {
        return l(kVar.f180480a, kVar.f180481b);
    }

    public a n(float f10, float f11) {
        float f12 = this.f165414a;
        float f13 = this.f165417d;
        float f14 = (f10 * f13) + f12;
        float f15 = this.f165415b;
        float f16 = this.f165418e;
        float f17 = (f10 * f16) + f15;
        float f18 = this.f165416c;
        float f19 = this.f165419f;
        this.f165414a = f14;
        this.f165415b = f17;
        this.f165416c = (f10 * f19) + f18;
        this.f165417d = f13 + (f12 * f11);
        this.f165418e = f16 + (f15 * f11);
        this.f165419f = f19 + (f11 * f18);
        return this;
    }

    public a o(com.planner5d.library.math.k kVar) {
        return n(kVar.f180480a, kVar.f180481b);
    }

    public a p(float f10, float f11) {
        this.f165416c += f10;
        this.f165419f += f11;
        return this;
    }

    public a q(com.planner5d.library.math.k kVar) {
        return p(kVar.f180480a, kVar.f180481b);
    }

    public a r(float f10) {
        if (f10 == 0.0f) {
            return this;
        }
        float fJ = e.j(f10);
        float fM = e.M(f10);
        float f11 = this.f165414a;
        float f12 = this.f165415b;
        float f13 = (f11 * fJ) + (f12 * fM);
        float f14 = -fM;
        float f15 = (f11 * f14) + (f12 * fJ);
        float f16 = this.f165417d;
        float f17 = this.f165418e;
        this.f165414a = f13;
        this.f165415b = f15;
        this.f165417d = (f16 * fJ) + (fM * f17);
        this.f165418e = (f16 * f14) + (f17 * fJ);
        return this;
    }

    public a s(float f10) {
        if (f10 == 0.0f) {
            return this;
        }
        float fI = e.i(f10);
        float fL = e.L(f10);
        float f11 = this.f165414a;
        float f12 = this.f165415b;
        float f13 = (f11 * fI) + (f12 * fL);
        float f14 = -fL;
        float f15 = (f11 * f14) + (f12 * fI);
        float f16 = this.f165417d;
        float f17 = this.f165418e;
        this.f165414a = f13;
        this.f165415b = f15;
        this.f165417d = (f16 * fI) + (fL * f17);
        this.f165418e = (f16 * f14) + (f17 * fI);
        return this;
    }

    public a t(float f10, float f11) {
        this.f165414a *= f10;
        this.f165415b *= f11;
        this.f165417d *= f10;
        this.f165418e *= f11;
        return this;
    }

    public String toString() {
        return "[" + this.f165414a + "|" + this.f165415b + "|" + this.f165416c + "]\n[" + this.f165417d + "|" + this.f165418e + "|" + this.f165419f + "]\n[0.0|0.0|0.1]";
    }

    public a u(com.planner5d.library.math.k kVar) {
        return t(kVar.f180480a, kVar.f180481b);
    }

    public a v(a aVar) {
        this.f165414a = aVar.f165414a;
        this.f165415b = aVar.f165415b;
        this.f165416c = aVar.f165416c;
        this.f165417d = aVar.f165417d;
        this.f165418e = aVar.f165418e;
        this.f165419f = aVar.f165419f;
        return this;
    }

    public a w(f fVar) {
        float[] fArr = fVar.f165482a;
        this.f165414a = fArr[0];
        this.f165415b = fArr[3];
        this.f165416c = fArr[6];
        this.f165417d = fArr[1];
        this.f165418e = fArr[4];
        this.f165419f = fArr[7];
        return this;
    }

    public a x(Matrix4 matrix4) {
        float[] fArr = matrix4.f165412a;
        this.f165414a = fArr[0];
        this.f165415b = fArr[4];
        this.f165416c = fArr[12];
        this.f165417d = fArr[1];
        this.f165418e = fArr[5];
        this.f165419f = fArr[13];
        return this;
    }

    public a y(a aVar, a aVar2) {
        float f10 = aVar.f165414a * aVar2.f165414a;
        float f11 = aVar.f165415b;
        float f12 = aVar2.f165417d;
        this.f165414a = f10 + (f11 * f12);
        float f13 = aVar.f165414a;
        float f14 = aVar2.f165415b * f13;
        float f15 = aVar2.f165418e;
        this.f165415b = f14 + (f11 * f15);
        float f16 = f13 * aVar2.f165416c;
        float f17 = aVar.f165415b;
        float f18 = aVar2.f165419f;
        this.f165416c = f16 + (f17 * f18) + aVar.f165416c;
        float f19 = aVar.f165417d * aVar2.f165414a;
        float f20 = aVar.f165418e;
        this.f165417d = f19 + (f12 * f20);
        float f21 = aVar.f165417d;
        this.f165418e = (aVar2.f165415b * f21) + (f20 * f15);
        this.f165419f = (f21 * aVar2.f165416c) + (aVar.f165418e * f18) + aVar.f165419f;
        return this;
    }

    public a z(float f10) {
        float fJ = e.j(f10);
        float fM = e.M(f10);
        this.f165414a = fJ;
        this.f165415b = -fM;
        this.f165416c = 0.0f;
        this.f165417d = fM;
        this.f165418e = fJ;
        this.f165419f = 0.0f;
        return this;
    }

    public a(a aVar) {
        v(aVar);
    }
}
