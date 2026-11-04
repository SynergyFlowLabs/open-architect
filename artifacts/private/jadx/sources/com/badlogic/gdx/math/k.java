package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.h0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class k implements Serializable, b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f94980e = 7381533206532032099L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f94981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f94982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f94983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f94984d;

    public k() {
    }

    public float a() {
        return ((this.f94983c * this.f94984d) * 3.1415927f) / 4.0f;
    }

    public float b() {
        float f10 = this.f94983c / 2.0f;
        float f11 = this.f94984d / 2.0f;
        float f12 = f10 * 3.0f;
        return (f12 > f11 || f11 * 3.0f > f10) ? (float) ((((double) ((f10 + f11) * 3.0f)) - Math.sqrt((f12 + f11) * (f10 + (f11 * 3.0f)))) * 3.1415927410125732d) : (float) (Math.sqrt(((f10 * f10) + (f11 * f11)) / 2.0f) * 6.2831854820251465d);
    }

    public boolean c(float f10, float f11) {
        float f12 = f10 - this.f94981a;
        float f13 = f11 - this.f94982b;
        float f14 = this.f94983c;
        float f15 = this.f94984d;
        return ((f12 * f12) / (((f14 * 0.5f) * f14) * 0.5f)) + ((f13 * f13) / (((f15 * 0.5f) * f15) * 0.5f)) <= 1.0f;
    }

    public boolean d(c0 c0Var) {
        return c(c0Var.f94907a, c0Var.f94908b);
    }

    public void e(float f10, float f11, float f12, float f13) {
        this.f94981a = f10;
        this.f94982b = f11;
        this.f94983c = f12;
        this.f94984d = f13;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            k kVar = (k) obj;
            if (this.f94981a == kVar.f94981a && this.f94982b == kVar.f94982b && this.f94983c == kVar.f94983c && this.f94984d == kVar.f94984d) {
                return true;
            }
        }
        return false;
    }

    public void f(f fVar) {
        this.f94981a = fVar.f94941a;
        this.f94982b = fVar.f94942b;
        float f10 = fVar.f94943c;
        this.f94983c = f10;
        this.f94984d = f10;
    }

    public void g(k kVar) {
        this.f94981a = kVar.f94981a;
        this.f94982b = kVar.f94982b;
        this.f94983c = kVar.f94983c;
        this.f94984d = kVar.f94984d;
    }

    public void h(c0 c0Var, c0 c0Var2) {
        this.f94981a = c0Var.f94907a;
        this.f94982b = c0Var.f94908b;
        this.f94983c = c0Var2.f94907a;
        this.f94984d = c0Var2.f94908b;
    }

    public int hashCode() {
        return ((((((h0.d(this.f94984d) + 53) * 53) + h0.d(this.f94983c)) * 53) + h0.d(this.f94981a)) * 53) + h0.d(this.f94982b);
    }

    public k i(float f10, float f11) {
        this.f94981a = f10;
        this.f94982b = f11;
        return this;
    }

    public k j(c0 c0Var) {
        this.f94981a = c0Var.f94907a;
        this.f94982b = c0Var.f94908b;
        return this;
    }

    public k k(float f10, float f11) {
        this.f94983c = f10;
        this.f94984d = f11;
        return this;
    }

    public k(k kVar) {
        this.f94981a = kVar.f94981a;
        this.f94982b = kVar.f94982b;
        this.f94983c = kVar.f94983c;
        this.f94984d = kVar.f94984d;
    }

    public k(float f10, float f11, float f12, float f13) {
        this.f94981a = f10;
        this.f94982b = f11;
        this.f94983c = f12;
        this.f94984d = f13;
    }

    public k(c0 c0Var, float f10, float f11) {
        this.f94981a = c0Var.f94907a;
        this.f94982b = c0Var.f94908b;
        this.f94983c = f10;
        this.f94984d = f11;
    }

    public k(c0 c0Var, c0 c0Var2) {
        this.f94981a = c0Var.f94907a;
        this.f94982b = c0Var.f94908b;
        this.f94983c = c0Var2.f94907a;
        this.f94984d = c0Var2.f94908b;
    }

    public k(f fVar) {
        this.f94981a = fVar.f94941a;
        this.f94982b = fVar.f94942b;
        float f10 = fVar.f94943c;
        this.f94983c = f10;
        this.f94984d = f10;
    }
}
