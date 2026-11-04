package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.l3;
import androidx.compose.runtime.n3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$15$2$2$1", f = "LazyMessageList.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
final class LazyMessageListKt$LazyMessageList$15$2$2$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ l3 $firstVisibleItemIndex$delegate;
    final /* synthetic */ int $index;
    final /* synthetic */ n3<Boolean> $isListAtTheBottom$delegate;
    final /* synthetic */ androidx.compose.foundation.lazy.j1 $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyMessageListKt$LazyMessageList$15$2$2$1(int i10, androidx.compose.foundation.lazy.j1 j1Var, n3<Boolean> n3Var, l3 l3Var, kotlin.coroutines.d<? super LazyMessageListKt$LazyMessageList$15$2$2$1> dVar) {
        super(2, dVar);
        this.$index = i10;
        this.$lazyListState = j1Var;
        this.$isListAtTheBottom$delegate = n3Var;
        this.$firstVisibleItemIndex$delegate = l3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new LazyMessageListKt$LazyMessageList$15$2$2$1(this.$index, this.$lazyListState, this.$isListAtTheBottom$delegate, this.$firstVisibleItemIndex$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            if (LazyMessageListKt.LazyMessageList$lambda$18(this.$isListAtTheBottom$delegate) && this.$firstVisibleItemIndex$delegate.m1() < this.$index) {
                androidx.compose.foundation.lazy.j1 j1Var = this.$lazyListState;
                this.label = 1;
                if (androidx.compose.foundation.lazy.j1.x(j1Var, Integer.MAX_VALUE, 0, this, 2, null) == objL) {
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
        return ((LazyMessageListKt$LazyMessageList$15$2$2$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
