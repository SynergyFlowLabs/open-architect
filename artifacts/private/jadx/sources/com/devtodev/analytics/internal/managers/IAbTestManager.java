package com.devtodev.analytics.internal.managers;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IAbTestManager {
    @NotNull
    Map<String, Object> getConfig();

    @Nullable
    Long getConfigVersion();

    @NotNull
    List<Long> getSuitableExperiments();

    void setConfig(@NotNull Map<String, ? extends Object> map);

    void setConfigVersion(@Nullable Long l10);

    void setSuitableExperiments(@NotNull List<Long> list);
}
