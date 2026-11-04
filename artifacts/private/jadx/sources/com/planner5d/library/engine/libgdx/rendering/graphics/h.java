package com.planner5d.library.engine.libgdx.rendering.graphics;

import com.badlogic.gdx.math.c0;
import com.badlogic.gdx.math.d0;
import com.planner5d.library.engine.k;
import com.planner5d.library.engine.util.math.Matrix4;
import com.planner5d.library.math.m;

/* JADX INFO: loaded from: classes5.dex */
public class h extends e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f160852o = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d0 f160853p = new d0();

    public h() {
        this.f160842h = 0.0f;
    }

    @Override // com.planner5d.library.engine.libgdx.rendering.graphics.e
    public void r() {
        s(true);
    }

    @Override // com.planner5d.library.engine.libgdx.rendering.graphics.e
    public void s(boolean z10) {
        Matrix4 matrix4 = this.f160838d;
        float f10 = this.f160852o;
        float f11 = this.f160844j;
        float f12 = this.f160845k;
        matrix4.X(((-f11) * f10) / 2.0f, (f11 / 2.0f) * f10, (-(f12 / 2.0f)) * f10, (f10 * f12) / 2.0f, this.f160842h, this.f160843i);
        Matrix4 matrix5 = this.f160839e;
        m mVar = this.f160835a;
        matrix5.W(mVar, this.f160853p.A0(mVar).R(this.f160836b), this.f160837c);
        this.f160840f.M(this.f160838d);
        com.badlogic.gdx.math.Matrix4.mul(this.f160840f.f165412a, this.f160839e.f165412a);
        if (z10) {
            this.f160841g.M(this.f160840f);
            com.badlogic.gdx.math.Matrix4.inv(this.f160841g.f165412a);
            this.f160846l.j(this.f160841g);
        }
    }

    public void t(float f10) {
        k(this.f160836b, f10);
    }

    public void u(k kVar, boolean z10) {
        v(z10, kVar.getWidth(), kVar.getHeight());
    }

    public void v(boolean z10, float f10, float f11) {
        if (z10) {
            this.f160837c.y0(0.0f, -1.0f, 0.0f);
            this.f160836b.y0(0.0f, 0.0f, 1.0f);
        } else {
            this.f160837c.y0(0.0f, 1.0f, 0.0f);
            this.f160836b.y0(0.0f, 0.0f, -1.0f);
        }
        m mVar = this.f160835a;
        float f12 = this.f160852o;
        mVar.y0((f12 * f10) / 2.0f, (f12 * f11) / 2.0f, 0.0f);
        this.f160844j = f10;
        this.f160845k = f11;
        r();
    }

    public void w(float f10, float f11) {
        n(f10, f11, 0.0f);
    }

    public void x(c0 c0Var) {
        n(c0Var.f94907a, c0Var.f94908b, 0.0f);
    }

    public h(float f10, float f11) {
        this.f160844j = f10;
        this.f160845k = f11;
        this.f160842h = 0.0f;
        r();
    }
}
