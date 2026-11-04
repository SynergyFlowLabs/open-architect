package com.superwall.sdk.models.assignment;

import com.superwall.sdk.models.triggers.Experiment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ConfirmedAssignment {

    @NotNull
    private final String experimentId;

    @NotNull
    private final Experiment.Variant variant;

    public ConfirmedAssignment(@NotNull String experimentId, @NotNull Experiment.Variant variant) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.experimentId = experimentId;
        this.variant = variant;
    }

    @NotNull
    public final String getExperimentId() {
        return this.experimentId;
    }

    @NotNull
    public final Experiment.Variant getVariant() {
        return this.variant;
    }
}
