package com.superwall.sdk.analytics.internal;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class TrackingParameters {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Map<String, Object> audienceFilterParams;

    @NotNull
    private final Map<String, Object> delegateParams;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrackingParameters stub() {
            return new TrackingParameters(MapsKt.emptyMap(), MapsKt.emptyMap());
        }

        private Companion() {
        }
    }

    public TrackingParameters(@NotNull Map<String, ? extends Object> delegateParams, @NotNull Map<String, ? extends Object> audienceFilterParams) {
        Intrinsics.checkNotNullParameter(delegateParams, "delegateParams");
        Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
        this.delegateParams = delegateParams;
        this.audienceFilterParams = audienceFilterParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackingParameters copy$default(TrackingParameters trackingParameters, Map map, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = trackingParameters.delegateParams;
        }
        if ((i10 & 2) != 0) {
            map2 = trackingParameters.audienceFilterParams;
        }
        return trackingParameters.copy(map, map2);
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.delegateParams;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.audienceFilterParams;
    }

    @NotNull
    public final TrackingParameters copy(@NotNull Map<String, ? extends Object> delegateParams, @NotNull Map<String, ? extends Object> audienceFilterParams) {
        Intrinsics.checkNotNullParameter(delegateParams, "delegateParams");
        Intrinsics.checkNotNullParameter(audienceFilterParams, "audienceFilterParams");
        return new TrackingParameters(delegateParams, audienceFilterParams);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingParameters)) {
            return false;
        }
        TrackingParameters trackingParameters = (TrackingParameters) obj;
        return Intrinsics.areEqual(this.delegateParams, trackingParameters.delegateParams) && Intrinsics.areEqual(this.audienceFilterParams, trackingParameters.audienceFilterParams);
    }

    @NotNull
    public final Map<String, Object> getAudienceFilterParams() {
        return this.audienceFilterParams;
    }

    @NotNull
    public final Map<String, Object> getDelegateParams() {
        return this.delegateParams;
    }

    public int hashCode() {
        return (this.delegateParams.hashCode() * 31) + this.audienceFilterParams.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrackingParameters(delegateParams=" + this.delegateParams + ", audienceFilterParams=" + this.audienceFilterParams + ")";
    }
}
