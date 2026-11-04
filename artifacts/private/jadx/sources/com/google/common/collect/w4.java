package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class w4<K, V> extends g5<K, V> implements ConcurrentMap<K, V> {
    protected w4() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.g5
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public abstract ConcurrentMap<K, V> L0();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @z7.a
    @fj.a
    public V putIfAbsent(K key, V value) {
        return L0().putIfAbsent(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @z7.a
    public boolean remove(@fj.a Object key, @fj.a Object value) {
        return L0().remove(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @z7.a
    @fj.a
    public V replace(K key, V value) {
        return L0().replace(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @z7.a
    public boolean replace(K key, V oldValue, V newValue) {
        return L0().replace(key, oldValue, newValue);
    }
}
