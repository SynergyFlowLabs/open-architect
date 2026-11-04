package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.tickets.TicketStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class TicketRowData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f293820id;
    private final boolean isRead;

    @NotNull
    private final TicketStatus status;

    @NotNull
    private final String subTitle;

    @NotNull
    private final String title;

    public TicketRowData(@NotNull String id2, @NotNull String title, @NotNull String subTitle, @NotNull TicketStatus status, boolean z10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f293820id = id2;
        this.title = title;
        this.subTitle = subTitle;
        this.status = status;
        this.isRead = z10;
    }

    public static /* synthetic */ TicketRowData copy$default(TicketRowData ticketRowData, String str, String str2, String str3, TicketStatus ticketStatus, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ticketRowData.f293820id;
        }
        if ((i10 & 2) != 0) {
            str2 = ticketRowData.title;
        }
        if ((i10 & 4) != 0) {
            str3 = ticketRowData.subTitle;
        }
        if ((i10 & 8) != 0) {
            ticketStatus = ticketRowData.status;
        }
        if ((i10 & 16) != 0) {
            z10 = ticketRowData.isRead;
        }
        boolean z11 = z10;
        String str4 = str3;
        return ticketRowData.copy(str, str2, str4, ticketStatus, z11);
    }

    @NotNull
    public final String component1() {
        return this.f293820id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return this.subTitle;
    }

    @NotNull
    public final TicketStatus component4() {
        return this.status;
    }

    public final boolean component5() {
        return this.isRead;
    }

    @NotNull
    public final TicketRowData copy(@NotNull String id2, @NotNull String title, @NotNull String subTitle, @NotNull TicketStatus status, boolean z10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(status, "status");
        return new TicketRowData(id2, title, subTitle, status, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketRowData)) {
            return false;
        }
        TicketRowData ticketRowData = (TicketRowData) obj;
        return Intrinsics.areEqual(this.f293820id, ticketRowData.f293820id) && Intrinsics.areEqual(this.title, ticketRowData.title) && Intrinsics.areEqual(this.subTitle, ticketRowData.subTitle) && this.status == ticketRowData.status && this.isRead == ticketRowData.isRead;
    }

    @NotNull
    public final String getId() {
        return this.f293820id;
    }

    @NotNull
    public final TicketStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.f293820id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subTitle.hashCode()) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.isRead);
    }

    public final boolean isRead() {
        return this.isRead;
    }

    @NotNull
    public String toString() {
        return "TicketRowData(id=" + this.f293820id + ", title=" + this.title + ", subTitle=" + this.subTitle + ", status=" + this.status + ", isRead=" + this.isRead + ')';
    }
}
