package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.backend.ConfigEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IAnalyticsConfigService {
    @Nullable
    Function1<Long, Unit> getOnIdentifiersUpdate();

    @Nullable
    Function1<ConfigEntry, Unit> getOnSdkConfigUpdate();

    void invalidateUserBackendIds();

    void receiveAnalyticsConfig();

    void receiveUserBackendIds();

    void setOnIdentifiersUpdate(@Nullable Function1<? super Long, Unit> function1);

    void setOnSdkConfigUpdate(@Nullable Function1<? super ConfigEntry, Unit> function1);
}
