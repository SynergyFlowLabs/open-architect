package com.superwall.sdk.view;

import com.superwall.sdk.deprecated.PaywallMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface PaywallMessageDelegate {
    void didReceiveMessage(@NotNull PaywallMessage paywallMessage);
}
