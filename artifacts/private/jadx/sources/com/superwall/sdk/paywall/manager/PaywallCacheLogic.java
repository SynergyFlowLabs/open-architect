package com.superwall.sdk.paywall.manager;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class PaywallCacheLogic {

    @NotNull
    public static final PaywallCacheLogic INSTANCE = new PaywallCacheLogic();

    private PaywallCacheLogic() {
    }

    @NotNull
    public final String key(@NotNull String identifier, @NotNull String locale) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return identifier + "_" + locale;
    }
}
