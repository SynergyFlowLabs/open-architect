package com.superwall.sdk.store;

import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.product.ProductItem;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class GetProductsResponse {

    @Nullable
    private final Paywall paywall;

    @NotNull
    private final List<ProductItem> productItems;

    @NotNull
    private final Map<String, StoreProduct> productsByFullId;

    public GetProductsResponse(@NotNull Map<String, StoreProduct> productsByFullId, @NotNull List<ProductItem> productItems, @Nullable Paywall paywall) {
        Intrinsics.checkNotNullParameter(productsByFullId, "productsByFullId");
        Intrinsics.checkNotNullParameter(productItems, "productItems");
        this.productsByFullId = productsByFullId;
        this.productItems = productItems;
        this.paywall = paywall;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetProductsResponse copy$default(GetProductsResponse getProductsResponse, Map map, List list, Paywall paywall, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = getProductsResponse.productsByFullId;
        }
        if ((i10 & 2) != 0) {
            list = getProductsResponse.productItems;
        }
        if ((i10 & 4) != 0) {
            paywall = getProductsResponse.paywall;
        }
        return getProductsResponse.copy(map, list, paywall);
    }

    @NotNull
    public final Map<String, StoreProduct> component1() {
        return this.productsByFullId;
    }

    @NotNull
    public final List<ProductItem> component2() {
        return this.productItems;
    }

    @Nullable
    public final Paywall component3() {
        return this.paywall;
    }

    @NotNull
    public final GetProductsResponse copy(@NotNull Map<String, StoreProduct> productsByFullId, @NotNull List<ProductItem> productItems, @Nullable Paywall paywall) {
        Intrinsics.checkNotNullParameter(productsByFullId, "productsByFullId");
        Intrinsics.checkNotNullParameter(productItems, "productItems");
        return new GetProductsResponse(productsByFullId, productItems, paywall);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetProductsResponse)) {
            return false;
        }
        GetProductsResponse getProductsResponse = (GetProductsResponse) obj;
        return Intrinsics.areEqual(this.productsByFullId, getProductsResponse.productsByFullId) && Intrinsics.areEqual(this.productItems, getProductsResponse.productItems) && Intrinsics.areEqual(this.paywall, getProductsResponse.paywall);
    }

    @Nullable
    public final Paywall getPaywall() {
        return this.paywall;
    }

    @NotNull
    public final List<ProductItem> getProductItems() {
        return this.productItems;
    }

    @NotNull
    public final Map<String, StoreProduct> getProductsByFullId() {
        return this.productsByFullId;
    }

    public int hashCode() {
        int iHashCode = ((this.productsByFullId.hashCode() * 31) + this.productItems.hashCode()) * 31;
        Paywall paywall = this.paywall;
        return iHashCode + (paywall == null ? 0 : paywall.hashCode());
    }

    @NotNull
    public String toString() {
        return "GetProductsResponse(productsByFullId=" + this.productsByFullId + ", productItems=" + this.productItems + ", paywall=" + this.paywall + ")";
    }

    public /* synthetic */ GetProductsResponse(Map map, List list, Paywall paywall, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, list, (i10 & 4) != 0 ? null : paywall);
    }
}
