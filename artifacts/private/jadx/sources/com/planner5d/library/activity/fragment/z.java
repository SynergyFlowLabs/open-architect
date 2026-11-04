package com.planner5d.library.activity.fragment;

import android.app.Activity;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.widget.AppBarLayout;
import com.planner5d.library.widget.ScalableTabLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class z implements com.planner5d.library.services.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f136657a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    private final com.planner5d.library.services.v a(Activity activity) {
        if (activity instanceof com.planner5d.library.services.v) {
            return (com.planner5d.library.services.v) activity;
        }
        throw new RuntimeException(activity.getClass().getName() + " is not MainComponentsProvider");
    }

    @Override // com.planner5d.library.services.v
    @NotNull
    public AppBarLayout b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return a(activity).b(activity);
    }

    @Override // com.planner5d.library.services.v
    @NotNull
    public ScalableTabLayout c(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return a(activity).c(activity);
    }
}
