package com.planner5d.library.engine.libgdx.rendering.graphics;

import com.planner5d.library.engine.util.math.Matrix4;
import com.planner5d.library.math.m;

/* JADX INFO: loaded from: classes5.dex */
public class i extends e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f160854o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final m f160855p;

    public i() {
        this.f160854o = 67.0f;
        this.f160855p = new m();
    }

    @Override // com.planner5d.library.engine.libgdx.rendering.graphics.e
    public void r() {
        s(true);
    }

    @Override // com.planner5d.library.engine.libgdx.rendering.graphics.e
    public void s(boolean z10) {
        this.f160838d.a0(Math.abs(this.f160842h), Math.abs(this.f160843i), this.f160854o, this.f160844j / this.f160845k);
        Matrix4 matrix4 = this.f160839e;
        m mVar = this.f160835a;
        matrix4.W(mVar, this.f160855p.A0(mVar).R(this.f160836b), this.f160837c);
        this.f160840f.M(this.f160838d);
        Matrix4.mul(this.f160840f.f165412a, this.f160839e.f165412a);
        if (z10) {
            this.f160841g.M(this.f160840f);
            Matrix4.inv(this.f160841g.f165412a);
            this.f160846l.j(this.f160841g);
        }
    }

    public i(float f10, float f11, float f12) {
        this.f160854o = 67.0f;
        this.f160855p = new m();
        this.f160854o = f10;
        this.f160844j = f11;
        this.f160845k = f12;
        r();
    }
}
