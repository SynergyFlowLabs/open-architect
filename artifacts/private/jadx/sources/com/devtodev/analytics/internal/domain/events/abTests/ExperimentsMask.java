package com.devtodev.analytics.internal.domain.events.abTests;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ExperimentsMask {
    private final long experimentId;

    @NotNull
    private final List<String> maskEventKeys;

    public ExperimentsMask(long j10, @NotNull List<String> maskEventKeys) {
        Intrinsics.checkNotNullParameter(maskEventKeys, "maskEventKeys");
        this.experimentId = j10;
        this.maskEventKeys = maskEventKeys;
    }

    public final long getExperimentId() {
        return this.experimentId;
    }

    @NotNull
    public final List<String> getMaskEventKeys() {
        return this.maskEventKeys;
    }

    public /* synthetic */ ExperimentsMask(long j10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? new ArrayList() : list);
    }
}
