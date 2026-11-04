package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@a4
@com.google.common.annotations.b
public interface y9<K, V> extends k8<K, V> {
    @Override // 
    @z7.a
    Set<V> c(@fj.a Object key);

    @Override // 
    @z7.a
    Set<V> d(@b9 K key, Iterable<? extends V> values);

    @Override // com.google.common.collect.k8, com.google.common.collect.w7
    boolean equals(@fj.a Object obj);

    @Override // 
    Set<V> get(@b9 K key);

    @Override // 
    Set<Map.Entry<K, V>> k();

    @Override // com.google.common.collect.k8, com.google.common.collect.w7
    Map<K, Collection<V>> l();
}
