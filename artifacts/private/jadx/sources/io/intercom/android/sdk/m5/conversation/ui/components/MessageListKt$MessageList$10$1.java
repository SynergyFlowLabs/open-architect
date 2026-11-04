package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.b5;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.w6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$10$1", f = "MessageList.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
final class MessageListKt$MessageList$10$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ n3<Boolean> $autoScrollEnabled$delegate;
    final /* synthetic */ n3<Boolean> $hasUserScrolled$delegate;
    final /* synthetic */ b5 $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageListKt$MessageList$10$1(b5 b5Var, n3<Boolean> n3Var, n3<Boolean> n3Var2, kotlin.coroutines.d<? super MessageListKt$MessageList$10$1> dVar) {
        super(2, dVar);
        this.$scrollState = b5Var;
        this.$autoScrollEnabled$delegate = n3Var;
        this.$hasUserScrolled$delegate = n3Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new MessageListKt$MessageList$10$1(this.$scrollState, this.$autoScrollEnabled$delegate, this.$hasUserScrolled$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            final b5 b5Var = this.$scrollState;
            kotlinx.coroutines.flow.i iVarY = w6.y(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.g2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(b5Var.B());
                }
            });
            final b5 b5Var2 = this.$scrollState;
            final n3<Boolean> n3Var = this.$autoScrollEnabled$delegate;
            final n3<Boolean> n3Var2 = this.$hasUserScrolled$delegate;
            kotlinx.coroutines.flow.j jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$10$1.2
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                    return emit(((Number) obj2).intValue(), (kotlin.coroutines.d<? super Unit>) dVar);
                }

                public final Object emit(int i11, kotlin.coroutines.d<? super Unit> dVar) {
                    MessageListKt.MessageList$lambda$18(n3Var, i11 == b5Var2.A());
                    if (MessageListKt.MessageList$lambda$20(n3Var2) && i11 == b5Var2.A()) {
                        MessageListKt.MessageList$lambda$21(n3Var2, false);
                    }
                    return Unit.f312394a;
                }
            };
            this.label = 1;
            if (iVarY.collect(jVar, this) == objL) {
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
        return ((MessageListKt$MessageList$10$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
