package com.superwall.sdk.storage.memory;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PerpetualCache<K, V> implements GenericCache<K, V> {

    @NotNull
    private final HashMap<K, V> cache = new HashMap<>();

    @Override // com.superwall.sdk.storage.memory.GenericCache
    public void clear() {
        this.cache.clear();
    }

    @Override // com.superwall.sdk.storage.memory.GenericCache
    @Nullable
    public V get(K k10) {
        return this.cache.get(k10);
    }

    @Override // com.superwall.sdk.storage.memory.GenericCache
    public int getSize() {
        return this.cache.size();
    }

    @Override // com.superwall.sdk.storage.memory.GenericCache
    @Nullable
    public V remove(K k10) {
        return this.cache.remove(k10);
    }

    @Override // com.superwall.sdk.storage.memory.GenericCache
    public void set(K k10, V v10) {
        this.cache.put(k10, v10);
    }
}
