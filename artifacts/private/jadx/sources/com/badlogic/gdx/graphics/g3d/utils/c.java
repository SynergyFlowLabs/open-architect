package com.badlogic.gdx.graphics.g3d.utils;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.j> f94615a = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.planner5d.library.engine.a f94616b;

    protected c(com.planner5d.library.engine.a aVar) {
        this.f94616b = aVar;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.k
    public com.badlogic.gdx.graphics.g3d.j G0(com.badlogic.gdx.graphics.g3d.h hVar) {
        com.badlogic.gdx.graphics.g3d.j jVar = hVar.f94430i;
        if (jVar != null && jVar.V0(hVar)) {
            return jVar;
        }
        for (com.badlogic.gdx.graphics.g3d.j jVar2 : this.f94615a) {
            if (jVar2.V0(hVar)) {
                return jVar2;
            }
        }
        com.badlogic.gdx.graphics.g3d.j jVarA = a(hVar);
        this.f94615a.c(jVarA);
        return jVarA;
    }

    protected abstract com.badlogic.gdx.graphics.g3d.j a(com.badlogic.gdx.graphics.g3d.h hVar);

    @Override // gc.e
    public void dispose() {
        Iterator<com.badlogic.gdx.graphics.g3d.j> it = this.f94615a.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.f94615a.clear();
    }
}
