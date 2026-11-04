package com.superwall.sdk.storage.memory;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface GenericCache<K, V> {
    void clear();

    @Nullable
    V get(K k10);

    int getSize();

    @Nullable
    V remove(K k10);

    void set(K k10, V v10);
}
