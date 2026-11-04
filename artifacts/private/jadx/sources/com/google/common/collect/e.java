package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@a4
@com.google.common.annotations.b
abstract class e<K, V> extends com.google.common.collect.h<K, V> implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f117305h = 2447537837011683357L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient Map<K, Collection<V>> f117306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int f117307g;

    /* JADX INFO: loaded from: classes5.dex */
    class a extends e<K, V>.d<V> {
        a() {
            super();
        }

        @Override // com.google.common.collect.e.d
        @b9
        V b(@b9 K key, @b9 V value) {
            return value;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    class b extends e<K, V>.d<Map.Entry<K, V>> {
        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.e.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(@b9 K key, @b9 V value) {
            return b8.O(key, value);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    private class c extends b8.r0<K, Collection<V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final transient Map<K, Collection<V>> f117310d;

        class a extends b8.s<K, Collection<V>> {
            a() {
            }

            @Override // com.google.common.collect.b8.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@fj.a Object o10) {
                return b3.j(c.this.f117310d.entrySet(), o10);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // com.google.common.collect.b8.s
            Map<K, Collection<V>> l() {
                return c.this;
            }

            @Override // com.google.common.collect.b8.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@fj.a Object o10) {
                if (!contains(o10)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) o10;
                Objects.requireNonNull(entry);
                e.this.C(entry.getKey());
                return true;
            }
        }

        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f117313a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @fj.a
            Collection<V> f117314b;

            b() {
                this.f117313a = c.this.f117310d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f117313a.next();
                this.f117314b = next.getValue();
                return c.this.f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f117313a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.j0.h0(this.f117314b != null, "no calls to next() since the last call to remove()");
                this.f117313a.remove();
                e.r(e.this, this.f117314b.size());
                this.f117314b.clear();
                this.f117314b = null;
            }
        }

        c(Map<K, Collection<V>> submap) {
            this.f117310d = submap;
        }

        @Override // com.google.common.collect.b8.r0
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f117310d == e.this.f117306f) {
                e.this.clear();
            } else {
                p7.g(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return b8.o0(this.f117310d, key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@fj.a Object key) {
            Collection<V> collection = (Collection) b8.p0(this.f117310d, key);
            if (collection != null) {
                return e.this.F(key, collection);
            }
            int i10 = 3 ^ 0;
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@fj.a Object key) {
            Collection<V> collectionRemove = this.f117310d.remove(key);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionU = e.this.u();
            collectionU.addAll(collectionRemove);
            e.r(e.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionU;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@fj.a Object object) {
            if (this != object && !this.f117310d.equals(object)) {
                return false;
            }
            return true;
        }

        Map.Entry<K, Collection<V>> f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return b8.O(key, e.this.F(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f117310d.hashCode();
        }

        @Override // com.google.common.collect.b8.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: keySet */
        public Set<K> h() {
            return e.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f117310d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f117310d.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    private abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f117316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        K f117317b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        Collection<V> f117318c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Iterator<V> f117319d = p7.v();

        d() {
            this.f117316a = e.this.f117306f.entrySet().iterator();
        }

        abstract T b(@b9 K key, @b9 V value);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f117316a.hasNext() && !this.f117319d.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        @b9
        public T next() {
            if (!this.f117319d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f117316a.next();
                this.f117317b = next.getKey();
                Collection<V> value = next.getValue();
                this.f117318c = value;
                this.f117319d = value.iterator();
            }
            return b(u8.a(this.f117317b), this.f117319d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f117319d.remove();
            Collection<V> collection = this.f117318c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f117316a.remove();
            }
            e.p(e.this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.e$e, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes5.dex */
    private class C1057e extends b8.b0<K, Collection<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.e$e$a */
        class a implements Iterator<K> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @fj.a
            Map.Entry<K, Collection<V>> f117322a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f117323b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1057e f117324c;

            a(final C1057e this$1, final Iterator val$entryIterator) {
                this.f117323b = val$entryIterator;
                this.f117324c = this$1;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f117323b.hasNext();
            }

            @Override // java.util.Iterator
            @b9
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f117323b.next();
                this.f117322a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.j0.h0(this.f117322a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f117322a.getValue();
                this.f117323b.remove();
                e.r(e.this, value.size());
                value.clear();
                this.f117322a = null;
            }
        }

        C1057e(final Map<K, Collection<V>> subMap) {
            super(subMap);
        }

        @Override // com.google.common.collect.b8.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            p7.g(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> c10) {
            return m().keySet().containsAll(c10);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@fj.a Object object) {
            return this == object || m().keySet().equals(object);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return m().keySet().hashCode();
        }

        @Override // com.google.common.collect.b8.b0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this, m().entrySet().iterator());
        }

        @Override // com.google.common.collect.b8.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object key) {
            int size;
            Collection<V> collectionRemove = m().remove(key);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                e.r(e.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    private final class f extends e<K, V>.i implements NavigableMap<K, Collection<V>> {
        f(NavigableMap<K, Collection<V>> submap) {
            super(submap);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, Collection<V>> ceilingEntry(@b9 K key) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = i().ceilingEntry(key);
            if (entryCeilingEntry == null) {
                return null;
            }
            return f(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K ceilingKey(@b9 K key) {
            return i().ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(i().descendingMap());
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = i().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return f(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, Collection<V>> floorEntry(@b9 K key) {
            Map.Entry<K, Collection<V>> entryFloorEntry = i().floorEntry(key);
            if (entryFloorEntry == null) {
                return null;
            }
            return f(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K floorKey(@b9 K key) {
            return i().floorKey(key);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, Collection<V>> higherEntry(@b9 K key) {
            Map.Entry<K, Collection<V>> entryHigherEntry = i().higherEntry(key);
            if (entryHigherEntry == null) {
                return null;
            }
            return f(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K higherKey(@b9 K key) {
            return i().higherKey(key);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.e.i
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> g() {
            return new g(i());
        }

        @Override // com.google.common.collect.e.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(@b9 K toKey) {
            return headMap(toKey, false);
        }

        @fj.a
        Map.Entry<K, Collection<V>> l(Iterator<Map.Entry<K, Collection<V>>> entryIterator) {
            if (!entryIterator.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = entryIterator.next();
            Collection<V> collectionU = e.this.u();
            collectionU.addAll(next.getValue());
            entryIterator.remove();
            return b8.O(next.getKey(), e.this.E(collectionU));
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = i().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return f(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, Collection<V>> lowerEntry(@b9 K key) {
            Map.Entry<K, Collection<V>> entryLowerEntry = i().lowerEntry(key);
            if (entryLowerEntry == null) {
                return null;
            }
            return f(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K lowerKey(@b9 K key) {
            return i().lowerKey(key);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.e.i
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> i() {
            return (NavigableMap) super.i();
        }

        @Override // com.google.common.collect.e.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(@b9 K fromKey, @b9 K toKey) {
            int i10 = 3 ^ 0;
            return subMap(fromKey, true, toKey, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return h();
        }

        @Override // com.google.common.collect.e.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(@b9 K fromKey) {
            return tailMap(fromKey, true);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(@b9 K toKey, boolean inclusive) {
            return new f(i().headMap(toKey, inclusive));
        }

        @Override // com.google.common.collect.e.i, com.google.common.collect.e.c, com.google.common.collect.b8.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> h() {
            return (NavigableSet) super.h();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(@b9 K fromKey, boolean fromInclusive, @b9 K toKey, boolean toInclusive) {
            return new f(i().subMap(fromKey, fromInclusive, toKey, toInclusive));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(@b9 K fromKey, boolean inclusive) {
            return new f(i().tailMap(fromKey, inclusive));
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    private final class g extends e<K, V>.j implements NavigableSet<K> {
        g(NavigableMap<K, Collection<V>> subMap) {
            super(subMap);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public K ceiling(@b9 K k10) {
            return m().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(m().descendingMap());
        }

        @Override // java.util.NavigableSet
        @fj.a
        public K floor(@b9 K k10) {
            return m().floorKey(k10);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public K higher(@b9 K k10) {
            return m().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public K lower(@b9 K k10) {
            return m().lowerKey(k10);
        }

        @Override // com.google.common.collect.e.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(@b9 K toElement) {
            return headSet(toElement, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.e.j
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> m() {
            return (NavigableMap) super.m();
        }

        @Override // java.util.NavigableSet
        @fj.a
        public K pollFirst() {
            return (K) p7.T(iterator());
        }

        @Override // java.util.NavigableSet
        @fj.a
        public K pollLast() {
            return (K) p7.T(descendingIterator());
        }

        @Override // com.google.common.collect.e.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(@b9 K fromElement, @b9 K toElement) {
            return subSet(fromElement, true, toElement, false);
        }

        @Override // com.google.common.collect.e.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(@b9 K fromElement) {
            return tailSet(fromElement, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@b9 K toElement, boolean inclusive) {
            return new g(m().headMap(toElement, inclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@b9 K fromElement, boolean fromInclusive, @b9 K toElement, boolean toInclusive) {
            return new g(m().subMap(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@b9 K fromElement, boolean inclusive) {
            return new g(m().tailMap(fromElement, inclusive));
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    private class h extends e<K, V>.l implements RandomAccess {
        h(K key, @fj.a List<V> delegate, e<K, V>.k ancestor) {
            super(key, delegate, ancestor);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    private class i extends e<K, V>.c implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @fj.a
        SortedSet<K> f117328f;

        i(SortedMap<K, Collection<V>> submap) {
            super(submap);
        }

        @Override // java.util.SortedMap
        @fj.a
        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedMap
        @b9
        public K firstKey() {
            return i().firstKey();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.b8.r0
        public SortedSet<K> g() {
            return new j(i());
        }

        @Override // com.google.common.collect.e.c, com.google.common.collect.b8.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public SortedSet<K> h() {
            SortedSet<K> sortedSetG = this.f117328f;
            if (sortedSetG == null) {
                sortedSetG = g();
                this.f117328f = sortedSetG;
            }
            return sortedSetG;
        }

        public SortedMap<K, Collection<V>> headMap(@b9 K toKey) {
            return new i(i().headMap(toKey));
        }

        SortedMap<K, Collection<V>> i() {
            return (SortedMap) this.f117310d;
        }

        @Override // java.util.SortedMap
        @b9
        public K lastKey() {
            return i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(@b9 K fromKey, @b9 K toKey) {
            return new i(i().subMap(fromKey, toKey));
        }

        public SortedMap<K, Collection<V>> tailMap(@b9 K fromKey) {
            return new i(i().tailMap(fromKey));
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    private class j extends e<K, V>.C1057e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> subMap) {
            super(subMap);
        }

        @Override // java.util.SortedSet
        @fj.a
        public Comparator<? super K> comparator() {
            return m().comparator();
        }

        @Override // java.util.SortedSet
        @b9
        public K first() {
            return m().firstKey();
        }

        public SortedSet<K> headSet(@b9 K toElement) {
            return new j(m().headMap(toElement));
        }

        @Override // java.util.SortedSet
        @b9
        public K last() {
            return m().lastKey();
        }

        SortedMap<K, Collection<V>> m() {
            return (SortedMap) super.m();
        }

        public SortedSet<K> subSet(@b9 K fromElement, @b9 K toElement) {
            return new j(m().subMap(fromElement, toElement));
        }

        public SortedSet<K> tailSet(@b9 K fromElement) {
            return new j(m().tailMap(fromElement));
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    class m extends e<K, V>.o implements NavigableSet<V> {
        m(K key, @fj.a NavigableSet<V> delegate, e<K, V>.k ancestor) {
            super(key, delegate, ancestor);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [com.google.common.collect.e$k] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4 */
        private NavigableSet<V> s(NavigableSet<V> navigableSet) {
            e eVar = e.this;
            K k10 = this.f117331a;
            e<K, V>.k kVarI = i();
            ?? I = this;
            if (kVarI != null) {
                I = i();
            }
            return new m(k10, navigableSet, I);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public V ceiling(@b9 V v10) {
            return p().ceiling(v10);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new k.a(p().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return s(p().descendingSet());
        }

        @Override // java.util.NavigableSet
        @fj.a
        public V floor(@b9 V v10) {
            return p().floor(v10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(@b9 V toElement, boolean inclusive) {
            return s(p().headSet(toElement, inclusive));
        }

        @Override // java.util.NavigableSet
        @fj.a
        public V higher(@b9 V v10) {
            return p().higher(v10);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public V lower(@b9 V v10) {
            return p().lower(v10);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public V pollFirst() {
            return (V) p7.T(iterator());
        }

        @Override // java.util.NavigableSet
        @fj.a
        public V pollLast() {
            return (V) p7.T(descendingIterator());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.e.o
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> p() {
            return (NavigableSet) super.p();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(@b9 V fromElement, boolean fromInclusive, @b9 V toElement, boolean toInclusive) {
            return s(p().subSet(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(@b9 V fromElement, boolean inclusive) {
            return s(p().tailSet(fromElement, inclusive));
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    class n extends e<K, V>.k implements Set<V> {
        n(K key, Set<V> delegate) {
            super(key, delegate, null);
        }

        @Override // com.google.common.collect.e.k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> c10) {
            if (c10.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zI = z9.I((Set) this.f117332b, c10);
            if (zI) {
                e.q(e.this, this.f117332b.size() - size);
                n();
            }
            return zI;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    class o extends e<K, V>.k implements SortedSet<V> {
        o(K key, @fj.a SortedSet<V> delegate, e<K, V>.k ancestor) {
            super(key, delegate, ancestor);
        }

        @Override // java.util.SortedSet
        @fj.a
        public Comparator<? super V> comparator() {
            return p().comparator();
        }

        @Override // java.util.SortedSet
        @b9
        public V first() {
            m();
            return p().first();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [com.google.common.collect.e$k] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4 */
        @Override // java.util.SortedSet
        public SortedSet<V> headSet(@b9 V v10) {
            m();
            e eVar = e.this;
            Object objL = l();
            SortedSet<V> sortedSetHeadSet = p().headSet(v10);
            e<K, V>.k kVarI = i();
            ?? I = this;
            if (kVarI != null) {
                I = i();
            }
            return new o(objL, sortedSetHeadSet, I);
        }

        @Override // java.util.SortedSet
        @b9
        public V last() {
            m();
            return p().last();
        }

        SortedSet<V> p() {
            return (SortedSet) k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [com.google.common.collect.e$k] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4 */
        @Override // java.util.SortedSet
        public SortedSet<V> subSet(@b9 V v10, @b9 V v11) {
            m();
            e eVar = e.this;
            Object objL = l();
            SortedSet<V> sortedSetSubSet = p().subSet(v10, v11);
            e<K, V>.k kVarI = i();
            ?? I = this;
            if (kVarI != null) {
                I = i();
            }
            return new o(objL, sortedSetSubSet, I);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v2, types: [com.google.common.collect.e$k] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4 */
        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(@b9 V v10) {
            m();
            return new o(l(), p().tailSet(v10), i() == null ? this : i());
        }
    }

    protected e(Map<K, Collection<V>> map) {
        com.google.common.base.j0.d(map.isEmpty());
        this.f117306f = map;
    }

    private Collection<V> A(@b9 K key) {
        Collection<V> collection = this.f117306f.get(key);
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionW = w(key);
        this.f117306f.put(key, collectionW);
        return collectionW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> B(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(@fj.a Object key) {
        Collection collection = (Collection) b8.q0(this.f117306f, key);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f117307g -= size;
        }
    }

    static /* synthetic */ int o(e eVar) {
        int i10 = eVar.f117307g;
        eVar.f117307g = i10 + 1;
        return i10;
    }

    static /* synthetic */ int p(e eVar) {
        int i10 = eVar.f117307g;
        eVar.f117307g = i10 - 1;
        return i10;
    }

    static /* synthetic */ int q(e eVar, int i10) {
        int i11 = eVar.f117307g + i10;
        eVar.f117307g = i11;
        return i11;
    }

    static /* synthetic */ int r(e eVar, int i10) {
        int i11 = eVar.f117307g - i10;
        eVar.f117307g = i11;
        return i11;
    }

    final void D(Map<K, Collection<V>> map) {
        this.f117306f = map;
        this.f117307g = 0;
        for (Collection<V> collection : map.values()) {
            com.google.common.base.j0.d(!collection.isEmpty());
            this.f117307g += collection.size();
        }
    }

    <E> Collection<E> E(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    Collection<V> F(@b9 K key, Collection<V> collection) {
        return new k(key, collection, null);
    }

    final List<V> G(@b9 K key, List<V> list, @fj.a e<K, V>.k ancestor) {
        return list instanceof RandomAccess ? new h(key, list, ancestor) : new l(key, list, ancestor);
    }

    @Override // com.google.common.collect.h
    Map<K, Collection<V>> a() {
        return new c(this.f117306f);
    }

    @Override // com.google.common.collect.h
    Collection<Map.Entry<K, V>> b() {
        return this instanceof y9 ? new com.google.common.collect.h.b() : new com.google.common.collect.h.a();
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    public Collection<V> c(@fj.a Object obj) {
        Collection<V> collectionRemove = this.f117306f.remove(obj);
        if (collectionRemove == null) {
            return z();
        }
        Collection collectionU = u();
        collectionU.addAll(collectionRemove);
        this.f117307g -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) E(collectionU);
    }

    @Override // com.google.common.collect.k8
    public void clear() {
        Iterator<Collection<V>> it = this.f117306f.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f117306f.clear();
        this.f117307g = 0;
    }

    @Override // com.google.common.collect.k8
    public boolean containsKey(@fj.a Object key) {
        return this.f117306f.containsKey(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    public Collection<V> d(@b9 K k10, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return c(k10);
        }
        Collection<V> collectionA = A(k10);
        Collection<V> collectionU = u();
        collectionU.addAll(collectionA);
        this.f117307g -= collectionA.size();
        collectionA.clear();
        while (it.hasNext()) {
            if (collectionA.add(it.next())) {
                this.f117307g++;
            }
        }
        return (Collection<V>) E(collectionU);
    }

    @Override // com.google.common.collect.h
    Set<K> e() {
        return new C1057e(this.f117306f);
    }

    @Override // com.google.common.collect.h
    q8<K> f() {
        return new n8.g(this);
    }

    @Override // com.google.common.collect.h
    Collection<V> g() {
        return new com.google.common.collect.h.c();
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: get */
    public Collection<V> x(@b9 K key) {
        Collection<V> collectionW = this.f117306f.get(key);
        if (collectionW == null) {
            collectionW = w(key);
        }
        return F(key, collectionW);
    }

    @Override // com.google.common.collect.h
    Iterator<Map.Entry<K, V>> h() {
        return new b();
    }

    @Override // com.google.common.collect.h
    Iterator<V> i() {
        return new a();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: k */
    public Collection<Map.Entry<K, V>> u() {
        return super.u();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public boolean put(@b9 K key, @b9 V value) {
        Collection<V> collection = this.f117306f.get(key);
        if (collection != null) {
            if (!collection.add(value)) {
                return false;
            }
            this.f117307g++;
            return true;
        }
        Collection<V> collectionW = w(key);
        if (!collectionW.add(value)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f117307g++;
        this.f117306f.put(key, collectionW);
        return true;
    }

    @Override // com.google.common.collect.k8
    public int size() {
        return this.f117307g;
    }

    Map<K, Collection<V>> t() {
        return this.f117306f;
    }

    abstract Collection<V> u();

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public Collection<V> values() {
        return super.values();
    }

    Collection<V> w(@b9 K key) {
        return u();
    }

    final Map<K, Collection<V>> x() {
        Map<K, Collection<V>> map = this.f117306f;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f117306f);
        }
        return map instanceof SortedMap ? new i((SortedMap) this.f117306f) : new c(this.f117306f);
    }

    final Set<K> y() {
        Map<K, Collection<V>> map = this.f117306f;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.f117306f);
        }
        return map instanceof SortedMap ? new j((SortedMap) this.f117306f) : new C1057e(this.f117306f);
    }

    Collection<V> z() {
        return (Collection<V>) E(u());
    }

    /* JADX INFO: loaded from: classes5.dex */
    class k extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        final K f117331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Collection<V> f117332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        final e<K, V>.k f117333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        final Collection<V> f117334d;

        k(K key, @fj.a Collection<V> delegate, e<K, V>.k ancestor) {
            this.f117331a = key;
            this.f117332b = delegate;
            this.f117333c = ancestor;
            this.f117334d = ancestor == null ? null : ancestor.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@b9 V value) {
            m();
            boolean zIsEmpty = this.f117332b.isEmpty();
            boolean zAdd = this.f117332b.add(value);
            if (zAdd) {
                e.o(e.this);
                if (zIsEmpty) {
                    c();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f117332b.addAll(collection);
            if (zAddAll) {
                e.q(e.this, this.f117332b.size() - size);
                if (size == 0) {
                    c();
                }
            }
            return zAddAll;
        }

        void c() {
            e<K, V>.k kVar = this.f117333c;
            if (kVar != null) {
                kVar.c();
            } else {
                e.this.f117306f.put(this.f117331a, this.f117332b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f117332b.clear();
            e.r(e.this, size);
            n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@fj.a Object o10) {
            m();
            return this.f117332b.contains(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> c10) {
            m();
            return this.f117332b.containsAll(c10);
        }

        @Override // java.util.Collection
        public boolean equals(@fj.a Object object) {
            if (object == this) {
                return true;
            }
            m();
            return this.f117332b.equals(object);
        }

        @Override // java.util.Collection
        public int hashCode() {
            m();
            return this.f117332b.hashCode();
        }

        @fj.a
        e<K, V>.k i() {
            return this.f117333c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m();
            return new a();
        }

        Collection<V> k() {
            return this.f117332b;
        }

        @b9
        K l() {
            return this.f117331a;
        }

        void m() {
            Collection<V> collection;
            e<K, V>.k kVar = this.f117333c;
            if (kVar != null) {
                kVar.m();
                if (this.f117333c.k() != this.f117334d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f117332b.isEmpty() || (collection = (Collection) e.this.f117306f.get(this.f117331a)) == null) {
                    return;
                }
                this.f117332b = collection;
            }
        }

        void n() {
            e<K, V>.k kVar = this.f117333c;
            if (kVar != null) {
                kVar.n();
            } else {
                if (this.f117332b.isEmpty()) {
                    e.this.f117306f.remove(this.f117331a);
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@fj.a Object o10) {
            m();
            boolean zRemove = this.f117332b.remove(o10);
            if (zRemove) {
                e.p(e.this);
                n();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> c10) {
            if (c10.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f117332b.removeAll(c10);
            if (zRemoveAll) {
                e.q(e.this, this.f117332b.size() - size);
                n();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> c10) {
            com.google.common.base.j0.E(c10);
            int size = size();
            boolean zRetainAll = this.f117332b.retainAll(c10);
            if (zRetainAll) {
                e.q(e.this, this.f117332b.size() - size);
                n();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m();
            return this.f117332b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m();
            return this.f117332b.toString();
        }

        class a implements Iterator<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator<V> f117336a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Collection<V> f117337b;

            a() {
                Collection<V> collection = k.this.f117332b;
                this.f117337b = collection;
                this.f117336a = e.B(collection);
            }

            Iterator<V> b() {
                c();
                return this.f117336a;
            }

            void c() {
                k.this.m();
                if (k.this.f117332b != this.f117337b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                c();
                return this.f117336a.hasNext();
            }

            @Override // java.util.Iterator
            @b9
            public V next() {
                c();
                return this.f117336a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f117336a.remove();
                e.p(e.this);
                k.this.n();
            }

            a(Iterator<V> delegateIterator) {
                this.f117337b = k.this.f117332b;
                this.f117336a = delegateIterator;
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    class l extends e<K, V>.k implements List<V> {

        private class a extends e<K, V>.k.a implements ListIterator<V> {
            a() {
                super();
            }

            private ListIterator<V> d() {
                return (ListIterator) b();
            }

            @Override // java.util.ListIterator
            public void add(@b9 V value) {
                boolean zIsEmpty = l.this.isEmpty();
                d().add(value);
                e.o(e.this);
                if (zIsEmpty) {
                    l.this.c();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return d().nextIndex();
            }

            @Override // java.util.ListIterator
            @b9
            public V previous() {
                return d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(@b9 V value) {
                d().set(value);
            }

            public a(int index) {
                super(l.this.p().listIterator(index));
            }
        }

        l(K key, @fj.a List<V> delegate, e<K, V>.k ancestor) {
            super(key, delegate, ancestor);
        }

        @Override // java.util.List
        public void add(int index, @b9 V element) {
            m();
            boolean zIsEmpty = k().isEmpty();
            p().add(index, element);
            e.o(e.this);
            if (zIsEmpty) {
                c();
            }
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends V> c10) {
            if (c10.isEmpty()) {
                int i10 = 5 ^ 0;
                return false;
            }
            int size = size();
            boolean zAddAll = p().addAll(index, c10);
            if (zAddAll) {
                e.q(e.this, k().size() - size);
                if (size == 0) {
                    c();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        @b9
        public V get(int index) {
            m();
            return p().get(index);
        }

        @Override // java.util.List
        public int indexOf(@fj.a Object o10) {
            m();
            return p().indexOf(o10);
        }

        @Override // java.util.List
        public int lastIndexOf(@fj.a Object o10) {
            m();
            return p().lastIndexOf(o10);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m();
            return new a();
        }

        List<V> p() {
            return (List) k();
        }

        @Override // java.util.List
        @b9
        public V remove(int index) {
            m();
            V vRemove = p().remove(index);
            e.p(e.this);
            n();
            return vRemove;
        }

        @Override // java.util.List
        @b9
        public V set(int index, @b9 V element) {
            m();
            return p().set(index, element);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.e] */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.collect.e$k] */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            m();
            ?? r10 = e.this;
            Object objL = l();
            List<V> listSubList = p().subList(i10, i11);
            e<K, V>.k kVarI = i();
            ?? I = this;
            if (kVarI != null) {
                I = i();
            }
            return r10.G(objL, listSubList, I);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int index) {
            m();
            return new a(index);
        }
    }
}
