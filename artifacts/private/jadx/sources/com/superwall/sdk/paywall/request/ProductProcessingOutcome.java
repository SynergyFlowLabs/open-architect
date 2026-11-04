package com.superwall.sdk.paywall.request;

import com.superwall.sdk.models.product.ProductVariable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ProductProcessingOutcome {
    private boolean isFreeTrialAvailable;

    @NotNull
    private List<ProductVariable> productVariables;

    public ProductProcessingOutcome(@NotNull List<ProductVariable> productVariables, boolean z10) {
        Intrinsics.checkNotNullParameter(productVariables, "productVariables");
        this.productVariables = productVariables;
        this.isFreeTrialAvailable = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductProcessingOutcome copy$default(ProductProcessingOutcome productProcessingOutcome, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = productProcessingOutcome.productVariables;
        }
        if ((i10 & 2) != 0) {
            z10 = productProcessingOutcome.isFreeTrialAvailable;
        }
        return productProcessingOutcome.copy(list, z10);
    }

    @NotNull
    public final List<ProductVariable> component1() {
        return this.productVariables;
    }

    public final boolean component2() {
        return this.isFreeTrialAvailable;
    }

    @NotNull
    public final ProductProcessingOutcome copy(@NotNull List<ProductVariable> productVariables, boolean z10) {
        Intrinsics.checkNotNullParameter(productVariables, "productVariables");
        return new ProductProcessingOutcome(productVariables, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductProcessingOutcome)) {
            return false;
        }
        ProductProcessingOutcome productProcessingOutcome = (ProductProcessingOutcome) obj;
        return Intrinsics.areEqual(this.productVariables, productProcessingOutcome.productVariables) && this.isFreeTrialAvailable == productProcessingOutcome.isFreeTrialAvailable;
    }

    @NotNull
    public final List<ProductVariable> getProductVariables() {
        return this.productVariables;
    }

    public int hashCode() {
        return (this.productVariables.hashCode() * 31) + Boolean.hashCode(this.isFreeTrialAvailable);
    }

    public final boolean isFreeTrialAvailable() {
        return this.isFreeTrialAvailable;
    }

    public final void setFreeTrialAvailable(boolean z10) {
        this.isFreeTrialAvailable = z10;
    }

    public final void setProductVariables(@NotNull List<ProductVariable> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.productVariables = list;
    }

    @NotNull
    public String toString() {
        return "ProductProcessingOutcome(productVariables=" + this.productVariables + ", isFreeTrialAvailable=" + this.isFreeTrialAvailable + ")";
    }
}
