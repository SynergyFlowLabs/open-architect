package com.devtodev.analytics.internal.managers;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AbTestManager implements IAbTestManager {

    @Nullable
    private Long configVersion;

    @NotNull
    private List<Long> suitableExperiments = CollectionsKt.emptyList();

    @NotNull
    private Map<String, ? extends Object> config = MapsKt.emptyMap();

    @Override // com.devtodev.analytics.internal.managers.IAbTestManager
    @NotNull
    public Map<String, Object> getConfig() {
        return this.config;
    }

    @Override // com.devtodev.analytics.internal.managers.IAbTestManager
    @Nullable
    public Long getConfigVersion() {
        return this.configVersion;
    }

    @Override // com.devtodev.analytics.internal.managers.IAbTestManager
    @NotNull
    public List<Long> getSuitableExperiments() {
        return this.suitableExperiments;
    }

    @Override // com.devtodev.analytics.internal.managers.IAbTestManager
    public void setConfig(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.config = map;
    }

    @Override // com.devtodev.analytics.internal.managers.IAbTestManager
    public void setConfigVersion(@Nullable Long l10) {
        this.configVersion = l10;
    }

    @Override // com.devtodev.analytics.internal.managers.IAbTestManager
    public void setSuitableExperiments(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.suitableExperiments = list;
    }
}
