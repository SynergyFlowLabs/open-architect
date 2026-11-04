package com.google.common.collect;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class f5<K, V> extends i5<K, V> implements w7<K, V> {
    protected f5() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.i5
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public abstract w7<K, V> i1();

    @Override // com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public List<V> c(@fj.a Object key) {
        return i1().c(key);
    }

    @Override // com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public List<V> d(@b9 K key, Iterable<? extends V> values) {
        return i1().d((Object) key, (Iterable) values);
    }

    @Override // com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: get */
    public List<V> x(@b9 K key) {
        return i1().x((Object) key);
    }
}
