package io.intercom.android.sdk.tickets.list.data;

import androidx.compose.runtime.internal.w0;
import androidx.paging.h2;
import androidx.paging.j2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class TicketsPagingSource extends h2<Long, Ticket> {
    public static final int PAGE_SIZE = 10;

    @NotNull
    private final TicketRepository repository;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.data.TicketsPagingSource$load$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.tickets.list.data.TicketsPagingSource", f = "TicketsPagingSource.kt", i = {0}, l = {14}, m = "load", n = {"params"}, s = {"L$0"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TicketsPagingSource.this.load(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TicketsPagingSource() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.h2
    @Nullable
    public Long getRefreshKey(@NotNull j2<Long, Ticket> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.paging.h2
    @Nullable
    public Object load(@NotNull h2.a<Long> aVar, @NotNull kotlin.coroutines.d<? super h2.b<Long, Ticket>> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objFetchTickets = anonymousClass1.result;
        Object objL = b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(objFetchTickets);
            TicketRepository ticketRepository = this.repository;
            Long lA = aVar.a();
            long jLongValue = lA != null ? lA.longValue() : 1L;
            anonymousClass1.L$0 = aVar;
            anonymousClass1.label = 1;
            objFetchTickets = ticketRepository.fetchTickets(jLongValue, 10, anonymousClass1);
            if (objFetchTickets == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (h2.a) anonymousClass1.L$0;
            ResultKt.m(objFetchTickets);
        }
        NetworkResponse networkResponse = (NetworkResponse) objFetchTickets;
        if (networkResponse instanceof NetworkResponse.Success) {
            NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
            List<Ticket> tickets = ((TicketsResponse) success.getBody()).getTickets();
            Long lA2 = aVar.a();
            return new h2.b.c(tickets, lA2 != null ? kotlin.coroutines.jvm.internal.b.g(lA2.longValue() - 1) : null, ((TicketsResponse) success.getBody()).getNextPage());
        }
        if (networkResponse instanceof NetworkResponse.NetworkError) {
            return new h2.b.a(((NetworkResponse.NetworkError) networkResponse).getError());
        }
        if (networkResponse instanceof NetworkResponse.ClientError) {
            return new h2.b.a(((NetworkResponse.ClientError) networkResponse).getError());
        }
        if (!(networkResponse instanceof NetworkResponse.ServerError)) {
            throw new k0();
        }
        return new h2.b.a(new Error("Server error : code " + ((NetworkResponse.ServerError) networkResponse).getCode()));
    }

    public /* synthetic */ TicketsPagingSource(TicketRepository ticketRepository, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            int i11 = 2 ^ 0;
            ticketRepository = new TicketRepository(null, null, null, null, null, 31, null);
        }
        this(ticketRepository);
    }

    public TicketsPagingSource(@NotNull TicketRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }
}
