package com.devtodev.analytics.internal.services.purchases;

import com.devtodev.analytics.internal.backend.ConfigEntry;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface ISubscriptionService {
    boolean isHistoryNeedReset(@NotNull ConfigEntry configEntry);

    boolean isNeedRestoreHistory();

    void markAsSendRestoredHistory();

    void resetHistoryMark();
}
