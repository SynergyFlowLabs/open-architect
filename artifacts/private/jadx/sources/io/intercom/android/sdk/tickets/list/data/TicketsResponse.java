package io.intercom.android.sdk.tickets.list.data;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class TicketsResponse {
    public static final int $stable = 8;

    @c("next_page")
    @Nullable
    private final Long nextPage;

    @c("tickets")
    @NotNull
    private final List<Ticket> tickets;

    public TicketsResponse(@NotNull List<Ticket> tickets, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(tickets, "tickets");
        this.tickets = tickets;
        this.nextPage = l10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketsResponse copy$default(TicketsResponse ticketsResponse, List list, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = ticketsResponse.tickets;
        }
        if ((i10 & 2) != 0) {
            l10 = ticketsResponse.nextPage;
        }
        return ticketsResponse.copy(list, l10);
    }

    @NotNull
    public final List<Ticket> component1() {
        return this.tickets;
    }

    @Nullable
    public final Long component2() {
        return this.nextPage;
    }

    @NotNull
    public final TicketsResponse copy(@NotNull List<Ticket> tickets, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(tickets, "tickets");
        return new TicketsResponse(tickets, l10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketsResponse)) {
            return false;
        }
        TicketsResponse ticketsResponse = (TicketsResponse) obj;
        return Intrinsics.areEqual(this.tickets, ticketsResponse.tickets) && Intrinsics.areEqual(this.nextPage, ticketsResponse.nextPage);
    }

    @Nullable
    public final Long getNextPage() {
        return this.nextPage;
    }

    @NotNull
    public final List<Ticket> getTickets() {
        return this.tickets;
    }

    public int hashCode() {
        int iHashCode = this.tickets.hashCode() * 31;
        Long l10 = this.nextPage;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    @NotNull
    public String toString() {
        return "TicketsResponse(tickets=" + this.tickets + ", nextPage=" + this.nextPage + ')';
    }
}
