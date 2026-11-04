package com.planner5d.library.engine.libgdx.rendering.model.builder;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends a implements dc.b<com.planner5d.library.engine.libgdx.rendering.model.d> {
    @Override // dc.b
    @NotNull
    public dc.e<com.planner5d.library.engine.libgdx.rendering.model.d> n(@NotNull String id2, @NotNull bc.b material) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(material, "material");
        com.badlogic.gdx.graphics.g3d.utils.h hVarS = s();
        Intrinsics.checkNotNull(hVarS);
        com.badlogic.gdx.graphics.g3d.utils.g gVarH = hVarS.H(id2, 4, 25L, (com.badlogic.gdx.graphics.g3d.d) material);
        Intrinsics.checkNotNullExpressionValue(gVarH, "part(...)");
        return new e(gVarH);
    }

    @Override // dc.b
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.libgdx.rendering.util.a c(float f10) {
        return new com.planner5d.library.engine.libgdx.rendering.util.a(f10, 3);
    }

    @Override // dc.b
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.libgdx.rendering.util.a k(float f10) {
        return new com.planner5d.library.engine.libgdx.rendering.util.a(f10, 5);
    }

    @Override // dc.b
    @NotNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.libgdx.rendering.util.a b(@NotNull com.planner5d.library.math.c line, @NotNull com.planner5d.library.math.k origin) {
        Intrinsics.checkNotNullParameter(line, "line");
        Intrinsics.checkNotNullParameter(origin, "origin");
        return new com.planner5d.library.engine.libgdx.rendering.util.a(line, origin, 6);
    }

    @Override // dc.b
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.libgdx.rendering.util.a l(float f10) {
        return new com.planner5d.library.engine.libgdx.rendering.util.a(f10, 4);
    }
}
