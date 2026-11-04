package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@a4
public abstract class k5<K, V> extends q5<K, V> implements NavigableMap<K, V> {

    protected class a extends b8.q<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.k5$a$a, reason: collision with other inner class name */
        class C1062a implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @fj.a
            private Map.Entry<K, V> f117555a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @fj.a
            private Map.Entry<K, V> f117556b;

            C1062a() {
                int i10 = 0 << 0;
                this.f117556b = a.this.i1().lastEntry();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                Map.Entry<K, V> entry = this.f117556b;
                if (entry == null) {
                    throw new NoSuchElementException();
                }
                this.f117555a = entry;
                this.f117556b = a.this.i1().lowerEntry(this.f117556b.getKey());
                return entry;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f117556b != null;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.f117555a == null) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                a.this.i1().remove(this.f117555a.getKey());
                this.f117555a = null;
            }
        }

        public a() {
        }

        @Override // com.google.common.collect.b8.q
        protected Iterator<Map.Entry<K, V>> f1() {
            return new C1062a();
        }

        @Override // com.google.common.collect.b8.q
        NavigableMap<K, V> i1() {
            return k5.this;
        }
    }

    protected class b extends b8.e0<K, V> {
        public b() {
            super(k5.this);
        }
    }

    protected k5() {
    }

    @fj.a
    protected K A1(@b9 K k10) {
        return (K) b8.T(higherEntry(k10));
    }

    @fj.a
    protected Map.Entry<K, V> C1() {
        return (Map.Entry) o7.v(descendingMap().entrySet(), null);
    }

    protected K D1() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @fj.a
    protected Map.Entry<K, V> F1(@b9 K key) {
        return headMap(key, false).lastEntry();
    }

    @fj.a
    protected K G1(@b9 K k10) {
        return (K) b8.T(lowerEntry(k10));
    }

    @fj.a
    protected Map.Entry<K, V> H1() {
        return (Map.Entry) p7.T(entrySet().iterator());
    }

    @fj.a
    protected Map.Entry<K, V> I1() {
        return (Map.Entry) p7.T(descendingMap().entrySet().iterator());
    }

    protected SortedMap<K, V> K1(@b9 K fromKey) {
        return tailMap(fromKey, true);
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> ceilingEntry(@b9 K key) {
        return i1().ceilingEntry(key);
    }

    @Override // java.util.NavigableMap
    @fj.a
    public K ceilingKey(@b9 K key) {
        return i1().ceilingKey(key);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return i1().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return i1().descendingMap();
    }

    @Override // com.google.common.collect.q5
    protected SortedMap<K, V> f1(@b9 K fromKey, @b9 K toKey) {
        return subMap(fromKey, true, toKey, false);
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> firstEntry() {
        return i1().firstEntry();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> floorEntry(@b9 K key) {
        return i1().floorEntry(key);
    }

    @Override // java.util.NavigableMap
    @fj.a
    public K floorKey(@b9 K key) {
        return i1().floorKey(key);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(@b9 K toKey, boolean inclusive) {
        return i1().headMap(toKey, inclusive);
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> higherEntry(@b9 K key) {
        return i1().higherEntry(key);
    }

    @Override // java.util.NavigableMap
    @fj.a
    public K higherKey(@b9 K key) {
        return i1().higherKey(key);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.q5
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public abstract NavigableMap<K, V> i1();

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> lastEntry() {
        return i1().lastEntry();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> lowerEntry(@b9 K key) {
        return i1().lowerEntry(key);
    }

    @Override // java.util.NavigableMap
    @fj.a
    public K lowerKey(@b9 K key) {
        return i1().lowerKey(key);
    }

    @fj.a
    protected Map.Entry<K, V> m1(@b9 K key) {
        return tailMap(key, true).firstEntry();
    }

    @fj.a
    protected K n1(@b9 K k10) {
        return (K) b8.T(ceilingEntry(k10));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return i1().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> pollFirstEntry() {
        return i1().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    @fj.a
    public Map.Entry<K, V> pollLastEntry() {
        return i1().pollLastEntry();
    }

    protected NavigableSet<K> q1() {
        return descendingMap().navigableKeySet();
    }

    @fj.a
    protected Map.Entry<K, V> r1() {
        return (Map.Entry) o7.v(entrySet(), null);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(@b9 K fromKey, boolean fromInclusive, @b9 K toKey, boolean toInclusive) {
        return i1().subMap(fromKey, fromInclusive, toKey, toInclusive);
    }

    protected K t1() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(@b9 K fromKey, boolean inclusive) {
        return i1().tailMap(fromKey, inclusive);
    }

    @fj.a
    protected Map.Entry<K, V> v1(@b9 K key) {
        return headMap(key, true).lastEntry();
    }

    @fj.a
    protected K x1(@b9 K k10) {
        return (K) b8.T(floorEntry(k10));
    }

    protected SortedMap<K, V> y1(@b9 K toKey) {
        return headMap(toKey, false);
    }

    @fj.a
    protected Map.Entry<K, V> z1(@b9 K key) {
        return tailMap(key, false).firstEntry();
    }
}
