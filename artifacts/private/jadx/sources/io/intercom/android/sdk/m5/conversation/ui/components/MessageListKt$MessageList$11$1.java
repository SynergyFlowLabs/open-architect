package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.b5;
import androidx.compose.runtime.n3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$11$1", f = "MessageList.kt", i = {}, l = {androidx.media2.widget.f.i.f59777h0}, m = "invokeSuspend", n = {}, s = {})
final class MessageListKt$MessageList$11$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ n3<Boolean> $hasUserScrolled$delegate;
    final /* synthetic */ b5 $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageListKt$MessageList$11$1(b5 b5Var, n3<Boolean> n3Var, kotlin.coroutines.d<? super MessageListKt$MessageList$11$1> dVar) {
        super(2, dVar);
        this.$scrollState = b5Var;
        this.$hasUserScrolled$delegate = n3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new MessageListKt$MessageList$11$1(this.$scrollState, this.$hasUserScrolled$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = this.$scrollState.y().c();
            final b5 b5Var = this.$scrollState;
            final n3<Boolean> n3Var = this.$hasUserScrolled$delegate;
            kotlinx.coroutines.flow.j<? super androidx.compose.foundation.interaction.g> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$11$1.1
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                    return emit((androidx.compose.foundation.interaction.g) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                }

                public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                    if (gVar instanceof androidx.compose.foundation.interaction.a.b) {
                        MessageListKt.MessageList$lambda$21(n3Var, true);
                    } else if ((gVar instanceof androidx.compose.foundation.interaction.a.c) && MessageListKt.isAtBottom(b5Var)) {
                        MessageListKt.MessageList$lambda$21(n3Var, false);
                    }
                    return Unit.f312394a;
                }
            };
            this.label = 1;
            if (iVarC.collect(jVar, this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((MessageListKt$MessageList$11$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
