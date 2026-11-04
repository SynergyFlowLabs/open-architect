package org.apache.commons.collections4.multimap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.a0;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.e0;
import org.apache.commons.collections4.g0;
import org.apache.commons.collections4.iterators.q0;
import org.apache.commons.collections4.map.h0;
import org.apache.commons.collections4.set.o;

/* JADX INFO: loaded from: classes14.dex */
public final class h<K, V> extends c<K, V> implements a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336198c = 20150612;

    private h(g0<? extends K, ? extends V> g0Var) {
        super(g0Var);
    }

    public static <K, V> h<K, V> d(g0<? extends K, ? extends V> g0Var) {
        return g0Var instanceof a1 ? (h) g0Var : new h<>(g0Var);
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public boolean O0(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public a0<K, V> T() {
        return q0.b(c().T());
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public boolean b(g0<? extends K, ? extends V> g0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public Collection<V> get(K k10) {
        return org.apache.commons.collections4.collection.h.i(c().get(k10));
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public Collection<Map.Entry<K, V>> k() {
        return org.apache.commons.collections4.collection.h.i(c().k());
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public Set<K> keySet() {
        return o.k(c().keySet());
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public e0<K> keys() {
        return org.apache.commons.collections4.multiset.g.k(c().keys());
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public Map<K, Collection<V>> l() {
        return h0.b(c().l());
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public boolean putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public Collection<V> remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public boolean v(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.multimap.c, org.apache.commons.collections4.g0
    public Collection<V> values() {
        return org.apache.commons.collections4.collection.h.i(c().values());
    }
}
