package com.superwall.sdk.dependencies;

import com.superwall.sdk.models.paywall.Paywall;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ConfigManagerFactory {
    @Nullable
    Paywall makeStaticPaywall(@Nullable String str, boolean z10);
}
