package com.devtodev.analytics.internal.services.purchases;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IPurchasesService {
    boolean isAutoPaymentMarked(@NotNull String str);

    boolean isCurrencyPaymentMarked(@NotNull String str);

    void markAutoPayment(@NotNull String str);

    void markCurrencyPayment(@NotNull String str);
}
