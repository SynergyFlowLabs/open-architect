package io.intercom.android.sdk.m5.home.data;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class TicketLink {
    public static final int $stable = 8;

    @c("display_order")
    private final int displayOrder;

    @c("icon_url")
    @NotNull
    private final String iconUrl;

    @c("ticket_type")
    @NotNull
    private final TicketType ticketType;

    @c(CreateTicketDestinationKt.TICKET_TYPE_ID)
    private final int ticketTypeId;

    @c("ticket_type_name")
    @NotNull
    private final String ticketTypeName;

    public TicketLink(int i10, @NotNull String ticketTypeName, @NotNull String iconUrl, int i11, @NotNull TicketType ticketType) {
        Intrinsics.checkNotNullParameter(ticketTypeName, "ticketTypeName");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        this.ticketTypeId = i10;
        this.ticketTypeName = ticketTypeName;
        this.iconUrl = iconUrl;
        this.displayOrder = i11;
        this.ticketType = ticketType;
    }

    public static /* synthetic */ TicketLink copy$default(TicketLink ticketLink, int i10, String str, String str2, int i11, TicketType ticketType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = ticketLink.ticketTypeId;
        }
        if ((i12 & 2) != 0) {
            str = ticketLink.ticketTypeName;
        }
        if ((i12 & 4) != 0) {
            str2 = ticketLink.iconUrl;
        }
        if ((i12 & 8) != 0) {
            i11 = ticketLink.displayOrder;
        }
        if ((i12 & 16) != 0) {
            ticketType = ticketLink.ticketType;
        }
        TicketType ticketType2 = ticketType;
        String str3 = str2;
        return ticketLink.copy(i10, str, str3, i11, ticketType2);
    }

    public final int component1() {
        return this.ticketTypeId;
    }

    @NotNull
    public final String component2() {
        return this.ticketTypeName;
    }

    @NotNull
    public final String component3() {
        return this.iconUrl;
    }

    public final int component4() {
        return this.displayOrder;
    }

    @NotNull
    public final TicketType component5() {
        return this.ticketType;
    }

    @NotNull
    public final TicketLink copy(int i10, @NotNull String ticketTypeName, @NotNull String iconUrl, int i11, @NotNull TicketType ticketType) {
        Intrinsics.checkNotNullParameter(ticketTypeName, "ticketTypeName");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        return new TicketLink(i10, ticketTypeName, iconUrl, i11, ticketType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketLink)) {
            return false;
        }
        TicketLink ticketLink = (TicketLink) obj;
        return this.ticketTypeId == ticketLink.ticketTypeId && Intrinsics.areEqual(this.ticketTypeName, ticketLink.ticketTypeName) && Intrinsics.areEqual(this.iconUrl, ticketLink.iconUrl) && this.displayOrder == ticketLink.displayOrder && Intrinsics.areEqual(this.ticketType, ticketLink.ticketType);
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final TicketType getTicketType() {
        return this.ticketType;
    }

    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    @NotNull
    public final String getTicketTypeName() {
        return this.ticketTypeName;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.ticketTypeId) * 31) + this.ticketTypeName.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + Integer.hashCode(this.displayOrder)) * 31) + this.ticketType.hashCode();
    }

    @NotNull
    public String toString() {
        return "TicketLink(ticketTypeId=" + this.ticketTypeId + ", ticketTypeName=" + this.ticketTypeName + ", iconUrl=" + this.iconUrl + ", displayOrder=" + this.displayOrder + ", ticketType=" + this.ticketType + ')';
    }
}
