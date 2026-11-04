package com.superwall.sdk.analytics.superwall;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class SuperwallEventInfo {

    @NotNull
    private final SuperwallEvent event;

    @NotNull
    private final Map<String, Object> params;

    public SuperwallEventInfo(@NotNull SuperwallEvent event, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        this.event = event;
        this.params = params;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuperwallEventInfo copy$default(SuperwallEventInfo superwallEventInfo, SuperwallEvent superwallEvent, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            superwallEvent = superwallEventInfo.event;
        }
        if ((i10 & 2) != 0) {
            map = superwallEventInfo.params;
        }
        return superwallEventInfo.copy(superwallEvent, map);
    }

    @l(message = "Use event instead")
    public static /* synthetic */ void getPlacement$annotations() {
    }

    @NotNull
    public final SuperwallEvent component1() {
        return this.event;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.params;
    }

    @NotNull
    public final SuperwallEventInfo copy(@NotNull SuperwallEvent event, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        return new SuperwallEventInfo(event, params);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperwallEventInfo)) {
            return false;
        }
        SuperwallEventInfo superwallEventInfo = (SuperwallEventInfo) obj;
        return Intrinsics.areEqual(this.event, superwallEventInfo.event) && Intrinsics.areEqual(this.params, superwallEventInfo.params);
    }

    @NotNull
    public final SuperwallEvent getEvent() {
        return this.event;
    }

    @NotNull
    public final Map<String, Object> getParams() {
        return this.params;
    }

    @NotNull
    public final SuperwallEvent getPlacement() {
        return this.event;
    }

    public int hashCode() {
        return (this.event.hashCode() * 31) + this.params.hashCode();
    }

    @NotNull
    public String toString() {
        return "SuperwallEventInfo(event=" + this.event + ", params=" + this.params + ")";
    }
}
