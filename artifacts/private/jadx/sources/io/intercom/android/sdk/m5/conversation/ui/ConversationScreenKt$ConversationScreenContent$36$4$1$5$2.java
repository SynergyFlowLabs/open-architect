package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.b5;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$36$4$1$5$2", f = "ConversationScreen.kt", i = {}, l = {866}, m = "invokeSuspend", n = {}, s = {})
final class ConversationScreenKt$ConversationScreenContent$36$4$1$5$2 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ b5 $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreenContent$36$4$1$5$2(b5 b5Var, kotlin.coroutines.d<? super ConversationScreenKt$ConversationScreenContent$36$4$1$5$2> dVar) {
        super(2, dVar);
        this.$scrollState = b5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$36$4$1$5$2(this.$scrollState, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            b5 b5Var = this.$scrollState;
            int iA = b5Var.A();
            this.label = 1;
            if (b5Var.D(iA, this) == objL) {
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
        return ((ConversationScreenKt$ConversationScreenContent$36$4$1$5$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
