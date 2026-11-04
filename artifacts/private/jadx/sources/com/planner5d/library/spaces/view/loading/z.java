package com.planner5d.library.spaces.view.loading;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.statistics.events.c4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class z extends f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f230432b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c4 f230433a;

    @ij.a
    public z(@NotNull c4 statisticsEventSpaces) {
        Intrinsics.checkNotNullParameter(statisticsEventSpaces, "statisticsEventSpaces");
        this.f230433a = statisticsEventSpaces;
    }

    public final void U() {
        int i10 = 4 | 0;
        c4.b.a(this.f230433a, c4.a.open, c4.c.loader, null, null, 12, null);
    }
}
