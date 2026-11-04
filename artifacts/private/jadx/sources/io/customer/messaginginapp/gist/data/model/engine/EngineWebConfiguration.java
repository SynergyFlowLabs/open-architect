package io.customer.messaginginapp.gist.data.model.engine;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class EngineWebConfiguration {

    @NotNull
    private final String dataCenter;

    @NotNull
    private final String endpoint;

    @NotNull
    private final String instanceId;
    private final boolean livePreview;

    @NotNull
    private final String messageId;

    @Nullable
    private final Map<String, Object> properties;

    @NotNull
    private final String siteId;

    public EngineWebConfiguration(@NotNull String siteId, @NotNull String dataCenter, @NotNull String messageId, @NotNull String instanceId, @NotNull String endpoint, boolean z10, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(siteId, "siteId");
        Intrinsics.checkNotNullParameter(dataCenter, "dataCenter");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.siteId = siteId;
        this.dataCenter = dataCenter;
        this.messageId = messageId;
        this.instanceId = instanceId;
        this.endpoint = endpoint;
        this.livePreview = z10;
        this.properties = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EngineWebConfiguration copy$default(EngineWebConfiguration engineWebConfiguration, String str, String str2, String str3, String str4, String str5, boolean z10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = engineWebConfiguration.siteId;
        }
        if ((i10 & 2) != 0) {
            str2 = engineWebConfiguration.dataCenter;
        }
        if ((i10 & 4) != 0) {
            str3 = engineWebConfiguration.messageId;
        }
        if ((i10 & 8) != 0) {
            str4 = engineWebConfiguration.instanceId;
        }
        if ((i10 & 16) != 0) {
            str5 = engineWebConfiguration.endpoint;
        }
        if ((i10 & 32) != 0) {
            z10 = engineWebConfiguration.livePreview;
        }
        if ((i10 & 64) != 0) {
            map = engineWebConfiguration.properties;
        }
        boolean z11 = z10;
        Map map2 = map;
        String str6 = str5;
        String str7 = str3;
        return engineWebConfiguration.copy(str, str2, str7, str4, str6, z11, map2);
    }

    @NotNull
    public final String component1() {
        return this.siteId;
    }

    @NotNull
    public final String component2() {
        return this.dataCenter;
    }

    @NotNull
    public final String component3() {
        return this.messageId;
    }

    @NotNull
    public final String component4() {
        return this.instanceId;
    }

    @NotNull
    public final String component5() {
        return this.endpoint;
    }

    public final boolean component6() {
        return this.livePreview;
    }

    @Nullable
    public final Map<String, Object> component7() {
        return this.properties;
    }

    @NotNull
    public final EngineWebConfiguration copy(@NotNull String siteId, @NotNull String dataCenter, @NotNull String messageId, @NotNull String instanceId, @NotNull String endpoint, boolean z10, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(siteId, "siteId");
        Intrinsics.checkNotNullParameter(dataCenter, "dataCenter");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        return new EngineWebConfiguration(siteId, dataCenter, messageId, instanceId, endpoint, z10, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EngineWebConfiguration)) {
            return false;
        }
        EngineWebConfiguration engineWebConfiguration = (EngineWebConfiguration) obj;
        return Intrinsics.areEqual(this.siteId, engineWebConfiguration.siteId) && Intrinsics.areEqual(this.dataCenter, engineWebConfiguration.dataCenter) && Intrinsics.areEqual(this.messageId, engineWebConfiguration.messageId) && Intrinsics.areEqual(this.instanceId, engineWebConfiguration.instanceId) && Intrinsics.areEqual(this.endpoint, engineWebConfiguration.endpoint) && this.livePreview == engineWebConfiguration.livePreview && Intrinsics.areEqual(this.properties, engineWebConfiguration.properties);
    }

    @NotNull
    public final String getDataCenter() {
        return this.dataCenter;
    }

    @NotNull
    public final String getEndpoint() {
        return this.endpoint;
    }

    @NotNull
    public final String getInstanceId() {
        return this.instanceId;
    }

    public final boolean getLivePreview() {
        return this.livePreview;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    @NotNull
    public final String getSiteId() {
        return this.siteId;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.siteId.hashCode() * 31) + this.dataCenter.hashCode()) * 31) + this.messageId.hashCode()) * 31) + this.instanceId.hashCode()) * 31) + this.endpoint.hashCode()) * 31) + Boolean.hashCode(this.livePreview)) * 31;
        Map<String, Object> map = this.properties;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "EngineWebConfiguration(siteId=" + this.siteId + ", dataCenter=" + this.dataCenter + ", messageId=" + this.messageId + ", instanceId=" + this.instanceId + ", endpoint=" + this.endpoint + ", livePreview=" + this.livePreview + ", properties=" + this.properties + ")";
    }

    public /* synthetic */ EngineWebConfiguration(String str, String str2, String str3, String str4, String str5, boolean z10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? null : map);
    }
}
