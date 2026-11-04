package com.google.common.cache;

import com.google.common.collect.b8;
import com.google.common.collect.n6;
import com.google.common.util.concurrent.d3;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@i
public abstract class b<K, V> extends a<K, V> implements m<K, V> {
    protected b() {
    }

    @Override // com.google.common.cache.m
    public void G0(K key) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.m, com.google.common.base.t
    public final V apply(K key) {
        return v0(key);
    }

    @Override // com.google.common.cache.m
    @z7.a
    public V v0(K key) {
        try {
            return get(key);
        } catch (ExecutionException e10) {
            throw new d3(e10.getCause());
        }
    }

    @Override // com.google.common.cache.m
    public n6<K, V> z0(Iterable<? extends K> keys) throws ExecutionException {
        LinkedHashMap linkedHashMapC0 = b8.c0();
        for (K k10 : keys) {
            if (!linkedHashMapC0.containsKey(k10)) {
                linkedHashMapC0.put(k10, get(k10));
            }
        }
        return n6.g(linkedHashMapC0);
    }
}
