package com.superwall.sdk.misc;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class CurrentActivityTracker implements Application.ActivityLifecycleCallbacks, ActivityProvider {

    @Nullable
    private WeakReference<Activity> currentActivity;

    @Override // com.superwall.sdk.misc.ActivityProvider
    @Nullable
    public Activity getCurrentActivity() {
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.all, "!! getCurrentActivity: " + this.currentActivity, null, null, 24, null);
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.all, "!! onActivityCreated: " + activity, null, null, 24, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.all, "!! onActivityDestroyed: " + activity, null, null, 24, null);
        if (Intrinsics.areEqual(this.currentActivity, activity)) {
            this.currentActivity = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.all, "!! onActivityResumed: " + activity, null, null, 24, null);
        this.currentActivity = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.all, "!! onActivityStarted: " + activity, null, null, 24, null);
        this.currentActivity = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
