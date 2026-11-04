package com.badlogic.gdx.graphics.g3d.environment;

import android.opengl.GLES20;
import com.badlogic.gdx.graphics.g3d.utils.m;
import com.badlogic.gdx.graphics.i;
import com.badlogic.gdx.graphics.k;
import com.badlogic.gdx.math.d0;

/* JADX INFO: loaded from: classes3.dex */
public class d extends c implements f, gc.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected com.badlogic.gdx.graphics.glutils.c f94393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.badlogic.gdx.graphics.a f94394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected float f94395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected float f94396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final d0 f94397g = new d0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final m f94398h;

    public d(com.planner5d.library.engine.a aVar, int i10, int i11, float f10, float f11, float f12, float f13) {
        this.f94393c = new com.badlogic.gdx.graphics.glutils.c(aVar, i.c.RGBA8888, i10, i11, true);
        com.badlogic.gdx.graphics.g gVar = new com.badlogic.gdx.graphics.g(f10, f11);
        this.f94394d = gVar;
        gVar.f94161h = f12;
        gVar.f94162i = f13;
        this.f94396f = f11 * 0.5f;
        this.f94395e = f12 + ((f13 - f12) * 0.5f);
        m mVar = new m();
        this.f94398h = mVar;
        k.a aVar2 = k.a.Nearest;
        mVar.f94687c = aVar2;
        mVar.f94686b = aVar2;
        k.b bVar = k.b.ClampToEdge;
        mVar.f94689e = bVar;
        mVar.f94688d = bVar;
    }

    @Override // com.badlogic.gdx.graphics.g3d.environment.f
    public m a() {
        this.f94398h.f94685a = this.f94393c.g();
        return this.f94398h;
    }

    @Override // com.badlogic.gdx.graphics.g3d.environment.f
    public float[] b() {
        return this.f94394d.f94159f.f94875a;
    }

    @Override // gc.e
    public void dispose() {
        com.badlogic.gdx.graphics.glutils.c cVar = this.f94393c;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f94393c = null;
    }

    public void end() {
        GLES20.glDisable(3089);
        this.f94393c.end();
    }

    public void m(com.badlogic.gdx.graphics.a aVar) {
        x(aVar);
        s();
    }

    public void o(d0 d0Var, d0 d0Var2) {
        y(d0Var, d0Var2);
        s();
    }

    public com.badlogic.gdx.graphics.a q() {
        return this.f94394d;
    }

    public void s() {
        int i10 = this.f94393c.i();
        int iH = this.f94393c.h();
        this.f94393c.s();
        GLES20.glViewport(0, 0, i10, iH);
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glEnable(3089);
        GLES20.glScissor(1, 1, i10 - 2, iH - 2);
    }

    public com.badlogic.gdx.graphics.glutils.c u() {
        return this.f94393c;
    }

    public void x(com.badlogic.gdx.graphics.a aVar) {
        y(this.f94397g.L(aVar.f94155b).c(this.f94396f), aVar.f94155b);
    }

    public void y(d0 d0Var, d0 d0Var2) {
        this.f94394d.f94154a.L(this.f94392b).c(-this.f94395e).i(d0Var);
        this.f94394d.f94155b.L(this.f94392b).f();
        this.f94394d.e();
        this.f94394d.r();
    }
}
