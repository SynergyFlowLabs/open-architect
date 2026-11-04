package org.apache.commons.collections4.bidimap;

import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.a0;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.iterators.q0;
import org.apache.commons.collections4.map.g0;
import org.apache.commons.collections4.set.o;

/* JADX INFO: loaded from: classes14.dex */
public final class i<K, V> extends a<K, V> implements a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i<V, K> f335594b;

    private i(org.apache.commons.collections4.e<? extends K, ? extends V> eVar) {
        super(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> org.apache.commons.collections4.e<K, V> c(org.apache.commons.collections4.e<? extends K, ? extends V> eVar) {
        return eVar instanceof a1 ? eVar : new i(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.e
    public synchronized org.apache.commons.collections4.e<V, K> N() {
        try {
            if (this.f335594b == null) {
                i<V, K> iVar = new i<>(a().N());
                this.f335594b = iVar;
                iVar.f335594b = this;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f335594b;
    }

    @Override // org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.e
    public K N2(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.map.c, org.apache.commons.collections4.s
    public a0<K, V> T() {
        return q0.b(a().T());
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<Map.Entry<K, V>> entrySet() {
        return g0.l(super.entrySet());
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

    @Override // org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<V> values() {
        return o.k(super.values());
    }
}
