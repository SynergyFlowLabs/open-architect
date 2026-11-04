package com.superwall.sdk.debug;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView$pressedBottomButton$alertOptions$1", f = "DebugView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class DebugView$pressedBottomButton$alertOptions$1 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {
    int label;
    final /* synthetic */ DebugView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugView$pressedBottomButton$alertOptions$1(DebugView debugView, kotlin.coroutines.d<? super DebugView$pressedBottomButton$alertOptions$1> dVar) {
        super(1, dVar);
        this.this$0 = debugView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new DebugView$pressedBottomButton$alertOptions$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.this$0.loadAndShowPaywall(true);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((DebugView$pressedBottomButton$alertOptions$1) create(dVar)).invokeSuspend(Unit.f312394a);
    }
}
