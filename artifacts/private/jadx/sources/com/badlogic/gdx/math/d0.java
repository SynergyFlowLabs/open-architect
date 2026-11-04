package com.badlogic.gdx.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class d0 extends com.planner5d.library.math.m implements Serializable, e0<d0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f94929d = 3840054589595372522L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d0 f94930e = new d0(1.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d0 f94931f = new d0(0.0f, 1.0f, 0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d0 f94932g = new d0(0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d0 f94933h = new d0(0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Matrix4 f94934i = new Matrix4();

    public d0() {
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
    public d0 L(d0 d0Var) {
        y0(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c);
        return this;
    }

    @Override // com.planner5d.library.math.m
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public d0 B0(float[] fArr) {
        return y0(fArr[0], fArr[1], fArr[2]);
    }

    @Override // com.planner5d.library.math.m, com.badlogic.gdx.math.e0
    public boolean C() {
        return F(1.0E-9f);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d0 a(float f10) {
        return D0(f10 * f10);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d0 y(float f10) {
        float fW = w();
        if (fW != 0.0f && fW != f10) {
            this = c((float) Math.sqrt(f10 / fW));
        }
        return this;
    }

    @Override // com.planner5d.library.math.m
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d0 E0() {
        this.f180482a = 0.0f;
        this.f180483b = 0.0f;
        this.f180484c = 0.0f;
        return this;
    }

    @Override // com.planner5d.library.math.m, com.badlogic.gdx.math.e0
    public boolean F(float f10) {
        return Math.abs(w() - 1.0f) < f10;
    }

    public d0 F1(d0 d0Var, float f10) {
        float fB = b(d0Var);
        double d10 = fB;
        if (d10 > 0.9995d || d10 < -0.9995d) {
            return E(d0Var, f10);
        }
        double dAcos = ((float) Math.acos(d10)) * f10;
        float fSin = (float) Math.sin(dAcos);
        float f11 = d0Var.f180482a - (this.f180482a * fB);
        float f12 = d0Var.f180483b - (this.f180483b * fB);
        float f13 = d0Var.f180484c - (this.f180484c * fB);
        float f14 = (f11 * f11) + (f12 * f12) + (f13 * f13);
        float fSqrt = fSin * (f14 >= 1.0E-4f ? 1.0f / ((float) Math.sqrt(f14)) : 1.0f);
        return c((float) Math.cos(dAcos)).Q(f11 * fSqrt, f12 * fSqrt, f13 * fSqrt).f();
    }

    @Override // com.planner5d.library.math.m
    /* JADX INFO: renamed from: G1, reason: merged with bridge method [inline-methods] */
    public d0 F0(float f10) {
        return y0(this.f180482a - f10, this.f180483b - f10, this.f180484c - f10);
    }

    @Override // com.planner5d.library.math.m
    /* JADX INFO: renamed from: H1, reason: merged with bridge method [inline-methods] */
    public d0 G0(float f10, float f11, float f12) {
        return y0(this.f180482a - f10, this.f180483b - f11, this.f180484c - f12);
    }

    @Override // com.planner5d.library.math.m
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public d0 P(float f10) {
        return y0(this.f180482a + f10, this.f180483b + f10, this.f180484c + f10);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: I1, reason: merged with bridge method [inline-methods] */
    public d0 K(d0 d0Var) {
        return G0(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c);
    }

    @Override // com.planner5d.library.math.m, com.badlogic.gdx.math.e0
    public boolean J(float f10) {
        return w() < f10;
    }

    @Override // com.planner5d.library.math.m
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public d0 Q(float f10, float f11, float f12) {
        return y0(this.f180482a + f10, this.f180483b + f11, this.f180484c + f12);
    }

    public d0 J1(t tVar) {
        float[] fArr = tVar.f95096a;
        float f10 = this.f180482a;
        float f11 = fArr[0] * f10;
        float f12 = this.f180483b;
        float f13 = f11 + (fArr[1] * f12);
        float f14 = this.f180484c;
        return y0(f13 + (fArr[2] * f14), (fArr[3] * f10) + (fArr[4] * f12) + (fArr[5] * f14), (f10 * fArr[6]) + (f12 * fArr[7]) + (f14 * fArr[8]));
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public d0 i(d0 d0Var) {
        return Q(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c);
    }

    public d0 K1(Matrix4 matrix4) {
        float[] fArr = matrix4.f94875a;
        float f10 = this.f180482a;
        float f11 = fArr[0] * f10;
        float f12 = this.f180483b;
        float f13 = f11 + (fArr[1] * f12);
        float f14 = this.f180484c;
        return y0(f13 + (fArr[2] * f14) + fArr[3], (fArr[4] * f10) + (fArr[5] * f12) + (fArr[6] * f14) + fArr[7], (f10 * fArr[8]) + (f12 * fArr[9]) + (f14 * fArr[10]) + fArr[11]);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d0 m(float f10, float f11) {
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

    public d0 L1(Matrix4 matrix4) {
        float[] fArr = matrix4.f94875a;
        float f10 = this.f180482a;
        float f11 = fArr[0] * f10;
        float f12 = this.f180483b;
        float f13 = f11 + (fArr[1] * f12);
        float f14 = this.f180484c;
        return y0(f13 + (fArr[2] * f14), (fArr[4] * f10) + (fArr[5] * f12) + (fArr[6] * f14), (f10 * fArr[8]) + (f12 * fArr[9]) + (f14 * fArr[10]));
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d0 k() {
        return new d0(this);
    }

    public d0 M1(Matrix4 matrix4) {
        float[] fArr = matrix4.f94875a;
        float f10 = this.f180482a;
        float f11 = fArr[12];
        float f12 = f10 - f11;
        this.f180482a = f12;
        float f13 = this.f180483b - f11;
        this.f180483b = f13;
        float f14 = this.f180484c - f11;
        this.f180484c = f14;
        return y0((fArr[0] * f12) + (fArr[1] * f13) + (fArr[2] * f14), (fArr[4] * f12) + (fArr[5] * f13) + (fArr[6] * f14), (f12 * fArr[8]) + (f13 * fArr[9]) + (f14 * fArr[10]));
    }

    @Override // com.planner5d.library.math.m
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public d0 U(float f10, float f11, float f12) {
        float f13 = this.f180483b;
        float f14 = this.f180484c;
        float f15 = (f13 * f12) - (f14 * f11);
        float f16 = this.f180482a;
        return y0(f15, (f14 * f10) - (f12 * f16), (f16 * f11) - (f13 * f10));
    }

    public d0 O0(d0 d0Var) {
        float f10 = this.f180483b;
        float f11 = d0Var.f180484c;
        float f12 = this.f180484c;
        float f13 = d0Var.f180483b;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = d0Var.f180482a;
        float f16 = this.f180482a;
        return y0(f14, (f12 * f15) - (f11 * f16), (f16 * f13) - (f10 * f15));
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public float b(d0 d0Var) {
        return (this.f180482a * d0Var.f180482a) + (this.f180483b * d0Var.f180483b) + (this.f180484c * d0Var.f180484c);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public float H(d0 d0Var) {
        float f10 = d0Var.f180482a - this.f180482a;
        float f11 = d0Var.f180483b - this.f180483b;
        float f12 = d0Var.f180484c - this.f180484c;
        return (float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12));
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public float l(d0 d0Var) {
        float f10 = d0Var.f180482a - this.f180482a;
        float f11 = d0Var.f180483b - this.f180483b;
        float f12 = d0Var.f180484c - this.f180484c;
        return (f10 * f10) + (f11 * f11) + (f12 * f12);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public boolean h(d0 d0Var, float f10) {
        return d0Var != null && Math.abs(d0Var.f180482a - this.f180482a) <= f10 && Math.abs(d0Var.f180483b - this.f180483b) <= f10 && Math.abs(d0Var.f180484c - this.f180484c) <= f10;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public boolean N(d0 d0Var) {
        return b(d0Var) < 0.0f;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public boolean G(d0 d0Var) {
        return b(d0Var) > 0.0f;
    }

    public boolean V0(d0 d0Var) {
        return this.f180482a == d0Var.f180482a && this.f180483b == d0Var.f180483b && this.f180484c == d0Var.f180484c;
    }

    @Override // com.planner5d.library.math.m
    public float W(float f10, float f11, float f12) {
        return (this.f180482a * f10) + (this.f180483b * f11) + (this.f180484c * f12);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public d0 D(d0 d0Var, float f10, q qVar) {
        return E(d0Var, qVar.b(0.0f, 1.0f, f10));
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public boolean q(d0 d0Var) {
        return j(d0Var) && G(d0Var);
    }

    @Override // com.planner5d.library.math.m
    public float Y(float f10, float f11, float f12) {
        float f13 = f10 - this.f180482a;
        float f14 = f11 - this.f180483b;
        float f15 = f12 - this.f180484c;
        return (float) Math.sqrt((f13 * f13) + (f14 * f14) + (f15 * f15));
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public boolean z(d0 d0Var, float f10) {
        return A(d0Var, f10) && G(d0Var);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public boolean n(d0 d0Var) {
        return j(d0Var) && N(d0Var);
    }

    @Override // com.planner5d.library.math.m
    public float a0(float f10, float f11, float f12) {
        float f13 = f10 - this.f180482a;
        float f14 = f11 - this.f180483b;
        float f15 = f12 - this.f180484c;
        return (f13 * f13) + (f14 * f14) + (f15 * f15);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public boolean u(d0 d0Var, float f10) {
        if (!A(d0Var, f10) || !N(d0Var)) {
            return false;
        }
        int i10 = 2 << 1;
        return true;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public boolean j(d0 d0Var) {
        float f10 = this.f180483b;
        float f11 = d0Var.f180484c;
        float f12 = this.f180484c;
        float f13 = d0Var.f180483b;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = d0Var.f180482a;
        float f16 = this.f180482a;
        if (x(f14, (f12 * f15) - (f11 * f16), (f16 * f13) - (f10 * f15)) > 1.0E-6f) {
            return false;
        }
        int i10 = 5 & 1;
        return true;
    }

    @Override // com.planner5d.library.math.m
    public boolean c0(float f10, float f11, float f12, float f13) {
        if (Math.abs(f10 - this.f180482a) <= f13 && Math.abs(f11 - this.f180483b) <= f13 && Math.abs(f12 - this.f180484c) <= f13) {
            return true;
        }
        return false;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public boolean A(d0 d0Var, float f10) {
        float f11 = this.f180483b;
        float f12 = d0Var.f180484c;
        float f13 = this.f180484c;
        float f14 = d0Var.f180483b;
        float f15 = (f11 * f12) - (f13 * f14);
        float f16 = d0Var.f180482a;
        float f17 = this.f180482a;
        return x(f15, (f13 * f16) - (f12 * f17), (f17 * f14) - (f11 * f16)) <= f10;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public boolean M(d0 d0Var) {
        return s.p(b(d0Var));
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public boolean d(d0 d0Var, float f10) {
        return s.q(b(d0Var), f10);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public d0 E(d0 d0Var, float f10) {
        float f11 = this.f180482a;
        this.f180482a = f11 + ((d0Var.f180482a - f11) * f10);
        float f12 = this.f180483b;
        this.f180483b = f12 + ((d0Var.f180483b - f12) * f10);
        float f13 = this.f180484c;
        this.f180484c = f13 + (f10 * (d0Var.f180484c - f13));
        return this;
    }

    @Override // com.planner5d.library.math.m
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d0 q0(float f10) {
        return r0(f10 * f10);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d0 s(float f10) {
        float fW = w();
        if (fW > f10) {
            c((float) Math.sqrt(f10 / fW));
        }
        return this;
    }

    public d0 i1(t tVar) {
        float[] fArr = tVar.f95096a;
        float f10 = this.f180482a;
        float f11 = fArr[0] * f10;
        float f12 = this.f180483b;
        float f13 = f11 + (fArr[3] * f12);
        float f14 = this.f180484c;
        return y0(f13 + (fArr[6] * f14), (fArr[1] * f10) + (fArr[4] * f12) + (fArr[7] * f14), (f10 * fArr[2]) + (f12 * fArr[5]) + (f14 * fArr[8]));
    }

    @Override // com.planner5d.library.math.m, com.badlogic.gdx.math.e0
    public boolean isZero() {
        return this.f180482a == 0.0f && this.f180483b == 0.0f && this.f180484c == 0.0f;
    }

    public d0 j1(Matrix4 matrix4) {
        float[] fArr = matrix4.f94875a;
        float f10 = this.f180482a;
        float f11 = fArr[0] * f10;
        float f12 = this.f180483b;
        float f13 = f11 + (fArr[4] * f12);
        float f14 = this.f180484c;
        return y0(f13 + (fArr[8] * f14) + fArr[12], (fArr[1] * f10) + (fArr[5] * f12) + (fArr[9] * f14) + fArr[13], (f10 * fArr[2]) + (f12 * fArr[6]) + (f14 * fArr[10]) + fArr[14]);
    }

    public d0 k1(y yVar) {
        return yVar.h0(this);
    }

    public d0 l1(float[] fArr) {
        float f10 = this.f180482a;
        float f11 = fArr[0] * f10;
        float f12 = this.f180483b;
        float f13 = f11 + (fArr[3] * f12);
        float f14 = this.f180484c;
        return y0(f13 + (fArr[6] * f14) + fArr[9], (fArr[1] * f10) + (fArr[4] * f12) + (fArr[7] * f14) + fArr[10], (f10 * fArr[2]) + (f12 * fArr[5]) + (f14 * fArr[8]) + fArr[11]);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public d0 g(d0 d0Var, float f10) {
        this.f180482a += d0Var.f180482a * f10;
        this.f180483b += d0Var.f180483b * f10;
        this.f180484c += d0Var.f180484c * f10;
        return this;
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public d0 r(d0 d0Var, d0 d0Var2) {
        this.f180482a += d0Var.f180482a * d0Var2.f180482a;
        this.f180483b += d0Var.f180483b * d0Var2.f180483b;
        this.f180484c += d0Var.f180484c * d0Var2.f180484c;
        return this;
    }

    @Override // com.planner5d.library.math.m
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d0 u0() {
        float fW = w();
        if (fW != 0.0f && fW != 1.0f) {
            return c(1.0f / ((float) Math.sqrt(fW)));
        }
        return this;
    }

    public d0 p1(Matrix4 matrix4) {
        float[] fArr = matrix4.f94875a;
        float f10 = this.f180482a;
        float f11 = fArr[3] * f10;
        float f12 = this.f180483b;
        float f13 = f11 + (fArr[7] * f12);
        float f14 = this.f180484c;
        float f15 = 1.0f / ((f13 + (fArr[11] * f14)) + fArr[15]);
        int i10 = 6 & 2;
        return y0(((fArr[0] * f10) + (fArr[4] * f12) + (fArr[8] * f14) + fArr[12]) * f15, ((fArr[1] * f10) + (fArr[5] * f12) + (fArr[9] * f14) + fArr[13]) * f15, ((f10 * fArr[2]) + (f12 * fArr[6]) + (f14 * fArr[10]) + fArr[14]) * f15);
    }

    public d0 q1(Matrix4 matrix4) {
        float[] fArr = matrix4.f94875a;
        float f10 = this.f180482a;
        float f11 = fArr[0] * f10;
        float f12 = this.f180483b;
        float f13 = f11 + (fArr[4] * f12);
        float f14 = this.f180484c;
        return y0(f13 + (fArr[8] * f14), (fArr[1] * f10) + (fArr[5] * f12) + (fArr[9] * f14), (f10 * fArr[2]) + (f12 * fArr[6]) + (f14 * fArr[10]));
    }

    public d0 r1(float f10, float f11, float f12, float f13) {
        return j1(f94934i.d0(f11, f12, f13, f10));
    }

    public d0 s1(d0 d0Var, float f10) {
        Matrix4 matrix4 = f94934i;
        matrix4.f0(d0Var, f10);
        return j1(matrix4);
    }

    @Override // com.planner5d.library.math.m, com.badlogic.gdx.math.e0
    public float t() {
        float f10 = this.f180482a;
        float f11 = this.f180483b;
        float f12 = this.f180484c;
        return (float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12));
    }

    public d0 t1(float f10, float f11, float f12, float f13) {
        return j1(f94934i.h0(f11, f12, f13, f10));
    }

    @Override // com.planner5d.library.math.m
    public String toString() {
        return "[" + this.f180482a + ", " + this.f180483b + ", " + this.f180484c + "]";
    }

    public d0 u1(d0 d0Var, float f10) {
        Matrix4 matrix4 = f94934i;
        matrix4.i0(d0Var, f10);
        return j1(matrix4);
    }

    @Override // com.planner5d.library.math.m
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d0 v0(float f10) {
        return y0(this.f180482a * f10, this.f180483b * f10, this.f180484c * f10);
    }

    @Override // com.planner5d.library.math.m, com.badlogic.gdx.math.e0
    public float w() {
        float f10 = this.f180482a;
        float f11 = this.f180483b;
        float f12 = this.f180484c;
        return (f10 * f10) + (f11 * f11) + (f12 * f12);
    }

    @Override // com.planner5d.library.math.m
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public d0 w0(float f10, float f11, float f12) {
        return y0(this.f180482a * f10, this.f180483b * f11, this.f180484c * f12);
    }

    @Override // com.badlogic.gdx.math.e0
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public d0 v(d0 d0Var) {
        return y0(this.f180482a * d0Var.f180482a, this.f180483b * d0Var.f180483b, this.f180484c * d0Var.f180484c);
    }

    @Override // com.planner5d.library.math.m
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public d0 y0(float f10, float f11, float f12) {
        this.f180482a = f10;
        this.f180483b = f11;
        this.f180484c = f12;
        return this;
    }

    public d0 z1(c0 c0Var, float f10) {
        return y0(c0Var.f94907a, c0Var.f94908b, f10);
    }

    public d0(float f10, float f11, float f12) {
        y0(f10, f11, f12);
    }

    public d0(d0 d0Var) {
        L(d0Var);
    }

    public d0(float[] fArr) {
        y0(fArr[0], fArr[1], fArr[2]);
    }

    public d0(c0 c0Var, float f10) {
        y0(c0Var.f94907a, c0Var.f94908b, f10);
    }
}
