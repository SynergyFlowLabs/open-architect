package com.planner5d.library.engine.libgdx.rendering.graphics.shadows;

import ac.i;
import android.content.Context;
import com.badlogic.gdx.graphics.g3d.h;
import com.badlogic.gdx.graphics.g3d.j;
import gc.g;

/* JADX INFO: loaded from: classes5.dex */
public class f extends com.badlogic.gdx.graphics.g3d.utils.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final i f160898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.badlogic.gdx.graphics.g3d.shaders.b.c f160899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f160900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j f160901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f160902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f160903h;

    class a implements j {
        a() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.j
        public void B1(com.planner5d.library.engine.g gVar, com.badlogic.gdx.graphics.g3d.utils.i iVar) {
        }

        @Override // com.badlogic.gdx.graphics.g3d.j
        public int J0(j jVar) {
            return jVar == this ? 0 : -1;
        }

        @Override // com.badlogic.gdx.graphics.g3d.j
        public void N0(h hVar) {
        }

        @Override // com.badlogic.gdx.graphics.g3d.j
        public boolean V0(h hVar) {
            return hVar.f94427f.a2(com.badlogic.gdx.graphics.g3d.attributes.a.f94300i) || hVar.f94427f.a2(com.badlogic.gdx.graphics.g3d.attributes.f.f94338h);
        }

        @Override // gc.e
        public void dispose() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.j
        public void end() {
        }

        @Override // com.badlogic.gdx.graphics.g3d.j
        public void r() {
        }
    }

    f(Context context, com.planner5d.library.engine.a aVar, i iVar, g gVar) {
        super(aVar);
        this.f160899d = new com.badlogic.gdx.graphics.g3d.shaders.b.c();
        this.f160901f = null;
        this.f160902g = new a();
        this.f160903h = context;
        this.f160898c = iVar;
        this.f160900e = gVar;
    }

    private String b() {
        return this.f160898c.f4880a.startsWith("VSM_") ? "#define VSM\n" : "";
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.c
    protected j a(h hVar) {
        j eVar = this.f160901f;
        if (eVar == null) {
            eVar = new e(hVar, this.f160899d, com.planner5d.library.engine.libgdx.rendering.graphics.j.a(new com.badlogic.gdx.graphics.glutils.j(this.f94616b, com.planner5d.library.engine.libgdx.rendering.graphics.pipeline.e.e(this.f160903h, zb.b.p.f407245j), b() + com.planner5d.library.engine.libgdx.rendering.graphics.pipeline.e.e(this.f160903h, zb.b.p.f407244i)), this.f160900e));
            this.f160901f = eVar;
            eVar.r();
        }
        return eVar.V0(hVar) ? eVar : this.f160902g;
    }
}
