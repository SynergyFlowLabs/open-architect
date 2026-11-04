package org.apache.commons.collections4;

import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public interface e<K, V> extends t<K, V> {
    e<V, K> N();

    K N2(Object obj);

    @Override // java.util.Map, org.apache.commons.collections4.n0
    V put(K k10, V v10);

    @Override // java.util.Map, org.apache.commons.collections4.r
    Set<V> values();

    K w2(Object obj);
}
