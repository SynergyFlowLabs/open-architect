package org.apache.commons.collections4.bidimap;

import org.apache.commons.collections4.h0;
import org.apache.commons.collections4.k0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c<K, V> extends a<K, V> implements h0<K, V> {
    protected c(h0<K, V> h0Var) {
        super(h0Var);
    }

    @Override // org.apache.commons.collections4.j0
    public K C3(K k10) {
        return a().C3(k10);
    }

    @Override // org.apache.commons.collections4.j0
    public K E2(K k10) {
        return a().E2(k10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.bidimap.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h0<K, V> a() {
        return (h0) super.a();
    }

    @Override // org.apache.commons.collections4.j0
    public K firstKey() {
        return a().firstKey();
    }

    @Override // org.apache.commons.collections4.j0
    public K lastKey() {
        return a().lastKey();
    }

    @Override // org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.e
    public h0<V, K> N() {
        return a().N();
    }

    @Override // org.apache.commons.collections4.bidimap.a, org.apache.commons.collections4.map.c, org.apache.commons.collections4.s
    public k0<K, V> T() {
        return a().T();
    }
}
