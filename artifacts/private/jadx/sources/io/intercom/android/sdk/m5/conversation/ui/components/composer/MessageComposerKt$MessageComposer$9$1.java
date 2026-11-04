package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.n3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$9$1", f = "MessageComposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class MessageComposerKt$MessageComposer$9$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ n3<Boolean> $shouldRequestFocus$delegate;
    final /* synthetic */ androidx.compose.ui.focus.g0 $textInputFocus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageComposerKt$MessageComposer$9$1(androidx.compose.ui.focus.g0 g0Var, n3<Boolean> n3Var, kotlin.coroutines.d<? super MessageComposerKt$MessageComposer$9$1> dVar) {
        super(2, dVar);
        this.$textInputFocus = g0Var;
        this.$shouldRequestFocus$delegate = n3Var;
        int i10 = 0 << 2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new MessageComposerKt$MessageComposer$9$1(this.$textInputFocus, this.$shouldRequestFocus$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        if (MessageComposerKt.MessageComposer$lambda$13(this.$shouldRequestFocus$delegate)) {
            androidx.compose.ui.focus.g0.k(this.$textInputFocus, 0, 1, null);
            MessageComposerKt.MessageComposer$lambda$14(this.$shouldRequestFocus$delegate, false);
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((MessageComposerKt$MessageComposer$9$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
