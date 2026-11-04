package com.segment.analytics.kotlin.android.plugins;

import android.app.Activity;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface c {

    public static final class a {
        public static void a(@NotNull c cVar, @Nullable Activity activity, @Nullable Bundle bundle) {
        }

        public static void b(@NotNull c cVar, @Nullable Activity activity) {
        }

        public static void c(@NotNull c cVar, @Nullable Activity activity) {
        }

        public static void d(@NotNull c cVar, @Nullable Activity activity) {
        }

        public static void e(@NotNull c cVar, @Nullable Activity activity, @Nullable Bundle bundle) {
        }

        public static void f(@NotNull c cVar, @Nullable Activity activity) {
        }

        public static void g(@NotNull c cVar, @Nullable Activity activity) {
        }
    }

    void onActivityCreated(@Nullable Activity activity, @Nullable Bundle bundle);

    void onActivityDestroyed(@Nullable Activity activity);

    void onActivityPaused(@Nullable Activity activity);

    void onActivityResumed(@Nullable Activity activity);

    void onActivitySaveInstanceState(@Nullable Activity activity, @Nullable Bundle bundle);

    void onActivityStarted(@Nullable Activity activity);

    void onActivityStopped(@Nullable Activity activity);
}
