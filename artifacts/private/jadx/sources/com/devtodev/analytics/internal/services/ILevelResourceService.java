package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.currencyAccrual.LevelResource;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface ILevelResourceService {
    void addLevelResource(@NotNull LevelResource levelResource);

    @Nullable
    Map<String, Long> getBoughtResources(long j10);

    @Nullable
    Map<String, Long> getEarnedResources(long j10);

    @Nullable
    Map<String, Long> getSpendResources(long j10);

    void removeAllResources();

    void removeInactiveUsers(@NotNull List<User> list);

    void removeResourcesForActiveUser();
}
