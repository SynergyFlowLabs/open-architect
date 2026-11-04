package io.customer.messaginginapp.gist.presentation.engine;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class EngineWebEvent {

    @NotNull
    private final String instanceId;

    @NotNull
    private final String method;

    @Nullable
    private final Map<String, Object> parameters;

    public EngineWebEvent(@NotNull String instanceId, @NotNull String method, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(method, "method");
        this.instanceId = instanceId;
        this.method = method;
        this.parameters = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EngineWebEvent copy$default(EngineWebEvent engineWebEvent, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = engineWebEvent.instanceId;
        }
        if ((i10 & 2) != 0) {
            str2 = engineWebEvent.method;
        }
        if ((i10 & 4) != 0) {
            map = engineWebEvent.parameters;
        }
        return engineWebEvent.copy(str, str2, map);
    }

    @NotNull
    public final String component1() {
        return this.instanceId;
    }

    @NotNull
    public final String component2() {
        return this.method;
    }

    @Nullable
    public final Map<String, Object> component3() {
        return this.parameters;
    }

    @NotNull
    public final EngineWebEvent copy(@NotNull String instanceId, @NotNull String method, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(method, "method");
        return new EngineWebEvent(instanceId, method, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EngineWebEvent)) {
            return false;
        }
        EngineWebEvent engineWebEvent = (EngineWebEvent) obj;
        return Intrinsics.areEqual(this.instanceId, engineWebEvent.instanceId) && Intrinsics.areEqual(this.method, engineWebEvent.method) && Intrinsics.areEqual(this.parameters, engineWebEvent.parameters);
    }

    @NotNull
    public final String getInstanceId() {
        return this.instanceId;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        int iHashCode = ((this.instanceId.hashCode() * 31) + this.method.hashCode()) * 31;
        Map<String, Object> map = this.parameters;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "EngineWebEvent(instanceId=" + this.instanceId + ", method=" + this.method + ", parameters=" + this.parameters + ")";
    }

    public /* synthetic */ EngineWebEvent(String str, String str2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : map);
    }
}
