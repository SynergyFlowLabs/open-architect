package com.planner5d.library.engine.libgdx.rendering;

import ac.e;
import ac.f;
import ac.h;
import ac.j;
import android.content.Context;
import gc.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f {
    @Override // ac.f
    @NotNull
    public h a(@NotNull com.planner5d.library.engine.a application, boolean z10, @NotNull g errorHandler) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        return new com.planner5d.library.engine.libgdx.rendering.graphics.pipeline.b(application, z10, errorHandler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ac.f
    @NotNull
    public <T> e<T> b(@NotNull g errorHandler, @NotNull ac.a batch, int i10, @NotNull h environment, @NotNull ac.b<? extends T> gridScaleResetter, @NotNull com.planner5d.library.engine.rendering.util.b scaler, @NotNull j<? extends T> targetLinesProvider) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(batch, "batch");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(gridScaleResetter, "gridScaleResetter");
        Intrinsics.checkNotNullParameter(scaler, "scaler");
        Intrinsics.checkNotNullParameter(targetLinesProvider, "targetLinesProvider");
        return new c(errorHandler, (com.badlogic.gdx.graphics.g3d.f) batch, i10, (com.badlogic.gdx.graphics.g3d.c) environment, gridScaleResetter, scaler, new a(), targetLinesProvider);
    }

    @Override // ac.f
    @NotNull
    public ac.a c(@NotNull Context context, @NotNull com.planner5d.library.engine.a application, @NotNull g errorHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        return new com.planner5d.library.engine.libgdx.rendering.graphics.pipeline.a(context, application, errorHandler);
    }

    @Override // ac.f
    @NotNull
    public <T> j<T> d() {
        return new b();
    }
}
