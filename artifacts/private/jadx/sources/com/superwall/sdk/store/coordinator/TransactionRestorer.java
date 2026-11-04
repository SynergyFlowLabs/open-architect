package com.superwall.sdk.store.coordinator;

import com.superwall.sdk.delegate.RestorationResult;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface TransactionRestorer {
    @Nullable
    Object restorePurchases(@NotNull d<? super RestorationResult> dVar);
}
