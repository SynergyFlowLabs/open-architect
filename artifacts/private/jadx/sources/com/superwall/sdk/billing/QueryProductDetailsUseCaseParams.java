package com.superwall.sdk.billing;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class QueryProductDetailsUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;

    @NotNull
    private final Map<String, List<DecomposedProductIds>> decomposedProductIdsBySubscriptionId;

    @NotNull
    private final String productType;

    @NotNull
    private final Set<String> subscriptionIds;

    public QueryProductDetailsUseCaseParams(@NotNull Set<String> subscriptionIds, @NotNull Map<String, List<DecomposedProductIds>> decomposedProductIdsBySubscriptionId, @NotNull String productType, boolean z10) {
        Intrinsics.checkNotNullParameter(subscriptionIds, "subscriptionIds");
        Intrinsics.checkNotNullParameter(decomposedProductIdsBySubscriptionId, "decomposedProductIdsBySubscriptionId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.subscriptionIds = subscriptionIds;
        this.decomposedProductIdsBySubscriptionId = decomposedProductIdsBySubscriptionId;
        this.productType = productType;
        this.appInBackground = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryProductDetailsUseCaseParams copy$default(QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams, Set set, Map map, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            set = queryProductDetailsUseCaseParams.subscriptionIds;
        }
        if ((i10 & 2) != 0) {
            map = queryProductDetailsUseCaseParams.decomposedProductIdsBySubscriptionId;
        }
        if ((i10 & 4) != 0) {
            str = queryProductDetailsUseCaseParams.productType;
        }
        if ((i10 & 8) != 0) {
            z10 = queryProductDetailsUseCaseParams.appInBackground;
        }
        return queryProductDetailsUseCaseParams.copy(set, map, str, z10);
    }

    @NotNull
    public final Set<String> component1() {
        return this.subscriptionIds;
    }

    @NotNull
    public final Map<String, List<DecomposedProductIds>> component2() {
        return this.decomposedProductIdsBySubscriptionId;
    }

    @NotNull
    public final String component3() {
        return this.productType;
    }

    public final boolean component4() {
        return this.appInBackground;
    }

    @NotNull
    public final QueryProductDetailsUseCaseParams copy(@NotNull Set<String> subscriptionIds, @NotNull Map<String, List<DecomposedProductIds>> decomposedProductIdsBySubscriptionId, @NotNull String productType, boolean z10) {
        Intrinsics.checkNotNullParameter(subscriptionIds, "subscriptionIds");
        Intrinsics.checkNotNullParameter(decomposedProductIdsBySubscriptionId, "decomposedProductIdsBySubscriptionId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        return new QueryProductDetailsUseCaseParams(subscriptionIds, decomposedProductIdsBySubscriptionId, productType, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryProductDetailsUseCaseParams)) {
            return false;
        }
        QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams = (QueryProductDetailsUseCaseParams) obj;
        return Intrinsics.areEqual(this.subscriptionIds, queryProductDetailsUseCaseParams.subscriptionIds) && Intrinsics.areEqual(this.decomposedProductIdsBySubscriptionId, queryProductDetailsUseCaseParams.decomposedProductIdsBySubscriptionId) && Intrinsics.areEqual(this.productType, queryProductDetailsUseCaseParams.productType) && this.appInBackground == queryProductDetailsUseCaseParams.appInBackground;
    }

    @Override // com.superwall.sdk.billing.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    @NotNull
    public final Map<String, List<DecomposedProductIds>> getDecomposedProductIdsBySubscriptionId() {
        return this.decomposedProductIdsBySubscriptionId;
    }

    @NotNull
    public final String getProductType() {
        return this.productType;
    }

    @NotNull
    public final Set<String> getSubscriptionIds() {
        return this.subscriptionIds;
    }

    public int hashCode() {
        return (((((this.subscriptionIds.hashCode() * 31) + this.decomposedProductIdsBySubscriptionId.hashCode()) * 31) + this.productType.hashCode()) * 31) + Boolean.hashCode(this.appInBackground);
    }

    @NotNull
    public String toString() {
        return "QueryProductDetailsUseCaseParams(subscriptionIds=" + this.subscriptionIds + ", decomposedProductIdsBySubscriptionId=" + this.decomposedProductIdsBySubscriptionId + ", productType=" + this.productType + ", appInBackground=" + this.appInBackground + ")";
    }
}
