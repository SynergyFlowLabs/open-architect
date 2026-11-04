package io.intercom.android.sdk.m5.inbox;

import com.devtodev.core.data.metrics.MetricConsts;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$inboxPagingData$1$1", f = "InboxViewModel.kt", i = {0}, l = {55}, m = "invokeSuspend", n = {MetricConsts.Install}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nInboxViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboxViewModel.kt\nio/intercom/android/sdk/m5/inbox/InboxViewModel$inboxPagingData$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
final class InboxViewModel$inboxPagingData$1$1 extends o implements Function2<EmptyState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InboxViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InboxViewModel$inboxPagingData$1$1(InboxViewModel inboxViewModel, d<? super InboxViewModel$inboxPagingData$1$1> dVar) {
        super(2, dVar);
        this.this$0 = inboxViewModel;
        int i10 = 7 << 2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        InboxViewModel$inboxPagingData$1$1 inboxViewModel$inboxPagingData$1$1 = new InboxViewModel$inboxPagingData$1$1(this.this$0, dVar);
        inboxViewModel$inboxPagingData$1$1.L$0 = obj;
        return inboxViewModel$inboxPagingData$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EmptyState emptyState, d<? super Unit> dVar) {
        return ((InboxViewModel$inboxPagingData$1$1) create(emptyState, dVar)).invokeSuspend(Unit.f312394a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        EmptyState emptyStateCopy$default;
        InboxViewModel inboxViewModel;
        EmptyState emptyState;
        InboxViewModel inboxViewModel2;
        OpenMessengerResponse.NewConversationData newConversationData;
        OpenMessengerResponse.NewConversationData.Cta cta;
        Object objL = b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            emptyStateCopy$default = (EmptyState) this.L$0;
            inboxViewModel = this.this$0;
            if (!Intrinsics.areEqual(emptyStateCopy$default, EmptyState.Companion.getNULL())) {
                CommonRepository commonRepository = this.this$0.commonRepository;
                this.L$0 = emptyStateCopy$default;
                this.L$1 = inboxViewModel;
                this.label = 1;
                Object objOpenMessenger = commonRepository.openMessenger(this);
                if (objOpenMessenger == objL) {
                    return objL;
                }
                emptyState = emptyStateCopy$default;
                inboxViewModel2 = inboxViewModel;
                obj = objOpenMessenger;
            }
            inboxViewModel.emptyState = emptyStateCopy$default;
            return Unit.f312394a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        inboxViewModel2 = (InboxViewModel) this.L$1;
        EmptyState emptyState2 = (EmptyState) this.L$0;
        ResultKt.m(obj);
        emptyState = emptyState2;
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) obj;
        String text = (openMessengerResponse == null || (newConversationData = openMessengerResponse.getNewConversationData()) == null || (cta = newConversationData.getCta()) == null) ? null : cta.getText();
        if (text == null || (emptyStateCopy$default = EmptyState.copy$default(emptyState, null, null, EmptyState.Action.copy$default(emptyState.getAction(), null, text, null, 5, null), 3, null)) == null) {
            inboxViewModel = inboxViewModel2;
            emptyStateCopy$default = emptyState;
        } else {
            inboxViewModel = inboxViewModel2;
        }
        inboxViewModel.emptyState = emptyStateCopy$default;
        return Unit.f312394a;
    }
}
