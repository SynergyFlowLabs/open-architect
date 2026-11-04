package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
class n4<K, V> extends h<K, V> implements p4<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final k8<K, V> f117743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.google.common.base.k0<? super K> f117744g;

    static class a<K, V> extends d5<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        final K f117745a;

        a(@b9 K key) {
            this.f117745a = key;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean add(@b9 V v10) {
            add(0, v10);
            return true;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.d5, com.google.common.collect.v4
        public List<V> i1() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.common.collect.d5, java.util.List
        public void add(int index, @b9 V element) {
            com.google.common.base.j0.d0(index, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f117745a);
        }

        @Override // com.google.common.collect.d5, java.util.List
        @z7.a
        public boolean addAll(int index, Collection<? extends V> elements) {
            com.google.common.base.j0.E(elements);
            com.google.common.base.j0.d0(index, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f117745a);
        }
    }

    static class b<K, V> extends o5<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b9
        final K f117746a;

        b(@b9 K key) {
            this.f117746a = key;
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean add(@b9 V element) {
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f117746a);
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends V> collection) {
            com.google.common.base.j0.E(collection);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f117746a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.o5, com.google.common.collect.v4
        public Set<V> i1() {
            return Collections.EMPTY_SET;
        }
    }

    class c extends v4<Map.Entry<K, V>> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.v4, com.google.common.collect.m5
        /* JADX INFO: renamed from: L0 */
        public Collection<Map.Entry<K, V>> i1() {
            return b3.d(n4.this.f117743f.u(), n4.this.l0());
        }

        @Override // com.google.common.collect.v4, java.util.Collection, java.util.Set
        public boolean remove(@fj.a Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (n4.this.f117743f.containsKey(entry.getKey()) && n4.this.f117744g.apply((Object) entry.getKey())) {
                    return n4.this.f117743f.remove(entry.getKey(), entry.getValue());
                }
            }
            return false;
        }
    }

    n4(k8<K, V> unfiltered, com.google.common.base.k0<? super K> keyPredicate) {
        this.f117743f = (k8) com.google.common.base.j0.E(unfiltered);
        this.f117744g = (com.google.common.base.k0) com.google.common.base.j0.E(keyPredicate);
    }

    @Override // com.google.common.collect.h
    Map<K, Collection<V>> a() {
        return b8.G(this.f117743f.l(), this.f117744g);
    }

    @Override // com.google.common.collect.h
    Collection<Map.Entry<K, V>> b() {
        return new c();
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    public Collection<V> c(@fj.a Object key) {
        return containsKey(key) ? this.f117743f.c(key) : j();
    }

    @Override // com.google.common.collect.k8
    public void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.k8
    public boolean containsKey(@fj.a Object key) {
        if (this.f117743f.containsKey(key)) {
            return this.f117744g.apply(key);
        }
        return false;
    }

    @Override // com.google.common.collect.h
    Set<K> e() {
        return z9.i(this.f117743f.keySet(), this.f117744g);
    }

    @Override // com.google.common.collect.h
    q8<K> f() {
        return r8.j(this.f117743f.keys(), this.f117744g);
    }

    @Override // com.google.common.collect.h
    Collection<V> g() {
        return new q4(this);
    }

    @Override // com.google.common.collect.k8, com.google.common.collect.y9
    /* JADX INFO: renamed from: get */
    public Collection<V> x(@b9 K key) {
        if (this.f117744g.apply(key)) {
            return this.f117743f.x(key);
        }
        return this.f117743f instanceof y9 ? new b(key) : new a(key);
    }

    @Override // com.google.common.collect.h
    Iterator<Map.Entry<K, V>> h() {
        throw new AssertionError("should never be called");
    }

    Collection<V> j() {
        return this.f117743f instanceof y9 ? Collections.EMPTY_SET : Collections.EMPTY_LIST;
    }

    @Override // com.google.common.collect.p4
    public com.google.common.base.k0<? super Map.Entry<K, V>> l0() {
        return b8.U(this.f117744g);
    }

    public k8<K, V> n() {
        return this.f117743f;
    }

    @Override // com.google.common.collect.k8
    public int size() {
        Iterator<Collection<V>> it = l().values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }
}
