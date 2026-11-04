package com.planner5d.library.application;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFilteredActivitiesLoggingActivityLifecycleCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilteredActivitiesLoggingActivityLifecycleCallbacks.kt\ncom/planner5d/library/application/FilteredActivitiesLoggingActivityLifecycleCallbacks\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n2632#2,3:28\n*S KotlinDebug\n*F\n+ 1 FilteredActivitiesLoggingActivityLifecycleCallbacks.kt\ncom/planner5d/library/application/FilteredActivitiesLoggingActivityLifecycleCallbacks\n*L\n14#1:28,3\n*E\n"})
public final class o5 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f142888c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<String> f142889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.statistics.b0 f142890b;

    public o5(@NotNull List<String> excludedPackages, @NotNull com.planner5d.library.model.manager.statistics.b0 statisticsManager) {
        Intrinsics.checkNotNullParameter(excludedPackages, "excludedPackages");
        Intrinsics.checkNotNullParameter(statisticsManager, "statisticsManager");
        this.f142889a = excludedPackages;
        this.f142890b = statisticsManager;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Package r10 = activity.getClass().getPackage();
        String name = r10 != null ? r10.getName() : null;
        List<String> list = this.f142889a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str : list) {
                if (name != null && StringsKt.u2(name, str, false, 2, null)) {
                    return;
                }
            }
        }
        this.f142890b.a(activity.getClass());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
