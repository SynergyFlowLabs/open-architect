package com.superwall.sdk.billing;

import com.android.billingclient.api.Purchase;
import com.superwall.sdk.delegate.InternalPurchaseResult;
import com.superwall.sdk.dependencies.StoreTransactionFactory;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import com.superwall.sdk.store.abstractions.transactions.StoreTransaction;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface Billing {
    @Nullable
    Object awaitGetProducts(@NotNull Set<String> set, @NotNull kotlin.coroutines.d<? super Set<StoreProduct>> dVar);

    @Nullable
    Object getLatestTransaction(@NotNull StoreTransactionFactory storeTransactionFactory, @NotNull kotlin.coroutines.d<? super StoreTransaction> dVar);

    @NotNull
    k0<InternalPurchaseResult> getPurchaseResults();

    @Nullable
    Object queryAllPurchases(@NotNull kotlin.coroutines.d<? super List<? extends Purchase>> dVar);
}
