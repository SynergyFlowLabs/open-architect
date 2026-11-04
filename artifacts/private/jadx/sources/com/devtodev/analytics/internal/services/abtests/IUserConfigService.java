package com.devtodev.analytics.internal.services.abtests;

import com.devtodev.analytics.internal.domain.events.abTests.ExperimentMarker;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IUserConfigService {
    void clearRemoteConfigParameters();

    @NotNull
    Map<String, Object> getUserConfig();

    boolean toRemoteConfigParameters(@NotNull ExperimentMarker experimentMarker);
}
