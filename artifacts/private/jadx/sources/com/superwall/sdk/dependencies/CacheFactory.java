package com.superwall.sdk.dependencies;

import com.superwall.sdk.paywall.manager.PaywallViewCache;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface CacheFactory {
    @NotNull
    PaywallViewCache makeCache();
}
