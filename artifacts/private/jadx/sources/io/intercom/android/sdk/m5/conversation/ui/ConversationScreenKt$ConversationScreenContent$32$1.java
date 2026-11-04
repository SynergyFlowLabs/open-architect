package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.b5;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$32$1", f = "ConversationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class ConversationScreenKt$ConversationScreenContent$32$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ boolean $isLandscape;
    final /* synthetic */ boolean $isLargeFont;
    final /* synthetic */ float $jumToBottomScrollOffset;
    final /* synthetic */ Function1<ConversationScrolledState, Unit> $onConversationScrolled;
    final /* synthetic */ b5 $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConversationScreenKt$ConversationScreenContent$32$1(b5 b5Var, float f10, Function1<? super ConversationScrolledState, Unit> function1, boolean z10, boolean z11, kotlin.coroutines.d<? super ConversationScreenKt$ConversationScreenContent$32$1> dVar) {
        super(2, dVar);
        this.$scrollState = b5Var;
        this.$jumToBottomScrollOffset = f10;
        this.$onConversationScrolled = function1;
        this.$isLandscape = z10;
        this.$isLargeFont = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$32$1(this.$scrollState, this.$jumToBottomScrollOffset, this.$onConversationScrolled, this.$isLandscape, this.$isLargeFont, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        if (this.$scrollState.A() - this.$scrollState.B() > this.$jumToBottomScrollOffset) {
            this.$onConversationScrolled.invoke(new ConversationScrolledState(true, this.$scrollState.A(), this.$isLandscape, this.$isLargeFont, 0));
        } else {
            this.$onConversationScrolled.invoke(new ConversationScrolledState(false, this.$scrollState.A(), this.$isLandscape, this.$isLargeFont, 0));
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((ConversationScreenKt$ConversationScreenContent$32$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
