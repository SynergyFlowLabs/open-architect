package com.superwall.sdk.paywall.view.webview.messaging;

import com.superwall.sdk.paywall.view.webview.PaywallMessage;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface WebEventDelegate {
    @Nullable
    Object handle(@NotNull PaywallMessage paywallMessage, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
