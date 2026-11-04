package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1", f = "ConversationScreen.kt", i = {}, l = {477}, m = "invokeSuspend", n = {}, s = {})
final class ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ n7<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ n3<Boolean> $openBottomSheet;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1(n3<Boolean> n3Var, n7<KeyboardState> n7Var, kotlin.coroutines.d<? super ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1> dVar) {
        super(2, dVar);
        this.$openBottomSheet = n3Var;
        this.$keyboardAsState$delegate = n7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1(this.$openBottomSheet, this.$keyboardAsState$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        int i11 = 6 | 1;
        if (i10 == 0) {
            ResultKt.m(obj);
            if (ConversationScreenKt.ConversationScreenContent$lambda$79(this.$keyboardAsState$delegate).isVisible()) {
                this.label = 1;
                if (kotlinx.coroutines.d1.b(200L, this) == objL) {
                    return objL;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        this.$openBottomSheet.setValue(kotlin.coroutines.jvm.internal.b.a(true));
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
