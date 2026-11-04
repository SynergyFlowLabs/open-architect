package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.h0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class y implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f95130e = -7661875440774897168L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static y f95131f = new y(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static y f95132g = new y(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f95133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f95134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f95135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f95136d;

    public y(float f10, float f11, float f12, float f13) {
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

    public boolean A() {
        return s.p(this.f95133a) && s.p(this.f95134b) && s.p(this.f95135c) && s.m(this.f95136d, 1.0f);
    }

    public boolean B(float f10) {
        return s.q(this.f95133a, f10) && s.q(this.f95134b, f10) && s.q(this.f95135c, f10) && s.n(this.f95136d, 1.0f, f10);
    }

    public float C() {
        float f10 = this.f95133a;
        float f11 = this.f95134b;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = this.f95135c;
        float f14 = this.f95136d;
        return (float) Math.sqrt(f12 + (f13 * f13) + (f14 * f14));
    }

    public float E() {
        float f10 = this.f95133a;
        float f11 = this.f95134b;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = this.f95135c;
        float f14 = this.f95136d;
        return f12 + (f13 * f13) + (f14 * f14);
    }

    public y G(float f10) {
        this.f95133a *= f10;
        this.f95134b *= f10;
        this.f95135c *= f10;
        this.f95136d *= f10;
        return this;
    }

    public y H(float f10, float f11, float f12, float f13) {
        float f14 = this.f95136d;
        float f15 = this.f95133a;
        float f16 = this.f95134b;
        float f17 = this.f95135c;
        this.f95133a = (((f14 * f10) + (f15 * f13)) + (f16 * f12)) - (f17 * f11);
        this.f95134b = (((f14 * f11) + (f16 * f13)) + (f17 * f10)) - (f15 * f12);
        this.f95135c = (((f14 * f12) + (f17 * f13)) + (f15 * f11)) - (f16 * f10);
        this.f95136d = (((f14 * f13) - (f15 * f10)) - (f16 * f11)) - (f17 * f12);
        return this;
    }

    public y I(y yVar) {
        float f10 = this.f95136d;
        float f11 = yVar.f95133a;
        float f12 = this.f95133a;
        float f13 = yVar.f95136d;
        float f14 = this.f95134b;
        float f15 = yVar.f95135c;
        float f16 = this.f95135c;
        float f17 = yVar.f95134b;
        this.f95133a = (((f10 * f11) + (f12 * f13)) + (f14 * f15)) - (f16 * f17);
        this.f95134b = (((f10 * f17) + (f14 * f13)) + (f16 * f11)) - (f12 * f15);
        this.f95135c = (((f10 * f15) + (f16 * f13)) + (f12 * f17)) - (f14 * f11);
        this.f95136d = (((f10 * f13) - (f12 * f11)) - (f14 * f17)) - (f16 * f15);
        return this;
    }

    public y J(float f10, float f11, float f12, float f13) {
        float f14 = this.f95133a;
        float f15 = this.f95136d;
        float f16 = this.f95135c;
        float f17 = (((f13 * f14) + (f10 * f15)) + (f11 * f16)) - (f12 * f11);
        float f18 = this.f95134b;
        this.f95133a = f17;
        this.f95134b = (((f13 * f18) + (f11 * f15)) + (f12 * f14)) - (f10 * f12);
        this.f95135c = (((f16 * f13) + (f12 * f15)) + (f10 * f18)) - (f11 * f10);
        this.f95136d = (((f13 * f15) - (f10 * f14)) - (f11 * f18)) - (f12 * f12);
        return this;
    }

    public y K(y yVar) {
        float f10 = yVar.f95136d;
        float f11 = this.f95133a;
        float f12 = yVar.f95133a;
        float f13 = this.f95136d;
        float f14 = yVar.f95134b;
        float f15 = this.f95135c;
        float f16 = yVar.f95135c;
        float f17 = this.f95134b;
        this.f95133a = (((f10 * f11) + (f12 * f13)) + (f14 * f15)) - (f16 * f17);
        this.f95134b = (((f10 * f17) + (f14 * f13)) + (f16 * f11)) - (f12 * f15);
        this.f95135c = (((f10 * f15) + (f16 * f13)) + (f12 * f17)) - (f14 * f11);
        this.f95136d = (((f10 * f13) - (f12 * f11)) - (f14 * f17)) - (f16 * f15);
        return this;
    }

    public y L() {
        float fE = E();
        if (fE != 0.0f && !s.m(fE, 1.0f)) {
            float fSqrt = (float) Math.sqrt(fE);
            this.f95136d /= fSqrt;
            this.f95133a /= fSqrt;
            this.f95134b /= fSqrt;
            this.f95135c /= fSqrt;
        }
        return this;
    }

    public y M(float f10, float f11, float f12, float f13) {
        this.f95133a = f10;
        this.f95134b = f11;
        this.f95135c = f12;
        this.f95136d = f13;
        return this;
    }

    public y N(y yVar) {
        return M(yVar.f95133a, yVar.f95134b, yVar.f95135c, yVar.f95136d);
    }

    public y O(d0 d0Var, float f10) {
        return T(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, f10);
    }

    public y P(float f10, float f11, float f12) {
        return Q(f10 * 0.017453292f, f11 * 0.017453292f, f12 * 0.017453292f);
    }

    public y Q(float f10, float f11, float f12) {
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
        this.f95133a = (f13 * fCos) + (f14 * fSin);
        this.f95134b = (f14 * fCos) - (f13 * fSin);
        this.f95135c = (f15 * fSin) - (f16 * fCos);
        this.f95136d = (f15 * fCos) + (f16 * fSin);
        return this;
    }

    public y R(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        return S(false, f10, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    public y S(boolean z10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (z10) {
            float fP = 1.0f / e0.p(f10, f11, f12);
            float fP2 = 1.0f / e0.p(f13, f14, f15);
            float fP3 = 1.0f / e0.p(f16, f17, f18);
            f10 *= fP;
            f11 *= fP;
            f12 *= fP;
            f14 *= fP2;
            f15 = f15 * fP2 * fP2;
            f16 *= fP3;
            f17 *= fP3;
            f18 *= fP3;
        }
        float f19 = f10 + f14 + f18;
        if (f19 >= 0.0f) {
            float fSqrt = (float) Math.sqrt(f19 + 1.0f);
            this.f95136d = fSqrt * 0.5f;
            float f20 = 0.5f / fSqrt;
            this.f95133a = (f17 - f15) * f20;
            this.f95134b = (f12 - f16) * f20;
            this.f95135c = (f13 - f11) * f20;
            return this;
        }
        if (f10 > f14 && f10 > f18) {
            float fSqrt2 = (float) Math.sqrt(((((double) f10) + 1.0d) - ((double) f14)) - ((double) f18));
            this.f95133a = fSqrt2 * 0.5f;
            float f21 = 0.5f / fSqrt2;
            this.f95134b = (f13 + f11) * f21;
            this.f95135c = (f12 + f16) * f21;
            this.f95136d = (f17 - f15) * f21;
            return this;
        }
        if (f14 > f18) {
            float fSqrt3 = (float) Math.sqrt(((((double) f14) + 1.0d) - ((double) f10)) - ((double) f18));
            this.f95134b = fSqrt3 * 0.5f;
            float f22 = 0.5f / fSqrt3;
            this.f95133a = (f13 + f11) * f22;
            this.f95135c = (f17 + f15) * f22;
            this.f95136d = (f12 - f16) * f22;
            return this;
        }
        float fSqrt4 = (float) Math.sqrt(((((double) f18) + 1.0d) - ((double) f10)) - ((double) f14));
        this.f95135c = fSqrt4 * 0.5f;
        float f23 = 0.5f / fSqrt4;
        this.f95133a = (f12 + f16) * f23;
        this.f95134b = (f17 + f15) * f23;
        this.f95136d = (f13 - f11) * f23;
        return this;
    }

    public y T(float f10, float f11, float f12, float f13) {
        return V(f10, f11, f12, f13 * 0.017453292f);
    }

    public y U(d0 d0Var, float f10) {
        return T(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, f10);
    }

    public y V(float f10, float f11, float f12, float f13) {
        float fP = e0.p(f10, f11, f12);
        if (fP == 0.0f) {
            return z();
        }
        float f14 = 1.0f / fP;
        double d10 = (f13 < 0.0f ? 6.2831855f - ((-f13) % 6.2831855f) : f13 % 6.2831855f) / 2.0f;
        float fSin = (float) Math.sin(d10);
        return M(f10 * f14 * fSin, f11 * f14 * fSin, f14 * f12 * fSin, (float) Math.cos(d10)).L();
    }

    public y W(d0 d0Var, float f10) {
        return V(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, f10);
    }

    public y X(float f10, float f11, float f12, float f13, float f14, float f15) {
        return V((f11 * f15) - (f12 * f14), (f12 * f13) - (f15 * f10), (f10 * f14) - (f11 * f13), (float) Math.acos(s.e(e0.e(f10, f11, f12, f13, f14, f15), -1.0f, 1.0f)));
    }

    public y Y(d0 d0Var, d0 d0Var2) {
        float fAcos = (float) Math.acos(s.e(d0Var.b(d0Var2), -1.0f, 1.0f));
        float f10 = d0Var.f180483b;
        float f11 = d0Var2.f180484c;
        float f12 = d0Var.f180484c;
        float f13 = d0Var2.f180483b;
        float f14 = d0Var2.f180482a;
        float f15 = d0Var.f180482a;
        return V((f10 * f11) - (f12 * f13), (f12 * f14) - (f11 * f15), (f15 * f13) - (f10 * f14), fAcos);
    }

    public y Z(t tVar) {
        return b0(false, tVar);
    }

    public y a(float f10, float f11, float f12, float f13) {
        this.f95133a += f10;
        this.f95134b += f11;
        this.f95135c += f12;
        this.f95136d += f13;
        return this;
    }

    public y a0(Matrix4 matrix4) {
        return c0(false, matrix4);
    }

    public y b(y yVar) {
        this.f95133a += yVar.f95133a;
        this.f95134b += yVar.f95134b;
        this.f95135c += yVar.f95135c;
        this.f95136d += yVar.f95136d;
        return this;
    }

    public y b0(boolean z10, t tVar) {
        float[] fArr = tVar.f95096a;
        return S(z10, fArr[0], fArr[3], fArr[6], fArr[1], fArr[4], fArr[7], fArr[2], fArr[5], fArr[8]);
    }

    public y c() {
        this.f95133a = -this.f95133a;
        this.f95134b = -this.f95134b;
        this.f95135c = -this.f95135c;
        return this;
    }

    public y c0(boolean z10, Matrix4 matrix4) {
        float[] fArr = matrix4.f94875a;
        return S(z10, fArr[0], fArr[4], fArr[8], fArr[1], fArr[5], fArr[9], fArr[2], fArr[6], fArr[10]);
    }

    public y d() {
        return new y(this);
    }

    public y d0(y yVar, float f10) {
        float f11 = (this.f95133a * yVar.f95133a) + (this.f95134b * yVar.f95134b) + (this.f95135c * yVar.f95135c) + (this.f95136d * yVar.f95136d);
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
        this.f95133a = (this.f95133a * fSin) + (yVar.f95133a * f10);
        this.f95134b = (this.f95134b * fSin) + (yVar.f95134b * f10);
        this.f95135c = (this.f95135c * fSin) + (yVar.f95135c * f10);
        this.f95136d = (fSin * this.f95136d) + (f10 * yVar.f95136d);
        return this;
    }

    public float e(float f10, float f11, float f12, float f13) {
        return (this.f95133a * f10) + (this.f95134b * f11) + (this.f95135c * f12) + (this.f95136d * f13);
    }

    public y e0(y[] yVarArr) {
        float length = 1.0f / yVarArr.length;
        N(yVarArr[0]).h(length);
        for (int i10 = 1; i10 < yVarArr.length; i10++) {
            I(f95131f.N(yVarArr[i10]).h(length));
        }
        L();
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return h0.d(this.f95136d) == h0.d(yVar.f95136d) && h0.d(this.f95133a) == h0.d(yVar.f95133a) && h0.d(this.f95134b) == h0.d(yVar.f95134b) && h0.d(this.f95135c) == h0.d(yVar.f95135c);
    }

    public y f0(y[] yVarArr, float[] fArr) {
        N(yVarArr[0]).h(fArr[0]);
        for (int i10 = 1; i10 < yVarArr.length; i10++) {
            I(f95131f.N(yVarArr[i10]).h(fArr[i10]));
        }
        L();
        return this;
    }

    public float g(y yVar) {
        return (this.f95133a * yVar.f95133a) + (this.f95134b * yVar.f95134b) + (this.f95135c * yVar.f95135c) + (this.f95136d * yVar.f95136d);
    }

    public void g0(float[] fArr) {
        float f10 = this.f95133a;
        float f11 = f10 * f10;
        float f12 = this.f95134b;
        float f13 = f10 * f12;
        float f14 = this.f95135c;
        float f15 = f10 * f14;
        float f16 = this.f95136d;
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
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
    }

    public y h(float f10) {
        float fC = C();
        double d10 = fC;
        float fPow = (float) Math.pow(d10, f10);
        float fAcos = (float) Math.acos(this.f95136d / fC);
        float fSin = ((double) Math.abs(fAcos)) < 0.001d ? (fPow * f10) / fC : (float) ((((double) fPow) * Math.sin(f10 * fAcos)) / (d10 * Math.sin(fAcos)));
        this.f95136d = (float) (((double) fPow) * Math.cos(f10 * fAcos));
        this.f95133a *= fSin;
        this.f95134b *= fSin;
        this.f95135c *= fSin;
        L();
        return this;
    }

    public d0 h0(d0 d0Var) {
        f95132g.N(this);
        f95132g.c();
        f95132g.K(f95131f.M(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, 0.0f)).K(this);
        y yVar = f95132g;
        d0Var.f180482a = yVar.f95133a;
        d0Var.f180483b = yVar.f95134b;
        d0Var.f180484c = yVar.f95135c;
        return d0Var;
    }

    public int hashCode() {
        return ((((((h0.d(this.f95136d) + 31) * 31) + h0.d(this.f95133a)) * 31) + h0.d(this.f95134b)) * 31) + h0.d(this.f95135c);
    }

    public float i() {
        return n() * 57.295776f;
    }

    public float j(float f10, float f11, float f12) {
        return l(f10, f11, f12) * 57.295776f;
    }

    public float k(d0 d0Var) {
        return j(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c);
    }

    public float l(float f10, float f11, float f12) {
        float fE = e0.e(this.f95133a, this.f95134b, this.f95135c, f10, f11, f12);
        float F = F(f10 * fE, f11 * fE, fE * f12, this.f95136d);
        if (s.p(F)) {
            return 0.0f;
        }
        return (float) (Math.acos(s.e((float) (((double) this.f95136d) / Math.sqrt(F)), -1.0f, 1.0f)) * 2.0d);
    }

    public float m(d0 d0Var) {
        return l(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c);
    }

    public float n() {
        float fC = this.f95136d;
        if (fC > 1.0f) {
            fC /= C();
        }
        return (float) (Math.acos(fC) * 2.0d);
    }

    public float o(d0 d0Var) {
        return p(d0Var) * 57.295776f;
    }

    public float p(d0 d0Var) {
        if (this.f95136d > 1.0f) {
            L();
        }
        float fAcos = (float) (Math.acos(this.f95136d) * 2.0d);
        float f10 = this.f95136d;
        double dSqrt = Math.sqrt(1.0f - (f10 * f10));
        if (dSqrt < 9.999999974752427E-7d) {
            d0Var.f180482a = this.f95133a;
            d0Var.f180483b = this.f95134b;
            d0Var.f180484c = this.f95135c;
            return fAcos;
        }
        d0Var.f180482a = (float) (((double) this.f95133a) / dSqrt);
        d0Var.f180483b = (float) (((double) this.f95134b) / dSqrt);
        d0Var.f180484c = (float) (((double) this.f95135c) / dSqrt);
        return fAcos;
    }

    public int q() {
        float f10 = (this.f95134b * this.f95133a) + (this.f95135c * this.f95136d);
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
        return iQ == 0 ? (float) Math.asin(s.e(((this.f95136d * this.f95133a) - (this.f95135c * this.f95134b)) * 2.0f, -1.0f, 1.0f)) : iQ * 3.1415927f * 0.5f;
    }

    public float t() {
        return u() * 57.295776f;
    }

    public String toString() {
        return "[" + this.f95133a + "|" + this.f95134b + "|" + this.f95135c + "|" + this.f95136d + "]";
    }

    public float u() {
        int iQ = q();
        if (iQ != 0) {
            return iQ * 2.0f * s.a(this.f95134b, this.f95136d);
        }
        float f10 = this.f95136d;
        float f11 = this.f95135c;
        float f12 = this.f95134b;
        float f13 = this.f95133a;
        return s.a(((f10 * f11) + (f12 * f13)) * 2.0f, 1.0f - (((f13 * f13) + (f11 * f11)) * 2.0f));
    }

    public void v(float f10, float f11, float f12, y yVar, y yVar2) {
        float fE = e0.e(this.f95133a, this.f95134b, this.f95135c, f10, f11, f12);
        yVar2.M(f10 * fE, f11 * fE, fE * f12, this.f95136d).L();
        yVar.N(yVar2).c().K(this);
    }

    public void w(d0 d0Var, y yVar, y yVar2) {
        v(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c, yVar, yVar2);
    }

    public float x() {
        return y() * 57.295776f;
    }

    public float y() {
        if (q() != 0) {
            return 0.0f;
        }
        float f10 = this.f95134b;
        float f11 = this.f95136d * f10;
        float f12 = this.f95133a;
        return s.a((f11 + (this.f95135c * f12)) * 2.0f, 1.0f - (((f10 * f10) + (f12 * f12)) * 2.0f));
    }

    public y z() {
        return M(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public y() {
        z();
    }

    public y(y yVar) {
        N(yVar);
    }

    public y(d0 d0Var, float f10) {
        O(d0Var, f10);
    }
}
