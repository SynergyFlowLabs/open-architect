package com.google.common.cache;

import com.google.common.collect.n6;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
@i
@z7.f("Use CacheBuilder.newBuilder().build()")
@com.google.common.annotations.b
public interface c<K, V> {
    void D(@z7.c("K") Object key);

    void L();

    @z7.a
    V O(K key, Callable<? extends V> loader) throws ExecutionException;

    @z7.a
    @fj.a
    V h0(@z7.c("K") Object key);

    void i0(Iterable<? extends Object> keys);

    ConcurrentMap<K, V> l();

    void p0();

    void put(K key, V value);

    void putAll(Map<? extends K, ? extends V> m10);

    n6<K, V> s0(Iterable<? extends Object> keys);

    long size();

    h t0();
}
