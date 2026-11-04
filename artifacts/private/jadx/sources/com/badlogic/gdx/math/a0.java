package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.h0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class a0 implements Serializable, b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f94883e = new a0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f94884f = new a0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f94885g = 5733252015138115702L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f94886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f94887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f94888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f94889d;

    public a0() {
    }

    public a0 A(c0 c0Var) {
        this.f94886a = c0Var.f94907a;
        this.f94887b = c0Var.f94908b;
        return this;
    }

    public a0 B(float f10) {
        this.f94888c = f10;
        this.f94889d = f10;
        return this;
    }

    public a0 C(float f10, float f11) {
        this.f94888c = f10;
        this.f94889d = f11;
        return this;
    }

    public a0 D(float f10) {
        this.f94888c = f10;
        return this;
    }

    public a0 E(float f10) {
        this.f94886a = f10;
        return this;
    }

    public a0 F(float f10) {
        this.f94887b = f10;
        return this;
    }

    public float a() {
        return this.f94888c * this.f94889d;
    }

    public boolean b(float f10, float f11) {
        float f12 = this.f94886a;
        if (f12 <= f10 && f12 + this.f94888c >= f10) {
            float f13 = this.f94887b;
            if (f13 <= f11 && f13 + this.f94889d >= f11) {
                return true;
            }
        }
        return false;
    }

    public boolean c(a0 a0Var) {
        float f10 = a0Var.f94886a;
        float f11 = a0Var.f94888c + f10;
        float f12 = a0Var.f94887b;
        float f13 = a0Var.f94889d + f12;
        float f14 = this.f94886a;
        if (f10 <= f14) {
            return false;
        }
        float f15 = this.f94888c;
        if (f10 >= f14 + f15 || f11 <= f14 || f11 >= f14 + f15) {
            return false;
        }
        float f16 = this.f94887b;
        if (f12 <= f16) {
            return false;
        }
        float f17 = this.f94889d;
        return f12 < f16 + f17 && f13 > f16 && f13 < f16 + f17;
    }

    public boolean d(c0 c0Var) {
        return b(c0Var.f94907a, c0Var.f94908b);
    }

    public a0 e(a0 a0Var) {
        float fG = g();
        if (fG < a0Var.g()) {
            float f10 = a0Var.f94889d;
            C(fG * f10, f10);
        } else {
            float f11 = a0Var.f94888c;
            C(f11, f11 / fG);
        }
        z((a0Var.f94886a + (a0Var.f94888c / 2.0f)) - (this.f94888c / 2.0f), (a0Var.f94887b + (a0Var.f94889d / 2.0f)) - (this.f94889d / 2.0f));
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return h0.d(this.f94889d) == h0.d(a0Var.f94889d) && h0.d(this.f94888c) == h0.d(a0Var.f94888c) && h0.d(this.f94886a) == h0.d(a0Var.f94886a) && h0.d(this.f94887b) == h0.d(a0Var.f94887b);
    }

    public a0 f(a0 a0Var) {
        float fG = g();
        if (fG > a0Var.g()) {
            float f10 = a0Var.f94889d;
            C(fG * f10, f10);
        } else {
            float f11 = a0Var.f94888c;
            C(f11, f11 / fG);
        }
        z((a0Var.f94886a + (a0Var.f94888c / 2.0f)) - (this.f94888c / 2.0f), (a0Var.f94887b + (a0Var.f94889d / 2.0f)) - (this.f94889d / 2.0f));
        return this;
    }

    public float g() {
        float f10 = this.f94889d;
        if (f10 == 0.0f) {
            return Float.NaN;
        }
        return this.f94888c / f10;
    }

    public c0 h(c0 c0Var) {
        c0Var.f94907a = this.f94886a + (this.f94888c / 2.0f);
        c0Var.f94908b = this.f94887b + (this.f94889d / 2.0f);
        return c0Var;
    }

    public int hashCode() {
        return ((((((h0.d(this.f94889d) + 31) * 31) + h0.d(this.f94888c)) * 31) + h0.d(this.f94886a)) * 31) + h0.d(this.f94887b);
    }

    public float i() {
        return this.f94889d;
    }

    public c0 j(c0 c0Var) {
        return c0Var.K0(this.f94886a, this.f94887b);
    }

    public c0 k(c0 c0Var) {
        return c0Var.K0(this.f94888c, this.f94889d);
    }

    public float l() {
        return this.f94888c;
    }

    public float m() {
        return this.f94886a;
    }

    public float n() {
        return this.f94887b;
    }

    public a0 o(float f10, float f11) {
        float fMin = Math.min(this.f94886a, f10);
        float fMax = Math.max(this.f94886a + this.f94888c, f10);
        this.f94886a = fMin;
        this.f94888c = fMax - fMin;
        float fMin2 = Math.min(this.f94887b, f11);
        float fMax2 = Math.max(this.f94887b + this.f94889d, f11);
        this.f94887b = fMin2;
        this.f94889d = fMax2 - fMin2;
        return this;
    }

    public a0 p(a0 a0Var) {
        float fMin = Math.min(this.f94886a, a0Var.f94886a);
        float fMax = Math.max(this.f94886a + this.f94888c, a0Var.f94886a + a0Var.f94888c);
        this.f94886a = fMin;
        this.f94888c = fMax - fMin;
        float fMin2 = Math.min(this.f94887b, a0Var.f94887b);
        float fMax2 = Math.max(this.f94887b + this.f94889d, a0Var.f94887b + a0Var.f94889d);
        this.f94887b = fMin2;
        this.f94889d = fMax2 - fMin2;
        return this;
    }

    public a0 q(c0 c0Var) {
        return o(c0Var.f94907a, c0Var.f94908b);
    }

    public a0 r(c0[] c0VarArr) {
        float fMin = this.f94886a;
        float fMax = this.f94888c + fMin;
        float fMin2 = this.f94887b;
        float fMax2 = this.f94889d + fMin2;
        for (c0 c0Var : c0VarArr) {
            fMin = Math.min(fMin, c0Var.f94907a);
            fMax = Math.max(fMax, c0Var.f94907a);
            fMin2 = Math.min(fMin2, c0Var.f94908b);
            fMax2 = Math.max(fMax2, c0Var.f94908b);
        }
        this.f94886a = fMin;
        this.f94888c = fMax - fMin;
        this.f94887b = fMin2;
        this.f94889d = fMax2 - fMin2;
        return this;
    }

    public boolean s(a0 a0Var) {
        float f10 = this.f94886a;
        float f11 = a0Var.f94886a;
        if (f10 >= a0Var.f94888c + f11 || f10 + this.f94888c <= f11) {
            return false;
        }
        float f12 = this.f94887b;
        float f13 = a0Var.f94887b;
        return f12 < a0Var.f94889d + f13 && f12 + this.f94889d > f13;
    }

    public float t() {
        return (this.f94888c + this.f94889d) * 2.0f;
    }

    public String toString() {
        return this.f94886a + "," + this.f94887b + "," + this.f94888c + "," + this.f94889d;
    }

    public a0 u(float f10, float f11, float f12, float f13) {
        this.f94886a = f10;
        this.f94887b = f11;
        this.f94888c = f12;
        this.f94889d = f13;
        return this;
    }

    public a0 v(a0 a0Var) {
        this.f94886a = a0Var.f94886a;
        this.f94887b = a0Var.f94887b;
        this.f94888c = a0Var.f94888c;
        this.f94889d = a0Var.f94889d;
        return this;
    }

    public a0 w(float f10, float f11) {
        z(f10 - (this.f94888c / 2.0f), f11 - (this.f94889d / 2.0f));
        return this;
    }

    public a0 x(c0 c0Var) {
        z(c0Var.f94907a - (this.f94888c / 2.0f), c0Var.f94908b - (this.f94889d / 2.0f));
        return this;
    }

    public a0 y(float f10) {
        this.f94889d = f10;
        return this;
    }

    public a0 z(float f10, float f11) {
        this.f94886a = f10;
        this.f94887b = f11;
        return this;
    }

    public a0(float f10, float f11, float f12, float f13) {
        this.f94886a = f10;
        this.f94887b = f11;
        this.f94888c = f12;
        this.f94889d = f13;
    }

    public a0(a0 a0Var) {
        this.f94886a = a0Var.f94886a;
        this.f94887b = a0Var.f94887b;
        this.f94888c = a0Var.f94888c;
        this.f94889d = a0Var.f94889d;
    }
}
