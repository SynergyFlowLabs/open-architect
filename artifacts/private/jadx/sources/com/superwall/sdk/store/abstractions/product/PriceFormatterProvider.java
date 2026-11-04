package com.superwall.sdk.store.abstractions.product;

import java.text.NumberFormat;
import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPriceFormatterProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PriceFormatterProvider.kt\ncom/superwall/sdk/store/abstractions/product/PriceFormatterProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class PriceFormatterProvider {

    @Nullable
    private NumberFormat cachedPriceFormatter;

    private final Currency currency(String str) {
        try {
            return Currency.getInstance(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final NumberFormat makePriceFormatter(String str) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        Intrinsics.checkNotNull(currencyInstance);
        PriceFormatterProviderKt.setCurrencyCode(currencyInstance, str);
        Intrinsics.checkNotNullExpressionValue(currencyInstance, "also(...)");
        return currencyInstance;
    }

    @NotNull
    public final NumberFormat priceFormatter(@NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Currency currency = currency(currencyCode);
        NumberFormat numberFormat = this.cachedPriceFormatter;
        if (numberFormat != null) {
            if (!Intrinsics.areEqual(numberFormat.getCurrency(), currency)) {
                numberFormat = null;
            }
            if (numberFormat != null) {
                return numberFormat;
            }
        }
        NumberFormat numberFormatMakePriceFormatter = makePriceFormatter(currencyCode);
        this.cachedPriceFormatter = numberFormatMakePriceFormatter;
        return numberFormatMakePriceFormatter;
    }
}
