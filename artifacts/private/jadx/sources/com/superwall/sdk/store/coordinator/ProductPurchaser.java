package com.superwall.sdk.store.coordinator;

import com.superwall.sdk.delegate.PurchaseResult;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ProductPurchaser {
    @Nullable
    Object purchase(@NotNull StoreProduct storeProduct, @NotNull d<? super PurchaseResult> dVar);
}
