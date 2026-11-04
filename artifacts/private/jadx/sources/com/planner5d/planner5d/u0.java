package com.planner5d.planner5d;

import android.view.View;
import com.planner5d.library.services.utility.z0;
import com.planner5d.library.widget.carousel.CarouselView;
import com.planner5d.library.widget.s1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@fg.h
public final class u0 {
    @fg.i
    @NotNull
    public final z0 a(@NotNull com.planner5d.library.services.utility.p0 formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return formatter;
    }

    @fg.i
    @ij.f
    @NotNull
    public final View b(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new CarouselView(application);
    }

    @fg.i
    @ij.f
    @NotNull
    public final com.planner5d.library.widget.drawable.d c() {
        return com.planner5d.library.widget.drawable.c.f254258a;
    }

    @fg.i
    @ij.f
    @NotNull
    public final s1 d(@NotNull com.planner5d.library.activity.tutorial.p tutorialManager) {
        Intrinsics.checkNotNullParameter(tutorialManager, "tutorialManager");
        return new com.planner5d.library.activity.tutorial.o(tutorialManager);
    }
}
