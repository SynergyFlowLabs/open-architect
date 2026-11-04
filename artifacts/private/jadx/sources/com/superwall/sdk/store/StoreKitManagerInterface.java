package com.superwall.sdk.store;

import com.superwall.sdk.delegate.RestorationResult;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.paywall.PaywallProducts;
import com.superwall.sdk.models.product.ProductItem;
import com.superwall.sdk.models.product.ProductVariable;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface StoreKitManagerInterface {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getProducts$default(StoreKitManagerInterface storeKitManagerInterface, List list, String str, List list2, PaywallProducts paywallProducts, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProducts");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            if ((i10 & 4) != 0) {
                list2 = CollectionsKt.emptyList();
            }
            if ((i10 & 8) != 0) {
                paywallProducts = null;
            }
            return storeKitManagerInterface.getProducts(list, str, list2, paywallProducts, dVar);
        }

        public static /* synthetic */ Object products$default(StoreKitManagerInterface storeKitManagerInterface, Set set, String str, kotlin.coroutines.d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: products");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            return storeKitManagerInterface.products(set, str, dVar);
        }
    }

    @Nullable
    Object getProductVariables(@NotNull Paywall paywall, @NotNull kotlin.coroutines.d<? super List<ProductVariable>> dVar);

    @Nullable
    Object getProducts(@NotNull List<String> list, @Nullable String str, @NotNull List<ProductItem> list2, @Nullable PaywallProducts paywallProducts, @NotNull kotlin.coroutines.d<? super GetProductsResponse> dVar);

    @NotNull
    Map<String, StoreProduct> getProductsById();

    @Nullable
    Object isFreeTrialAvailable(@NotNull StoreProduct storeProduct, @NotNull kotlin.coroutines.d<? super Boolean> dVar);

    @Nullable
    Object loadPurchasedProducts(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object processRestoration(@NotNull RestorationResult restorationResult, @NotNull PaywallView paywallView, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object products(@NotNull Set<String> set, @Nullable String str, @NotNull kotlin.coroutines.d<? super Set<StoreProduct>> dVar);

    @Nullable
    Object refreshReceipt(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object tryToRestore(@NotNull PaywallView paywallView, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
