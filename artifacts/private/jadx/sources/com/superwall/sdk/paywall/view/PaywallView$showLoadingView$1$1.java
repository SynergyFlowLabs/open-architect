package com.superwall.sdk.paywall.view;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$showLoadingView$1$1", f = "PaywallView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class PaywallView$showLoadingView$1$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ PaywallPurchaseLoadingView $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallView$showLoadingView$1$1(PaywallPurchaseLoadingView paywallPurchaseLoadingView, kotlin.coroutines.d<? super PaywallView$showLoadingView$1$1> dVar) {
        super(2, dVar);
        this.$it = paywallPurchaseLoadingView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new PaywallView$showLoadingView$1$1(this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.$it.showLoading();
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((PaywallView$showLoadingView$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
