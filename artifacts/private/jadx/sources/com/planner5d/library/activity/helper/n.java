package com.planner5d.library.activity.helper;

import android.app.Activity;
import android.view.View;
import com.planner5d.library.widget.AppBarLayout;
import com.planner5d.library.widget.ScalableTabLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class n implements com.planner5d.library.services.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f137056a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f137057b = 0;

    private n() {
    }

    @Override // com.planner5d.library.services.v
    @NotNull
    public AppBarLayout b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewFindViewById = activity.findViewById(com.planner5d.library.f.j.Hg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (AppBarLayout) viewFindViewById;
    }

    @Override // com.planner5d.library.services.v
    @NotNull
    public ScalableTabLayout c(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewFindViewById = activity.findViewById(com.planner5d.library.f.j.yw);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (ScalableTabLayout) viewFindViewById;
    }
}
