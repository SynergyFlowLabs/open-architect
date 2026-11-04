package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@a4
@com.google.common.annotations.b
abstract class h<K, V> implements k8<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Collection<Map.Entry<K, V>> f117426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Set<K> f117427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient q8<K> f117428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Collection<V> f117429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a8.b
    @fj.a
    private transient Map<K, Collection<V>> f117430e;

    /* JADX INFO: loaded from: classes5.dex */
    class a extends n8.f<K, V> {
        a() {
        }

        @Override // com.google.common.collect.n8.f
        k8<K, V> c() {
            return h.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return h.this.h();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    class b extends h<K, V>.a implements Set<Map.Entry<K, V>> {
        b() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@fj.a Object obj) {
            return z9.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return z9.k(this);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    class c extends AbstractCollection<V> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@fj.a Object o10) {
            return h.this.containsValue(o10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return h.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return h.this.size();
        }
    }

    h() {
    }

    @Override // com.google.common.collect.k8
    public boolean I0(@fj.a Object key, @fj.a Object value) {
        Collection<V> collection = l().get(key);
        return collection != null && collection.contains(value);
    }

    @Override // com.google.common.collect.k8
    @z7.a
    public boolean R(k8<? extends K, ? extends V> multimap) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : multimap.k()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }

    abstract Map<K, Collection<V>> a();

    abstract Collection<Map.Entry<K, V>> b();

    @Override // com.google.common.collect.k8
    public boolean containsValue(@fj.a Object value) {
        Iterator<Collection<V>> it = l().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    @z7.a
    public Collection<V> d(@b9 K key, Iterable<? extends V> values) {
        com.google.common.base.j0.E(values);
        Collection<V> collectionC = c(key);
        v(key, values);
        return collectionC;
    }

    abstract Set<K> e();

    @Override // com.google.common.collect.k8, com.google.common.collect.w7
    public boolean equals(@fj.a Object object) {
        return n8.g(this, object);
    }

    abstract q8<K> f();

    abstract Collection<V> g();

    abstract Iterator<Map.Entry<K, V>> h();

    @Override // com.google.common.collect.k8
    public int hashCode() {
        return l().hashCode();
    }

    Iterator<V> i() {
        return b8.R0(k().iterator());
    }

    @Override // com.google.common.collect.k8
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    public Collection<Map.Entry<K, V>> k() {
        Collection<Map.Entry<K, V>> collection = this.f117426a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionB = b();
        this.f117426a = collectionB;
        return collectionB;
    }

    @Override // com.google.common.collect.k8
    public Set<K> keySet() {
        Set<K> set = this.f117427b;
        if (set != null) {
            return set;
        }
        Set<K> setE = e();
        this.f117427b = setE;
        return setE;
    }

    @Override // com.google.common.collect.k8
    public q8<K> keys() {
        q8<K> q8Var = this.f117428c;
        if (q8Var != null) {
            return q8Var;
        }
        q8<K> q8VarF = f();
        this.f117428c = q8VarF;
        return q8VarF;
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.w7
    public Map<K, Collection<V>> l() {
        Map<K, Collection<V>> map = this.f117430e;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapA = a();
        this.f117430e = mapA;
        return mapA;
    }

    @Override // com.google.common.collect.k8
    @z7.a
    public boolean put(@b9 K key, @b9 V value) {
        return get(key).add(value);
    }

    @Override // com.google.common.collect.k8
    @z7.a
    public boolean remove(@fj.a Object key, @fj.a Object value) {
        Collection<V> collection = l().get(key);
        return collection != null && collection.remove(value);
    }

    public String toString() {
        return l().toString();
    }

    @Override // com.google.common.collect.k8
    @z7.a
    public boolean v(@b9 K key, Iterable<? extends V> values) {
        com.google.common.base.j0.E(values);
        if (values instanceof Collection) {
            Collection<? extends V> collection = (Collection) values;
            return !collection.isEmpty() && get(key).addAll(collection);
        }
        Iterator<? extends V> it = values.iterator();
        return it.hasNext() && p7.a(get(key), it);
    }

    @Override // com.google.common.collect.k8
    public Collection<V> values() {
        Collection<V> collection = this.f117429d;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionG = g();
        this.f117429d = collectionG;
        return collectionG;
    }
}
