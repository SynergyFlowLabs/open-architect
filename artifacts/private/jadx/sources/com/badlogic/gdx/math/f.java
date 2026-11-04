package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.h0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class f implements Serializable, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f94941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f94942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f94943c;

    public f() {
    }

    public float a() {
        float f10 = this.f94943c;
        return f10 * f10 * 3.1415927f;
    }

    public float b() {
        return this.f94943c * 6.2831855f;
    }

    public boolean c(float f10, float f11) {
        float f12 = this.f94941a - f10;
        float f13 = this.f94942b - f11;
        float f14 = (f12 * f12) + (f13 * f13);
        float f15 = this.f94943c;
        if (f14 > f15 * f15) {
            return false;
        }
        int i10 = 4 << 1;
        return true;
    }

    public boolean d(f fVar) {
        float f10 = this.f94941a - fVar.f94941a;
        float f11 = this.f94942b - fVar.f94942b;
        float f12 = fVar.f94943c;
        float f13 = (f10 * f10) + (f11 * f11) + (f12 * f12);
        float f14 = this.f94943c;
        return f13 <= f14 * f14;
    }

    public boolean e(c0 c0Var) {
        float f10 = this.f94941a - c0Var.f94907a;
        float f11 = this.f94942b - c0Var.f94908b;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = this.f94943c;
        return f12 <= f13 * f13;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            f fVar = (f) obj;
            if (this.f94941a == fVar.f94941a && this.f94942b == fVar.f94942b && this.f94943c == fVar.f94943c) {
                return true;
            }
        }
        return false;
    }

    public boolean f(f fVar) {
        float f10 = this.f94941a - fVar.f94941a;
        float f11 = this.f94942b - fVar.f94942b;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = this.f94943c + fVar.f94943c;
        return f12 < f13 * f13;
    }

    public void g(float f10, float f11, float f12) {
        this.f94941a = f10;
        this.f94942b = f11;
        this.f94943c = f12;
    }

    public void h(f fVar) {
        this.f94941a = fVar.f94941a;
        this.f94942b = fVar.f94942b;
        this.f94943c = fVar.f94943c;
    }

    public int hashCode() {
        return ((((h0.d(this.f94943c) + 41) * 41) + h0.d(this.f94941a)) * 41) + h0.d(this.f94942b);
    }

    public void i(c0 c0Var, float f10) {
        this.f94941a = c0Var.f94907a;
        this.f94942b = c0Var.f94908b;
        this.f94943c = f10;
    }

    public void j(c0 c0Var, c0 c0Var2) {
        float f10 = c0Var.f94907a;
        this.f94941a = f10;
        float f11 = c0Var.f94908b;
        this.f94942b = f11;
        this.f94943c = c0.v0(f10 - c0Var2.f94907a, f11 - c0Var2.f94908b);
    }

    public void k(float f10, float f11) {
        this.f94941a = f10;
        this.f94942b = f11;
    }

    public void l(c0 c0Var) {
        this.f94941a = c0Var.f94907a;
        this.f94942b = c0Var.f94908b;
    }

    public void m(float f10) {
        this.f94943c = f10;
    }

    public void n(float f10) {
        this.f94941a = f10;
    }

    public void o(float f10) {
        this.f94942b = f10;
    }

    public String toString() {
        return this.f94941a + "," + this.f94942b + "," + this.f94943c;
    }

    public f(float f10, float f11, float f12) {
        this.f94941a = f10;
        this.f94942b = f11;
        this.f94943c = f12;
    }

    public f(c0 c0Var, float f10) {
        this.f94941a = c0Var.f94907a;
        this.f94942b = c0Var.f94908b;
        this.f94943c = f10;
    }

    public f(f fVar) {
        this.f94941a = fVar.f94941a;
        this.f94942b = fVar.f94942b;
        this.f94943c = fVar.f94943c;
    }

    public f(c0 c0Var, c0 c0Var2) {
        float f10 = c0Var.f94907a;
        this.f94941a = f10;
        float f11 = c0Var.f94908b;
        this.f94942b = f11;
        this.f94943c = c0.v0(f10 - c0Var2.f94907a, f11 - c0Var2.f94908b);
    }
}
