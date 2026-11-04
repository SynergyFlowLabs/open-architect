package com.superwall.sdk.dependencies;

import com.superwall.sdk.debug.DebugView;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.paywall.manager.PaywallViewCache;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.paywall.view.delegate.PaywallViewDelegateAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ViewFactory {
    @NotNull
    DebugView makeDebugView(@Nullable String str);

    @Nullable
    Object makePaywallView(@NotNull Paywall paywall, @Nullable PaywallViewCache paywallViewCache, @Nullable PaywallViewDelegateAdapter paywallViewDelegateAdapter, @NotNull kotlin.coroutines.d<? super PaywallView> dVar);
}
