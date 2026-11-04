package com.superwall.sdk.delegate.subscription_controller;

import com.android.billingclient.api.z;
import com.superwall.sdk.delegate.PurchaseResult;
import com.superwall.sdk.delegate.RestorationResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface PurchaseControllerJava {
    void purchase(@NotNull z zVar, @Nullable String str, @Nullable String str2, @NotNull Function1<? super PurchaseResult, Unit> function1);

    void restorePurchases(@NotNull Function2<? super RestorationResult, ? super Throwable, Unit> function2);
}
