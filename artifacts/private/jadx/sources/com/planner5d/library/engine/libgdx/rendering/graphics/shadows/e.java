package com.planner5d.library.engine.libgdx.rendering.graphics.shadows;

import android.opengl.GLES20;
import com.badlogic.gdx.graphics.g3d.attributes.g;
import com.badlogic.gdx.graphics.g3d.h;
import com.badlogic.gdx.graphics.g3d.utils.i;
import com.badlogic.gdx.graphics.glutils.j;

/* JADX INFO: loaded from: classes5.dex */
class e extends com.badlogic.gdx.graphics.g3d.shaders.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h f160896n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final j f160897o;

    e(h hVar, com.badlogic.gdx.graphics.g3d.shaders.b.c cVar, j jVar) {
        j(com.badlogic.gdx.graphics.g3d.shaders.b.C0840b.f94535i, cVar.f94577d);
        this.f160896n = hVar;
        this.f160897o = jVar;
    }

    @Override // com.badlogic.gdx.graphics.g3d.j
    public int J0(com.badlogic.gdx.graphics.g3d.j jVar) {
        return jVar == null ? -1 : 0;
    }

    @Override // com.badlogic.gdx.graphics.g3d.j
    public boolean V0(h hVar) {
        return ((hVar.f94427f.a2(com.badlogic.gdx.graphics.g3d.attributes.a.f94300i) && hVar.f94431j == null) || hVar.f94427f.a2(com.badlogic.gdx.graphics.g3d.attributes.f.f94338h)) ? false : true;
    }

    @Override // com.badlogic.gdx.graphics.g3d.j
    public void r() {
        g(this.f160897o, this.f160896n);
        this.f160896n = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // com.badlogic.gdx.graphics.g3d.shaders.a
    public void x(h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
        int i10;
        GLES20.glPolygonOffset(0.0f, 0.0f);
        i iVar = this.f94470i;
        long j10 = g.f94341f;
        if (bVar.a2(j10)) {
            int i11 = ((g) bVar.W1(j10)).f94342d;
            i10 = androidx.media3.exoplayer.analytics.b.f62814h0;
            if (i11 != 1028) {
                i10 = 1029;
            }
        } else {
            i10 = 1029;
        }
        iVar.d(i10);
        this.f94470i.g(com.badlogic.gdx.graphics.g3d.shaders.b.f94481i4, 0.0f, 1.0f);
        this.f94470i.e(true);
        this.f94470i.c(false, 0, 0);
        super.x(hVar, bVar);
    }
}
