package com.planner5d.library.engine.util.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class l implements Serializable, m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f165517e = new l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f165518f = new l();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f165519g = 5733252015138115702L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f165520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f165521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f165522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f165523d;

    public l() {
    }

    public l A(com.planner5d.library.math.k kVar) {
        this.f165520a = kVar.f180480a;
        this.f165521b = kVar.f180481b;
        return this;
    }

    public l B(float f10) {
        this.f165522c = f10;
        this.f165523d = f10;
        return this;
    }

    public l C(float f10, float f11) {
        this.f165522c = f10;
        this.f165523d = f11;
        return this;
    }

    public l D(float f10) {
        this.f165522c = f10;
        return this;
    }

    public l E(float f10) {
        this.f165520a = f10;
        return this;
    }

    public l F(float f10) {
        this.f165521b = f10;
        return this;
    }

    public float a() {
        return this.f165522c * this.f165523d;
    }

    public boolean b(float f10, float f11) {
        float f12 = this.f165520a;
        if (f12 <= f10 && f12 + this.f165522c >= f10) {
            float f13 = this.f165521b;
            if (f13 <= f11 && f13 + this.f165523d >= f11) {
                return true;
            }
        }
        return false;
    }

    public boolean c(l lVar) {
        float f10 = lVar.f165520a;
        float f11 = lVar.f165522c + f10;
        float f12 = lVar.f165521b;
        float f13 = lVar.f165523d + f12;
        float f14 = this.f165520a;
        if (f10 > f14) {
            float f15 = this.f165522c;
            if (f10 < f14 + f15 && f11 > f14 && f11 < f14 + f15) {
                float f16 = this.f165521b;
                if (f12 > f16) {
                    float f17 = this.f165523d;
                    if (f12 < f16 + f17 && f13 > f16 && f13 < f16 + f17) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean d(com.planner5d.library.math.k kVar) {
        return b(kVar.f180480a, kVar.f180481b);
    }

    public l e(l lVar) {
        float fG = g();
        if (fG < lVar.g()) {
            float f10 = lVar.f165523d;
            C(fG * f10, f10);
        } else {
            float f11 = lVar.f165522c;
            C(f11, f11 / fG);
        }
        z((lVar.f165520a + (lVar.f165522c / 2.0f)) - (this.f165522c / 2.0f), (lVar.f165521b + (lVar.f165523d / 2.0f)) - (this.f165523d / 2.0f));
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return Float.floatToRawIntBits(this.f165523d) == Float.floatToRawIntBits(lVar.f165523d) && Float.floatToRawIntBits(this.f165522c) == Float.floatToRawIntBits(lVar.f165522c) && Float.floatToRawIntBits(this.f165520a) == Float.floatToRawIntBits(lVar.f165520a) && Float.floatToRawIntBits(this.f165521b) == Float.floatToRawIntBits(lVar.f165521b);
    }

    public l f(l lVar) {
        float fG = g();
        if (fG > lVar.g()) {
            float f10 = lVar.f165523d;
            C(fG * f10, f10);
        } else {
            float f11 = lVar.f165522c;
            C(f11, f11 / fG);
        }
        z((lVar.f165520a + (lVar.f165522c / 2.0f)) - (this.f165522c / 2.0f), (lVar.f165521b + (lVar.f165523d / 2.0f)) - (this.f165523d / 2.0f));
        return this;
    }

    public float g() {
        float f10 = this.f165523d;
        if (f10 == 0.0f) {
            return Float.NaN;
        }
        return this.f165522c / f10;
    }

    public com.planner5d.library.math.k h(com.planner5d.library.math.k kVar) {
        kVar.f180480a = this.f165520a + (this.f165522c / 2.0f);
        kVar.f180481b = this.f165521b + (this.f165523d / 2.0f);
        return kVar;
    }

    public int hashCode() {
        return ((((((Float.floatToRawIntBits(this.f165523d) + 31) * 31) + Float.floatToRawIntBits(this.f165522c)) * 31) + Float.floatToRawIntBits(this.f165520a)) * 31) + Float.floatToRawIntBits(this.f165521b);
    }

    public float i() {
        return this.f165523d;
    }

    public com.planner5d.library.math.k j(com.planner5d.library.math.k kVar) {
        return kVar.U(this.f165520a, this.f165521b);
    }

    public com.planner5d.library.math.k k(com.planner5d.library.math.k kVar) {
        return kVar.U(this.f165522c, this.f165523d);
    }

    public float l() {
        return this.f165522c;
    }

    public float m() {
        return this.f165520a;
    }

    public float n() {
        return this.f165521b;
    }

    public l o(float f10, float f11) {
        float fMin = Math.min(this.f165520a, f10);
        float fMax = Math.max(this.f165520a + this.f165522c, f10);
        this.f165520a = fMin;
        this.f165522c = fMax - fMin;
        float fMin2 = Math.min(this.f165521b, f11);
        float fMax2 = Math.max(this.f165521b + this.f165523d, f11);
        this.f165521b = fMin2;
        this.f165523d = fMax2 - fMin2;
        return this;
    }

    public l p(l lVar) {
        float fMin = Math.min(this.f165520a, lVar.f165520a);
        float fMax = Math.max(this.f165520a + this.f165522c, lVar.f165520a + lVar.f165522c);
        this.f165520a = fMin;
        this.f165522c = fMax - fMin;
        float fMin2 = Math.min(this.f165521b, lVar.f165521b);
        float fMax2 = Math.max(this.f165521b + this.f165523d, lVar.f165521b + lVar.f165523d);
        this.f165521b = fMin2;
        this.f165523d = fMax2 - fMin2;
        return this;
    }

    public l q(com.planner5d.library.math.k kVar) {
        return o(kVar.f180480a, kVar.f180481b);
    }

    public l r(com.planner5d.library.math.k[] kVarArr) {
        float fMin = this.f165520a;
        float fMax = this.f165522c + fMin;
        float fMin2 = this.f165521b;
        float fMax2 = this.f165523d + fMin2;
        for (com.planner5d.library.math.k kVar : kVarArr) {
            fMin = Math.min(fMin, kVar.f180480a);
            fMax = Math.max(fMax, kVar.f180480a);
            fMin2 = Math.min(fMin2, kVar.f180481b);
            fMax2 = Math.max(fMax2, kVar.f180481b);
        }
        this.f165520a = fMin;
        this.f165522c = fMax - fMin;
        this.f165521b = fMin2;
        this.f165523d = fMax2 - fMin2;
        return this;
    }

    public boolean s(l lVar) {
        float f10 = this.f165520a;
        float f11 = lVar.f165520a;
        if (f10 < lVar.f165522c + f11 && f10 + this.f165522c > f11) {
            float f12 = this.f165521b;
            float f13 = lVar.f165521b;
            if (f12 < lVar.f165523d + f13 && f12 + this.f165523d > f13) {
                return true;
            }
        }
        return false;
    }

    public float t() {
        return (this.f165522c + this.f165523d) * 2.0f;
    }

    public String toString() {
        return this.f165520a + "," + this.f165521b + "," + this.f165522c + "," + this.f165523d;
    }

    public l u(float f10, float f11, float f12, float f13) {
        this.f165520a = f10;
        this.f165521b = f11;
        this.f165522c = f12;
        this.f165523d = f13;
        return this;
    }

    public l v(l lVar) {
        this.f165520a = lVar.f165520a;
        this.f165521b = lVar.f165521b;
        this.f165522c = lVar.f165522c;
        this.f165523d = lVar.f165523d;
        return this;
    }

    public l w(float f10, float f11) {
        z(f10 - (this.f165522c / 2.0f), f11 - (this.f165523d / 2.0f));
        return this;
    }

    public l x(com.planner5d.library.math.k kVar) {
        z(kVar.f180480a - (this.f165522c / 2.0f), kVar.f180481b - (this.f165523d / 2.0f));
        return this;
    }

    public l y(float f10) {
        this.f165523d = f10;
        return this;
    }

    public l z(float f10, float f11) {
        this.f165520a = f10;
        this.f165521b = f11;
        return this;
    }

    public l(float f10, float f11, float f12, float f13) {
        this.f165520a = f10;
        this.f165521b = f11;
        this.f165522c = f12;
        this.f165523d = f13;
    }

    public l(l lVar) {
        this.f165520a = lVar.f165520a;
        this.f165521b = lVar.f165521b;
        this.f165522c = lVar.f165522c;
        this.f165523d = lVar.f165523d;
    }
}
