package com.superwall.sdk.paywall.presentation.get_paywall.builder;

import android.app.Activity;
import android.view.View;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.misc.IOScope;
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
import kotlinx.coroutines.j;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PaywallBuilder {

    @Nullable
    private Activity activity;

    @Nullable
    private PaywallViewCallback delegate;

    @Nullable
    private Map<String, ? extends Object> params;

    @Nullable
    private PaywallOverrides paywallOverrides;

    @NotNull
    private final String placement;

    @Nullable
    private PaywallPurchaseLoadingView purchaseLoadingView;

    @Nullable
    private PaywallShimmerView shimmmerView;

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.presentation.get_paywall.builder.PaywallBuilder$buildSync$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.presentation.get_paywall.builder.PaywallBuilder$buildSync$1", f = "PaywallBuilder.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super PaywallView>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PaywallBuilder.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AnonymousClass1 anonymousClass1;
            Object paywall;
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall companion = Superwall.Companion.getInstance();
                String placement = PaywallBuilder.this.getPlacement();
                Map map = PaywallBuilder.this.params;
                PaywallOverrides paywallOverrides = PaywallBuilder.this.paywallOverrides;
                PaywallViewCallback paywallViewCallback = PaywallBuilder.this.delegate;
                Intrinsics.checkNotNull(paywallViewCallback);
                this.label = 1;
                anonymousClass1 = this;
                paywall = PublicGetPaywallKt.getPaywall(companion, placement, map, paywallOverrides, paywallViewCallback, anonymousClass1);
                if (paywall == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                paywall = ((Result) obj).j();
                anonymousClass1 = this;
            }
            PaywallBuilder paywallBuilder = PaywallBuilder.this;
            if (!Result.h(paywall)) {
                ResultKt.m(paywall);
                return paywall;
            }
            PaywallView paywallView = (PaywallView) paywall;
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
            return paywallView;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super PaywallView> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public PaywallBuilder(@NotNull String placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.placement = placement;
    }

    @NotNull
    public final PaywallBuilder activity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Nullable
    /* JADX INFO: renamed from: build-IoAF18A, reason: not valid java name */
    public final Object m70buildIoAF18A(@NotNull d<? super Result<PaywallView>> dVar) {
        PaywallBuilder$build$1 paywallBuilder$build$1;
        Object paywall;
        if (dVar instanceof PaywallBuilder$build$1) {
            paywallBuilder$build$1 = (PaywallBuilder$build$1) dVar;
            int i10 = paywallBuilder$build$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                paywallBuilder$build$1.label = i10 - Integer.MIN_VALUE;
            } else {
                paywallBuilder$build$1 = new PaywallBuilder$build$1(this, dVar);
            }
        } else {
            paywallBuilder$build$1 = new PaywallBuilder$build$1(this, dVar);
        }
        PaywallBuilder$build$1 paywallBuilder$build$2 = paywallBuilder$build$1;
        Object obj = paywallBuilder$build$2.result;
        Object objL = b.l();
        int i11 = paywallBuilder$build$2.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            Superwall companion = Superwall.Companion.getInstance();
            String str = this.placement;
            Map<String, ? extends Object> map = this.params;
            PaywallOverrides paywallOverrides = this.paywallOverrides;
            PaywallViewCallback paywallViewCallback = this.delegate;
            Intrinsics.checkNotNull(paywallViewCallback);
            paywallBuilder$build$2.L$0 = this;
            paywallBuilder$build$2.label = 1;
            paywall = PublicGetPaywallKt.getPaywall(companion, str, map, paywallOverrides, paywallViewCallback, paywallBuilder$build$2);
            if (paywall == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (PaywallBuilder) paywallBuilder$build$2.L$0;
            ResultKt.m(obj);
            paywall = ((Result) obj).j();
        }
        if (Result.h(paywall)) {
            PaywallView paywallView = (PaywallView) paywall;
            paywallView.setEncapsulatingActivity(new WeakReference<>(this.activity));
            PaywallShimmerView shimmerView = this.shimmmerView;
            if (shimmerView == null) {
                Activity activity = this.activity;
                Intrinsics.checkNotNull(activity);
                shimmerView = new ShimmerView(activity, null, 2, null);
            }
            PaywallPurchaseLoadingView loadingView = this.purchaseLoadingView;
            if (loadingView == null) {
                Activity activity2 = this.activity;
                Intrinsics.checkNotNull(activity2);
                loadingView = new LoadingView(activity2, null, 0, 0, 14, null);
            }
            paywallView.setupWith(shimmerView, loadingView);
            paywallView.setupShimmer$superwall_release(shimmerView);
            paywallView.setupLoading$superwall_release(loadingView);
            paywallView.beforeViewCreated();
        }
        return paywall;
    }

    @NotNull
    public final PaywallView buildSync() {
        return (PaywallView) j.b(null, new AnonymousClass1(null), 1, null);
    }

    @i(name = "buildWithCallback")
    public final void buildWithCallback(@NotNull Function1<? super PaywallView, Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        k.f(new IOScope(null, 1, null), null, null, new PaywallBuilder$build$3(this, onSuccess, onError, null), 3, null);
    }

    @NotNull
    public final PaywallBuilder delegate(@NotNull PaywallViewCallback delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        return this;
    }

    @NotNull
    public final String getPlacement() {
        return this.placement;
    }

    @NotNull
    public final PaywallBuilder overrides(@Nullable PaywallOverrides paywallOverrides) {
        this.paywallOverrides = paywallOverrides;
        return this;
    }

    @NotNull
    public final PaywallBuilder params(@Nullable Map<String, ? extends Object> map) {
        this.params = map;
        return this;
    }

    @NotNull
    public final <T extends View & PaywallPurchaseLoadingView> PaywallBuilder purchaseLoadingView(@NotNull T purchaseLoadingView) {
        Intrinsics.checkNotNullParameter(purchaseLoadingView, "purchaseLoadingView");
        this.purchaseLoadingView = purchaseLoadingView;
        return this;
    }

    @NotNull
    public final <T extends View & PaywallShimmerView> PaywallBuilder shimmerView(@NotNull T shimmerView) {
        Intrinsics.checkNotNullParameter(shimmerView, "shimmerView");
        this.shimmmerView = shimmerView;
        return this;
    }
}
