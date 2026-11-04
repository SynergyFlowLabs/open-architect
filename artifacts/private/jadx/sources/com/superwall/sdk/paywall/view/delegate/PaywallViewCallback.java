package com.superwall.sdk.paywall.view.delegate;

import com.superwall.sdk.paywall.presentation.internal.state.PaywallResult;
import com.superwall.sdk.paywall.view.PaywallView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface PaywallViewCallback {
    void onFinished(@NotNull PaywallView paywallView, @NotNull PaywallResult paywallResult, boolean z10);
}
