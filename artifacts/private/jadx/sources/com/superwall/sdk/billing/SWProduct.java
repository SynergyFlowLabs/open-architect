package com.superwall.sdk.billing;

import com.android.billingclient.api.SkuDetails;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class SWProduct {

    @NotNull
    private final SkuDetails skuDetails;

    public SWProduct(@NotNull SkuDetails skuDetails) {
        Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
        this.skuDetails = skuDetails;
    }

    public static /* synthetic */ SWProduct copy$default(SWProduct sWProduct, SkuDetails skuDetails, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            skuDetails = sWProduct.skuDetails;
        }
        return sWProduct.copy(skuDetails);
    }

    @NotNull
    public final SkuDetails component1() {
        return this.skuDetails;
    }

    @NotNull
    public final SWProduct copy(@NotNull SkuDetails skuDetails) {
        Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
        return new SWProduct(skuDetails);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SWProduct) && Intrinsics.areEqual(this.skuDetails, ((SWProduct) obj).skuDetails);
    }

    @NotNull
    public final SkuDetails getSkuDetails() {
        return this.skuDetails;
    }

    public int hashCode() {
        return this.skuDetails.hashCode();
    }

    @NotNull
    public String toString() {
        return "SWProduct(skuDetails=" + this.skuDetails + ")";
    }
}
