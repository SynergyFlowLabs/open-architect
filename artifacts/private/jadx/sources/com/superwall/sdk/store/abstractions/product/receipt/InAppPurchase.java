package com.superwall.sdk.store.abstractions.product.receipt;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class InAppPurchase {

    @NotNull
    private String productIdentifier;

    public InAppPurchase(@NotNull String productIdentifier) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        this.productIdentifier = productIdentifier;
    }

    public static /* synthetic */ InAppPurchase copy$default(InAppPurchase inAppPurchase, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inAppPurchase.productIdentifier;
        }
        return inAppPurchase.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.productIdentifier;
    }

    @NotNull
    public final InAppPurchase copy(@NotNull String productIdentifier) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        return new InAppPurchase(productIdentifier);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InAppPurchase) && Intrinsics.areEqual(this.productIdentifier, ((InAppPurchase) obj).productIdentifier)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public int hashCode() {
        return this.productIdentifier.hashCode();
    }

    public final void setProductIdentifier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productIdentifier = str;
    }

    @NotNull
    public String toString() {
        return "InAppPurchase(productIdentifier=" + this.productIdentifier + ")";
    }
}
