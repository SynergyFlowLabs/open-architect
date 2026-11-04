package com.superwall.sdk.paywall.presentation.internal.state;

import com.superwall.sdk.models.triggers.Experiment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PaywallSkippedReason extends Throwable {

    public static final class Holdout extends PaywallSkippedReason {

        @NotNull
        private final Experiment experiment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holdout(@NotNull Experiment experiment) {
            super(null);
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            this.experiment = experiment;
        }

        public static /* synthetic */ Holdout copy$default(Holdout holdout, Experiment experiment, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                experiment = holdout.experiment;
            }
            return holdout.copy(experiment);
        }

        @NotNull
        public final Experiment component1() {
            return this.experiment;
        }

        @NotNull
        public final Holdout copy(@NotNull Experiment experiment) {
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            return new Holdout(experiment);
        }

        @Override // com.superwall.sdk.paywall.presentation.internal.state.PaywallSkippedReason
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Holdout) && Intrinsics.areEqual(this.experiment, ((Holdout) obj).experiment);
        }

        @NotNull
        public final Experiment getExperiment() {
            return this.experiment;
        }

        public int hashCode() {
            return this.experiment.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "Holdout(experiment=" + this.experiment + ")";
        }
    }

    public static final class NoAudienceMatch extends PaywallSkippedReason {
        public NoAudienceMatch() {
            super(null);
        }
    }

    public static final class PlacementNotFound extends PaywallSkippedReason {
        public PlacementNotFound() {
            super(null);
        }
    }

    public static final class UserIsSubscribed extends PaywallSkippedReason {
        public UserIsSubscribed() {
            super(null);
        }
    }

    public /* synthetic */ PaywallSkippedReason(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean equals(@Nullable Object obj) {
        if ((this instanceof Holdout) && (obj instanceof Holdout)) {
            return Intrinsics.areEqual(((Holdout) this).getExperiment(), ((Holdout) obj).getExperiment());
        }
        if ((this instanceof NoAudienceMatch) && (obj instanceof NoAudienceMatch)) {
            return true;
        }
        if ((this instanceof PlacementNotFound) && (obj instanceof PlacementNotFound)) {
            return true;
        }
        return (this instanceof UserIsSubscribed) && (obj instanceof UserIsSubscribed);
    }

    private PaywallSkippedReason() {
    }
}
