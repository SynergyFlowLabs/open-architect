package com.superwall.sdk.analytics.internal.trackable;

import java.util.HashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class UserInitiatedEvent implements TrackableUserInitiatedEvent {

    @NotNull
    private Map<String, ? extends Object> audienceFilterParams;
    private final boolean canImplicitlyTriggerPaywall;
    private final boolean isFeatureGatable;

    @NotNull
    private final String rawName;

    public /* synthetic */ UserInitiatedEvent(String str, boolean z10, Map map, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, map, z11);
    }

    @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
    @NotNull
    public Map<String, Object> getAudienceFilterParams() {
        return this.audienceFilterParams;
    }

    @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
    public boolean getCanImplicitlyTriggerPaywall() {
        return this.canImplicitlyTriggerPaywall;
    }

    @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
    @NotNull
    public String getRawName() {
        return this.rawName;
    }

    public final boolean isFeatureGatable() {
        return this.isFeatureGatable;
    }

    public void setAudienceFilterParams(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.audienceFilterParams = map;
    }

    public static final class Track extends UserInitiatedEvent {
        public /* synthetic */ Track(String str, boolean z10, boolean z11, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z10, z11, (i10 & 8) != 0 ? MapsKt.emptyMap() : map);
        }

        @Override // com.superwall.sdk.analytics.internal.trackable.Trackable
        @Nullable
        public Object getSuperwallParameters(@NotNull d<? super HashMap<String, Object>> dVar) {
            return MapsKt.hashMapOf(TuplesKt.to("is_feature_gatable", b.a(isFeatureGatable())));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Track(@NotNull String rawName, boolean z10, boolean z11, @NotNull Map<String, ? extends Object> customParameters) {
            super(rawName, z10, customParameters, z11, null);
            Intrinsics.checkNotNullParameter(rawName, "rawName");
            Intrinsics.checkNotNullParameter(customParameters, "customParameters");
        }
    }

    private UserInitiatedEvent(String str, boolean z10, Map<String, ? extends Object> map, boolean z11) {
        this.rawName = str;
        this.canImplicitlyTriggerPaywall = z10;
        this.audienceFilterParams = map;
        this.isFeatureGatable = z11;
    }

    public /* synthetic */ UserInitiatedEvent(String str, boolean z10, Map map, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, (i10 & 4) != 0 ? MapsKt.emptyMap() : map, z11, null);
    }
}
