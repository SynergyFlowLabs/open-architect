package com.devtodev.analytics.internal.backend.repository;

import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class RemoteConfig extends RemoteConfigSealedClass {

    @NotNull
    private List<AbTestsExperiment> abExperiments;

    @Nullable
    private UserProperties userProperties;
    private long version;

    public RemoteConfig() {
        super(null);
        this.abExperiments = CollectionsKt.emptyList();
    }

    @NotNull
    public final List<AbTestsExperiment> getAbExperiments() {
        return this.abExperiments;
    }

    @Nullable
    public final UserProperties getUserProperties() {
        return this.userProperties;
    }

    public final long getVersion() {
        return this.version;
    }

    public final void setAbExperiments(@NotNull List<AbTestsExperiment> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.abExperiments = list;
    }

    public final void setUserProperties(@Nullable UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public final void setVersion(long j10) {
        this.version = j10;
    }
}
