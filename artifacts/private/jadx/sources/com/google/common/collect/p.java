package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
abstract class p<K, V> extends m<K, V> implements ja<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f117921j = 430848587173315748L;

    protected p(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e
    Collection<V> F(@b9 K key, Collection<V> collection) {
        return collection instanceof NavigableSet ? new e.m(key, (NavigableSet) collection, null) : new e.o(key, (SortedSet) collection, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.m, com.google.common.collect.e
    /* JADX INFO: renamed from: J */
    public abstract SortedSet<V> u();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.m, com.google.common.collect.e
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public SortedSet<V> z() {
        return (SortedSet<V>) E(u());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.m, com.google.common.collect.e
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public <E> SortedSet<E> E(Collection<E> collection) {
        return collection instanceof NavigableSet ? z9.P((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    public Map<K, Collection<V>> l() {
        return super.l();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public SortedSet<V> c(@fj.a Object key) {
        return (SortedSet) super.c(key);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public SortedSet<V> d(@b9 K key, Iterable<? extends V> values) {
        return (SortedSet) super.d((Object) key, (Iterable) values);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: get */
    public SortedSet<V> x(@b9 K key) {
        return (SortedSet) super.x((Object) key);
    }
}
