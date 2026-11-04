package com.planner5d.library.model.manager.initialization;

import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
public final class v implements x.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f191713b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.model.manager.statistics.b0> f191714a;

    @ij.a
    public v(@NotNull fg.e<com.planner5d.library.model.manager.statistics.b0> statisticsManager) {
        Intrinsics.checkNotNullParameter(statisticsManager, "statisticsManager");
        this.f191714a = statisticsManager;
    }

    @Override // com.planner5d.library.model.manager.initialization.x.b
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f191714a.get().i();
        return Unit.f312394a;
    }
}
