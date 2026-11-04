package com.superwall.sdk.logger;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum LogScope {
    localizationManager,
    bounceButton,
    webEntitlements,
    coreData,
    configManager,
    identityManager,
    debugManager,
    debugView,
    localizationView,
    gameControllerManager,
    device,
    network,
    paywallEvents,
    productsManager,
    storeKitManager,
    placements,
    receipts,
    superwallCore,
    transactions,
    jsEvaluator,
    paywallPresentation,
    paywallTransactions,
    paywallView,
    nativePurchaseController,
    cache,
    all;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static a<LogScope> getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return name();
    }
}
