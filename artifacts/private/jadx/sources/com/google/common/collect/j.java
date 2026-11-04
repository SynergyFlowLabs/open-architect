package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
abstract class j<K, V> extends b8.a0<K, V> implements NavigableMap<K, V> {

    private final class b extends b8.q<K, V> {
        private b() {
        }

        @Override // com.google.common.collect.b8.q
        Iterator<Map.Entry<K, V>> f1() {
            return j.this.b();
        }

        @Override // com.google.common.collect.b8.q
        NavigableMap<K, V> i1() {
            return j.this;
        }
    }

    j() {
    }

    abstract Iterator<Map.Entry<K, V>> b();

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> ceilingEntry(@b9 K key) {
        return tailMap(key, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public K ceilingKey(@b9 K k10) {
        return (K) b8.T(ceilingEntry(k10));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public NavigableMap<K, V> descendingMap() {
        return new b();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) p7.I(a(), null);
    }

    @Override // java.util.SortedMap
    @b9
    public K firstKey() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> floorEntry(@b9 K key) {
        return headMap(key, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public K floorKey(@b9 K k10) {
        return (K) b8.T(floorEntry(k10));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @fj.a
    public abstract V get(@fj.a Object key);

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(@b9 K toKey) {
        return headMap(toKey, false);
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> higherEntry(@b9 K key) {
        return tailMap(key, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public K higherKey(@b9 K k10) {
        return (K) b8.T(higherEntry(k10));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) p7.I(b(), null);
    }

    @Override // java.util.SortedMap
    @b9
    public K lastKey() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> lowerEntry(@b9 K key) {
        return headMap(key, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public K lowerKey(@b9 K k10) {
        return (K) b8.T(lowerEntry(k10));
    }

    public NavigableSet<K> navigableKeySet() {
        return new b8.e0(this);
    }

    @fj.a
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) p7.T(a());
    }

    @fj.a
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) p7.T(b());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> subMap(@b9 K fromKey, @b9 K toKey) {
        return subMap(fromKey, true, toKey, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> tailMap(@b9 K fromKey) {
        return tailMap(fromKey, true);
    }
}
