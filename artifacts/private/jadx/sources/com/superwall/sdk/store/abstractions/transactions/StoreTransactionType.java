package com.superwall.sdk.store.abstractions.transactions;

import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface StoreTransactionType {
    @Nullable
    String getAppAccountToken();

    @Nullable
    String getAppBundleId();

    @Nullable
    Date getExpirationDate();

    @Nullable
    String getOfferId();

    @Nullable
    Date getOriginalTransactionDate();

    @Nullable
    String getOriginalTransactionIdentifier();

    @Nullable
    StorePayment getPayment();

    @NotNull
    String getPurchaseToken();

    @Nullable
    Date getRevocationDate();

    @NotNull
    StoreTransactionState getState();

    @Nullable
    String getStoreTransactionId();

    @Nullable
    String getSubscriptionGroupId();

    @Nullable
    Date getTransactionDate();

    @Nullable
    String getWebOrderLineItemID();

    @Nullable
    Boolean isUpgraded();
}
