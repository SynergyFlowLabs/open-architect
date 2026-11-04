package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.gestures.v3;
import androidx.compose.runtime.k3;
import androidx.compose.runtime.n7;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$10$1", f = "LazyMessageList.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
final class LazyMessageListKt$LazyMessageList$10$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ float $intercomBadgeOffset;
    final /* synthetic */ n7<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ k3 $keyboardScrollOffset$delegate;
    final /* synthetic */ androidx.compose.foundation.lazy.j1 $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyMessageListKt$LazyMessageList$10$1(float f10, androidx.compose.foundation.lazy.j1 j1Var, n7<KeyboardState> n7Var, k3 k3Var, kotlin.coroutines.d<? super LazyMessageListKt$LazyMessageList$10$1> dVar) {
        super(2, dVar);
        this.$intercomBadgeOffset = f10;
        this.$lazyListState = j1Var;
        this.$keyboardAsState$delegate = n7Var;
        this.$keyboardScrollOffset$delegate = k3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new LazyMessageListKt$LazyMessageList$10$1(this.$intercomBadgeOffset, this.$lazyListState, this.$keyboardAsState$delegate, this.$keyboardScrollOffset$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            if (LazyMessageListKt.LazyMessageList$lambda$9(this.$keyboardAsState$delegate).isVisible() && !LazyMessageListKt.LazyMessageList$lambda$9(this.$keyboardAsState$delegate).isAnimating()) {
                this.$keyboardScrollOffset$delegate.q(kotlin.ranges.r.t(LazyMessageListKt.LazyMessageList$lambda$9(this.$keyboardAsState$delegate).getKeyboardHeight() - this.$intercomBadgeOffset, 0.0f));
                androidx.compose.foundation.lazy.j1 j1Var = this.$lazyListState;
                float fV0 = this.$keyboardScrollOffset$delegate.V0();
                this.label = 1;
                if (v3.b(j1Var, fV0, null, this, 2, null) == objL) {
                    return objL;
                }
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
        return ((LazyMessageListKt$LazyMessageList$10$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
