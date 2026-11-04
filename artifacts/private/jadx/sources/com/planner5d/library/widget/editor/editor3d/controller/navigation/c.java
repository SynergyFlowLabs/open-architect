package com.planner5d.library.widget.editor.editor3d.controller.navigation;

import androidx.annotation.NonNull;
import com.planner5d.library.math.m;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final float f255480d = 500.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f255481a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final j f255482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final b f255483c;

    public enum a {
        Spherical,
        Simple,
        FirstPerson,
        Isometric
    }

    c(j jVar) {
        this.f255482b = jVar;
        this.f255483c = new b(jVar);
    }

    public void c(vd.a aVar, int i10) {
        this.f255483c.b(this.f255482b, new j(this.f255482b, aVar.a(), aVar.b()), i10);
    }

    public abstract void d(boolean z10, int i10);

    public j e() {
        m mVar = new m();
        m mVar2 = new m();
        j jVar = this.f255482b;
        return new j(jVar, jVar.h(mVar), this.f255482b.l(mVar2));
    }

    public abstract void f(float f10, int i10);

    public void g(float f10, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        if (!kVar.D() && !kVar2.D()) {
            this.f255483c.a();
        }
        if (!kVar.D()) {
            this.f255482b.r(gc.d.e(kVar.S(-1.0f, 1.0f).R(f255480d)).f180480a, kVar.f180481b);
        }
        if (kVar2.D()) {
            return;
        }
        this.f255482b.t(-kVar2.f180480a, this.f255481a.y0(0.0f, 1.0f, 0.0f));
        this.f255482b.q((-kVar2.f180481b) * 10.0f);
    }

    public void h(double d10) {
        if (d10 == 0.0d) {
            this.f255483c.a();
        } else {
            this.f255482b.p(d10);
        }
    }

    public abstract void i(float f10, double d10, double d11);

    public abstract void j(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, com.planner5d.library.math.k kVar3, com.planner5d.library.math.k kVar4);

    public abstract void k(float f10, @NonNull com.planner5d.library.engine.g gVar);

    public abstract void l(float f10, float f11);

    public boolean m() {
        return this.f255483c.c();
    }
}
