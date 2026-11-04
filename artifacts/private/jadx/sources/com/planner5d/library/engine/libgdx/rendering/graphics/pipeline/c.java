package com.planner5d.library.engine.libgdx.rendering.graphics.pipeline;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.d0;
import com.planner5d.library.math.m;
import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
class c extends com.badlogic.gdx.graphics.g3d.utils.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.planner5d.library.engine.g f160861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f160862e = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.planner5d.library.engine.rendering.util.c f160863f = com.planner5d.library.engine.rendering.util.c.None;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Comparator<com.badlogic.gdx.graphics.g3d.h> f160864g = new a();

    class a implements Comparator<com.badlogic.gdx.graphics.g3d.h> {
        a() {
        }

        private m b(com.badlogic.gdx.graphics.g3d.h hVar, m mVar) {
            Object obj = hVar.f94431j;
            if (obj != null) {
                mVar.A0((m) obj);
                return mVar;
            }
            Matrix4 matrix4 = hVar.f94422a;
            d0 d0VarC = t4.a.c(mVar);
            Objects.requireNonNull(d0VarC);
            mVar.A0(matrix4.r(d0VarC));
            return mVar;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.h hVar2) {
            double dB0 = c.this.f160861d.getPosition().b0(b(hVar, c.this.f160862e)) - c.this.f160861d.getPosition().b0(b(hVar2, c.this.f160862e));
            if (dB0 < 0.0d) {
                return 1;
            }
            return dB0 > 0.0d ? -1 : 0;
        }
    }

    c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.badlogic.gdx.utils.b, com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.h>] */
    @Override // com.badlogic.gdx.graphics.g3d.utils.d, com.badlogic.gdx.graphics.g3d.utils.j
    public void a(com.planner5d.library.engine.g gVar, com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.h> bVar) {
        ?? r10;
        com.planner5d.library.engine.rendering.util.c cVar = this.f160863f;
        if (cVar != com.planner5d.library.engine.rendering.util.c.None) {
            this.f160861d = gVar;
            if (cVar == com.planner5d.library.engine.rendering.util.c.Blended) {
                this = this;
                r10 = this.f160864g;
            }
            this = this;
            bVar.sort(r10);
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.d, java.util.Comparator
    /* JADX INFO: renamed from: b */
    public int compare(com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.h hVar2) {
        return hVar.f94430i.hashCode() - hVar2.f94430i.hashCode();
    }

    void e(com.planner5d.library.engine.rendering.util.c cVar) {
        this.f160863f = cVar;
    }
}
