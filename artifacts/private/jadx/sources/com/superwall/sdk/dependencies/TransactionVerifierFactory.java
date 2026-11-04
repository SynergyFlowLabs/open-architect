package com.superwall.sdk.dependencies;

import com.superwall.sdk.billing.GoogleBillingWrapper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface TransactionVerifierFactory {
    @NotNull
    GoogleBillingWrapper makeTransactionVerifier();
}
