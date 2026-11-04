package com.planner5d.library.engine.libgdx.rendering.graphics.pipeline;

import android.opengl.GLES20;
import com.badlogic.gdx.graphics.glutils.j;
import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes5.dex */
class d extends com.badlogic.gdx.graphics.g3d.shaders.b {

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private final e f160866k4;

    class a extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
        a() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
        public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
            aVar.P(i10, t4.a.c(d.this.f160866k4.f160870e));
        }
    }

    d(com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.shaders.b.a aVar, j jVar, com.badlogic.gdx.graphics.g3d.shaders.b.c cVar, e eVar) {
        super(hVar, aVar, jVar, cVar);
        this.f160866k4 = eVar;
        j(new com.badlogic.gdx.graphics.g3d.shaders.a.d("u_shadowCameraDirection"), new a());
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.a, com.badlogic.gdx.graphics.g3d.j
    public void N0(com.badlogic.gdx.graphics.g3d.h hVar) {
        if (hVar.f94423b.f94211d) {
            return;
        }
        com.badlogic.gdx.graphics.g3d.d dVar = hVar.f94427f;
        e eVar = this.f160866k4;
        float f10 = eVar.f160869d;
        float f11 = dVar.f94380d;
        if (f10 != f11) {
            eVar.f160869d = f11;
            GLES20.glLineWidth(f11);
        }
        e eVar2 = this.f160866k4;
        boolean z10 = eVar2.f160868c;
        boolean z11 = dVar.f94381e;
        if (z10 != z11) {
            eVar2.f160868c = z11;
            GLES20.glColorMask(z11, z11, z11, z11);
        }
        try {
            super.N0(hVar);
        } catch (t unused) {
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.a
    public int j(com.badlogic.gdx.graphics.g3d.shaders.a.d dVar, com.badlogic.gdx.graphics.g3d.shaders.a.c cVar) {
        if (com.badlogic.gdx.graphics.g3d.shaders.b.C0840b.f94542p.equals(dVar)) {
            cVar = new h();
        } else if (com.badlogic.gdx.graphics.g3d.shaders.b.C0840b.E.equals(dVar)) {
            cVar = new f(this.f94485c4);
        }
        return super.j(dVar, cVar);
    }
}
