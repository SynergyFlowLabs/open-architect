package com.badlogic.gdx.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f94876g = 1524569123485049187L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f94877a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f94878b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f94879c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f94880d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f94881e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f94882f = 0.0f;

    public a() {
        int i10 = 6 >> 0;
    }

    public a A(float f10, float f11) {
        this.f94877a = f10;
        this.f94878b = -f11;
        this.f94879c = 0.0f;
        this.f94880d = f11;
        this.f94881e = f10;
        this.f94882f = 0.0f;
        return this;
    }

    public a B(float f10) {
        float fI = s.i(f10);
        float fL = s.L(f10);
        this.f94877a = fI;
        this.f94878b = -fL;
        this.f94879c = 0.0f;
        this.f94880d = fL;
        this.f94881e = fI;
        this.f94882f = 0.0f;
        return this;
    }

    public a C(float f10, float f11) {
        this.f94877a = f10;
        this.f94878b = 0.0f;
        this.f94879c = 0.0f;
        this.f94880d = 0.0f;
        this.f94881e = f11;
        this.f94882f = 0.0f;
        return this;
    }

    public a D(c0 c0Var) {
        return C(c0Var.f94907a, c0Var.f94908b);
    }

    public a E(float f10, float f11) {
        this.f94877a = 1.0f;
        this.f94878b = f10;
        this.f94879c = 0.0f;
        this.f94880d = f11;
        this.f94881e = 1.0f;
        this.f94882f = 0.0f;
        return this;
    }

    public a F(c0 c0Var) {
        return E(c0Var.f94907a, c0Var.f94908b);
    }

    public a G(float f10, float f11) {
        this.f94877a = 1.0f;
        this.f94878b = 0.0f;
        this.f94879c = f10;
        this.f94880d = 0.0f;
        this.f94881e = 1.0f;
        this.f94882f = f11;
        return this;
    }

    public a H(c0 c0Var) {
        return G(c0Var.f94907a, c0Var.f94908b);
    }

    public a I(float f10, float f11, float f12, float f13, float f14) {
        this.f94879c = f10;
        this.f94882f = f11;
        if (f12 == 0.0f) {
            this.f94877a = f13;
            this.f94878b = 0.0f;
            this.f94880d = 0.0f;
            this.f94881e = f14;
            return this;
        }
        float fL = s.L(f12);
        float fI = s.i(f12);
        this.f94877a = fI * f13;
        this.f94878b = (-fL) * f14;
        this.f94880d = fL * f13;
        this.f94881e = fI * f14;
        return this;
    }

    public a J(c0 c0Var, float f10, c0 c0Var2) {
        return I(c0Var.f94907a, c0Var.f94908b, f10, c0Var2.f94907a, c0Var2.f94908b);
    }

    public a K(float f10, float f11, float f12, float f13, float f14) {
        this.f94879c = f10;
        this.f94882f = f11;
        if (f12 == 0.0f) {
            this.f94877a = f13;
            this.f94878b = 0.0f;
            this.f94880d = 0.0f;
            this.f94881e = f14;
            return this;
        }
        float fM = s.M(f12);
        float fJ = s.j(f12);
        this.f94877a = fJ * f13;
        this.f94878b = (-fM) * f14;
        this.f94880d = fM * f13;
        this.f94881e = fJ * f14;
        return this;
    }

    public a L(c0 c0Var, float f10, c0 c0Var2) {
        return K(c0Var.f94907a, c0Var.f94908b, f10, c0Var2.f94907a, c0Var2.f94908b);
    }

    public a M(float f10, float f11, float f12, float f13) {
        this.f94877a = f12;
        this.f94878b = 0.0f;
        this.f94879c = f10;
        this.f94880d = 0.0f;
        this.f94881e = f13;
        this.f94882f = f11;
        return this;
    }

    public a N(c0 c0Var, c0 c0Var2) {
        return M(c0Var.f94907a, c0Var.f94908b, c0Var2.f94907a, c0Var2.f94908b);
    }

    public a O(float f10, float f11) {
        float f12 = this.f94877a;
        float f13 = this.f94878b;
        this.f94877a = (f11 * f13) + f12;
        this.f94878b = f13 + (f12 * f10);
        float f14 = this.f94880d;
        float f15 = this.f94881e;
        this.f94880d = (f11 * f15) + f14;
        this.f94881e = f15 + (f10 * f14);
        return this;
    }

    public a P(c0 c0Var) {
        return O(c0Var.f94907a, c0Var.f94908b);
    }

    public a Q(float f10, float f11) {
        this.f94879c += (this.f94877a * f10) + (this.f94878b * f11);
        this.f94882f += (this.f94880d * f10) + (this.f94881e * f11);
        return this;
    }

    public a R(c0 c0Var) {
        return Q(c0Var.f94907a, c0Var.f94908b);
    }

    public void a(c0 c0Var) {
        float f10 = c0Var.f94907a;
        float f11 = c0Var.f94908b;
        c0Var.f94907a = (this.f94877a * f10) + (this.f94878b * f11) + this.f94879c;
        c0Var.f94908b = (this.f94880d * f10) + (this.f94881e * f11) + this.f94882f;
    }

    public float b() {
        return (this.f94877a * this.f94881e) - (this.f94878b * this.f94880d);
    }

    public c0 c(c0 c0Var) {
        c0Var.f94907a = this.f94879c;
        c0Var.f94908b = this.f94882f;
        return c0Var;
    }

    public a d() {
        this.f94877a = 1.0f;
        this.f94878b = 0.0f;
        this.f94879c = 0.0f;
        this.f94880d = 0.0f;
        this.f94881e = 1.0f;
        this.f94882f = 0.0f;
        return this;
    }

    public a e() {
        float fB = b();
        if (fB == 0.0f) {
            throw new com.badlogic.gdx.utils.t("Can't invert a singular affine matrix");
        }
        float f10 = 1.0f / fB;
        float f11 = this.f94881e;
        float f12 = this.f94878b;
        float f13 = -f12;
        float f14 = this.f94882f;
        float f15 = this.f94879c;
        float f16 = this.f94880d;
        float f17 = -f16;
        float f18 = this.f94877a;
        this.f94877a = f11 * f10;
        this.f94878b = f13 * f10;
        this.f94879c = ((f12 * f14) - (f11 * f15)) * f10;
        this.f94880d = f17 * f10;
        this.f94881e = f18 * f10;
        this.f94882f = f10 * ((f16 * f15) - (f14 * f18));
        return this;
    }

    public boolean f() {
        return this.f94877a == 1.0f && this.f94879c == 0.0f && this.f94882f == 0.0f && this.f94881e == 1.0f && this.f94878b == 0.0f && this.f94880d == 0.0f;
    }

    public boolean g() {
        return this.f94877a == 1.0f && this.f94881e == 1.0f && this.f94878b == 0.0f && this.f94880d == 0.0f;
    }

    public a h(a aVar) {
        float f10 = this.f94877a;
        float f11 = aVar.f94877a;
        float f12 = this.f94878b;
        float f13 = aVar.f94880d;
        float f14 = (f10 * f11) + (f12 * f13);
        float f15 = aVar.f94878b;
        float f16 = aVar.f94881e;
        float f17 = (f10 * f15) + (f12 * f16);
        float f18 = aVar.f94879c;
        float f19 = aVar.f94882f;
        float f20 = (f10 * f18) + (f12 * f19) + this.f94879c;
        float f21 = this.f94880d;
        float f22 = this.f94881e;
        float f23 = (f11 * f21) + (f13 * f22);
        float f24 = (f15 * f21) + (f16 * f22);
        float f25 = (f21 * f18) + (f22 * f19) + this.f94882f;
        this.f94877a = f14;
        this.f94878b = f17;
        this.f94879c = f20;
        this.f94880d = f23;
        this.f94881e = f24;
        this.f94882f = f25;
        return this;
    }

    public a i(a aVar) {
        float f10 = aVar.f94877a;
        float f11 = this.f94877a;
        float f12 = aVar.f94878b;
        float f13 = this.f94880d;
        float f14 = (f10 * f11) + (f12 * f13);
        float f15 = this.f94878b;
        float f16 = this.f94881e;
        float f17 = (f10 * f15) + (f12 * f16);
        float f18 = this.f94879c;
        float f19 = this.f94882f;
        float f20 = (f10 * f18) + (f12 * f19) + aVar.f94879c;
        float f21 = aVar.f94880d;
        float f22 = aVar.f94881e;
        float f23 = (f11 * f21) + (f13 * f22);
        float f24 = (f15 * f21) + (f16 * f22);
        float f25 = (f21 * f18) + (f22 * f19) + aVar.f94882f;
        this.f94877a = f14;
        this.f94878b = f17;
        this.f94879c = f20;
        this.f94880d = f23;
        this.f94881e = f24;
        this.f94882f = f25;
        return this;
    }

    public a j(float f10) {
        if (f10 == 0.0f) {
            return this;
        }
        float fJ = s.j(f10);
        float fM = s.M(f10);
        float f11 = this.f94877a;
        float f12 = this.f94880d;
        float f13 = (fJ * f11) - (fM * f12);
        float f14 = this.f94878b;
        float f15 = this.f94881e;
        float f16 = (fJ * f14) - (fM * f15);
        float f17 = this.f94879c;
        float f18 = this.f94882f;
        this.f94877a = f13;
        this.f94878b = f16;
        this.f94879c = (fJ * f17) - (fM * f18);
        this.f94880d = (f11 * fM) + (f12 * fJ);
        this.f94881e = (f14 * fM) + (f15 * fJ);
        this.f94882f = (fM * f17) + (fJ * f18);
        return this;
    }

    public a k(float f10) {
        if (f10 == 0.0f) {
            return this;
        }
        float fI = s.i(f10);
        float fL = s.L(f10);
        float f11 = this.f94877a;
        float f12 = this.f94880d;
        float f13 = (fI * f11) - (fL * f12);
        float f14 = this.f94878b;
        float f15 = this.f94881e;
        float f16 = (fI * f14) - (fL * f15);
        float f17 = this.f94879c;
        float f18 = this.f94882f;
        this.f94877a = f13;
        this.f94878b = f16;
        this.f94879c = (fI * f17) - (fL * f18);
        this.f94880d = (f11 * fL) + (f12 * fI);
        this.f94881e = (f14 * fL) + (f15 * fI);
        this.f94882f = (fL * f17) + (fI * f18);
        return this;
    }

    public a l(float f10, float f11) {
        this.f94877a *= f10;
        this.f94878b *= f10;
        this.f94879c *= f10;
        this.f94880d *= f11;
        this.f94881e *= f11;
        this.f94882f *= f11;
        return this;
    }

    public a m(c0 c0Var) {
        return l(c0Var.f94907a, c0Var.f94908b);
    }

    public a n(float f10, float f11) {
        float f12 = this.f94877a;
        float f13 = this.f94880d;
        float f14 = (f10 * f13) + f12;
        float f15 = this.f94878b;
        float f16 = this.f94881e;
        float f17 = (f10 * f16) + f15;
        float f18 = this.f94879c;
        float f19 = this.f94882f;
        this.f94877a = f14;
        this.f94878b = f17;
        this.f94879c = (f10 * f19) + f18;
        this.f94880d = f13 + (f12 * f11);
        this.f94881e = f16 + (f15 * f11);
        this.f94882f = f19 + (f11 * f18);
        return this;
    }

    public a o(c0 c0Var) {
        return n(c0Var.f94907a, c0Var.f94908b);
    }

    public a p(float f10, float f11) {
        this.f94879c += f10;
        this.f94882f += f11;
        return this;
    }

    public a q(c0 c0Var) {
        return p(c0Var.f94907a, c0Var.f94908b);
    }

    public a r(float f10) {
        if (f10 == 0.0f) {
            return this;
        }
        float fJ = s.j(f10);
        float fM = s.M(f10);
        float f11 = this.f94877a;
        float f12 = this.f94878b;
        float f13 = (f11 * fJ) + (f12 * fM);
        float f14 = -fM;
        float f15 = (f11 * f14) + (f12 * fJ);
        float f16 = this.f94880d;
        float f17 = this.f94881e;
        this.f94877a = f13;
        this.f94878b = f15;
        this.f94880d = (f16 * fJ) + (fM * f17);
        this.f94881e = (f16 * f14) + (f17 * fJ);
        return this;
    }

    public a s(float f10) {
        if (f10 == 0.0f) {
            return this;
        }
        float fI = s.i(f10);
        float fL = s.L(f10);
        float f11 = this.f94877a;
        float f12 = this.f94878b;
        float f13 = (f11 * fI) + (f12 * fL);
        float f14 = -fL;
        float f15 = (f11 * f14) + (f12 * fI);
        float f16 = this.f94880d;
        float f17 = this.f94881e;
        this.f94877a = f13;
        this.f94878b = f15;
        this.f94880d = (f16 * fI) + (fL * f17);
        this.f94881e = (f16 * f14) + (f17 * fI);
        return this;
    }

    public a t(float f10, float f11) {
        this.f94877a *= f10;
        this.f94878b *= f11;
        this.f94880d *= f10;
        this.f94881e *= f11;
        return this;
    }

    public String toString() {
        return "[" + this.f94877a + "|" + this.f94878b + "|" + this.f94879c + "]\n[" + this.f94880d + "|" + this.f94881e + "|" + this.f94882f + "]\n[0.0|0.0|0.1]";
    }

    public a u(c0 c0Var) {
        return t(c0Var.f94907a, c0Var.f94908b);
    }

    public a v(a aVar) {
        this.f94877a = aVar.f94877a;
        this.f94878b = aVar.f94878b;
        this.f94879c = aVar.f94879c;
        this.f94880d = aVar.f94880d;
        this.f94881e = aVar.f94881e;
        this.f94882f = aVar.f94882f;
        return this;
    }

    public a w(t tVar) {
        float[] fArr = tVar.f95096a;
        this.f94877a = fArr[0];
        this.f94878b = fArr[3];
        this.f94879c = fArr[6];
        this.f94880d = fArr[1];
        this.f94881e = fArr[4];
        this.f94882f = fArr[7];
        return this;
    }

    public a x(Matrix4 matrix4) {
        float[] fArr = matrix4.f94875a;
        this.f94877a = fArr[0];
        this.f94878b = fArr[4];
        this.f94879c = fArr[12];
        this.f94880d = fArr[1];
        this.f94881e = fArr[5];
        this.f94882f = fArr[13];
        return this;
    }

    public a y(a aVar, a aVar2) {
        float f10 = aVar.f94877a * aVar2.f94877a;
        float f11 = aVar.f94878b;
        float f12 = aVar2.f94880d;
        this.f94877a = f10 + (f11 * f12);
        float f13 = aVar.f94877a;
        float f14 = aVar2.f94878b * f13;
        float f15 = aVar2.f94881e;
        this.f94878b = f14 + (f11 * f15);
        float f16 = f13 * aVar2.f94879c;
        float f17 = aVar.f94878b;
        float f18 = aVar2.f94882f;
        this.f94879c = f16 + (f17 * f18) + aVar.f94879c;
        float f19 = aVar.f94880d * aVar2.f94877a;
        float f20 = aVar.f94881e;
        this.f94880d = f19 + (f12 * f20);
        float f21 = aVar.f94880d;
        this.f94881e = (aVar2.f94878b * f21) + (f20 * f15);
        this.f94882f = (f21 * aVar2.f94879c) + (aVar.f94881e * f18) + aVar.f94882f;
        return this;
    }

    public a z(float f10) {
        float fJ = s.j(f10);
        float fM = s.M(f10);
        this.f94877a = fJ;
        this.f94878b = -fM;
        this.f94879c = 0.0f;
        this.f94880d = fM;
        this.f94881e = fJ;
        this.f94882f = 0.0f;
        return this;
    }

    public a(a aVar) {
        v(aVar);
    }
}
