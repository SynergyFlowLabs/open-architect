package com.google.common.cache;

import com.google.common.collect.n6;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
@i
@com.google.common.annotations.b
public interface m<K, V> extends c<K, V>, com.google.common.base.t<K, V> {
    void G0(K key);

    @Override // com.google.common.base.t
    @Deprecated
    V apply(K key);

    @z7.a
    V get(K key) throws ExecutionException;

    @Override // com.google.common.cache.c
    ConcurrentMap<K, V> l();

    @z7.a
    V v0(K key);

    @z7.a
    n6<K, V> z0(Iterable<? extends K> keys) throws ExecutionException;
}
