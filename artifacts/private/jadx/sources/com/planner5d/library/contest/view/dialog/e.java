package com.planner5d.library.contest.view.dialog;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.statistics.events.l3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class e extends f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f153566b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l3 f153567a;

    @ij.a
    public e(@NotNull l3 statisticsEventContests) {
        Intrinsics.checkNotNullParameter(statisticsEventContests, "statisticsEventContests");
        this.f153567a = statisticsEventContests;
    }

    public final void U() {
        this.f153567a.K0();
    }

    public final void V() {
        this.f153567a.g1();
    }
}
