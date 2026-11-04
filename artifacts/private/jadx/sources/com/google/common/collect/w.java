package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@a4
@com.google.common.annotations.b
public interface w<K, V> extends Map<K, V> {
    @z7.a
    @fj.a
    V L2(@b9 K key, @b9 V value);

    w<V, K> Y2();

    @z7.a
    @fj.a
    V put(@b9 K key, @b9 V value);

    void putAll(Map<? extends K, ? extends V> map);

    @Override // com.google.common.collect.w
    Set<V> values();
}
