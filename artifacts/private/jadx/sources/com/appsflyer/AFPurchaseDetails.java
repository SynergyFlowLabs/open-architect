package com.appsflyer;

import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AFPurchaseDetails {

    @NotNull
    private final String currency;

    @NotNull
    private final String price;

    @NotNull
    private final String productId;

    @NotNull
    private final String purchaseToken;

    @NotNull
    private final AFPurchaseType purchaseType;

    public AFPurchaseDetails(@NotNull AFPurchaseType aFPurchaseType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(aFPurchaseType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.purchaseType = aFPurchaseType;
        this.purchaseToken = str;
        this.productId = str2;
        this.price = str3;
        this.currency = str4;
    }

    public static /* synthetic */ AFPurchaseDetails copy$default(AFPurchaseDetails aFPurchaseDetails, AFPurchaseType aFPurchaseType, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aFPurchaseType = aFPurchaseDetails.purchaseType;
        }
        if ((i10 & 2) != 0) {
            str = aFPurchaseDetails.purchaseToken;
        }
        if ((i10 & 4) != 0) {
            str2 = aFPurchaseDetails.productId;
        }
        if ((i10 & 8) != 0) {
            str3 = aFPurchaseDetails.price;
        }
        if ((i10 & 16) != 0) {
            str4 = aFPurchaseDetails.currency;
        }
        String str5 = str4;
        String str6 = str2;
        return aFPurchaseDetails.copy(aFPurchaseType, str, str6, str3, str5);
    }

    @NotNull
    public final AFPurchaseType component1() {
        return this.purchaseType;
    }

    @NotNull
    public final String component2() {
        return this.purchaseToken;
    }

    @NotNull
    public final String component3() {
        return this.productId;
    }

    @NotNull
    public final String component4() {
        return this.price;
    }

    @NotNull
    public final String component5() {
        return this.currency;
    }

    @NotNull
    public final AFPurchaseDetails copy(@NotNull AFPurchaseType aFPurchaseType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(aFPurchaseType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AFPurchaseDetails(aFPurchaseType, str, str2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFPurchaseDetails)) {
            return false;
        }
        AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) obj;
        return this.purchaseType == aFPurchaseDetails.purchaseType && Intrinsics.areEqual(this.purchaseToken, aFPurchaseDetails.purchaseToken) && Intrinsics.areEqual(this.productId, aFPurchaseDetails.productId) && Intrinsics.areEqual(this.price, aFPurchaseDetails.price) && Intrinsics.areEqual(this.currency, aFPurchaseDetails.currency);
    }

    @i(name = "getCurrency")
    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @i(name = "getPrice")
    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @i(name = "getProductId")
    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @i(name = "getPurchaseToken")
    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @i(name = "getPurchaseType")
    @NotNull
    public final AFPurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final int hashCode() {
        return (((((((this.purchaseType.hashCode() * 31) + this.purchaseToken.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.price.hashCode()) * 31) + this.currency.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AFPurchaseDetails(purchaseType=" + this.purchaseType + ", purchaseToken=" + this.purchaseToken + ", productId=" + this.productId + ", price=" + this.price + ", currency=" + this.currency + ")";
    }
}
