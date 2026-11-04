package com.devtodev.analytics.internal.modues.analytics;

import com.devtodev.analytics.internal.lifecycle.ILifecycleRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IAnalyticsProxy extends IAnalytics {
    void getCustomUrl(@NotNull Function1<? super String, Unit> function1);

    void getProxyUrl(@NotNull Function1<? super String, Unit> function1);

    void initialize(@NotNull IAnalytics iAnalytics, @NotNull ILifecycleRepository iLifecycleRepository);

    void setCustomUrl(@NotNull String str);

    void setProxyUrl(@NotNull String str);
}
