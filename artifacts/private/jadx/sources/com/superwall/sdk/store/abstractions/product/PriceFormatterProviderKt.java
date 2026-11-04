package com.superwall.sdk.store.abstractions.product;

import java.text.NumberFormat;
import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PriceFormatterProviderKt {
    @Nullable
    public static final String getCurrencyCode(@NotNull NumberFormat numberFormat) {
        Intrinsics.checkNotNullParameter(numberFormat, "<this>");
        Currency currency = numberFormat.getCurrency();
        if (currency != null) {
            return currency.getCurrencyCode();
        }
        return null;
    }

    public static final void setCurrencyCode(@NotNull NumberFormat numberFormat, @Nullable String str) {
        Intrinsics.checkNotNullParameter(numberFormat, "<this>");
        Currency currency = null;
        if (str != null) {
            try {
                currency = Currency.getInstance(str);
            } catch (Throwable unused) {
            }
        }
        numberFormat.setCurrency(currency);
    }
}
