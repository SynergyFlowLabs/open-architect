package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.b5;
import androidx.compose.foundation.gestures.v3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$36$2$1$1", f = "ConversationScreen.kt", i = {}, l = {679}, m = "invokeSuspend", n = {}, s = {})
final class ConversationScreenKt$ConversationScreenContent$36$2$1$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ String $message;
    final /* synthetic */ Function1<String, Unit> $onSendMessage;
    final /* synthetic */ b5 $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConversationScreenKt$ConversationScreenContent$36$2$1$1(b5 b5Var, Function1<? super String, Unit> function1, String str, kotlin.coroutines.d<? super ConversationScreenKt$ConversationScreenContent$36$2$1$1> dVar) {
        super(2, dVar);
        this.$scrollState = b5Var;
        this.$onSendMessage = function1;
        this.$message = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$36$2$1$1(this.$scrollState, this.$onSendMessage, this.$message, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            b5 b5Var = this.$scrollState;
            this.label = 1;
            if (v3.e(b5Var, Float.MAX_VALUE, this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        this.$onSendMessage.invoke(this.$message);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((ConversationScreenKt$ConversationScreenContent$36$2$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
