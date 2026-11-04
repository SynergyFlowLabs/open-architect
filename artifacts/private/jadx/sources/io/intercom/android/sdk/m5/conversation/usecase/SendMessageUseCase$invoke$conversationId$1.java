package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$conversationId$1", f = "SendMessageUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class SendMessageUseCase$invoke$conversationId$1 extends o implements Function2<ConversationClientState, kotlin.coroutines.d<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    SendMessageUseCase$invoke$conversationId$1(kotlin.coroutines.d<? super SendMessageUseCase$invoke$conversationId$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        SendMessageUseCase$invoke$conversationId$1 sendMessageUseCase$invoke$conversationId$1 = new SendMessageUseCase$invoke$conversationId$1(dVar);
        sendMessageUseCase$invoke$conversationId$1.L$0 = obj;
        return sendMessageUseCase$invoke$conversationId$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ConversationClientState conversationClientState, kotlin.coroutines.d<? super Boolean> dVar) {
        return ((SendMessageUseCase$invoke$conversationId$1) create(conversationClientState, dVar)).invokeSuspend(Unit.f312394a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        return kotlin.coroutines.jvm.internal.b.a(((ConversationClientState) this.L$0).getConversationId() != null);
    }
}
