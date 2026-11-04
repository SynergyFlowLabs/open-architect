package com.superwall.sdk.models.triggers;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class InternalTriggerResult {

    public static final class Error extends InternalTriggerResult {

        @NotNull
        private final Exception error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Exception error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = error.error;
            }
            return error.copy(exc);
        }

        @NotNull
        public final Exception component1() {
            return this.error;
        }

        @NotNull
        public final Error copy(@NotNull Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.error, ((Error) obj).error);
        }

        @NotNull
        public final Exception getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    public static final class Holdout extends InternalTriggerResult {

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

        @NotNull
        public String toString() {
            return "Holdout(experiment=" + this.experiment + ")";
        }
    }

    public static final class NoAudienceMatch extends InternalTriggerResult {

        @NotNull
        private final List<UnmatchedRule> unmatchedRules;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoAudienceMatch(@NotNull List<UnmatchedRule> unmatchedRules) {
            super(null);
            Intrinsics.checkNotNullParameter(unmatchedRules, "unmatchedRules");
            this.unmatchedRules = unmatchedRules;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NoAudienceMatch copy$default(NoAudienceMatch noAudienceMatch, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = noAudienceMatch.unmatchedRules;
            }
            return noAudienceMatch.copy(list);
        }

        @NotNull
        public final List<UnmatchedRule> component1() {
            return this.unmatchedRules;
        }

        @NotNull
        public final NoAudienceMatch copy(@NotNull List<UnmatchedRule> unmatchedRules) {
            Intrinsics.checkNotNullParameter(unmatchedRules, "unmatchedRules");
            return new NoAudienceMatch(unmatchedRules);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoAudienceMatch) && Intrinsics.areEqual(this.unmatchedRules, ((NoAudienceMatch) obj).unmatchedRules);
        }

        @NotNull
        public final List<UnmatchedRule> getUnmatchedRules() {
            return this.unmatchedRules;
        }

        public int hashCode() {
            return this.unmatchedRules.hashCode();
        }

        @NotNull
        public String toString() {
            return "NoAudienceMatch(unmatchedRules=" + this.unmatchedRules + ")";
        }
    }

    public static final class Paywall extends InternalTriggerResult {

        @NotNull
        private final Experiment experiment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paywall(@NotNull Experiment experiment) {
            super(null);
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            this.experiment = experiment;
        }

        public static /* synthetic */ Paywall copy$default(Paywall paywall, Experiment experiment, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                experiment = paywall.experiment;
            }
            return paywall.copy(experiment);
        }

        @NotNull
        public final Experiment component1() {
            return this.experiment;
        }

        @NotNull
        public final Paywall copy(@NotNull Experiment experiment) {
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            return new Paywall(experiment);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Paywall) && Intrinsics.areEqual(this.experiment, ((Paywall) obj).experiment);
        }

        @NotNull
        public final Experiment getExperiment() {
            return this.experiment;
        }

        public int hashCode() {
            return this.experiment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Paywall(experiment=" + this.experiment + ")";
        }
    }

    public static final class PlacementNotFound extends InternalTriggerResult {

        @NotNull
        public static final PlacementNotFound INSTANCE = new PlacementNotFound();

        private PlacementNotFound() {
            super(null);
        }
    }

    public /* synthetic */ InternalTriggerResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final TriggerResult toPublicType() {
        if (this instanceof PlacementNotFound) {
            return TriggerResult.PlacementNotFound.INSTANCE;
        }
        if (this instanceof NoAudienceMatch) {
            return TriggerResult.NoAudienceMatch.INSTANCE;
        }
        if (this instanceof Paywall) {
            return new TriggerResult.Paywall(((Paywall) this).getExperiment());
        }
        if (this instanceof Holdout) {
            return new TriggerResult.Holdout(((Holdout) this).getExperiment());
        }
        if (this instanceof Error) {
            return new TriggerResult.Error(((Error) this).getError());
        }
        throw new k0();
    }

    private InternalTriggerResult() {
    }
}
