package com.appsflyer.internal;

import androidx.annotation.m1;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface AFc1aSDK {
    @m1
    @Nullable
    String AFAdRevenueData(@NotNull Throwable th2, @NotNull String str);

    @m1
    void AFAdRevenueData(int i10, int i11);

    @m1
    int getCurrencyIso4217Code();

    @m1
    @NotNull
    List<AFc1cSDK> getMediationNetwork();

    @m1
    boolean getMonetizationNetwork();

    @m1
    boolean getRevenue(@NotNull String... strArr);
}
