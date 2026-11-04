package com.google.common.graph;

import com.google.common.collect.nb;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@g0
class c1<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, V> f118596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private volatile transient Map.Entry<K, V> f118597b;

    class a extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.google.common.graph.c1$a$a, reason: collision with other inner class name */
        class C1083a extends nb<K> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Iterator f118599a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f118600b;

            C1083a(final a this$1, final Iterator val$entryIterator) {
                this.f118599a = val$entryIterator;
                this.f118600b = this$1;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f118599a.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry entry = (Map.Entry) this.f118599a.next();
                c1.this.f118597b = entry;
                return (K) entry.getKey();
            }
        }

        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public nb<K> iterator() {
            return new C1083a(this, c1.this.f118596a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@fj.a Object key) {
            return c1.this.e(key);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c1.this.f118596a.size();
        }
    }

    c1(Map<K, V> backingMap) {
        this.f118596a = (Map) com.google.common.base.j0.E(backingMap);
    }

    final void c() {
        d();
        this.f118596a.clear();
    }

    void d() {
        this.f118597b = null;
    }

    final boolean e(@fj.a Object key) {
        return g(key) != null || this.f118596a.containsKey(key);
    }

    @fj.a
    V f(Object key) {
        com.google.common.base.j0.E(key);
        V vG = g(key);
        return vG == null ? h(key) : vG;
    }

    @fj.a
    V g(@fj.a Object key) {
        Map.Entry<K, V> entry = this.f118597b;
        if (entry == null || entry.getKey() != key) {
            return null;
        }
        return entry.getValue();
    }

    @fj.a
    final V h(Object key) {
        com.google.common.base.j0.E(key);
        return this.f118596a.get(key);
    }

    @z7.a
    @fj.a
    final V i(K key, V value) {
        com.google.common.base.j0.E(key);
        com.google.common.base.j0.E(value);
        d();
        return this.f118596a.put(key, value);
    }

    @z7.a
    @fj.a
    final V j(Object key) {
        com.google.common.base.j0.E(key);
        d();
        return this.f118596a.remove(key);
    }

    final Set<K> k() {
        return new a();
    }
}
