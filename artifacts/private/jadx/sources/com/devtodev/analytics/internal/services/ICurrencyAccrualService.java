package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.currencyAccrual.CurrencyAccrualResource;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface ICurrencyAccrualService {
    void addCurrencyAccrual(@NotNull CurrencyAccrualResource currencyAccrualResource);

    @Nullable
    Map<String, Map<String, Long>> getBoughtResources(long j10, @Nullable User user);

    @Nullable
    Map<String, Map<String, Long>> getEarnedResources(long j10, @Nullable User user);

    @Nullable
    Long getLastCreatedTime(@NotNull User user);

    boolean isContainsCurrencyAccrual();

    void removeAllResources();

    void removeInactiveUsers(@NotNull List<User> list);

    void removeResources(@NotNull User user);

    void removeResourcesForActiveUser();
}
