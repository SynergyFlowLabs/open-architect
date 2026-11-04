package com.superwall.sdk.debug;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView$presentAlert$1$1", f = "DebugView.kt", i = {}, l = {810}, m = "invokeSuspend", n = {}, s = {})
final class DebugView$presentAlert$1$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ DebugView.AlertOption $option;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugView$presentAlert$1$1(DebugView.AlertOption alertOption, kotlin.coroutines.d<? super DebugView$presentAlert$1$1> dVar) {
        super(2, dVar);
        this.$option = alertOption;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new DebugView$presentAlert$1$1(this.$option, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            Function1<kotlin.coroutines.d<? super Unit>, Object> action = this.$option.getAction();
            if (action != null) {
                this.label = 1;
                if (action.invoke(this) == objL) {
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
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((DebugView$presentAlert$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
