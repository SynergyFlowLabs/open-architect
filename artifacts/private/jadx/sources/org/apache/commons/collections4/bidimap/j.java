package org.apache.commons.collections4.bidimap;

import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.h0;
import org.apache.commons.collections4.iterators.r0;
import org.apache.commons.collections4.k0;
import org.apache.commons.collections4.map.g0;
import org.apache.commons.collections4.set.o;

/* JADX INFO: loaded from: classes14.dex */
public final class j<K, V> extends c<K, V> implements a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j<V, K> f335595b;

    private j(h0<? extends K, ? extends V> h0Var) {
        super(h0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> h0<K, V> e(h0<? extends K, ? extends V> h0Var) {
        return h0Var instanceof a1 ? h0Var : new j(h0Var);
    }

    @Override // org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.e
    public K N2(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.n0
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0<V, K> d() {
        if (this.f335595b == null) {
            j<V, K> jVar = new j<>(a().N());
            this.f335595b = jVar;
            jVar.f335595b = this;
        }
        return this.f335595b;
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

    @Override // org.apache.commons.collections4.bidimap.c, org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.e
    public h0<V, K> N() {
        return d();
    }

    @Override // org.apache.commons.collections4.bidimap.c, org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.map.c, org.apache.commons.collections4.s
    public k0<K, V> T() {
        return r0.b(a().T());
    }

    @Override // org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.map.e, java.util.Map, org.apache.commons.collections4.r
    public Set<V> values() {
        return o.k(super.values());
    }
}
