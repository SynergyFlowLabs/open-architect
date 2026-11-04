package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public interface ja<K, V> extends y9<K, V> {
    @fj.a
    Comparator<? super V> Y();

    @Override // com.google.common.collect.y9, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    SortedSet<V> c(@fj.a Object key);

    @Override // com.google.common.collect.y9, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    SortedSet<V> d(@b9 K key, Iterable<? extends V> values);

    @Override // com.google.common.collect.y9, com.google.common.collect.k8, com.google.common.collect.y9
    SortedSet<V> get(@b9 K key);

    @Override // com.google.common.collect.y9, com.google.common.collect.k8, com.google.common.collect.w7
    Map<K, Collection<V>> l();
}
