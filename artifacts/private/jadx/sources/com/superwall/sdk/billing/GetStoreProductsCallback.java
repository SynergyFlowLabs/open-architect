package com.superwall.sdk.billing;

import com.superwall.sdk.store.abstractions.product.StoreProduct;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface GetStoreProductsCallback {
    void onError(@NotNull BillingError billingError);

    @oj.o
    void onReceived(@NotNull Set<StoreProduct> set);
}
