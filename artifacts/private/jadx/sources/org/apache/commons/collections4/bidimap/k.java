package org.apache.commons.collections4.bidimap;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.iterators.r0;
import org.apache.commons.collections4.k0;
import org.apache.commons.collections4.map.g0;
import org.apache.commons.collections4.map.j0;
import org.apache.commons.collections4.set.o;
import org.apache.commons.collections4.u0;

/* JADX INFO: loaded from: classes14.dex */
public final class k<K, V> extends d<K, V> implements a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k<V, K> f335596b;

    private k(u0<K, ? extends V> u0Var) {
        super(u0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> u0<K, V> e(u0<K, ? extends V> u0Var) {
        return u0Var instanceof a1 ? u0Var : new k(u0Var);
    }

    @Override // org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.e
    public K N2(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        return g0.l(super.entrySet());
    }

    @Override // org.apache.commons.collections4.bidimap.d, java.util.SortedMap
    public SortedMap<K, V> headMap(K k10) {
        return j0.c(a().headMap(k10));
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<K> keySet() {
        return o.k(super.keySet());
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.bidimap.d, java.util.SortedMap
    public SortedMap<K, V> subMap(K k10, K k11) {
        return j0.c(a().subMap(k10, k11));
    }

    @Override // org.apache.commons.collections4.bidimap.d, java.util.SortedMap
    public SortedMap<K, V> tailMap(K k10) {
        return j0.c(a().tailMap(k10));
    }

    @Override // org.apache.commons.collections4.bidimap.c, org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.map.c, org.apache.commons.collections4.s
    public k0<K, V> T() {
        return r0.b(a().T());
    }

    @Override // org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<V> values() {
        return o.k(super.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.bidimap.d, org.apache.commons.collections4.bidimap.c, org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.e
    public u0<V, K> N() {
        if (this.f335596b == null) {
            k<V, K> kVar = new k<>(a().N());
            this.f335596b = kVar;
            kVar.f335596b = this;
        }
        return this.f335596b;
    }
}
