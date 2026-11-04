package com.superwall.sdk.models.assignment;

import com.superwall.sdk.models.triggers.Experiment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ConfirmableAssignment {

    @NotNull
    private final String experimentId;

    @NotNull
    private final Experiment.Variant variant;

    public ConfirmableAssignment(@NotNull String experimentId, @NotNull Experiment.Variant variant) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.experimentId = experimentId;
        this.variant = variant;
    }

    public static /* synthetic */ ConfirmableAssignment copy$default(ConfirmableAssignment confirmableAssignment, String str, Experiment.Variant variant, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = confirmableAssignment.experimentId;
        }
        if ((i10 & 2) != 0) {
            variant = confirmableAssignment.variant;
        }
        return confirmableAssignment.copy(str, variant);
    }

    @NotNull
    public final String component1() {
        return this.experimentId;
    }

    @NotNull
    public final Experiment.Variant component2() {
        return this.variant;
    }

    @NotNull
    public final ConfirmableAssignment copy(@NotNull String experimentId, @NotNull Experiment.Variant variant) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(variant, "variant");
        return new ConfirmableAssignment(experimentId, variant);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmableAssignment)) {
            return false;
        }
        ConfirmableAssignment confirmableAssignment = (ConfirmableAssignment) obj;
        return Intrinsics.areEqual(this.experimentId, confirmableAssignment.experimentId) && Intrinsics.areEqual(this.variant, confirmableAssignment.variant);
    }

    @NotNull
    public final String getExperimentId() {
        return this.experimentId;
    }

    @NotNull
    public final Experiment.Variant getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return (this.experimentId.hashCode() * 31) + this.variant.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConfirmableAssignment(experimentId=" + this.experimentId + ", variant=" + this.variant + ")";
    }
}
