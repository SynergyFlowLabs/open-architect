package com.superwall.sdk.billing;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.billing.GoogleBillingWrapper$Handler$post$1", f = "GoogleBillingWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class GoogleBillingWrapper$Handler$post$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleBillingWrapper$Handler$post$1(Function0<Unit> function0, kotlin.coroutines.d<? super GoogleBillingWrapper$Handler$post$1> dVar) {
        super(2, dVar);
        this.$action = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new GoogleBillingWrapper$Handler$post$1(this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.$action.invoke();
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((GoogleBillingWrapper$Handler$post$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
