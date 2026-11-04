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
public final class PricingPhases implements AFPurchaseConnectorA1w {
    private final int billingCycleCount;

    @NotNull
    private final String billingPeriod;

    @NotNull
    private final String formattedPrice;
    private final long priceAmountMicros;

    @NotNull
    private final String priceCurrencyCode;
    private final int recurrenceMode;

    public PricingPhases(int i10, @NotNull String str, @NotNull String str2, long j10, @NotNull String str3, int i11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.billingCycleCount = i10;
        this.billingPeriod = str;
        this.formattedPrice = str2;
        this.priceAmountMicros = j10;
        this.priceCurrencyCode = str3;
        this.recurrenceMode = i11;
    }

    public static /* synthetic */ PricingPhases copy$default(PricingPhases pricingPhases, int i10, String str, String str2, long j10, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = pricingPhases.billingCycleCount;
        }
        if ((i12 & 2) != 0) {
            str = pricingPhases.billingPeriod;
        }
        if ((i12 & 4) != 0) {
            str2 = pricingPhases.formattedPrice;
        }
        if ((i12 & 8) != 0) {
            j10 = pricingPhases.priceAmountMicros;
        }
        if ((i12 & 16) != 0) {
            str3 = pricingPhases.priceCurrencyCode;
        }
        if ((i12 & 32) != 0) {
            i11 = pricingPhases.recurrenceMode;
        }
        long j11 = j10;
        String str4 = str2;
        return pricingPhases.copy(i10, str, str4, j11, str3, i11);
    }

    public final int component1() {
        return this.billingCycleCount;
    }

    @NotNull
    public final String component2() {
        return this.billingPeriod;
    }

    @NotNull
    public final String component3() {
        return this.formattedPrice;
    }

    public final long component4() {
        return this.priceAmountMicros;
    }

    @NotNull
    public final String component5() {
        return this.priceCurrencyCode;
    }

    public final int component6() {
        return this.recurrenceMode;
    }

    @NotNull
    public final PricingPhases copy(int i10, @NotNull String str, @NotNull String str2, long j10, @NotNull String str3, int i11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PricingPhases(i10, str, str2, j10, str3, i11);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricingPhases)) {
            return false;
        }
        PricingPhases pricingPhases = (PricingPhases) obj;
        return this.billingCycleCount == pricingPhases.billingCycleCount && Intrinsics.areEqual(this.billingPeriod, pricingPhases.billingPeriod) && Intrinsics.areEqual(this.formattedPrice, pricingPhases.formattedPrice) && this.priceAmountMicros == pricingPhases.priceAmountMicros && Intrinsics.areEqual(this.priceCurrencyCode, pricingPhases.priceCurrencyCode) && this.recurrenceMode == pricingPhases.recurrenceMode;
    }

    @i(name = "getBillingCycleCount")
    public final int getBillingCycleCount() {
        return this.billingCycleCount;
    }

    @i(name = "getBillingPeriod")
    @NotNull
    public final String getBillingPeriod() {
        return this.billingPeriod;
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

    @i(name = "getRecurrenceMode")
    public final int getRecurrenceMode() {
        return this.recurrenceMode;
    }

    public final int hashCode() {
        return (((((((((Integer.hashCode(this.billingCycleCount) * 31) + this.billingPeriod.hashCode()) * 31) + this.formattedPrice.hashCode()) * 31) + Long.hashCode(this.priceAmountMicros)) * 31) + this.priceCurrencyCode.hashCode()) * 31) + Integer.hashCode(this.recurrenceMode);
    }

    @NotNull
    public final Map<String, Object> toJsonMap() {
        return MapsKt.mutableMapOf(TuplesKt.to("billing_cycle_count", Integer.valueOf(this.billingCycleCount)), TuplesKt.to("billing_period", this.billingPeriod), TuplesKt.to("formatted_price", this.formattedPrice), TuplesKt.to("price_amount_micros", Long.valueOf(this.priceAmountMicros)), TuplesKt.to("price_currency_code", this.priceCurrencyCode), TuplesKt.to("recurrence_mode", Integer.valueOf(this.recurrenceMode)));
    }

    @NotNull
    public final String toString() {
        return "PricingPhases(billingCycleCount=" + this.billingCycleCount + ", billingPeriod=" + this.billingPeriod + ", formattedPrice=" + this.formattedPrice + ", priceAmountMicros=" + this.priceAmountMicros + ", priceCurrencyCode=" + this.priceCurrencyCode + ", recurrenceMode=" + this.recurrenceMode + ")";
    }
}
