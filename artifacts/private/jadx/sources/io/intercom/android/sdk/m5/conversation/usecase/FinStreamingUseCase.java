package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Conversation;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nFinStreamingUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinStreamingUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/FinStreamingUseCase\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,38:1\n226#2,5:39\n*S KotlinDebug\n*F\n+ 1 FinStreamingUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/FinStreamingUseCase\n*L\n22#1:39,5\n*E\n"})
public final class FinStreamingUseCase {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase$invoke$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase", f = "FinStreamingUseCase.kt", i = {0, 0}, l = {17}, m = "invoke", n = {"clientStateFlow", "data"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
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
            return FinStreamingUseCase.this.invoke(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object invoke(@NotNull k0<ConversationClientState> k0Var, @NotNull ParsedNexusEvent.ConversationNexusEvent.FinStreaming finStreaming, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        AnonymousClass1 anonymousClass1;
        k0<ConversationClientState> k0Var2;
        ParsedNexusEvent.ConversationNexusEvent.FinStreaming finStreaming2;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        Conversation conversation;
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
        Object obj = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            k0Var2 = k0Var;
            anonymousClass1.L$0 = k0Var2;
            anonymousClass1.L$1 = finStreaming;
            anonymousClass1.label = 1;
            if (d1.b(100L, anonymousClass1) == objL) {
                return objL;
            }
            finStreaming2 = finStreaming;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            finStreaming2 = (ParsedNexusEvent.ConversationNexusEvent.FinStreaming) anonymousClass1.L$1;
            k0<ConversationClientState> k0Var3 = (k0) anonymousClass1.L$0;
            ResultKt.m(obj);
            k0Var2 = k0Var3;
        }
        if (finStreaming2.getTokenSequenceIndex() < k0Var2.getValue().getFinStreamingData().getTokenSequenceIndex()) {
            return Unit.f312394a;
        }
        do {
            value = k0Var2.getValue();
            conversationClientState = value;
            conversation = conversationClientState.getConversation();
        } while (!k0Var2.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, null, conversation != null ? Conversation.copy$default(conversation, null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 983039, null) : null, null, new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), null, null, null, null, null, null, null, null, conversationClientState.getFinStreamingData().copy(true, finStreaming2.getBlocks(), finStreaming2.getClientAssignedUUID(), finStreaming2.getTokenSequenceIndex()), null, 0, 0, null, null, false, false, null, null, 4190197, null)));
        return Unit.f312394a;
    }
}
