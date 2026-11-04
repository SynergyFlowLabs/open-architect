package com.planner5d.library.engine.util.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class f implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f165472c = 7907569533774959788L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f165473d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f165474e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f165475f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f165476g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f165477h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f165478i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f165479j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f165480k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f165481l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f165482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f165483b;

    public f() {
        this.f165482a = new float[9];
        this.f165483b = new float[9];
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

    public f A(float f10, float f11) {
        float[] fArr = this.f165482a;
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

    public f B(com.planner5d.library.math.k kVar) {
        float[] fArr = this.f165482a;
        fArr[0] = kVar.f180480a;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = kVar.f180481b;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public f C(float f10, float f11) {
        float[] fArr = this.f165482a;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = f10;
        fArr[7] = f11;
        fArr[8] = 1.0f;
        return this;
    }

    public f D(com.planner5d.library.math.k kVar) {
        float[] fArr = this.f165482a;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = kVar.f180480a;
        fArr[7] = kVar.f180481b;
        fArr[8] = 1.0f;
        return this;
    }

    public f E(float f10, float f11) {
        float[] fArr = this.f165482a;
        float[] fArr2 = this.f165483b;
        fArr2[0] = 1.0f;
        int i10 = 5 ^ 1;
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

    public f F(com.planner5d.library.math.k kVar) {
        float[] fArr = this.f165482a;
        float[] fArr2 = this.f165483b;
        fArr2[0] = 1.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 1.0f;
        fArr2[5] = 0.0f;
        fArr2[6] = kVar.f180480a;
        fArr2[7] = kVar.f180481b;
        fArr2[8] = 1.0f;
        j(fArr, fArr2);
        return this;
    }

    public f G() {
        float[] fArr = this.f165482a;
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

    public f H(float f10, float f11) {
        float[] fArr = this.f165482a;
        fArr[6] = fArr[6] + f10;
        fArr[7] = fArr[7] + f11;
        return this;
    }

    public f I(com.planner5d.library.math.k kVar) {
        float[] fArr = this.f165482a;
        fArr[6] = fArr[6] + kVar.f180480a;
        fArr[7] = fArr[7] + kVar.f180481b;
        return this;
    }

    public f J(com.planner5d.library.math.m mVar) {
        float[] fArr = this.f165482a;
        fArr[6] = fArr[6] + mVar.f180482a;
        fArr[7] = fArr[7] + mVar.f180483b;
        return this;
    }

    public float a() {
        float[] fArr = this.f165482a;
        float f10 = fArr[0];
        float f11 = fArr[4];
        float f12 = fArr[8];
        int i10 = 2 & 3;
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
        float[] fArr = this.f165482a;
        return ((float) Math.atan2(fArr[1], fArr[0])) * 57.295776f;
    }

    public float c() {
        float[] fArr = this.f165482a;
        return (float) Math.atan2(fArr[1], fArr[0]);
    }

    public com.planner5d.library.math.k d(com.planner5d.library.math.k kVar) {
        float[] fArr = this.f165482a;
        float f10 = fArr[0];
        float f11 = fArr[3];
        kVar.f180480a = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr[1];
        float f13 = fArr[4];
        kVar.f180481b = (float) Math.sqrt((f12 * f12) + (f13 * f13));
        return kVar;
    }

    public com.planner5d.library.math.k e(com.planner5d.library.math.k kVar) {
        float[] fArr = this.f165482a;
        kVar.f180480a = fArr[6];
        kVar.f180481b = fArr[7];
        return kVar;
    }

    public float[] f() {
        return this.f165482a;
    }

    public f g() {
        float[] fArr = this.f165482a;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        int i10 = 2 ^ 7;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public f h() {
        float fA = a();
        if (fA == 0.0f) {
            throw new RuntimeException("Can't invert a singular matrix");
        }
        float f10 = 1.0f / fA;
        float[] fArr = this.f165483b;
        float[] fArr2 = this.f165482a;
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

    public f i(f fVar) {
        float[] fArr = this.f165482a;
        float f10 = fArr[0];
        float[] fArr2 = fVar.f165482a;
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

    public f k(f fVar) {
        float[] fArr = this.f165482a;
        float[] fArr2 = fVar.f165482a;
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

    public f l(float f10) {
        return m(f10 * 0.017453292f);
    }

    public f m(float f10) {
        if (f10 == 0.0f) {
            return this;
        }
        double d10 = f10;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float[] fArr = this.f165483b;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[2] = 0.0f;
        fArr[3] = -fSin;
        fArr[4] = fCos;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        j(this.f165482a, fArr);
        return this;
    }

    public f n(float f10, float f11) {
        float[] fArr = this.f165483b;
        fArr[0] = f10;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = f11;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        j(this.f165482a, fArr);
        return this;
    }

    public f o(com.planner5d.library.math.k kVar) {
        float[] fArr = this.f165483b;
        fArr[0] = kVar.f180480a;
        int i10 = 5 << 0;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = kVar.f180481b;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        j(this.f165482a, fArr);
        return this;
    }

    public f p(float f10) {
        float[] fArr = this.f165482a;
        fArr[0] = fArr[0] * f10;
        fArr[4] = fArr[4] * f10;
        return this;
    }

    public f q(com.planner5d.library.math.k kVar) {
        float[] fArr = this.f165482a;
        fArr[0] = fArr[0] * kVar.f180480a;
        fArr[4] = fArr[4] * kVar.f180481b;
        return this;
    }

    public f r(com.planner5d.library.math.m mVar) {
        float[] fArr = this.f165482a;
        fArr[0] = fArr[0] * mVar.f180482a;
        fArr[4] = fArr[4] * mVar.f180483b;
        return this;
    }

    public f s(a aVar) {
        float[] fArr = this.f165482a;
        fArr[0] = aVar.f165414a;
        fArr[1] = aVar.f165417d;
        fArr[2] = 0.0f;
        fArr[3] = aVar.f165415b;
        fArr[4] = aVar.f165418e;
        fArr[5] = 0.0f;
        fArr[6] = aVar.f165416c;
        fArr[7] = aVar.f165419f;
        fArr[8] = 1.0f;
        return this;
    }

    public f t(f fVar) {
        float[] fArr = fVar.f165482a;
        float[] fArr2 = this.f165482a;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        return this;
    }

    public String toString() {
        float[] fArr = this.f165482a;
        return "[" + fArr[0] + "|" + fArr[3] + "|" + fArr[6] + "]\n[" + fArr[1] + "|" + fArr[4] + "|" + fArr[7] + "]\n[" + fArr[2] + "|" + fArr[5] + "|" + fArr[8] + "]";
    }

    public f u(Matrix4 matrix4) {
        float[] fArr = this.f165482a;
        float[] fArr2 = matrix4.f165412a;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[4];
        fArr[4] = fArr2[5];
        fArr[5] = fArr2[6];
        fArr[6] = fArr2[8];
        fArr[7] = fArr2[9];
        fArr[8] = fArr2[10];
        return this;
    }

    public f v(float[] fArr) {
        float[] fArr2 = this.f165482a;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        return this;
    }

    public f w(float f10) {
        return z(f10 * 0.017453292f);
    }

    public f x(com.planner5d.library.math.m mVar, float f10) {
        return y(mVar, e.j(f10), e.M(f10));
    }

    public f y(com.planner5d.library.math.m mVar, float f10, float f11) {
        float[] fArr = this.f165482a;
        float f12 = 1.0f - f10;
        float f13 = mVar.f180482a;
        fArr[0] = (f12 * f13 * f13) + f10;
        float f14 = mVar.f180483b;
        float f15 = mVar.f180484c;
        fArr[1] = ((f12 * f13) * f14) - (f15 * f11);
        fArr[2] = (f12 * f15 * f13) + (f14 * f11);
        int i10 = 5 | 3;
        fArr[3] = (f12 * f13 * f14) + (f15 * f11);
        fArr[4] = (f12 * f14 * f14) + f10;
        fArr[5] = ((f12 * f14) * f15) - (f13 * f11);
        fArr[6] = ((f12 * f15) * f13) - (f14 * f11);
        fArr[7] = (f14 * f12 * f15) + (f13 * f11);
        fArr[8] = (f12 * f15 * f15) + f10;
        return this;
    }

    public f z(float f10) {
        double d10 = f10;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float[] fArr = this.f165482a;
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

    public f(f fVar) {
        this.f165482a = new float[9];
        this.f165483b = new float[9];
        t(fVar);
    }

    public f(float[] fArr) {
        this.f165482a = new float[9];
        this.f165483b = new float[9];
        v(fArr);
    }
}
