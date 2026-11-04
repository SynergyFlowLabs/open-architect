package com.superwall.sdk.dependencies;

import com.android.billingclient.api.Purchase;
import com.superwall.sdk.store.abstractions.transactions.StoreTransaction;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface StoreTransactionFactory {
    @Nullable
    Object activeProductIds(@NotNull kotlin.coroutines.d<? super List<String>> dVar);

    @Nullable
    Object makeStoreTransaction(@NotNull Purchase purchase, @NotNull kotlin.coroutines.d<? super StoreTransaction> dVar);
}
