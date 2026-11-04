package com.planner5d.library.engine.libgdx.rendering.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements cc.b {
    @Override // cc.b
    @NotNull
    public cc.a a(@NotNull gc.e data, @NotNull com.planner5d.library.engine.util.math.b bounds, @Nullable com.planner5d.library.engine.rendering.util.a aVar) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return new d((com.badlogic.gdx.graphics.g3d.e) data, bounds, (com.planner5d.library.engine.libgdx.rendering.util.a) aVar);
    }
}
