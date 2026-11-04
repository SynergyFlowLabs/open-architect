package com.superwall.sdk.analytics;

import com.superwall.sdk.store.abstractions.transactions.StoreTransactionType;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface SessionEventsDelegate {
    @Nullable
    Object enqueue(@NotNull StoreTransactionType storeTransactionType, @NotNull d<? super Unit> dVar);
}
