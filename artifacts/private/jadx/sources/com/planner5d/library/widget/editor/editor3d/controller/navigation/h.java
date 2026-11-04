package com.planner5d.library.widget.editor.editor3d.controller.navigation;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public class h extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f255511l = 0.6f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f255512m = 0.25f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f255513n = 2.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.math.k f255514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.math.k f255515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.planner5d.library.math.k f255516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f255517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f255518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f255519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f255520k;

    public h(j jVar) {
        super(jVar);
        this.f255514e = new com.planner5d.library.math.k();
        this.f255515f = new com.planner5d.library.math.k();
        this.f255516g = null;
        int i10 = 7 << 0;
        this.f255517h = 0.0f;
        this.f255518i = 0.0f;
        this.f255519j = 0.0f;
        this.f255520k = 0.0f;
    }

    private j n() {
        j jVar = new j(this.f255482b);
        jVar.A(jVar.f() / ((gc.d.d(this.f255518i * 2.0f) * 1.5f) + 1.0f));
        this.f255515f.U(this.f255519j, this.f255520k).R(0.02f);
        jVar.v(this.f255515f);
        return jVar;
    }

    private void o(com.planner5d.library.math.k kVar) {
        this.f255483c.a();
        if (this.f255516g == null) {
            this.f255516g = new com.planner5d.library.math.k(kVar);
        }
        this.f255515f.U(Math.abs(kVar.f180480a - this.f255516g.f180480a) > Math.abs(this.f255519j) ? kVar.f180480a - this.f255516g.f180480a : this.f255519j, Math.abs(this.f255516g.f180481b - kVar.f180481b) > Math.abs(this.f255520k) ? this.f255516g.f180481b - kVar.f180481b : this.f255520k).R(0.6f);
        com.planner5d.library.math.k kVar2 = this.f255515f;
        this.f255519j = kVar2.f180480a;
        this.f255520k = kVar2.f180481b;
        this.f255482b.v(kVar2.R(0.01f));
        this.f255516g.V(kVar);
    }

    private void p(float f10) {
        this.f255483c.a();
        this.f255518i = (Math.abs(f10 - this.f255517h) > Math.abs(this.f255518i) ? f10 - this.f255517h : this.f255518i) * f255512m;
        j jVar = this.f255482b;
        jVar.A(jVar.f() / ((gc.d.d(this.f255518i) * 1.5f) + 1.0f));
        this.f255517h = f10;
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void d(boolean z10, int i10) {
        if (!z10 && (this.f255518i != 0.0f || this.f255519j != 0.0f || this.f255520k != 0.0f)) {
            this.f255483c.b(this.f255482b, n(), i10);
        }
        this.f255517h = 0.0f;
        this.f255518i = 0.0f;
        this.f255519j = 0.0f;
        this.f255520k = 0.0f;
        this.f255516g = null;
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void f(float f10, int i10) {
        j jVar = new j(this.f255482b);
        jVar.a();
        jVar.A(2500.0f);
        this.f255483c.b(this.f255482b, jVar, i10);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void i(float f10, double d10, double d11) {
        this.f255483c.a();
        this.f255482b.r(d10, d11);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void j(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, com.planner5d.library.math.k kVar3, com.planner5d.library.math.k kVar4) {
        this.f255483c.a();
        o(this.f255514e.U(kVar3.f180480a + kVar4.f180480a, kVar3.f180481b + kVar4.f180481b).R(0.5f));
        p(kVar3.m(kVar4) - kVar.m(kVar2));
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void k(float f10, @NonNull com.planner5d.library.engine.g gVar) {
        this.f255482b.F(gVar, f10);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void l(float f10, float f11) {
        this.f255483c.a();
        this.f255482b.D(f10, f11);
    }
}
