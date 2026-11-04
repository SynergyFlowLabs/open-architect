package com.appsflyer.internal;

import android.content.Intent;
import androidx.annotation.m1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface AFh1uSDK {
    void getCurrencyIso4217Code(@NotNull AFh1rSDK aFh1rSDK);

    void getMediationNetwork();

    @m1
    void getMediationNetwork(@NotNull AFh1rSDK aFh1rSDK);

    @m1
    void getMonetizationNetwork(@NotNull AFh1rSDK aFh1rSDK);

    boolean getMonetizationNetwork();

    @m1
    void getRevenue(@NotNull AFf1uSDK aFf1uSDK, @NotNull Function0<Unit> function0);

    boolean getRevenue();

    void u_(@NotNull Intent intent, @NotNull AFa1oSDK aFa1oSDK);
}
