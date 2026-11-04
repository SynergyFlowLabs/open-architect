package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@a4
@com.google.common.annotations.b
abstract class m<K, V> extends e<K, V> implements y9<K, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f117676i = 7431625294878419160L;

    protected m(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.e
    <E> Collection<E> E(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.e
    Collection<V> F(@b9 K key, Collection<V> collection) {
        return new e.n(key, (Set) collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract Set<V> u();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Set<V> z() {
        return Collections.EMPTY_SET;
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
    public Set<V> c(@fj.a Object key) {
        return (Set) super.c(key);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public Set<V> d(@b9 K key, Iterable<? extends V> values) {
        return (Set) super.d((Object) key, (Iterable) values);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.k8, com.google.common.collect.y9
    public Set<V> get(@b9 K key) {
        return (Set) super.get((Object) key);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    public Set<Map.Entry<K, V>> k() {
        return (Set) super.k();
    }
}
