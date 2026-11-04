package com.planner5d.library.engine.util.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f165502e = -7661875440774897168L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f165503f = new i(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static i f165504g = new i(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f165505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f165506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f165507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f165508d;

    public i(float f10, float f11, float f12, float f13) {
        M(f10, f11, f12, f13);
    }

    public static final float D(float f10, float f11, float f12, float f13) {
        return (float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12) + (f13 * f13));
    }

    public static final float F(float f10, float f11, float f12, float f13) {
        return (f10 * f10) + (f11 * f11) + (f12 * f12) + (f13 * f13);
    }

    public static final float f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return (f10 * f14) + (f11 * f15) + (f12 * f16) + (f13 * f17);
    }

    private float i0(float f10, float f11, float f12, float f13, float f14, float f15) {
        return (f10 * f13) + (f11 * f14) + (f12 * f15);
    }

    private float j0(float f10, float f11, float f12) {
        return (float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12));
    }

    public boolean A() {
        return e.p(this.f165505a) && e.p(this.f165506b) && e.p(this.f165507c) && e.m(this.f165508d, 1.0f);
    }

    public boolean B(float f10) {
        return e.q(this.f165505a, f10) && e.q(this.f165506b, f10) && e.q(this.f165507c, f10) && e.n(this.f165508d, 1.0f, f10);
    }

    public float C() {
        float f10 = this.f165505a;
        float f11 = this.f165506b;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = this.f165507c;
        float f14 = this.f165508d;
        return (float) Math.sqrt(f12 + (f13 * f13) + (f14 * f14));
    }

    public float E() {
        float f10 = this.f165505a;
        float f11 = this.f165506b;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = this.f165507c;
        float f14 = this.f165508d;
        return f12 + (f13 * f13) + (f14 * f14);
    }

    public i G(float f10) {
        this.f165505a *= f10;
        this.f165506b *= f10;
        this.f165507c *= f10;
        this.f165508d *= f10;
        return this;
    }

    public i H(float f10, float f11, float f12, float f13) {
        float f14 = this.f165508d;
        float f15 = this.f165505a;
        float f16 = this.f165506b;
        float f17 = this.f165507c;
        this.f165505a = (((f14 * f10) + (f15 * f13)) + (f16 * f12)) - (f17 * f11);
        this.f165506b = (((f14 * f11) + (f16 * f13)) + (f17 * f10)) - (f15 * f12);
        this.f165507c = (((f14 * f12) + (f17 * f13)) + (f15 * f11)) - (f16 * f10);
        this.f165508d = (((f14 * f13) - (f15 * f10)) - (f16 * f11)) - (f17 * f12);
        return this;
    }

    public i I(i iVar) {
        float f10 = this.f165508d;
        float f11 = iVar.f165505a;
        float f12 = this.f165505a;
        float f13 = iVar.f165508d;
        float f14 = this.f165506b;
        float f15 = iVar.f165507c;
        float f16 = this.f165507c;
        float f17 = iVar.f165506b;
        this.f165505a = (((f10 * f11) + (f12 * f13)) + (f14 * f15)) - (f16 * f17);
        this.f165506b = (((f10 * f17) + (f14 * f13)) + (f16 * f11)) - (f12 * f15);
        this.f165507c = (((f10 * f15) + (f16 * f13)) + (f12 * f17)) - (f14 * f11);
        this.f165508d = (((f10 * f13) - (f12 * f11)) - (f14 * f17)) - (f16 * f15);
        return this;
    }

    public i J(float f10, float f11, float f12, float f13) {
        float f14 = this.f165505a;
        float f15 = this.f165508d;
        float f16 = this.f165507c;
        float f17 = (((f13 * f14) + (f10 * f15)) + (f11 * f16)) - (f12 * f11);
        float f18 = this.f165506b;
        this.f165505a = f17;
        this.f165506b = (((f13 * f18) + (f11 * f15)) + (f12 * f14)) - (f10 * f12);
        this.f165507c = (((f16 * f13) + (f12 * f15)) + (f10 * f18)) - (f11 * f10);
        this.f165508d = (((f13 * f15) - (f10 * f14)) - (f11 * f18)) - (f12 * f12);
        return this;
    }

    public i K(i iVar) {
        float f10 = iVar.f165508d;
        float f11 = this.f165505a;
        float f12 = iVar.f165505a;
        float f13 = this.f165508d;
        float f14 = iVar.f165506b;
        float f15 = this.f165507c;
        float f16 = iVar.f165507c;
        float f17 = this.f165506b;
        this.f165505a = (((f10 * f11) + (f12 * f13)) + (f14 * f15)) - (f16 * f17);
        this.f165506b = (((f10 * f17) + (f14 * f13)) + (f16 * f11)) - (f12 * f15);
        this.f165507c = (((f10 * f15) + (f16 * f13)) + (f12 * f17)) - (f14 * f11);
        this.f165508d = (((f10 * f13) - (f12 * f11)) - (f14 * f17)) - (f16 * f15);
        return this;
    }

    public i L() {
        float fE = E();
        if (fE != 0.0f && !e.m(fE, 1.0f)) {
            float fSqrt = (float) Math.sqrt(fE);
            this.f165508d /= fSqrt;
            this.f165505a /= fSqrt;
            this.f165506b /= fSqrt;
            this.f165507c /= fSqrt;
        }
        return this;
    }

    public i M(float f10, float f11, float f12, float f13) {
        this.f165505a = f10;
        this.f165506b = f11;
        this.f165507c = f12;
        this.f165508d = f13;
        return this;
    }

    public i N(i iVar) {
        return M(iVar.f165505a, iVar.f165506b, iVar.f165507c, iVar.f165508d);
    }

    public i O(com.planner5d.library.math.m mVar, float f10) {
        return T(mVar.f180482a, mVar.f180483b, mVar.f180484c, f10);
    }

    public i P(float f10, float f11, float f12) {
        return Q(f10 * 0.017453292f, f11 * 0.017453292f, f12 * 0.017453292f);
    }

    public i Q(float f10, float f11, float f12) {
        double d10 = f12 * 0.5f;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        double d11 = f11 * 0.5f;
        float fSin2 = (float) Math.sin(d11);
        float fCos2 = (float) Math.cos(d11);
        double d12 = f10 * 0.5f;
        float fSin3 = (float) Math.sin(d12);
        float fCos3 = (float) Math.cos(d12);
        float f13 = fCos3 * fSin2;
        float f14 = fSin3 * fCos2;
        float f15 = fCos3 * fCos2;
        float f16 = fSin3 * fSin2;
        this.f165505a = (f13 * fCos) + (f14 * fSin);
        this.f165506b = (f14 * fCos) - (f13 * fSin);
        this.f165507c = (f15 * fSin) - (f16 * fCos);
        this.f165508d = (f15 * fCos) + (f16 * fSin);
        return this;
    }

    public i R(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        return S(false, f10, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    public i S(boolean z10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (z10) {
            float fJ0 = 1.0f / j0(f10, f11, f12);
            float fJ1 = 1.0f / j0(f13, f14, f15);
            float fJ2 = 1.0f / j0(f16, f17, f18);
            f10 *= fJ0;
            f11 *= fJ0;
            f12 *= fJ0;
            f14 *= fJ1;
            f15 = f15 * fJ1 * fJ1;
            f16 *= fJ2;
            f17 *= fJ2;
            f18 *= fJ2;
        }
        float f19 = f10 + f14 + f18;
        if (f19 >= 0.0f) {
            float fSqrt = (float) Math.sqrt(f19 + 1.0f);
            this.f165508d = fSqrt * 0.5f;
            float f20 = 0.5f / fSqrt;
            this.f165505a = (f17 - f15) * f20;
            this.f165506b = (f12 - f16) * f20;
            this.f165507c = (f13 - f11) * f20;
            return this;
        }
        if (f10 > f14 && f10 > f18) {
            float fSqrt2 = (float) Math.sqrt(((((double) f10) + 1.0d) - ((double) f14)) - ((double) f18));
            this.f165505a = fSqrt2 * 0.5f;
            float f21 = 0.5f / fSqrt2;
            this.f165506b = (f13 + f11) * f21;
            this.f165507c = (f12 + f16) * f21;
            this.f165508d = (f17 - f15) * f21;
            return this;
        }
        if (f14 > f18) {
            float fSqrt3 = (float) Math.sqrt(((((double) f14) + 1.0d) - ((double) f10)) - ((double) f18));
            this.f165506b = fSqrt3 * 0.5f;
            float f22 = 0.5f / fSqrt3;
            this.f165505a = (f13 + f11) * f22;
            this.f165507c = (f17 + f15) * f22;
            this.f165508d = (f12 - f16) * f22;
            return this;
        }
        float fSqrt4 = (float) Math.sqrt(((((double) f18) + 1.0d) - ((double) f10)) - ((double) f14));
        this.f165507c = fSqrt4 * 0.5f;
        float f23 = 0.5f / fSqrt4;
        this.f165505a = (f12 + f16) * f23;
        this.f165506b = (f17 + f15) * f23;
        this.f165508d = (f13 - f11) * f23;
        return this;
    }

    public i T(float f10, float f11, float f12, float f13) {
        return V(f10, f11, f12, f13 * 0.017453292f);
    }

    public i U(com.planner5d.library.math.m mVar, float f10) {
        return T(mVar.f180482a, mVar.f180483b, mVar.f180484c, f10);
    }

    public i V(float f10, float f11, float f12, float f13) {
        float fJ0 = j0(f10, f11, f12);
        if (fJ0 == 0.0f) {
            return z();
        }
        float f14 = 1.0f / fJ0;
        double d10 = (f13 < 0.0f ? 6.2831855f - ((-f13) % 6.2831855f) : f13 % 6.2831855f) / 2.0f;
        float fSin = (float) Math.sin(d10);
        return M(f10 * f14 * fSin, f11 * f14 * fSin, f14 * f12 * fSin, (float) Math.cos(d10)).L();
    }

    public i W(com.planner5d.library.math.m mVar, float f10) {
        return V(mVar.f180482a, mVar.f180483b, mVar.f180484c, f10);
    }

    public i X(float f10, float f11, float f12, float f13, float f14, float f15) {
        return V((f11 * f15) - (f12 * f14), (f12 * f13) - (f15 * f10), (f10 * f14) - (f11 * f13), (float) Math.acos(e.e(i0(f10, f11, f12, f13, f14, f15), -1.0f, 1.0f)));
    }

    public i Y(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        float fAcos = (float) Math.acos(e.e(mVar.X(mVar2), -1.0f, 1.0f));
        float f10 = mVar.f180483b;
        float f11 = mVar2.f180484c;
        float f12 = mVar.f180484c;
        float f13 = mVar2.f180483b;
        float f14 = mVar2.f180482a;
        float f15 = mVar.f180482a;
        return V((f10 * f11) - (f12 * f13), (f12 * f14) - (f11 * f15), (f15 * f13) - (f10 * f14), fAcos);
    }

    public i Z(f fVar) {
        return b0(false, fVar);
    }

    public i a(float f10, float f11, float f12, float f13) {
        this.f165505a += f10;
        this.f165506b += f11;
        this.f165507c += f12;
        this.f165508d += f13;
        return this;
    }

    public i a0(Matrix4 matrix4) {
        return c0(false, matrix4);
    }

    public i b(i iVar) {
        this.f165505a += iVar.f165505a;
        this.f165506b += iVar.f165506b;
        this.f165507c += iVar.f165507c;
        this.f165508d += iVar.f165508d;
        return this;
    }

    public i b0(boolean z10, f fVar) {
        float[] fArr = fVar.f165482a;
        return S(z10, fArr[0], fArr[3], fArr[6], fArr[1], fArr[4], fArr[7], fArr[2], fArr[5], fArr[8]);
    }

    public i c() {
        this.f165505a = -this.f165505a;
        this.f165506b = -this.f165506b;
        this.f165507c = -this.f165507c;
        return this;
    }

    public i c0(boolean z10, Matrix4 matrix4) {
        float[] fArr = matrix4.f165412a;
        int i10 = 0 >> 5;
        return S(z10, fArr[0], fArr[4], fArr[8], fArr[1], fArr[5], fArr[9], fArr[2], fArr[6], fArr[10]);
    }

    public i d() {
        return new i(this);
    }

    public i d0(i iVar, float f10) {
        float f11 = (this.f165505a * iVar.f165505a) + (this.f165506b * iVar.f165506b) + (this.f165507c * iVar.f165507c) + (this.f165508d * iVar.f165508d);
        if (f11 < 0.0f) {
            f11 = -f11;
        }
        float fSin = 1.0f - f10;
        if (1.0f - f11 > 0.1d) {
            float fAcos = (float) Math.acos(f11);
            float fSin2 = 1.0f / ((float) Math.sin(fAcos));
            fSin = ((float) Math.sin(fSin * fAcos)) * fSin2;
            f10 = ((float) Math.sin(f10 * fAcos)) * fSin2;
        }
        if (f11 < 0.0f) {
            f10 = -f10;
        }
        this.f165505a = (this.f165505a * fSin) + (iVar.f165505a * f10);
        this.f165506b = (this.f165506b * fSin) + (iVar.f165506b * f10);
        this.f165507c = (this.f165507c * fSin) + (iVar.f165507c * f10);
        this.f165508d = (fSin * this.f165508d) + (f10 * iVar.f165508d);
        return this;
    }

    public float e(float f10, float f11, float f12, float f13) {
        return (this.f165505a * f10) + (this.f165506b * f11) + (this.f165507c * f12) + (this.f165508d * f13);
    }

    public i e0(i[] iVarArr) {
        float length = 1.0f / iVarArr.length;
        N(iVarArr[0]).h(length);
        for (int i10 = 1; i10 < iVarArr.length; i10++) {
            I(f165503f.N(iVarArr[i10]).h(length));
        }
        L();
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.floatToRawIntBits(this.f165508d) == Float.floatToRawIntBits(iVar.f165508d) && Float.floatToRawIntBits(this.f165505a) == Float.floatToRawIntBits(iVar.f165505a) && Float.floatToRawIntBits(this.f165506b) == Float.floatToRawIntBits(iVar.f165506b) && Float.floatToRawIntBits(this.f165507c) == Float.floatToRawIntBits(iVar.f165507c);
    }

    public i f0(i[] iVarArr, float[] fArr) {
        N(iVarArr[0]).h(fArr[0]);
        for (int i10 = 1; i10 < iVarArr.length; i10++) {
            I(f165503f.N(iVarArr[i10]).h(fArr[i10]));
        }
        L();
        return this;
    }

    public float g(i iVar) {
        return (this.f165505a * iVar.f165505a) + (this.f165506b * iVar.f165506b) + (this.f165507c * iVar.f165507c) + (this.f165508d * iVar.f165508d);
    }

    public void g0(float[] fArr) {
        float f10 = this.f165505a;
        float f11 = f10 * f10;
        float f12 = this.f165506b;
        float f13 = f10 * f12;
        float f14 = this.f165507c;
        float f15 = f10 * f14;
        float f16 = this.f165508d;
        float f17 = f10 * f16;
        float f18 = f12 * f12;
        float f19 = f12 * f14;
        float f20 = f12 * f16;
        float f21 = f14 * f14;
        float f22 = f14 * f16;
        fArr[0] = 1.0f - ((f18 + f21) * 2.0f);
        fArr[4] = (f13 - f22) * 2.0f;
        fArr[8] = (f15 + f20) * 2.0f;
        fArr[12] = 0.0f;
        fArr[1] = (f13 + f22) * 2.0f;
        fArr[5] = 1.0f - ((f21 + f11) * 2.0f);
        fArr[9] = (f19 - f17) * 2.0f;
        fArr[13] = 0.0f;
        fArr[2] = (f15 - f20) * 2.0f;
        fArr[6] = (f19 + f17) * 2.0f;
        fArr[10] = 1.0f - ((f11 + f18) * 2.0f);
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        int i10 = 0 ^ 7;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
    }

    public i h(float f10) {
        float fC = C();
        double d10 = fC;
        float fPow = (float) Math.pow(d10, f10);
        float fAcos = (float) Math.acos(this.f165508d / fC);
        float fSin = ((double) Math.abs(fAcos)) < 0.001d ? (fPow * f10) / fC : (float) ((((double) fPow) * Math.sin(f10 * fAcos)) / (d10 * Math.sin(fAcos)));
        this.f165508d = (float) (((double) fPow) * Math.cos(f10 * fAcos));
        this.f165505a *= fSin;
        this.f165506b *= fSin;
        this.f165507c *= fSin;
        L();
        return this;
    }

    public com.planner5d.library.math.m h0(com.planner5d.library.math.m mVar) {
        f165504g.N(this);
        f165504g.c();
        f165504g.K(f165503f.M(mVar.f180482a, mVar.f180483b, mVar.f180484c, 0.0f)).K(this);
        i iVar = f165504g;
        mVar.f180482a = iVar.f165505a;
        mVar.f180483b = iVar.f165506b;
        mVar.f180484c = iVar.f165507c;
        return mVar;
    }

    public int hashCode() {
        return ((((((Float.floatToRawIntBits(this.f165508d) + 31) * 31) + Float.floatToRawIntBits(this.f165505a)) * 31) + Float.floatToRawIntBits(this.f165506b)) * 31) + Float.floatToRawIntBits(this.f165507c);
    }

    public float i() {
        return n() * 57.295776f;
    }

    public float j(float f10, float f11, float f12) {
        return l(f10, f11, f12) * 57.295776f;
    }

    public float k(com.planner5d.library.math.m mVar) {
        return j(mVar.f180482a, mVar.f180483b, mVar.f180484c);
    }

    public float l(float f10, float f11, float f12) {
        float fI0 = i0(this.f165505a, this.f165506b, this.f165507c, f10, f11, f12);
        float F = F(f10 * fI0, f11 * fI0, f12 * fI0, this.f165508d);
        if (e.p(F)) {
            return 0.0f;
        }
        return (float) (Math.acos(e.e((float) (((double) this.f165508d) / Math.sqrt(F)), -1.0f, 1.0f)) * 2.0d);
    }

    public float m(com.planner5d.library.math.m mVar) {
        return l(mVar.f180482a, mVar.f180483b, mVar.f180484c);
    }

    public float n() {
        float fC = this.f165508d;
        if (fC > 1.0f) {
            fC /= C();
        }
        return (float) (Math.acos(fC) * 2.0d);
    }

    public float o(com.planner5d.library.math.m mVar) {
        return p(mVar) * 57.295776f;
    }

    public float p(com.planner5d.library.math.m mVar) {
        if (this.f165508d > 1.0f) {
            L();
        }
        float fAcos = (float) (Math.acos(this.f165508d) * 2.0d);
        float f10 = this.f165508d;
        double dSqrt = Math.sqrt(1.0f - (f10 * f10));
        if (dSqrt < 9.999999974752427E-7d) {
            mVar.f180482a = this.f165505a;
            mVar.f180483b = this.f165506b;
            mVar.f180484c = this.f165507c;
            return fAcos;
        }
        mVar.f180482a = (float) (((double) this.f165505a) / dSqrt);
        mVar.f180483b = (float) (((double) this.f165506b) / dSqrt);
        mVar.f180484c = (float) (((double) this.f165507c) / dSqrt);
        return fAcos;
    }

    public int q() {
        float f10 = (this.f165506b * this.f165505a) + (this.f165507c * this.f165508d);
        if (f10 > 0.499f) {
            return 1;
        }
        return f10 < -0.499f ? -1 : 0;
    }

    public float r() {
        return s() * 57.295776f;
    }

    public float s() {
        int iQ = q();
        return iQ == 0 ? (float) Math.asin(e.e(((this.f165508d * this.f165505a) - (this.f165507c * this.f165506b)) * 2.0f, -1.0f, 1.0f)) : iQ * 3.1415927f * 0.5f;
    }

    public float t() {
        return u() * 57.295776f;
    }

    public String toString() {
        return "[" + this.f165505a + "|" + this.f165506b + "|" + this.f165507c + "|" + this.f165508d + "]";
    }

    public float u() {
        int iQ = q();
        if (iQ != 0) {
            return iQ * 2.0f * e.a(this.f165506b, this.f165508d);
        }
        float f10 = this.f165508d;
        float f11 = this.f165507c;
        float f12 = this.f165506b;
        float f13 = this.f165505a;
        return e.a(((f10 * f11) + (f12 * f13)) * 2.0f, 1.0f - (((f13 * f13) + (f11 * f11)) * 2.0f));
    }

    public void v(float f10, float f11, float f12, i iVar, i iVar2) {
        float fI0 = i0(this.f165505a, this.f165506b, this.f165507c, f10, f11, f12);
        iVar2.M(f10 * fI0, f11 * fI0, f12 * fI0, this.f165508d).L();
        iVar.N(iVar2).c().K(this);
    }

    public void w(com.planner5d.library.math.m mVar, i iVar, i iVar2) {
        v(mVar.f180482a, mVar.f180483b, mVar.f180484c, iVar, iVar2);
    }

    public float x() {
        return y() * 57.295776f;
    }

    public float y() {
        if (q() != 0) {
            return 0.0f;
        }
        float f10 = this.f165506b;
        float f11 = this.f165508d * f10;
        float f12 = this.f165505a;
        return e.a((f11 + (this.f165507c * f12)) * 2.0f, 1.0f - (((f10 * f10) + (f12 * f12)) * 2.0f));
    }

    public i z() {
        return M(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public i() {
        z();
    }

    public i(i iVar) {
        N(iVar);
    }

    public i(com.planner5d.library.math.m mVar, float f10) {
        O(mVar, f10);
    }
}
