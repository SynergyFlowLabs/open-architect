package com.planner5d.library.engine.libgdx.rendering.graphics;

import com.planner5d.library.engine.util.math.Matrix4;
import com.planner5d.library.engine.util.math.k;
import com.planner5d.library.engine.util.math.n;
import com.planner5d.library.math.m;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f160835a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f160836b = new m(0.0f, 0.0f, -1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f160837c = new m(0.0f, 1.0f, 0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix4 f160838d = new Matrix4();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix4 f160839e = new Matrix4();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix4 f160840f = new Matrix4();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix4 f160841g = new Matrix4();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f160842h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f160843i = 100.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f160844j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f160845k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.planner5d.library.engine.util.math.c f160846l = new com.planner5d.library.engine.util.math.c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m f160847m = new m();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k f160848n = new k(new m(), new m());

    public k a(com.planner5d.library.engine.k kVar, float f10, float f11) {
        return b(kVar, f10, f11, 0.0f, 0.0f, kVar.getWidth(), kVar.getHeight());
    }

    public k b(com.planner5d.library.engine.k kVar, float f10, float f11, float f12, float f13, float f14, float f15) {
        q(kVar, this.f160848n.f165515a.y0(f10, f11, 0.0f), f12, f13, f14, f15);
        q(kVar, this.f160848n.f165516b.y0(f10, f11, 1.0f), f12, f13, f14, f15);
        k kVar2 = this.f160848n;
        kVar2.f165516b.H0(kVar2.f165515a).u0();
        return this.f160848n;
    }

    public void c(float f10, float f11, float f12) {
        this.f160847m.y0(f10, f11, f12).H0(this.f160835a).u0();
        if (this.f160847m.isZero()) {
            return;
        }
        float fX = this.f160847m.X(this.f160837c);
        if (Math.abs(fX - 1.0f) < 1.0E-9f) {
            this.f160837c.A0(this.f160836b).v0(-1.0f);
        } else if (Math.abs(fX + 1.0f) < 1.0E-9f) {
            this.f160837c.A0(this.f160836b);
        }
        this.f160836b.A0(this.f160847m);
        e();
    }

    public void d(m mVar) {
        c(mVar.f180482a, mVar.f180483b, mVar.f180484c);
    }

    public void e() {
        this.f160847m.A0(this.f160836b).V(this.f160837c).u0();
        this.f160837c.A0(this.f160847m).V(this.f160836b).u0();
    }

    public m f(com.planner5d.library.engine.k kVar, m mVar) {
        g(mVar, 0.0f, 0.0f, kVar.getWidth(), kVar.getHeight());
        return mVar;
    }

    public m g(m mVar, float f10, float f11, float f12, float f13) {
        n.c(mVar, this.f160840f);
        mVar.f180482a = ((f12 * (mVar.f180482a + 1.0f)) / 2.0f) + f10;
        mVar.f180483b = ((f13 * (mVar.f180483b + 1.0f)) / 2.0f) + f11;
        mVar.f180484c = (mVar.f180484c + 1.0f) / 2.0f;
        return mVar;
    }

    public void h(float f10, float f11, float f12, float f13) {
        n.e(this.f160836b, f10, f11, f12, f13);
        n.e(this.f160837c, f10, f11, f12, f13);
    }

    public void i(Matrix4 matrix4) {
        n.d(this.f160836b, matrix4);
        n.d(this.f160837c, matrix4);
    }

    public void j(com.planner5d.library.engine.util.math.i iVar) {
        iVar.h0(this.f160836b);
        iVar.h0(this.f160837c);
    }

    public void k(m mVar, float f10) {
        n.f(this.f160836b, mVar, f10);
        n.f(this.f160837c, mVar, f10);
    }

    public void l(m mVar, m mVar2, float f10) {
        this.f160847m.A0(mVar);
        this.f160847m.H0(this.f160835a);
        o(this.f160847m);
        k(mVar2, f10);
        n.f(this.f160847m, mVar2, f10);
        m mVar3 = this.f160847m;
        n(-mVar3.f180482a, -mVar3.f180483b, -mVar3.f180484c);
    }

    public void m(Matrix4 matrix4) {
        n.a(this.f160835a, matrix4);
        i(matrix4);
    }

    public void n(float f10, float f11, float f12) {
        this.f160835a.Q(f10, f11, f12);
    }

    public void o(m mVar) {
        this.f160835a.R(mVar);
    }

    public m p(com.planner5d.library.engine.k kVar, m mVar) {
        q(kVar, mVar, 0.0f, 0.0f, kVar.getWidth(), kVar.getHeight());
        return mVar;
    }

    public m q(com.planner5d.library.engine.k kVar, m mVar, float f10, float f11, float f12, float f13) {
        float f14 = mVar.f180482a;
        float height = ((kVar.getHeight() - mVar.f180483b) - 1.0f) - f11;
        mVar.f180482a = (((f14 - f10) * 2.0f) / f12) - 1.0f;
        mVar.f180483b = ((height * 2.0f) / f13) - 1.0f;
        mVar.f180484c = (mVar.f180484c * 2.0f) - 1.0f;
        n.c(mVar, this.f160841g);
        return mVar;
    }

    public abstract void r();

    public abstract void s(boolean z10);
}
