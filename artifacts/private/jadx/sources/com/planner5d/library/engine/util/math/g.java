package com.planner5d.library.engine.util.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class g implements Serializable, com.planner5d.library.engine.rendering.util.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f165484c = -1240652082930747866L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.planner5d.library.math.m f165485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f165486b;

    public enum a {
        OnPlane,
        Back,
        Front
    }

    public g() {
        this.f165485a = new com.planner5d.library.math.m();
        this.f165486b = 0.0f;
    }

    public float a(com.planner5d.library.math.m mVar) {
        return this.f165485a.X(mVar) + this.f165486b;
    }

    public float b() {
        return this.f165486b;
    }

    public com.planner5d.library.math.m c() {
        return this.f165485a;
    }

    public boolean d(com.planner5d.library.math.m mVar) {
        return this.f165485a.X(mVar) <= 0.0f;
    }

    public void e(float f10, float f11, float f12, float f13) {
        this.f165485a.y0(f10, f11, f12);
        this.f165486b = f13;
    }

    public void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f165485a.y0(f13, f14, f15);
        this.f165486b = -((f10 * f13) + (f11 * f14) + (f12 * f15));
    }

    public void g(g gVar) {
        this.f165485a.A0(gVar.f165485a);
        this.f165486b = gVar.f165486b;
    }

    public void h(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        this.f165485a.A0(mVar2);
        this.f165486b = -mVar.X(mVar2);
    }

    public void i(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2, com.planner5d.library.math.m mVar3) {
        this.f165485a.A0(mVar).H0(mVar2).U(mVar2.f180482a - mVar3.f180482a, mVar2.f180483b - mVar3.f180483b, mVar2.f180484c - mVar3.f180484c).u0();
        this.f165486b = -mVar.X(this.f165485a);
    }

    public a j(float f10, float f11, float f12) {
        float fW = this.f165485a.W(f10, f11, f12) + this.f165486b;
        if (fW == 0.0f) {
            return a.OnPlane;
        }
        return fW < 0.0f ? a.Back : a.Front;
    }

    public a k(com.planner5d.library.math.m mVar) {
        float fX = this.f165485a.X(mVar) + this.f165486b;
        if (fX == 0.0f) {
            return a.OnPlane;
        }
        return fX < 0.0f ? a.Back : a.Front;
    }

    public String toString() {
        return this.f165485a.toString() + ", " + this.f165486b;
    }

    public g(com.planner5d.library.math.m mVar, float f10) {
        com.planner5d.library.math.m mVar2 = new com.planner5d.library.math.m();
        this.f165485a = mVar2;
        this.f165486b = 0.0f;
        mVar2.A0(mVar).u0();
        this.f165486b = f10;
    }

    public g(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        com.planner5d.library.math.m mVar3 = new com.planner5d.library.math.m();
        this.f165485a = mVar3;
        this.f165486b = 0.0f;
        mVar3.A0(mVar).u0();
        this.f165486b = -mVar3.X(mVar2);
    }

    public g(com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2, com.planner5d.library.math.m mVar3) {
        this.f165485a = new com.planner5d.library.math.m();
        this.f165486b = 0.0f;
        i(mVar, mVar2, mVar3);
    }
}
