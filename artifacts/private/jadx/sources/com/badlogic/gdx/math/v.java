package com.badlogic.gdx.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class v implements Serializable, com.planner5d.library.engine.rendering.util.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f95098c = -1240652082930747866L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f95099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f95100b;

    public enum a {
        OnPlane,
        Back,
        Front
    }

    public v() {
        this.f95099a = new d0();
        this.f95100b = 0.0f;
    }

    public float a(d0 d0Var) {
        return this.f95099a.b(d0Var) + this.f95100b;
    }

    public float b() {
        return this.f95100b;
    }

    public d0 c() {
        return this.f95099a;
    }

    public boolean d(d0 d0Var) {
        return this.f95099a.b(d0Var) <= 0.0f;
    }

    public void e(float f10, float f11, float f12, float f13) {
        this.f95099a.y0(f10, f11, f12);
        this.f95100b = f13;
    }

    public void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f95099a.y0(f13, f14, f15);
        this.f95100b = -((f10 * f13) + (f11 * f14) + (f12 * f15));
    }

    public void g(v vVar) {
        this.f95099a.L(vVar.f95099a);
        this.f95100b = vVar.f95100b;
    }

    public void h(d0 d0Var, d0 d0Var2) {
        this.f95099a.L(d0Var2);
        this.f95100b = -d0Var.b(d0Var2);
    }

    public void i(d0 d0Var, d0 d0Var2, d0 d0Var3) {
        this.f95099a.L(d0Var).K(d0Var2).U(d0Var2.f180482a - d0Var3.f180482a, d0Var2.f180483b - d0Var3.f180483b, d0Var2.f180484c - d0Var3.f180484c).f();
        this.f95100b = -d0Var.b(this.f95099a);
    }

    public a j(float f10, float f11, float f12) {
        float fW = this.f95099a.W(f10, f11, f12) + this.f95100b;
        if (fW == 0.0f) {
            return a.OnPlane;
        }
        return fW < 0.0f ? a.Back : a.Front;
    }

    public a k(d0 d0Var) {
        float fB = this.f95099a.b(d0Var) + this.f95100b;
        if (fB == 0.0f) {
            return a.OnPlane;
        }
        return fB < 0.0f ? a.Back : a.Front;
    }

    public a l(Float f10, Float f11, Float f12) {
        float fW = this.f95099a.W(f10.floatValue(), f11.floatValue(), f12.floatValue()) + this.f95100b;
        if (fW == 0.0f) {
            return a.OnPlane;
        }
        return fW < 0.0f ? a.Back : a.Front;
    }

    public String toString() {
        return this.f95099a.toString() + ", " + this.f95100b;
    }

    public v(d0 d0Var, float f10) {
        d0 d0Var2 = new d0();
        this.f95099a = d0Var2;
        this.f95100b = 0.0f;
        d0Var2.L(d0Var).f();
        this.f95100b = f10;
    }

    public v(d0 d0Var, d0 d0Var2) {
        d0 d0Var3 = new d0();
        this.f95099a = d0Var3;
        this.f95100b = 0.0f;
        d0Var3.L(d0Var).f();
        this.f95100b = -d0Var3.b(d0Var2);
    }

    public v(d0 d0Var, d0 d0Var2, d0 d0Var3) {
        this.f95099a = new d0();
        this.f95100b = 0.0f;
        i(d0Var, d0Var2, d0Var3);
    }
}
