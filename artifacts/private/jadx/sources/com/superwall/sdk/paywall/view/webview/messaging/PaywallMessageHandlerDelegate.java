package com.superwall.sdk.paywall.view.webview.messaging;

import android.webkit.WebView;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.view.delegate.PaywallLoadingState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface PaywallMessageHandlerDelegate {
    void eventDidOccur(@NotNull PaywallWebEvent paywallWebEvent);

    @NotNull
    PaywallInfo getInfo();

    @NotNull
    PaywallLoadingState getLoadingState();

    @NotNull
    Paywall getPaywall();

    @Nullable
    PresentationRequest getRequest();

    @NotNull
    WebView getWebView();

    boolean isActive();

    void openDeepLink(@NotNull String str);

    void presentBrowserExternal(@NotNull String str);

    void presentBrowserInApp(@NotNull String str);

    void setLoadingState(@NotNull PaywallLoadingState paywallLoadingState);

    void setPaywall(@NotNull Paywall paywall);
}
