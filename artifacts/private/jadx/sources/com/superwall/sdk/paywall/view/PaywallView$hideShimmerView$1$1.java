package com.superwall.sdk.paywall.view;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$hideShimmerView$1$1", f = "PaywallView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class PaywallView$hideShimmerView$1$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ PaywallShimmerView $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallView$hideShimmerView$1$1(PaywallShimmerView paywallShimmerView, kotlin.coroutines.d<? super PaywallView$hideShimmerView$1$1> dVar) {
        super(2, dVar);
        this.$it = paywallShimmerView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new PaywallView$hideShimmerView$1$1(this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.$it.hideShimmer();
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((PaywallView$hideShimmerView$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
