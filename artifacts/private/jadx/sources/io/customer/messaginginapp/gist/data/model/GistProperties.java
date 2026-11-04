package io.customer.messaginginapp.gist.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class GistProperties {

    @Nullable
    private final String campaignId;

    @Nullable
    private final String elementId;

    @Nullable
    private final String overlayColor;
    private final boolean persistent;

    @NotNull
    private final MessagePosition position;

    @Nullable
    private final String routeRule;

    public GistProperties(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull MessagePosition position, boolean z10, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.routeRule = str;
        this.elementId = str2;
        this.campaignId = str3;
        this.position = position;
        this.persistent = z10;
        this.overlayColor = str4;
    }

    public static /* synthetic */ GistProperties copy$default(GistProperties gistProperties, String str, String str2, String str3, MessagePosition messagePosition, boolean z10, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gistProperties.routeRule;
        }
        if ((i10 & 2) != 0) {
            str2 = gistProperties.elementId;
        }
        if ((i10 & 4) != 0) {
            str3 = gistProperties.campaignId;
        }
        if ((i10 & 8) != 0) {
            messagePosition = gistProperties.position;
        }
        if ((i10 & 16) != 0) {
            z10 = gistProperties.persistent;
        }
        if ((i10 & 32) != 0) {
            str4 = gistProperties.overlayColor;
        }
        boolean z11 = z10;
        String str5 = str4;
        return gistProperties.copy(str, str2, str3, messagePosition, z11, str5);
    }

    @Nullable
    public final String component1() {
        return this.routeRule;
    }

    @Nullable
    public final String component2() {
        return this.elementId;
    }

    @Nullable
    public final String component3() {
        return this.campaignId;
    }

    @NotNull
    public final MessagePosition component4() {
        return this.position;
    }

    public final boolean component5() {
        return this.persistent;
    }

    @Nullable
    public final String component6() {
        return this.overlayColor;
    }

    @NotNull
    public final GistProperties copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull MessagePosition position, boolean z10, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(position, "position");
        return new GistProperties(str, str2, str3, position, z10, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GistProperties)) {
            return false;
        }
        GistProperties gistProperties = (GistProperties) obj;
        return Intrinsics.areEqual(this.routeRule, gistProperties.routeRule) && Intrinsics.areEqual(this.elementId, gistProperties.elementId) && Intrinsics.areEqual(this.campaignId, gistProperties.campaignId) && this.position == gistProperties.position && this.persistent == gistProperties.persistent && Intrinsics.areEqual(this.overlayColor, gistProperties.overlayColor);
    }

    @Nullable
    public final String getCampaignId() {
        return this.campaignId;
    }

    @Nullable
    public final String getElementId() {
        return this.elementId;
    }

    @Nullable
    public final String getOverlayColor() {
        return this.overlayColor;
    }

    public final boolean getPersistent() {
        return this.persistent;
    }

    @NotNull
    public final MessagePosition getPosition() {
        return this.position;
    }

    @Nullable
    public final String getRouteRule() {
        return this.routeRule;
    }

    public int hashCode() {
        String str = this.routeRule;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.elementId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campaignId;
        int iHashCode3 = (((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.position.hashCode()) * 31) + Boolean.hashCode(this.persistent)) * 31;
        String str4 = this.overlayColor;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GistProperties(routeRule=" + this.routeRule + ", elementId=" + this.elementId + ", campaignId=" + this.campaignId + ", position=" + this.position + ", persistent=" + this.persistent + ", overlayColor=" + this.overlayColor + ")";
    }
}
