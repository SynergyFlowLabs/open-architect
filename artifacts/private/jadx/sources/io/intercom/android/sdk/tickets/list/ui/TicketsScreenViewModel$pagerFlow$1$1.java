package io.intercom.android.sdk.tickets.list.ui;

import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
/* synthetic */ class TicketsScreenViewModel$pagerFlow$1$1 extends kotlin.jvm.internal.a implements Function2<Ticket, kotlin.coroutines.d<? super TicketRowData>, Object>, kotlin.coroutines.jvm.internal.n {
    public static final TicketsScreenViewModel$pagerFlow$1$1 INSTANCE = new TicketsScreenViewModel$pagerFlow$1$1();

    TicketsScreenViewModel$pagerFlow$1$1() {
        super(2, TicketRowReducerKt.class, "reduceTicketRowData", "reduceTicketRowData(Lio/intercom/android/sdk/models/Ticket;)Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", 5);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ticket ticket, kotlin.coroutines.d<? super TicketRowData> dVar) {
        return TicketsScreenViewModel.pagerFlow$lambda$1$reduceTicketRowData(ticket, dVar);
    }
}
