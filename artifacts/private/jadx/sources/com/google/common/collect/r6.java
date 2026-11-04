package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
public abstract class r6<K, V> extends v<K, V> implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.google.common.annotations.d
    private static final long f118010h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient n6<K, ? extends h6<V>> f118011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final transient int f118012g;

    class a extends nb<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator<? extends Map.Entry<K, ? extends h6<V>>> f118013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        K f118014b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Iterator<V> f118015c = p7.t();

        a() {
            this.f118013a = r6.this.f118011f.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f118015c.hasNext()) {
                Map.Entry<K, ? extends h6<V>> next = this.f118013a.next();
                this.f118014b = next.getKey();
                this.f118015c = next.getValue().iterator();
            }
            K k10 = this.f118014b;
            Objects.requireNonNull(k10);
            return b8.O(k10, this.f118015c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f118015c.hasNext() || this.f118013a.hasNext();
        }
    }

    class b extends nb<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator<? extends h6<V>> f118017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Iterator<V> f118018b = p7.t();

        b() {
            this.f118017a = r6.this.f118011f.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f118018b.hasNext() || this.f118017a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f118018b.hasNext()) {
                this.f118018b = this.f118017a.next().iterator();
            }
            return this.f118018b.next();
        }
    }

    private static class d<K, V> extends h6<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f118024e = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @r9.m
        final r6<K, V> f118025d;

        d(r6<K, V> multimap) {
            this.f118025d = multimap;
        }

        @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            return this.f118025d.I0(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return this.f118025d.z();
        }

        @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: n */
        public nb<Map.Entry<K, V>> iterator() {
            return this.f118025d.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f118025d.size();
        }

        @Override // com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final x9.b<? super r6<?, ?>> f118026a = x9.a(r6.class, "map");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final x9.b<? super r6<?, ?>> f118027b = x9.a(r6.class, "size");

        e() {
        }
    }

    class f extends t6<K> {
        f() {
        }

        @com.google.common.annotations.c
        @com.google.common.annotations.d
        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use KeysSerializedForm");
        }

        @Override // com.google.common.collect.t6, com.google.common.collect.q8
        /* JADX INFO: renamed from: B */
        public z6<K> o() {
            return r6.this.keySet();
        }

        @Override // com.google.common.collect.t6
        q8.a<K> D(int index) {
            Map.Entry<K, ? extends h6<V>> entry = r6.this.f118011f.entrySet().c().get(index);
            return r8.k(entry.getKey(), entry.getValue().size());
        }

        @Override // com.google.common.collect.q8
        public int P3(@fj.a Object element) {
            h6<V> h6Var = r6.this.f118011f.get(element);
            if (h6Var == null) {
                return 0;
            }
            return h6Var.size();
        }

        @Override // com.google.common.collect.t6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object object) {
            return r6.this.containsKey(object);
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.q8
        public int size() {
            return r6.this.size();
        }

        @Override // com.google.common.collect.t6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return new g(r6.this);
        }
    }

    @com.google.common.annotations.c
    @com.google.common.annotations.d
    private static final class g implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final r6<?, ?> f118029a;

        g(r6<?, ?> multimap) {
            this.f118029a = multimap;
        }

        Object readResolve() {
            return this.f118029a.keys();
        }
    }

    private static final class h<K, V> extends h6<V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @com.google.common.annotations.d
        private static final long f118030e = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @r9.m
        private final transient r6<K, V> f118031d;

        h(r6<K, V> multimap) {
            this.f118031d = multimap;
        }

        @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object object) {
            return this.f118031d.containsValue(object);
        }

        @Override // com.google.common.collect.h6
        @com.google.common.annotations.c
        int d(Object[] dst, int offset) {
            nb<? extends h6<V>> it = this.f118031d.f118011f.values().iterator();
            while (it.hasNext()) {
                offset = it.next().d(dst, offset);
            }
            return offset;
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return true;
        }

        @Override // com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: n */
        public nb<V> iterator() {
            return this.f118031d.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f118031d.size();
        }

        @Override // com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    r6(n6<K, ? extends h6<V>> map, int size) {
        this.f118011f = map;
        this.f118012g = size;
    }

    public static <K, V> r6<K, V> C() {
        return m6.X();
    }

    public static <K, V> r6<K, V> D(K k10, V v10) {
        return m6.Z(k10, v10);
    }

    public static <K, V> r6<K, V> E(K k10, V v10, K k11, V v11) {
        return m6.a0(k10, v10, k11, v11);
    }

    public static <K, V> r6<K, V> F(K k10, V v10, K k11, V v11, K k12, V v12) {
        return m6.b0(k10, v10, k11, v11, k12, v12);
    }

    public static <K, V> r6<K, V> G(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        return m6.c0(k10, v10, k11, v11, k12, v12, k13, v13);
    }

    public static <K, V> r6<K, V> H(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        return m6.d0(k10, v10, k11, v11, k12, v12, k13, v13, k14, v14);
    }

    public static <K, V> c<K, V> m() {
        return new c<>();
    }

    public static <K, V> c<K, V> o(int expectedKeys) {
        a3.b(expectedKeys, "expectedKeys");
        return new c<>(expectedKeys);
    }

    public static <K, V> r6<K, V> p(k8<? extends K, ? extends V> multimap) {
        if (multimap instanceof r6) {
            r6<K, V> r6Var = (r6) multimap;
            if (!r6Var.z()) {
                return r6Var;
            }
        }
        return m6.O(multimap);
    }

    public static <K, V> r6<K, V> q(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return m6.P(entries);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public z6<K> keySet() {
        return this.f118011f.keySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public t6<K> keys() {
        return (t6) super.keys();
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    /* JADX INFO: renamed from: I */
    public h6<V> c(@fj.a Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean I0(@fj.a Object key, @fj.a Object value) {
        return super.I0(key, value);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    /* JADX INFO: renamed from: J */
    public h6<V> d(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public nb<V> i() {
        return new b();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public h6<V> values() {
        return (h6) super.values();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    public final boolean R(k8<? extends K, ? extends V> multimap) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h
    Map<K, Collection<V>> a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.k8
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k8
    public boolean containsKey(@fj.a Object key) {
        return this.f118011f.containsKey(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public boolean containsValue(@fj.a Object value) {
        return value != null && super.containsValue(value);
    }

    @Override // com.google.common.collect.h
    Set<K> e() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    public /* bridge */ /* synthetic */ boolean equals(@fj.a Object object) {
        return super.equals(object);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.w7
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public n6<K, Collection<V>> l() {
        return this.f118011f;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    public final boolean put(K key, V value) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public h6<Map.Entry<K, V>> b() {
        return new d(this);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@fj.a Object key, @fj.a Object value) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public t6<K> f() {
        return new f();
    }

    @Override // com.google.common.collect.k8
    public int size() {
        return this.f118012g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public h6<V> g() {
        return new h(this);
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8, com.google.common.collect.y9
    public h6<Map.Entry<K, V>> u() {
        return (h6) super.u();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.k8
    @z7.a
    @Deprecated
    @z7.e("Always throws UnsupportedOperationException")
    public final boolean v(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public nb<Map.Entry<K, V>> h() {
        return new a();
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    public abstract h6<V> x(K key);

    public abstract r6<V, K> y();

    boolean z() {
        return this.f118011f.n();
    }

    /* JADX INFO: loaded from: classes4.dex */
    @z7.f
    public static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @fj.a
        Map<K, h6.b<V>> f118020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.a
        Comparator<? super K> f118021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.a
        Comparator<? super V> f118022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f118023d = 4;

        public c() {
        }

        public r6<K, V> a() {
            Map<K, h6.b<V>> map = this.f118020a;
            if (map == null) {
                return m6.X();
            }
            Collection collectionEntrySet = map.entrySet();
            Comparator<? super K> comparator = this.f118021b;
            if (comparator != null) {
                collectionEntrySet = a9.i(comparator).C().l(collectionEntrySet);
            }
            return m6.S(collectionEntrySet, this.f118022c);
        }

        @z7.a
        c<K, V> b(c<K, V> other) {
            Map<K, h6.b<V>> map = other.f118020a;
            if (map != null) {
                for (Map.Entry<K, h6.b<V>> entry : map.entrySet()) {
                    m(entry.getKey(), entry.getValue().e());
                }
            }
            return this;
        }

        Map<K, h6.b<V>> c() {
            Map<K, h6.b<V>> map = this.f118020a;
            if (map != null) {
                return map;
            }
            Map<K, h6.b<V>> mapI = d9.i();
            this.f118020a = mapI;
            return mapI;
        }

        int d(int defaultExpectedValues, Iterable<?> values) {
            return values instanceof Collection ? Math.max(defaultExpectedValues, ((Collection) values).size()) : defaultExpectedValues;
        }

        @z7.a
        public c<K, V> e(int expectedValuesPerKey) {
            a3.b(expectedValuesPerKey, "expectedValuesPerKey");
            this.f118023d = Math.max(expectedValuesPerKey, 1);
            return this;
        }

        h6.b<V> f(int expectedSize) {
            return l6.t(expectedSize);
        }

        @z7.a
        public c<K, V> g(Comparator<? super K> keyComparator) {
            this.f118021b = (Comparator) com.google.common.base.j0.E(keyComparator);
            return this;
        }

        @z7.a
        public c<K, V> h(Comparator<? super V> valueComparator) {
            this.f118022c = (Comparator) com.google.common.base.j0.E(valueComparator);
            return this;
        }

        @z7.a
        public c<K, V> i(K key, V value) {
            a3.a(key, value);
            h6.b<V> bVarF = c().get(key);
            if (bVarF == null) {
                bVarF = f(this.f118023d);
                c().put(key, bVarF);
            }
            bVarF.a(value);
            return this;
        }

        @z7.a
        public c<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            return i(entry.getKey(), entry.getValue());
        }

        @z7.a
        public c<K, V> k(k8<? extends K, ? extends V> multimap) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : multimap.l().entrySet()) {
                m(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @z7.a
        public c<K, V> l(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = entries.iterator();
            while (it.hasNext()) {
                j(it.next());
            }
            return this;
        }

        @z7.a
        public c<K, V> m(K key, Iterable<? extends V> values) {
            if (key == null) {
                throw new NullPointerException("null key in entry: null=" + o7.S(values));
            }
            Iterator<? extends V> it = values.iterator();
            if (it.hasNext()) {
                h6.b<V> bVarF = c().get(key);
                if (bVarF == null) {
                    bVarF = f(d(this.f118023d, values));
                    c().put(key, bVarF);
                }
                while (it.hasNext()) {
                    V next = it.next();
                    a3.a(key, next);
                    bVarF.a(next);
                }
            }
            return this;
        }

        @z7.a
        public c<K, V> n(K key, V... values) {
            return m(key, Arrays.asList(values));
        }

        c(int expectedKeys) {
            if (expectedKeys > 0) {
                this.f118020a = d9.j(expectedKeys);
            }
        }
    }
}
