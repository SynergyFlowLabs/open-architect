package com.planner5d.library.engine.libgdx.rendering.model;

import cc.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements f {
    @Override // cc.f
    @NotNull
    public cc.e a(@NotNull cc.c instance, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return new b(instance, bool);
    }
}
