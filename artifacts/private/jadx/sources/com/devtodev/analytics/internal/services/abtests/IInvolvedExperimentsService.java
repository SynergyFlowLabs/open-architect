package com.devtodev.analytics.internal.services.abtests;

import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.abTests.ExperimentMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface IInvolvedExperimentsService {
    void activateExperimentMarker();

    void cacheExperimentMarker(@Nullable ExperimentMarker experimentMarker);

    void clearExperimentMarker();

    @Nullable
    ExperimentMarker getCacheExperimentMarker();

    boolean isActiveExperimentStarted();

    boolean isExperimentTesting(long j10);

    boolean isMarkedExperimentFound();

    boolean isNeedCacheTestingExperiment();

    boolean isUserHasInvolvedGroup(@NotNull User user);

    void startActiveExperiment();

    void stopActiveExperiment();

    @Nullable
    ExperimentMarker tryLoadExperimentMarker();
}
