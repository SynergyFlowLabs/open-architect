package com.planner5d.library.engine.libgdx.rendering.graphics.pipeline;

import com.badlogic.gdx.graphics.g3d.attributes.j;
import com.badlogic.gdx.graphics.g3d.attributes.k;

/* JADX INFO: loaded from: classes5.dex */
class h extends com.badlogic.gdx.graphics.g3d.shaders.a.b {
    h() {
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
    public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
        k kVar = (k) bVar.W1(j.f94350k);
        if (kVar != null) {
            aVar.B(i10, kVar.f94369p2, -((float) Math.toRadians(kVar.H1)), kVar.f94367g3, kVar.f94368h3);
        }
    }
}
