package com.devtodev.analytics.internal.services.abtests;

import com.devtodev.analytics.internal.backend.repository.UserData;
import com.devtodev.analytics.internal.domain.EventObject;
import com.devtodev.analytics.internal.domain.events.abTests.AudienceLocalData;
import com.devtodev.analytics.internal.domain.events.people.People;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface ISuitableExperimentsService {
    void addSuitableExperiments(@NotNull List<Long> list);

    void clearTemporaryProcessedExperiments();

    @NotNull
    List<Long> getSuitableExperiments();

    boolean hasActiveExperiments();

    void markAsProcessed(@NotNull List<Long> list);

    void removeAudienceCheckMarks();

    void resetAudienceState();

    @NotNull
    List<Long> searchSuitableExperiments(@Nullable EventObject eventObject);

    void updateActiveAudienceState(@NotNull AudienceLocalData audienceLocalData, @NotNull People people, @Nullable UserData userData);
}
