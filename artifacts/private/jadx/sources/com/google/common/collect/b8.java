package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public final class b8 {

    /* JADX INFO: Add missing generic type declarations: [V1, V2] */
    class a<V1, V2> implements com.google.common.base.t<V1, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f117121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f117122b;

        a(final t val$transformer, final Object val$key) {
            this.f117121a = val$transformer;
            this.f117122b = val$key;
        }

        @Override // com.google.common.base.t
        @b9
        public V2 apply(@b9 V1 v10) {
            return (V2) this.f117121a.a(this.f117122b, v10);
        }
    }

    static abstract class a0<K, V> extends AbstractMap<K, V> {

        class a extends s<K, V> {
            a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return a0.this.a();
            }

            @Override // com.google.common.collect.b8.s
            Map<K, V> l() {
                return a0.this;
            }
        }

        a0() {
        }

        abstract Iterator<Map.Entry<K, V>> a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            p7.g(a());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    class b<K, V1, V2> implements com.google.common.base.t<Map.Entry<K, V1>, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f117124a;

        b(final t val$transformer) {
            this.f117124a = val$transformer;
        }

        @Override // com.google.common.base.t
        @b9
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public V2 apply(Map.Entry<K, V1> entry) {
            return (V2) this.f117124a.a(entry.getKey(), entry.getValue());
        }
    }

    static class b0<K, V> extends z9.k<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @r9.m
        final Map<K, V> f117125a;

        b0(Map<K, V> map) {
            this.f117125a = (Map) com.google.common.base.j0.E(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            m().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            return m().containsKey(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return m().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return b8.S(m().entrySet().iterator());
        }

        /* JADX INFO: renamed from: l */
        Map<K, V> m() {
            return this.f117125a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object o10) {
            if (!contains(o10)) {
                return false;
            }
            m().remove(o10);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m().size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    class c<K, V2> extends com.google.common.collect.g<K, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map.Entry f117126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f117127b;

        c(final Map.Entry val$entry, final t val$transformer) {
            this.f117126a = val$entry;
            this.f117127b = val$transformer;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public K getKey() {
            return (K) this.f117126a.getKey();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public V2 getValue() {
            return (V2) this.f117127b.a(this.f117126a.getKey(), this.f117126a.getValue());
        }
    }

    static class c0<K, V> implements y7<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V> f117128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<K, V> f117129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map<K, V> f117130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Map<K, y7.a<V>> f117131d;

        c0(Map<K, V> onlyOnLeft, Map<K, V> onlyOnRight, Map<K, V> onBoth, Map<K, y7.a<V>> differences) {
            this.f117128a = b8.N0(onlyOnLeft);
            this.f117129b = b8.N0(onlyOnRight);
            this.f117130c = b8.N0(onBoth);
            this.f117131d = b8.N0(differences);
        }

        @Override // com.google.common.collect.y7
        public Map<K, y7.a<V>> a() {
            return this.f117131d;
        }

        @Override // com.google.common.collect.y7
        public Map<K, V> b() {
            return this.f117129b;
        }

        @Override // com.google.common.collect.y7
        public Map<K, V> c() {
            return this.f117128a;
        }

        @Override // com.google.common.collect.y7
        public Map<K, V> d() {
            return this.f117130c;
        }

        @Override // com.google.common.collect.y7
        public boolean e() {
            return this.f117128a.isEmpty() && this.f117129b.isEmpty() && this.f117131d.isEmpty();
        }

        @Override // com.google.common.collect.y7
        public boolean equals(@fj.a Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof y7) {
                y7 y7Var = (y7) object;
                if (c().equals(y7Var.c()) && b().equals(y7Var.b()) && d().equals(y7Var.d()) && a().equals(y7Var.a())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.y7
        public int hashCode() {
            return com.google.common.base.d0.b(c(), b(), d(), a());
        }

        public String toString() {
            if (e()) {
                return "equal";
            }
            StringBuilder sb2 = new StringBuilder("not equal");
            if (!this.f117128a.isEmpty()) {
                sb2.append(": only on left=");
                sb2.append(this.f117128a);
            }
            if (!this.f117129b.isEmpty()) {
                sb2.append(": only on right=");
                sb2.append(this.f117129b);
            }
            if (!this.f117131d.isEmpty()) {
                sb2.append(": value differences=");
                sb2.append(this.f117131d);
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    class d<K, V1, V2> implements com.google.common.base.t<Map.Entry<K, V1>, Map.Entry<K, V2>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f117132a;

        d(final t val$transformer) {
            this.f117132a = val$transformer;
        }

        @Override // com.google.common.base.t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V2> apply(final Map.Entry<K, V1> entry) {
            return b8.C0(this.f117132a, entry);
        }
    }

    @com.google.common.annotations.c
    private static final class d0<K, V> extends com.google.common.collect.j<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NavigableSet<K> f117133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.common.base.t<? super K, V> f117134b;

        d0(NavigableSet<K> ks, com.google.common.base.t<? super K, V> vFunction) {
            this.f117133a = (NavigableSet) com.google.common.base.j0.E(ks);
            this.f117134b = (com.google.common.base.t) com.google.common.base.j0.E(vFunction);
        }

        @Override // com.google.common.collect.b8.a0
        Iterator<Map.Entry<K, V>> a() {
            return b8.m(this.f117133a, this.f117134b);
        }

        @Override // com.google.common.collect.j
        Iterator<Map.Entry<K, V>> b() {
            return descendingMap().entrySet().iterator();
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f117133a.clear();
        }

        @Override // java.util.SortedMap
        @fj.a
        public Comparator<? super K> comparator() {
            return this.f117133a.comparator();
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return b8.k(this.f117133a.descendingSet(), this.f117134b);
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @fj.a
        public V get(@fj.a Object key) {
            if (b3.j(this.f117133a, key)) {
                return this.f117134b.apply(key);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@b9 K toKey, boolean inclusive) {
            return b8.k(this.f117133a.headSet(toKey, inclusive), this.f117134b);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return b8.l0(this.f117133a);
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f117133a.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@b9 K fromKey, boolean fromInclusive, @b9 K toKey, boolean toInclusive) {
            return b8.k(this.f117133a.subSet(fromKey, fromInclusive, toKey, toInclusive), this.f117134b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@b9 K fromKey, boolean inclusive) {
            return b8.k(this.f117133a.tailSet(fromKey, inclusive), this.f117134b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    class e<K, V> extends eb<Map.Entry<K, V>, K> {
        e(Iterator backingIterator) {
            super(backingIterator);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.eb
        @b9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K b(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    @com.google.common.annotations.c
    static class e0<K, V> extends g0<K, V> implements NavigableSet<K> {
        e0(NavigableMap<K, V> map) {
            super(map);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public K ceiling(@b9 K e10) {
            return l().ceilingKey(e10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return l().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        @fj.a
        public K floor(@b9 K e10) {
            return l().floorKey(e10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@b9 K toElement, boolean inclusive) {
            return l().headMap(toElement, inclusive).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        @fj.a
        public K higher(@b9 K e10) {
            return l().higherKey(e10);
        }

        @Override // java.util.NavigableSet
        @fj.a
        public K lower(@b9 K e10) {
            return l().lowerKey(e10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.b8.g0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> m() {
            return (NavigableMap) this.f117125a;
        }

        @Override // java.util.NavigableSet
        @fj.a
        public K pollFirst() {
            return (K) b8.T(l().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @fj.a
        public K pollLast() {
            return (K) b8.T(l().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@b9 K fromElement, boolean fromInclusive, @b9 K toElement, boolean toInclusive) {
            return l().subMap(fromElement, fromInclusive, toElement, toInclusive).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@b9 K fromElement, boolean inclusive) {
            return l().tailMap(fromElement, inclusive).navigableKeySet();
        }

        @Override // com.google.common.collect.b8.g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(@b9 K toElement) {
            return headSet(toElement, false);
        }

        @Override // com.google.common.collect.b8.g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(@b9 K fromElement, @b9 K toElement) {
            return subSet(fromElement, true, toElement, false);
        }

        @Override // com.google.common.collect.b8.g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(@b9 K fromElement) {
            return tailSet(fromElement, true);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    class f<K, V> extends eb<Map.Entry<K, V>, V> {
        f(Iterator backingIterator) {
            super(backingIterator);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.eb
        @b9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public V b(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    private static class f0<K, V> extends o<K, V> implements SortedMap<K, V> {
        f0(SortedSet<K> set, com.google.common.base.t<? super K, V> function) {
            super(set, function);
        }

        @Override // java.util.SortedMap
        @fj.a
        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.b8.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> d() {
            return (SortedSet) super.d();
        }

        @Override // java.util.SortedMap
        @b9
        public K firstKey() {
            return d().first();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@b9 K toKey) {
            return b8.l(d().headSet(toKey), this.f117153e);
        }

        @Override // com.google.common.collect.b8.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: keySet */
        public Set<K> h() {
            return b8.n0(d());
        }

        @Override // java.util.SortedMap
        @b9
        public K lastKey() {
            return d().last();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@b9 K fromKey, @b9 K toKey) {
            return b8.l(d().subSet(fromKey, toKey), this.f117153e);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@b9 K fromKey) {
            return b8.l(d().tailSet(fromKey), this.f117153e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    class g<K, V> extends eb<K, Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.t f117135b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Iterator backingIterator, final com.google.common.base.t val$function) {
            super(backingIterator);
            this.f117135b = val$function;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.eb
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(@b9 final K key) {
            return b8.O(key, this.f117135b.apply(key));
        }
    }

    static class g0<K, V> extends b0<K, V> implements SortedSet<K> {
        g0(SortedMap<K, V> map) {
            super(map);
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
            return new g0(m().headMap(toElement));
        }

        @Override // java.util.SortedSet
        @b9
        public K last() {
            return m().lastKey();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.b8.b0
        public SortedMap<K, V> m() {
            return (SortedMap) super.m();
        }

        public SortedSet<K> subSet(@b9 K fromElement, @b9 K toElement) {
            return new g0(m().subMap(fromElement, toElement));
        }

        public SortedSet<K> tailSet(@b9 K fromElement) {
            return new g0(m().tailMap(fromElement));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class h<E> extends o5<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f117136a;

        h(final Set val$set) {
            this.f117136a = val$set;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean add(@b9 E element) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends E> es) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.o5, com.google.common.collect.v4
        public Set<E> i1() {
            return this.f117136a;
        }
    }

    static class h0<K, V> extends c0<K, V> implements fa<K, V> {
        h0(SortedMap<K, V> onlyOnLeft, SortedMap<K, V> onlyOnRight, SortedMap<K, V> onBoth, SortedMap<K, y7.a<V>> differences) {
            super(onlyOnLeft, onlyOnRight, onBoth, differences);
        }

        @Override // com.google.common.collect.b8.c0, com.google.common.collect.y7
        public SortedMap<K, y7.a<V>> a() {
            return (SortedMap) super.a();
        }

        @Override // com.google.common.collect.b8.c0, com.google.common.collect.y7
        public SortedMap<K, V> b() {
            return (SortedMap) super.b();
        }

        @Override // com.google.common.collect.b8.c0, com.google.common.collect.y7
        public SortedMap<K, V> c() {
            return (SortedMap) super.c();
        }

        @Override // com.google.common.collect.b8.c0, com.google.common.collect.y7
        public SortedMap<K, V> d() {
            return (SortedMap) super.d();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class i<E> extends s5<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SortedSet f117137a;

        i(final SortedSet val$set) {
            this.f117137a = val$set;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean add(@b9 E element) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends E> es) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.s5, java.util.SortedSet
        public SortedSet<E> headSet(@b9 E toElement) {
            return b8.n0(super.headSet(toElement));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.s5, com.google.common.collect.o5
        /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedSet<E> i1() {
            return this.f117137a;
        }

        @Override // com.google.common.collect.s5, java.util.SortedSet
        public SortedSet<E> subSet(@b9 E fromElement, @b9 E toElement) {
            return b8.n0(super.subSet(fromElement, toElement));
        }

        @Override // com.google.common.collect.s5, java.util.SortedSet
        public SortedSet<E> tailSet(@b9 E fromElement) {
            return b8.n0(super.tailSet(fromElement));
        }
    }

    static class i0<K, V1, V2> extends a0<K, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V1> f117138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final t<? super K, ? super V1, V2> f117139b;

        i0(Map<K, V1> fromMap, t<? super K, ? super V1, V2> transformer) {
            this.f117138a = (Map) com.google.common.base.j0.E(fromMap);
            this.f117139b = (t) com.google.common.base.j0.E(transformer);
        }

        @Override // com.google.common.collect.b8.a0
        Iterator<Map.Entry<K, V2>> a() {
            return p7.b0(this.f117138a.entrySet().iterator(), b8.g(this.f117139b));
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f117138a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return this.f117138a.containsKey(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V2 get(@fj.a Object obj) {
            V1 v10 = this.f117138a.get(obj);
            if (v10 == null && !this.f117138a.containsKey(obj)) {
                return null;
            }
            return this.f117139b.a(obj, (Object) u8.a(v10));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f117138a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V2 remove(@fj.a Object obj) {
            if (this.f117138a.containsKey(obj)) {
                return this.f117139b.a(obj, (Object) u8.a(this.f117138a.remove(obj)));
            }
            return null;
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f117138a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new q0(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class j<E> extends l5<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NavigableSet f117140a;

        j(final NavigableSet val$set) {
            this.f117140a = val$set;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean add(@b9 E element) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends E> es) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return b8.l0(super.descendingSet());
        }

        @Override // com.google.common.collect.s5, java.util.SortedSet
        public SortedSet<E> headSet(@b9 E toElement) {
            return b8.n0(super.headSet(toElement));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.l5, com.google.common.collect.s5
        /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> L0() {
            return this.f117140a;
        }

        @Override // com.google.common.collect.s5, java.util.SortedSet
        public SortedSet<E> subSet(@b9 E fromElement, @b9 E toElement) {
            return b8.n0(super.subSet(fromElement, toElement));
        }

        @Override // com.google.common.collect.s5, java.util.SortedSet
        public SortedSet<E> tailSet(@b9 E fromElement) {
            return b8.n0(super.tailSet(fromElement));
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        public NavigableSet<E> headSet(@b9 E toElement, boolean inclusive) {
            return b8.l0(super.headSet(toElement, inclusive));
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        public NavigableSet<E> subSet(@b9 E fromElement, boolean fromInclusive, @b9 E toElement, boolean toInclusive) {
            return b8.l0(super.subSet(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // com.google.common.collect.l5, java.util.NavigableSet
        public NavigableSet<E> tailSet(@b9 E fromElement, boolean inclusive) {
            return b8.l0(super.tailSet(fromElement, inclusive));
        }
    }

    @com.google.common.annotations.c
    private static class j0<K, V1, V2> extends k0<K, V1, V2> implements NavigableMap<K, V2> {
        j0(NavigableMap<K, V1> fromMap, t<? super K, ? super V1, V2> transformer) {
            super(fromMap, transformer);
        }

        @fj.a
        private Map.Entry<K, V2> g(@fj.a Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return b8.C0(this.f117139b, entry);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.b8.k0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V1> b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V2> ceilingEntry(@b9 K key) {
            return g(b().ceilingEntry(key));
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K ceilingKey(@b9 K key) {
            return b().ceilingKey(key);
        }

        @Override // com.google.common.collect.b8.k0, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> headMap(@b9 K toKey) {
            return headMap(toKey, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
            return b8.A0(b().descendingMap(), this.f117139b);
        }

        @Override // com.google.common.collect.b8.k0, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> subMap(@b9 K fromKey, @b9 K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // com.google.common.collect.b8.k0, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> tailMap(@b9 K fromKey) {
            return tailMap(fromKey, true);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V2> firstEntry() {
            return g(b().firstEntry());
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V2> floorEntry(@b9 K key) {
            return g(b().floorEntry(key));
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K floorKey(@b9 K key) {
            return b().floorKey(key);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V2> higherEntry(@b9 K key) {
            return g(b().higherEntry(key));
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K higherKey(@b9 K key) {
            return b().higherKey(key);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V2> lastEntry() {
            return g(b().lastEntry());
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V2> lowerEntry(@b9 K key) {
            return g(b().lowerEntry(key));
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K lowerKey(@b9 K key) {
            return b().lowerKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V2> pollFirstEntry() {
            return g(b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V2> pollLastEntry() {
            return g(b().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(@b9 K toKey, boolean inclusive) {
            return b8.A0(b().headMap(toKey, inclusive), this.f117139b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(@b9 K fromKey, boolean fromInclusive, @b9 K toKey, boolean toInclusive) {
            return b8.A0(b().subMap(fromKey, fromInclusive, toKey, toInclusive), this.f117139b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(@b9 K fromKey, boolean inclusive) {
            return b8.A0(b().tailMap(fromKey, inclusive), this.f117139b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    class k<K, V> extends com.google.common.collect.g<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map.Entry f117141a;

        k(final Map.Entry val$entry) {
            this.f117141a = val$entry;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public K getKey() {
            return (K) this.f117141a.getKey();
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @b9
        public V getValue() {
            return (V) this.f117141a.getValue();
        }
    }

    static class k0<K, V1, V2> extends i0<K, V1, V2> implements SortedMap<K, V2> {
        k0(SortedMap<K, V1> fromMap, t<? super K, ? super V1, V2> transformer) {
            super(fromMap, transformer);
        }

        protected SortedMap<K, V1> b() {
            return (SortedMap) this.f117138a;
        }

        @Override // java.util.SortedMap
        @fj.a
        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedMap
        @b9
        public K firstKey() {
            return b().firstKey();
        }

        public SortedMap<K, V2> headMap(@b9 K toKey) {
            return b8.B0(b().headMap(toKey), this.f117139b);
        }

        @Override // java.util.SortedMap
        @b9
        public K lastKey() {
            return b().lastKey();
        }

        public SortedMap<K, V2> subMap(@b9 K fromKey, @b9 K toKey) {
            return b8.B0(b().subMap(fromKey, toKey), this.f117139b);
        }

        public SortedMap<K, V2> tailMap(@b9 K fromKey) {
            return b8.B0(b().tailMap(fromKey), this.f117139b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    class l<K, V> extends nb<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f117142a;

        l(final Iterator val$entryIterator) {
            this.f117142a = val$entryIterator;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return b8.K0((Map.Entry) this.f117142a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f117142a.hasNext();
        }
    }

    private static class l0<K, V> extends g5<K, V> implements com.google.common.collect.w<K, V>, Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f117143e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V> f117144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.common.collect.w<? extends K, ? extends V> f117145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @a8.b
        @r9.j
        @fj.a
        com.google.common.collect.w<V, K> f117146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @a8.b
        @fj.a
        transient Set<V> f117147d;

        l0(com.google.common.collect.w<? extends K, ? extends V> delegate, @fj.a com.google.common.collect.w<V, K> inverse) {
            this.f117144a = Collections.unmodifiableMap(delegate);
            this.f117145b = delegate;
            this.f117146c = inverse;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.g5, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
        public Map<K, V> i1() {
            return this.f117144a;
        }

        @Override // com.google.common.collect.w
        @fj.a
        public V L2(@b9 K key, @b9 V value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.w
        public com.google.common.collect.w<V, K> Y2() {
            com.google.common.collect.w<V, K> wVar = this.f117146c;
            if (wVar != null) {
                return wVar;
            }
            l0 l0Var = new l0(this.f117145b.Y2(), this);
            this.f117146c = l0Var;
            return l0Var;
        }

        @Override // com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
        public Set<V> values() {
            Set<V> setUnmodifiableSet = this.f117147d;
            if (setUnmodifiableSet == null) {
                setUnmodifiableSet = Collections.unmodifiableSet(this.f117145b.values());
                this.f117147d = setUnmodifiableSet;
            }
            return setUnmodifiableSet;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    class m<K, V1, V2> implements t<K, V1, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.t f117148a;

        m(final com.google.common.base.t val$function) {
            this.f117148a = val$function;
        }

        @Override // com.google.common.collect.b8.t
        @b9
        public V2 a(@b9 K k10, @b9 V1 v10) {
            return (V2) this.f117148a.apply(v10);
        }
    }

    static class m0<K, V> extends v4<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Collection<Map.Entry<K, V>> f117149a;

        m0(Collection<Map.Entry<K, V>> entries) {
            this.f117149a = entries;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.v4, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0 */
        public Collection<Map.Entry<K, V>> i1() {
            return this.f117149a;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return b8.L0(this.f117149a.iterator());
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return a1();
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) c1(tArr);
        }
    }

    private static abstract class n<K, V> extends r0<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Map<K, V> f117150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final com.google.common.base.k0<? super Map.Entry<K, V>> f117151e;

        n(Map<K, V> unfiltered, com.google.common.base.k0<? super Map.Entry<K, V>> predicate) {
            this.f117150d = unfiltered;
            this.f117151e = predicate;
        }

        @Override // com.google.common.collect.b8.r0
        Collection<V> c() {
            return new z(this, this.f117150d, this.f117151e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return this.f117150d.containsKey(key) && d(key, this.f117150d.get(key));
        }

        boolean d(@fj.a Object key, @b9 V value) {
            return this.f117151e.apply(b8.O(key, value));
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V get(@fj.a Object key) {
            V v10 = this.f117150d.get(key);
            if (v10 == null || !d(key, v10)) {
                return null;
            }
            return v10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V put(@b9 K key, @b9 V value) {
            com.google.common.base.j0.d(d(key, value));
            return this.f117150d.put(key, value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                com.google.common.base.j0.d(d(entry.getKey(), entry.getValue()));
            }
            this.f117150d.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V remove(@fj.a Object key) {
            if (containsKey(key)) {
                return this.f117150d.remove(key);
            }
            return null;
        }
    }

    static class n0<K, V> extends m0<K, V> implements Set<Map.Entry<K, V>> {
        n0(Set<Map.Entry<K, V>> entries) {
            super(entries);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@fj.a Object object) {
            return z9.g(this, object);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return z9.k(this);
        }
    }

    private static class o<K, V> extends r0<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set<K> f117152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final com.google.common.base.t<? super K, V> f117153e;

        class a extends s<K, V> {
            a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return b8.m(o.this.d(), o.this.f117153e);
            }

            @Override // com.google.common.collect.b8.s
            Map<K, V> l() {
                return o.this;
            }
        }

        o(Set<K> set, com.google.common.base.t<? super K, V> function) {
            this.f117152d = (Set) com.google.common.base.j0.E(set);
            this.f117153e = (com.google.common.base.t) com.google.common.base.j0.E(function);
        }

        @Override // com.google.common.collect.b8.r0
        protected Set<Map.Entry<K, V>> a() {
            return new a();
        }

        @Override // com.google.common.collect.b8.r0
        /* JADX INFO: renamed from: b */
        public Set<K> g() {
            return b8.m0(d());
        }

        @Override // com.google.common.collect.b8.r0
        Collection<V> c() {
            return b3.m(this.f117152d, this.f117153e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return d().contains(key);
        }

        Set<K> d() {
            return this.f117152d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V get(@fj.a Object key) {
            if (b3.j(d(), key)) {
                return this.f117153e.apply(key);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V remove(@fj.a Object key) {
            if (d().remove(key)) {
                return this.f117153e.apply(key);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return d().size();
        }
    }

    @com.google.common.annotations.c
    static class o0<K, V> extends q5<K, V> implements NavigableMap<K, V>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NavigableMap<K, ? extends V> f117155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @a8.b
        @fj.a
        private transient o0<K, V> f117156b;

        o0(NavigableMap<K, ? extends V> delegate) {
            this.f117155a = delegate;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.q5, com.google.common.collect.g5
        /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
        public SortedMap<K, V> i1() {
            return Collections.unmodifiableSortedMap(this.f117155a);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> ceilingEntry(@b9 K key) {
            return b8.P0(this.f117155a.ceilingEntry(key));
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K ceilingKey(@b9 K key) {
            return this.f117155a.ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return z9.P(this.f117155a.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            o0<K, V> o0Var = this.f117156b;
            if (o0Var == null) {
                o0Var = new o0<>(this.f117155a.descendingMap(), this);
                this.f117156b = o0Var;
            }
            return o0Var;
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> firstEntry() {
            return b8.P0(this.f117155a.firstEntry());
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> floorEntry(@b9 K key) {
            return b8.P0(this.f117155a.floorEntry(key));
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K floorKey(@b9 K key) {
            return this.f117155a.floorKey(key);
        }

        @Override // com.google.common.collect.q5, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(@b9 K toKey) {
            return headMap(toKey, false);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> higherEntry(@b9 K key) {
            return b8.P0(this.f117155a.higherEntry(key));
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K higherKey(@b9 K key) {
            return this.f117155a.higherKey(key);
        }

        @Override // com.google.common.collect.g5, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> lastEntry() {
            return b8.P0(this.f117155a.lastEntry());
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> lowerEntry(@b9 K key) {
            return b8.P0(this.f117155a.lowerEntry(key));
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K lowerKey(@b9 K key) {
            return this.f117155a.lowerKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return z9.P(this.f117155a.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        @fj.a
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        @fj.a
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q5, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(@b9 K fromKey, @b9 K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // com.google.common.collect.q5, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(@b9 K fromKey) {
            return tailMap(fromKey, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@b9 K toKey, boolean inclusive) {
            return b8.O0(this.f117155a.headMap(toKey, inclusive));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@b9 K fromKey, boolean fromInclusive, @b9 K toKey, boolean toInclusive) {
            return b8.O0(this.f117155a.subMap(fromKey, fromInclusive, toKey, toInclusive));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@b9 K fromKey, boolean inclusive) {
            return b8.O0(this.f117155a.tailMap(fromKey, inclusive));
        }

        o0(NavigableMap<K, ? extends V> delegate, o0<K, V> descendingMap) {
            this.f117155a = delegate;
            this.f117156b = descendingMap;
        }
    }

    private static final class p<A, B> extends com.google.common.base.i<A, B> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f117157d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.common.collect.w<A, B> f117158c;

        p(com.google.common.collect.w<A, B> bimap) {
            this.f117158c = (com.google.common.collect.w) com.google.common.base.j0.E(bimap);
        }

        private static <X, Y> Y o(com.google.common.collect.w<X, Y> bimap, X input) {
            Y y10 = bimap.get(input);
            com.google.common.base.j0.u(y10 != null, "No non-null mapping present for input: %s", input);
            return y10;
        }

        @Override // com.google.common.base.i, com.google.common.base.t
        public boolean equals(@fj.a Object object) {
            if (object instanceof p) {
                return this.f117158c.equals(((p) object).f117158c);
            }
            return false;
        }

        @Override // com.google.common.base.i
        protected A g(B b10) {
            return (A) o(this.f117158c.Y2(), b10);
        }

        @Override // com.google.common.base.i
        protected B h(A a10) {
            return (B) o(this.f117158c, a10);
        }

        public int hashCode() {
            return this.f117158c.hashCode();
        }

        public String toString() {
            return "Maps.asConverter(" + this.f117158c + ")";
        }
    }

    static class p0<V> implements y7.a<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        private final V f117159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @b9
        private final V f117160b;

        private p0(@b9 V left, @b9 V right) {
            this.f117159a = left;
            this.f117160b = right;
        }

        static <V> y7.a<V> c(@b9 V left, @b9 V right) {
            return new p0(left, right);
        }

        @Override // com.google.common.collect.y7.a
        @b9
        public V a() {
            return this.f117159a;
        }

        @Override // com.google.common.collect.y7.a
        @b9
        public V b() {
            return this.f117160b;
        }

        @Override // com.google.common.collect.y7.a
        public boolean equals(@fj.a Object object) {
            if (object instanceof y7.a) {
                y7.a aVar = (y7.a) object;
                if (com.google.common.base.d0.a(this.f117159a, aVar.a()) && com.google.common.base.d0.a(this.f117160b, aVar.b())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.y7.a
        public int hashCode() {
            return com.google.common.base.d0.b(this.f117159a, this.f117160b);
        }

        public String toString() {
            return "(" + this.f117159a + ", " + this.f117160b + ")";
        }
    }

    @com.google.common.annotations.c
    static abstract class q<K, V> extends g5<K, V> implements NavigableMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @a8.b
        @fj.a
        private transient Comparator<? super K> f117161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @a8.b
        @fj.a
        private transient Set<Map.Entry<K, V>> f117162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @a8.b
        @fj.a
        private transient NavigableSet<K> f117163c;

        class a extends s<K, V> {
            a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return q.this.f1();
            }

            @Override // com.google.common.collect.b8.s
            Map<K, V> l() {
                return q.this;
            }
        }

        q() {
        }

        private static <T> a9<T> k1(Comparator<T> forward) {
            return a9.i(forward).E();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.g5, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0 */
        public final Map<K, V> i1() {
            return i1();
        }

        Set<Map.Entry<K, V>> c1() {
            return new a();
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> ceilingEntry(@b9 K key) {
            return i1().floorEntry(key);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K ceilingKey(@b9 K key) {
            return i1().floorKey(key);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparatorK1 = this.f117161a;
            if (comparatorK1 == null) {
                Comparator<? super K> comparator = i1().comparator();
                if (comparator == null) {
                    comparator = a9.z();
                }
                comparatorK1 = k1(comparator);
                this.f117161a = comparatorK1;
            }
            return comparatorK1;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return i1().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return i1();
        }

        @Override // com.google.common.collect.g5, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f117162b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setC1 = c1();
            this.f117162b = setC1;
            return setC1;
        }

        abstract Iterator<Map.Entry<K, V>> f1();

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> firstEntry() {
            return i1().lastEntry();
        }

        @Override // java.util.SortedMap
        @b9
        public K firstKey() {
            return i1().lastKey();
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> floorEntry(@b9 K key) {
            return i1().ceilingEntry(key);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K floorKey(@b9 K key) {
            return i1().ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@b9 K toKey, boolean inclusive) {
            return i1().tailMap(toKey, inclusive).descendingMap();
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> higherEntry(@b9 K key) {
            return i1().lowerEntry(key);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K higherKey(@b9 K key) {
            return i1().lowerKey(key);
        }

        abstract NavigableMap<K, V> i1();

        @Override // com.google.common.collect.g5, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> lastEntry() {
            return i1().firstEntry();
        }

        @Override // java.util.SortedMap
        @b9
        public K lastKey() {
            return i1().firstKey();
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> lowerEntry(@b9 K key) {
            return i1().higherEntry(key);
        }

        @Override // java.util.NavigableMap
        @fj.a
        public K lowerKey(@b9 K key) {
            return i1().higherKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f117163c;
            if (navigableSet != null) {
                return navigableSet;
            }
            e0 e0Var = new e0(this);
            this.f117163c = e0Var;
            return e0Var;
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> pollFirstEntry() {
            return i1().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> pollLastEntry() {
            return i1().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@b9 K fromKey, boolean fromInclusive, @b9 K toKey, boolean toInclusive) {
            return i1().subMap(toKey, toInclusive, fromKey, fromInclusive).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@b9 K fromKey, boolean inclusive) {
            return i1().headMap(fromKey, inclusive).descendingMap();
        }

        @Override // com.google.common.collect.m5
        public String toString() {
            return a1();
        }

        @Override // com.google.common.collect.g5, java.util.Map, com.google.common.collect.w
        public Collection<V> values() {
            return new q0(this);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(@b9 K toKey) {
            return headMap(toKey, false);
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

    static class q0<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @r9.m
        final Map<K, V> f117165a;

        q0(Map<K, V> map) {
            this.f117165a = (Map) com.google.common.base.j0.E(map);
        }

        final Map<K, V> c() {
            return this.f117165a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@fj.a Object o10) {
            return c().containsValue(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return b8.R0(c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@fj.a Object o10) {
            try {
                return super.remove(o10);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : c().entrySet()) {
                    if (com.google.common.base.d0.a(o10, entry.getValue())) {
                        c().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> c10) {
            try {
                return super.removeAll((Collection) com.google.common.base.j0.E(c10));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetU = z9.u();
                for (Map.Entry<K, V> entry : c().entrySet()) {
                    if (c10.contains(entry.getValue())) {
                        hashSetU.add(entry.getKey());
                    }
                }
                return c().keySet().removeAll(hashSetU);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> c10) {
            try {
                return super.retainAll((Collection) com.google.common.base.j0.E(c10));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetU = z9.u();
                for (Map.Entry<K, V> entry : c().entrySet()) {
                    if (c10.contains(entry.getValue())) {
                        hashSetU.add(entry.getKey());
                    }
                }
                return c().keySet().retainAll(hashSetU);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c().size();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class r implements com.google.common.base.t<Map.Entry<?, ?>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f117166a = new a("KEY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final r f117167b = new b("VALUE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ r[] f117168c = k();

        final enum a extends r {
            a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.base.t
            @fj.a
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        final enum b extends r {
            b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.base.t
            @fj.a
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private r(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        private static /* synthetic */ r[] k() {
            return new r[]{f117166a, f117167b};
        }

        public static r valueOf(String name) {
            return (r) Enum.valueOf(r.class, name);
        }

        public static r[] values() {
            return (r[]) f117168c.clone();
        }

        /* synthetic */ r(String str, int i10, e eVar) {
            this(str, i10);
        }
    }

    @com.google.common.annotations.b
    static abstract class r0<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @a8.b
        @fj.a
        private transient Set<Map.Entry<K, V>> f117169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @a8.b
        @fj.a
        private transient Set<K> f117170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @a8.b
        @fj.a
        private transient Collection<V> f117171c;

        r0() {
        }

        abstract Set<Map.Entry<K, V>> a();

        /* JADX INFO: renamed from: b */
        Set<K> g() {
            return new b0(this);
        }

        Collection<V> c() {
            return new q0(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f117169a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.f117169a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: keySet */
        public Set<K> h() {
            Set<K> set = this.f117170b;
            if (set != null) {
                return set;
            }
            Set<K> setG = g();
            this.f117170b = setG;
            return setG;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collectionC = this.f117171c;
            if (collectionC == null) {
                collectionC = c();
                this.f117171c = collectionC;
            }
            return collectionC;
        }
    }

    static abstract class s<K, V> extends z9.k<Map.Entry<K, V>> {
        s() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object o10) {
            if (o10 instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) o10;
                Object key = entry.getKey();
                Object objP0 = b8.p0(l(), key);
                if (com.google.common.base.d0.a(objP0, entry.getValue()) && (objP0 != null || l().containsKey(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return l().isEmpty();
        }

        abstract Map<K, V> l();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object o10) {
            if (contains(o10) && (o10 instanceof Map.Entry)) {
                return l().keySet().remove(((Map.Entry) o10).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.z9.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c10) {
            try {
                return super.removeAll((Collection) com.google.common.base.j0.E(c10));
            } catch (UnsupportedOperationException unused) {
                return z9.J(this, c10.iterator());
            }
        }

        @Override // com.google.common.collect.z9.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c10) {
            try {
                return super.retainAll((Collection) com.google.common.base.j0.E(c10));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetY = z9.y(c10.size());
                for (Object obj : c10) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetY.add(((Map.Entry) obj).getKey());
                    }
                }
                return l().keySet().retainAll(hashSetY);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l().size();
        }
    }

    public interface t<K, V1, V2> {
        @b9
        V2 a(@b9 K key, @b9 V1 value);
    }

    static final class u<K, V> extends v<K, V> implements com.google.common.collect.w<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @r9.j
        private final com.google.common.collect.w<V, K> f117172g;

        class a implements com.google.common.base.k0<Map.Entry<V, K>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.google.common.base.k0 f117173a;

            a(final com.google.common.base.k0 val$forwardPredicate) {
                this.f117173a = val$forwardPredicate;
            }

            @Override // com.google.common.base.k0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean apply(Map.Entry<V, K> input) {
                return this.f117173a.apply(b8.O(input.getValue(), input.getKey()));
            }
        }

        u(com.google.common.collect.w<K, V> delegate, com.google.common.base.k0<? super Map.Entry<K, V>> predicate) {
            super(delegate, predicate);
            this.f117172g = new u(delegate.Y2(), g(predicate), this);
        }

        private static <K, V> com.google.common.base.k0<Map.Entry<V, K>> g(final com.google.common.base.k0<? super Map.Entry<K, V>> forwardPredicate) {
            return new a(forwardPredicate);
        }

        @Override // com.google.common.collect.w
        @fj.a
        public V L2(@b9 K key, @b9 V value) {
            com.google.common.base.j0.d(d(key, value));
            return h().L2(key, value);
        }

        @Override // com.google.common.collect.w
        public com.google.common.collect.w<V, K> Y2() {
            return this.f117172g;
        }

        com.google.common.collect.w<K, V> h() {
            return (com.google.common.collect.w) this.f117150d;
        }

        @Override // com.google.common.collect.b8.r0, java.util.AbstractMap, java.util.Map
        public Set<V> values() {
            return this.f117172g.keySet();
        }

        private u(com.google.common.collect.w<K, V> delegate, com.google.common.base.k0<? super Map.Entry<K, V>> predicate, com.google.common.collect.w<V, K> inverse) {
            super(delegate, predicate);
            this.f117172g = inverse;
        }
    }

    static class v<K, V> extends n<K, V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Set<Map.Entry<K, V>> f117174f;

        private class a extends o5<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: com.google.common.collect.b8$v$a$a, reason: collision with other inner class name */
            class C1054a extends eb<Map.Entry<K, V>, Map.Entry<K, V>> {

                /* JADX INFO: renamed from: com.google.common.collect.b8$v$a$a$a, reason: collision with other inner class name */
                class C1055a extends h5<K, V> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Map.Entry f117177a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C1054a f117178b;

                    C1055a(final C1054a this$2, final Map.Entry val$entry) {
                        this.f117177a = val$entry;
                        this.f117178b = this$2;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.h5, com.google.common.collect.m5
                    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
                    public Map.Entry<K, V> i1() {
                        return this.f117177a;
                    }

                    @Override // com.google.common.collect.h5, java.util.Map.Entry
                    @b9
                    public V setValue(@b9 V v10) {
                        com.google.common.base.j0.d(v.this.d(getKey(), v10));
                        return (V) super.setValue(v10);
                    }
                }

                C1054a(Iterator backingIterator) {
                    super(backingIterator);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.eb
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> b(final Map.Entry<K, V> entry) {
                    return new C1055a(this, entry);
                }
            }

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.o5, com.google.common.collect.v4
            public Set<Map.Entry<K, V>> i1() {
                return v.this.f117174f;
            }

            @Override // com.google.common.collect.v4, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new C1054a(v.this.f117174f.iterator());
            }

            /* synthetic */ a(v vVar, e eVar) {
                this();
            }
        }

        class b extends b0<K, V> {
            b() {
                super(v.this);
            }

            @Override // com.google.common.collect.b8.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@fj.a Object o10) {
                if (!v.this.containsKey(o10)) {
                    return false;
                }
                v.this.f117150d.remove(o10);
                return true;
            }

            @Override // com.google.common.collect.z9.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                v vVar = v.this;
                return v.e(vVar.f117150d, vVar.f117151e, collection);
            }

            @Override // com.google.common.collect.z9.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                v vVar = v.this;
                return v.f(vVar.f117150d, vVar.f117151e, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return x7.s(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) x7.s(iterator()).toArray(tArr);
            }
        }

        v(Map<K, V> unfiltered, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
            super(unfiltered, entryPredicate);
            this.f117174f = z9.i(unfiltered.entrySet(), this.f117151e);
        }

        static <K, V> boolean e(Map<K, V> map, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate, Collection<?> keyCollection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (entryPredicate.apply(next) && keyCollection.contains(next.getKey())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        static <K, V> boolean f(Map<K, V> map, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate, Collection<?> keyCollection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (entryPredicate.apply(next) && !keyCollection.contains(next.getKey())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // com.google.common.collect.b8.r0
        protected Set<Map.Entry<K, V>> a() {
            return new a(this, null);
        }

        @Override // com.google.common.collect.b8.r0
        /* JADX INFO: renamed from: b */
        Set<K> g() {
            return new b();
        }
    }

    @com.google.common.annotations.c
    private static class w<K, V> extends com.google.common.collect.j<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final NavigableMap<K, V> f117180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.common.base.k0<? super Map.Entry<K, V>> f117181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<K, V> f117182c;

        class a extends e0<K, V> {
            a(NavigableMap map) {
                super(map);
            }

            @Override // com.google.common.collect.z9.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return v.e(w.this.f117180a, w.this.f117181b, collection);
            }

            @Override // com.google.common.collect.z9.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return v.f(w.this.f117180a, w.this.f117181b, collection);
            }
        }

        w(NavigableMap<K, V> unfiltered, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
            this.f117180a = (NavigableMap) com.google.common.base.j0.E(unfiltered);
            this.f117181b = entryPredicate;
            this.f117182c = new v(unfiltered, entryPredicate);
        }

        @Override // com.google.common.collect.b8.a0
        Iterator<Map.Entry<K, V>> a() {
            return p7.w(this.f117180a.entrySet().iterator(), this.f117181b);
        }

        @Override // com.google.common.collect.j
        Iterator<Map.Entry<K, V>> b() {
            return p7.w(this.f117180a.descendingMap().entrySet().iterator(), this.f117181b);
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f117182c.clear();
        }

        @Override // java.util.SortedMap
        @fj.a
        public Comparator<? super K> comparator() {
            return this.f117180a.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return this.f117182c.containsKey(key);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return b8.z(this.f117180a.descendingMap(), this.f117181b);
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return this.f117182c.entrySet();
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @fj.a
        public V get(@fj.a Object key) {
            return this.f117182c.get(key);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@b9 K toKey, boolean inclusive) {
            return b8.z(this.f117180a.headMap(toKey, inclusive), this.f117181b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !o7.c(this.f117180a.entrySet(), this.f117181b);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new a(this);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) o7.I(this.f117180a.entrySet(), this.f117181b);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        @fj.a
        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) o7.I(this.f117180a.descendingMap().entrySet(), this.f117181b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V put(@b9 K key, @b9 V value) {
            return this.f117182c.put(key, value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> m10) {
            this.f117182c.putAll(m10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        public V remove(@fj.a Object key) {
            return this.f117182c.remove(key);
        }

        @Override // com.google.common.collect.b8.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f117182c.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@b9 K fromKey, boolean fromInclusive, @b9 K toKey, boolean toInclusive) {
            return b8.z(this.f117180a.subMap(fromKey, fromInclusive, toKey, toInclusive), this.f117181b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@b9 K fromKey, boolean inclusive) {
            return b8.z(this.f117180a.tailMap(fromKey, inclusive), this.f117181b);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new z(this, this.f117180a, this.f117181b);
        }
    }

    private static class x<K, V> extends v<K, V> implements SortedMap<K, V> {

        class a extends v<K, V>.b implements SortedSet<K> {
            a() {
                super();
            }

            @Override // java.util.SortedSet
            @fj.a
            public Comparator<? super K> comparator() {
                return x.this.i().comparator();
            }

            @Override // java.util.SortedSet
            @b9
            public K first() {
                return (K) x.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(@b9 K toElement) {
                return (SortedSet) x.this.headMap(toElement).keySet();
            }

            @Override // java.util.SortedSet
            @b9
            public K last() {
                return (K) x.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(@b9 K fromElement, @b9 K toElement) {
                return (SortedSet) x.this.subMap(fromElement, toElement).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(@b9 K fromElement) {
                return (SortedSet) x.this.tailMap(fromElement).keySet();
            }
        }

        x(SortedMap<K, V> unfiltered, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
            super(unfiltered, entryPredicate);
        }

        @Override // java.util.SortedMap
        @fj.a
        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedMap
        @b9
        public K firstKey() {
            return h().iterator().next();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.b8.v, com.google.common.collect.b8.r0
        public SortedSet<K> g() {
            return new a();
        }

        @Override // com.google.common.collect.b8.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public SortedSet<K> h() {
            return (SortedSet) super.h();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@b9 K toKey) {
            return new x(i().headMap(toKey), this.f117151e);
        }

        SortedMap<K, V> i() {
            return (SortedMap) this.f117150d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        @b9
        public K lastKey() {
            SortedMap<K, V> sortedMapI = i();
            while (true) {
                K kLastKey = sortedMapI.lastKey();
                if (d(kLastKey, u8.a(this.f117150d.get(kLastKey)))) {
                    return kLastKey;
                }
                sortedMapI = i().headMap(kLastKey);
            }
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@b9 K fromKey, @b9 K toKey) {
            return new x(i().subMap(fromKey, toKey), this.f117151e);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@b9 K fromKey) {
            return new x(i().tailMap(fromKey), this.f117151e);
        }
    }

    private static class y<K, V> extends n<K, V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final com.google.common.base.k0<? super K> f117185f;

        y(Map<K, V> unfiltered, com.google.common.base.k0<? super K> keyPredicate, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
            super(unfiltered, entryPredicate);
            this.f117185f = keyPredicate;
        }

        @Override // com.google.common.collect.b8.r0
        protected Set<Map.Entry<K, V>> a() {
            return z9.i(this.f117150d.entrySet(), this.f117151e);
        }

        @Override // com.google.common.collect.b8.r0
        /* JADX INFO: renamed from: b */
        Set<K> g() {
            return z9.i(this.f117150d.keySet(), this.f117185f);
        }

        @Override // com.google.common.collect.b8.n, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return this.f117150d.containsKey(key) && this.f117185f.apply(key);
        }
    }

    private static final class z<K, V> extends q0<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<K, V> f117186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.google.common.base.k0<? super Map.Entry<K, V>> f117187c;

        z(Map<K, V> filteredMap, Map<K, V> unfiltered, com.google.common.base.k0<? super Map.Entry<K, V>> predicate) {
            super(filteredMap);
            this.f117186b = unfiltered;
            this.f117187c = predicate;
        }

        @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
        public boolean remove(@fj.a Object o10) {
            Iterator<Map.Entry<K, V>> it = this.f117186b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f117187c.apply(next) && com.google.common.base.d0.a(next.getValue(), o10)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f117186b.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f117187c.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f117186b.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f117187c.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z10 = true;
                    int i10 = 7 << 1;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return x7.s(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) x7.s(iterator()).toArray(tArr);
        }
    }

    private b8() {
    }

    public static <K, V> SortedMap<K, V> A(SortedMap<K, V> unfiltered, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
        com.google.common.base.j0.E(entryPredicate);
        return unfiltered instanceof x ? E((x) unfiltered, entryPredicate) : new x((SortedMap) com.google.common.base.j0.E(unfiltered), entryPredicate);
    }

    @com.google.common.annotations.c
    public static <K, V1, V2> NavigableMap<K, V2> A0(NavigableMap<K, V1> fromMap, t<? super K, ? super V1, V2> transformer) {
        return new j0(fromMap, transformer);
    }

    private static <K, V> com.google.common.collect.w<K, V> B(u<K, V> map, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
        return new u(map.h(), com.google.common.base.l0.d(map.f117151e, entryPredicate));
    }

    public static <K, V1, V2> SortedMap<K, V2> B0(SortedMap<K, V1> fromMap, t<? super K, ? super V1, V2> transformer) {
        return new k0(fromMap, transformer);
    }

    private static <K, V> Map<K, V> C(n<K, V> map, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
        return new v(map.f117150d, com.google.common.base.l0.d(map.f117151e, entryPredicate));
    }

    static <V2, K, V1> Map.Entry<K, V2> C0(final t<? super K, ? super V1, V2> transformer, final Map.Entry<K, V1> entry) {
        com.google.common.base.j0.E(transformer);
        com.google.common.base.j0.E(entry);
        return new c(entry, transformer);
    }

    @com.google.common.annotations.c
    private static <K, V> NavigableMap<K, V> D(w<K, V> map, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
        return new w(((w) map).f117180a, com.google.common.base.l0.d(((w) map).f117181b, entryPredicate));
    }

    public static <K, V1, V2> Map<K, V2> D0(Map<K, V1> fromMap, com.google.common.base.t<? super V1, V2> function) {
        return z0(fromMap, i(function));
    }

    private static <K, V> SortedMap<K, V> E(x<K, V> map, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
        return new x(map.i(), com.google.common.base.l0.d(map.f117151e, entryPredicate));
    }

    @com.google.common.annotations.c
    public static <K, V1, V2> NavigableMap<K, V2> E0(NavigableMap<K, V1> fromMap, com.google.common.base.t<? super V1, V2> function) {
        return A0(fromMap, i(function));
    }

    public static <K, V> com.google.common.collect.w<K, V> F(com.google.common.collect.w<K, V> unfiltered, final com.google.common.base.k0<? super K> keyPredicate) {
        com.google.common.base.j0.E(keyPredicate);
        return x(unfiltered, U(keyPredicate));
    }

    public static <K, V1, V2> SortedMap<K, V2> F0(SortedMap<K, V1> fromMap, com.google.common.base.t<? super V1, V2> function) {
        return B0(fromMap, i(function));
    }

    public static <K, V> Map<K, V> G(Map<K, V> unfiltered, final com.google.common.base.k0<? super K> keyPredicate) {
        com.google.common.base.j0.E(keyPredicate);
        com.google.common.base.k0 k0VarU = U(keyPredicate);
        return unfiltered instanceof n ? C((n) unfiltered, k0VarU) : new y((Map) com.google.common.base.j0.E(unfiltered), keyPredicate, k0VarU);
    }

    @z7.a
    public static <K, V> n6<K, V> G0(Iterable<V> values, com.google.common.base.t<? super V, K> keyFunction) {
        return values instanceof Collection ? I0(values.iterator(), keyFunction, n6.c(((Collection) values).size())) : H0(values.iterator(), keyFunction);
    }

    @com.google.common.annotations.c
    public static <K, V> NavigableMap<K, V> H(NavigableMap<K, V> unfiltered, final com.google.common.base.k0<? super K> keyPredicate) {
        return z(unfiltered, U(keyPredicate));
    }

    @z7.a
    public static <K, V> n6<K, V> H0(Iterator<V> values, com.google.common.base.t<? super V, K> keyFunction) {
        return I0(values, keyFunction, n6.b());
    }

    public static <K, V> SortedMap<K, V> I(SortedMap<K, V> unfiltered, final com.google.common.base.k0<? super K> keyPredicate) {
        return A(unfiltered, U(keyPredicate));
    }

    private static <K, V> n6<K, V> I0(Iterator<V> values, com.google.common.base.t<? super V, K> keyFunction, n6.b<K, V> builder) {
        com.google.common.base.j0.E(keyFunction);
        while (values.hasNext()) {
            V next = values.next();
            builder.i(keyFunction.apply(next), next);
        }
        try {
            return builder.d();
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(e10.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }

    public static <K, V> com.google.common.collect.w<K, V> J(com.google.common.collect.w<K, V> unfiltered, final com.google.common.base.k0<? super V> valuePredicate) {
        return x(unfiltered, T0(valuePredicate));
    }

    public static <K, V> com.google.common.collect.w<K, V> J0(com.google.common.collect.w<? extends K, ? extends V> bimap) {
        return new l0(bimap, null);
    }

    public static <K, V> Map<K, V> K(Map<K, V> unfiltered, final com.google.common.base.k0<? super V> valuePredicate) {
        return y(unfiltered, T0(valuePredicate));
    }

    static <K, V> Map.Entry<K, V> K0(final Map.Entry<? extends K, ? extends V> entry) {
        com.google.common.base.j0.E(entry);
        return new k(entry);
    }

    @com.google.common.annotations.c
    public static <K, V> NavigableMap<K, V> L(NavigableMap<K, V> unfiltered, final com.google.common.base.k0<? super V> valuePredicate) {
        return z(unfiltered, T0(valuePredicate));
    }

    static <K, V> nb<Map.Entry<K, V>> L0(final Iterator<Map.Entry<K, V>> entryIterator) {
        return new l(entryIterator);
    }

    public static <K, V> SortedMap<K, V> M(SortedMap<K, V> unfiltered, final com.google.common.base.k0<? super V> valuePredicate) {
        return A(unfiltered, T0(valuePredicate));
    }

    static <K, V> Set<Map.Entry<K, V>> M0(Set<Map.Entry<K, V>> entrySet) {
        return new n0(Collections.unmodifiableSet(entrySet));
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static n6<String, String> N(Properties properties) {
        n6.b bVarB = n6.b();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            Object objNextElement = enumerationPropertyNames.nextElement();
            Objects.requireNonNull(objNextElement);
            String str = (String) objNextElement;
            String property = properties.getProperty(str);
            Objects.requireNonNull(property);
            bVarB.i(str, property);
        }
        return bVarB.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Map<K, V> N0(Map<K, ? extends V> map) {
        return map instanceof SortedMap ? Collections.unmodifiableSortedMap((SortedMap) map) : Collections.unmodifiableMap(map);
    }

    @com.google.common.annotations.b(serializable = true)
    public static <K, V> Map.Entry<K, V> O(@b9 K key, @b9 V value) {
        return new i6(key, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.annotations.c
    public static <K, V> NavigableMap<K, V> O0(NavigableMap<K, ? extends V> map) {
        com.google.common.base.j0.E(map);
        return map instanceof o0 ? map : new o0(map);
    }

    @com.google.common.annotations.b(serializable = true)
    public static <K extends Enum<K>, V> n6<K, V> P(Map<K, ? extends V> map) {
        if (map instanceof j6) {
            return (j6) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return n6.q();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        a3.a(key, value);
        EnumMap enumMap = new EnumMap(Collections.singletonMap(key, value));
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            a3.a(key2, value2);
            enumMap.put((Enum) key2, (Object) value2);
        }
        return j6.H(enumMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fj.a
    public static <K, V> Map.Entry<K, V> P0(@fj.a Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return K0(entry);
    }

    static <E> n6<E, Integer> Q(Collection<E> list) {
        n6.b bVar = new n6.b(list.size());
        Iterator<E> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bVar.i(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return bVar.d();
    }

    static <V> com.google.common.base.t<Map.Entry<?, V>, V> Q0() {
        return r.f117167b;
    }

    static <K> com.google.common.base.t<Map.Entry<K, ?>, K> R() {
        return r.f117166a;
    }

    static <K, V> Iterator<V> R0(Iterator<Map.Entry<K, V>> entryIterator) {
        return new f(entryIterator);
    }

    static <K, V> Iterator<K> S(Iterator<Map.Entry<K, V>> entryIterator) {
        return new e(entryIterator);
    }

    @fj.a
    static <V> V S0(@fj.a Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @fj.a
    static <K> K T(@fj.a Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    static <V> com.google.common.base.k0<Map.Entry<?, V>> T0(com.google.common.base.k0<? super V> valuePredicate) {
        return com.google.common.base.l0.h(valuePredicate, Q0());
    }

    static <K> com.google.common.base.k0<Map.Entry<K, ?>> U(com.google.common.base.k0<? super K> keyPredicate) {
        return com.google.common.base.l0.h(keyPredicate, R());
    }

    public static <K, V> ConcurrentMap<K, V> V() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> W(Class<K> type) {
        return new EnumMap<>((Class) com.google.common.base.j0.E(type));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> X(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> HashMap<K, V> Y() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> Z(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> HashMap<K, V> a0(int expectedSize) {
        return new HashMap<>(o(expectedSize));
    }

    public static <K, V> IdentityHashMap<K, V> b0() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> c0() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> d0(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> e0(int expectedSize) {
        return new LinkedHashMap<>(o(expectedSize));
    }

    public static <A, B> com.google.common.base.i<A, B> f(final com.google.common.collect.w<A, B> bimap) {
        return new p(bimap);
    }

    public static <K extends Comparable, V> TreeMap<K, V> f0() {
        return new TreeMap<>();
    }

    static <K, V1, V2> com.google.common.base.t<Map.Entry<K, V1>, Map.Entry<K, V2>> g(final t<? super K, ? super V1, V2> transformer) {
        com.google.common.base.j0.E(transformer);
        return new d(transformer);
    }

    public static <C, K extends C, V> TreeMap<K, V> g0(@fj.a Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    static <K, V1, V2> com.google.common.base.t<Map.Entry<K, V1>, V2> h(final t<? super K, ? super V1, V2> transformer) {
        com.google.common.base.j0.E(transformer);
        return new b(transformer);
    }

    public static <K, V> TreeMap<K, V> h0(SortedMap<K, ? extends V> map) {
        return new TreeMap<>((SortedMap) map);
    }

    static <K, V1, V2> t<K, V1, V2> i(final com.google.common.base.t<? super V1, V2> function) {
        com.google.common.base.j0.E(function);
        return new m(function);
    }

    static <E> Comparator<? super E> i0(@fj.a Comparator<? super E> comparator) {
        return comparator != null ? comparator : a9.z();
    }

    public static <K, V> Map<K, V> j(Set<K> set, com.google.common.base.t<? super K, V> function) {
        return new o(set, function);
    }

    static <K, V> void j0(Map<K, V> self, Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            self.put(entry.getKey(), entry.getValue());
        }
    }

    @com.google.common.annotations.c
    public static <K, V> NavigableMap<K, V> k(NavigableSet<K> set, com.google.common.base.t<? super K, V> function) {
        return new d0(set, function);
    }

    static <K, V> boolean k0(Collection<Map.Entry<K, V>> c10, @fj.a Object o10) {
        if (o10 instanceof Map.Entry) {
            return c10.remove(K0((Map.Entry) o10));
        }
        return false;
    }

    public static <K, V> SortedMap<K, V> l(SortedSet<K> set, com.google.common.base.t<? super K, V> function) {
        return new f0(set, function);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @com.google.common.annotations.c
    public static <E> NavigableSet<E> l0(final NavigableSet<E> set) {
        return new j(set);
    }

    static <K, V> Iterator<Map.Entry<K, V>> m(Set<K> set, final com.google.common.base.t<? super K, V> function) {
        return new g(set.iterator(), function);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Set<E> m0(final Set<E> set) {
        return new h(set);
    }

    static <K, V1, V2> com.google.common.base.t<V1, V2> n(final t<? super K, V1, V2> transformer, @b9 final K key) {
        com.google.common.base.j0.E(transformer);
        return new a(transformer, key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> SortedSet<E> n0(final SortedSet<E> set) {
        return new i(set);
    }

    static int o(int expectedSize) {
        if (expectedSize < 3) {
            a3.b(expectedSize, "expectedSize");
            return expectedSize + 1;
        }
        if (expectedSize < 1073741824) {
            return (int) Math.ceil(((double) expectedSize) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    static boolean o0(Map<?, ?> map, @fj.a Object key) {
        com.google.common.base.j0.E(map);
        try {
            return map.containsKey(key);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <K, V> boolean p(Collection<Map.Entry<K, V>> c10, @fj.a Object o10) {
        if (o10 instanceof Map.Entry) {
            return c10.contains(K0((Map.Entry) o10));
        }
        return false;
    }

    @fj.a
    static <V> V p0(Map<?, V> map, @fj.a Object key) {
        com.google.common.base.j0.E(map);
        try {
            return map.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean q(Map<?, ?> map, @fj.a Object key) {
        return p7.p(S(map.entrySet().iterator()), key);
    }

    @fj.a
    static <V> V q0(Map<?, V> map, @fj.a Object key) {
        com.google.common.base.j0.E(map);
        try {
            return map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean r(Map<?, ?> map, @fj.a Object value) {
        return p7.p(R0(map.entrySet().iterator()), value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @com.google.common.annotations.c
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> r0(NavigableMap<K, V> map, f9<K> range) {
        if (map.comparator() != null && map.comparator() != a9.z() && range.q() && range.r()) {
            com.google.common.base.j0.e(map.comparator().compare(range.y(), range.J()) <= 0, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.q() && range.r()) {
            Comparable comparableY = range.y();
            com.google.common.collect.x xVarX = range.x();
            com.google.common.collect.x xVar = com.google.common.collect.x.CLOSED;
            return map.subMap(comparableY, xVarX == xVar, range.J(), range.I() == xVar);
        }
        if (range.q()) {
            return map.tailMap(range.y(), range.x() == com.google.common.collect.x.CLOSED);
        }
        if (range.r()) {
            return map.headMap(range.J(), range.I() == com.google.common.collect.x.CLOSED);
        }
        return (NavigableMap) com.google.common.base.j0.E(map);
    }

    public static <K, V> y7<K, V> s(Map<? extends K, ? extends V> left, Map<? extends K, ? extends V> right) {
        return left instanceof SortedMap ? u((SortedMap) left, right) : t(left, right, com.google.common.base.m.c());
    }

    @com.google.common.annotations.d
    public static <K, V> com.google.common.collect.w<K, V> s0(com.google.common.collect.w<K, V> bimap) {
        return na.g(bimap, null);
    }

    public static <K, V> y7<K, V> t(Map<? extends K, ? extends V> left, Map<? extends K, ? extends V> right, com.google.common.base.m<? super V> valueEquivalence) {
        com.google.common.base.j0.E(valueEquivalence);
        LinkedHashMap linkedHashMapC0 = c0();
        LinkedHashMap linkedHashMap = new LinkedHashMap(right);
        LinkedHashMap linkedHashMapC1 = c0();
        LinkedHashMap linkedHashMapC2 = c0();
        v(left, right, valueEquivalence, linkedHashMapC0, linkedHashMap, linkedHashMapC1, linkedHashMapC2);
        return new c0(linkedHashMapC0, linkedHashMap, linkedHashMapC1, linkedHashMapC2);
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    public static <K, V> NavigableMap<K, V> t0(NavigableMap<K, V> navigableMap) {
        return na.o(navigableMap);
    }

    public static <K, V> fa<K, V> u(SortedMap<K, ? extends V> left, Map<? extends K, ? extends V> right) {
        com.google.common.base.j0.E(left);
        com.google.common.base.j0.E(right);
        Comparator comparatorI0 = i0(left.comparator());
        TreeMap treeMapG0 = g0(comparatorI0);
        TreeMap treeMapG1 = g0(comparatorI0);
        treeMapG1.putAll(right);
        TreeMap treeMapG2 = g0(comparatorI0);
        TreeMap treeMapG3 = g0(comparatorI0);
        v(left, right, com.google.common.base.m.c(), treeMapG0, treeMapG1, treeMapG2, treeMapG3);
        return new h0(treeMapG0, treeMapG1, treeMapG2, treeMapG3);
    }

    @d6
    public static <T, K extends Enum<K>, V> Collector<T, ?, n6<K, V>> u0(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return y2.H(keyFunction, valueFunction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <K, V> void v(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, com.google.common.base.m<? super V> mVar, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, y7.a<V>> map6) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                a0.b bVar = (Object) u8.a(map4.remove(key));
                if (mVar.d(value, bVar)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, p0.c(value, bVar));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    @d6
    public static <T, K extends Enum<K>, V> Collector<T, ?, n6<K, V>> v0(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        return y2.I(keyFunction, valueFunction, mergeFunction);
    }

    static boolean w(Map<?, ?> map, @fj.a Object object) {
        if (map == object) {
            return true;
        }
        if (object instanceof Map) {
            return map.entrySet().equals(((Map) object).entrySet());
        }
        return false;
    }

    public static <K, V> n6<K, V> w0(Iterable<K> keys, com.google.common.base.t<? super K, V> valueFunction) {
        return x0(keys.iterator(), valueFunction);
    }

    public static <K, V> com.google.common.collect.w<K, V> x(com.google.common.collect.w<K, V> unfiltered, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
        com.google.common.base.j0.E(unfiltered);
        com.google.common.base.j0.E(entryPredicate);
        return unfiltered instanceof u ? B((u) unfiltered, entryPredicate) : new u(unfiltered, entryPredicate);
    }

    public static <K, V> n6<K, V> x0(Iterator<K> keys, com.google.common.base.t<? super K, V> valueFunction) {
        com.google.common.base.j0.E(valueFunction);
        n6.b bVarB = n6.b();
        while (keys.hasNext()) {
            K next = keys.next();
            bVarB.i(next, valueFunction.apply(next));
        }
        return bVarB.c();
    }

    public static <K, V> Map<K, V> y(Map<K, V> unfiltered, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
        com.google.common.base.j0.E(entryPredicate);
        return unfiltered instanceof n ? C((n) unfiltered, entryPredicate) : new v((Map) com.google.common.base.j0.E(unfiltered), entryPredicate);
    }

    static String y0(Map<?, ?> map) {
        StringBuilder sbF = b3.f(map.size());
        sbF.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                sbF.append(", ");
            }
            sbF.append(entry.getKey());
            sbF.append('=');
            sbF.append(entry.getValue());
            z10 = false;
        }
        sbF.append(AbstractJsonLexerKt.END_OBJ);
        return sbF.toString();
    }

    @com.google.common.annotations.c
    public static <K, V> NavigableMap<K, V> z(NavigableMap<K, V> unfiltered, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
        com.google.common.base.j0.E(entryPredicate);
        return unfiltered instanceof w ? D((w) unfiltered, entryPredicate) : new w((NavigableMap) com.google.common.base.j0.E(unfiltered), entryPredicate);
    }

    public static <K, V1, V2> Map<K, V2> z0(Map<K, V1> fromMap, t<? super K, ? super V1, V2> transformer) {
        return new i0(fromMap, transformer);
    }
}
