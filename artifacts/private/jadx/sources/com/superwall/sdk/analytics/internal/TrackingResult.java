package com.superwall.sdk.analytics.internal;

import com.superwall.sdk.models.events.EventData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class TrackingResult {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private EventData data;

    @NotNull
    private final TrackingParameters parameters;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrackingResult stub() {
            return new TrackingResult(EventData.Companion.stub(), TrackingParameters.Companion.stub());
        }

        private Companion() {
        }
    }

    public TrackingResult(@NotNull EventData data, @NotNull TrackingParameters parameters) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.data = data;
        this.parameters = parameters;
    }

    public static /* synthetic */ TrackingResult copy$default(TrackingResult trackingResult, EventData eventData, TrackingParameters trackingParameters, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eventData = trackingResult.data;
        }
        if ((i10 & 2) != 0) {
            trackingParameters = trackingResult.parameters;
        }
        return trackingResult.copy(eventData, trackingParameters);
    }

    @NotNull
    public final EventData component1() {
        return this.data;
    }

    @NotNull
    public final TrackingParameters component2() {
        return this.parameters;
    }

    @NotNull
    public final TrackingResult copy(@NotNull EventData data, @NotNull TrackingParameters parameters) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new TrackingResult(data, parameters);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingResult)) {
            return false;
        }
        TrackingResult trackingResult = (TrackingResult) obj;
        return Intrinsics.areEqual(this.data, trackingResult.data) && Intrinsics.areEqual(this.parameters, trackingResult.parameters);
    }

    @NotNull
    public final EventData getData() {
        return this.data;
    }

    @NotNull
    public final TrackingParameters getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.parameters.hashCode();
    }

    public final void setData(@NotNull EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "<set-?>");
        this.data = eventData;
    }

    @NotNull
    public String toString() {
        return "TrackingResult(data=" + this.data + ", parameters=" + this.parameters + ")";
    }
}
