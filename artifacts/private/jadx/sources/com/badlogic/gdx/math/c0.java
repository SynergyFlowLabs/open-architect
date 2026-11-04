package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.h0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class c0 implements Serializable, e0<c0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f94903c = 913902788239530931L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f94904d = new c0(1.0f, 0.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f94905e = new c0(0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f94906f = new c0(0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f94907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f94908b;

    public c0() {
    }

    public static float a0(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    public static float d0(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    public static float g0(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        return (f14 * f14) + (f15 * f15);
    }

    public static float v0(float f10, float f11) {
        return (float) Math.sqrt((f10 * f10) + (f11 * f11));
    }

    public static float w0(float f10, float f11) {
        return (f10 * f10) + (f11 * f11);
    }

    public c0 A0(t tVar) {
        float f10 = this.f94907a;
        float[] fArr = tVar.f95096a;
        float f11 = fArr[0] * f10;
        float f12 = this.f94908b;
        float f13 = f11 + (fArr[3] * f12) + fArr[6];
        float f14 = (f10 * fArr[1]) + (f12 * fArr[4]) + fArr[7];
        this.f94907a = f13;
        this.f94908b = f14;
        return this;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public c0 g(c0 c0Var, float f10) {
        this.f94907a += c0Var.f94907a * f10;
        this.f94908b += c0Var.f94908b * f10;
        return this;
    }

    @Override // com.badlogic.gdx.math.e0
    public boolean C() {
        return F(1.0E-9f);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public c0 r(c0 c0Var, c0 c0Var2) {
        this.f94907a += c0Var.f94907a * c0Var2.f94907a;
        this.f94908b += c0Var.f94908b * c0Var2.f94908b;
        return this;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public c0 f() {
        float fT = t();
        if (fT != 0.0f) {
            this.f94907a /= fT;
            this.f94908b /= fT;
        }
        return this;
    }

    public c0 E0(float f10) {
        return G0(f10 * 0.017453292f);
    }

    @Override // com.badlogic.gdx.math.e0
    public boolean F(float f10) {
        return Math.abs(w() - 1.0f) < f10;
    }

    public c0 F0(int i10) {
        float f10 = this.f94907a;
        if (i10 >= 0) {
            this.f94907a = -this.f94908b;
            this.f94908b = f10;
            return this;
        }
        this.f94907a = this.f94908b;
        this.f94908b = -f10;
        return this;
    }

    public c0 G0(float f10) {
        double d10 = f10;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = this.f94907a;
        float f12 = this.f94908b;
        this.f94907a = (f11 * fCos) - (f12 * fSin);
        this.f94908b = (f11 * fSin) + (f12 * fCos);
        return this;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public c0 c(float f10) {
        this.f94907a *= f10;
        this.f94908b *= f10;
        return this;
    }

    public c0 I0(float f10, float f11) {
        this.f94907a *= f10;
        this.f94908b *= f11;
        return this;
    }

    @Override // com.badlogic.gdx.math.e0
    public boolean J(float f10) {
        return w() < f10;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public c0 v(c0 c0Var) {
        this.f94907a *= c0Var.f94907a;
        this.f94908b *= c0Var.f94908b;
        return this;
    }

    public c0 K0(float f10, float f11) {
        this.f94907a = f10;
        this.f94908b = f11;
        return this;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public c0 L(c0 c0Var) {
        this.f94907a = c0Var.f94907a;
        this.f94908b = c0Var.f94908b;
        return this;
    }

    public c0 M0(float f10) {
        return N0(f10 * 0.017453292f);
    }

    public c0 N0(float f10) {
        K0(t(), 0.0f);
        G0(f10);
        return this;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public c0 a(float f10) {
        return y(f10 * f10);
    }

    public c0 P(float f10, float f11) {
        this.f94907a += f10;
        this.f94908b += f11;
        return this;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public c0 y(float f10) {
        float fW = w();
        return (fW == 0.0f || fW == f10) ? this : c((float) Math.sqrt(f10 / fW));
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public c0 i(c0 c0Var) {
        this.f94907a += c0Var.f94907a;
        this.f94908b += c0Var.f94908b;
        return this;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public c0 B() {
        this.f94907a = 0.0f;
        this.f94908b = 0.0f;
        return this;
    }

    public float R() {
        float fAtan2 = ((float) Math.atan2(this.f94908b, this.f94907a)) * 57.295776f;
        return fAtan2 < 0.0f ? fAtan2 + 360.0f : fAtan2;
    }

    public c0 R0(float f10, float f11) {
        this.f94907a -= f10;
        this.f94908b -= f11;
        return this;
    }

    public float S(c0 c0Var) {
        return ((float) Math.atan2(Y(c0Var), b(c0Var))) * 57.295776f;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public c0 K(c0 c0Var) {
        this.f94907a -= c0Var.f94907a;
        this.f94908b -= c0Var.f94908b;
        return this;
    }

    public float T() {
        return (float) Math.atan2(this.f94908b, this.f94907a);
    }

    public float U(c0 c0Var) {
        return (float) Math.atan2(Y(c0Var), b(c0Var));
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public c0 m(float f10, float f11) {
        float fW = w();
        if (fW == 0.0f) {
            return this;
        }
        float f12 = f11 * f11;
        if (fW > f12) {
            return c((float) Math.sqrt(f12 / fW));
        }
        float f13 = f10 * f10;
        return fW < f13 ? c((float) Math.sqrt(f13 / fW)) : this;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public c0 k() {
        return new c0(this);
    }

    public float X(float f10, float f11) {
        return (this.f94907a * f11) - (this.f94908b * f10);
    }

    public float Y(c0 c0Var) {
        return (this.f94907a * c0Var.f94908b) - (this.f94908b * c0Var.f94907a);
    }

    public float Z(float f10, float f11) {
        return (this.f94907a * f10) + (this.f94908b * f11);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public float b(c0 c0Var) {
        return (this.f94907a * c0Var.f94907a) + (this.f94908b * c0Var.f94908b);
    }

    public float c0(float f10, float f11) {
        float f12 = f10 - this.f94907a;
        float f13 = f11 - this.f94908b;
        return (float) Math.sqrt((f12 * f12) + (f13 * f13));
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public float H(c0 c0Var) {
        float f10 = c0Var.f94907a - this.f94907a;
        float f11 = c0Var.f94908b - this.f94908b;
        return (float) Math.sqrt((f10 * f10) + (f11 * f11));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return h0.b(this.f94907a) == h0.b(c0Var.f94907a) && h0.b(this.f94908b) == h0.b(c0Var.f94908b);
    }

    public float f0(float f10, float f11) {
        float f12 = f10 - this.f94907a;
        float f13 = f11 - this.f94908b;
        return (f12 * f12) + (f13 * f13);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public float l(c0 c0Var) {
        float f10 = c0Var.f94907a - this.f94907a;
        float f11 = c0Var.f94908b - this.f94908b;
        return (f10 * f10) + (f11 * f11);
    }

    public int hashCode() {
        return ((h0.b(this.f94907a) + 31) * 31) + h0.b(this.f94908b);
    }

    public boolean i0(float f10, float f11, float f12) {
        if (Math.abs(f10 - this.f94907a) <= f12 && Math.abs(f11 - this.f94908b) <= f12) {
            return true;
        }
        return false;
    }

    @Override // com.badlogic.gdx.math.e0
    public boolean isZero() {
        return this.f94907a == 0.0f && this.f94908b == 0.0f;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public boolean h(c0 c0Var, float f10) {
        return c0Var != null && Math.abs(c0Var.f94907a - this.f94907a) <= f10 && Math.abs(c0Var.f94908b - this.f94908b) <= f10;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public boolean N(c0 c0Var) {
        return b(c0Var) < 0.0f;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public boolean G(c0 c0Var) {
        return b(c0Var) > 0.0f;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public c0 D(c0 c0Var, float f10, q qVar) {
        return E(c0Var, qVar.a(f10));
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public boolean q(c0 c0Var) {
        return j(c0Var) && b(c0Var) > 0.0f;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public boolean z(c0 c0Var, float f10) {
        return A(c0Var, f10) && b(c0Var) > 0.0f;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public boolean n(c0 c0Var) {
        return j(c0Var) && b(c0Var) < 0.0f;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public boolean u(c0 c0Var, float f10) {
        return A(c0Var, f10) && b(c0Var) < 0.0f;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public boolean j(c0 c0Var) {
        return s.p((this.f94907a * c0Var.f94908b) - (this.f94908b * c0Var.f94907a));
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public boolean A(c0 c0Var, float f10) {
        return s.q((this.f94907a * c0Var.f94908b) - (this.f94908b * c0Var.f94907a), f10);
    }

    @Override // com.badlogic.gdx.math.e0
    public float t() {
        float f10 = this.f94907a;
        float f11 = this.f94908b;
        return (float) Math.sqrt((f10 * f10) + (f11 * f11));
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public boolean M(c0 c0Var) {
        return s.p(b(c0Var));
    }

    public String toString() {
        return "[" + this.f94907a + ":" + this.f94908b + "]";
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public boolean d(c0 c0Var, float f10) {
        return s.q(b(c0Var), f10);
    }

    @Override // com.badlogic.gdx.math.e0
    public float w() {
        float f10 = this.f94907a;
        float f11 = this.f94908b;
        return (f10 * f10) + (f11 * f11);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public c0 E(c0 c0Var, float f10) {
        float f11 = 1.0f - f10;
        this.f94907a = (this.f94907a * f11) + (c0Var.f94907a * f10);
        this.f94908b = (this.f94908b * f11) + (c0Var.f94908b * f10);
        return this;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public c0 I(float f10) {
        return s(f10 * f10);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public c0 s(float f10) {
        float fW = w();
        if (fW > f10) {
            this = c((float) Math.sqrt(f10 / fW));
        }
        return this;
    }

    public c0(float f10, float f11) {
        this.f94907a = f10;
        this.f94908b = f11;
    }

    public c0(c0 c0Var) {
        L(c0Var);
    }
}
