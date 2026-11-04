package com.superwall.sdk.paywall.presentation.get_paywall.builder;

import android.app.Activity;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.paywall.presentation.get_paywall.PublicGetPaywallKt;
import com.superwall.sdk.paywall.presentation.internal.request.PaywallOverrides;
import com.superwall.sdk.paywall.view.LoadingView;
import com.superwall.sdk.paywall.view.PaywallPurchaseLoadingView;
import com.superwall.sdk.paywall.view.PaywallShimmerView;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.paywall.view.ShimmerView;
import com.superwall.sdk.paywall.view.delegate.PaywallViewCallback;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.paywall.presentation.get_paywall.builder.PaywallBuilder$build$3", f = "PaywallBuilder.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
final class PaywallBuilder$build$3 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ Function1<Throwable, Unit> $onError;
    final /* synthetic */ Function1<PaywallView, Unit> $onSuccess;
    int label;
    final /* synthetic */ PaywallBuilder this$0;

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_paywall.builder.PaywallBuilder$build$3$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.get_paywall.builder.PaywallBuilder$build$3$1", f = "PaywallBuilder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Function1<Throwable, Unit> $onError;
        final /* synthetic */ Function1<PaywallView, Unit> $onSuccess;
        final /* synthetic */ Object $res;
        int label;
        final /* synthetic */ PaywallBuilder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Object obj, PaywallBuilder paywallBuilder, Function1<? super PaywallView, Unit> function1, Function1<? super Throwable, Unit> function2, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$res = obj;
            this.this$0 = paywallBuilder;
            this.$onSuccess = function1;
            this.$onError = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$res, this.this$0, this.$onSuccess, this.$onError, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Object obj2 = this.$res;
            PaywallBuilder paywallBuilder = this.this$0;
            Function1<PaywallView, Unit> function1 = this.$onSuccess;
            if (Result.h(obj2)) {
                PaywallView paywallView = (PaywallView) obj2;
                paywallView.setEncapsulatingActivity(new WeakReference<>(paywallBuilder.activity));
                PaywallShimmerView shimmerView = paywallBuilder.shimmmerView;
                if (shimmerView == null) {
                    Activity activity = paywallBuilder.activity;
                    Intrinsics.checkNotNull(activity);
                    shimmerView = new ShimmerView(activity, null, 2, null);
                }
                PaywallPurchaseLoadingView loadingView = paywallBuilder.purchaseLoadingView;
                if (loadingView == null) {
                    Activity activity2 = paywallBuilder.activity;
                    Intrinsics.checkNotNull(activity2);
                    loadingView = new LoadingView(activity2, null, 0, 0, 14, null);
                }
                paywallView.setupWith(shimmerView, loadingView);
                paywallView.setupShimmer$superwall_release(shimmerView);
                paywallView.setupLoading$superwall_release(loadingView);
                paywallView.beforeViewCreated();
                function1.invoke(paywallView);
            }
            Function1<Throwable, Unit> function2 = this.$onError;
            Throwable thD = Result.d(obj2);
            if (thD != null) {
                function2.invoke(thD);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaywallBuilder$build$3(PaywallBuilder paywallBuilder, Function1<? super PaywallView, Unit> function1, Function1<? super Throwable, Unit> function2, d<? super PaywallBuilder$build$3> dVar) {
        super(2, dVar);
        this.this$0 = paywallBuilder;
        this.$onSuccess = function1;
        this.$onError = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PaywallBuilder$build$3(this.this$0, this.$onSuccess, this.$onError, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        PaywallBuilder$build$3 paywallBuilder$build$3;
        Object paywall;
        Object objL = b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            Superwall companion = Superwall.Companion.getInstance();
            String placement = this.this$0.getPlacement();
            Map map = this.this$0.params;
            PaywallOverrides paywallOverrides = this.this$0.paywallOverrides;
            PaywallViewCallback paywallViewCallback = this.this$0.delegate;
            Intrinsics.checkNotNull(paywallViewCallback);
            this.label = 1;
            paywallBuilder$build$3 = this;
            paywall = PublicGetPaywallKt.getPaywall(companion, placement, map, paywallOverrides, paywallViewCallback, paywallBuilder$build$3);
            if (paywall == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            paywall = ((Result) obj).j();
            paywallBuilder$build$3 = this;
        }
        k.f(t0.b(), null, null, new AnonymousClass1(paywall, paywallBuilder$build$3.this$0, paywallBuilder$build$3.$onSuccess, paywallBuilder$build$3.$onError, null), 3, null);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((PaywallBuilder$build$3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
