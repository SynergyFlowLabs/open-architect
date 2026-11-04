package com.appsflyer.api.models;

import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OneTimePurchaseOfferDetails implements AFPurchaseConnectorA1w {

    @NotNull
    private final String formattedPrice;
    private final long priceAmountMicros;

    @NotNull
    private final String priceCurrencyCode;

    public OneTimePurchaseOfferDetails(@NotNull String str, long j10, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.formattedPrice = str;
        this.priceAmountMicros = j10;
        this.priceCurrencyCode = str2;
    }

    public static /* synthetic */ OneTimePurchaseOfferDetails copy$default(OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, String str, long j10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oneTimePurchaseOfferDetails.formattedPrice;
        }
        if ((i10 & 2) != 0) {
            j10 = oneTimePurchaseOfferDetails.priceAmountMicros;
        }
        if ((i10 & 4) != 0) {
            str2 = oneTimePurchaseOfferDetails.priceCurrencyCode;
        }
        return oneTimePurchaseOfferDetails.copy(str, j10, str2);
    }

    @NotNull
    public final String component1() {
        return this.formattedPrice;
    }

    public final long component2() {
        return this.priceAmountMicros;
    }

    @NotNull
    public final String component3() {
        return this.priceCurrencyCode;
    }

    @NotNull
    public final OneTimePurchaseOfferDetails copy(@NotNull String str, long j10, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new OneTimePurchaseOfferDetails(str, j10, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneTimePurchaseOfferDetails)) {
            return false;
        }
        OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = (OneTimePurchaseOfferDetails) obj;
        return Intrinsics.areEqual(this.formattedPrice, oneTimePurchaseOfferDetails.formattedPrice) && this.priceAmountMicros == oneTimePurchaseOfferDetails.priceAmountMicros && Intrinsics.areEqual(this.priceCurrencyCode, oneTimePurchaseOfferDetails.priceCurrencyCode);
    }

    @i(name = "getFormattedPrice")
    @NotNull
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    @i(name = "getPriceAmountMicros")
    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    @i(name = "getPriceCurrencyCode")
    @NotNull
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final int hashCode() {
        return (((this.formattedPrice.hashCode() * 31) + Long.hashCode(this.priceAmountMicros)) * 31) + this.priceCurrencyCode.hashCode();
    }

    @NotNull
    public final Map<String, Object> toJsonMap() {
        return MapsKt.mutableMapOf(TuplesKt.to("formatted_price", this.formattedPrice), TuplesKt.to("price_amount_micros", Long.valueOf(this.priceAmountMicros)), TuplesKt.to("price_currency_code", this.priceCurrencyCode));
    }

    @NotNull
    public final String toString() {
        return "OneTimePurchaseOfferDetails(formattedPrice=" + this.formattedPrice + ", priceAmountMicros=" + this.priceAmountMicros + ", priceCurrencyCode=" + this.priceCurrencyCode + ")";
    }
}
