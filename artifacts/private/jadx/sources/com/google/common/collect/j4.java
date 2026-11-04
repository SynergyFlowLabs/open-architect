package com.google.common.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
class j4<K, V> extends h<K, V> implements p4<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final k8<K, V> f117488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.google.common.base.k0<? super Map.Entry<K, V>> f117489g;

    class a extends b8.r0<K, Collection<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.j4$a$a, reason: collision with other inner class name */
        class C1060a extends b8.s<K, Collection<V>> {

            /* JADX INFO: renamed from: com.google.common.collect.j4$a$a$a, reason: collision with other inner class name */
            class C1061a extends com.google.common.collect.c<Map.Entry<K, Collection<V>>> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final Iterator<Map.Entry<K, Collection<V>>> f117492c;

                C1061a() {
                    this.f117492c = j4.this.f117488f.l().entrySet().iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.c
                @fj.a
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, Collection<V>> b() {
                    while (this.f117492c.hasNext()) {
                        Map.Entry<K, Collection<V>> next = this.f117492c.next();
                        K key = next.getKey();
                        Collection collectionM = j4.m(next.getValue(), new c(key));
                        if (!collectionM.isEmpty()) {
                            return b8.O(key, collectionM);
                        }
                    }
                    return c();
                }
            }

            C1060a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C1061a();
            }

            @Override // com.google.common.collect.b8.s
            Map<K, Collection<V>> l() {
                return a.this;
            }

            @Override // com.google.common.collect.b8.s, com.google.common.collect.z9.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> c10) {
                return j4.this.o(com.google.common.base.l0.n(c10));
            }

            @Override // com.google.common.collect.b8.s, com.google.common.collect.z9.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c10) {
                return j4.this.o(com.google.common.base.l0.q(com.google.common.base.l0.n(c10)));
            }

            @Override // com.google.common.collect.b8.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return p7.Y(iterator());
            }
        }

        class b extends b8.b0<K, Collection<V>> {
            b() {
                super(a.this);
            }

            @Override // com.google.common.collect.b8.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@fj.a Object o10) {
                return a.this.remove(o10) != null;
            }

            @Override // com.google.common.collect.z9.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> c10) {
                return j4.this.o(b8.U(com.google.common.base.l0.n(c10)));
            }

            @Override // com.google.common.collect.z9.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c10) {
                return j4.this.o(b8.U(com.google.common.base.l0.q(com.google.common.base.l0.n(c10))));
            }
        }

        class c extends b8.q0<K, Collection<V>> {
            c() {
                super(a.this);
            }

            @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@fj.a Object o10) {
                if (o10 instanceof Collection) {
                    Collection collection = (Collection) o10;
                    Iterator<Map.Entry<K, Collection<V>>> it = j4.this.f117488f.l().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<K, Collection<V>> next = it.next();
                        Collection collectionM = j4.m(next.getValue(), new c(next.getKey()));
                        if (!collectionM.isEmpty() && collection.equals(collectionM)) {
                            if (collectionM.size() == next.getValue().size()) {
                                it.remove();
                            } else {
                                collectionM.clear();
                            }
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> c10) {
                return j4.this.o(b8.T0(com.google.common.base.l0.n(c10)));
            }

            @Override // com.google.common.collect.b8.q0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> c10) {
                return j4.this.o(b8.T0(com.google.common.base.l0.q(com.google.common.base.l0.n(c10))));
            }
        }

        a() {
        }

        @Override // com.google.common.collect.b8.r0
        Set<Map.Entry<K, Collection<V>>> a() {
            return new C1060a();
        }

        @Override // com.google.common.collect.b8.r0
        /* JADX INFO: renamed from: b */
        Set<K> g() {
            return new b();
        }

        @Override // com.google.common.collect.b8.r0
        Collection<Collection<V>> c() {
            return new c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            j4.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@fj.a Object key) {
            if (get(key) == null) {
                return false;
            }
            int i10 = 3 >> 1;
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@fj.a Object key) {
            Collection<V> collection = j4.this.f117488f.l().get(key);
            if (collection == null) {
                return null;
            }
            Collection<V> collectionM = j4.m(collection, new c(key));
            if (collectionM.isEmpty()) {
                return null;
            }
            return collectionM;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @fj.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@fj.a Object key) {
            Collection<V> collection = j4.this.f117488f.l().get(key);
            if (collection == null) {
                return null;
            }
            ArrayList arrayListQ = x7.q();
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                V next = it.next();
                if (j4.this.p(key, next)) {
                    it.remove();
                    arrayListQ.add(next);
                }
            }
            if (arrayListQ.isEmpty()) {
                return null;
            }
            return j4.this.f117488f instanceof y9 ? Collections.unmodifiableSet(z9.B(arrayListQ)) : Collections.unmodifiableList(arrayListQ);
        }
    }

    class b extends n8.g<K, V> {

        class a extends r8.i<K> {
            a() {
            }

            private boolean n(final com.google.common.base.k0<? super q8.a<K>> predicate) {
                return j4.this.o(new com.google.common.base.k0() { // from class: com.google.common.collect.k4
                    @Override // com.google.common.base.k0
                    public final boolean apply(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        return predicate.apply(r8.k(entry.getKey(), ((Collection) entry.getValue()).size()));
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<q8.a<K>> iterator() {
                return b.this.m();
            }

            @Override // com.google.common.collect.r8.i
            q8<K> l() {
                return b.this;
            }

            @Override // com.google.common.collect.z9.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> c10) {
                return n(com.google.common.base.l0.n(c10));
            }

            @Override // com.google.common.collect.z9.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c10) {
                return n(com.google.common.base.l0.q(com.google.common.base.l0.n(c10)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return j4.this.keySet().size();
            }
        }

        b() {
            super(j4.this);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.q8
        public Set<q8.a<K>> entrySet() {
            return new a();
        }

        @Override // com.google.common.collect.n8.g, com.google.common.collect.i, com.google.common.collect.q8
        public int f0(@fj.a Object key, int occurrences) {
            a3.b(occurrences, "occurrences");
            if (occurrences == 0) {
                return P3(key);
            }
            Collection<V> collection = j4.this.f117488f.l().get(key);
            int i10 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                if (j4.this.p(key, it.next()) && (i10 = i10 + 1) <= occurrences) {
                    it.remove();
                }
            }
            return i10;
        }
    }

    final class c implements com.google.common.base.k0<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        private final K f117498a;

        c(K key) {
            this.f117498a = key;
        }

        @Override // com.google.common.base.k0
        public boolean apply(@b9 V value) {
            return j4.this.p(this.f117498a, value);
        }
    }

    j4(k8<K, V> unfiltered, com.google.common.base.k0<? super Map.Entry<K, V>> predicate) {
        this.f117488f = (k8) com.google.common.base.j0.E(unfiltered);
        this.f117489g = (com.google.common.base.k0) com.google.common.base.j0.E(predicate);
    }

    static <E> Collection<E> m(Collection<E> collection, com.google.common.base.k0<? super E> predicate) {
        return collection instanceof Set ? z9.i((Set) collection, predicate) : b3.d(collection, predicate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p(@b9 K key, @b9 V value) {
        return this.f117489g.apply(b8.O(key, value));
    }

    @Override // com.google.common.collect.h
    Map<K, Collection<V>> a() {
        return new a();
    }

    @Override // com.google.common.collect.h
    Collection<Map.Entry<K, V>> b() {
        return m(this.f117488f.u(), this.f117489g);
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    public Collection<V> c(@fj.a Object key) {
        return (Collection) com.google.common.base.b0.a(l().remove(key), q());
    }

    @Override // com.google.common.collect.k8
    public void clear() {
        u().clear();
    }

    @Override // com.google.common.collect.k8
    public boolean containsKey(@fj.a Object key) {
        return l().get(key) != null;
    }

    @Override // com.google.common.collect.h
    Set<K> e() {
        return l().keySet();
    }

    @Override // com.google.common.collect.h
    q8<K> f() {
        return new b();
    }

    @Override // com.google.common.collect.h
    Collection<V> g() {
        return new q4(this);
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: get */
    public Collection<V> x(@b9 K key) {
        return m(this.f117488f.x(key), new c(key));
    }

    @Override // com.google.common.collect.h
    Iterator<Map.Entry<K, V>> h() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.p4
    public com.google.common.base.k0<? super Map.Entry<K, V>> l0() {
        return this.f117489g;
    }

    @Override // com.google.common.collect.p4
    public k8<K, V> n() {
        return this.f117488f;
    }

    boolean o(com.google.common.base.k0<? super Map.Entry<K, Collection<V>>> predicate) {
        Iterator<Map.Entry<K, Collection<V>>> it = this.f117488f.l().entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Map.Entry<K, Collection<V>> next = it.next();
            K key = next.getKey();
            Collection collectionM = m(next.getValue(), new c(key));
            if (!collectionM.isEmpty() && predicate.apply(b8.O(key, collectionM))) {
                if (collectionM.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    collectionM.clear();
                }
                z10 = true;
            }
        }
        return z10;
    }

    Collection<V> q() {
        return this.f117488f instanceof y9 ? Collections.EMPTY_SET : Collections.EMPTY_LIST;
    }

    @Override // com.google.common.collect.k8
    public int size() {
        return u().size();
    }
}
