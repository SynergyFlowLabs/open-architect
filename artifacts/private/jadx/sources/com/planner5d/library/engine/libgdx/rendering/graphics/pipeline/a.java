package com.planner5d.library.engine.libgdx.rendering.graphics.pipeline;

import android.content.Context;
import androidx.annotation.p0;
import com.badlogic.gdx.graphics.g3d.j;

/* JADX INFO: loaded from: classes5.dex */
public class a extends com.badlogic.gdx.graphics.g3d.f implements com.planner5d.library.engine.rendering.util.d, ac.a {
    public a(Context context, com.planner5d.library.engine.a aVar, gc.g gVar) {
        super(new e(context, aVar, gVar), new c());
    }

    void E(com.planner5d.library.engine.libgdx.rendering.graphics.shadows.a aVar) {
        aVar.F(((e) this.f94410f).f160870e);
    }

    @Override // com.planner5d.library.engine.rendering.util.d
    public void e(com.planner5d.library.engine.rendering.util.c cVar) {
        ((c) this.f94411g).e(cVar);
    }

    @Override // com.badlogic.gdx.graphics.g3d.f
    public void end() {
        super.end();
        ((e) this.f94410f).b();
        h().b();
    }

    @Override // com.badlogic.gdx.graphics.g3d.f
    public void f(com.planner5d.library.engine.g gVar) {
        super.f(gVar);
        if (gVar != null) {
            h().a();
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.f
    public void flush() {
        this.f94411g.a(this.f94405a, this.f94407c);
        j jVar = null;
        int i10 = 0;
        while (true) {
            com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.h> bVar = this.f94407c;
            if (i10 >= bVar.f95174b) {
                break;
            }
            com.badlogic.gdx.graphics.g3d.h hVar = bVar.get(i10);
            j jVar2 = hVar.f94430i;
            if (jVar2 != null) {
                if (jVar != jVar2) {
                    if (jVar != null) {
                        jVar.end();
                    }
                    jVar2.B1(this.f94405a, this.f94408d);
                    jVar = jVar2;
                }
                jVar.N0(hVar);
            }
            i10++;
        }
        if (jVar != null) {
            jVar.end();
        }
        this.f94406b.g();
        this.f94407c.clear();
    }

    @Override // com.badlogic.gdx.graphics.g3d.f
    public boolean m() {
        return true;
    }

    @Override // ac.a
    public <T> void s0(@p0 ac.g<T> gVar) {
        if (gVar instanceof com.planner5d.library.engine.libgdx.rendering.graphics.shadows.a) {
            E((com.planner5d.library.engine.libgdx.rendering.graphics.shadows.a) gVar);
        }
    }
}
