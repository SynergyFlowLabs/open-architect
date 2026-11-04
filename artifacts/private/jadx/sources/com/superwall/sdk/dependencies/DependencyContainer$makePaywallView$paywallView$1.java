package com.superwall.sdk.dependencies;

import android.content.Context;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.config.options.PaywallOptions;
import com.superwall.sdk.models.config.Config;
import com.superwall.sdk.models.config.FeatureFlags;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.network.device.DeviceHelper;
import com.superwall.sdk.paywall.manager.PaywallViewCache;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.paywall.view.delegate.PaywallViewDelegateAdapter;
import com.superwall.sdk.paywall.view.webview.SWWebView;
import com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler;
import com.superwall.sdk.storage.LocalStorage;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$makePaywallView$paywallView$1", f = "DependencyContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class DependencyContainer$makePaywallView$paywallView$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super PaywallView>, Object> {
    final /* synthetic */ PaywallViewCache $cache;
    final /* synthetic */ PaywallViewDelegateAdapter $delegate;
    final /* synthetic */ PaywallMessageHandler $messageHandler;
    final /* synthetic */ Paywall $paywall;
    int label;
    final /* synthetic */ DependencyContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DependencyContainer$makePaywallView$paywallView$1(DependencyContainer dependencyContainer, PaywallMessageHandler paywallMessageHandler, Paywall paywall, PaywallViewDelegateAdapter paywallViewDelegateAdapter, PaywallViewCache paywallViewCache, kotlin.coroutines.d<? super DependencyContainer$makePaywallView$paywallView$1> dVar) {
        super(2, dVar);
        this.this$0 = dependencyContainer;
        this.$messageHandler = paywallMessageHandler;
        this.$paywall = paywall;
        this.$delegate = paywallViewDelegateAdapter;
        this.$cache = paywallViewCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaywallOptions invokeSuspend$lambda$0(DependencyContainer dependencyContainer) {
        return dependencyContainer.makeSuperwallOptions().getPaywalls();
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new DependencyContainer$makePaywallView$paywallView$1(this.this$0, this.$messageHandler, this.$paywall, this.$delegate, this.$cache, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FeatureFlags featureFlags;
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        Context context = this.this$0.getContext();
        PaywallMessageHandler paywallMessageHandler = this.$messageHandler;
        final DependencyContainer dependencyContainer = this.this$0;
        int i10 = 5 ^ 0;
        SWWebView sWWebView = new SWWebView(context, paywallMessageHandler, null, new Function0() { // from class: com.superwall.sdk.dependencies.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DependencyContainer$makePaywallView$paywallView$1.invokeSuspend$lambda$0(dependencyContainer);
            }
        }, 4, null);
        Context context2 = this.this$0.getContext();
        DeviceHelper deviceHelper = this.this$0.getDeviceHelper();
        LocalStorage storage = this.this$0.getStorage();
        Superwall companion = Superwall.Companion.getInstance();
        Config config = this.this$0.getConfigManager().getConfig();
        PaywallView paywallView = new PaywallView(context2, this.$paywall, companion, this.$delegate, deviceHelper, this.this$0, storage, sWWebView, this.$cache, (config == null || (featureFlags = config.getFeatureFlags()) == null) ? false : featureFlags.getEnableMultiplePaywallUrls());
        sWWebView.setDelegate(paywallView);
        this.$messageHandler.setDelegate(paywallView);
        return paywallView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super PaywallView> dVar) {
        return ((DependencyContainer$makePaywallView$paywallView$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
