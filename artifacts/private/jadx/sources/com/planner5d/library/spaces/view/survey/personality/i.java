package com.planner5d.library.spaces.view.survey.personality;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.statistics.events.c4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class i extends f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f230585b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c4 f230586a;

    @ij.a
    public i(@NotNull c4 statisticsEventSpaces) {
        Intrinsics.checkNotNullParameter(statisticsEventSpaces, "statisticsEventSpaces");
        this.f230586a = statisticsEventSpaces;
    }

    public final void U(@Nullable c4.f fVar, @Nullable Integer num) {
        this.f230586a.a1(c4.d.which_best_describes_you, fVar != null ? fVar.name() : null, num);
    }
}
