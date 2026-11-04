package com.superwall.sdk.paywall.view.delegate;

import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.paywall.view.webview.messaging.PaywallWebEvent;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface PaywallViewEventCallback {
    @Nullable
    Object eventDidOccur(@NotNull PaywallWebEvent paywallWebEvent, @NotNull PaywallView paywallView, @NotNull d<? super Unit> dVar);
}
