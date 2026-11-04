package com.appsflyer;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface AppsFlyerInAppPurchaseValidationCallback {
    void onInAppPurchaseValidationError(@NotNull Map<String, ? extends Object> map);

    void onInAppPurchaseValidationFinished(@NotNull Map<String, ? extends Object> map);
}
