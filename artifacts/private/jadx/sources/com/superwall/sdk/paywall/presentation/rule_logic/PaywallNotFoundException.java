package com.superwall.sdk.paywall.presentation.rule_logic;

/* JADX INFO: loaded from: classes13.dex */
public final class PaywallNotFoundException extends Exception {
    public PaywallNotFoundException() {
        super("There isn't a paywall configured to show in this context");
    }
}
