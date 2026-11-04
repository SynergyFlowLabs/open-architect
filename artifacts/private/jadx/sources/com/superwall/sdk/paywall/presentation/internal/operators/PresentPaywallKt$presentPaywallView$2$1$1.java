package com.superwall.sdk.paywall.presentation.internal.operators;

import com.superwall.sdk.paywall.presentation.internal.state.PaywallState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.paywall.presentation.internal.operators.PresentPaywallKt$presentPaywallView$2$1$1", f = "PresentPaywall.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
final class PresentPaywallKt$presentPaywallView$2$1$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ j0<PaywallState> $paywallStatePublisher;
    final /* synthetic */ PaywallState.Presented $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PresentPaywallKt$presentPaywallView$2$1$1(j0<PaywallState> j0Var, PaywallState.Presented presented, d<? super PresentPaywallKt$presentPaywallView$2$1$1> dVar) {
        super(2, dVar);
        this.$paywallStatePublisher = j0Var;
        this.$state = presented;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PresentPaywallKt$presentPaywallView$2$1$1(this.$paywallStatePublisher, this.$state, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            j0<PaywallState> j0Var = this.$paywallStatePublisher;
            PaywallState.Presented presented = this.$state;
            this.label = 1;
            if (j0Var.emit(presented, this) == objL) {
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
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((PresentPaywallKt$presentPaywallView$2$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
