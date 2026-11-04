package com.superwall.sdk.paywall.request;

import com.superwall.sdk.models.triggers.Experiment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ResponseIdentifiers {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private Experiment experiment;

    @Nullable
    private final String paywallId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ResponseIdentifiers getNone() {
            return new ResponseIdentifiers(null, null);
        }

        private Companion() {
        }
    }

    public ResponseIdentifiers(@Nullable String str, @Nullable Experiment experiment) {
        this.paywallId = str;
        this.experiment = experiment;
    }

    public static /* synthetic */ ResponseIdentifiers copy$default(ResponseIdentifiers responseIdentifiers, String str, Experiment experiment, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = responseIdentifiers.paywallId;
        }
        if ((i10 & 2) != 0) {
            experiment = responseIdentifiers.experiment;
        }
        return responseIdentifiers.copy(str, experiment);
    }

    @Nullable
    public final String component1() {
        return this.paywallId;
    }

    @Nullable
    public final Experiment component2() {
        return this.experiment;
    }

    @NotNull
    public final ResponseIdentifiers copy(@Nullable String str, @Nullable Experiment experiment) {
        return new ResponseIdentifiers(str, experiment);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseIdentifiers)) {
            return false;
        }
        ResponseIdentifiers responseIdentifiers = (ResponseIdentifiers) obj;
        return Intrinsics.areEqual(this.paywallId, responseIdentifiers.paywallId) && Intrinsics.areEqual(this.experiment, responseIdentifiers.experiment);
    }

    @Nullable
    public final Experiment getExperiment() {
        return this.experiment;
    }

    @Nullable
    public final String getPaywallId() {
        return this.paywallId;
    }

    public int hashCode() {
        String str = this.paywallId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Experiment experiment = this.experiment;
        return iHashCode + (experiment != null ? experiment.hashCode() : 0);
    }

    public final void setExperiment(@Nullable Experiment experiment) {
        this.experiment = experiment;
    }

    @NotNull
    public String toString() {
        return "ResponseIdentifiers(paywallId=" + this.paywallId + ", experiment=" + this.experiment + ")";
    }

    public /* synthetic */ ResponseIdentifiers(String str, Experiment experiment, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : experiment);
    }
}
