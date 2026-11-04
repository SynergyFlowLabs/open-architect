package com.planner5d.library.engine.libgdx.rendering.model.builder;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements dc.c<com.planner5d.library.engine.libgdx.rendering.model.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private com.badlogic.gdx.graphics.g3d.utils.h f160907a;

    @Override // dc.c
    public void f(@NotNull com.planner5d.library.engine.a application) {
        Intrinsics.checkNotNullParameter(application, "application");
        com.badlogic.gdx.graphics.g3d.utils.h hVar = new com.badlogic.gdx.graphics.g3d.utils.h(application);
        this.f160907a = hVar;
        Intrinsics.checkNotNull(hVar);
        hVar.a();
    }

    @Nullable
    protected final com.planner5d.library.engine.libgdx.rendering.model.d q() {
        return g(null);
    }

    @Override // dc.c
    @Nullable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.libgdx.rendering.model.d g(@Nullable com.planner5d.library.engine.rendering.util.a aVar) {
        com.badlogic.gdx.graphics.g3d.utils.h hVar = this.f160907a;
        Intrinsics.checkNotNull(hVar);
        com.badlogic.gdx.graphics.g3d.e eVarY = hVar.y();
        this.f160907a = null;
        if (eVarY == null || eVarY.f94386d.f95174b <= 0 || eVarY.f94384b.f95174b <= 0) {
            return null;
        }
        return new com.planner5d.library.engine.libgdx.rendering.model.d(eVarY, eVarY.a(new com.planner5d.library.engine.util.math.b()), (com.planner5d.library.engine.libgdx.rendering.util.a) aVar);
    }

    @Nullable
    protected final com.badlogic.gdx.graphics.g3d.utils.h s() {
        return this.f160907a;
    }

    protected final void t(@Nullable com.badlogic.gdx.graphics.g3d.utils.h hVar) {
        this.f160907a = hVar;
    }
}
