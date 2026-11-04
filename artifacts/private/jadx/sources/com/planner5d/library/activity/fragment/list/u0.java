package com.planner5d.library.activity.fragment.list;

import android.os.Bundle;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.projects.Projects;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.activity.fragment.snapshots.Snapshots;
import com.planner5d.library.activity.fragment.spaces.documents.Documents;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u0 f134434a = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f134435b = 0;

    private u0() {
    }

    public static /* synthetic */ com.planner5d.library.activity.helper.event.content.c d(u0 u0Var, Bundle bundle, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return u0Var.b(bundle, z10);
    }

    public static /* synthetic */ com.planner5d.library.activity.helper.event.content.c e(u0 u0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return u0Var.c(z10);
    }

    @NotNull
    public final com.planner5d.library.activity.helper.event.content.c a(@NotNull Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) Documents.class, state);
    }

    @NotNull
    public final com.planner5d.library.activity.helper.event.content.c b(@Nullable Bundle bundle, boolean z10) {
        return new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ProjectsPagesFragment.class, new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, z10 ? com.planner5d.library.services.r.snapshotsList : com.planner5d.library.services.r.floorPlansList).h(z10 ? com.planner5d.library.services.r.snapshotsList : com.planner5d.library.services.r.floorPlansList, bundle).a());
    }

    @NotNull
    public final com.planner5d.library.activity.helper.event.content.c c(boolean z10) {
        return new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ProjectsPagesFragment.class, new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, z10 ? com.planner5d.library.services.r.snapshotsList : com.planner5d.library.services.r.floorPlansList).a());
    }

    @NotNull
    public final com.planner5d.library.activity.helper.event.content.c f(@NotNull Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) Projects.class, state);
    }

    @NotNull
    public final com.planner5d.library.activity.helper.event.content.c g(@NotNull Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) Snapshots.class, state);
    }
}
