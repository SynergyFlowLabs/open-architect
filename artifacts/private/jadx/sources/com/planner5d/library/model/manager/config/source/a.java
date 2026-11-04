package com.planner5d.library.model.manager.config.source;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class a implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f181654b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f181655a;

    @ij.a
    public a(@NotNull com.planner5d.library.application.d applicationConfiguration) {
        Intrinsics.checkNotNullParameter(applicationConfiguration, "applicationConfiguration");
        this.f181655a = applicationConfiguration;
    }

    @Override // com.planner5d.library.model.manager.config.source.d
    @Nullable
    public Object a(@NotNull com.planner5d.library.model.manager.config.f fVar, @NotNull kotlin.coroutines.d<? super com.planner5d.library.model.manager.config.g> dVar) {
        return this.f181655a.l(fVar);
    }
}
