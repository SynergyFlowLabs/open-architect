package com.superwall.sdk.store;

import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.product.ProductVariable;
import com.superwall.sdk.paywall.request.PaywallRequest;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface StoreKit {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getProducts$default(StoreKit storeKit, Map map, Paywall paywall, PaywallRequest paywallRequest, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProducts");
            }
            if ((i10 & 1) != 0) {
                map = null;
            }
            if ((i10 & 4) != 0) {
                paywallRequest = null;
            }
            return storeKit.getProducts(map, paywall, paywallRequest, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getProductsWithoutPaywall$default(StoreKit storeKit, List list, Map map, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProductsWithoutPaywall");
            }
            if ((i10 & 2) != 0) {
                map = null;
            }
            return storeKit.getProductsWithoutPaywall(list, map, dVar);
        }
    }

    @Nullable
    Object getProductVariables(@NotNull Paywall paywall, @NotNull PaywallRequest paywallRequest, @NotNull kotlin.coroutines.d<? super List<ProductVariable>> dVar);

    @Nullable
    Object getProducts(@Nullable Map<String, StoreProduct> map, @NotNull Paywall paywall, @Nullable PaywallRequest paywallRequest, @NotNull kotlin.coroutines.d<? super GetProductsResponse> dVar);

    @Nullable
    Object getProductsWithoutPaywall(@NotNull List<String> list, @Nullable Map<String, StoreProduct> map, @NotNull kotlin.coroutines.d<? super Map<String, StoreProduct>> dVar);

    @Nullable
    Object loadPurchasedProducts(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    void refreshReceipt();
}
