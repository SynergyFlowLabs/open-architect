package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
abstract class d<K, V> extends e<K, V> implements w7<K, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f117283i = 6588350623831699109L;

    protected d(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.e
    <E> Collection<E> E(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.e
    Collection<V> F(@b9 K key, Collection<V> collection) {
        return G(key, (List) collection, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract List<V> u();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public List<V> z() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    public boolean equals(@fj.a Object object) {
        return super.equals(object);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    public Map<K, Collection<V>> l() {
        return super.l();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    public boolean put(@b9 K key, @b9 V value) {
        return super.put(key, value);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public List<V> c(@fj.a Object key) {
        return (List) super.c(key);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public List<V> d(@b9 K key, Iterable<? extends V> values) {
        return (List) super.d((Object) key, (Iterable) values);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.k8, com.google.common.collect.y9
    public List<V> get(@b9 K key) {
        return (List) super.get((Object) key);
    }
}
