package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public final class n8 {

    static final class a<K, V> extends b8.r0<K, Collection<V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @r9.m
        private final k8<K, V> f117778d;

        /* JADX INFO: renamed from: com.google.common.collect.n8$a$a, reason: collision with other inner class name */
        class C1070a extends b8.s<K, Collection<V>> {
            C1070a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return b8.m(a.this.f117778d.keySet(), new com.google.common.base.t() { // from class: com.google.common.collect.m8
                    @Override // com.google.common.base.t
                    public final Object apply(Object obj) {
                        return n8.a.this.f117778d.x(obj);
                    }
                });
            }

            @Override // com.google.common.collect.b8.s
            Map<K, Collection<V>> l() {
                return a.this;
            }

            @Override // com.google.common.collect.b8.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@fj.a Object o10) {
                if (!contains(o10)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) o10;
                Objects.requireNonNull(entry);
                a.this.g(entry.getKey());
                return true;
            }
        }

        a(k8<K, V> multimap) {
            this.f117778d = (k8) com.google.common.base.j0.E(multimap);
        }

        @Override // com.google.common.collect.b8.r0
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new C1070a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f117778d.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            return this.f117778d.containsKey(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@fj.a Object key) {
            if (containsKey(key)) {
                return this.f117778d.x(key);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@fj.a Object key) {
            if (containsKey(key)) {
                return this.f117778d.c(key);
            }
            return null;
        }

        void g(@fj.a Object key) {
            this.f117778d.keySet().remove(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f117778d.isEmpty();
        }

        @Override // com.google.common.collect.b8.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: keySet */
        public Set<K> h() {
            return this.f117778d.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f117778d.keySet().size();
        }
    }

    private static class b<K, V> extends com.google.common.collect.d<K, V> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private static final long f117780k = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        transient com.google.common.base.s0<? extends List<V>> f117781j;

        b(Map<K, Collection<V>> map, com.google.common.base.s0<? extends List<V>> factory) {
            super(map);
            this.f117781j = (com.google.common.base.s0) com.google.common.base.j0.E(factory);
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
            stream.defaultReadObject();
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            this.f117781j = (com.google.common.base.s0) object;
            Object object2 = stream.readObject();
            Objects.requireNonNull(object2);
            D((Map) object2);
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.f117781j);
            stream.writeObject(t());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.d, com.google.common.collect.e
        /* JADX INFO: renamed from: H */
        public List<V> u() {
            return this.f117781j.get();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Map<K, Collection<V>> a() {
            return x();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Set<K> e() {
            return y();
        }
    }

    private static class c<K, V> extends com.google.common.collect.e<K, V> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private static final long f117782j = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        transient com.google.common.base.s0<? extends Collection<V>> f117783i;

        c(Map<K, Collection<V>> map, com.google.common.base.s0<? extends Collection<V>> factory) {
            super(map);
            this.f117783i = (com.google.common.base.s0) com.google.common.base.j0.E(factory);
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
            stream.defaultReadObject();
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            this.f117783i = (com.google.common.base.s0) object;
            Object object2 = stream.readObject();
            Objects.requireNonNull(object2);
            D((Map) object2);
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.f117783i);
            stream.writeObject(t());
        }

        @Override // com.google.common.collect.e
        <E> Collection<E> E(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return z9.P((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            if (collection instanceof Set) {
                return Collections.unmodifiableSet((Set) collection);
            }
            return collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.e
        Collection<V> F(@b9 K key, Collection<V> collection) {
            if (collection instanceof List) {
                return G(key, (List) collection, null);
            }
            if (collection instanceof NavigableSet) {
                return new com.google.common.collect.e.m(key, (NavigableSet) collection, null);
            }
            if (collection instanceof SortedSet) {
                return new com.google.common.collect.e.o(key, (SortedSet) collection, null);
            }
            return collection instanceof Set ? new com.google.common.collect.e.n(key, (Set) collection) : new com.google.common.collect.e.k(key, collection, null);
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Map<K, Collection<V>> a() {
            return x();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Set<K> e() {
            return y();
        }

        @Override // com.google.common.collect.e
        protected Collection<V> u() {
            return this.f117783i.get();
        }
    }

    private static class d<K, V> extends com.google.common.collect.m<K, V> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private static final long f117784k = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        transient com.google.common.base.s0<? extends Set<V>> f117785j;

        d(Map<K, Collection<V>> map, com.google.common.base.s0<? extends Set<V>> factory) {
            super(map);
            this.f117785j = (com.google.common.base.s0) com.google.common.base.j0.E(factory);
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
            stream.defaultReadObject();
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            this.f117785j = (com.google.common.base.s0) object;
            Object object2 = stream.readObject();
            Objects.requireNonNull(object2);
            D((Map) object2);
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.f117785j);
            stream.writeObject(t());
        }

        @Override // com.google.common.collect.m, com.google.common.collect.e
        <E> Collection<E> E(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return z9.P((NavigableSet) collection);
            }
            return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.m, com.google.common.collect.e
        Collection<V> F(@b9 K key, Collection<V> collection) {
            if (collection instanceof NavigableSet) {
                return new com.google.common.collect.e.m(key, (NavigableSet) collection, null);
            }
            return collection instanceof SortedSet ? new com.google.common.collect.e.o(key, (SortedSet) collection, null) : new com.google.common.collect.e.n(key, (Set) collection);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.m, com.google.common.collect.e
        /* JADX INFO: renamed from: H */
        public Set<V> u() {
            return this.f117785j.get();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Map<K, Collection<V>> a() {
            return x();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Set<K> e() {
            return y();
        }
    }

    private static class e<K, V> extends p<K, V> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private static final long f117786m = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        transient com.google.common.base.s0<? extends SortedSet<V>> f117787k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @fj.a
        transient Comparator<? super V> f117788l;

        e(Map<K, Collection<V>> map, com.google.common.base.s0<? extends SortedSet<V>> factory) {
            super(map);
            this.f117787k = (com.google.common.base.s0) com.google.common.base.j0.E(factory);
            this.f117788l = factory.get().comparator();
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
            stream.defaultReadObject();
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            com.google.common.base.s0<? extends SortedSet<V>> s0Var = (com.google.common.base.s0) object;
            this.f117787k = s0Var;
            this.f117788l = s0Var.get().comparator();
            Object object2 = stream.readObject();
            Objects.requireNonNull(object2);
            D((Map) object2);
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.f117787k);
            stream.writeObject(t());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public SortedSet<V> u() {
            return this.f117787k.get();
        }

        @Override // com.google.common.collect.ja
        @fj.a
        public Comparator<? super V> Y() {
            return this.f117788l;
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Map<K, Collection<V>> a() {
            return x();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Set<K> e() {
            return y();
        }
    }

    static abstract class f<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        f() {
        }

        abstract k8<K, V> c();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@fj.a Object o10) {
            if (!(o10 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o10;
            return c().I0(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@fj.a Object o10) {
            if (!(o10 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o10;
            return c().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c().size();
        }
    }

    static class g<K, V> extends com.google.common.collect.i<K> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @r9.m
        final k8<K, V> f117789c;

        class a extends eb<Map.Entry<K, Collection<V>>, q8.a<K>> {

            /* JADX INFO: renamed from: com.google.common.collect.n8$g$a$a, reason: collision with other inner class name */
            class C1071a extends r8.f<K> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Map.Entry f117791a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a f117792b;

                C1071a(final a this$1, final Map.Entry val$backingEntry) {
                    this.f117791a = val$backingEntry;
                    this.f117792b = this$1;
                }

                @Override // com.google.common.collect.q8.a
                @b9
                public K X0() {
                    return (K) this.f117791a.getKey();
                }

                @Override // com.google.common.collect.q8.a
                public int getCount() {
                    return ((Collection) this.f117791a.getValue()).size();
                }
            }

            a(Iterator backingIterator) {
                super(backingIterator);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.eb
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public q8.a<K> b(final Map.Entry<K, Collection<V>> backingEntry) {
                return new C1071a(this, backingEntry);
            }
        }

        g(k8<K, V> multimap) {
            this.f117789c = multimap;
        }

        @Override // com.google.common.collect.q8
        public int P3(@fj.a Object element) {
            Collection collection = (Collection) b8.p0(this.f117789c.l(), element);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f117789c.clear();
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
        public boolean contains(@fj.a Object element) {
            return this.f117789c.containsKey(element);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.q8
        public int f0(@fj.a Object element, int occurrences) {
            a3.b(occurrences, "occurrences");
            if (occurrences == 0) {
                return P3(element);
            }
            Collection collection = (Collection) b8.p0(this.f117789c.l(), element);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (occurrences >= size) {
                collection.clear();
                return size;
            }
            Iterator it = collection.iterator();
            for (int i10 = 0; i10 < occurrences; i10++) {
                it.next();
                it.remove();
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.q8
        public Iterator<K> iterator() {
            return b8.S(this.f117789c.u().iterator());
        }

        @Override // com.google.common.collect.i
        int k() {
            return this.f117789c.l().size();
        }

        @Override // com.google.common.collect.i
        Iterator<K> l() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.i
        Iterator<q8.a<K>> m() {
            return new a(this.f117789c.l().entrySet().iterator());
        }

        @Override // com.google.common.collect.i, com.google.common.collect.q8
        public Set<K> o() {
            return this.f117789c.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
        public int size() {
            return this.f117789c.size();
        }
    }

    private static class h<K, V> extends com.google.common.collect.h<K, V> implements y9<K, V>, Serializable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f117793g = 7845222491160860175L;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Map<K, V> f117794f;

        class a extends z9.k<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f117795a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f117796b;

            /* JADX INFO: renamed from: com.google.common.collect.n8$h$a$a, reason: collision with other inner class name */
            class C1072a implements Iterator<V> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f117797a;

                C1072a() {
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.f117797a != 0) {
                        return false;
                    }
                    a aVar = a.this;
                    return aVar.f117796b.f117794f.containsKey(aVar.f117795a);
                }

                @Override // java.util.Iterator
                @b9
                public V next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.f117797a++;
                    a aVar = a.this;
                    return (V) u8.a(aVar.f117796b.f117794f.get(aVar.f117795a));
                }

                @Override // java.util.Iterator
                public void remove() {
                    a3.e(this.f117797a == 1);
                    this.f117797a = -1;
                    a aVar = a.this;
                    aVar.f117796b.f117794f.remove(aVar.f117795a);
                }
            }

            a(final h this$0, final Object val$key) {
                this.f117795a = val$key;
                this.f117796b = this$0;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<V> iterator() {
                return new C1072a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f117796b.f117794f.containsKey(this.f117795a) ? 1 : 0;
            }
        }

        h(Map<K, V> map) {
            this.f117794f = (Map) com.google.common.base.j0.E(map);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8
        public boolean I0(@fj.a Object key, @fj.a Object value) {
            return this.f117794f.entrySet().contains(b8.O(key, value));
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8
        public boolean R(k8<? extends K, ? extends V> multimap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h
        Map<K, Collection<V>> a() {
            return new a(this);
        }

        @Override // com.google.common.collect.h
        Collection<Map.Entry<K, V>> b() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.k8
        public void clear() {
            this.f117794f.clear();
        }

        @Override // com.google.common.collect.k8
        public boolean containsKey(@fj.a Object key) {
            return this.f117794f.containsKey(key);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8
        public boolean containsValue(@fj.a Object value) {
            return this.f117794f.containsValue(value);
        }

        @Override // com.google.common.collect.h
        Set<K> e() {
            return this.f117794f.keySet();
        }

        @Override // com.google.common.collect.h
        q8<K> f() {
            return new g(this);
        }

        @Override // com.google.common.collect.h
        Collection<V> g() {
            return this.f117794f.values();
        }

        @Override // com.google.common.collect.h
        Iterator<Map.Entry<K, V>> h() {
            return this.f117794f.entrySet().iterator();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8
        public int hashCode() {
            return this.f117794f.hashCode();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8
        public boolean put(@b9 K key, @b9 V value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8
        public boolean remove(@fj.a Object key, @fj.a Object value) {
            return this.f117794f.entrySet().remove(b8.O(key, value));
        }

        @Override // com.google.common.collect.k8
        public int size() {
            return this.f117794f.size();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8
        public boolean v(@b9 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.k8, com.google.common.collect.y9
        public Set<V> c(@fj.a Object key) {
            HashSet hashSet = new HashSet(2);
            if (!this.f117794f.containsKey(key)) {
                return hashSet;
            }
            hashSet.add(this.f117794f.remove(key));
            return hashSet;
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
        public Set<V> d(@b9 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: get */
        public Set<V> x(@b9 final K key) {
            return new a(this, key);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: k */
        public Set<Map.Entry<K, V>> u() {
            return this.f117794f.entrySet();
        }
    }

    private static final class i<K, V1, V2> extends j<K, V1, V2> implements w7<K, V2> {
        i(w7<K, V1> fromMultimap, b8.t<? super K, ? super V1, V2> transformer) {
            super(fromMultimap, transformer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.n8.j
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public List<V2> m(@b9 K key, Collection<V1> values) {
            return x7.D((List) values, b8.n(this.f117800g, key));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.n8.j, com.google.common.collect.k8, com.google.common.collect.y9
        public List<V2> c(@fj.a Object key) {
            return m(key, this.f117799f.c(key));
        }

        @Override // com.google.common.collect.n8.j, com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
        public List<V2> d(@b9 K key, Iterable<? extends V2> values) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.n8.j, com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: get */
        public List<V2> x(@b9 K key) {
            return m(key, this.f117799f.x(key));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class j<K, V1, V2> extends com.google.common.collect.h<K, V2> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final k8<K, V1> f117799f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final b8.t<? super K, ? super V1, V2> f117800g;

        j(k8<K, V1> fromMultimap, final b8.t<? super K, ? super V1, V2> transformer) {
            this.f117799f = (k8) com.google.common.base.j0.E(fromMultimap);
            this.f117800g = (b8.t) com.google.common.base.j0.E(transformer);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8
        public boolean R(k8<? extends K, ? extends V2> multimap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h
        Map<K, Collection<V2>> a() {
            return b8.z0(this.f117799f.l(), new b8.t() { // from class: com.google.common.collect.o8
                @Override // com.google.common.collect.b8.t
                public final Object a(Object obj, Object obj2) {
                    return this.f117912a.m(obj, (Collection) obj2);
                }
            });
        }

        @Override // com.google.common.collect.h
        Collection<Map.Entry<K, V2>> b() {
            return new com.google.common.collect.h.a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.k8, com.google.common.collect.y9
        public Collection<V2> c(@fj.a Object key) {
            return m(key, this.f117799f.c(key));
        }

        @Override // com.google.common.collect.k8
        public void clear() {
            this.f117799f.clear();
        }

        @Override // com.google.common.collect.k8
        public boolean containsKey(@fj.a Object key) {
            return this.f117799f.containsKey(key);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
        public Collection<V2> d(@b9 K key, Iterable<? extends V2> values) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h
        Set<K> e() {
            return this.f117799f.keySet();
        }

        @Override // com.google.common.collect.h
        q8<K> f() {
            return this.f117799f.keys();
        }

        @Override // com.google.common.collect.h
        Collection<V2> g() {
            return b3.m(this.f117799f.u(), b8.h(this.f117800g));
        }

        @Override // com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: get */
        public Collection<V2> x(@b9 final K key) {
            return m(key, this.f117799f.x(key));
        }

        @Override // com.google.common.collect.h
        Iterator<Map.Entry<K, V2>> h() {
            return p7.b0(this.f117799f.u().iterator(), b8.g(this.f117800g));
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8
        public boolean isEmpty() {
            return this.f117799f.isEmpty();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Collection<V2> m(@b9 K key, Collection<V1> values) {
            com.google.common.base.t tVarN = b8.n(this.f117800g, key);
            return values instanceof List ? x7.D((List) values, tVarN) : b3.m(values, tVarN);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8
        public boolean put(@b9 K key, @b9 V2 value) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.h, com.google.common.collect.k8
        public boolean remove(@fj.a Object key, @fj.a Object value) {
            return x(key).remove(value);
        }

        @Override // com.google.common.collect.k8
        public int size() {
            return this.f117799f.size();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.k8
        public boolean v(@b9 K key, Iterable<? extends V2> values) {
            throw new UnsupportedOperationException();
        }
    }

    private static class k<K, V> extends l<K, V> implements w7<K, V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f117801h = 0;

        k(w7<K, V> delegate) {
            super(delegate);
        }

        @Override // com.google.common.collect.n8.l, com.google.common.collect.i5
        /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public w7<K, V> i1() {
            return (w7) super.i1();
        }

        @Override // com.google.common.collect.n8.l, com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        public List<V> c(@fj.a Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.n8.l, com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        public List<V> d(@b9 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.n8.l, com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: get */
        public List<V> x(@b9 K key) {
            return Collections.unmodifiableList(i1().x((Object) key));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class l<K, V> extends i5<K, V> implements Serializable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f117802g = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k8<K, V> f117803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @a8.b
        @fj.a
        transient Collection<Map.Entry<K, V>> f117804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @a8.b
        @fj.a
        transient q8<K> f117805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @a8.b
        @fj.a
        transient Set<K> f117806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @a8.b
        @fj.a
        transient Collection<V> f117807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @a8.b
        @fj.a
        transient Map<K, Collection<V>> f117808f;

        l(final k8<K, V> delegate) {
            this.f117803a = (k8) com.google.common.base.j0.E(delegate);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.i5, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0 */
        public k8<K, V> i1() {
            return this.f117803a;
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.k8
        public boolean R(k8<? extends K, ? extends V> multimap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        public Collection<V> c(@fj.a Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.k8
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        public Collection<V> d(@b9 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: get */
        public Collection<V> x(@b9 K key) {
            return n8.Q(this.f117803a.x(key));
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: k */
        public Collection<Map.Entry<K, V>> u() {
            Collection<Map.Entry<K, V>> collectionI = this.f117804b;
            if (collectionI == null) {
                collectionI = n8.I(this.f117803a.u());
                this.f117804b = collectionI;
            }
            return collectionI;
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.k8
        public Set<K> keySet() {
            Set<K> set = this.f117806d;
            if (set != null) {
                return set;
            }
            Set<K> setUnmodifiableSet = Collections.unmodifiableSet(this.f117803a.keySet());
            this.f117806d = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.k8
        public q8<K> keys() {
            q8<K> q8VarB = this.f117805c;
            if (q8VarB == null) {
                q8VarB = r8.B(this.f117803a.keys());
                this.f117805c = q8VarB;
            }
            return q8VarB;
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.w7
        public Map<K, Collection<V>> l() {
            Map<K, Collection<V>> map = this.f117808f;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> mapUnmodifiableMap = Collections.unmodifiableMap(b8.D0(this.f117803a.l(), new com.google.common.base.t() { // from class: com.google.common.collect.p8
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return n8.Q((Collection) obj);
                }
            }));
            this.f117808f = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.k8
        public boolean put(@b9 K key, @b9 V value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.k8
        public boolean remove(@fj.a Object key, @fj.a Object value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.k8
        public boolean v(@b9 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.k8
        public Collection<V> values() {
            Collection<V> collection = this.f117807e;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f117803a.values());
            this.f117807e = collectionUnmodifiableCollection;
            return collectionUnmodifiableCollection;
        }
    }

    private static class m<K, V> extends l<K, V> implements y9<K, V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f117809h = 0;

        m(y9<K, V> delegate) {
            super(delegate);
        }

        @Override // com.google.common.collect.n8.l, com.google.common.collect.i5
        /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
        public y9<K, V> i1() {
            return (y9) super.i1();
        }

        @Override // com.google.common.collect.n8.l, com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        public Set<V> c(@fj.a Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.n8.l, com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        public Set<V> d(@b9 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.n8.l, com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: get */
        public Set<V> x(@b9 K key) {
            return Collections.unmodifiableSet(L0().x((Object) key));
        }

        @Override // com.google.common.collect.n8.l, com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: k */
        public Set<Map.Entry<K, V>> u() {
            return b8.M0(L0().u());
        }
    }

    private n8() {
    }

    @com.google.common.annotations.d
    public static <K, V> k8<K, V> A(k8<K, V> multimap) {
        return na.m(multimap, null);
    }

    @com.google.common.annotations.d
    public static <K, V> y9<K, V> B(y9<K, V> multimap) {
        return na.v(multimap, null);
    }

    @com.google.common.annotations.d
    public static <K, V> ja<K, V> C(ja<K, V> multimap) {
        return na.y(multimap, null);
    }

    @d6
    public static <T, K, V, M extends k8<K, V>> Collector<T, ?, M> D(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, Supplier<M> multimapSupplier) {
        return y2.X(keyFunction, valueFunction, multimapSupplier);
    }

    public static <K, V1, V2> w7<K, V2> E(w7<K, V1> fromMap, b8.t<? super K, ? super V1, V2> transformer) {
        return new i(fromMap, transformer);
    }

    public static <K, V1, V2> k8<K, V2> F(k8<K, V1> fromMap, b8.t<? super K, ? super V1, V2> transformer) {
        return new j(fromMap, transformer);
    }

    public static <K, V1, V2> w7<K, V2> G(w7<K, V1> fromMultimap, final com.google.common.base.t<? super V1, V2> function) {
        com.google.common.base.j0.E(function);
        return E(fromMultimap, b8.i(function));
    }

    public static <K, V1, V2> k8<K, V2> H(k8<K, V1> fromMultimap, final com.google.common.base.t<? super V1, V2> function) {
        com.google.common.base.j0.E(function);
        return F(fromMultimap, b8.i(function));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Collection<Map.Entry<K, V>> I(Collection<Map.Entry<K, V>> entries) {
        return entries instanceof Set ? b8.M0((Set) entries) : new b8.m0(Collections.unmodifiableCollection(entries));
    }

    @Deprecated
    public static <K, V> w7<K, V> J(m6<K, V> delegate) {
        return (w7) com.google.common.base.j0.E(delegate);
    }

    public static <K, V> w7<K, V> K(w7<K, V> delegate) {
        return ((delegate instanceof k) || (delegate instanceof m6)) ? delegate : new k(delegate);
    }

    @Deprecated
    public static <K, V> k8<K, V> L(r6<K, V> delegate) {
        return (k8) com.google.common.base.j0.E(delegate);
    }

    public static <K, V> k8<K, V> M(k8<K, V> delegate) {
        return ((delegate instanceof l) || (delegate instanceof r6)) ? delegate : new l(delegate);
    }

    @Deprecated
    public static <K, V> y9<K, V> N(a7<K, V> delegate) {
        return (y9) com.google.common.base.j0.E(delegate);
    }

    public static <K, V> y9<K, V> O(y9<K, V> delegate) {
        if (!(delegate instanceof m) && !(delegate instanceof a7)) {
            return new m(delegate);
        }
        return delegate;
    }

    public static <K, V> ja<K, V> P(ja<K, V> delegate) {
        return delegate instanceof n ? delegate : new n(delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> Collection<V> Q(Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set) collection);
        }
        return collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    public static <K, V> Map<K, List<V>> c(w7<K, V> w7Var) {
        return w7Var.l();
    }

    public static <K, V> Map<K, Collection<V>> d(k8<K, V> multimap) {
        return multimap.l();
    }

    public static <K, V> Map<K, Set<V>> e(y9<K, V> y9Var) {
        return y9Var.l();
    }

    public static <K, V> Map<K, SortedSet<V>> f(ja<K, V> jaVar) {
        return jaVar.l();
    }

    static boolean g(k8<?, ?> multimap, @fj.a Object object) {
        if (object == multimap) {
            return true;
        }
        if (object instanceof k8) {
            return multimap.l().equals(((k8) object).l());
        }
        return false;
    }

    public static <K, V> k8<K, V> h(k8<K, V> unfiltered, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
        com.google.common.base.j0.E(entryPredicate);
        if (unfiltered instanceof y9) {
            return i((y9) unfiltered, entryPredicate);
        }
        return unfiltered instanceof p4 ? j((p4) unfiltered, entryPredicate) : new j4((k8) com.google.common.base.j0.E(unfiltered), entryPredicate);
    }

    public static <K, V> y9<K, V> i(y9<K, V> unfiltered, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
        com.google.common.base.j0.E(entryPredicate);
        return unfiltered instanceof r4 ? k((r4) unfiltered, entryPredicate) : new l4((y9) com.google.common.base.j0.E(unfiltered), entryPredicate);
    }

    private static <K, V> k8<K, V> j(p4<K, V> multimap, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
        return new j4(multimap.n(), com.google.common.base.l0.d(multimap.l0(), entryPredicate));
    }

    private static <K, V> y9<K, V> k(r4<K, V> multimap, com.google.common.base.k0<? super Map.Entry<K, V>> entryPredicate) {
        return new l4(multimap.n(), com.google.common.base.l0.d(multimap.l0(), entryPredicate));
    }

    public static <K, V> w7<K, V> l(w7<K, V> unfiltered, final com.google.common.base.k0<? super K> keyPredicate) {
        if (!(unfiltered instanceof m4)) {
            return new m4(unfiltered, keyPredicate);
        }
        m4 m4Var = (m4) unfiltered;
        return new m4(m4Var.n(), com.google.common.base.l0.d(m4Var.f117744g, keyPredicate));
    }

    public static <K, V> k8<K, V> m(k8<K, V> unfiltered, final com.google.common.base.k0<? super K> keyPredicate) {
        if (unfiltered instanceof y9) {
            return n((y9) unfiltered, keyPredicate);
        }
        if (unfiltered instanceof w7) {
            return l((w7) unfiltered, keyPredicate);
        }
        if (!(unfiltered instanceof n4)) {
            return unfiltered instanceof p4 ? j((p4) unfiltered, b8.U(keyPredicate)) : new n4(unfiltered, keyPredicate);
        }
        n4 n4Var = (n4) unfiltered;
        return new n4(n4Var.f117743f, com.google.common.base.l0.d(n4Var.f117744g, keyPredicate));
    }

    public static <K, V> y9<K, V> n(y9<K, V> unfiltered, final com.google.common.base.k0<? super K> keyPredicate) {
        if (!(unfiltered instanceof o4)) {
            return unfiltered instanceof r4 ? k((r4) unfiltered, b8.U(keyPredicate)) : new o4(unfiltered, keyPredicate);
        }
        o4 o4Var = (o4) unfiltered;
        return new o4(o4Var.n(), com.google.common.base.l0.d(o4Var.f117744g, keyPredicate));
    }

    public static <K, V> k8<K, V> o(k8<K, V> unfiltered, final com.google.common.base.k0<? super V> valuePredicate) {
        return h(unfiltered, b8.T0(valuePredicate));
    }

    public static <K, V> y9<K, V> p(y9<K, V> unfiltered, final com.google.common.base.k0<? super V> valuePredicate) {
        return i(unfiltered, b8.T0(valuePredicate));
    }

    @d6
    public static <T, K, V, M extends k8<K, V>> Collector<T, ?, M> q(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends Stream<? extends V>> valueFunction, Supplier<M> multimapSupplier) {
        return y2.F(keyFunction, valueFunction, multimapSupplier);
    }

    public static <K, V> y9<K, V> r(Map<K, V> map) {
        return new h(map);
    }

    public static <K, V> m6<K, V> s(Iterable<V> values, com.google.common.base.t<? super V, K> keyFunction) {
        return t(values.iterator(), keyFunction);
    }

    public static <K, V> m6<K, V> t(Iterator<V> values, com.google.common.base.t<? super V, K> keyFunction) {
        com.google.common.base.j0.E(keyFunction);
        m6.a aVarM = m6.M();
        while (values.hasNext()) {
            V next = values.next();
            com.google.common.base.j0.F(next, values);
            aVarM.i(keyFunction.apply(next), next);
        }
        return aVarM.a();
    }

    @z7.a
    public static <K, V, M extends k8<K, V>> M u(k8<? extends V, ? extends K> source, M dest) {
        com.google.common.base.j0.E(dest);
        for (Map.Entry<? extends V, ? extends K> entry : source.u()) {
            dest.put(entry.getValue(), entry.getKey());
        }
        return dest;
    }

    public static <K, V> w7<K, V> v(Map<K, Collection<V>> map, final com.google.common.base.s0<? extends List<V>> factory) {
        return new b(map, factory);
    }

    public static <K, V> k8<K, V> w(Map<K, Collection<V>> map, final com.google.common.base.s0<? extends Collection<V>> factory) {
        return new c(map, factory);
    }

    public static <K, V> y9<K, V> x(Map<K, Collection<V>> map, final com.google.common.base.s0<? extends Set<V>> factory) {
        return new d(map, factory);
    }

    public static <K, V> ja<K, V> y(Map<K, Collection<V>> map, final com.google.common.base.s0<? extends SortedSet<V>> factory) {
        return new e(map, factory);
    }

    @com.google.common.annotations.d
    public static <K, V> w7<K, V> z(w7<K, V> multimap) {
        return na.k(multimap, null);
    }

    private static class n<K, V> extends m<K, V> implements ja<K, V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f117810i = 0;

        n(ja<K, V> delegate) {
            super(delegate);
        }

        @Override // com.google.common.collect.n8.m
        /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
        public ja<K, V> L0() {
            return (ja) super.L0();
        }

        @Override // com.google.common.collect.ja
        @fj.a
        public Comparator<? super V> Y() {
            return L0().Y();
        }

        @Override // com.google.common.collect.n8.m, com.google.common.collect.n8.l, com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        public SortedSet<V> c(@fj.a Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.n8.m, com.google.common.collect.n8.l, com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        public SortedSet<V> d(@b9 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.n8.m, com.google.common.collect.n8.l, com.google.common.collect.i5, com.google.common.collect.k8, com.google.common.collect.y9
        /* JADX INFO: renamed from: get */
        public SortedSet<V> x(@b9 K key) {
            return Collections.unmodifiableSortedSet(L0().x((Object) key));
        }
    }
}
