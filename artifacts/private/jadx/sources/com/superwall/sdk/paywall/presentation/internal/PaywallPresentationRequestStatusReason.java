package com.superwall.sdk.paywall.presentation.internal;

import com.superwall.sdk.models.triggers.Experiment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PaywallPresentationRequestStatusReason extends Throwable {

    @NotNull
    private final String description;

    public static final class DebuggerPresented extends PaywallPresentationRequestStatusReason {
        public DebuggerPresented() {
            super("debugger_presented", null);
        }
    }

    public static final class Holdout extends PaywallPresentationRequestStatusReason {

        @NotNull
        private final Experiment experiment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holdout(@NotNull Experiment experiment) {
            super("holdout", null);
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

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return "Holdout(experiment=" + this.experiment + ")";
        }
    }

    public static final class NoAudienceMatch extends PaywallPresentationRequestStatusReason {
        public NoAudienceMatch() {
            super("no_rule_match", null);
        }
    }

    public static final class NoConfig extends PaywallPresentationRequestStatusReason {
        public NoConfig() {
            super("no_config", null);
        }
    }

    public static final class NoPaywallView extends PaywallPresentationRequestStatusReason {
        public NoPaywallView() {
            super("no_paywall_view_controller", null);
        }
    }

    public static final class NoPresenter extends PaywallPresentationRequestStatusReason {
        public NoPresenter() {
            super("no_presenter", null);
        }
    }

    public static final class PaywallAlreadyPresented extends PaywallPresentationRequestStatusReason {
        public PaywallAlreadyPresented() {
            super("paywall_already_presented", null);
        }
    }

    public static final class PlacementNotFound extends PaywallPresentationRequestStatusReason {
        public PlacementNotFound() {
            super("event_not_found", null);
        }
    }

    public static final class SubscriptionStatusTimeout extends PaywallPresentationRequestStatusReason {
        public SubscriptionStatusTimeout() {
            super("subscription_status_timeout", null);
        }
    }

    public /* synthetic */ PaywallPresentationRequestStatusReason(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    private PaywallPresentationRequestStatusReason(String str) {
        this.description = str;
    }
}
