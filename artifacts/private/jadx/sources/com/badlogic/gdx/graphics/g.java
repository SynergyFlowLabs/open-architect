package com.badlogic.gdx.graphics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.c0;
import com.badlogic.gdx.math.d0;

/* JADX INFO: loaded from: classes3.dex */
public class g extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f94214o = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d0 f94215p = new d0();

    public g() {
        this.f94161h = 0.0f;
    }

    @Override // com.badlogic.gdx.graphics.a
    public void r() {
        s(true);
    }

    @Override // com.badlogic.gdx.graphics.a
    public void s(boolean z10) {
        Matrix4 matrix4 = this.f94157d;
        float f10 = this.f94214o;
        float f11 = this.f94163j;
        float f12 = this.f94164k;
        matrix4.Y(((-f11) * f10) / 2.0f, (f11 / 2.0f) * f10, (-(f12 / 2.0f)) * f10, (f10 * f12) / 2.0f, this.f94161h, this.f94162i);
        Matrix4 matrix5 = this.f94158e;
        d0 d0Var = this.f94154a;
        matrix5.X(d0Var, this.f94215p.L(d0Var).i(this.f94155b), this.f94156c);
        this.f94159f.N(this.f94157d);
        Matrix4.mul(this.f94159f.f94875a, this.f94158e.f94875a);
        if (z10) {
            this.f94160g.N(this.f94159f);
            Matrix4.inv(this.f94160g.f94875a);
            this.f94165l.j(this.f94160g);
        }
    }

    public void t(float f10) {
        k(this.f94155b, f10);
    }

    public void u(com.planner5d.library.engine.k kVar, boolean z10) {
        v(z10, kVar.getWidth(), kVar.getHeight());
    }

    public void v(boolean z10, float f10, float f11) {
        if (z10) {
            this.f94156c.y0(0.0f, -1.0f, 0.0f);
            this.f94155b.y0(0.0f, 0.0f, 1.0f);
        } else {
            this.f94156c.y0(0.0f, 1.0f, 0.0f);
            this.f94155b.y0(0.0f, 0.0f, -1.0f);
        }
        d0 d0Var = this.f94154a;
        float f12 = this.f94214o;
        d0Var.y0((f12 * f10) / 2.0f, (f12 * f11) / 2.0f, 0.0f);
        this.f94163j = f10;
        this.f94164k = f11;
        r();
    }

    public void w(float f10, float f11) {
        n(f10, f11, 0.0f);
    }

    public void x(c0 c0Var) {
        n(c0Var.f94907a, c0Var.f94908b, 0.0f);
    }

    public g(float f10, float f11) {
        this.f94163j = f10;
        this.f94164k = f11;
        this.f94161h = 0.0f;
        r();
    }
}
