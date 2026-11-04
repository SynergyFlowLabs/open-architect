package com.superwall.sdk.store.coordinator;

import com.superwall.sdk.store.abstractions.product.StoreProduct;
import java.util.Set;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ProductsFetcher {
    @Nullable
    Object products(@NotNull Set<String> set, @NotNull d<? super Set<StoreProduct>> dVar);
}
