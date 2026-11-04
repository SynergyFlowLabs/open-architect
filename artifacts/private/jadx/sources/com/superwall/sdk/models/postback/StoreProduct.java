package com.superwall.sdk.models.postback;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class StoreProduct {

    @NotNull
    private final String productIdentifier;

    @NotNull
    private final SWProduct swProduct;

    @NotNull
    private final Map<String, Object> swProductTemplateVariablesJson;

    public StoreProduct(@NotNull String productIdentifier, @NotNull Map<String, ? extends Object> swProductTemplateVariablesJson, @NotNull SWProduct swProduct) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(swProductTemplateVariablesJson, "swProductTemplateVariablesJson");
        Intrinsics.checkNotNullParameter(swProduct, "swProduct");
        this.productIdentifier = productIdentifier;
        this.swProductTemplateVariablesJson = swProductTemplateVariablesJson;
        this.swProduct = swProduct;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoreProduct copy$default(StoreProduct storeProduct, String str, Map map, SWProduct sWProduct, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = storeProduct.productIdentifier;
        }
        if ((i10 & 2) != 0) {
            map = storeProduct.swProductTemplateVariablesJson;
        }
        if ((i10 & 4) != 0) {
            sWProduct = storeProduct.swProduct;
        }
        return storeProduct.copy(str, map, sWProduct);
    }

    @NotNull
    public final String component1() {
        return this.productIdentifier;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.swProductTemplateVariablesJson;
    }

    @NotNull
    public final SWProduct component3() {
        return this.swProduct;
    }

    @NotNull
    public final StoreProduct copy(@NotNull String productIdentifier, @NotNull Map<String, ? extends Object> swProductTemplateVariablesJson, @NotNull SWProduct swProduct) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(swProductTemplateVariablesJson, "swProductTemplateVariablesJson");
        Intrinsics.checkNotNullParameter(swProduct, "swProduct");
        return new StoreProduct(productIdentifier, swProductTemplateVariablesJson, swProduct);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreProduct)) {
            return false;
        }
        StoreProduct storeProduct = (StoreProduct) obj;
        if (Intrinsics.areEqual(this.productIdentifier, storeProduct.productIdentifier) && Intrinsics.areEqual(this.swProductTemplateVariablesJson, storeProduct.swProductTemplateVariablesJson) && Intrinsics.areEqual(this.swProduct, storeProduct.swProduct)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    @NotNull
    public final SWProduct getSwProduct() {
        return this.swProduct;
    }

    @NotNull
    public final Map<String, Object> getSwProductTemplateVariablesJson() {
        return this.swProductTemplateVariablesJson;
    }

    public int hashCode() {
        return (((this.productIdentifier.hashCode() * 31) + this.swProductTemplateVariablesJson.hashCode()) * 31) + this.swProduct.hashCode();
    }

    @NotNull
    public String toString() {
        return "StoreProduct(productIdentifier=" + this.productIdentifier + ", swProductTemplateVariablesJson=" + this.swProductTemplateVariablesJson + ", swProduct=" + this.swProduct + ")";
    }
}
