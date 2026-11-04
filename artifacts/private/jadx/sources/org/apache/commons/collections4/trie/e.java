package org.apache.commons.collections4.trie;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.iterators.r0;
import org.apache.commons.collections4.k0;
import org.apache.commons.collections4.y0;

/* JADX INFO: loaded from: classes14.dex */
public class e<K, V> implements y0<K, V>, Serializable, a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f336380b = -7156426030315945159L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0<K, V> f336381a;

    /* JADX WARN: Multi-variable type inference failed */
    public e(y0<K, ? extends V> y0Var) {
        if (y0Var == 0) {
            throw new NullPointerException("Trie must not be null");
        }
        this.f336381a = y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> y0<K, V> a(y0<K, ? extends V> y0Var) {
        return y0Var instanceof a1 ? y0Var : new e(y0Var);
    }

    @Override // org.apache.commons.collections4.j0
    public K C3(K k10) {
        return this.f336381a.C3(k10);
    }

    @Override // org.apache.commons.collections4.j0
    public K E2(K k10) {
        return this.f336381a.E2(k10);
    }

    @Override // org.apache.commons.collections4.y0
    public SortedMap<K, V> a3(K k10) {
        return Collections.unmodifiableSortedMap(this.f336381a.a3(k10));
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return this.f336381a.comparator();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsKey(Object obj) {
        return this.f336381a.containsKey(obj);
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean containsValue(Object obj) {
        return this.f336381a.containsValue(obj);
    }

    @Override // java.util.SortedMap, java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        return Collections.unmodifiableSet(this.f336381a.entrySet());
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.f336381a.equals(obj);
    }

    @Override // java.util.SortedMap, org.apache.commons.collections4.j0
    public K firstKey() {
        return this.f336381a.firstKey();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public V get(Object obj) {
        return this.f336381a.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f336381a.hashCode();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k10) {
        return Collections.unmodifiableSortedMap(this.f336381a.headMap(k10));
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public boolean isEmpty() {
        return this.f336381a.isEmpty();
    }

    @Override // java.util.SortedMap, java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        return Collections.unmodifiableSet(this.f336381a.keySet());
    }

    @Override // java.util.SortedMap, org.apache.commons.collections4.j0
    public K lastKey() {
        return this.f336381a.lastKey();
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, org.apache.commons.collections4.r
    public int size() {
        return this.f336381a.size();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k10, K k11) {
        return Collections.unmodifiableSortedMap(this.f336381a.subMap(k10, k11));
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k10) {
        return Collections.unmodifiableSortedMap(this.f336381a.tailMap(k10));
    }

    public String toString() {
        return this.f336381a.toString();
    }

    @Override // java.util.SortedMap, java.util.Map, org.apache.commons.collections4.r
    public Collection<V> values() {
        return Collections.unmodifiableCollection(this.f336381a.values());
    }

    @Override // org.apache.commons.collections4.s
    public k0<K, V> T() {
        return r0.b(this.f336381a.T());
    }
}
