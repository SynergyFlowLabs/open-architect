package com.planner5d.library.spaces.view.survey.spacetype;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.statistics.events.c4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class g extends f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f230602b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c4 f230603a;

    @ij.a
    public g(@NotNull c4 statisticsEventSpaces) {
        Intrinsics.checkNotNullParameter(statisticsEventSpaces, "statisticsEventSpaces");
        this.f230603a = statisticsEventSpaces;
    }

    public final void U(@NotNull c4.g userSelection) {
        Intrinsics.checkNotNullParameter(userSelection, "userSelection");
        c4.b.b(this.f230603a, c4.d.what_type_of_space, userSelection.name(), null, 4, null);
    }
}
