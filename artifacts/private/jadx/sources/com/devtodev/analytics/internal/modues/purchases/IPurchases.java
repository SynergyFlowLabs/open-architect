package com.devtodev.analytics.internal.modues.purchases;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IPurchases {
    void autoPayment(@NotNull String str, double d10, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i10);

    void autoPurchaseIsInitialized();

    void isNeedRestoreHistory(@NotNull Function1<? super Boolean, Unit> function1);

    void isRestoreTransactionHistoryRequired(@NotNull Function1<? super Boolean, Unit> function1);

    void realCurrencyPayment(@NotNull String str, double d10, @NotNull String str2, @NotNull String str3);

    void subscriptionHistory(@NotNull List<String> list);

    void subscriptionPayment(@NotNull String str, double d10, @NotNull String str2, @NotNull String str3);
}
