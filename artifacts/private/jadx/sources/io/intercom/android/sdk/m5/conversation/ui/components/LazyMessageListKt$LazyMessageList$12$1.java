package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.l3;
import androidx.compose.runtime.w6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1", f = "LazyMessageList.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
final class LazyMessageListKt$LazyMessageList$12$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ l3 $firstVisibleItemIndex$delegate;
    final /* synthetic */ androidx.compose.foundation.lazy.j1 $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyMessageListKt$LazyMessageList$12$1(androidx.compose.foundation.lazy.j1 j1Var, l3 l3Var, kotlin.coroutines.d<? super LazyMessageListKt$LazyMessageList$12$1> dVar) {
        super(2, dVar);
        this.$lazyListState = j1Var;
        this.$firstVisibleItemIndex$delegate = l3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new LazyMessageListKt$LazyMessageList$12$1(this.$lazyListState, this.$firstVisibleItemIndex$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            final androidx.compose.foundation.lazy.j1 j1Var = this.$lazyListState;
            kotlinx.coroutines.flow.i iVarY = w6.y(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.a1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(j1Var.E());
                }
            });
            final l3 l3Var = this.$firstVisibleItemIndex$delegate;
            kotlinx.coroutines.flow.j jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1.2
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                    return emit(((Number) obj2).intValue(), (kotlin.coroutines.d<? super Unit>) dVar);
                }

                public final Object emit(int i11, kotlin.coroutines.d<? super Unit> dVar) {
                    l3Var.j(i11);
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
        return ((LazyMessageListKt$LazyMessageList$12$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
