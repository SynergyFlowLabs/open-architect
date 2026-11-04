package com.superwall.sdk.paywall.view;

import com.superwall.sdk.paywall.view.delegate.PaywallLoadingState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.k0;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$loadingStateDidChange$1", f = "PaywallView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class PaywallView$loadingStateDidChange$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    int label;
    final /* synthetic */ PaywallView this$0;

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$loadingStateDidChange$1$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$loadingStateDidChange$1$1", f = "PaywallView.kt", i = {}, l = {697}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;
        final /* synthetic */ PaywallView this$0;

        /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$loadingStateDidChange$1$1$1, reason: invalid class name and collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$loadingStateDidChange$1$1$1", f = "PaywallView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C18821 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
            int label;
            final /* synthetic */ PaywallView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18821(PaywallView paywallView, kotlin.coroutines.d<? super C18821> dVar) {
                super(2, dVar);
                this.this$0 = paywallView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C18821(this.this$0, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.this$0.showRefreshButtonAfterTimeout(false);
                this.this$0.hideLoadingView();
                this.this$0.hideShimmerView();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C18821) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallView paywallView, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = paywallView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                long delay = this.this$0.getPaywall().getPresentation().getDelay();
                this.label = 1;
                if (d1.b(delay, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            kotlinx.coroutines.k.f(PaywallView.mainScope, null, null, new C18821(this.this$0, null), 3, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallView$loadingStateDidChange$1(PaywallView paywallView, kotlin.coroutines.d<? super PaywallView$loadingStateDidChange$1> dVar) {
        super(2, dVar);
        this.this$0 = paywallView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new PaywallView$loadingStateDidChange$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        PaywallLoadingState loadingState = this.this$0.getLoadingState();
        if (!(loadingState instanceof PaywallLoadingState.Unknown)) {
            if ((loadingState instanceof PaywallLoadingState.LoadingPurchase) || (loadingState instanceof PaywallLoadingState.ManualLoading)) {
                this.this$0.showLoadingView();
            } else if (loadingState instanceof PaywallLoadingState.LoadingURL) {
                this.this$0.showShimmerView();
                this.this$0.showRefreshButtonAfterTimeout(true);
            } else {
                if (!(loadingState instanceof PaywallLoadingState.Ready)) {
                    throw new k0();
                }
                kotlinx.coroutines.k.f(PaywallView.ioScope, null, null, new AnonymousClass1(this.this$0, null), 3, null);
            }
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((PaywallView$loadingStateDidChange$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
