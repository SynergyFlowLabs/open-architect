package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class i5<K, V> extends m5 implements k8<K, V> {
    protected i5() {
    }

    @Override // com.google.common.collect.k8
    public boolean I0(@fj.a Object key, @fj.a Object value) {
        return i1().I0(key, value);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.m5
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public abstract k8<K, V> i1();

    @Override // com.google.common.collect.k8
    @z7.a
    public boolean R(k8<? extends K, ? extends V> multimap) {
        return i1().R(multimap);
    }

    @z7.a
    public Collection<V> c(@fj.a Object key) {
        return i1().c(key);
    }

    @Override // com.google.common.collect.k8
    public void clear() {
        i1().clear();
    }

    @Override // com.google.common.collect.k8
    public boolean containsKey(@fj.a Object key) {
        return i1().containsKey(key);
    }

    @Override // com.google.common.collect.k8
    public boolean containsValue(@fj.a Object value) {
        return i1().containsValue(value);
    }

    @z7.a
    public Collection<V> d(@b9 K key, Iterable<? extends V> values) {
        return i1().d(key, values);
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.w7
    public boolean equals(@fj.a Object object) {
        return object == this || i1().equals(object);
    }

    /* JADX INFO: renamed from: get */
    public Collection<V> x(@b9 K key) {
        return i1().x(key);
    }

    @Override // com.google.common.collect.k8
    public int hashCode() {
        return i1().hashCode();
    }

    @Override // com.google.common.collect.k8
    public boolean isEmpty() {
        return i1().isEmpty();
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: k */
    public Collection<Map.Entry<K, V>> u() {
        return i1().u();
    }

    @Override // com.google.common.collect.k8
    public Set<K> keySet() {
        return i1().keySet();
    }

    @Override // com.google.common.collect.k8
    public q8<K> keys() {
        return i1().keys();
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.w7
    public Map<K, Collection<V>> l() {
        return i1().l();
    }

    @Override // com.google.common.collect.k8
    @z7.a
    public boolean put(@b9 K key, @b9 V value) {
        return i1().put(key, value);
    }

    @Override // com.google.common.collect.k8
    @z7.a
    public boolean remove(@fj.a Object key, @fj.a Object value) {
        return i1().remove(key, value);
    }

    @Override // com.google.common.collect.k8
    public int size() {
        return i1().size();
    }

    @Override // com.google.common.collect.k8
    @z7.a
    public boolean v(@b9 K key, Iterable<? extends V> values) {
        return i1().v(key, values);
    }

    @Override // com.google.common.collect.k8
    public Collection<V> values() {
        return i1().values();
    }
}
