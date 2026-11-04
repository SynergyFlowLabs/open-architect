package io.intercom.android.sdk.tickets;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.models.Ticket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface TicketLaunchedFrom {

    @w0(parameters = 0)
    public static final class Conversation implements TicketLaunchedFrom {
        public static final int $stable = 8;

        @NotNull
        private final String from;

        @NotNull
        private final Ticket ticket;

        /* JADX WARN: Multi-variable type inference failed */
        public Conversation() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Conversation copy$default(Conversation conversation, Ticket ticket, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ticket = conversation.ticket;
            }
            return conversation.copy(ticket);
        }

        @NotNull
        public final Ticket component1() {
            return this.ticket;
        }

        @NotNull
        public final Conversation copy(@NotNull Ticket ticket) {
            Intrinsics.checkNotNullParameter(ticket, "ticket");
            return new Conversation(ticket);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Conversation) && Intrinsics.areEqual(this.ticket, ((Conversation) obj).ticket);
        }

        @Override // io.intercom.android.sdk.tickets.TicketLaunchedFrom
        @NotNull
        public String getFrom() {
            return this.from;
        }

        @NotNull
        public final Ticket getTicket() {
            return this.ticket;
        }

        public int hashCode() {
            return this.ticket.hashCode();
        }

        @NotNull
        public String toString() {
            return "Conversation(ticket=" + this.ticket + ')';
        }

        public Conversation(@NotNull Ticket ticket) {
            Intrinsics.checkNotNullParameter(ticket, "ticket");
            this.ticket = ticket;
            this.from = "conversation";
        }

        public /* synthetic */ Conversation(Ticket ticket, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Injector.get().getDataLayer().getTicket().getValue() : ticket);
        }
    }

    public static final class DefaultImpls {
        public static /* synthetic */ void getFrom$annotations() {
        }
    }

    @w0(parameters = 1)
    public static final class Other implements TicketLaunchedFrom {
        public static final int $stable = 0;

        @NotNull
        private final String from;

        @NotNull
        private final String ticketId;

        public Other(@NotNull String ticketId, @NotNull String from) {
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            Intrinsics.checkNotNullParameter(from, "from");
            this.ticketId = ticketId;
            this.from = from;
        }

        public static /* synthetic */ Other copy$default(Other other, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = other.ticketId;
            }
            if ((i10 & 2) != 0) {
                str2 = other.from;
            }
            return other.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.ticketId;
        }

        @NotNull
        public final String component2() {
            return this.from;
        }

        @NotNull
        public final Other copy(@NotNull String ticketId, @NotNull String from) {
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            Intrinsics.checkNotNullParameter(from, "from");
            return new Other(ticketId, from);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Other)) {
                return false;
            }
            Other other = (Other) obj;
            return Intrinsics.areEqual(this.ticketId, other.ticketId) && Intrinsics.areEqual(this.from, other.from);
        }

        @Override // io.intercom.android.sdk.tickets.TicketLaunchedFrom
        @NotNull
        public String getFrom() {
            return this.from;
        }

        @NotNull
        public final String getTicketId() {
            return this.ticketId;
        }

        public int hashCode() {
            return (this.ticketId.hashCode() * 31) + this.from.hashCode();
        }

        @NotNull
        public String toString() {
            return "Other(ticketId=" + this.ticketId + ", from=" + this.from + ')';
        }
    }

    @NotNull
    String getFrom();
}
