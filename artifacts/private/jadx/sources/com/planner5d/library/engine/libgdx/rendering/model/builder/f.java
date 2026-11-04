package com.planner5d.library.engine.libgdx.rendering.model.builder;

import com.badlogic.gdx.math.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends h implements dc.f<com.planner5d.library.engine.libgdx.rendering.model.d> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.badlogic.gdx.graphics.g3d.d f160912f;

    public f() {
        super(new com.planner5d.library.engine.util.math.b(new d0(-0.5f, -0.5f, -0.5f), new d0(0.5f, 0.5f, 0.5f)));
        this.f160912f = new com.badlogic.gdx.graphics.g3d.d(4.0f, true);
    }

    @Override // com.planner5d.library.engine.libgdx.rendering.model.builder.h
    @NotNull
    protected com.badlogic.gdx.graphics.g3d.d x() {
        return this.f160912f;
    }

    @Override // com.planner5d.library.engine.libgdx.rendering.model.builder.h
    protected void y(@NotNull com.badlogic.gdx.graphics.g3d.utils.g partBuilder, int i10) {
        Intrinsics.checkNotNullParameter(partBuilder, "partBuilder");
        partBuilder.w(0.5f, 0.5f, 0.5f, 1.0f);
    }

    @Override // dc.f
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.libgdx.rendering.model.d a(@NotNull com.planner5d.library.engine.a application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return e(application, -1);
    }
}
