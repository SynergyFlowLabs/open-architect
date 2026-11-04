package com.devtodev.analytics.internal.validator;

import h4.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PaymentData {

    @NotNull
    private final String currencyCode;

    @NotNull
    private final String orderId;
    private final double price;

    @NotNull
    private final String productId;

    public PaymentData(@NotNull String orderId, double d10, @NotNull String productId, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.orderId = orderId;
        this.price = d10;
        this.productId = productId;
        this.currencyCode = currencyCode;
    }

    public static /* synthetic */ PaymentData copy$default(PaymentData paymentData, String str, double d10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentData.orderId;
        }
        if ((i10 & 2) != 0) {
            d10 = paymentData.price;
        }
        if ((i10 & 4) != 0) {
            str2 = paymentData.productId;
        }
        if ((i10 & 8) != 0) {
            str3 = paymentData.currencyCode;
        }
        return paymentData.copy(str, d10, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.orderId;
    }

    public final double component2() {
        return this.price;
    }

    @NotNull
    public final String component3() {
        return this.productId;
    }

    @NotNull
    public final String component4() {
        return this.currencyCode;
    }

    @NotNull
    public final PaymentData copy(@NotNull String orderId, double d10, @NotNull String productId, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return new PaymentData(orderId, d10, productId, currencyCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentData)) {
            return false;
        }
        PaymentData paymentData = (PaymentData) obj;
        return Intrinsics.areEqual(this.orderId, paymentData.orderId) && Double.compare(this.price, paymentData.price) == 0 && Intrinsics.areEqual(this.productId, paymentData.productId) && Intrinsics.areEqual(this.currencyCode, paymentData.currencyCode);
    }

    @NotNull
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final double getPrice() {
        return this.price;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return this.currencyCode.hashCode() + b.a(this.productId, (Double.hashCode(this.price) + (this.orderId.hashCode() * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "PaymentData(orderId=" + this.orderId + ", price=" + this.price + ", productId=" + this.productId + ", currencyCode=" + this.currencyCode + ")";
    }
}
