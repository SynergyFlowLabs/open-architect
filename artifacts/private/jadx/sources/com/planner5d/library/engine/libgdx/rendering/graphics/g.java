package com.planner5d.library.engine.libgdx.rendering.graphics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.d0;
import com.planner5d.library.math.m;

/* JADX INFO: loaded from: classes5.dex */
public class g extends e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Matrix4 f160849o = new Matrix4();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Matrix4 f160850p = new Matrix4();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d0 f160851q = new d0();

    @Override // com.planner5d.library.engine.libgdx.rendering.graphics.e
    public void r() {
        s(true);
    }

    @Override // com.planner5d.library.engine.libgdx.rendering.graphics.e
    public void s(boolean z10) {
        com.planner5d.library.engine.util.math.Matrix4 matrix4 = this.f160839e;
        m mVar = this.f160835a;
        matrix4.W(mVar, this.f160851q.A0(mVar).R(this.f160836b), this.f160837c);
        Matrix4.mul(this.f160850p.N(this.f160849o).f94875a, this.f160839e.f165412a);
        Matrix4.mul(this.f160840f.M(this.f160838d).f165412a, this.f160850p.f94875a);
        if (z10) {
            Matrix4.inv(this.f160841g.M(this.f160840f).f165412a);
            this.f160846l.j(this.f160841g);
        }
    }

    public void t(float[] fArr) {
        this.f160838d.R(fArr);
    }

    public void u(float[] fArr) {
        this.f160849o.S(fArr);
    }
}
