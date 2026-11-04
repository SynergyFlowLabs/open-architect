package com.badlogic.gdx.graphics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.math.y;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f94154a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f94155b = new d0(0.0f, 0.0f, -1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f94156c = new d0(0.0f, 1.0f, 0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix4 f94157d = new Matrix4();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix4 f94158e = new Matrix4();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix4 f94159f = new Matrix4();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix4 f94160g = new Matrix4();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f94161h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f94162i = 100.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f94163j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f94164k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.badlogic.gdx.math.m f94165l = new com.badlogic.gdx.math.m();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d0 f94166m = new d0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.badlogic.gdx.math.collision.b f94167n = new com.badlogic.gdx.math.collision.b(new d0(), new d0());

    public com.badlogic.gdx.math.collision.b a(com.planner5d.library.engine.k kVar, float f10, float f11) {
        return b(kVar, f10, f11, 0.0f, 0.0f, kVar.getWidth(), kVar.getHeight());
    }

    public com.badlogic.gdx.math.collision.b b(com.planner5d.library.engine.k kVar, float f10, float f11, float f12, float f13, float f14, float f15) {
        q(kVar, this.f94167n.f94917a.y0(f10, f11, 0.0f), f12, f13, f14, f15);
        q(kVar, this.f94167n.f94918b.y0(f10, f11, 1.0f), f12, f13, f14, f15);
        com.badlogic.gdx.math.collision.b bVar = this.f94167n;
        bVar.f94918b.K(bVar.f94917a).f();
        return this.f94167n;
    }

    public void c(float f10, float f11, float f12) {
        this.f94166m.y0(f10, f11, f12).K(this.f94154a).f();
        if (this.f94166m.isZero()) {
            return;
        }
        float fB = this.f94166m.b(this.f94156c);
        if (Math.abs(fB - 1.0f) < 1.0E-9f) {
            this.f94156c.L(this.f94155b).c(-1.0f);
        } else if (Math.abs(fB + 1.0f) < 1.0E-9f) {
            this.f94156c.L(this.f94155b);
        }
        this.f94155b.L(this.f94166m);
        e();
    }

    public void d(d0 d0Var) {
        c(d0Var.f180482a, d0Var.f180483b, d0Var.f180484c);
    }

    public void e() {
        this.f94166m.L(this.f94155b).O0(this.f94156c).f();
        this.f94156c.L(this.f94166m).O0(this.f94155b).f();
    }

    public d0 f(d0 d0Var, float f10, float f11, float f12, float f13) {
        d0Var.p1(this.f94159f);
        d0Var.f180482a = ((f12 * (d0Var.f180482a + 1.0f)) / 2.0f) + f10;
        d0Var.f180483b = ((f13 * (d0Var.f180483b + 1.0f)) / 2.0f) + f11;
        d0Var.f180484c = (d0Var.f180484c + 1.0f) / 2.0f;
        return d0Var;
    }

    public d0 g(com.planner5d.library.engine.k kVar, d0 d0Var) {
        f(d0Var, 0.0f, 0.0f, kVar.getWidth(), kVar.getHeight());
        return d0Var;
    }

    public void h(float f10, float f11, float f12, float f13) {
        this.f94155b.r1(f10, f11, f12, f13);
        this.f94156c.r1(f10, f11, f12, f13);
    }

    public void i(Matrix4 matrix4) {
        this.f94155b.q1(matrix4);
        this.f94156c.q1(matrix4);
    }

    public void j(y yVar) {
        yVar.h0(this.f94155b);
        yVar.h0(this.f94156c);
    }

    public void k(d0 d0Var, float f10) {
        this.f94155b.s1(d0Var, f10);
        this.f94156c.s1(d0Var, f10);
    }

    public void l(d0 d0Var, d0 d0Var2, float f10) {
        this.f94166m.L(d0Var);
        this.f94166m.K(this.f94154a);
        o(this.f94166m);
        k(d0Var2, f10);
        this.f94166m.s1(d0Var2, f10);
        d0 d0Var3 = this.f94166m;
        n(-d0Var3.f180482a, -d0Var3.f180483b, -d0Var3.f180484c);
    }

    public void m(Matrix4 matrix4) {
        this.f94154a.j1(matrix4);
        i(matrix4);
    }

    public void n(float f10, float f11, float f12) {
        this.f94154a.Q(f10, f11, f12);
    }

    public void o(d0 d0Var) {
        this.f94154a.i(d0Var);
    }

    public d0 p(com.planner5d.library.engine.k kVar, d0 d0Var) {
        q(kVar, d0Var, 0.0f, 0.0f, kVar.getWidth(), kVar.getHeight());
        return d0Var;
    }

    public d0 q(com.planner5d.library.engine.k kVar, d0 d0Var, float f10, float f11, float f12, float f13) {
        float f14 = d0Var.f180482a;
        float height = ((kVar.getHeight() - d0Var.f180483b) - 1.0f) - f11;
        d0Var.f180482a = (((f14 - f10) * 2.0f) / f12) - 1.0f;
        d0Var.f180483b = ((height * 2.0f) / f13) - 1.0f;
        d0Var.f180484c = (d0Var.f180484c * 2.0f) - 1.0f;
        d0Var.p1(this.f94160g);
        return d0Var;
    }

    public abstract void r();

    public abstract void s(boolean z10);
}
