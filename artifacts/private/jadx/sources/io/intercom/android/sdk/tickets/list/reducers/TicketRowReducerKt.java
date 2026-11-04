package io.intercom.android.sdk.tickets.list.reducers;

import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailReducerKt;
import io.intercom.android.sdk.tickets.TicketStatus;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTicketRowReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketRowReducer.kt\nio/intercom/android/sdk/tickets/list/reducers/TicketRowReducerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
public final class TicketRowReducerKt {
    @NotNull
    public static final TicketRowData reduceTicketRowData(@NotNull Ticket ticket) {
        String str;
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        String publicId = ticket.getPublicId();
        if (publicId != null) {
            str = '#' + publicId;
        } else {
            str = null;
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{str, ticket.getCurrentStatus().getTitle()}), " • ", null, null, 0, null, null, 62, null);
        TicketStatus ticketStatus = TicketDetailReducerKt.toTicketStatus(ticket.getCurrentStatus());
        String id2 = ticket.getId();
        String title = ticket.getTitle();
        Boolean boolIsRead = ticket.isRead();
        return new TicketRowData(id2, title, strJoinToString$default, ticketStatus, boolIsRead != null ? boolIsRead.booleanValue() : true);
    }
}
