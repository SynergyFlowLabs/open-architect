package com.devtodev.analytics.internal.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import com.devtodev.analytics.internal.services.abtests.SuitableExperimentsServiceKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAndroidLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidLifecycle.kt\ncom/devtodev/analytics/internal/lifecycle/AndroidLifecycle\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,114:1\n1855#2,2:115\n1855#2,2:120\n553#3,3:117\n*S KotlinDebug\n*F\n+ 1 AndroidLifecycle.kt\ncom/devtodev/analytics/internal/lifecycle/AndroidLifecycle\n*L\n60#1:115,2\n81#1:120,2\n80#1:117,3\n*E\n"})
public final class AndroidLifecycle implements Application.ActivityLifecycleCallbacks {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String INVALID_THEME = "Theme.Translucent.NoTitleBar";

    @NotNull
    private final HashMap<Integer, Boolean> activityStates;

    @NotNull
    private List<? extends ILifecycle> lifecycleList;
    private final PackageManager packageManager;
    private final Resources resources;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidLifecycle(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.lifecycleList = CollectionsKt.emptyList();
        this.activityStates = new HashMap<>();
        this.packageManager = context.getPackageManager();
        this.resources = context.getResources();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
    }

    private final String getInvalidTheme(Activity activity) {
        try {
            int i10 = this.packageManager.getActivityInfo(activity.getComponentName(), 128).theme;
            if (i10 == 0) {
                return null;
            }
            return this.resources.getResourceEntryName(i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Intrinsics.areEqual(getInvalidTheme(activity), INVALID_THEME)) {
            return;
        }
        this.activityStates.put(Integer.valueOf(activity.hashCode()), Boolean.TRUE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Intrinsics.areEqual(getInvalidTheme(activity), INVALID_THEME)) {
            return;
        }
        this.activityStates.remove(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!Intrinsics.areEqual(getInvalidTheme(activity), INVALID_THEME)) {
            Iterator<T> it = this.lifecycleList.iterator();
            while (it.hasNext()) {
                ((ILifecycle) it.next()).onEnterForeground();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Intrinsics.areEqual(getInvalidTheme(activity), INVALID_THEME)) {
            return;
        }
        this.activityStates.put(Integer.valueOf(activity.hashCode()), Boolean.TRUE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Intrinsics.areEqual(getInvalidTheme(activity), INVALID_THEME)) {
            return;
        }
        this.activityStates.put(Integer.valueOf(activity.hashCode()), Boolean.FALSE);
        HashMap<Integer, Boolean> map = this.activityStates;
        if (!map.isEmpty()) {
            Iterator<Map.Entry<Integer, Boolean>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().booleanValue()) {
                    return;
                }
            }
        }
        Iterator<T> it2 = this.lifecycleList.iterator();
        while (it2.hasNext()) {
            ((ILifecycle) it2.next()).onEnterBackground();
        }
    }

    public final void setLifecycleListener(@NotNull ILifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.lifecycleList = SuitableExperimentsServiceKt.add(this.lifecycleList, lifecycle);
    }
}
