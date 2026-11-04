package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
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
@SourceDebugExtension({"SMAP\nShowAdminIsTypingUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowAdminIsTypingUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/ShowAdminIsTypingUseCase\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,57:1\n226#2,5:58\n226#2,5:63\n*S KotlinDebug\n*F\n+ 1 ShowAdminIsTypingUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/ShowAdminIsTypingUseCase\n*L\n38#1:58,5\n50#1:63,5\n*E\n"})
public final class ShowAdminIsTypingUseCase {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase$sendAdminIndicator$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase", f = "ShowAdminIsTypingUseCase.kt", i = {0}, l = {49}, m = "sendAdminIndicator", n = {"clientStateFlow"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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
            int i10 = (((7 ^ 0) >> 0) >> 0) ^ 0;
            return ShowAdminIsTypingUseCase.this.sendAdminIndicator(null, null, false, false, this);
        }
    }

    public static /* synthetic */ Object invoke$default(ShowAdminIsTypingUseCase showAdminIsTypingUseCase, k0 k0Var, Avatar avatar, boolean z10, boolean z11, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return showAdminIsTypingUseCase.invoke(k0Var, avatar, z12, z11, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final Object sendAdminIndicator(k0<ConversationClientState> k0Var, Avatar avatar, boolean z10, boolean z11, kotlin.coroutines.d<? super Unit> dVar) {
        AnonymousClass1 anonymousClass1;
        ConversationClientState value;
        ConversationClientState value2;
        k0<ConversationClientState> k0Var2 = k0Var;
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
            if (k0Var2.getValue().getCurrentlyTypingState().getUserType() != TypingIndicatorType.NONE) {
                return Unit.f312394a;
            }
            do {
                value = k0Var2.getValue();
            } while (!k0Var2.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, new CurrentlyTypingState(new AvatarWrapper(avatar, z10), z11, null, TypingIndicatorType.ADMIN, 4, null), null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194295, null)));
            anonymousClass1.L$0 = k0Var2;
            anonymousClass1.label = 1;
            if (d1.b(5000L, anonymousClass1) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var2 = (k0) anonymousClass1.L$0;
            ResultKt.m(obj);
        }
        k0<ConversationClientState> k0Var3 = k0Var2;
        do {
            value2 = k0Var3.getValue();
        } while (!k0Var3.compareAndSet(value2, ConversationClientState.copy$default(value2, null, null, null, new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194295, null)));
        return Unit.f312394a;
    }

    @Nullable
    public final Object invoke(@NotNull k0<ConversationClientState> k0Var, @NotNull Avatar avatar, boolean z10, boolean z11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objSendAdminIndicator = sendAdminIndicator(k0Var, avatar, z10, z11 && !z10, dVar);
        return objSendAdminIndicator == kotlin.coroutines.intrinsics.b.l() ? objSendAdminIndicator : Unit.f312394a;
    }
}
