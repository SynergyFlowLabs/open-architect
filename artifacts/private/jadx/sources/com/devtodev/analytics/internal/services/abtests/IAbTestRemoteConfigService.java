package com.devtodev.analytics.internal.services.abtests;

import com.devtodev.analytics.internal.backend.repository.RemoteConfig;
import com.devtodev.analytics.internal.backend.repository.UserProperties;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IAbTestRemoteConfigService {
    void applyExperiments(@NotNull List<AbTestsExperiment> list);

    void applyRemoteConfig(@NotNull RemoteConfig remoteConfig);

    void createExperimentState();

    void deleteExpiredExperiments();

    void deleteInactiveExperimentsState(@NotNull List<Long> list);

    @Nullable
    Long getAbTestsProjectVersion();

    @Nullable
    UserProperties getUserProperties();

    void markAsRefused(@NotNull List<Long> list);
}
