package io.intercom.android.sdk.tickets;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$fetchTicketDetail$1", f = "TicketDetailViewModel.kt", i = {}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "invokeSuspend", n = {}, s = {})
final class TicketDetailViewModel$fetchTicketDetail$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ String $ticketId;
    Object L$0;
    int label;
    final /* synthetic */ TicketDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TicketDetailViewModel$fetchTicketDetail$1(TicketDetailViewModel ticketDetailViewModel, String str, kotlin.coroutines.d<? super TicketDetailViewModel$fetchTicketDetail$1> dVar) {
        super(2, dVar);
        this.this$0 = ticketDetailViewModel;
        this.$ticketId = str;
        int i10 = 3 ^ 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(TicketDetailViewModel ticketDetailViewModel, String str) {
        ticketDetailViewModel.fetchTicketDetail$intercom_sdk_base_release(str);
        return Unit.f312394a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new TicketDetailViewModel$fetchTicketDetail$1(this.this$0, this.$ticketId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.flow.k0 k0Var;
        Object error;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            kotlinx.coroutines.flow.k0 k0Var2 = this.this$0._stateFlow;
            TicketRepository ticketRepository = this.this$0.repository;
            String str = this.$ticketId;
            this.L$0 = k0Var2;
            this.label = 1;
            Object objFetchTicketDetail = ticketRepository.fetchTicketDetail(str, this);
            if (objFetchTicketDetail == objL) {
                return objL;
            }
            k0Var = k0Var2;
            obj = objFetchTicketDetail;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = (kotlinx.coroutines.flow.k0) this.L$0;
            ResultKt.m(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            error = new TicketDetailState.Error(new ErrorState.WithoutCTA(0, 0, kotlin.coroutines.jvm.internal.b.f(R.string.intercom_error_loading_ticket), 3, null));
        } else if (networkResponse instanceof NetworkResponse.NetworkError) {
            Integer numF = kotlin.coroutines.jvm.internal.b.f(R.string.intercom_error_loading_ticket);
            final TicketDetailViewModel ticketDetailViewModel = this.this$0;
            final String str2 = this.$ticketId;
            error = new TicketDetailState.Error(new ErrorState.WithCTA(0, 0, numF, 0, new Function0() { // from class: io.intercom.android.sdk.tickets.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TicketDetailViewModel$fetchTicketDetail$1.invokeSuspend$lambda$0(ticketDetailViewModel, str2);
                }
            }, 11, null));
        } else {
            if (!(networkResponse instanceof NetworkResponse.Success)) {
                throw new kotlin.k0();
            }
            Ticket ticket = (Ticket) ((NetworkResponse.Success) networkResponse).getBody();
            this.this$0.fireMetricIfNecessary(ticket);
            this.this$0.markAsReadIfNecessary(ticket);
            this.this$0.ticketId = ticket.getId();
            error = TicketDetailReducerKt.computeTicketViewState(ticket, this.this$0.user, this.this$0.getActiveAdminsAvatars(), this.this$0.launchedFrom);
        }
        k0Var.setValue(error);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((TicketDetailViewModel$fetchTicketDetail$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
