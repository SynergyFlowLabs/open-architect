package io.intercom.android.sdk.m5.conversation.ui;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$36$4$1$5$1", f = "ConversationScreen.kt", i = {}, l = {862}, m = "invokeSuspend", n = {}, s = {})
final class ConversationScreenKt$ConversationScreenContent$36$4$1$5$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ androidx.compose.foundation.lazy.j1 $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreenContent$36$4$1$5$1(androidx.compose.foundation.lazy.j1 j1Var, kotlin.coroutines.d<? super ConversationScreenKt$ConversationScreenContent$36$4$1$5$1> dVar) {
        super(2, dVar);
        this.$lazyListState = j1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$36$4$1$5$1(this.$lazyListState, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            androidx.compose.foundation.lazy.j1 j1Var = this.$lazyListState;
            this.label = 1;
            if (androidx.compose.foundation.lazy.j1.x(j1Var, Integer.MAX_VALUE, 0, this, 2, null) == objL) {
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
        return ((ConversationScreenKt$ConversationScreenContent$36$4$1$5$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
