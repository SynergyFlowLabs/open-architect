package com.badlogic.gdx.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class t implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f95086c = 7907569533774959788L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f95087d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f95088e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f95089f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f95090g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f95091h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f95092i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f95093j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f95094k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f95095l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f95096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f95097b;

    public t() {
        this.f95096a = new float[9];
        this.f95097b = new float[9];
        g();
    }

    private static void j(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0];
        float f12 = fArr[3];
        float f13 = fArr2[1];
        float f14 = fArr[6];
        float f15 = fArr2[2];
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = fArr2[3];
        float f18 = fArr2[4];
        float f19 = fArr2[5];
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = fArr2[6];
        float f22 = fArr2[7];
        float f23 = fArr2[8];
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = fArr[1];
        float f26 = fArr[4];
        float f27 = fArr[7];
        float f28 = (f25 * f11) + (f26 * f13) + (f27 * f15);
        float f29 = (f25 * f17) + (f26 * f18) + (f27 * f19);
        float f30 = (f25 * f21) + (f26 * f22) + (f27 * f23);
        float f31 = fArr[2];
        float f32 = fArr[5];
        float f33 = (f11 * f31) + (f13 * f32);
        float f34 = fArr[8];
        fArr[0] = f16;
        fArr[1] = f28;
        fArr[2] = f33 + (f15 * f34);
        fArr[3] = f20;
        fArr[4] = f29;
        fArr[5] = (f17 * f31) + (f18 * f32) + (f19 * f34);
        fArr[6] = f24;
        fArr[7] = f30;
        fArr[8] = (f31 * f21) + (f32 * f22) + (f34 * f23);
    }

    public t A(float f10, float f11) {
        float[] fArr = this.f95096a;
        fArr[0] = f10;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = f11;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public t B(c0 c0Var) {
        float[] fArr = this.f95096a;
        fArr[0] = c0Var.f94907a;
        boolean z10 = false | true;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = c0Var.f94908b;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public t C(float f10, float f11) {
        float[] fArr = this.f95096a;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        int i10 = 1 << 2;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = f10;
        fArr[7] = f11;
        fArr[8] = 1.0f;
        return this;
    }

    public t D(c0 c0Var) {
        float[] fArr = this.f95096a;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = c0Var.f94907a;
        fArr[7] = c0Var.f94908b;
        fArr[8] = 1.0f;
        return this;
    }

    public t E(float f10, float f11) {
        float[] fArr = this.f95096a;
        float[] fArr2 = this.f95097b;
        fArr2[0] = 1.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 1.0f;
        fArr2[5] = 0.0f;
        fArr2[6] = f10;
        fArr2[7] = f11;
        fArr2[8] = 1.0f;
        j(fArr, fArr2);
        return this;
    }

    public t F(c0 c0Var) {
        float[] fArr = this.f95096a;
        float[] fArr2 = this.f95097b;
        fArr2[0] = 1.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 1.0f;
        fArr2[5] = 0.0f;
        fArr2[6] = c0Var.f94907a;
        fArr2[7] = c0Var.f94908b;
        fArr2[8] = 1.0f;
        j(fArr, fArr2);
        return this;
    }

    public t G() {
        float[] fArr = this.f95096a;
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[7];
        fArr[3] = f10;
        fArr[6] = f11;
        fArr[1] = f12;
        fArr[7] = f13;
        fArr[2] = f14;
        fArr[5] = f15;
        return this;
    }

    public t H(float f10, float f11) {
        float[] fArr = this.f95096a;
        fArr[6] = fArr[6] + f10;
        fArr[7] = fArr[7] + f11;
        return this;
    }

    public t I(c0 c0Var) {
        float[] fArr = this.f95096a;
        fArr[6] = fArr[6] + c0Var.f94907a;
        fArr[7] = fArr[7] + c0Var.f94908b;
        return this;
    }

    public t J(d0 d0Var) {
        float[] fArr = this.f95096a;
        fArr[6] = fArr[6] + d0Var.f180482a;
        fArr[7] = fArr[7] + d0Var.f180483b;
        return this;
    }

    public float a() {
        float[] fArr = this.f95096a;
        float f10 = fArr[0];
        float f11 = fArr[4];
        float f12 = fArr[8];
        float f13 = fArr[3];
        float f14 = fArr[7];
        float f15 = fArr[2];
        float f16 = (f10 * f11 * f12) + (f13 * f14 * f15);
        float f17 = fArr[6];
        float f18 = fArr[1];
        float f19 = fArr[5];
        return (((f16 + ((f17 * f18) * f19)) - ((f10 * f14) * f19)) - ((f13 * f18) * f12)) - ((f17 * f11) * f15);
    }

    public float b() {
        float[] fArr = this.f95096a;
        return ((float) Math.atan2(fArr[1], fArr[0])) * 57.295776f;
    }

    public float c() {
        float[] fArr = this.f95096a;
        return (float) Math.atan2(fArr[1], fArr[0]);
    }

    public c0 d(c0 c0Var) {
        float[] fArr = this.f95096a;
        float f10 = fArr[0];
        float f11 = fArr[3];
        c0Var.f94907a = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr[1];
        float f13 = fArr[4];
        c0Var.f94908b = (float) Math.sqrt((f12 * f12) + (f13 * f13));
        return c0Var;
    }

    public c0 e(c0 c0Var) {
        float[] fArr = this.f95096a;
        c0Var.f94907a = fArr[6];
        c0Var.f94908b = fArr[7];
        return c0Var;
    }

    public float[] f() {
        return this.f95096a;
    }

    public t g() {
        float[] fArr = this.f95096a;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public t h() {
        float fA = a();
        if (fA == 0.0f) {
            throw new com.badlogic.gdx.utils.t("Can't invert a singular matrix");
        }
        float f10 = 1.0f / fA;
        float[] fArr = this.f95097b;
        float[] fArr2 = this.f95096a;
        float f11 = fArr2[4];
        float f12 = fArr2[8];
        float f13 = fArr2[5];
        float f14 = fArr2[7];
        float f15 = (f11 * f12) - (f13 * f14);
        fArr[0] = f15;
        float f16 = fArr2[2];
        float f17 = (f16 * f14) - (fArr2[1] * f12);
        fArr[1] = f17;
        float f18 = fArr2[1];
        float f19 = (f18 * f13) - (f16 * f11);
        fArr[2] = f19;
        float f20 = fArr2[6];
        float f21 = (f13 * f20) - (fArr2[3] * f12);
        fArr[3] = f21;
        float f22 = fArr2[0];
        float f23 = fArr2[2];
        float f24 = (f12 * f22) - (f23 * f20);
        fArr[4] = f24;
        float f25 = fArr2[3];
        float f26 = (f23 * f25) - (f13 * f22);
        fArr[5] = f26;
        float f27 = fArr2[4];
        float f28 = (f25 * f14) - (f20 * f27);
        fArr[6] = f28;
        float f29 = (fArr2[6] * f18) - (f14 * f22);
        fArr[7] = f29;
        float f30 = (f22 * f27) - (f18 * f25);
        fArr[8] = f30;
        fArr2[0] = f15 * f10;
        fArr2[1] = f17 * f10;
        fArr2[2] = f19 * f10;
        fArr2[3] = f21 * f10;
        fArr2[4] = f24 * f10;
        fArr2[5] = f26 * f10;
        fArr2[6] = f28 * f10;
        fArr2[7] = f29 * f10;
        fArr2[8] = f10 * f30;
        return this;
    }

    public t i(t tVar) {
        float[] fArr = this.f95096a;
        float f10 = fArr[0];
        float[] fArr2 = tVar.f95096a;
        float f11 = fArr2[0];
        float f12 = fArr[3];
        float f13 = fArr2[1];
        float f14 = fArr[6];
        float f15 = fArr2[2];
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = fArr2[3];
        float f18 = fArr2[4];
        float f19 = fArr2[5];
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = fArr2[6];
        float f22 = fArr2[7];
        float f23 = fArr2[8];
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = fArr[1];
        float f26 = fArr[4];
        float f27 = fArr[7];
        float f28 = (f25 * f11) + (f26 * f13) + (f27 * f15);
        float f29 = (f25 * f17) + (f26 * f18) + (f27 * f19);
        float f30 = (f25 * f21) + (f26 * f22) + (f27 * f23);
        float f31 = fArr[2];
        float f32 = fArr[5];
        float f33 = (f11 * f31) + (f13 * f32);
        float f34 = fArr[8];
        fArr[0] = f16;
        fArr[1] = f28;
        fArr[2] = f33 + (f15 * f34);
        fArr[3] = f20;
        fArr[4] = f29;
        fArr[5] = (f17 * f31) + (f18 * f32) + (f19 * f34);
        fArr[6] = f24;
        fArr[7] = f30;
        fArr[8] = (f31 * f21) + (f32 * f22) + (f34 * f23);
        return this;
    }

    public t k(t tVar) {
        float[] fArr = this.f95096a;
        float[] fArr2 = tVar.f95096a;
        float f10 = fArr2[0];
        float f11 = fArr[0];
        float f12 = fArr2[3];
        float f13 = fArr[1];
        float f14 = fArr2[6];
        float f15 = fArr[2];
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = fArr[3];
        float f18 = fArr[4];
        float f19 = fArr[5];
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = fArr[6];
        float f22 = fArr[7];
        float f23 = fArr[8];
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = fArr2[1];
        float f26 = fArr2[4];
        float f27 = fArr2[7];
        float f28 = (f25 * f11) + (f26 * f13) + (f27 * f15);
        float f29 = (f25 * f17) + (f26 * f18) + (f27 * f19);
        float f30 = (f25 * f21) + (f26 * f22) + (f27 * f23);
        float f31 = fArr2[2];
        float f32 = fArr2[5];
        float f33 = fArr2[8];
        fArr[0] = f16;
        fArr[1] = f28;
        fArr[2] = (f11 * f31) + (f13 * f32) + (f15 * f33);
        fArr[3] = f20;
        fArr[4] = f29;
        fArr[5] = (f17 * f31) + (f18 * f32) + (f19 * f33);
        fArr[6] = f24;
        fArr[7] = f30;
        fArr[8] = (f31 * f21) + (f32 * f22) + (f33 * f23);
        return this;
    }

    public t l(float f10) {
        return m(f10 * 0.017453292f);
    }

    public t m(float f10) {
        if (f10 == 0.0f) {
            return this;
        }
        double d10 = f10;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float[] fArr = this.f95097b;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[2] = 0.0f;
        fArr[3] = -fSin;
        fArr[4] = fCos;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        j(this.f95096a, fArr);
        return this;
    }

    public t n(float f10, float f11) {
        float[] fArr = this.f95097b;
        fArr[0] = f10;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = f11;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        j(this.f95096a, fArr);
        return this;
    }

    public t o(c0 c0Var) {
        float[] fArr = this.f95097b;
        fArr[0] = c0Var.f94907a;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = c0Var.f94908b;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        j(this.f95096a, fArr);
        return this;
    }

    public t p(float f10) {
        float[] fArr = this.f95096a;
        fArr[0] = fArr[0] * f10;
        fArr[4] = fArr[4] * f10;
        return this;
    }

    public t q(c0 c0Var) {
        float[] fArr = this.f95096a;
        fArr[0] = fArr[0] * c0Var.f94907a;
        fArr[4] = fArr[4] * c0Var.f94908b;
        return this;
    }

    public t r(d0 d0Var) {
        float[] fArr = this.f95096a;
        fArr[0] = fArr[0] * d0Var.f180482a;
        fArr[4] = fArr[4] * d0Var.f180483b;
        return this;
    }

    public t s(a aVar) {
        float[] fArr = this.f95096a;
        fArr[0] = aVar.f94877a;
        fArr[1] = aVar.f94880d;
        fArr[2] = 0.0f;
        fArr[3] = aVar.f94878b;
        fArr[4] = aVar.f94881e;
        fArr[5] = 0.0f;
        fArr[6] = aVar.f94879c;
        fArr[7] = aVar.f94882f;
        fArr[8] = 1.0f;
        return this;
    }

    public t t(t tVar) {
        float[] fArr = tVar.f95096a;
        float[] fArr2 = this.f95096a;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        return this;
    }

    public String toString() {
        float[] fArr = this.f95096a;
        return "[" + fArr[0] + "|" + fArr[3] + "|" + fArr[6] + "]\n[" + fArr[1] + "|" + fArr[4] + "|" + fArr[7] + "]\n[" + fArr[2] + "|" + fArr[5] + "|" + fArr[8] + "]";
    }

    public t u(Matrix4 matrix4) {
        float[] fArr = this.f95096a;
        float[] fArr2 = matrix4.f94875a;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[4];
        int i10 = 3 >> 5;
        fArr[4] = fArr2[5];
        fArr[5] = fArr2[6];
        fArr[6] = fArr2[8];
        fArr[7] = fArr2[9];
        fArr[8] = fArr2[10];
        return this;
    }

    public t v(float[] fArr) {
        float[] fArr2 = this.f95096a;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        return this;
    }

    public t w(float f10) {
        return z(f10 * 0.017453292f);
    }

    public t x(d0 d0Var, float f10) {
        return y(d0Var, s.j(f10), s.M(f10));
    }

    public t y(d0 d0Var, float f10, float f11) {
        float[] fArr = this.f95096a;
        float f12 = 1.0f - f10;
        float f13 = d0Var.f180482a;
        fArr[0] = (f12 * f13 * f13) + f10;
        float f14 = d0Var.f180483b;
        float f15 = d0Var.f180484c;
        fArr[1] = ((f12 * f13) * f14) - (f15 * f11);
        fArr[2] = (f12 * f15 * f13) + (f14 * f11);
        fArr[3] = (f12 * f13 * f14) + (f15 * f11);
        fArr[4] = (f12 * f14 * f14) + f10;
        fArr[5] = ((f12 * f14) * f15) - (f13 * f11);
        fArr[6] = ((f12 * f15) * f13) - (f14 * f11);
        fArr[7] = (f14 * f12 * f15) + (f13 * f11);
        fArr[8] = (f12 * f15 * f15) + f10;
        return this;
    }

    public t z(float f10) {
        double d10 = f10;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float[] fArr = this.f95096a;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[2] = 0.0f;
        fArr[3] = -fSin;
        fArr[4] = fCos;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public t(t tVar) {
        this.f95096a = new float[9];
        this.f95097b = new float[9];
        t(tVar);
    }

    public t(float[] fArr) {
        this.f95096a = new float[9];
        this.f95097b = new float[9];
        v(fArr);
    }
}
