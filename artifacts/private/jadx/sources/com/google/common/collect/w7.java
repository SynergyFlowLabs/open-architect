package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public interface w7<K, V> extends k8<K, V> {
    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    List<V> c(@fj.a Object key);

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    List<V> d(@b9 K key, Iterable<? extends V> values);

    boolean equals(@fj.a Object obj);

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    List<V> get(@b9 K key);

    Map<K, Collection<V>> l();
}
