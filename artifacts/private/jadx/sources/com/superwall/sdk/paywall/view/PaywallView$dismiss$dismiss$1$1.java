package com.superwall.sdk.paywall.view;

import com.superwall.sdk.paywall.presentation.internal.state.PaywallResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$dismiss$dismiss$1$1", f = "PaywallView.kt", i = {}, l = {434}, m = "invokeSuspend", n = {}, s = {})
final class PaywallView$dismiss$dismiss$1$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ boolean $isDeclined;
    final /* synthetic */ boolean $isManualClose;
    final /* synthetic */ PaywallResult $result;
    int label;
    final /* synthetic */ PaywallView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallView$dismiss$dismiss$1$1(boolean z10, boolean z11, PaywallView paywallView, PaywallResult paywallResult, kotlin.coroutines.d<? super PaywallView$dismiss$dismiss$1$1> dVar) {
        super(2, dVar);
        this.$isDeclined = z10;
        this.$isManualClose = z11;
        this.this$0 = paywallView;
        this.$result = paywallResult;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new PaywallView$dismiss$dismiss$1$1(this.$isDeclined, this.$isManualClose, this.this$0, this.$result, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            boolean z10 = this.$isDeclined;
            boolean z11 = this.$isManualClose;
            PaywallView paywallView = this.this$0;
            PaywallResult paywallResult = this.$result;
            this.label = 1;
            if (PaywallView.dismiss$dismissView(z10, z11, paywallView, paywallResult, this) == objL) {
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
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((PaywallView$dismiss$dismiss$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
