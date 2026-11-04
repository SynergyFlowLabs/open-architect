package com.superwall.sdk.delegate.subscription_controller;

import android.app.Activity;
import androidx.annotation.l0;
import com.android.billingclient.api.z;
import com.superwall.sdk.delegate.PurchaseResult;
import com.superwall.sdk.delegate.RestorationResult;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface PurchaseController {
    @l0
    @Nullable
    Object purchase(@NotNull Activity activity, @NotNull z zVar, @Nullable String str, @Nullable String str2, @NotNull d<? super PurchaseResult> dVar);

    @l0
    @Nullable
    Object restorePurchases(@NotNull d<? super RestorationResult> dVar);
}
