package com.badlogic.gdx.graphics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.d0;

/* JADX INFO: loaded from: classes3.dex */
public class h extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f94762o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final d0 f94763p;

    public h() {
        this.f94762o = 67.0f;
        this.f94763p = new d0();
    }

    @Override // com.badlogic.gdx.graphics.a
    public void r() {
        s(true);
    }

    @Override // com.badlogic.gdx.graphics.a
    public void s(boolean z10) {
        this.f94157d.b0(Math.abs(this.f94161h), Math.abs(this.f94162i), this.f94762o, this.f94163j / this.f94164k);
        Matrix4 matrix4 = this.f94158e;
        d0 d0Var = this.f94154a;
        matrix4.X(d0Var, this.f94763p.L(d0Var).i(this.f94155b), this.f94156c);
        this.f94159f.N(this.f94157d);
        Matrix4.mul(this.f94159f.f94875a, this.f94158e.f94875a);
        if (z10) {
            this.f94160g.N(this.f94159f);
            Matrix4.inv(this.f94160g.f94875a);
            this.f94165l.j(this.f94160g);
        }
    }

    public h(float f10, float f11, float f12) {
        this.f94762o = 67.0f;
        this.f94763p = new d0();
        this.f94762o = f10;
        this.f94163j = f11;
        this.f94164k = f12;
        r();
    }
}
